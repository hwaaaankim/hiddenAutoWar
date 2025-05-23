package com.dev.HiddenBATHAutoWar.repository.nonstandard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.nonstandard.ProductOptionPosition;

@Repository
public interface ProductOptionPositionRepository extends JpaRepository<ProductOptionPosition, Long> {
}