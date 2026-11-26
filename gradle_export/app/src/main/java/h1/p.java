package h1;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import d0.f3;
import d40.p1;
import g1.k8;
import ri.t1;

public final class p extends m00.h implements u00.n {
    public d40.x0 B;
    public v2.l C;
    public long D;
    public int E;
    public Object F;
    public final a40.z G;
    public final k8 H;

    public p(a40.z zVar, k8 k8Var, k00.c cVar) {
        super(2, cVar);
        this.G = zVar;
        this.H = k8Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        p pVar = new p(this.G, this.H, cVar);
        pVar.F = obj;
        return pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        long j9;
        v2.i0 i0Var;
        v2.l lVar;
        v2.l lVar2;
        v2.l lVar3;
        v2.l lVar4;
        ?? r4;
        v2.s sVar;
        l00.a aVar = l00.a.A;
        ?? r7 = this.E;
        k00.c cVar = null;
        try {
            if (r7 == 0) {
                t1.O(obj);
                v2.i0 i0Var2 = (v2.i0) this.F;
                v2.l lVarC = d40.o.c(Boolean.FALSE);
                long jB = i0Var2.f().b();
                v2.l lVar5 = v2.l.A;
                this.F = i0Var2;
                this.B = lVarC;
                this.C = lVar5;
                this.D = jB;
                this.E = 1;
                Object objB = f3.b(i0Var2, this, 1);
                if (objB != aVar) {
                    j9 = jB;
                    i0Var = i0Var2;
                    obj = objB;
                    lVar2 = lVarC;
                    lVar = lVar5;
                }
                return aVar;
            }
            if (r7 != 1) {
                if (r7 != 2) {
                    if (r7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r13 = (d40.x0) this.F;
                    try {
                        t1.O(obj);
                        r4 = r7;
                        r13 = r13;
                        sVar = (v2.s) obj;
                        if (sVar != null) {
                            sVar.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        p1 p1Var = (p1) r13;
                        p1Var.getClass();
                        p1Var.k((Object) null, bool);
                        r7 = r4;
                        return g00.b0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        Boolean bool2 = Boolean.FALSE;
                        p1 p1Var2 = (p1) r13;
                        p1Var2.getClass();
                        p1Var2.k((Object) null, bool2);
                        throw th;
                    }
                }
                v2.l lVar6 = this.C;
                v2.l lVar7 = this.B;
                i0Var = (v2.i0) this.F;
                try {
                    t1.O(obj);
                    lVar4 = lVar6;
                    lVar3 = lVar7;
                    Boolean bool3 = Boolean.FALSE;
                    p1 p1Var3 = (p1) lVar3;
                    p1Var3.getClass();
                    p1Var3.k((Object) null, bool3);
                    r7 = lVar4;
                } catch (PointerEventTimeoutCancellationException unused) {
                    lVar = lVar6;
                    lVar2 = lVar7;
                    a40.c0.y(this.G, (k00.i) null, a40.a0.D, new ev.p(lVar2, this.H, (k00.c) null, 12), 1);
                    this.F = lVar2;
                    this.B = null;
                    this.C = null;
                    this.E = 3;
                    obj = f3.i(i0Var, lVar, this);
                    if (obj != aVar) {
                        r13 = lVar2;
                        r4 = lVar2;
                        sVar = (v2.s) obj;
                        if (sVar != null) {
                            sVar.a();
                        }
                        Boolean bool4 = Boolean.FALSE;
                        p1 p1Var4 = (p1) r13;
                        p1Var4.getClass();
                        p1Var4.k((Object) null, bool4);
                        r7 = r4;
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    r13 = lVar7;
                    Boolean bool5 = Boolean.FALSE;
                    p1 p1Var5 = (p1) r13;
                    p1Var5.getClass();
                    p1Var5.k((Object) null, bool5);
                    throw th;
                }
                return g00.b0.a;
            }
            long j10 = this.D;
            v2.l lVar8 = this.C;
            v2.l lVar9 = this.B;
            v2.i0 i0Var3 = (v2.i0) this.F;
            t1.O(obj);
            lVar = lVar8;
            lVar2 = lVar9;
            j9 = j10;
            i0Var = i0Var3;
            long j11 = j9;
            int i10 = ((v2.s) obj).f15407i;
            if (i10 == 1 || i10 == 3) {
                try {
                    b1.v vVar = new b1.v(lVar, cVar, 2);
                    this.F = i0Var;
                    this.B = lVar2;
                    this.C = lVar;
                    this.E = 2;
                    if (i0Var.i(j11, vVar, this) != aVar) {
                        lVar3 = lVar2;
                        lVar4 = lVar2;
                        Boolean bool6 = Boolean.FALSE;
                        p1 p1Var6 = (p1) lVar3;
                        p1Var6.getClass();
                        p1Var6.k((Object) null, bool6);
                        r7 = lVar4;
                    }
                } catch (PointerEventTimeoutCancellationException unused2) {
                    a40.c0.y(this.G, (k00.i) null, a40.a0.D, new ev.p(lVar2, this.H, (k00.c) null, 12), 1);
                    this.F = lVar2;
                    this.B = null;
                    this.C = null;
                    this.E = 3;
                    obj = f3.i(i0Var, lVar, this);
                    if (obj != aVar) {
                        r13 = lVar2;
                        r4 = lVar2;
                        sVar = (v2.s) obj;
                        if (sVar != null) {
                            sVar.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        p1 p1Var7 = (p1) r13;
                        p1Var7.getClass();
                        p1Var7.k((Object) null, bool7);
                        r7 = r4;
                        return g00.b0.a;
                    }
                }
                return aVar;
            }
            return g00.b0.a;
        } catch (Throwable th4) {
            th = th4;
            r13 = r7;
        }
    }
}
