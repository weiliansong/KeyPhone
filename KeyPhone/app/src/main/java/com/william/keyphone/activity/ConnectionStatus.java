package com.william.keyphone.activity;
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.util.Config;


/**
 * Created by Edwin on 2/22/2016.
 */
public class ConnectionStatus extends AppCompatPreferenceActivity{
    private boolean connection_status;
    Context mContext;
    private Vibrator v;
    public ConnectionStatus(){}

    public ConnectionStatus(Context mContext){
        v = (Vibrator)mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    private void vibrate(){
        v.vibrate(200);
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
