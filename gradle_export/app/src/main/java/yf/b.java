package yf;

import com.google.android.gms.cast.CastStatusCodes;
import f5.p;
import h00.z;
import kotlin.jvm.internal.m;
import ze.d;

public final class b extends p {

    public final String f16864d;

    public final String f16865e;

    public b(String str, String str2) {
        super(d.V(str, str2), d.V(str, str2), true, z.A, CastStatusCodes.AUTHENTICATION_FAILED);
        m.e(str, "serverClientId");
        this.f16864d = str;
        this.f16865e = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
