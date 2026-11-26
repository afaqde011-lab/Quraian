package a8;

public final class a0 implements d0 {

    public final e7.q f196a;

    public final e7.q f197b;

    public long f198c;

    public a0(long j9, long[] jArr, long[] jArr2) {
        ta.c0.s(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f196a = new e7.q(length);
            this.f197b = new e7.q(length);
        } else {
            int i10 = length + 1;
            e7.q qVar = new e7.q(i10);
            this.f196a = qVar;
            e7.q qVar2 = new e7.q(i10);
            this.f197b = qVar2;
            qVar.a(0L);
            qVar2.a(0L);
        }
        this.f196a.b(jArr);
        this.f197b.b(jArr2);
        this.f198c = j9;
    }

    @Override
    public final boolean b() {
        return this.f197b.f5166b > 0;
    }

    @Override
    public final c0 d(long j9) {
        e7.q qVar = this.f197b;
        if (qVar.f5166b == 0) {
            e0 e0Var = e0.f252c;
            return new c0(e0Var, e0Var);
        }
        int iC = e7.i0.c(qVar, j9);
        long jD = qVar.d(iC);
        e7.q qVar2 = this.f196a;
        e0 e0Var2 = new e0(jD, qVar2.d(iC));
        if (jD == j9 || iC == qVar.f5166b - 1) {
            return new c0(e0Var2, e0Var2);
        }
        int i10 = iC + 1;
        return new c0(e0Var2, new e0(qVar.d(i10), qVar2.d(i10)));
    }

    @Override
    public final long f() {
        return this.f198c;
    }
}
