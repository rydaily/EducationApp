package com.example.ryan.testapplications;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Classroom extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_classroom, menu);
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

    public void sendMessage(View v) {

        // This is where you place the code to send a message to the instructor's app

        Toast toast = Toast.makeText(getApplicationContext(),"Help!", Toast.LENGTH_SHORT);
        toast.show();
    }
//      uncomment this function if you want to lock the back button
//    @Override
//    public void onBackPressed() {
//        Toast toast = Toast.makeText(getApplicationContext(),"The Phone Is Locked", Toast.LENGTH_SHORT);
//        toast.show();
//    }

    @Override
    public void onPause(){

        // Send teacher a message that a student has quit the app

        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(),"Student Has Left the Classroom", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onResume() {

        // Send teacher a message that a student has opened the app

        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "Student Has Joined the Classroom", Toast.LENGTH_SHORT);
        toast.show();
    }
}
