package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.MarbleType;

@Repository
public interface MarbleTypeRepository extends JpaRepository<MarbleType, Long> {
	MarbleType findByMarbleName(String name);
}