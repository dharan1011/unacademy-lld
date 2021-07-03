package com.dharan.behavioral.cor;

public class ProductJob implements JobChain {

    private JobChain jobChain;

    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equalsIgnoreCase("Product")){
            System.out.println("Got Selected int Product Company");
        }else{
            System.out.println("Got rejected in product company");
            System.out.println("Applying for service based company");
            this.jobChain.getJob(person);
        }
    }
}
