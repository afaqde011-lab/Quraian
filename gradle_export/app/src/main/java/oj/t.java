package oj;

import android.util.Log;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class t {

    public static final Pattern f12105d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    public final String f12106a;

    public final String f12107b;

    public final String f12108c;

    public t(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f12105d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(a1.b.p("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f12106a = strSubstring;
        this.f12107b = str;
        this.f12108c = x5.m(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f12106a.equals(tVar.f12106a) && this.f12107b.equals(tVar.f12107b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12107b, this.f12106a});
    }
}
