package tf;

import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.RuntimeVersion;

public final class q0 extends o1 {
    public char D;
    public long E;
    public String F;
    public final b50.b G;
    public final b50.b H;
    public final b50.b I;
    public final b50.b J;
    public final b50.b K;
    public final b50.b L;
    public final b50.b M;
    public final b50.b N;
    public final b50.b O;

    public q0(h1 h1Var) {
        super(h1Var);
        this.D = (char) 0;
        this.E = -1L;
        this.G = new b50.b(this, 6, false, false);
        this.H = new b50.b(this, 6, true, false);
        this.I = new b50.b(this, 6, false, true);
        this.J = new b50.b(this, 5, false, false);
        this.K = new b50.b(this, 5, true, false);
        this.L = new b50.b(this, 5, false, true);
        this.M = new b50.b(this, 4, false, false);
        this.N = new b50.b(this, 3, false, false);
        this.O = new b50.b(this, 2, false, false);
    }

    public static p0 d1(String str) {
        if (str == null) {
            return null;
        }
        return new p0(str);
    }

    public static String g1(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strH1 = h1(obj, z10);
        String strH2 = h1(obj2, z10);
        String strH3 = h1(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = RuntimeVersion.SUFFIX;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strH1)) {
            sb2.append(str2);
            sb2.append(strH1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strH2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strH2);
        }
        if (!TextUtils.isEmpty(strH3)) {
            sb2.append(str3);
            sb2.append(strH3);
        }
        return sb2.toString();
    }

    public static String h1(Object obj, boolean z10) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        String str = RuntimeVersion.SUFFIX;
        if (obj == null) {
            return RuntimeVersion.SUFFIX;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            if (cCharAt == '-') {
                str = "-";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof p0) {
                return ((p0) obj).f14682a;
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String canonicalName = h1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? RuntimeVersion.SUFFIX : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? RuntimeVersion.SUFFIX : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb3.toString();
    }

    @Override
    public final boolean W0() {
        return false;
    }

    public final b50.b Z0() {
        return this.G;
    }

    public final b50.b a1() {
        return this.J;
    }

    public final b50.b b1() {
        return this.N;
    }

    public final b50.b c1() {
        return this.O;
    }

    public final void e1(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(f1(), i10)) {
            Log.println(i10, f1(), g1(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        com.google.android.gms.common.internal.d0.h(str);
        e1 e1Var = ((h1) this.B).G;
        if (e1Var == null) {
            Log.println(6, f1(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!e1Var.C) {
                Log.println(6, f1(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            e1Var.e1(new o0(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String f1() {
        String str;
        synchronized (this) {
            try {
                if (this.F == null) {
                    ((h1) ((h1) this.B).D.B).getClass();
                    this.F = "FA";
                }
                com.google.android.gms.common.internal.d0.h(this.F);
                str = this.F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
