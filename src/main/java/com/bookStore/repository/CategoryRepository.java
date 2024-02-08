package com.bookStore.repository;


import com.bookStore.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
