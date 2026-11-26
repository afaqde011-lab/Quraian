package d0;

public final class t1 implements y3.c {
    public final y3.c A;
    public boolean B;
    public boolean C;
    public final j40.c D = new j40.c(false);

    public t1(y3.c cVar) {
        this.A = cVar;
    }

    @Override
    public final float A0(float f3) {
        return this.A.A0(f3);
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
    }

    public final void a() {
        this.C = true;
        j40.c cVar = this.D;
        if (cVar.e()) {
            cVar.i((Object) null);
        }
    }

    @Override
    public final long b0(float f3) {
        return this.A.b0(f3);
    }

    @Override
    public final long b1(long j9) {
        return this.A.b1(j9);
    }

    @Override
    public final float c() {
        return this.A.c();
    }

    public final void d() {
        this.B = true;
        j40.c cVar = this.D;
        if (cVar.e()) {
            cVar.i((Object) null);
        }
    }

    public final Object e(m00.c cVar) {
        r1 r1Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i10 = r1Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r1Var.C = i10 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object obj = r1Var.A;
        l00.a aVar = l00.a.A;
        int i11 = r1Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            r1Var.C = 1;
            if (this.D.l(r1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        this.B = false;
        this.C = false;
        return g00.b0.a;
    }

    public final Object f(m00.c cVar) {
        s1 s1Var;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i10 = s1Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                s1Var.C = i10 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object obj = s1Var.A;
        l00.a aVar = l00.a.A;
        int i11 = s1Var.C;
        j40.c cVar2 = this.D;
        if (i11 == 0) {
            ri.t1.O(obj);
            if (!this.B && !this.C) {
                s1Var.C = 1;
                if (cVar2.l(s1Var) == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.B);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        cVar2.i((Object) null);
        return Boolean.valueOf(this.B);
    }

    @Override
    public final float f1(long j9) {
        return this.A.f1(j9);
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    @Override
    public final float k0(float f3) {
        return this.A.k0(f3);
    }

    @Override
    public final long r(float f3) {
        return this.A.r(f3);
    }

    @Override
    public final long t(long j9) {
        return this.A.t(j9);
    }

    @Override
    public final float t0() {
        return this.A.t0();
    }
}
