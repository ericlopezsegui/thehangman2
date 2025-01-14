package cat.udl.gtidic.course2223.teacher.thehangman.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import cat.udl.gtidic.course2223.teacher.thehangman.R;

public class EndGameActivity extends AppCompatActivity {
    private boolean gameWin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        TextView tv = findViewById(R.id.tvEndGame);
        Intent i = getIntent();
        gameWin = i.getBooleanExtra("gameWin", false);

        if (gameWin){
            tv.setText("Has guanyat!");
        } else {
            tv.setText("Has perdut!");
        }

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(EndGameActivity.this, InitActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }
}