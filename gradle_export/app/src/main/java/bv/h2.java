package bv;

import com.google.android.gms.internal.measurement.y3;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;

public final class h2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public boolean C;
    public final Object D;

    public h2(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
    }

    public h2(Object obj, boolean z, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.C = z;
    }

    public h2(boolean z, jz.d0 d0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = z;
        this.D = d0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                h2 h2Var = new h2((e3) this.D, cVar, 0);
                h2Var.C = ((Boolean) obj).booleanValue();
                return h2Var;
            case 1:
                return new h2((e1.v0) this.D, this.C, cVar, 1);
            case 2:
                return new h2(this.C, (jz.d0) this.D, cVar);
            case 3:
                h2 h2Var2 = new h2((AudioPlayerService) this.D, cVar, 3);
                h2Var2.C = ((Boolean) obj).booleanValue();
                return h2Var2;
            default:
                return new h2((nx.p0) this.D, this.C, cVar, 4);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((h2) create(bool, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((h2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((h2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((h2) create(bool2, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((h2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        m3.h hVarJ;
        c3.i iVar;
        switch (this.A) {
            case 0:
                g00.b0 b0Var = g00.b0.a;
                boolean z = this.C;
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    if (z) {
                        return b0Var;
                    }
                    this.C = z;
                    this.B = 1;
                    if (a40.c0.l(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                ((e3) this.D).D.F();
                return b0Var;
            case 1:
                e1.v0 v0Var = (e1.v0) this.D;
                g00.b0 b0Var2 = g00.b0.a;
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var2;
                }
                ri.t1.O(obj);
                boolean z2 = this.C;
                if (m3.q0.d(v0Var.n().b) || (v0Var.f instanceof r3.q)) {
                    hVarJ = null;
                } else {
                    hVarJ = y3.J(v0Var.n());
                    if (z2) {
                        int iF = m3.q0.f(v0Var.n().b);
                        v0Var.c.invoke(e1.v0.e(v0Var.n().a, m3.h0.b(iF, iF)));
                        v0Var.q(q0.z0.A);
                    }
                }
                if (hVarJ == null || (iVar = v0Var.h) == null) {
                    return b0Var2;
                }
                c3.e1 e1VarA = g0.b.a(hVarJ);
                this.B = 1;
                iVar.a(e1VarA);
                return b0Var2 == aVar2 ? aVar2 : b0Var2;
            case 2:
                jz.d0 d0Var = (jz.d0) this.D;
                vp.x xVar = d0Var.d;
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ri.t1.O(obj);
                        ((g00.n) obj).getClass();
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                        ((g00.n) obj).getClass();
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                if (this.C) {
                    d0Var.q(jz.z.a((jz.z) d0Var.c.d.getValue(), null, null, null, false, true, 1048575));
                }
                this.B = 1;
                if (xVar.f(this) == aVar3) {
                    return aVar3;
                }
                this.B = 2;
                if (xVar.y(this) == aVar3) {
                    return aVar3;
                }
                return g00.b0.a;
            case 3:
                AudioPlayerService audioPlayerService = (AudioPlayerService) this.D;
                boolean z3 = this.C;
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    ri.t1.O(obj);
                    if (!z3) {
                        int i5 = AudioPlayerService.j0;
                        nn.k kVar = (nn.k) audioPlayerService.V.getValue();
                        long jE = audioPlayerService.A().e();
                        kVar.getClass();
                        kVar.f = jE / ((long) 60);
                        kVar.c.a(sn.l.B);
                        return g00.b0.a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                do {
                    int i6 = AudioPlayerService.j0;
                    nn.k kVar2 = (nn.k) audioPlayerService.V.getValue();
                    long jE2 = audioPlayerService.A().e();
                    kVar2.getClass();
                    long j = jE2 / ((long) 60);
                    if (j != kVar2.f) {
                        kVar2.f = j;
                        kVar2.c.a(sn.l.B);
                    }
                    this.C = z3;
                    this.B = 1;
                } while (a40.c0.l(15000L, this) != aVar4);
                return aVar4;
            default:
                nx.p0 p0Var = (nx.p0) this.D;
                l00.a aVar5 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    ri.t1.O(obj);
                    tq.k kVar3 = p0Var.g;
                    int reciterType = p0Var.d.getReciterType();
                    this.B = 1;
                    if (kVar3.d(reciterType, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                if (!this.C) {
                    tx.a aVar6 = p0Var.m;
                    aVar6.getClass();
                    aVar6.b(ux.a.B);
                }
                return g00.b0.a;
        }
    }
}
