package com.dev.HiddenBATHAutoWar.repository.calculate.slide;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.slide.SlideHandlePrice;

@Repository
public interface SlideHandlePriceRepository extends JpaRepository<SlideHandlePrice, Long>{

}
