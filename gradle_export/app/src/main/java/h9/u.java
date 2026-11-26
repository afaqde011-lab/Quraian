package h9;

import a8.l0;
import androidx.media3.common.x0;
import g1.c3;

public final class u implements i {

    public final e7.u f6884a;

    public final a8.b0 f6885b;

    public final String f6886c;

    public final int f6887d;

    public final String f6888e;

    public l0 f6889f;

    public String f6890g;

    public int f6891h = 0;

    public int f6892i;

    public boolean f6893j;

    public boolean f6894k;
    public long l;
    public int m;

    public long f6895n;

    public u(String str, int i10, String str2) {
        e7.u uVar = new e7.u(4);
        this.f6884a = uVar;
        uVar.f5182a[0] = -1;
        this.f6885b = new a8.b0();
        this.f6895n = -9223372036854775807L;
        this.f6886c = str;
        this.f6887d = i10;
        this.f6888e = str2;
    }

    @Override
    public final void a() {
        this.f6891h = 0;
        this.f6892i = 0;
        this.f6894k = false;
        this.f6895n = -9223372036854775807L;
    }

    @Override
    public final void b(e7.u uVar) {
        this.f6889f.getClass();
        while (uVar.a() > 0) {
            int i10 = this.f6891h;
            e7.u uVar2 = this.f6884a;
            if (i10 == 0) {
                byte[] bArr = uVar.f5182a;
                int i11 = uVar.f5183b;
                int i12 = uVar.f5184c;
                while (true) {
                    if (i11 >= i12) {
                        uVar.N(i12);
                        break;
                    }
                    byte b7 = bArr[i11];
                    boolean z10 = (b7 & 255) == 255;
                    boolean z11 = this.f6894k && (b7 & 224) == 224;
                    this.f6894k = z10;
                    if (z11) {
                        uVar.N(i11 + 1);
                        this.f6894k = false;
                        uVar2.f5182a[1] = bArr[i11];
                        this.f6892i = 2;
                        this.f6891h = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(uVar.a(), 4 - this.f6892i);
                uVar.k(this.f6892i, iMin, uVar2.f5182a);
                int i13 = this.f6892i + iMin;
                this.f6892i = i13;
                if (i13 >= 4) {
                    uVar2.N(0);
                    int iM = uVar2.m();
                    a8.b0 b0Var = this.f6885b;
                    if (b0Var.a(iM)) {
                        this.m = b0Var.f223b;
                        if (!this.f6893j) {
                            this.l = (((long) b0Var.f227f) * 1000000) / ((long) b0Var.f224c);
                            androidx.media3.common.s sVar = new androidx.media3.common.s();
                            sVar.f1491a = this.f6890g;
                            sVar.l = x0.n(this.f6888e);
                            sVar.m = x0.n((String) b0Var.f228g);
                            sVar.f1502n = 4096;
                            sVar.E = b0Var.f225d;
                            sVar.F = b0Var.f224c;
                            sVar.f1494d = this.f6886c;
                            sVar.f1496f = this.f6887d;
                            this.f6889f.f(new androidx.media3.common.t(sVar));
                            this.f6893j = true;
                        }
                        uVar2.N(0);
                        this.f6889f.g(4, uVar2);
                        this.f6891h = 2;
                    } else {
                        this.f6892i = 0;
                        this.f6891h = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(uVar.a(), this.m - this.f6892i);
                this.f6889f.g(iMin2, uVar);
                int i14 = this.f6892i + iMin2;
                this.f6892i = i14;
                if (i14 >= this.m) {
                    ta.c0.A(this.f6895n != -9223372036854775807L);
                    this.f6889f.d(this.f6895n, 1, this.m, 0, null);
                    this.f6895n += this.l;
                    this.f6892i = 0;
                    this.f6891h = 0;
                }
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6890g = (String) c3Var.E;
        c3Var.b();
        this.f6889f = sVar.w(c3Var.C, 1);
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(int i10, long j9) {
        this.f6895n = j9;
    }
}
