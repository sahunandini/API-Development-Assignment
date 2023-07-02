package com.example.API_Development.Repository;

import com.example.API_Development.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Purchase> findByDepartment(String department);
    // You can define custom query methods here if needed
}
