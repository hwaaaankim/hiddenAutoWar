package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.SeriesPrice;

@Repository
public interface SeriesPriceRepository extends JpaRepository<SeriesPrice, Long> {
	SeriesPrice findByStandardWidth(int width);
}
