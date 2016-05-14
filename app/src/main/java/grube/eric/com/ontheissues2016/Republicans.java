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

public class Republicans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT>=21){
            Fade fadeEnter = new Fade();
            fadeEnter.setDuration(1000);
            getWindow().setEnterTransition(fadeEnter);
        }
        setContentView(R.layout.activity_republicans);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        trump();
        carson();
        fiorina();
        bush();
        rubio();
        paul();
        ted();
        john();
    }

    public void trump(){
        final ImageButton btn = (ImageButton) findViewById(R.id.donaldTrump);
        final Intent donaldIntent = new Intent(Republicans.this, DonaldTrump.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(donaldIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void carson(){
        final ImageButton btn = (ImageButton) findViewById(R.id.benCarson);
        final Intent benIntent = new Intent(Republicans.this, BenCarson.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(benIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void fiorina(){
        final ImageButton btn = (ImageButton) findViewById(R.id.carlyFiorina);
        final Intent carlyIntent = new Intent(Republicans.this, CarlyFiorina.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(carlyIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void bush(){
        final ImageButton btn = (ImageButton) findViewById(R.id.jebBush);
        final Intent jebIntent = new Intent(Republicans.this, JebBush.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(jebIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void rubio(){
        final ImageButton btn = (ImageButton) findViewById(R.id.marcoRubio);
        final Intent marcoIntent = new Intent(Republicans.this, MarcoRubio.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(marcoIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void paul(){
        final ImageButton btn = (ImageButton) findViewById(R.id.randPaul);
        final Intent randIntent = new Intent(Republicans.this, RandPaul.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(randIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void ted(){
        final ImageButton btn = (ImageButton) findViewById(R.id.tedCruz);
        final Intent tedIntent = new Intent(Republicans.this, TedCruz.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(tedIntent, transitionActivityOptions.toBundle());
            }
        });
    }

    public void john(){
        final ImageButton btn = (ImageButton) findViewById(R.id.lvJohn);
        final Intent johnIntent = new Intent(Republicans.this, JohnKasich.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String transitionName = getString(R.string.iconTransition);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(Republicans.this, btn, transitionName);
                startActivity(johnIntent, transitionActivityOptions.toBundle());
            }
        });
    }

}
