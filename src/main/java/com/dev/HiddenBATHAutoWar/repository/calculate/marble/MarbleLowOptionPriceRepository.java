package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowOptionPrice;

@Repository
public interface MarbleLowOptionPriceRepository extends JpaRepository<MarbleLowOptionPrice, Long> {
	 MarbleLowOptionPrice findByOptionName(String optionName);
}
