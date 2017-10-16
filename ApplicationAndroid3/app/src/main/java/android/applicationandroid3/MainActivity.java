package android.applicationandroid3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Button btn;
    // android.widget.EditText psd;
    public static final String EXTRA_MESSAGE = "przykladowa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MyMessage.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        android.widget.TextView UserText = (android.widget.TextView) findViewById(R.id.UserText);
        UserText.setText(message);
    }

    public void click(android.view.View view) {
        switch (view.getId()) {
            case R.id.submitPassword:
                Intent intent = new Intent(MainActivity.this, MyMessage.class);
                startActivity(intent);
                break;
        }
    }

    // Get the Intent that started this activity and extract the string


    // final EditText Password = (EditText) FindViewd
}
