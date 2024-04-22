package Session_3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sessions.R;

import Session_5.Session5ActivityMain1;

public class Session3ActivityMain3 extends AppCompatActivity {
private AppCompatButton next;
private EditText OriginAddress, OriginState, OriginPhone,DestAdress,
        DestState,DestPhone,PackPackage,PackWeight,PackWorth;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.session3_activity_main3);
        next=findViewById(R.id.button3);
        next.setBackgroundColor(getColor(R.color.grey));

        OriginAddress=findViewById(R.id.editTextTextPostalAddress);
        OriginState=findViewById(R.id.editTextTextPostalAddress2);
        OriginPhone=findViewById(R.id.editTextPhone2);
        DestAdress=findViewById(R.id.editTextTextPostalAddress1);
        DestState=findViewById(R.id.editTextTextPostalAddress21);
        DestPhone=findViewById(R.id.editTextPhone21);
        PackPackage=findViewById(R.id.editTextTextPostalAddress22);
        PackWeight=findViewById(R.id.Weight);
        PackWorth=findViewById(R.id.Worth);


        LinearLayout shed = findViewById(R.id.shed);
        LinearLayout ins = findViewById(R.id.ins);
        TextView textclock = findViewById(R.id.textclock);
        TextView textcalend = findViewById(R.id.textcalend);
        ImageView clock = findViewById(R.id.clock);
        ImageView calend = findViewById(R.id.calend);
        next.setEnabled(false);
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ins.setBackground(getDrawable(R.drawable.bluekr));
                shed.setBackground(getDrawable(R.drawable.radius_sqvare));
                textclock.setTextColor(getColor(R.color.white));
                textcalend.setTextColor(getColor(R.color.grey));
                clock.setImageDrawable(getDrawable(R.drawable.clock));
                calend.setImageDrawable(getDrawable(R.drawable.calend));
            }
        });

        shed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shed.setBackground(getDrawable(R.drawable.bluekr));
                ins.setBackground(getDrawable(R.drawable.radius_sqvare));
                textclock.setTextColor(getColor(R.color.grey));
                textcalend.setTextColor(getColor(R.color.white));
                clock.setImageDrawable(getDrawable(R.drawable.clockgr));
                calend.setImageDrawable(getDrawable(R.drawable.calendwhite));
            }
        });
        addTextWatcherToEditText(OriginState);
        addTextWatcherToEditText(OriginAddress);
        addTextWatcherToEditText(OriginPhone);
        addTextWatcherToEditText(DestState);
        addTextWatcherToEditText(DestAdress);
        addTextWatcherToEditText(DestPhone);
        addTextWatcherToEditText(PackPackage);
        addTextWatcherToEditText(PackWeight);
        addTextWatcherToEditText(PackWorth);
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
                boolean allFieldsFilled = !OriginState.getText().toString().isEmpty() &&
                        !OriginAddress.getText().toString().isEmpty() &&
                        !OriginPhone.getText().toString().isEmpty() &&
                        !DestAdress.getText().toString().isEmpty() &&
                        !DestPhone.getText().toString().isEmpty() &&
                        !DestState.getText().toString().isEmpty()&&
                        !PackPackage.getText().toString().isEmpty() &&
                        !PackWeight.getText().toString().isEmpty() &&
                        !PackWorth.getText().toString().isEmpty();


                // Обновляем состояние кнопки
                next.setEnabled(allFieldsFilled);
                if(allFieldsFilled==true) {
                    next.setBackgroundColor(getColor(R.color.blue));
                }else {
                    next.setBackgroundColor(getColor(R.color.grey));
                }
            }
        });
    }


    public void Next(View v){
        EditText address = findViewById(R.id.editTextTextPostalAddress);
        EditText town = findViewById(R.id.editTextTextPostalAddress2);
        EditText phoneinfo = findViewById(R.id.editTextPhone2);

        EditText addresspoint1 = findViewById(R.id.editTextTextPostalAddress1);
        EditText townpoint1 = findViewById(R.id.editTextTextPostalAddress21);
        EditText phoneinfopoint1 = findViewById(R.id.editTextPhone21);

        EditText items = findViewById(R.id.editTextTextPostalAddress22);
        EditText weightit = findViewById(R.id.Weight);
        EditText worthit = findViewById(R.id.Worth);

        Intent intent = new Intent(this, Session3ActivityMain4.class);
        String placetext = address.getText().toString() +" " + town.getText().toString();
        String placetracktext = addresspoint1.getText().toString() +" " + townpoint1.getText().toString();
        intent.putExtra("place", placetext);
        intent.putExtra("phon", phoneinfo.getText().toString());
        intent.putExtra("placetrakc", placetracktext);
        intent.putExtra("phonetrack", phoneinfopoint1.getText().toString());
        intent.putExtra("item", items.getText().toString());
        intent.putExtra("weight", weightit.getText().toString());
        intent.putExtra("worth", worthit.getText().toString());

        startActivity(intent);
    }

    public void Right(View v){
        Intent intent = new Intent(this, Session5ActivityMain1.class);
        startActivity(intent);
    }
}