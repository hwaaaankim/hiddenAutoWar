package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowBasePriceOne;

@Repository
public interface MarbleLowBasePriceOneRepository extends JpaRepository<MarbleLowBasePriceOne, Long> {
	MarbleLowBasePriceOne findByStandardWidth(int standardWidth);
}