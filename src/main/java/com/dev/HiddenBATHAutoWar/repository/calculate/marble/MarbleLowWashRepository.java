package com.dev.HiddenBATHAutoWar.repository.calculate.marble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.marble.MarbleLowWash;

@Repository
public interface MarbleLowWashRepository extends JpaRepository<MarbleLowWash, Long> {
	MarbleLowWash findByStandardWidth(int standardWidth);
}
