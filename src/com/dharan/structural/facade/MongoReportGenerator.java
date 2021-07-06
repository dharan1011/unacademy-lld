package com.dharan.structural.facade;

public class MongoReportGenerator implements DbReportGenerator{
    @Override
    public void createConnection() {
        System.out.println("Created Mongo DB Connection");
    }

    @Override
    public void generateCsvReport() {
        System.out.println("Mongo DB : Generated CSV Report");
    }

    @Override
    public void generatePdfReport() {
        System.out.println("Mongo DB : Generated PDF Report");
    }
}
