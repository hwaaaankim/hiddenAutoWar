package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesOne;

@Repository
public interface MirrorSeriesOneRepository extends JpaRepository<MirrorSeriesOne, Long>{
	MirrorSeriesOne findByStandardWidth(int standardWidth);
}
