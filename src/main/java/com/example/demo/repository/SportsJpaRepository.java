package com.example.demo.repository;

import com.example.demo.models.Sports;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface SportsJpaRepository extends JpaRepository<Sports,Long> {

}
