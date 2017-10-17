package com.blackphoenix.praba.androidcustomwidgets;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Praba on 10/17/2017.
 */
public class ZToast {

    public static void show(Context context, String message){
        Toast.makeText(context,"Toast: "+message,Toast.LENGTH_SHORT).show();
    }

    public static void showShort(Context context, String message){
        Toast.makeText(context,"Toast: "+message,Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, String message){
        Toast.makeText(context,"Toast: "+message,Toast.LENGTH_LONG).show();
    }
}
