package tf;

import android.net.Uri;
import android.text.TextUtils;

public final class v3 extends p3 {
    public static final boolean Y0(String str) {
        String str2 = (String) b0.f14592t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final tf.u3 W0(java.lang.String r14) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: tf.v3.W0(java.lang.String):tf.u3");
    }

    public final String X0(String str) {
        a1 a1Var = this.C.A;
        y3.R(a1Var);
        String strI1 = a1Var.i1(str);
        if (TextUtils.isEmpty(strI1)) {
            return (String) b0.f14588r.a(null);
        }
        Uri uri = Uri.parse((String) b0.f14588r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strI1).length() + 1 + String.valueOf(authority).length());
        sb2.append(strI1);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
