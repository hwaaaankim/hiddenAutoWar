package com.dev.HiddenBATHAutoWar.repository.calculate.flap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.flap.FlapHandlePrice;

@Repository
public interface FlapHandlePriceRepository extends JpaRepository<FlapHandlePrice, Long> {
	
}

