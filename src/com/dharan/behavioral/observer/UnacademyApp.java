package com.dharan.behavioral.observer;

public class UnacademyApp {
    public static void main(String[] args) {
        StudySession studySession = new UnacademyDesignSession();
        Student s1 =  new UnacademyStudent("Mohan");
        Student s2 =  new UnacademyStudent("Mahidhar");
        Student s3 =  new UnacademyStudent("Danesh");
        Student s4 =  new UnacademyStudent("Mowa bro");

        studySession.addStudentObserver(s1);
        studySession.addStudentObserver(s2);
        studySession.addStudentObserver(s3);
        studySession.addStudentObserver(s4);

        s1.setStudySession(studySession);
        s2.setStudySession(studySession);
        s3.setStudySession(studySession);
        s4.setStudySession(studySession);

        studySession.setSessionTopic("Low Level Design");
        studySession.setSessionTopic("High Level Design");
    }
}
