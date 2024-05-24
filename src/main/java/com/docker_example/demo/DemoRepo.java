package com.docker_example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {
}
