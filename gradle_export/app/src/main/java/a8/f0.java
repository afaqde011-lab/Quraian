package a8;

import androidx.media3.common.x0;

public final class f0 implements q {

    public final int f261a;

    public final int f262b;

    public final String f263c;

    public int f264d;

    public int f265e;

    public s f266f;

    public l0 f267g;

    public f0(int i10, String str, int i11) {
        this.f261a = i10;
        this.f262b = i11;
        this.f263c = str;
    }

    @Override
    public final void a(s sVar) {
        this.f266f = sVar;
        l0 l0VarW = sVar.w(1024, 4);
        this.f267g = l0VarW;
        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
        String str = this.f263c;
        sVar2.l = x0.n(str);
        sVar2.m = x0.n(str);
        oi.k.w(sVar2, l0VarW);
        this.f266f.q();
        this.f266f.b(new g0());
        this.f265e = 1;
    }

    @Override
    public final void b(long j9, long j10) {
        if (j9 == 0 || this.f265e == 1) {
            this.f265e = 1;
            this.f264d = 0;
        }
    }

    @Override
    public final int d(r rVar, u uVar) {
        int i10 = this.f265e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        l0 l0Var = this.f267g;
        l0Var.getClass();
        int iA = l0Var.a(rVar, 1024, true);
        if (iA != -1) {
            this.f264d += iA;
            return 0;
        }
        this.f265e = 2;
        this.f267g.d(0L, 1, this.f264d, 0, null);
        this.f264d = 0;
        return 0;
    }

    @Override
    public final boolean e(r rVar) {
        int i10 = this.f262b;
        int i11 = this.f261a;
        ta.c0.A((i11 == -1 || i10 == -1) ? false : true);
        e7.u uVar = new e7.u(i10);
        ((m) rVar).i(uVar.f5182a, 0, i10, false);
        return uVar.H() == i11;
    }

    @Override
    public final void release() {
    }
}
