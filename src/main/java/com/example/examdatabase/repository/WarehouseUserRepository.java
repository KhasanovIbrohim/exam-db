package com.example.examdatabase.repository;

import com.example.examdatabase.entity.Warehouse_UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseUserRepository extends JpaRepository<Warehouse_UserId, Integer> {
}
