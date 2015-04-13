package com.example.ryan.testapplications;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class JoinClass extends ActionBarActivity {

    private SchoolInfo school = SchoolInfo.getInstance();
    private EditText coursecode;
    private EditText courseID;
    private EditText sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_class);
        coursecode = (EditText) findViewById(R.id.instName);
        courseID = (EditText) findViewById(R.id.course);
        sNum = (EditText) findViewById(R.id.section);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_join_class, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void submitInfo(View v) {

        int Code = Integer.parseInt(coursecode.getText().toString());
        int ID = Integer.parseInt(courseID.getText().toString());
        int sectionNum = Integer.parseInt(sNum.getText().toString());
        int indexC;
        int indexS;

        course c = school.FindCourse(Code);
        indexC = school.FindCourseIndex(Code);

        section s = c.findSection(ID);

        indexS = c.findSectionIndex(ID);

        s.addStudent(school.getCurUser());

        c.getSectionList().remove(indexS);
        c.getSectionList().add(indexS, s);

        school.getCourses().remove(indexC);
        school.getCourses().add(indexC, c);

        student St = school.FindStudent(school.getCurUser().getName());
        St.addCourse(s);

        Intent intent = new Intent(JoinClass.this, MainActivity.class);
        startActivity(intent);

    }
}
