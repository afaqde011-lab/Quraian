package androidx.media3.common;

import android.os.SystemClock;
import java.util.Objects;

public final class b2 {
    public final s2 A;
    public final t0 B;
    public final t0 C;
    public final int D;
    public final int E;
    public final int F;
    public final z1 G;
    public final z1 H;
    public final z1 I;
    public final z1 J;
    public final z1 K;
    public final boolean L;
    public final int M;
    public final long N;
    public final boolean O;

    public final b1 f1104a;

    public final boolean f1105b;

    public final int f1106c;

    public final int f1107d;

    public final int f1108e;

    public final PlaybackException f1109f;

    public final int f1110g;

    public final boolean f1111h;

    public final boolean f1112i;

    public final long f1113j;

    public final long f1114k;
    public final long l;
    public final z0 m;

    public final q2 f1115n;

    public final d f1116o;

    public final float f1117p;

    public final float f1118q;

    public final w2 f1119r;

    public final d7.c f1120s;

    public final l f1121t;

    public final int f1122u;

    public final boolean f1123v;

    public final e7.v f1124w;

    public final boolean f1125x;

    public final v0 f1126y;

    public final k2 f1127z;

    public b2(a2 a2Var) {
        int i10;
        boolean z10;
        int i11;
        z1 y1Var;
        Long l;
        s2 s2Var = a2Var.B;
        t0 t0VarAccess$1400 = a2Var.C;
        if (!a2Var.A.isEmpty()) {
            int i12 = a2Var.E;
            if (i12 == -1) {
                i10 = 0;
            } else {
                ta.c0.r("currentMediaItemIndex must be less than playlist.size()", i12 < a2Var.A.getWindowCount());
                i10 = i12;
            }
            if (a2Var.F != -1) {
                h2 h2Var = new h2();
                j2 j2Var = new j2();
                Long l10 = a2Var.H;
                long jLongValue = l10 != null ? l10.longValue() : a2Var.I.get();
                k2 k2Var = a2Var.A;
                a2Var.A.getPeriod(k2Var.getIndexOfPeriod(k2Var.getPeriodPositionUs(j2Var, h2Var, i10, e7.i0.H(jLongValue)).first), h2Var);
                ta.c0.r("PeriodData has less ad groups than adGroupIndex", a2Var.F < h2Var.f1237g.f1134a);
                int i13 = h2Var.f1237g.a(a2Var.F).f1051b;
                if (i13 != -1) {
                    ta.c0.r("Ad group has less ads than adIndexInGroupIndex", a2Var.G < i13);
                }
            }
            fh.t0 t0Var = a2Var.f1090z;
            if (t0Var != null) {
                s1 s1Var = (s1) t0Var.get(i10);
                s2 s2Var2 = s1Var.f1540b;
                t0VarAccess$1400 = s1Var.f1542d;
                s2Var = s2Var2;
            }
            if (t0VarAccess$1400 == null) {
                q0 q0Var = a2Var.A.getWindow(i10, new j2()).f1285c;
                s2Var.getClass();
                t0VarAccess$1400 = c2.access$1400(q0Var, s2Var);
                z10 = true;
            }
            if (a2Var.f1072f != null) {
                ta.c0.r("Player error only allowed in STATE_IDLE", a2Var.f1070d == 1);
            }
            i11 = a2Var.f1070d;
            if (i11 != 1 || i11 == 4) {
                ta.c0.r("isLoading only allowed when not in STATE_IDLE or STATE_ENDED", !a2Var.f1075i);
            }
            y1Var = a2Var.I;
            l = a2Var.H;
            if (l != null) {
                if (a2Var.F != -1 && a2Var.f1068b && a2Var.f1070d == 3 && a2Var.f1071e == 0 && l.longValue() != -9223372036854775807L) {
                    final long jLongValue2 = a2Var.H.longValue();
                    final float f3 = a2Var.m.f1688a;
                    final long jElapsedRealtime = SystemClock.elapsedRealtime();
                    y1Var = new z1() {
                        @Override
                        public final long get() {
                            return jLongValue2 + ((long) ((SystemClock.elapsedRealtime() - jElapsedRealtime) * f3));
                        }
                    };
                } else {
                    y1Var = new y1(a2Var.H.longValue());
                }
            }
            z1 z1Var = a2Var.J;
            this.f1104a = a2Var.f1067a;
            this.f1105b = a2Var.f1068b;
            this.f1106c = a2Var.f1069c;
            this.f1107d = a2Var.f1070d;
            this.f1108e = a2Var.f1071e;
            this.f1109f = a2Var.f1072f;
            this.f1110g = a2Var.f1073g;
            this.f1111h = a2Var.f1074h;
            this.f1112i = a2Var.f1075i;
            this.f1113j = a2Var.f1076j;
            this.f1114k = a2Var.f1077k;
            this.l = a2Var.l;
            this.m = a2Var.m;
            this.f1115n = a2Var.f1078n;
            this.f1116o = a2Var.f1079o;
            this.f1117p = a2Var.f1080p;
            this.f1118q = a2Var.f1081q;
            this.f1119r = a2Var.f1082r;
            this.f1120s = a2Var.f1083s;
            this.f1121t = a2Var.f1084t;
            this.f1122u = a2Var.f1085u;
            this.f1123v = a2Var.f1086v;
            this.f1124w = a2Var.f1087w;
            this.f1125x = a2Var.f1088x;
            this.f1126y = a2Var.f1089y;
            this.f1127z = a2Var.A;
            s2Var.getClass();
            this.A = s2Var;
            this.B = t0VarAccess$1400;
            this.C = a2Var.D;
            this.D = a2Var.E;
            this.E = a2Var.F;
            this.F = a2Var.G;
            this.G = y1Var;
            this.H = z1Var;
            this.I = a2Var.K;
            this.J = a2Var.L;
            this.K = a2Var.M;
            this.L = a2Var.N;
            this.M = a2Var.O;
            this.N = a2Var.P;
            this.O = z10;
        }
        int i14 = a2Var.f1070d;
        ta.c0.r("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", i14 == 1 || i14 == 4);
        ta.c0.r("Ads not allowed if playlist is empty", a2Var.F == -1 && a2Var.G == -1);
        s2Var = s2Var == null ? s2.f1554b : s2Var;
        if (t0VarAccess$1400 == null) {
            t0VarAccess$1400 = t0.K;
        }
        z10 = false;
        if (a2Var.f1072f != null) {
            ta.c0.r("Player error only allowed in STATE_IDLE", a2Var.f1070d == 1);
        }
        i11 = a2Var.f1070d;
        if (i11 != 1) {
            ta.c0.r("isLoading only allowed when not in STATE_IDLE or STATE_ENDED", !a2Var.f1075i);
        } else {
            ta.c0.r("isLoading only allowed when not in STATE_IDLE or STATE_ENDED", !a2Var.f1075i);
        }
        y1Var = a2Var.I;
        l = a2Var.H;
        if (l != null) {
            if (a2Var.F != -1) {
                y1Var = new y1(a2Var.H.longValue());
            } else {
                y1Var = new y1(a2Var.H.longValue());
            }
        }
        z1 z1Var2 = a2Var.J;
        this.f1104a = a2Var.f1067a;
        this.f1105b = a2Var.f1068b;
        this.f1106c = a2Var.f1069c;
        this.f1107d = a2Var.f1070d;
        this.f1108e = a2Var.f1071e;
        this.f1109f = a2Var.f1072f;
        this.f1110g = a2Var.f1073g;
        this.f1111h = a2Var.f1074h;
        this.f1112i = a2Var.f1075i;
        this.f1113j = a2Var.f1076j;
        this.f1114k = a2Var.f1077k;
        this.l = a2Var.l;
        this.m = a2Var.m;
        this.f1115n = a2Var.f1078n;
        this.f1116o = a2Var.f1079o;
        this.f1117p = a2Var.f1080p;
        this.f1118q = a2Var.f1081q;
        this.f1119r = a2Var.f1082r;
        this.f1120s = a2Var.f1083s;
        this.f1121t = a2Var.f1084t;
        this.f1122u = a2Var.f1085u;
        this.f1123v = a2Var.f1086v;
        this.f1124w = a2Var.f1087w;
        this.f1125x = a2Var.f1088x;
        this.f1126y = a2Var.f1089y;
        this.f1127z = a2Var.A;
        s2Var.getClass();
        this.A = s2Var;
        this.B = t0VarAccess$1400;
        this.C = a2Var.D;
        this.D = a2Var.E;
        this.E = a2Var.F;
        this.F = a2Var.G;
        this.G = y1Var;
        this.H = z1Var2;
        this.I = a2Var.K;
        this.J = a2Var.L;
        this.K = a2Var.M;
        this.L = a2Var.N;
        this.M = a2Var.O;
        this.N = a2Var.P;
        this.O = z10;
    }

    public final a2 a() {
        a2 a2Var = new a2();
        a2Var.f1067a = this.f1104a;
        a2Var.f1068b = this.f1105b;
        a2Var.f1069c = this.f1106c;
        a2Var.f1070d = this.f1107d;
        a2Var.f1071e = this.f1108e;
        a2Var.f1072f = this.f1109f;
        a2Var.f1073g = this.f1110g;
        a2Var.f1074h = this.f1111h;
        a2Var.f1075i = this.f1112i;
        a2Var.f1076j = this.f1113j;
        a2Var.f1077k = this.f1114k;
        a2Var.l = this.l;
        a2Var.m = this.m;
        a2Var.f1078n = this.f1115n;
        a2Var.f1079o = this.f1116o;
        a2Var.f1080p = this.f1117p;
        a2Var.f1081q = this.f1118q;
        a2Var.f1082r = this.f1119r;
        a2Var.f1083s = this.f1120s;
        a2Var.f1084t = this.f1121t;
        a2Var.f1085u = this.f1122u;
        a2Var.f1086v = this.f1123v;
        a2Var.f1087w = this.f1124w;
        a2Var.f1088x = this.f1125x;
        a2Var.f1089y = this.f1126y;
        k2 k2Var = this.f1127z;
        a2Var.A = k2Var;
        if (k2Var instanceof w1) {
            a2Var.f1090z = ((w1) k2Var).f1665a;
        } else {
            a2Var.B = this.A;
            a2Var.C = this.O ? null : this.B;
        }
        a2Var.D = this.C;
        a2Var.E = this.D;
        a2Var.F = this.E;
        a2Var.G = this.F;
        a2Var.H = null;
        a2Var.I = this.G;
        a2Var.J = this.H;
        a2Var.K = this.I;
        a2Var.L = this.J;
        a2Var.M = this.K;
        a2Var.N = this.L;
        a2Var.O = this.M;
        a2Var.P = this.N;
        return a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f1105b == b2Var.f1105b && this.f1106c == b2Var.f1106c && this.f1104a.equals(b2Var.f1104a) && this.f1107d == b2Var.f1107d && this.f1108e == b2Var.f1108e && Objects.equals(this.f1109f, b2Var.f1109f) && this.f1110g == b2Var.f1110g && this.f1111h == b2Var.f1111h && this.f1112i == b2Var.f1112i && this.f1113j == b2Var.f1113j && this.f1114k == b2Var.f1114k && this.l == b2Var.l && this.m.equals(b2Var.m) && this.f1115n.equals(b2Var.f1115n) && this.f1116o.equals(b2Var.f1116o) && this.f1117p == b2Var.f1117p && this.f1118q == b2Var.f1118q && this.f1119r.equals(b2Var.f1119r) && this.f1120s.equals(b2Var.f1120s) && this.f1121t.equals(b2Var.f1121t) && this.f1122u == b2Var.f1122u && this.f1123v == b2Var.f1123v && this.f1124w.equals(b2Var.f1124w) && this.f1125x == b2Var.f1125x && this.f1126y.equals(b2Var.f1126y) && this.f1127z.equals(b2Var.f1127z) && this.A.equals(b2Var.A) && this.B.equals(b2Var.B) && this.C.equals(b2Var.C) && this.D == b2Var.D && this.E == b2Var.E && this.F == b2Var.F && this.G.equals(b2Var.G) && this.H.equals(b2Var.H) && this.I.equals(b2Var.I) && this.J.equals(b2Var.J) && this.K.equals(b2Var.K) && this.L == b2Var.L && this.M == b2Var.M && this.N == b2Var.N;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f1104a.hashCode() + 217) * 31) + (this.f1105b ? 1 : 0)) * 31) + this.f1106c) * 31) + this.f1107d) * 31) + this.f1108e) * 31;
        PlaybackException playbackException = this.f1109f;
        int iHashCode2 = (((((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.f1110g) * 31) + (this.f1111h ? 1 : 0)) * 31) + (this.f1112i ? 1 : 0)) * 31;
        long j9 = this.f1113j;
        int i10 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f1114k;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.l;
        int iHashCode3 = (((((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((((((((this.C.hashCode() + ((this.B.hashCode() + ((this.A.f1556a.hashCode() + ((this.f1127z.hashCode() + ((this.f1126y.hashCode() + ((((this.f1124w.hashCode() + ((((((this.f1121t.hashCode() + ((this.f1120s.hashCode() + ((this.f1119r.hashCode() + ((Float.floatToRawIntBits(this.f1118q) + ((Float.floatToRawIntBits(this.f1117p) + ((this.f1116o.hashCode() + ((this.f1115n.hashCode() + ((this.m.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f1122u) * 31) + (this.f1123v ? 1 : 0)) * 31)) * 31) + (this.f1125x ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.L ? 1 : 0)) * 31) + this.M) * 31;
        long j12 = this.N;
        return iHashCode3 + ((int) ((j12 >>> 32) ^ j12));
    }
}
