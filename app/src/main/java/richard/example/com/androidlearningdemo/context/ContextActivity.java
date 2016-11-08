package richard.example.com.androidlearningdemo.context;

import android.app.Activity;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;

import richard.example.com.androidlearningdemo.MyApplication;

/**
 * Created by Administrator on 2016/11/7.
 */

public class ContextActivity extends Activity {

    public static final String TAG = "ContextActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"============= use the MyApplication Context =============== ");
        WifiManager wifiManager = (WifiManager) MyApplication.getrichardContext().getSystemService(MyApplication.getrichardContext().WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();

        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        String str1 = (0xFF & dhcpInfo.ipAddress) + "." + (0xFF & dhcpInfo.ipAddress >> 8) + "." + (0xFF & dhcpInfo.ipAddress >> 16) + "." + (0xFF & dhcpInfo.ipAddress >> 24);
        String str2 = (0xFF & dhcpInfo.netmask) + "." + (0xFF & dhcpInfo.netmask >> 8) + "." + (0xFF & dhcpInfo.netmask >> 16) + "." + (0xFF & dhcpInfo.netmask >> 24);
        Log.d("kdd", "dchp ip:" + str1 + ",dhcp msk:" + str2);

    }

}
