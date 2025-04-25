package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.BasePrice;

@Repository
public interface BasePriceRepository extends JpaRepository<BasePrice, Long> {
	BasePrice findByStandardWidth(int width);
}
