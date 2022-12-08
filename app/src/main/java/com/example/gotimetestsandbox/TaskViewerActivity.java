package com.example.gotimetestsandbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TaskViewerActivity extends AppCompatActivity {

    public String d1 = "hi there fiends";
    public String d2 = "yo wassup";

    public String t1 = "friendly";
    public String t2 = "familiar";

    //teh goal with these is to change the title (t1/2) and description (d1/2)
    //if a button being pressed can change this sort of thing, then we're golden- we can access different members of SQL models and display what we like



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_viewer);

        setContentView(R.layout.activity_main);
        TextView TextTitle = (TextView) findViewById(R.id.TextTitle);
        TextTitle.setText(t1);

    }




}