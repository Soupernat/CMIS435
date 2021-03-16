package com.cmis.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        final Button overview = findViewById(R.id.overviewBtn);
        overview.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          Intent overview = new Intent(Overview.this, Overview.class);

                                          startActivity(overview);
                                      }
                                  }
        );
        final Button logging = findViewById(R.id.loggingBtn);
        logging.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          Intent InputScreen = new Intent(Overview.this, InputScreen.class);

                                          startActivity(InputScreen);
                                      }
                                  }
        );
        final Button calendar = findViewById(R.id.calendarBtn);
        calendar.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          Intent Calendar = new Intent(Overview.this, Calendar.class);

                                          startActivity(Calendar);
                                      }
                                  }
        );

    }
}