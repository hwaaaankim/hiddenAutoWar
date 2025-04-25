package com.dev.HiddenBATHAutoWar.repository.calculate.slide;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideOptionPrice;

@Repository
public interface SlideOptionPriceRepository extends JpaRepository<SlideOptionPrice, Long> {
    Optional<SlideOptionPrice> findByOptionName(String optionName);
}
