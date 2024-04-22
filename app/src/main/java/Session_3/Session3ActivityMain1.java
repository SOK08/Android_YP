package Session_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sessions.R;

import Session_4.Session4ActivityMain1;
import Session_4.Session4ActivityMain2;
import Session_4.Session4ActivityMain3;
import Session_5.Session5ActivityMain1;

public class Session3ActivityMain1 extends AppCompatActivity {
private ImageButton image,image1,image2,image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session3_activity_main1);
        image=findViewById(R.id.imageButton16);
        image1=findViewById(R.id.home);
        image2=findViewById(R.id.walet);
        image3=findViewById(R.id.track);
        image.setImageDrawable(getDrawable(R.drawable.proflect1));
        image1.setImageDrawable(getDrawable(R.drawable.home));
        image2.setImageDrawable(getDrawable(R.drawable.walet));
        image3.setImageDrawable(getDrawable(R.drawable.track));

    }

    public void onNotification_click(View v){
        Intent intent=new Intent(Session3ActivityMain1.this, Session3ActivityMain2.class);
        startActivity(intent);
    }

    public void onCard_click(View v){
        Intent intent=new Intent(Session3ActivityMain1.this, Session4ActivityMain2.class);
        startActivity(intent);
    }
    public void Home(View v){
        Intent intent = new Intent(this, Session5ActivityMain1.class);
        startActivity(intent);
    }
    public void Walet(View v){
        Intent intent = new Intent(this, Session4ActivityMain1.class);
        startActivity(intent);
    }
    public void Track(View v){
        Intent intent = new Intent(this, Session4ActivityMain3.class);
        startActivity(intent);
    }
}