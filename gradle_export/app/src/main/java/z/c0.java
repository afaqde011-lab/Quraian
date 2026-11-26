package z;

import android.view.ViewConfiguration;

public abstract class c0 {

    public static final float f16895a = ViewConfiguration.getScrollFriction();

    public static final double f16896b;

    public static final double f16897c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f16896b = dLog;
        f16897c = dLog - 1.0d;
    }
}
