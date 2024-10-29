package com.example.demo.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test_table")
public class TestingEntity
{
    @Id
    Integer test_id;

    Integer test_column;

    String string_column;
}
