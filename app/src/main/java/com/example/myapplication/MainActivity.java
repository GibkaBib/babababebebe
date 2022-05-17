package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User student = new User();
        student.firstname = "Александр";
        student.lastname = "Викторов";
        student.school = 17;
        Gson gson = new Gson();
        Log.i("GSON", gson.toJson(student));

    }
    public class User {
        public String firstname; // имя
        public String lastname; // фамилия
        public int school; // номер школы
        School schoolinfo


    }
     public class Gson{

     }
    class Shcool{
        String name;
        String adress;
    }
}
