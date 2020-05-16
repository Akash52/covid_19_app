package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class MainActivity extends AppCompatActivity {
    TextView tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths,tvAffectedCountries;
    SimpleArcLoader simpleArcLoader;
    ScrollView scrollView;

    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCases =findViewById(R.id.tvCases);
        tvRecovered=findViewById(R.id.tvRecovered);
        tvCritical=findViewById(R.id.tvCritical);
        tvActive=findViewById(R.id.tvActive);
        tvTodayCases=findViewById(R.id.tvTodayCases);
        tvTotalDeaths=findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths=findViewById(R.id.tvTodayDeaths);
        tvAffectedCountries=findViewById(R.id.tvAffectedCountries);

        simpleArcLoader=findViewById(R.id.loader);
        scrollView=findViewById(R.id.scrollStats);








        pieChart = (PieChart) findViewById(R.id.piechart);



        pieChart.addPieSlice(new PieModel("Freetime", 15, Color.parseColor("#FE6DA8")));
        pieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
        pieChart.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));
        pieChart.addPieSlice(new PieModel("Eating", 9, Color.parseColor("#FED70E")));

        pieChart.startAnimation();
        fetchData();
    }

    private void fetchData() {
        String url="https://corona.lmao.ninja/v2/all/";
        simpleArcLoader.start();
        StringRequest request= new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });


    }

}
