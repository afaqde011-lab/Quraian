package a2;

import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import r30.r;

public final class n {

    public String f166a;

    public int f167b;

    public n(String str, int i10) {
        switch (i10) {
            case 1:
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException();
                }
                this.f166a = str;
                this.f167b = 1;
                return;
            default:
                this.f166a = str;
                return;
        }
    }

    public boolean a() {
        return this.f167b >= this.f166a.length();
    }

    public void b() throws l {
        if (c(')')) {
            return;
        }
        f("expected )");
        throw null;
    }

    public boolean c(char c10) {
        int i10 = this.f167b;
        String str = this.f166a;
        return i10 < str.length() && str.charAt(this.f167b) == c10;
    }

    public int d(String str) throws l {
        Integer numY0 = r.y0(e(str));
        if (numY0 != null) {
            return numY0.intValue();
        }
        f("expected int");
        throw null;
    }

    public String e(String str) {
        int i10 = this.f167b;
        String str2 = this.f166a;
        while (this.f167b < str2.length() && !r30.k.B0(str, str2.charAt(this.f167b))) {
            this.f167b++;
        }
        int i11 = this.f167b;
        if (i11 <= i10) {
            return RuntimeVersion.SUFFIX;
        }
        String strSubstring = str2.substring(i10, i11);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public void f(String str) throws l {
        int i10 = this.f167b;
        String str2 = this.f166a;
        int iMin = Math.min(i10, str2.length());
        StringBuilder sbN = g4.c.n("Error while parsing source information: ", str, " at ");
        String strSubstring = str2.substring(0, iMin);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        sbN.append(strSubstring);
        sbN.append('|');
        String strSubstring2 = str2.substring(iMin);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        sbN.append(strSubstring2);
        throw new l(sbN.toString());
    }
}
