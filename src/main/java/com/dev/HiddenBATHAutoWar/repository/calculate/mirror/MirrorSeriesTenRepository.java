package com.dev.HiddenBATHAutoWar.repository.calculate.mirror;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.mirror.MirrorSeriesTen;

@Repository
public interface MirrorSeriesTenRepository extends JpaRepository<MirrorSeriesTen, Long>{
	MirrorSeriesTen findByStandardWidth(int standardWidth);
}
