package sokko.com.br.videaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ed2 = findViewById(R.id.loginText2);
        ed1 = findViewById(R.id.loginText);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
