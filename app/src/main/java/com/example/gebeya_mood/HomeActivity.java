package com.example.gebeya_mood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RecyclerView moodRecyclerView;
    MoodsReportAdapter moodsReportAdapter;
    List<MoodReportItemModel> moodReportItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        moodRecyclerView = findViewById(R.id.homeRecyclerView);
        moodReportItems = new ArrayList<>();

        moodReportItems.add(new MoodReportItemModel("Managers Team", "Tired", "4", "5", "Oct 18, 2019",R.drawable.ic_emoticon_confused));
        moodReportItems.add(new MoodReportItemModel("Android Developers", "Cool", "6", "7", "Oct 18, 2019",R.drawable.ic_emoticon_cool));
        moodReportItems.add(new MoodReportItemModel("Trainers Team", "Normal", "5", "9", "Oct 18, 2019",R.drawable.ic_emoticon_neutral));
        moodReportItems.add(new MoodReportItemModel("Human Resource", "Unhappy", "2", "3", "Oct 18, 2019",R.drawable.ic_emoticon_sad));
        moodReportItems.add(new MoodReportItemModel("Back-End Developers", "Excited", "9", "11", "Oct 18, 2019",R.drawable.ic_emoticon_excited));
        moodReportItems.add(new MoodReportItemModel("Front-End Developers", "Well!", "3", "4", "Oct 18, 2019",R.drawable.ic_emoticon_happy));
        moodReportItems.add(new MoodReportItemModel("Consultants Team", "Cool", "3", "4", "Oct 18, 2019",R.drawable.ic_emoticon_cool));


        moodsReportAdapter = new MoodsReportAdapter(this, moodReportItems);
        moodRecyclerView.setAdapter(moodsReportAdapter);
        moodRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mood_promt_menu, menu);
        getMenuInflater().inflate(R.menu.my_moods_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.moodsPromptIcon:
                Intent intentPrompt = new Intent(HomeActivity.this, MoodPromptActivity.class);
                startActivity(intentPrompt);
                return true;
            case R.id.my_mood_history:
                Intent intentMoods = new Intent(HomeActivity.this, MyMoodsActivity.class);
                startActivity(intentMoods);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
