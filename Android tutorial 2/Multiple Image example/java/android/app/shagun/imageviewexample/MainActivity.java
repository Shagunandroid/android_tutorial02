package android.app.shagun.imageviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change_image(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        TextView display = (TextView) findViewById(R.id.textView);
        a++;
        if(a == 1) {img.setImageResource(R.drawable.shagun); display.setText("First image");}
        if(a == 2) {img.setImageResource(R.drawable.battery80); display.setText("Second image");}
        if(a == 3) {img.setImageResource(R.drawable.off_power); a = 0; display.setText("Thired image");}
    }
}
