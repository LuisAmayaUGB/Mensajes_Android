package com.example.mensajesandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Date;
    TextView date;
    DatePickerDialog datePicker;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputFecha = (EditText) findViewById(R.id.input_fecha);
        inputFecha.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.input_fecha:
                //Mostrar el datePicker
                showDatePickerDialog((EditText) v);
                break;
        }


    }


    public void showDatePickerDialog(EditText v) {
        // Para crear una instancia de nuestro datePicker
        // pasándole el EditText debemos usar el método
        // estático que definimos como "newInstance"
        // en lugar de usar el constructor por defecto
        DialogFragment newFragment = DatePickerFragment.newInstance(v);
        // Mostrar el datePicker
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }



}