package com.dharan.behavioral.cor;

public class FaangJob implements JobChain{

    /**
     * Know who is next in the job chain
     */
    private JobChain jobChain;


    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equalsIgnoreCase("FAANG")){
            System.out.println("Got Selected in FAANG");
        }else{
            System.out.println("Got rejected in FAANG");
            System.out.println("Applying for product based");
            this.jobChain.getJob(person); // recurse for remaining problem solvers
        }
    }
}
