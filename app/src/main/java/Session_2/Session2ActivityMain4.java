package Session_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sessions.R;

public class Session2ActivityMain4 extends AppCompatActivity {
    private AppCompatButton set;

    private EditText one, two, three, four, five, six;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session2_activity_main4);

        set = findViewById(R.id.button2);

        one = findViewById(R.id.editTextNumberPassword);

        two = findViewById(R.id.editTextNumberPassword2);

        three = findViewById(R.id.editTextNumberPassword3);

        four = findViewById(R.id.editTextNumberPassword4);

        five = findViewById(R.id.editTextNumberPassword5);

        six = findViewById(R.id.editTextNumberPassword6);

        set.setEnabled(false);

        final int[] time = {60};
        TextView timer = (TextView) findViewById(R.id.textView26) ;

        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("seconds remaining: " + time[0]);
                time[0]--;
                // logic to set the EditText could go here
            }

            public void onFinish() {
                timer.setText("resend");
                timer.setTextColor(getColor(R.color.blue));
            }

        }.start();



        one.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(one.length() == 1){
                    two.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        two.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(two.length() == 1){
                    three.requestFocus();
                }
                if(two.length() == 0){
                    one.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        three.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(three.length() == 1){
                    four.requestFocus();
                }
                if(three.length() == 0){
                    two.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        four.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(four.length() == 1){
                    five.requestFocus();
                }
                if(four.length() == 0){
                    three.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        five.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(five.length() == 1){
                    six.requestFocus();
                }
                if(five.length() == 0){
                    four.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        six.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(six.length() == 0){
                    five.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }





        });
        addTextWatcherToEditText(one);
        addTextWatcherToEditText(two);
        addTextWatcherToEditText(three);
        addTextWatcherToEditText(four);
        addTextWatcherToEditText(five);
        addTextWatcherToEditText(six);


    }
    private void addTextWatcherToEditText(EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Проверяем, все ли поля заполнены
                boolean allFieldsFilled = !one.getText().toString().isEmpty() &&
                        !two.getText().toString().isEmpty() &&
                        !three.getText().toString().isEmpty() &&
                        !four.getText().toString().isEmpty() &&
                        !five.getText().toString().isEmpty() &&
                        !six.getText().toString().isEmpty();
                System.out.println(allFieldsFilled);

                boolean oneFilled= !one.getText().toString().isEmpty();
                boolean twoFilled= !two.getText().toString().isEmpty();
                boolean threeFilled= !three.getText().toString().isEmpty();
                boolean fourFilled= !four.getText().toString().isEmpty();
                boolean fiveFilled= !five.getText().toString().isEmpty();
                boolean sixFilled= !six.getText().toString().isEmpty();

                // Обновляем состояние кнопки
                set.setEnabled(allFieldsFilled);
                if(allFieldsFilled==true) {
                    set.setBackgroundColor(getColor(R.color.blue));
                }else {
                    set.setBackgroundColor(getColor(R.color.grey));
                }
                if(oneFilled==true){
                    one.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    one.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(twoFilled==true){
                    two.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    two.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(threeFilled==true){
                    three.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    three.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(fourFilled==true){
                    four.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    four.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(fiveFilled==true){
                    five.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    five.setBackground(getDrawable(R.drawable.obvodka));
                }
                if(sixFilled==true){
                    six.setBackground(getDrawable(R.drawable.obvodka_blue));
                }else{
                    six.setBackground(getDrawable(R.drawable.obvodka));
                }
                }
        });
    }
    public void onNew_pass(View v){
        Intent intent=new Intent(this,Session2ActivityMain5.class);
        startActivity(intent);
    }
}