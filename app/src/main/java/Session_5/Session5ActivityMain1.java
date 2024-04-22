package Session_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sessions.R;

import Session_3.Session3ActivityMain1;
import Session_3.Session3ActivityMain3;
import Session_4.Session4ActivityMain1;
import Session_4.Session4ActivityMain3;

public class Session5ActivityMain1 extends AppCompatActivity {
    private ImageButton image,image1,image2,image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.session5_activity_main1);
        ImageView img = (ImageView) findViewById(R.id.imageView21);
        ImageView img1 = findViewById(R.id.imageView26);
        img1.setImageDrawable(getDrawable(R.drawable.find_your_wallet_imag));
        img.setImageDrawable(getDrawable(R.drawable.customer_imag));
        image=findViewById(R.id.imageButton16);
        image1=findViewById(R.id.home);
        image2=findViewById(R.id.walet);
        image3=findViewById(R.id.track);
        image.setImageDrawable(getDrawable(R.drawable.proflect));
        image1.setImageDrawable(getDrawable(R.drawable.home1));
        image2.setImageDrawable(getDrawable(R.drawable.walet));
        image3.setImageDrawable(getDrawable(R.drawable.track));


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageDrawable(getDrawable(R.drawable.customer));
                img1.setImageDrawable(getDrawable(R.drawable.find_your_wallet_imag));
            }
        });


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageDrawable(getDrawable(R.drawable.customer_walet));
                img.setImageDrawable(getDrawable(R.drawable.customer_imag));
            }
        });
    }





    public void Profile(View v){
        Intent intent = new Intent(this, Session3ActivityMain1.class);
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
    public void Chat(View v){
        Intent intent = new Intent(this, Session5ActivityMain2.class);
        startActivity(intent);
    }
    public void onStatement_click(View v){
        Intent intent=new Intent(this, Session3ActivityMain3.class);
        startActivity(intent);
    }
}