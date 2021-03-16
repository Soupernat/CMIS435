package com.cmis.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Button overview = findViewById(R.id.overviewBtn);
        overview.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent overview = new Intent(Calendar.this, Overview.class);

                                            startActivity(overview);
                                        }
                                    }
        );
        final Button logging = findViewById(R.id.loggingBtn);
        logging.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           Intent InputScreen = new Intent(Calendar.this, InputScreen.class);

                                           startActivity(InputScreen);
                                       }
                                   }
        );
        final Button calendar = findViewById(R.id.calendarBtn);
        calendar.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent Calendar = new Intent(Calendar.this, Calendar.class);

                                            startActivity(Calendar);
                                        }
                                    }
        );
    }
}