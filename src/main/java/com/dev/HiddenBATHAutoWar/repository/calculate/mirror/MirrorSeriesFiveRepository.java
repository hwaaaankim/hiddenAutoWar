package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesFive;

@Repository
public interface MirrorSeriesFiveRepository extends JpaRepository<MirrorSeriesFive, Long>{
	MirrorSeriesFive findByStandardWidth(int standardWidth);
}
