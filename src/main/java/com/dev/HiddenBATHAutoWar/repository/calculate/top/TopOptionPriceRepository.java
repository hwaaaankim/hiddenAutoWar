package com.dev.HiddenBATHAutoWar.repository.calculate.top;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.top.TopOptionPrice;

@Repository
public interface TopOptionPriceRepository extends JpaRepository<TopOptionPrice, Long> {
    Optional<TopOptionPrice> findByOptionName(String optionName);
}