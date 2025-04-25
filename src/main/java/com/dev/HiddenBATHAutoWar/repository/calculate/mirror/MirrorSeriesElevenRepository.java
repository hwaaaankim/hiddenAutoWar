package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesEleven;

@Repository
public interface MirrorSeriesElevenRepository extends JpaRepository<MirrorSeriesEleven, Long>{
	MirrorSeriesEleven findByStandardWidth(int standardWidth);
}
