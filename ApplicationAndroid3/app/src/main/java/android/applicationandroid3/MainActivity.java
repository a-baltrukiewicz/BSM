package android.applicationandroid3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Button btn;
    // android.widget.EditText psd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(android.view.View view) {
        switch (view.getId()) {
            case R.id.submitPassword:
                Intent intent = new Intent(MainActivity.this, MyMessage.class);
                startActivity(intent);
                break;
        }
    }

   // final EditText Password = (EditText) FindViewd
}
