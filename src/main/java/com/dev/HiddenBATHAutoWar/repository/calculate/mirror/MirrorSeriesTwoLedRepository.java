package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesTwoLed;

@Repository
public interface MirrorSeriesTwoLedRepository extends JpaRepository<MirrorSeriesTwoLed, Long>{
	MirrorSeriesTwoLed findByStandardWidth(int standardWidth);
}
