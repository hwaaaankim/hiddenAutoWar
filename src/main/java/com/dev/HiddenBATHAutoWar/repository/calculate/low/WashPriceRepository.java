package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.WashPrice;

@Repository
public interface WashPriceRepository extends JpaRepository<WashPrice, Long> {
	WashPrice findByBasinType(String type);
}
