package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesFiveLed;

@Repository
public interface MirrorSeriesFiveLedRepository extends JpaRepository<MirrorSeriesFiveLed, Long>{
	MirrorSeriesFiveLed findByStandardWidth(int standardWidth);
}
