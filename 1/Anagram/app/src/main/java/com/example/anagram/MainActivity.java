package com.example.anagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText_word1;
    private EditText editText_word2;
    private Button submit;
    private Button reset;
    private TextView textView;

    Boolean isAnagram = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_word1 = findViewById(R.id.text1);
        editText_word2 = findViewById(R.id.text2);

        submit = findViewById(R.id.button_submit);
        reset = findViewById(R.id.button_reset);

        textView = findViewById(R.id.textView2);
        textView.setVisibility(View.GONE);






        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                String word1 = editText_word1.getText().toString();
                String word2 = editText_word2.getText().toString();

                if (word1.length() > 0 && word2.length() > 0) {
                    if (word1.length() == word2.length()) {
                        for (int i = 0; i < word1.length(); i++) {
                            if(word2.indexOf(word1.charAt(i)) > -1) {
                                isAnagram = true;
                            } else {
                                isAnagram = false;
                                break;
                            }
                        }
                    } else {
                        isAnagram = false;

                    }

                    if (isAnagram) {
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("ANAGRAM");
                        textView.setTextColor(Color.BLUE);

                    } else {
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("NOT ANAGRAM");
                        textView.setTextColor(Color.RED);
                    }

                } else {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Please enter words!");
                    textView.setTextColor(Color.RED);
                }



            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
                editText_word1.setText("");
                editText_word2.setText("");
            }
        });
    }
}
