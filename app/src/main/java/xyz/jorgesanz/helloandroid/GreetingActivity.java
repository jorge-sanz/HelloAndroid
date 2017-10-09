package xyz.jorgesanz.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    private TextView greetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        greetingText = (TextView) findViewById(R.id.greeting_label);

        Bundle bundle = this.getIntent().getExtras();

        greetingText.setText("Hello, " + bundle.getString("NAME"));
    }
}
