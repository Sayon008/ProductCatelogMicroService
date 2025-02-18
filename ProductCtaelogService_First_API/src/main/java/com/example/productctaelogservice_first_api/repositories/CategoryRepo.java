package com.example.productctaelogservice_first_api.repositories;

import com.example.productctaelogservice_first_api.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>{
    @Override
    Optional<Category> findById(Long id);

    List<Category> findAll();

    Category save(Category category);

}
