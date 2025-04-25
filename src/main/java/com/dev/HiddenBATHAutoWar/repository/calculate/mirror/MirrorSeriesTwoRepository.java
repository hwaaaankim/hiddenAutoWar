package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesTwo;

@Repository
public interface MirrorSeriesTwoRepository extends JpaRepository<MirrorSeriesTwo, Long>{
	MirrorSeriesTwo findByStandardWidth(int standardWidth);
}
