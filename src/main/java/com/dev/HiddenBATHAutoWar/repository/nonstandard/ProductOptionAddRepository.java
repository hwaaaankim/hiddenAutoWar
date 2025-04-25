package com.dev.HiddenBATHAutoWar.repository.nonstandard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.HiddenBATHAutoWar.model.nonstandard.ProductOptionAdd;

@Repository
public interface ProductOptionAddRepository extends JpaRepository<ProductOptionAdd, Long> {
}