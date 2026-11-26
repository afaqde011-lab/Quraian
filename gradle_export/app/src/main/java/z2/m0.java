package z2;

import java.util.Map;

public final class m0 implements x0 {

    public final int f17135a;

    public final x0 f17136b;

    public final q0 f17137c;

    public final int f17138d;

    public final x0 f17139e;

    public m0(x0 x0Var, q0 q0Var, int i10, x0 x0Var2, int i11) {
        this.f17135a = i11;
        this.f17137c = q0Var;
        this.f17138d = i10;
        this.f17139e = x0Var2;
        this.f17136b = x0Var;
    }

    @Override
    public final Map a() {
        switch (this.f17135a) {
            case 0:
                break;
        }
        return this.f17136b.a();
    }

    @Override
    public final void b() {
        switch (this.f17135a) {
            case 0:
                int i10 = this.f17138d;
                q0 q0Var = this.f17137c;
                q0Var.E = i10;
                this.f17139e.b();
                m1.e eVar = q0Var.M;
                u.i0 i0Var = q0Var.L;
                long[] jArr = i0Var.f14856a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j9 = jArr[i11];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j9) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = i0Var.f14857b[i14];
                                    t1 t1Var = (t1) i0Var.f14858c[i14];
                                    int i15 = eVar.i(obj);
                                    if (i15 < 0 || i15 >= q0Var.E) {
                                        if (i15 >= 0) {
                                            Object[] objArr = eVar.A;
                                            Object obj2 = objArr[i15];
                                            objArr[i15] = d0.f17099b;
                                        }
                                        if (q0Var.J.b(obj)) {
                                            t1Var.dispose();
                                        }
                                        i0Var.l(i14);
                                    }
                                }
                                j9 >>= 8;
                            }
                            if (i12 == 8) {
                                if (i11 != length) {
                                    i11++;
                                }
                            }
                        } else if (i11 != length) {
                            i11++;
                        }
                    }
                }
                q0Var.g(q0Var.D);
                break;
            default:
                int i16 = this.f17138d;
                q0 q0Var2 = this.f17137c;
                q0Var2.D = i16;
                this.f17139e.b();
                if (q0Var2.A.I == null) {
                    q0Var2.g(q0Var2.D);
                }
                break;
        }
    }

    @Override
    public final int c() {
        switch (this.f17135a) {
            case 0:
                break;
        }
        return this.f17136b.c();
    }

    @Override
    public final int d() {
        switch (this.f17135a) {
            case 0:
                break;
        }
        return this.f17136b.d();
    }

    @Override
    public final u00.k e() {
        switch (this.f17135a) {
            case 0:
                break;
        }
        return this.f17136b.e();
    }
}
