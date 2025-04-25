package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowType;

@Repository
public interface MarbleLowTypeRepository extends JpaRepository<MarbleLowType, Long> {
	MarbleLowType findByMarbleName(String marbleName);
}
