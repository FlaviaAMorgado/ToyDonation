package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import java.util.Random;

public class Missao extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    Sensor sensor;

    ImageView imgToys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missao);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE); // Acessando o sensores!
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // pegando sensor de acaelerometro
        imgToys = findViewById(R.id.imgToys);
        //Resposta de sensor
        sensorManager.registerListener(Missao.this, sensor, sensorManager.SENSOR_DELAY_NORMAL);


    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        if (x > 18) {
            img_Random(); // função que troca a img
        }
    }

    private void img_Random() {
        int[] toys = new int[]{
                R.drawable.bala,
                R.drawable.batata,
                R.drawable.buzz,
                R.drawable.jessie,
                R.drawable.rex,
                R.drawable.slinky,
                R.drawable.woody


        };
        Random random = new Random();
        int random_toys = random.nextInt(toys.length); // gerando num aleatorios para as imgs, next int é para aredondar os num
        imgToys.setImageResource(toys[random_toys]);


    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}