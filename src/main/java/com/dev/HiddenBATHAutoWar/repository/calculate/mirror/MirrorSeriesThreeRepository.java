package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesThree;

@Repository
public interface MirrorSeriesThreeRepository extends JpaRepository<MirrorSeriesThree, Long>{
	MirrorSeriesThree findByStandardWidth(int standardWidth);
}
