package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesOneLed;

@Repository
public interface MirrorSeriesOneLedRepository extends JpaRepository<MirrorSeriesOneLed, Long>{

	MirrorSeriesOneLed findByStandardWidth(int standardWidth);
}
