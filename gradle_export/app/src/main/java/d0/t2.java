package d0;

public final class t2 extends m00.i implements u00.n {
    public long A;
    public int B;
    public long C;
    public final u2 D;

    public t2(u2 u2Var, k00.c cVar) {
        super(2, cVar);
        this.D = u2Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        t2 t2Var = new t2(this.D, cVar);
        t2Var.C = ((y3.q) obj).f16602a;
        return t2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j9 = ((y3.q) obj).f16602a;
        t2 t2Var = new t2(this.D, (k00.c) obj2);
        t2Var.C = j9;
        return t2Var.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        u2 u2Var = this.D;
        if (i10 == 0) {
            ri.t1.O(obj);
            j9 = this.C;
            u2.d dVar = u2Var.f4517f;
            this.C = j9;
            this.B = 1;
            obj = dVar.b(j9, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            j9 = this.C;
            ri.t1.O(obj);
        } else {
            if (i10 == 2) {
                j10 = this.A;
                j9 = this.C;
                ri.t1.O(obj);
                j11 = ((y3.q) obj).f16602a;
                u2.d dVar2 = u2Var.f4517f;
                long jD = y3.q.d(j10, j11);
                this.C = j9;
                this.A = j11;
                this.B = 3;
                obj = dVar2.a(jD, j11, this);
                if (obj != aVar) {
                    j12 = j9;
                    j13 = j11;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.A;
            j12 = this.C;
            ri.t1.O(obj);
        }
        return new y3.q(y3.q.d(j12, y3.q.d(j13, ((y3.q) obj).f16602a)));
        long jD2 = y3.q.d(j9, ((y3.q) obj).f16602a);
        this.C = j9;
        this.A = jD2;
        this.B = 2;
        obj = u2Var.a(jD2, this);
        if (obj != aVar) {
            j10 = jD2;
            j11 = ((y3.q) obj).f16602a;
            u2.d dVar3 = u2Var.f4517f;
            long jD3 = y3.q.d(j10, j11);
            this.C = j9;
            this.A = j11;
            this.B = 3;
            obj = dVar3.a(jD3, j11, this);
            if (obj != aVar) {
                j12 = j9;
                j13 = j11;
                return new y3.q(y3.q.d(j12, y3.q.d(j13, ((y3.q) obj).f16602a)));
            }
        }
        return aVar;
    }
}
