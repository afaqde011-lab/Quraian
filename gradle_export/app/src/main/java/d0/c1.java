package d0;

public final class c1 {

    public final o0 f4408a;

    public x0 f4409b;

    public a1 f4410c;

    public z0 f4411d;

    public y0 f4412e;

    public g3 f4413f;

    public o9.q f4414g;

    public long f4415h = 9205357640488583168L;

    public a8.i0 f4416i;

    public final qd.j0 f4417j;

    public final qd.j0 f4418k;
    public long l;

    public c1(o0 o0Var) {
        this.f4408a = o0Var;
        qd.j0 j0Var = new qd.j0((char) 0, 2);
        j0Var.C = new u.d0();
        this.f4417j = j0Var;
        qd.j0 j0Var2 = new qd.j0((char) 0, 3);
        j0Var2.C = new u.y();
        this.f4418k = j0Var2;
        this.l = 0L;
    }

    public static void c(c1 c1Var, s2.b bVar, long j9, long j10, int i10) {
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        o0 o0Var = c1Var.f4408a;
        z0 z0Var = c1Var.f4411d;
        if (z0Var == null) {
            z0Var = new z0();
            z0Var.f4530b = null;
            z0Var.f4531c = Long.MAX_VALUE;
            z0Var.f4532d = false;
            c1Var.f4411d = z0Var;
        }
        z0Var.f4530b = bVar;
        z0Var.f4531c = j9;
        a8.i0 i0Var = c1Var.f4416i;
        if (i0Var == null) {
            c1Var.f4416i = new a8.i0(o0Var.Q);
        } else {
            i0Var.C = o0Var.Q;
            i0Var.B = j10;
        }
        z0Var.f4532d = false;
        c1Var.f4413f = z0Var;
    }

    public final void a() {
        x0 x0Var = this.f4409b;
        if (x0Var == null) {
            w0 w0Var = w0.C;
            x0Var = new x0();
            x0Var.f4526b = w0Var;
            x0Var.f4527c = false;
            this.f4409b = x0Var;
        }
        x0Var.f4526b = w0.C;
        x0Var.f4527c = false;
        this.f4413f = x0Var;
    }

    public final void b(s2.b bVar, long j9, a8.i0 i0Var) {
        y0 y0Var = this.f4412e;
        if (y0Var == null) {
            y0Var = new y0();
            y0Var.f4528b = null;
            y0Var.f4529c = Long.MAX_VALUE;
            this.f4412e = y0Var;
        }
        y0Var.f4528b = bVar;
        y0Var.f4529c = j9;
        i0Var.B = 0L;
        this.f4413f = y0Var;
    }

    public final o9.q d() {
        o9.q qVar = this.f4414g;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(s2.b bVar, s2.a aVar, long j9) {
        o0 o0Var = this.f4408a;
        long jG = b3.m.x(o0Var).G(0L);
        if (!h2.b.b(this.f4415h, 9205357640488583168L) && !h2.b.b(jG, this.f4415h)) {
            this.l = h2.b.f(this.l, h2.b.e(jG, this.f4415h));
        }
        this.f4415h = jG;
        q1 q1Var = o0Var.Q;
        kotlin.jvm.internal.m.b(q1Var);
        q0 q0Var = r0.f4499a;
        if (Math.abs(Float.intBitsToFloat((int) (q1Var == q1.A ? j9 & 4294967295L : j9 >> 32))) > 2.0f) {
            g3.a(d(), bVar, o0Var.Q, aVar, this.f4417j, this.l);
            qd.j0 j0Var = this.f4418k;
            u.y yVar = (u.y) j0Var.C;
            int i10 = yVar.f14912b;
            if (i10 == 3) {
                int i11 = j0Var.B;
                j0Var.B = i11 + 1;
                if (i11 < 0 || i11 >= i10) {
                    v.a.d("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = yVar.f14911a;
                long j10 = jArr[i11];
                jArr[i11] = j9;
            } else {
                yVar.a(j9);
            }
            if (j0Var.B == 3) {
                j0Var.B = 0;
            }
            long[] jArr2 = yVar.f14911a;
            int i12 = yVar.f14912b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i13] >> 32));
            }
            int i14 = yVar.f14912b;
            float f3 = fIntBitsToFloat2 / i14;
            long[] jArr3 = yVar.f14911a;
            for (int i15 = 0; i15 < i14; i15++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i15] & 4294967295L));
            }
            o0Var.M1(new u(true, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / yVar.f14912b)) & 4294967295L)));
        }
    }

    public final void f(s2.b bVar, s2.b bVar2, s2.a aVar, long j9) {
        if (this.f4414g == null) {
            this.f4414g = new o9.q(28);
        }
        this.l = 0L;
        o9.q qVarD = d();
        o0 o0Var = this.f4408a;
        g3.a(qVarD, bVar, o0Var.Q, aVar, this.f4417j, this.l);
        long jE = h2.b.e(g3.h(bVar2, o0Var.Q, aVar), j9);
        if (((Boolean) o0Var.R.invoke(new v2.a0(1))).booleanValue()) {
            this.f4415h = b3.m.x(o0Var).G(0L);
            o0Var.M1(new v(jE));
        }
        qd.j0 j0Var = this.f4418k;
        j0Var.B = 0;
        ((u.y) j0Var.C).f14912b = 0;
    }
}
