package com.dharan.behavioral.cor;

public class UnacademyJobProgram {
    public static void main(String[] args) {
        FaangJob faangJob = new FaangJob();
        ProductJob productJob = new ProductJob();
        ServiceJob serviceJob = new ServiceJob();
        faangJob.setNextChain(productJob);
        productJob.setNextChain(serviceJob);

        Person person = new Person("Dharan","faang");
        faangJob.getJob(person);
    }
}
