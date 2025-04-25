package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorStandardPrice;

@Repository
public interface MirrorStandardPriceRepository extends JpaRepository<MirrorStandardPrice, Long> {
    Optional<MirrorStandardPrice> findByProductName(String productName);
}

