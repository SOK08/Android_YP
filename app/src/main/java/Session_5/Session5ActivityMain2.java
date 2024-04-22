package Session_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sessions.R;

public class Session5ActivityMain2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session5_activity_main2);
    }
    public void Right(View v){
        Intent intent = new Intent(this, Session5ActivityMain1.class);
        startActivity(intent);
    }
    public void Chinonso(View v){
        Intent intent = new Intent(this, Session5ActivityMain3.class);
        startActivity(intent);
    }

}