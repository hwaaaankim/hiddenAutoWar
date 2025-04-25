package com.dev.HiddenBATHAutoWar.repository.calculate.flap;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.flap.FlapBasicPrice;

@Repository
public interface FlapBasicPriceRepository extends JpaRepository<FlapBasicPrice, Long> {
	Optional<FlapBasicPrice> findByProductName(String productName);
}
