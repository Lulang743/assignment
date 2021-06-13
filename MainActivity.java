package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton wave,nom,innesta;
    Button imgbut;
    ImageView pic;
    public static final int[] arrayid={R.id.innesta,R.id.nom,R.id.wave};
    Button []buttons=new Button[arrayid.length];
    String [] mesag={"congadulations"," sorry try again"};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*wave=(RadioButton) findViewById(R.id.wave);
        nom=(RadioButton)findViewById(R.id.nom);
        innesta=(RadioButton)findViewById(R.id.innesta);
        pic=(ImageView)findViewById(R.id.pic);*/


        for (i=0;i<arrayid.length;i++)
        {
            buttons[i]=(Button)findViewById(arrayid[i]);
            //buttons[i].getId();


            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId())
                    {
                        case R.id.innesta:
                            Toast.makeText(getApplicationContext(),"congradulation!",Toast.LENGTH_SHORT).show();
                            break;

                        case R.id.nom:
                            Toast.makeText(getApplicationContext(),"Inncorrect!",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.wave:
                            Toast.makeText(getApplicationContext(),"congradulation!",Toast.LENGTH_SHORT).show();


                    }
                }
            });


                }
            }




}