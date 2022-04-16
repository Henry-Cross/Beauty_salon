package com.example.beauty_salon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
    RadioButton rb1,rb2;
    Button calcular, cancelar;
    TextView ttotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rb1= findViewById(R.id.radioButton);
        rb2= findViewById(R.id.radioButton2);
        cb1= findViewById(R.id.checkBox);
        cb2= findViewById(R.id.checkBox2);
        cb3= findViewById(R.id.checkBox3);
        cb4= findViewById(R.id.checkBox4);
        cb5= findViewById(R.id.checkBox5);
        cb6= findViewById(R.id.checkBox6);
        cb7= findViewById(R.id.checkBox7);
        cb8= findViewById(R.id.checkBox8);
        cb9= findViewById(R.id.checkBox9);
        cb10= findViewById(R.id.checkBox10);
        calcular= findViewById(R.id.button);
        cancelar= findViewById(R.id.button2);
        ttotal=findViewById(R.id.textView2);
    }
    public void calcular (View v){
        Double total=0.0;
        if(rb1.isChecked())
            total=total+10;
        if(cb1.isChecked())
            total=total+25;
        if(cb2.isChecked())
            total=total+35;
        if(cb3.isChecked())
            total=total+25;
        if(cb4.isChecked())
            total=total+15;
        if(cb5.isChecked())
            total=total+45;
        if(cb6.isChecked())
            total=total+65;
        if(cb7.isChecked())
            total=total+45;
        if(cb8.isChecked())
            total=total+35;
        if(cb9.isChecked())
            total=total+55;
        if(cb10.isChecked())
            total=total+5;
        ttotal.setText("Total: "+total);
    }
    public void cancelar (View v){
        rb1.setChecked(false);
        rb2.setChecked(false);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);
        cb7.setChecked(false);
        cb8.setChecked(false);
        cb9.setChecked(false);
        cb10.setChecked(false);

        ttotal.setText("total=0");


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull  MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_profile:
                Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(intent);
                break;
            case R.id.action_reporte:
                Intent intent1= new Intent(getApplicationContext(), ReporteActivity.class);
                startActivity(intent1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        return super.onOptionsItemSelected(item);
    }
}