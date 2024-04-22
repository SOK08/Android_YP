package Session_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sessions.R;

import Session_3.Session3ActivityMain1;

public class Session2ActivityMain extends AppCompatActivity {
    private AppCompatButton login;
    private CheckBox terms;
    private String fioText, phoneText, emailText, passText, confText;
    private EditText email, fio, phone, pass, conf;
   // private FirebaseAuth mAuth;
   // private FirebaseUser user;

    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session2_activity_main1);

        login = findViewById(R.id.button);
        fioText = "";
        phoneText = "";
        emailText = "";
        passText = "";
        confText = "";

        email = findViewById(R.id.editTextTextEmailAddress);
        fio = findViewById(R.id.editTextText);
        phone = findViewById(R.id.editTextPhone);
        pass = findViewById(R.id.pass);
        conf = findViewById(R.id.pass1);
        terms = findViewById(R.id.checkBox);
       // mAuth = FirebaseAuth.getInstance();

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                Validation(emailText, terms);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        terms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                emailText = email.getText().toString();
                Validation(emailText, terms);
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fioText = fio.getText().toString();
                phoneText = phone.getText().toString();
                passText = pass.getText().toString();
                confText = conf.getText().toString();
                emailText = email.getText().toString();




                if(fioText.length() != 0 & Patterns.PHONE.matcher(phoneText).matches() & passText.length() != 0 & confText.length() != 0 & passText.equals(confText) == true){
                        Intent intent = new Intent(Session2ActivityMain.this, Session3ActivityMain1.class);
                        startActivity(intent);
                }
                if(fioText.length() == 0) {
                    fio.setBackground(getDrawable(R.drawable.obvodka_red));
                } else {
                    fio.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(Patterns.PHONE.matcher(phoneText).matches()) {
                    phone.setBackground(getDrawable(R.drawable.obvodka));
                } else {
                    phone.setBackground(getDrawable(R.drawable.obvodka_red));
                }
                if(passText.length() == 0 || passText.equals(confText) == false) {
                    pass.setBackground(getDrawable(R.drawable.obvodka_red));
                } else {
                    pass.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(confText.length() == 0 || passText.equals(confText) == false) {
                    conf.setBackground(getDrawable(R.drawable.obvodka_red));
                } else {
                    conf.setBackground(getDrawable(R.drawable.obvodka));
                }
            }
        });

}

    public void Validation(String email, CheckBox view){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches() & view.isChecked() == true){
            login.setEnabled(true);
            login.setBackgroundColor(getColor(R.color.blue));
        } else{
            login.setEnabled(false);
            login.setBackgroundColor(getColor(R.color.grey));
        }
    }


    public void onSign_in(View v){
        Intent intent=new Intent(Session2ActivityMain.this,Session2ActivityMain2.class);
        startActivity(intent);
    }

}