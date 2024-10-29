package com.example.demo.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<TestingEntity, Long>
{

    //TestingEntity findById(String name);
}
