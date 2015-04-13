package com.example.ryan.testapplications;

import java.util.ArrayList;

/**
 * Created by Ryan on 2/20/2015.
 */
public class student {

    private String name = null;
    private int id = 0;
    private String password = null;
    private ArrayList sections = new ArrayList<section>();

    public student(String nameI, int idNum, String pass, ArrayList CourseList){
           name = nameI;
           password = pass;
           sections = CourseList;

            if(idNum < 0){
                id = idNum * -1;
            }
            else{
                id = idNum;
            }
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public ArrayList getCourseList(){
        return sections;
    }

    public void addCourse(section s){
        sections.add(s);
    }

    public String getPass(){
        return password;
    }
}
