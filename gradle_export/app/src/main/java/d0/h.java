package d0;

public final class h extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final long C;
    public Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public h(n3 n3Var, i iVar, c cVar, long j9, a40.e1 e1Var, k00.c cVar2) {
        super(2, cVar2);
        this.E = n3Var;
        this.F = iVar;
        this.G = cVar;
        this.C = j9;
        this.H = e1Var;
    }

    public h(e1.q qVar, String str, long j9, m3.q0 q0Var, e1.v0 v0Var, r3.p pVar, k00.c cVar) {
        super(2, cVar);
        this.D = qVar;
        this.E = str;
        this.C = j9;
        this.F = q0Var;
        this.G = v0Var;
        this.H = pVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                h hVar = new h((n3) this.E, (i) this.F, (c) this.G, this.C, (a40.e1) this.H, cVar);
                hVar.D = obj;
                return hVar;
            default:
                return new h((e1.q) this.D, (String) this.E, this.C, (m3.q0) this.F, (e1.v0) this.G, (r3.p) this.H, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((s2) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                c cVar = (c) this.G;
                i iVar = (i) this.F;
                n3 n3Var = (n3) this.E;
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    s2 s2Var = (s2) this.D;
                    n3Var.f4475e = i.B1(iVar, cVar, this.C);
                    b1.l lVar = new b1.l(iVar, n3Var, (a40.e1) this.H, s2Var);
                    g gVar = new g(iVar, n3Var, cVar, 0);
                    this.B = 1;
                    if (n3Var.a(lVar, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                r3.p pVar = (r3.p) this.H;
                String str = (String) this.E;
                e1.v0 v0Var = (e1.v0) this.G;
                g00.b0 b0Var = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    e1.q qVar = (e1.q) this.D;
                    this.B = 1;
                    qVar.getClass();
                    if (str.length() == 0) {
                        obj = null;
                    } else {
                        long j9 = this.C;
                        if (m3.q0.d(j9)) {
                            obj = null;
                        } else {
                            obj = a40.c0.J(new a1.g(qVar, new e1.p(j9, qVar, str, null), (k00.c) null), qVar.f4984a, this);
                        }
                    }
                    if (obj != b0Var) {
                    }
                    return b0Var;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(obj);
                m3.q0 q0Var = (m3.q0) obj;
                b0Var = g00.b0.a;
                if (q0Var != null) {
                    long j10 = q0Var.f10520a;
                    long jB = m3.h0.b(pVar.k((int) (j10 >> 32)), pVar.k((int) (j10 & 4294967295L)));
                    if (!m3.q0.b((m3.q0) this.F, jB) && kotlin.jvm.internal.m.a(v0Var.n().f13099a.B, str) && pVar == v0Var.f5016b) {
                        v0Var.f5017c.invoke(e1.v0.e(v0Var.n().f13099a, jB));
                        v0Var.f5035w = new m3.q0(jB);
                    }
                }
                return b0Var;
        }
    }
}
