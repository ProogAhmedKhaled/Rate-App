/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Student {

    int id;
    String name;
    String pass;
    String email;
    String Scientific_degree;
    String StudyType;
    String Specialization;
    String Semister;
    String level;
    double gpaDegree;
    int total_Hours;

    ArrayList<Subject> studentSubjects;

    public Student() {
    }

    public Student(int id, String name, String pass, String email, String Scientific_degree, String StudyType, String Specialization, String Semister, String level, double gpaDegree, int total_Hours) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.Scientific_degree = Scientific_degree;
        this.StudyType = StudyType;
        this.Specialization = Specialization;
        this.Semister = Semister;
        this.level = level;
        this.gpaDegree = gpaDegree;
        this.total_Hours = total_Hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getScientific_degree() {
        return Scientific_degree;
    }

    public void setScientific_degree(String Scientific_degree) {
        this.Scientific_degree = Scientific_degree;
    }

    public String getStudyType() {
        return StudyType;
    }

    public void setStudyType(String StudyType) {
        this.StudyType = StudyType;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getSemister() {
        return Semister;
    }

    public void setSemister(String Semister) {
        this.Semister = Semister;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getGpaDegree() {
        return gpaDegree;
    }

    public void setGpaDegree(double gpaDegree) {
        this.gpaDegree = gpaDegree;
    }

    public int getTotal_Hours() {
        return total_Hours;
    }

    public void setTotal_Hours(int total_Hours) {
        this.total_Hours = total_Hours;
    }

    public ArrayList<Subject> getStudentSubjects() {
        ArrayList<Subject> subjects = Manager.getStudentSubjects(this);
        System.out.println("Called");
        if (subjects != null) {
            System.out.println(" rrr ");

            this.studentSubjects = subjects;
        }
        return studentSubjects;
    }

}
