package com.dharan.behavioral.cor;

public class ServiceJob implements JobChain{

    private JobChain jobChain;

    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equalsIgnoreCase("Service")){
            System.out.println("Got selected in Service Company");
        }else{
            System.out.println("Got Rejected in service company");
            System.out.println("Need to prepare more");
            if(jobChain != null){
                this.jobChain.getJob(person);
            }
        }
    }
}
