package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesThreeLed;

@Repository
public interface MirrorSeriesThreeLedRepository extends JpaRepository<MirrorSeriesThreeLed, Long>{
	MirrorSeriesThreeLed findByStandardWidth(int standardWidth);
}
