package com.example.a60029513.myapplication.util;

import com.example.a60029513.myapplication.BuildConfig;

/**
 * Created by 60029513 on 2017-09-16.
 * 작성자
 * 작성일자
 * 작성목적 : 싱글톤클래스이고, 유틸리티 기능을 모두 총괄한다.
 * 여기서는 앱이 구동중인지 체크하는 개체를 담는 그릇의 용도로 사용
 *
 */

public class u {
    private static final u ourInstance = new u();
    static u getInstance() {
        return ourInstance;
    }
    private u() {
    }

    public static u getOurInstance() {
        return ourInstance;
    }

    //
    public void log(String tag, String msg) {
        //디버그 모드일때만 노출된다.
        if(BuildConfig.DEBUG)
            Log.i(""+tag, ""+msg)




    }
//
protected void onCreate(




}
