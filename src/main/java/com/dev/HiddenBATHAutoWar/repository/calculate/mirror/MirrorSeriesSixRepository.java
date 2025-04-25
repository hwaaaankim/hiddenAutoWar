package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesSix;

@Repository
public interface MirrorSeriesSixRepository extends JpaRepository<MirrorSeriesSix, Long>{
	MirrorSeriesSix findByStandardWidth(int standardWidth);
}
