package com.dev.HiddenBATHAutoWar.repository.nonstandard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.nonstandard.ProductColor;

@Repository
public interface ProductColorRepository extends JpaRepository<ProductColor, Long>{

}
