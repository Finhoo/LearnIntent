package cn.fayne.project.learnintent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by fan on 2017/10/6.
 */

public class MyAty extends Activity{

    public static String ACTION = "cn.fayne.project.learnintent.MyAty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaty);
    }
}
