package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.BodyOnly;

@Repository
public interface BodyOnlyRepository extends JpaRepository<BodyOnly, Long> {
	
}
