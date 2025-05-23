package com.dev.HiddenBATHAutoWar.service.calculate.excel;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideBasicPrice;
import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideHandlePrice;
import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideOptionPrice;
import com.dev.HiddenBATHAutoWar.repository.calculate.slide.SlideBasicPriceRepository;
import com.dev.HiddenBATHAutoWar.repository.calculate.slide.SlideHandlePriceRepository;
import com.dev.HiddenBATHAutoWar.repository.calculate.slide.SlideOptionPriceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SlideExcelUploadService {

	private final SlideBasicPriceRepository slideBasicPriceRepository;
	private final SlideHandlePriceRepository slideHandlePriceRepository;
	private final SlideOptionPriceRepository slideOptionPriceRepository;

	public void uploadSlideExcel(MultipartFile file) throws IOException {
		// 기존 데이터 삭제
		slideBasicPriceRepository.deleteAll();
		slideHandlePriceRepository.deleteAll();
		slideOptionPriceRepository.deleteAll();

		try (InputStream is = file.getInputStream(); Workbook workbook = WorkbookFactory.create(is)) {
			// 1. 기본가격 시트
			Sheet baseSheet = workbook.getSheet("기본가격");
			for (int i = 1; i <= baseSheet.getLastRowNum(); i++) {
				Row row = baseSheet.getRow(i);
				if (row == null)
					continue;

				String name = getStringValue(row.getCell(0)).trim();
				Integer price = getSafeIntValue(row.getCell(1));

				if (name.isEmpty() || price == null || price == 0)
					continue;

				SlideBasicPrice entity = new SlideBasicPrice();
				entity.setProductName(name);
				entity.setBasicPrice(price);
				slideBasicPriceRepository.save(entity);
			}

			// 2. 손잡이 시트
			Sheet handleSheet = workbook.getSheet("손잡이");
			for (int i = 1; i <= handleSheet.getLastRowNum(); i++) {
				Row row = handleSheet.getRow(i);
				if (row == null)
					continue;

				String handleName = getStringValue(row.getCell(1)).trim();
				Integer price = getSafeIntValue(row.getCell(2));

				if (handleName.isEmpty() || price == null || price == 0)
					continue;

				SlideHandlePrice entity = new SlideHandlePrice();
				entity.setHandleName(handleName);
				entity.setPrice(price);
				slideHandlePriceRepository.save(entity);
			}

			// 3. 기타옵션 시트
			Sheet optionSheet = workbook.getSheet("기타옵션");
			for (int i = 1; i <= optionSheet.getLastRowNum(); i++) {
				Row row = optionSheet.getRow(i);
				if (row == null)
					continue;

				String optionName = getStringValue(row.getCell(1)).trim();
				Integer price = getSafeIntValue(row.getCell(2));

				if (optionName.isEmpty() || price == null || price == 0)
					continue;

				SlideOptionPrice entity = new SlideOptionPrice();
				entity.setOptionName(optionName);
				entity.setPrice(price);
				slideOptionPriceRepository.save(entity);
			}
		}
	}

	private String getStringValue(Cell cell) {
		if (cell == null || cell.getCellType() == CellType.BLANK)
			return "";
		return switch (cell.getCellType()) {
		case STRING -> cell.getStringCellValue();
		case NUMERIC -> String.valueOf((int) cell.getNumericCellValue());
		default -> "";
		};
	}

	private Integer getSafeIntValue(Cell cell) {
		if (cell == null || cell.getCellType() == CellType.BLANK)
			return null;
		try {
			return (int) cell.getNumericCellValue();
		} catch (Exception e) {
			return null;
		}
	}
}
