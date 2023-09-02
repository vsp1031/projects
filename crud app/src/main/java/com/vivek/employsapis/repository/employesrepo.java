package com.vivek.employsapis.repository;

import com.vivek.employsapis.entity.employes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employesrepo extends JpaRepository<employes,Long> {
}
