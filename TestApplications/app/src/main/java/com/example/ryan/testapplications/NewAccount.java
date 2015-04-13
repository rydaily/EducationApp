package com.example.ryan.testapplications;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class NewAccount extends ActionBarActivity {

    private SchoolInfo school = SchoolInfo.getInstance();
    private EditText name;
    private EditText id;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        name = (EditText) findViewById(R.id.nameEntry);
        id = (EditText) findViewById(R.id.IDEntry);
        password = (EditText) findViewById(R.id.passwordEntry);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_account, menu);
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

    public void newAccount(View v){
        String N = name.getText().toString();
        int ID = Integer.parseInt(id.getText().toString());
        String E = password.getText().toString();
        ArrayList AL = new ArrayList();

        student nStudent = new student(N, ID, E, AL);
        school.addStudent(nStudent);

        Intent intent = new Intent(NewAccount.this, Login.class);
        startActivity(intent);
    }
}
