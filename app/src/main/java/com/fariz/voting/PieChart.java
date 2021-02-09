package com.fariz.voting;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        com.github.mikephil.charting.charts.PieChart pieChart = findViewById(R.id.piechart);
        ArrayList<PieEntry> Suara = new ArrayList<>();
        Suara.add(new PieEntry(68, "Puas"));
        Suara.add(new PieEntry(24, "Kurang Puas"));
        Suara.add(new PieEntry(8, "Tidak Puas"));

        PieDataSet pieDataSet = new PieDataSet(Suara, " | Voting Dari Keseluruhan Pemilih");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(14f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Pemilih");
        pieChart.animate();

    }
}