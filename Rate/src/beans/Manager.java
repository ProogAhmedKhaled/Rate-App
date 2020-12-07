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
public class Manager {

    static ArrayList<Student> studentsLists = new ArrayList<>();
    static ArrayList<Subject> subjectsList = new ArrayList<>();
    static ArrayList<RoadMap> roadsList = new ArrayList<>();

    public static boolean isValidStudent(int id, String pass) {
        Student st;
        if (isStudentExist(id)) {
            // get student from arraylist
            st = getStudent(id);
            // check password
            if (st.getPass().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    // insert Student
    public static void insertStudent(Student student) {

        if (!isStudentExist(student.id)) {
            studentsLists.add(student);
            System.out.println("Inserted " + student.id);
        }
    }

    // to check if the student exist in the array list of student or not
    public static boolean isStudentExist(int id) {
        for (Student studentt : studentsLists) {
            if (studentt.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // return one Student
    public static Student getStudent(int id) {
        for (Student student : studentsLists) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // return all Student
    public static ArrayList<Student> getAllStudents() {
        return studentsLists;
    }

    public static ArrayList<Subject> getStudentSubjects(Student student) {

        ArrayList<Subject> studentSubjects = new ArrayList<>();
        for (Subject subject : subjectsList) {
            if (subject.getLevel().equals(student.getLevel()) && subject.getSemister().equals(student.getSemister())
                    && subject.getDepart().equals(student.getSpecialization())) {
                studentSubjects.add(subject);
            }
        }

        return studentSubjects;

    }

    //////////////////////////////////////////////////////////////////////
    /////////////////////***** Subject Method *****//////////////////////
    // insert Subject
    public static void insertSubject(Subject subject) {
        if (!isSubjectExist(subject.getSubId())) {
            subjectsList.add(subject);
            System.out.println("Inserted " + subject.subId);
        }
    }

    // to check if the Subject exist in the array list of Subject or not
    public static boolean isSubjectExist(String id) {
        for (Subject subject : subjectsList) {
            if (subject.getSubId().equals(id)) {
                return true;
            } 
        }
        return false;
    }

    // return Subject
    public static Subject getSubject(String id) {
        for (Subject subject : subjectsList) {
            if (subject.getSubId().equals(id)) {
                return subject;
            }
        }
        return null;
    }
    // return all Subjects

    public static ArrayList<Subject> getAllSubjects() {
        return subjectsList;
    }

    //////////////////////////////////////////////////////////////////////
    // insert Road Map
    public static void insertRoadMap(RoadMap roadMap) {
        if (!isRoadMapExist(roadMap.getRoadName())) {
            roadsList.add(roadMap);
            System.out.println("Inserted " + roadMap.getRoadName());
        }
    }

    // to check if the Road Map exist in the array list of Subject or not
    public static boolean isRoadMapExist(String name) {
        for (RoadMap roadMap : roadsList) {
            if (roadMap.getRoadName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // return Road Map
    public static RoadMap getRoadMap(String mapName) {
        for (RoadMap roadMap : roadsList) {
            if (roadMap.getRoadName().equals(mapName)) {
                return roadMap;
            }
        }
        return null;
    }

    // get All Road Map 
    public static ArrayList<RoadMap> getAllRoadMap() {
        return roadsList;
    }

    ////////////////////////////////////////////////////////////////////////
    ////////////////////******* General Method ********/////////////////////
    // check if the data is valid or not
    public static boolean isCorrectData(String data) {
        return data != null && !data.isEmpty();
    }

    // check if the String is number or not
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
