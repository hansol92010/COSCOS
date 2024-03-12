package com.coscos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coscos.entity.Cosmetic;

@Repository
public interface CosmeticRepository extends JpaRepository<Cosmetic, Long> {

}