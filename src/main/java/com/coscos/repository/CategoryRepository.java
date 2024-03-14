package com.coscos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coscos.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
