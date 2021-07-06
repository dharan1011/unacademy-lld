package com.dharan.structural.facade;

public class DbReportFacade {
    public static void generateReport(String sourceType, String reportType){
        DbReportGenerator reportGenerator = null;
        if(sourceType.equalsIgnoreCase("mongo")){
            reportGenerator = new HdfsReportGenerator();
        }else if(sourceType.equalsIgnoreCase("hdfs")){
            reportGenerator = new MongoReportGenerator();
        }
        if(reportGenerator == null){
            throw new RuntimeException("Unsupported Source Type : " + sourceType);
        }
        if(reportType.equalsIgnoreCase("csv")){
            reportGenerator.generateCsvReport();
        }else if(reportType.equalsIgnoreCase("pdf")){
            reportGenerator.generatePdfReport();
        }
    }
}
