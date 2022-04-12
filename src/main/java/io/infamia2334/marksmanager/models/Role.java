package io.infamia2334.marksmanager.models;

public class Role {
    private static final String STUDENT = "STUDENT";
    private static final String TEACHER = "TEACHER";
    private static final String ADMIN = "ADMIN";


    public Role() {
    }

    public String getStudent() {
        return Role.STUDENT;
    }

    public String getTeacher(){
        return Role.TEACHER;
    }

    public String getAdmin() {
        return Role.ADMIN;
    }

    @Override
    public String toString() {
        return "{" +
        " STUDENT'" + getStudent() + "'" +
        ", TEACHER'" + getTeacher() + "'" +
        ", ADMIN='" + getAdmin() + "'" +
        "}";
    }
    
}
