package s7;

public final class b implements a1 {
    public final a1 A;
    public boolean B;
    public final c C;

    public b(c cVar, a1 a1Var) {
        this.C = cVar;
        this.A = a1Var;
    }

    @Override
    public final void a() {
        this.A.a();
    }

    @Override
    public final boolean b() {
        return !this.C.b() && this.A.b();
    }

    @Override
    public final int l(long j9) {
        if (this.C.b()) {
            return -3;
        }
        return this.A.l(j9);
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        c cVar = this.C;
        if (cVar.b()) {
            return -3;
        }
        if (this.B) {
            eVar.B = 4;
            return -4;
        }
        long jT = cVar.t();
        int iN = this.A.n(bVar, eVar, i10);
        if (iN != -5) {
            long j9 = cVar.F;
            if (j9 == Long.MIN_VALUE || ((iN != -4 || eVar.G < j9) && !(iN == -3 && jT == Long.MIN_VALUE && !eVar.F))) {
                return iN;
            }
            eVar.q();
            eVar.B = 4;
            this.B = true;
            return -4;
        }
        androidx.media3.common.t tVar = (androidx.media3.common.t) bVar.B;
        tVar.getClass();
        int i11 = tVar.J;
        int i12 = tVar.I;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (cVar.E != 0) {
            i12 = 0;
        }
        if (cVar.F != Long.MIN_VALUE) {
            i11 = 0;
        }
        androidx.media3.common.s sVarA = tVar.a();
        sVarA.H = i12;
        sVarA.I = i11;
        bVar.B = new androidx.media3.common.t(sVarA);
        return -5;
    }
}
