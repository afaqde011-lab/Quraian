package yf;

import com.google.android.gms.cast.MediaError;
import f5.p;
import h00.z;
import kotlin.jvm.internal.m;
import ta.c0;

public final class a extends p {

    public final String f16862d;

    public final String f16863e;

    public a(String str, String str2) {
        super(c0.Y(str, str2), c0.Y(str, str2), false, z.A, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        m.e(str, "serverClientId");
        this.f16862d = str;
        this.f16863e = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
