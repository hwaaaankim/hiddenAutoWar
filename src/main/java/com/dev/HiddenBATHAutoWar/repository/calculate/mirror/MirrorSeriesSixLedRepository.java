package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesSixLed;

@Repository
public interface MirrorSeriesSixLedRepository extends JpaRepository<MirrorSeriesSixLed, Long>{
	MirrorSeriesSixLed findByStandardWidth(int standardWidth);
}
