package com.baimurat.kg.greeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView GreeterView;
    private EditText NameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GreeterView = findViewById(R.id.textView);
        NameEditText = findViewById(R.id.editText);
        }

        public void Pressed(View view) {
            if (NameEditText.getText().length() == 0) {
                GreeterView.setText("Cheers from Neobis!");
            } else {

                GreeterView.setText("Welcome  "+ NameEditText.getText());

            }

        }
    }


