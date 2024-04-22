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

public class Session2ActivityMain3 extends AppCompatActivity {

    private AppCompatButton send;
    private String emailText;
    private EditText email;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session2_activity_main3);

        send = findViewById(R.id.button2);
        send.setEnabled(false);

        emailText = "";
        email = findViewById(R.id.editTextTextEmailAddress2);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                validateMail(emailText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void validateMail(String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            send.setEnabled(true);
            send.setBackgroundColor(getColor(R.color.blue));
        }
        else{
            send.setEnabled(false);
            send.setBackgroundColor(getColor(R.color.grey));
        }
    }
    public void onOTP(View v){
        Intent intent=new Intent(this,Session2ActivityMain4.class);
        startActivity(intent);
    }

}