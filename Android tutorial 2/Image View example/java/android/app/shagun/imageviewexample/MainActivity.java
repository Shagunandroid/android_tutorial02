package android.app.shagun.imageviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change_image(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.shagun);
    }
}
