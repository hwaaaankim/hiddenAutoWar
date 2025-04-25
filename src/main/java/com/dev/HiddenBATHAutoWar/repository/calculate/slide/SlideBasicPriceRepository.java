package com.dev.HiddenBATHAutoWar.repository.calculate.slide;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideBasicPrice;

@Repository
public interface SlideBasicPriceRepository extends JpaRepository<SlideBasicPrice, Long> {
    Optional<SlideBasicPrice> findByProductName(String productName);
}
