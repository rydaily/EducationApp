package com.example.ryan.testapplications;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ryan on 2/20/2015.
 */
public class section {

    private int sectionNum;
    private int courseID;
    private instructor teacher;
    private ArrayList students = new ArrayList<student>();

    public section(int sNum, int cID, instructor courseTeacher, ArrayList enrolledStudents){
        sectionNum = sNum;
        courseID = cID;
        teacher = courseTeacher;
        students = enrolledStudents;
    }

    public int getSectionNum(){
        return sectionNum;
    }

    public int getCourseID(){
        return courseID;
    }

    public instructor getInst(){
        return teacher;
    }

    public ArrayList getStudentList(){
        return students;
    }

    public void addStudent(student s){
        students.add(s);
    }


}
