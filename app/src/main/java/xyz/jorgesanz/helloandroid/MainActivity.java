package xyz.jorgesanz.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.name_input);
    }

    public void sayHello(View view) {
        Intent intent = new Intent(MainActivity.this, GreetingActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("NAME", nameInput.getText().toString());

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
