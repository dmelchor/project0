package com.example.android.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Popular Movies button is clicked.
     */
    public void popularMovies(View view) {
        Toast.makeText(this, "This button will launch my popular movies project.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Stock Hawk button is clicked.
     */
    public void stockHawk(View view) {
        Toast.makeText(this, "This button will launch my stock hawk project.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Build It Bigger button is clicked.
     */
    public void buildBigger(View view) {
        Toast.makeText(this, "This button will launch my build it bigger project.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Make Your App Material button is clicked.
     */
    public void makeApp(View view) {
        Toast.makeText(this, "This button will launch my app material project.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Go Ubiquitous button is clicked.
     */
    public void goUbiquitous(View view) {
        Toast.makeText(this, "This button will launch my go ubiquitous project.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Capstone: My Own App button is clicked.
     */
    public void capstone(View view) {
        Toast.makeText(this, "This button will launch my capstone project.", Toast.LENGTH_SHORT).show();
    }
}
