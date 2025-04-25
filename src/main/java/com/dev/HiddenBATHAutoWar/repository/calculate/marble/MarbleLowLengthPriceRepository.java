package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowLengthPrice;

@Repository
public interface MarbleLowLengthPriceRepository extends JpaRepository<MarbleLowLengthPrice, Long> {
	MarbleLowLengthPrice findByStandardWidth(int standardWidth);
}
