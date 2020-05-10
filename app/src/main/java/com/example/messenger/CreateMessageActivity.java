package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    TextView textViewPutMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        textViewPutMsg = findViewById(R.id.putTextMessage);
    }

    public void sendMessage(View view) {
        String msg = textViewPutMsg.getText().toString();
        Intent intent = new Intent(this, ReceivedMessageActivity.class);
        intent.putExtra("msg", msg);
        startActivity(intent);
    }
}
