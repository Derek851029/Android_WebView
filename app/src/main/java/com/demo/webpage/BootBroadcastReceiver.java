package com.demo.webpage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver {

    /**
     * demo2: 可以實現開機自動開啟軟體並執行。
     */
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("XRGPS", "BootReceiver.onReceive: " + intent.getAction());
        System.out.println("自啟動程式即將執行");
        //MainActivity就是開機顯示的介面
        Intent mBootIntent = new Intent(context, MainActivity.class);
        //下面這句話必須加上才能開機自動執行app的介面
        mBootIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mBootIntent);

    }
}
