package edu.miracostacollege.cs134.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView lightsImageView;
    private AnimationDrawable framAnim;
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsImageView = findViewById(R.id.lightsImageView);
    }

    public void toggleFramAnim(View v)
    {
        if(framAnim == null) {
            lightsImageView.setBackgroundResource(R.drawable.frame_animation);
            framAnim = (AnimationDrawable) lightsImageView.getBackground();
        }

        //if animation is running stop it
        if( framAnim.isRunning())
        {
            framAnim.stop();
        }

        //else start it
        else
        framAnim.start();
    }

    public void toggleRotateAmin(View v)
    {
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);

        lightsImageView.startAnimation(rotateAnim);
    }

    public void toggleShakeAmin(View v)
    {
        shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);

        lightsImageView.startAnimation(shakeAnim);
    }

    public void toggleCustomeAmin(View v)
    {

    }
}
