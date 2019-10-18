package com.example.gebeya_mood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MoodPromptActivity extends AppCompatActivity {

    //@BindView(R.id.happyMood)
    private ImageButton happyMood;
   // @BindView(R.id.sadMood)
    private ImageButton sadMood;
   // @BindView(R.id.mehMood)
    private ImageButton mehMood;
   // @BindView(R.id.angryMood)
    private ImageButton angryMood;
  //  @BindView(R.id.whateverMood)
    private ImageButton whateverMood;

    private ImageButton coolMood;

    private ImageButton excitedMood;



    Button go, skip;
    ImageButton cancel;
    Dialog why;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_prompt);

        happyMood = findViewById(R.id.happyMood);
        sadMood = findViewById(R.id.sadMood);
        mehMood = findViewById(R.id.mehMood);
        angryMood = findViewById(R.id.disappointedMood);
        whateverMood = findViewById(R.id.whateverMood);
        coolMood = findViewById(R.id.coolMood);
        excitedMood = findViewById(R.id.excitedMood);

        happyMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moodDialogAlert();
            }
        });

        //happyMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Glad you are Happy.", Toast.LENGTH_LONG).show());

        sadMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Sorry you are Sad.", Toast.LENGTH_LONG).show());

        mehMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Oh, you are bord.", Toast.LENGTH_LONG).show());

        angryMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Angry? What's it?", Toast.LENGTH_LONG).show());

        whateverMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Just normal", Toast.LENGTH_LONG).show());

        excitedMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Glad you're excited.", Toast.LENGTH_LONG).show());

        coolMood.setOnClickListener(v -> Toast.makeText(MoodPromptActivity.this, "Wow, you feel cool.", Toast.LENGTH_LONG).show());

    }


    public void moodDialogAlert(){
        why = new Dialog(MoodPromptActivity.this);
        why.setContentView(R.layout.activity_mood_submit);
        why.setTitle("What is it?");

        go = why.findViewById(R.id.goModalButton);
        skip = why.findViewById(R.id.skipModalButton);
        cancel = why.findViewById(R.id.cancelModalButton);

        go.setEnabled(true);
        skip.setEnabled(true);
        cancel.setEnabled(true);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //send to api
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // make a toast & send the emoji to api
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                why.cancel();
            }
        });

        why.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mood_list, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.listIcon:
                Intent intent = new Intent(MoodPromptActivity.this, HomeActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
