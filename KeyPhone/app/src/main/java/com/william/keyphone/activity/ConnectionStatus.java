package com.william.keyphone.activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Vibrator;


/**
 * Created by Edwin on 2/22/2016.
 */
public class ConnectionStatus {
    Context mContext;
    private Vibrator v;
    public ConnectionStatus(){}

    public ConnectionStatus(Context mcontext){
        mContext = mcontext;
        v = (Vibrator)mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void vibrate(){
        v.vibrate(300);
    }

    public boolean hasWifiEnabled(){
        ConnectivityManager connManager = (ConnectivityManager)mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (mWifi.isConnected()) {
            return true;
        }
        else{
            return false;
        }
    }
}
