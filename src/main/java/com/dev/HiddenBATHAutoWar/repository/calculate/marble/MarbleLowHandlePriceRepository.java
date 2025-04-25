package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowHandlePrice;

@Repository
public interface MarbleLowHandlePriceRepository extends JpaRepository<MarbleLowHandlePrice, Long> {
}
