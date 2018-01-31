package com.example.cdsm.tp05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        showInput();
    }

    private void showInput() {

        Intent intent = getIntent();
        ((TextView)findViewById(R.id.txtSaisiVal)).setText(intent.getStringExtra("nombreSaisi"));
    }

    public void finish(View view) {
        /*Intent intent = new Intent();
        intent.putExtra("nom", 0);
        setResult(RESULT_OK, intent);*/
        finish();
    }
}
