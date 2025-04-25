package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesFourLed;

@Repository
public interface MirrorSeriesFourLedRepository extends JpaRepository<MirrorSeriesFourLed, Long>{
	MirrorSeriesFourLed findByStandardWidth(int standardWidth);
}
