package com.example.cdsm.tp05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE =123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        // getting nbSaisi
        String s = ((EditText)findViewById(R.id.editText)).getText().toString();

        System.out.println("THIS : "+this.getClass().getName() );
        // instantiation of Resultat activity
        Intent intent = new Intent(this, Resultat.class);

        // add input value to activity parameters
        intent.putExtra("nombreSaisi", s);

        // start activity
        // startActivity(intent);
        startActivityForResult(intent, REQ_CODE);
    }
    /*
    protected void onActivityResult(int reqCode, int resCode, Intent intent){
        super.onActivityResult(reqCode, resCode, intent);
        if (reqCode == REQ_CODE) {
        String data = intent.getStringExtra("var");
    }
    */

}
