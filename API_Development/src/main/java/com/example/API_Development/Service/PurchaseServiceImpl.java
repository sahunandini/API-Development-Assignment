package com.example.API_Development.Service;


import com.example.API_Development.Entity.Purchase;
import com.example.API_Development.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl extends PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;


    @Override
    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    @Override
    public List<Purchase> getPurchasesByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return purchaseRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    public List<Purchase> getPurchasesByDepartment(String department) {
        return purchaseRepository.findByDepartment(department);
    }


}
