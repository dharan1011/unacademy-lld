package com.dharan.behavioral.cor;

public interface JobChain {

    /**
     * Setting the next Job
     * @param jobChain
     */
    void setNextChain(JobChain jobChain);

    /**
     * Help person get a job
     * 1. FAANG
     * 2. Product
     * 3. Service
     * @param person
     */
    void getJob(Person person);

}
