package xyz.kongzz.socketandroid;

import android.app.Activity;
import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends Activity {

    private UDPProvider.Provider mProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 生成设备唯一标示
        String sn = UUID.randomUUID().toString();
        mProvider = new UDPProvider.Provider(sn);
        mProvider.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mProvider.exit();
    }
}
