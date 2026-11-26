package i2;

import android.graphics.Bitmap;

public final class d {

    public final Bitmap f7117a;

    public d(Bitmap bitmap) {
        this.f7117a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f7117a.getConfig();
        kotlin.jvm.internal.m.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
