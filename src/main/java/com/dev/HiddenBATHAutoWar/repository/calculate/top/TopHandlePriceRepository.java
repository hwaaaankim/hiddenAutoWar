package com.dev.HiddenBATHAutoWar.repository.calculate.top;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.top.TopHandlePrice;

@Repository
public interface TopHandlePriceRepository extends JpaRepository<TopHandlePrice, Long> {
    Optional<TopHandlePrice> findByHandleName(String handleName);
}
