package Session_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sessions.R;

import Session_3.Session3ActivityMain1;

public class Session2ActivityMain5 extends AppCompatActivity {

    private AppCompatButton log;
    private String confText, passText;
    private EditText conf, pass;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session2_activity_main5);

        log = findViewById(R.id.button2);
        passText = "";
        confText = "";

        conf = findViewById(R.id.pass2);
        pass = findViewById(R.id.pass1);
        log.setEnabled(false);

        conf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                confText = conf.getText().toString();
                passText = pass.getText().toString();
                Validation(confText, passText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                confText = conf.getText().toString();
                passText = pass.getText().toString();
                Validation(confText, passText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void Validation(String conf, String pass){
        if (conf.length()!=0 & pass.length() != 0 & pass.equals(conf) == true){
            log.setEnabled(true);
            log.setBackgroundColor(getColor(R.color.blue));
        } else{
            log.setEnabled(false);
            log.setBackgroundColor(getColor(R.color.grey));
        }
    }

    public void onLog_in(View v){
        Intent intent=new Intent(Session2ActivityMain5.this, Session3ActivityMain1.class);
        startActivity(intent);
    }

}