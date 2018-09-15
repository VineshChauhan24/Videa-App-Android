package sokko.com.br.videaapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ed2 = findViewById(R.id.loginText2);
        ed1 = findViewById(R.id.loginText);
        btn = findViewById(R.id.btnLogin);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

   public void onClick(View view){
       startActivity(new Intent("sokko.com.br.videaapp.HomeActivity"));
   }

}
