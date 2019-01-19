package jaypal.admin.imageswitcher;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.AnimRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    ImageSwitcher imageSwitcher;
    final Context context = this;
    Button nextbtn,dialogButtonOk;
    int imageArray[]={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
    int cout=imageArray.length;
    ImageView imageView;
    int i=-1;
    Dialog dialog;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.imageSwitcher);
        nextbtn=(Button)findViewById(R.id.nextbtn);
        dialogButtonOk=(Button)findViewById(R.id.dialogButtonOK);
       final Dialog dialog = new Dialog(context);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
                return imageView;
            }
        });
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                i++;
                if (i==cout)
                    i=0;

                    imageSwitcher.setImageResource(imageArray[i]);





            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_cutom_alrt);
                Toast.makeText(MainActivity.this,"your selection..!!",Toast.LENGTH_LONG).show();


            }
        });
        dialog.show();


    }
}
