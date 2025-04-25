package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesEight;

@Repository
public interface MirrorSeriesEightRepository extends JpaRepository<MirrorSeriesEight, Long>{
	MirrorSeriesEight findByStandardWidth(int standardWidth);
}
