package com.example.ryan.testapplications;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    private SchoolInfo school = SchoolInfo.getInstance();
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.Password);
        school.setAccounts();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    public void CheckLogin(View v){

        String UN = username.getText().toString();
        String PW = password.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),"Incorrect Login", Toast.LENGTH_SHORT);

        student S = school.FindStudent(UN);
        if (S == null){
            toast.show();
        }
        else if (UN.equals(S.getName()) && PW.equals(S.getPass())){
            school.setCurUser(S);
            LoginSuccess(v);
        } else{
            toast.show();
        }
    }

    public void LoginSuccess(View v){
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }

    public void CreateAccount(View v){
        Intent intent = new Intent(Login.this, NewAccount.class);
        startActivity(intent);
    }

}
