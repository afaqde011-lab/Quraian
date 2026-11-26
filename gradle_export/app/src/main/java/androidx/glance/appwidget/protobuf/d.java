package androidx.glance.appwidget.protobuf;

public final class d {

    public int f881a;

    public long f882b;

    public Object f883c;

    public int f884d;

    public d(h0.h0 h0Var, long j9, int i10, int i11) {
        this.f883c = h0Var;
        this.f882b = j9;
        this.f881a = i10;
        this.f884d = i11;
    }

    public static String c(int i10, int i11, byte b7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b7 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public h0.c a(h0.d0 d0Var, boolean z10, int i10, int i11, int i12, int i13) {
        if (!d0Var.f6397b) {
            return null;
        }
        ((h0.h0) this.f883c).getClass();
        h0.f0 f0Var = h0.f0.A;
        return null;
    }

    public h0.d0 b(boolean z10, int i10, long j9, u.j jVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = this.f881a;
        int i15 = this.f884d;
        long j10 = this.f882b;
        h0.h0 h0Var = (h0.h0) this.f883c;
        int i16 = i12 + i13;
        if (jVar == null) {
            return new h0.d0(true, true);
        }
        long j11 = jVar.f14863a;
        h0Var.getClass();
        h0.f0 f0Var = h0.f0.A;
        h0.f0 f0Var2 = h0.f0.A;
        if (i11 >= Integer.MAX_VALUE || ((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L)) < 0) {
            return new h0.d0(true, true);
        }
        if (i10 != 0 && (i10 >= Integer.MAX_VALUE || ((int) (j9 >> 32)) - ((int) (j11 >> 32)) < 0)) {
            return z11 ? new h0.d0(true, true) : new h0.d0(true, b(z10, 0, u.j.a(y3.a.h(j10), (((int) (j9 & 4294967295L)) - i15) - i13), new u.j(u.j.a(((int) (j11 >> 32)) - i14, (int) (j11 & 4294967295L))), i11 + 1, i16, 0, true, false).f6397b);
        }
        Math.max(i13, (int) (j11 & 4294967295L));
        return new h0.d0(false, false);
    }
}
