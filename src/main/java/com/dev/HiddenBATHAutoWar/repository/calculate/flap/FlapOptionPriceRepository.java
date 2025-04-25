package com.dev.HiddenBATHAutoWar.repository.calculate.flap;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.flap.FlapOptionPrice;

@Repository
public interface FlapOptionPriceRepository extends JpaRepository<FlapOptionPrice, Long> {
	Optional<FlapOptionPrice> findByOptionName(String optionName);
}