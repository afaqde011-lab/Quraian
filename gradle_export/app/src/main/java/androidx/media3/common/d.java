package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;

public final class d {

    public static final d f1142i = new d(0, 0, 1, 1, 0, false, true);

    public static final String f1143j;

    public static final String f1144k;
    public static final String l;
    public static final String m;

    public static final String f1145n;

    public static final String f1146o;

    public static final String f1147p;

    public final int f1148a;

    public final int f1149b;

    public final int f1150c;

    public final int f1151d;

    public final int f1152e;

    public final boolean f1153f;

    public final boolean f1154g;

    public AudioAttributes f1155h;

    static {
        String str = e7.i0.f5136a;
        f1143j = Integer.toString(0, 36);
        f1144k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        f1145n = Integer.toString(4, 36);
        f1146o = Integer.toString(5, 36);
        f1147p = Integer.toString(6, 36);
    }

    public d(int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        this.f1148a = i10;
        this.f1149b = i11;
        this.f1150c = i12;
        this.f1151d = i13;
        this.f1152e = i14;
        this.f1153f = z10;
        this.f1154g = z11;
    }

    public static d a(Bundle bundle) {
        String str = f1143j;
        int i10 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = f1144k;
        int i11 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i12 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i13 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = f1145n;
        int i14 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = f1146o;
        boolean z10 = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = f1147p;
        return new d(i10, i11, i12, i13, i14, z10, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public final AudioAttributes b() {
        if (this.f1155h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f1148a).setFlags(this.f1149b).setUsage(this.f1150c);
            usage.setAllowedCapturePolicy(this.f1151d);
            usage.setHapticChannelsMuted(this.f1154g);
            usage.setSpatializationBehavior(this.f1152e);
            usage.setIsContentSpatialized(this.f1153f);
            this.f1155h = usage.build();
        }
        return this.f1155h;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        int i10 = this.f1148a;
        if (i10 != 0) {
            bundle.putInt(f1143j, i10);
        }
        int i11 = this.f1149b;
        if (i11 != 0) {
            bundle.putInt(f1144k, i11);
        }
        int i12 = this.f1150c;
        if (i12 != 1) {
            bundle.putInt(l, i12);
        }
        int i13 = this.f1151d;
        if (i13 != 1) {
            bundle.putInt(m, i13);
        }
        int i14 = this.f1152e;
        if (i14 != 0) {
            bundle.putInt(f1145n, i14);
        }
        boolean z10 = this.f1153f;
        if (z10) {
            bundle.putBoolean(f1146o, z10);
        }
        boolean z11 = this.f1154g;
        if (!z11) {
            bundle.putBoolean(f1147p, z11);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f1148a == dVar.f1148a && this.f1149b == dVar.f1149b && this.f1150c == dVar.f1150c && this.f1151d == dVar.f1151d && this.f1152e == dVar.f1152e && this.f1153f == dVar.f1153f && this.f1154g == dVar.f1154g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f1148a) * 31) + this.f1149b) * 31) + this.f1150c) * 31) + this.f1151d) * 31) + this.f1152e) * 31) + (this.f1153f ? 1 : 0)) * 31) + (this.f1154g ? 1 : 0);
    }
}
