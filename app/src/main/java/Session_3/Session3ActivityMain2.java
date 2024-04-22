package Session_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sessions.R;

public class Session3ActivityMain2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session3_activity_main2);
    }
    public void Right(View v){
        Intent intent = new Intent(this, Session3ActivityMain1.class);
        startActivity(intent);
    }
}