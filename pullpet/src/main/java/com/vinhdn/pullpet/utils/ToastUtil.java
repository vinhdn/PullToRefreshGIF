package com.vinhdn.pullpet.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void show(Context appContext, String msg){
        Toast.makeText(appContext, msg, Toast.LENGTH_SHORT).show();
    }
}
