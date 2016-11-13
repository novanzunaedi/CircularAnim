package id.co.noz.circular.anim;

import android.app.Application;

import id.co.noz.circular.cA;

/**
 * Created by CLient-Pc on 13/11/2016.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        cA.init(700, 500, R.color.colorPrimary);
    }
}
