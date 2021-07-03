package com.dharan.behavioral.observer;

public interface StudySession {

    /**
     * Method to add Student observer
     * @param student
     */
    void addStudentObserver(Student student);

    /**
     * Method to remove Student observer
     * @param student
     */
    void removeStudentObserver(Student student);

    /**
     * Method to notify all the observers
     */
    void notifyStudentObserver();

    /**
     * Method to poll when notified
     * @param student
     * @return
     */
    String getSessionTopic(Student student);

    /**
     * Method to set session topic
     * @param topic
     */
    void  setSessionTopic(String topic);
}
