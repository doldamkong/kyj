package com.example.a60029513.myapplication.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.a60029513.myapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //푸시를 통해 알람을 눌러서 진입했을 경우
        //액티비티로 보낸 데이터 추출

        getIntent().getStringExtra("push");

        //xml로 만들어진 View를 자바코드에서 참조하기위해
        //가져오는 코드 => 데이터바인딩
/*        TextView

        pushMsg



    Intent intent = new intent(MainActivity.this, WebMainActivity.class) ;
        if(pushMsg != null)
            intent.putExtra("push",pushMsg);
        startActivity(intent);*/
    }


    public void fetchWelcom()
    {
        long cacheExpiration = 3600; // 1 hour in seconds.
  //      if (mFirebaseRemoteConfig.getInf().getConfigSetting().isDevloper)



    }

    //String welcomeMessage








}
/*
push_server_key=mFirebaseRemoteConfig.getString("PUSH_SERVER_KEY");
SHIN_MAIN_URL=mFirebaseRemoteConfig.getString("SHIN_MAIN_URL");
handler.sendEmptyMessageDelayed(0,1000*1);
        } else {

        }
*/