package com.experiment_5.app1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.Toast;

public class UseCount extends Activity {
    SharedPreferences preferences;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        preferences = getSharedPreferences("count", Context.MODE_PRIVATE);
        //读取SharedPreferences里的count数据
        int count =preferences.getInt("count",0);
        //显示程序以前使用的次数
        Toast.makeText(this , "程序以前被使用了" + count + "次", Toast.LENGTH_SHORT).show();
        SharedPreferences.Editor editor = preferences.edit();
        //存入数据
        editor.putInt("count" , ++count);
        //提交修改
        editor.commit();
    }
}