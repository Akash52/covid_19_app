package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
private int positionCounty;
TextView tvCountryname,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent =getIntent();
        positionCounty=intent.getIntExtra("position",0);
        
        getSupportActionBar().setTitle("Detailes of"+AffectedCountries.countryModelList.get(positionCounty).getCountry());
        getSupportActionBar().setDisplayShowCustomEnabled(true);


    tvCountryname=findViewById(R.id.tvCountryname);
        tvCases=findViewById(R.id.tvCases);
        tvRecovered=findViewById(R.id.tvRecovered);
        tvCritical=findViewById(R.id.tvCritical);
        tvActive=findViewById(R.id.tvActive);
        tvTodayCases=findViewById(R.id.tvTodayCases);
        tvTotalDeaths=findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths=findViewById(R.id.tvTodayDeaths);

       tvCountryname.setText(AffectedCountries.countryModelList.get(positionCounty).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCounty).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCounty).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCounty).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCounty).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCounty).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positionCounty).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCounty).getTodayDeaths());

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
