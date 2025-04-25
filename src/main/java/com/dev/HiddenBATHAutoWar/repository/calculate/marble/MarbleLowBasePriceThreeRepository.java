package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowBasePriceThree;

@Repository
public interface MarbleLowBasePriceThreeRepository extends JpaRepository<MarbleLowBasePriceThree, Long> {
	MarbleLowBasePriceThree findByStandardWidth(int standardWidth);
}
