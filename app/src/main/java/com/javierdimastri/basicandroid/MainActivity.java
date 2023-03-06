package com.javierdimastri.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button editButton;
    private TextView textView;

    private void loadView () {
        editText = findViewById(R.id.editText);
        editButton = findViewById(R.id.editButton);
        textView = findViewById(R.id.additionalTextView);
    }

    private void initialDefaultValue() {
        loadView();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        initialDefaultValue();


        textView.setText(
                getResources().getString(R.string.app_name)
        );

        editButton.setOnClickListener(view -> {
            String name = editText.getText().toString();
            textView.setText(getResources().getString(R.string.say_hello_text, name));

            Arrays.stream(getResources().getStringArray(R.array.string_array)).forEach(
                   x -> Log.i("BA", x)
            );

            if(name.isEmpty()){
                Log.e("BA", String.format("Error Hello %s clicked", name));
            }
            else {
                Log.d("BA", String.format("Debug Hello %s clicked", name));
                Log.i("BA", String.format("Info Hello %s clicked", name));
                Log.w("BA", String.format("Warning Hello %s clicked", name));
            }
        });
    }
}