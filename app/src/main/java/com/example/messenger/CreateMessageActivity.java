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
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("Text/Plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent intentChooser = Intent.createChooser(intent,getString(R.string.intent_chooser_send_message));
        startActivity(intentChooser);
    }
}
