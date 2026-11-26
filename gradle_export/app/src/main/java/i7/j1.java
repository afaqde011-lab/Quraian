package i7;

public final class j1 {

    public boolean f7380a;

    public boolean f7381b;

    public int f7382c;

    public int f7383d;

    public Object f7384e;

    public Object f7385f;

    public static void b(a aVar) {
        int i10 = aVar.H;
        if (i10 == 2) {
            ta.c0.A(i10 == 2);
            aVar.H = 1;
            aVar.t();
        }
    }

    public static boolean h(a aVar) {
        return aVar.H != 0;
    }

    public static void l(a aVar, long j9) {
        aVar.N = true;
        if (aVar instanceof u7.e) {
            u7.e eVar = (u7.e) aVar;
            ta.c0.A(eVar.N);
            eVar.f14999k0 = j9;
        }
    }

    public void a(a aVar, h hVar) {
        ta.c0.A(((a) this.f7384e) == aVar || ((a) this.f7385f) == aVar);
        if (h(aVar)) {
            if (aVar == hVar.C) {
                hVar.D = null;
                hVar.C = null;
                hVar.E = true;
            }
            b(aVar);
            ta.c0.A(aVar.H == 1);
            aVar.C.m();
            aVar.H = 0;
            aVar.I = null;
            aVar.J = null;
            aVar.N = false;
            aVar.n();
            aVar.Q = null;
        }
    }

    public int c() {
        boolean zH = h((a) this.f7384e);
        a aVar = (a) this.f7385f;
        return (zH ? 1 : 0) + ((aVar == null || !h(aVar)) ? 0 : 1);
    }

    public a d(o0 o0Var) {
        s7.a1 a1Var;
        if (o0Var != null && (a1Var = o0Var.f7426c[this.f7382c]) != null) {
            a aVar = (a) this.f7384e;
            if (aVar.I == a1Var) {
                return aVar;
            }
            a aVar2 = (a) this.f7385f;
            if (aVar2 != null && aVar2.I == a1Var) {
                return aVar2;
            }
        }
        return null;
    }

    public boolean e(o0 o0Var, a aVar) {
        o0 o0Var2;
        int i10 = this.f7382c;
        if (aVar != null) {
            s7.a1 a1Var = o0Var.f7426c[i10];
            s7.a1 a1Var2 = aVar.I;
            if (a1Var2 != null) {
                if (a1Var2 != a1Var) {
                    o0Var2 = o0Var.m;
                    if (o0Var2 != null || o0Var2.f7426c[i10] != aVar.I) {
                    }
                } else if (a1Var != null && !aVar.j()) {
                    o0 o0Var3 = o0Var.m;
                    if (!o0Var.f7430g.f7444g || o0Var3 == null || !o0Var3.f7428e || (!(aVar instanceof u7.e) && !(aVar instanceof q7.b) && aVar.M < o0Var3.e())) {
                        o0Var2 = o0Var.m;
                        return o0Var2 != null ? false : false;
                    }
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i10 = this.f7383d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public boolean g() {
        int i10 = this.f7383d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return h((a) this.f7384e);
        }
        a aVar = (a) this.f7385f;
        aVar.getClass();
        return aVar.H != 0;
    }

    public void i(boolean z10) {
        if (z10) {
            if (this.f7380a) {
                a aVar = (a) this.f7384e;
                ta.c0.A(aVar.H == 0);
                aVar.C.m();
                aVar.r();
                this.f7380a = false;
                return;
            }
            return;
        }
        if (this.f7381b) {
            a aVar2 = (a) this.f7385f;
            aVar2.getClass();
            ta.c0.A(aVar2.H == 0);
            aVar2.C.m();
            aVar2.r();
            this.f7381b = false;
        }
    }

    public int j(a aVar, o0 o0Var, v7.u uVar, h hVar) {
        int i10;
        a aVar2 = (a) this.f7384e;
        int i11 = this.f7382c;
        if (aVar == null || aVar.H == 0 || (aVar == aVar2 && ((i10 = this.f7383d) == 2 || i10 == 4))) {
            return 1;
        }
        if (aVar == ((a) this.f7385f) && this.f7383d == 3) {
            return 1;
        }
        Object[] objArr = aVar.I != o0Var.f7426c[i11];
        boolean zB = uVar.b(i11);
        if (!zB || objArr != false) {
            if (!aVar.N) {
                v7.r rVar = uVar.f15530c[i11];
                int length = rVar != null ? rVar.length() : 0;
                androidx.media3.common.t[] tVarArr = new androidx.media3.common.t[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVar.getClass();
                    tVarArr[i12] = rVar.h(i12);
                }
                s7.a1 a1Var = o0Var.f7426c[i11];
                a1Var.getClass();
                aVar.y(tVarArr, a1Var, o0Var.e(), o0Var.f7437p, o0Var.f7430g.f7438a);
                return 3;
            }
            if (!aVar.k()) {
                return 0;
            }
            a(aVar, hVar);
            if (!zB || f()) {
                i(aVar == aVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((a) this.f7384e)) {
            i(true);
        }
        a aVar = (a) this.f7385f;
        if (aVar == null || aVar.H != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i10;
        a aVar = (a) this.f7384e;
        int i11 = aVar.H;
        if (i11 == 1 && this.f7383d != 4) {
            ta.c0.A(i11 == 1);
            aVar.H = 2;
            aVar.s();
            return;
        }
        a aVar2 = (a) this.f7385f;
        if (aVar2 == null || (i10 = aVar2.H) != 1 || this.f7383d == 3) {
            return;
        }
        ta.c0.A(i10 == 1);
        aVar2.H = 2;
        aVar2.s();
    }
}
