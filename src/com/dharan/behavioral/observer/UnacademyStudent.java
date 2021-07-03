package com.dharan.behavioral.observer;

public class UnacademyStudent implements Student {

    String name;

    StudySession studySession;

    public UnacademyStudent(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String topic = this.studySession.getSessionTopic(this);
        if(topic != null){
            System.out.println(this.name + " SubScribed topic : " + topic);
        }
    }

    @Override
    public void setStudySession(StudySession studySession) {
        this.studySession = studySession;
    }
}
