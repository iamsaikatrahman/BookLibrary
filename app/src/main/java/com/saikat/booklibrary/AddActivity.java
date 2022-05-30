package com.saikat.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText bookInput, authorInput, pagesInput;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        bookInput = findViewById(R.id.book_input);
        authorInput = findViewById(R.id.author_input);
        pagesInput = findViewById(R.id.page_input);
        addButton = findViewById(R.id.add_btn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(
                        bookInput.getText().toString().trim(),
                        authorInput.getText().toString().trim(),
                        Integer.valueOf(pagesInput.getText().toString().trim())
                        );
            }
        });
    }
}