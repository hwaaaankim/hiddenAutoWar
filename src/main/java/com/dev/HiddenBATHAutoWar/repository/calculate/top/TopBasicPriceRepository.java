package com.dev.HiddenBATHAutoWar.repository.calculate.top;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.top.TopBasicPrice;

@Repository
public interface TopBasicPriceRepository extends JpaRepository<TopBasicPrice, Long> {
    Optional<TopBasicPrice> findByProductName(String productName);
}
