package jolabs.peekaboo;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image=null;
//    Drawable drawable=null;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        image=(ImageView)findViewById(R.id.img);
        image.setImageResource(R.drawable.oliche);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set();

            }
        });

    }

    public void set()
    {
        if(flag==0)
        {image.setImageResource(R.drawable.kande);
        }
        else
        {   image.setImageResource(R.drawable.oliche);
        }
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {flag=1;
                set();}
                else
                {  flag=0;
                set();}

            }
        });

    }
}
