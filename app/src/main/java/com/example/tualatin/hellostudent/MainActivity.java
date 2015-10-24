package com.example.tualatin.hellostudent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.awt.font.TextAttribute;

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
