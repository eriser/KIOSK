package com.tale.homeit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Author tale. Created on 6/15/15.
 */
public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final Intent mainActivityIntent = new Intent(context, MainActivity.class);
        mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mainActivityIntent);
    }

}
