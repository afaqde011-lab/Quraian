package d0;

public final class g2 implements u2.a {
    public final u2 A;
    public boolean B;

    public g2(u2 u2Var, boolean z10) {
        this.A = u2Var;
        this.B = z10;
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        if (!this.B) {
            return 0L;
        }
        u2 u2Var = this.A;
        if (u2Var.f4512a.a()) {
            return 0L;
        }
        return u2Var.h(u2Var.d(u2Var.f4512a.e(u2Var.d(u2Var.g(j10)))));
    }

    @Override
    public final Object a0(long j9, long j10, k00.c cVar) throws Throwable {
        f2 f2Var;
        long jD;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i10 = f2Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f2Var.D = i10 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(this, (m00.c) cVar);
            }
        } else {
            f2Var = new f2(this, (m00.c) cVar);
        }
        Object objA = f2Var.B;
        l00.a aVar = l00.a.A;
        int i11 = f2Var.D;
        if (i11 == 0) {
            ri.t1.O(objA);
            jD = 0;
            if (this.B) {
                u2 u2Var = this.A;
                if (!u2Var.f4520i) {
                    f2Var.A = j10;
                    f2Var.D = 1;
                    objA = u2Var.a(j10, f2Var);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = y3.q.d(j10, jD);
            }
            return new y3.q(jD);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = f2Var.A;
        ri.t1.O(objA);
        jD = ((y3.q) objA).f16602a;
        jD = y3.q.d(j10, jD);
        return new y3.q(jD);
    }
}
