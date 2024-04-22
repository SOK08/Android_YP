package Session_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sessions.R;

import Session_3.Session3ActivityMain1;

public class Session2ActivityMain2 extends AppCompatActivity {

    private String emailText, passText;
    private EditText email, pass;
    private AppCompatButton log;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session2_activity_main2);

        log = findViewById(R.id.button200);
        passText = "";
        emailText = "";

        email = findViewById(R.id.editTextTextEmailAddress2);
        pass = findViewById(R.id.pass1);
        log.setEnabled(false);


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();

                    Intent intent = new Intent(Session2ActivityMain2.this, Session3ActivityMain1.class);
                    startActivity(intent);
                }


        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                if(emailText.length() != 0 & passText.length() != 0 & Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
                    log.setEnabled(true);
                    log.setBackgroundColor(getColor(R.color.blue));
                } else {
                    log.setEnabled(false);
                    log.setBackgroundColor(getColor(R.color.grey));
                }
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
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                if(emailText.length() != 0 & passText.length() != 0 & Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
                    log.setEnabled(true);
                    log.setBackgroundColor(getColor(R.color.blue));
                } else {
                    log.setEnabled(false);
                    log.setBackgroundColor(getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void onSign_up(View v){
        Intent intent=new Intent(Session2ActivityMain2.this,Session2ActivityMain.class);
        startActivity(intent);
    }

    public void onForgot_pass(View v){
        Intent intent=new Intent(Session2ActivityMain2.this,Session2ActivityMain3.class);
        startActivity(intent);
    }
}