package com.dharan.structural.facade;

public class HdfsReportGenerator implements DbReportGenerator {
    @Override
    public void createConnection() {
        System.out.println("Created HDFS Connection");
    }

    @Override
    public void generateCsvReport() {
        System.out.println("HDFS : Generated CSV Report");
    }

    @Override
    public void generatePdfReport() {
        System.out.println("HDFS : Generated PDF Report");
    }
}
