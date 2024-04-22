package Session_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sessions.R;

public class Session5ActivityMain3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session5_activity_main3);
    }

    public void Right(View v){
        Intent intent=new Intent(this,Session5ActivityMain2.class);
        startActivity(intent);
    }

    public void Call(View v){
        Intent intent=new Intent(this,Session5ActivityMain4.class);
        startActivity(intent);
    }
}