package cm;

import android.content.Context;
import android.media.MediaCodecInfo;
import g00.m;
import ri.t1;

public final class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        Object objS;
        try {
            objS = Boolean.valueOf(videoCapabilities.areSizeAndRateSupported(i, i2, 30.0d));
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof m) {
            objS = obj;
        }
        return ((Boolean) objS).booleanValue();
    }
}
