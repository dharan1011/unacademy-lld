package com.dharan.structural.facade;

public interface DbReportGenerator {
    void createConnection();
    void generateCsvReport();
    void generatePdfReport();
}
