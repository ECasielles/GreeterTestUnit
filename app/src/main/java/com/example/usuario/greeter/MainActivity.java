package com.example.usuario.greeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtGreeter;
    private TextView txvGreeter;
    private TextView btnGreeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtGreeter = (EditText) findViewById(R.id.greetEditText);
        txvGreeter = (TextView) findViewById(R.id.messageTextView);
        btnGreeter = (TextView) findViewById(R.id.greetButton);
        btnGreeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = String.format("Hello, %s!", edtGreeter.getText().toString());
                txvGreeter.setText(message);
            }
        });
    }

}
