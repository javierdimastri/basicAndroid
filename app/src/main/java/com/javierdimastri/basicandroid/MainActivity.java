package com.javierdimastri.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        EditText editText = findViewById(R.id.editText);
        Button editButton = findViewById(R.id.editButton);
        TextView textView = findViewById(R.id.additionalTextView);

        textView.setText("Hello");

        editButton.setOnClickListener(view -> {
            String name = editText.getText().toString();
            textView.setText(String.format("Hello %s", name));
        });
    }
}