package com.example.gebeya_mood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
            case R.menu.mood_promt_menu:
                Intent intentPrompt = new Intent(HomeActivity.this, MoodPromptActivity.class);
                startActivity(intentPrompt);
                return true;
            case R.menu.my_moods_menu:
                Intent intentMoods = new Intent(HomeActivity.this, MyMoodsActivity.class);
                startActivity(intentMoods);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
