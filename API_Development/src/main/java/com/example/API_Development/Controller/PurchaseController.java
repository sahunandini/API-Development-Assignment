package com.example.API_Development.Controller;


import com.example.API_Development.Entity.Purchase;
import com.example.API_Development.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping
    public ResponseEntity<List<Purchase>> getAllPurchases() {
        List<Purchase> purchases = purchaseService.getAllPurchases();
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    @GetMapping("/date-range")
    public ResponseEntity<List<Purchase>> getPurchasesByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate
    ) {
        List<Purchase> purchases = purchaseService.getPurchasesByDateRange(startDate, endDate);
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    @GetMapping("/department")
    public ResponseEntity<List<Purchase>> getPurchasesByDepartment(@RequestParam String department) {
        List<Purchase> purchases = purchaseService.getPurchasesByDepartment(department);
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    // Add more API endpoints for handling different purchase-related operations

    // Example:
//     @GetMapping("/{purchaseId}")
//     public ResponseEntity<Purchase> getPurchaseById(@PathVariable Long purchaseId) {
//         Purchase purchase = purchaseService.getPurchaseById(purchaseId);
//         if (purchase != null) {
//             return new ResponseEntity<>(purchase, HttpStatus.OK);
//         } else {
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }
//     }
}
