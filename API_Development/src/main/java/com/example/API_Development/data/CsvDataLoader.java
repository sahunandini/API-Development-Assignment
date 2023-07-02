package com.example.API_Development.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvDataLoader {

    private final EntityManager entityManager;

    public CsvDataLoader(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Transactional
    public void loadCsvData() throws IOException {
        Path filePath = Path.of(getClass().getClassLoader().getResource("data.csv").getPath());
        List<String> lines = Files.readAllLines(filePath);

        // Process and load the data into the database
        // Implement your logic here based on the structure of your CSV file and entity mappings
    }
}
