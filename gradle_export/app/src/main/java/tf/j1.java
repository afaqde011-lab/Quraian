package tf;

public final class j1 implements Runnable {
    public final int A;
    public final g4 B;
    public final n1 C;

    public j1(n1 n1Var, g4 g4Var, int i10) {
        this.A = i10;
        this.B = g4Var;
        this.C = n1Var;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.A) {
            case 0:
                n1 n1Var = this.C;
                n1Var.f14673e.x();
                y3 y3Var = n1Var.f14673e;
                y3Var.C().V0();
                y3Var.j0();
                g4 g4Var = this.B;
                com.google.android.gms.common.internal.d0.h(g4Var);
                String str = g4Var.A;
                com.google.android.gms.common.internal.d0.e(str);
                int i10 = 0;
                if (y3Var.b0().f1(null, b0.f14605z0)) {
                    ((ve.b) y3Var.k0()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iD1 = y3Var.b0().d1(null, b0.f14570i0);
                    y3Var.b0();
                    long jLongValue = jCurrentTimeMillis - ((Long) b0.f14557e.a(null)).longValue();
                    while (i10 < iD1 && y3Var.F(jLongValue, null)) {
                        i10++;
                    }
                } else {
                    y3Var.b0();
                    long jIntValue = ((Integer) b0.l.a(null)).intValue();
                    while (i10 < jIntValue && y3Var.F(0L, str)) {
                        i10++;
                    }
                }
                if (y3Var.b0().f1(null, b0.A0)) {
                    y3Var.C().V0();
                    y3Var.E();
                }
                v3 v3Var = y3Var.J;
                int iB = a1.b.b(g4Var.f14623e0);
                v3Var.V0();
                if (iB == 2 && !v3.Y0(str)) {
                    a1 a1Var = v3Var.C.A;
                    y3.R(a1Var);
                    com.google.android.gms.internal.measurement.e2 e2VarH1 = a1Var.h1(str);
                    if (e2VarH1 != null && e2VarH1.D() && !e2VarH1.E().q().isEmpty()) {
                        y3Var.t().O.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((ve.b) y3Var.k0()).getClass();
                        y3Var.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                n1 n1Var2 = this.C;
                n1Var2.f14673e.x();
                y3 y3Var2 = n1Var2.f14673e;
                y3Var2.C().V0();
                y3Var2.j0();
                g4 g4Var2 = this.B;
                com.google.android.gms.common.internal.d0.e(g4Var2.A);
                y3Var2.Z(g4Var2);
                break;
            case 2:
                n1 n1Var3 = this.C;
                n1Var3.f14673e.x();
                y3 y3Var3 = n1Var3.f14673e;
                y3Var3.C().V0();
                y3Var3.j0();
                g4 g4Var3 = this.B;
                com.google.android.gms.common.internal.d0.e(g4Var3.A);
                y3Var3.l0(g4Var3);
                y3Var3.m0(g4Var3);
                break;
            default:
                y3 y3Var4 = this.C.f14673e;
                y3Var4.x();
                y3Var4.l0(this.B);
                break;
        }
    }
}
