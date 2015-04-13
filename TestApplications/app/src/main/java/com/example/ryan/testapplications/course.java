package com.example.ryan.testapplications;

import java.util.ArrayList;

public class course {

    private int code;
    private String title;
    private ArrayList sections = new ArrayList<section>();
    private SchoolInfo school = SchoolInfo.getInstance();


    public course(int courseCode, String cTitle, ArrayList sectionList){
        code = courseCode;
        title = cTitle;
        sections = sectionList;
    }

    public int getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList getSectionList(){
        return sections;
    }

    public void addSection(section sc){
        sections.add(sc);
    }

    public section findSection(int cID){
        int i;
        section s;
        if (sections.size() != 0){
            for(i = 0; i < sections.size(); i++){
                s = (section) sections.get(i);
                if(cID == s.getCourseID()){
                    return s;
                }
                return null;
            }
        }
        return null;
    }

    public int findSectionIndex(int cID){
        int i;
        section s;
        if (sections.size() != 0){
            for(i = 0; i < sections.size(); i++){
                s = (section) sections.get(i);
                if(cID == s.getCourseID()){
                    return i;
                }
                return -1;
            }
        }
        return -1;
    }

}
