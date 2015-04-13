package com.example.ryan.testapplications;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MyClassList extends ActionBarActivity {

    private SchoolInfo school = SchoolInfo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class_list);
        classDisplay();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_class_list, menu);
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

    public void classDisplay(){
        student S = school.getCurUser();
        ArrayList classes = S.getCourseList();
        Button btn;

        btn = (Button) findViewById(R.id.button1);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button2);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button3);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button4);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button5);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button6);
        btn.setEnabled(false);
        btn.setVisibility(View.INVISIBLE);

        if(classes.size() == 1) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
        if(classes.size() == 2) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button2);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
        if(classes.size() == 3) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button2);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button3);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
        if(classes.size() == 4) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button2);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button3);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button4);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
        if(classes.size() == 5) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button2);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button3);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button4);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button5);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
        if(classes.size() == 6) {
            btn = (Button) findViewById(R.id.button1);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button2);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button3);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button4);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button5);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            btn = (Button) findViewById(R.id.button6);
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
        }
    }

    public void gotoClass(View v){
        Intent intent = new Intent(MyClassList.this, Classroom.class);
        startActivity(intent);
    }
}
