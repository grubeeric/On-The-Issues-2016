package grube.eric.com.ontheissues2016;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageButton;

public class Democrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT>=21){
            Fade fade = new Fade();
            fade.setDuration(1000);
            getWindow().setEnterTransition(fade);
        }

        setContentView(R.layout.activity_democrats);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        clinton();
        bernie();
        biden();
        omalley();
        chafee();
        webb();
    }


    public void clinton(){
        final ImageButton btn = (ImageButton) findViewById(R.id.hillaryClinton);
        final Intent hillaryIntent = new Intent(Democrats.this, HillaryClinton.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(hillaryIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void bernie(){
        final ImageButton btn = (ImageButton) findViewById(R.id.bernieSanders);
        final Intent bernieIntent = new Intent(Democrats.this, BernieSanders.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(bernieIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void biden(){
        final ImageButton btn = (ImageButton) findViewById(R.id.joeBiden);
        final Intent joeIntent = new Intent(Democrats.this, JoeBiden.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(joeIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void omalley(){
        final ImageButton btn = (ImageButton) findViewById(R.id.martinOmalley);
        final Intent martinIntent = new Intent(Democrats.this, MartinOmalley.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(martinIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void chafee(){
        final ImageButton btn = (ImageButton) findViewById(R.id.lincolnChafee);
        final Intent lincolnIntent = new Intent(Democrats.this, LincolnChafee.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(lincolnIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void webb(){
        final ImageButton btn = (ImageButton) findViewById(R.id.jimWebb);
        final Intent jimIntent = new Intent(Democrats.this, JimWebb.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Democrats.this, btn, transitionName);
                startActivity(jimIntent, transitionActivityOptions.toBundle());
            }
        });
    }
}
