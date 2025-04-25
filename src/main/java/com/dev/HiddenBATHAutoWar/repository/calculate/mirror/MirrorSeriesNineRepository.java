package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesNine;

@Repository
public interface MirrorSeriesNineRepository extends JpaRepository<MirrorSeriesNine, Long>{
	MirrorSeriesNine findByStandardWidth(int standardWidth);
}
