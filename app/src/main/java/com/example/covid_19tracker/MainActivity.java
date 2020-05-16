package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class MainActivity extends AppCompatActivity {

    PieChart mpieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpieChart = (PieChart) findViewById(R.id.piechart);

        mpieChart.addPieSlice(new PieModel("Freetime", 15, Color.parseColor("#FE6DA8")));
        mpieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
        mpieChart.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));
        mpieChart.addPieSlice(new PieModel("Eating", 9, Color.parseColor("#FED70E")));

        mpieChart.startAnimation();
    }
}
