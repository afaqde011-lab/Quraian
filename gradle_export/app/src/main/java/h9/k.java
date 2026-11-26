package h9;

import a8.l0;
import com.google.android.gms.cast.Cast;
import g1.c3;

public final class k implements i {

    public static final double[] f6756r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    public String f6757a;

    public l0 f6758b;

    public final d0 f6759c;

    public final String f6760d;

    public final e7.u f6761e;

    public final ba.s f6762f;

    public final boolean[] f6763g = new boolean[4];

    public final j f6764h;

    public long f6765i;

    public boolean f6766j;

    public boolean f6767k;
    public long l;
    public long m;

    public long f6768n;

    public long f6769o;

    public boolean f6770p;

    public boolean f6771q;

    public k(d0 d0Var, String str) {
        this.f6759c = d0Var;
        this.f6760d = str;
        j jVar = new j();
        jVar.f6755d = new byte[Cast.MAX_NAMESPACE_LENGTH];
        this.f6764h = jVar;
        if (d0Var != null) {
            this.f6762f = new ba.s(178);
            this.f6761e = new e7.u();
        } else {
            this.f6762f = null;
            this.f6761e = null;
        }
        this.m = -9223372036854775807L;
        this.f6769o = -9223372036854775807L;
    }

    @Override
    public final void a() {
        f7.p.a(this.f6763g);
        j jVar = this.f6764h;
        jVar.f6752a = false;
        jVar.f6753b = 0;
        jVar.f6754c = 0;
        ba.s sVar = this.f6762f;
        if (sVar != null) {
            sVar.g();
        }
        this.f6765i = 0L;
        this.f6766j = false;
        this.m = -9223372036854775807L;
        this.f6769o = -9223372036854775807L;
    }

    @Override
    public final void b(e7.u r23) {
        throw new UnsupportedOperationException("Method not decompiled: h9.k.b(e7.u):void");
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6757a = (String) c3Var.E;
        c3Var.b();
        this.f6758b = sVar.w(c3Var.C, 2);
        d0 d0Var = this.f6759c;
        if (d0Var != null) {
            d0Var.b(sVar, c3Var);
        }
    }

    @Override
    public final void d(boolean z10) {
        this.f6758b.getClass();
        if (z10) {
            boolean z11 = this.f6770p;
            this.f6758b.d(this.f6769o, z11 ? 1 : 0, (int) (this.f6765i - this.f6768n), 0, null);
        }
    }

    @Override
    public final void e(int i10, long j9) {
        this.m = j9;
    }
}
