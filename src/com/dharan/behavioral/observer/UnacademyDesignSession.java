package com.dharan.behavioral.observer;

import java.util.ArrayList;

public class UnacademyDesignSession implements StudySession{

    private final ArrayList<Student> observerStudentList;

    private String topic;

    public UnacademyDesignSession() {
        observerStudentList = new ArrayList<>();
    }

    @Override
    public void addStudentObserver(Student student) {
        if(student != null){
            observerStudentList.add(student);
        }
    }

    @Override
    public void removeStudentObserver(Student student) {
        if(student != null && observerStudentList.contains(student)){
            observerStudentList.remove(student);
        }
    }

    @Override
    public void notifyStudentObserver() {
        for(Student student : observerStudentList)
            student.update();
    }

    @Override
    public String getSessionTopic(Student student) {
        if(observerStudentList.contains(student)){
            return this.topic;
        }
        return null;
    }

    @Override
    public void setSessionTopic(String topic) {
        this.topic = topic;
        notifyStudentObserver();
    }
}
