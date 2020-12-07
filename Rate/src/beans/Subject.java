/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author pc
 */
public class Subject {

    String subId;
    String subName;
    int subHours;
    String level;
    String semister;
    String depart;
    int fullMarks;
    double sub_Mark;

    public Subject() {
    }

    public Subject(String subId, String subName, int subHours, String level, int fullMarks, String semister) {
        this.subId = subId;
        this.subName = subName;
        this.subHours = subHours;
        this.level = level;
        this.semister = semister;
        this.fullMarks = fullMarks;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getSubHours() {
        return subHours;
    }

    public void setSubHours(int subHours) {
        this.subHours = subHours;
    }

    public String getLevel() {
        return level;
    }

    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(int fullMarks) {
        this.fullMarks = fullMarks;
    }

    public double getSub_Mark() {
        return sub_Mark;
    }

    public void setSub_Mark(double sub_Mark) {
        this.sub_Mark = sub_Mark;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    
    
    @Override
    public String toString() {
        return subId + " , " + subHours + " \n " + subName + '}';
    }

    
    
}
