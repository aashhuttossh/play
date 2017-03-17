package com.store.ats.play;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static MediaPlayer mp=new MediaPlayer();
    static Button b;
    static TextView t;
    //File descriptor value
    int ress[]={R.raw.a1,R.raw.a1s,R.raw.b1,R.raw.c1,R.raw.c1s,R.raw.c2,R.raw.d1,R.raw.d1s,R.raw.e1,R.raw.f1,R.raw.f1s,R.raw.g1,R.raw.g1s};
   //data to be matched
    String r[]={"A1","A1s","B1","C1","C1s","C2","D1","D1s","E1","F1","F1s","G1","G1s"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.t1);
        b=(Button)findViewById(R.id.b1);
    }

    public void play(View view)throws Exception {
        String s;
        s = t.getText().toString();
        String s1[] = s.split(" ");
          for(int i=0;i<s1.length;i++) {
            for (int j = 0; j < 13; j++) {
                  if(s1[i].equals(r[j]))
                  {
                      sync(ress[j]);
                  }
                else if(s1[i].equals("."))
                  {
                      Thread.sleep(20);
                  }
                                           }
                                        }
                                                }
    void sync(int val)throws Exception
    {
        mp = MediaPlayer.create(this, val);
        mp.start();
        Thread.sleep(200);
        mp.release();
    }
}