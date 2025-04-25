package com.dev.HiddenBATHAutoWar.service.nonstandard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.HiddenBATHAutoWar.model.nonstandard.Series;
import com.dev.HiddenBATHAutoWar.repository.nonstandard.ProductSeriesRepository;

@Service
public class ProductMiddleSortService {

	@Autowired
	ProductSeriesRepository productMiddleSortRepository;
	
	public void deleteProductMiddleSort(Long[] id) {
		for(Long i : id) {
			productMiddleSortRepository.deleteById(i);
		}
	}
	// BigSort ID를 이용해 MiddleSort와 Product 데이터 가져오기
    public List<Series> getMiddleSortsWithProductsByBigSortId(Long bigSortId) {
        return productMiddleSortRepository.findMiddleSortsByBigSortIdWithOrderedProducts(bigSortId);
    }
}
