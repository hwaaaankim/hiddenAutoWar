package com.dev.HiddenBATHAutoWar.repository.calculate.low;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.calculate.low.Drawer;

@Repository
public interface DrawerRepository extends JpaRepository<Drawer, Long> {
	
}
