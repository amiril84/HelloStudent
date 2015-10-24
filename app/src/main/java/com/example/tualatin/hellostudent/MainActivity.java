package com.example.tualatin.hellostudent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.tualatin.hellostudent.model.Student;

public class MainActivity extends AppCompatActivity {

    private Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStudent = new Student();
        TextView textView = (TextView) findViewById(R.id.idText);
        mStudent.setNama("Amiril");
        textView.setText(mStudent.getNama());


    }


}
