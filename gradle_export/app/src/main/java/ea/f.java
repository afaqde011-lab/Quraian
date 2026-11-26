package ea;

import a1.u0;
import a10.h0;
import com.google.android.gms.internal.measurement.g4;
import d0.i2;
import qd.s0;
import ri.t1;

public final class f implements b {
    public final w A;
    public final w B;
    public final gj.e C;
    public final ThreadLocal D;
    public volatile boolean E;
    public final long F;
    public final int G;

    public f(u0 u0Var) {
        this.C = new gj.e(10);
        this.D = new ThreadLocal();
        s30.a aVar = s30.b.B;
        this.F = g4.b0(30, s30.d.E);
        this.G = 2;
        w wVar = new w(1, new a1.z(u0Var, 25));
        this.A = wVar;
        this.B = wVar;
    }

    public f(final u0 u0Var, final String str, int i10) {
        kotlin.jvm.internal.m.e(str, "fileName");
        this.C = new gj.e(10);
        this.D = new ThreadLocal();
        s30.a aVar = s30.b.B;
        this.F = g4.b0(30, s30.d.E);
        this.G = 2;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        final int i11 = 0;
        this.A = new w(i10, new u00.a() {
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        ma.a aVarG = u0Var.g(str);
                        h0.v(aVarG, "PRAGMA query_only = 1");
                        return aVarG;
                    default:
                        return u0Var.g(str);
                }
            }
        });
        final int i12 = 1;
        this.B = new w(1, new u00.a() {
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        ma.a aVarG = u0Var.g(str);
                        h0.v(aVarG, "PRAGMA query_only = 1");
                        return aVarG;
                    default:
                        return u0Var.g(str);
                }
            }
        });
    }

    @Override
    public final void close() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.A.c();
        this.B.c();
    }

    @Override
    public final Object j(boolean z10, u00.n nVar, m00.c cVar) {
        e eVar;
        kotlin.jvm.internal.z zVar;
        Throwable th2;
        w wVar;
        k00.i context;
        u00.n nVar2;
        gj.e eVar2;
        w wVar2;
        kotlin.jvm.internal.z zVar2;
        boolean z11;
        Object obj;
        kotlin.jvm.internal.z zVar3;
        d0 d0Var;
        boolean z12 = z10;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.J;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.J = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.H;
        l00.a aVar = l00.a.A;
        int i11 = eVar.J;
        k00.c cVar2 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                t1.O(objJ);
                return objJ;
            }
            if (i11 == 2) {
                t1.O(objJ);
                return objJ;
            }
            if (i11 == 3) {
                z12 = eVar.A;
                eVar2 = eVar.G;
                kotlin.jvm.internal.z zVar4 = eVar.F;
                k00.i iVar = eVar.E;
                kotlin.jvm.internal.z zVar5 = eVar.D;
                wVar2 = (w) eVar.C;
                nVar2 = (u00.n) eVar.B;
                try {
                    t1.O(objJ);
                    zVar2 = zVar4;
                    zVar = zVar5;
                    context = iVar;
                    try {
                        i iVar2 = (i) objJ;
                        iVar2.getClass();
                        kotlin.jvm.internal.m.e(context, "context");
                        iVar2.C = context;
                        iVar2.D = new Throwable();
                        if (this.A == this.B && z12) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zVar2.A = new d0(eVar2, iVar2, z11);
                        obj = zVar.A;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        d0 d0Var2 = (d0) obj;
                        a aVar2 = new a(this.C, d0Var2);
                        ThreadLocal threadLocal = this.D;
                        kotlin.jvm.internal.m.e(threadLocal, "<this>");
                        k00.i iVarP = rd.a.P(aVar2, new f40.t(d0Var2, threadLocal));
                        i2 i2Var = new i2(nVar2, zVar, (k00.c) null, 18);
                        eVar.B = wVar2;
                        eVar.C = zVar;
                        eVar.D = null;
                        eVar.E = null;
                        eVar.F = null;
                        eVar.G = null;
                        eVar.J = 4;
                        objJ = a40.c0.J(i2Var, iVarP, eVar);
                        if (objJ != aVar) {
                            zVar3 = zVar;
                            wVar = wVar2;
                        }
                        return aVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        wVar = wVar2;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    zVar = zVar5;
                    wVar = wVar2;
                    throw th2;
                }
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar3 = (kotlin.jvm.internal.z) eVar.C;
            wVar = (w) eVar.B;
            try {
                t1.O(objJ);
            } catch (Throwable th5) {
                zVar = zVar3;
                th2 = th5;
            }
            d0Var = (d0) zVar3.A;
            if (d0Var != null) {
                if (!d0Var.f5219e) {
                    d0Var.f5219e = true;
                    if (d0Var.f5216b.A.g()) {
                        h0.v(d0Var.f5216b, "ROLLBACK TRANSACTION");
                    }
                }
                i iVar3 = d0Var.f5216b;
                iVar3.C = null;
                iVar3.D = null;
                wVar.e(iVar3);
            }
            return objJ;
        }
        t1.O(objJ);
        if (this.E) {
            h0.M(21, "Connection pool is closed");
            throw null;
        }
        d0 d0Var3 = (d0) this.D.get();
        if (d0Var3 == null) {
            a aVar3 = (a) eVar.getContext().get(this.C);
            d0Var3 = aVar3 != null ? aVar3.B : null;
        }
        if (d0Var3 == null) {
            w wVar3 = z12 ? this.A : this.B;
            zVar = new kotlin.jvm.internal.z();
            try {
                context = eVar.getContext();
                gj.e eVar3 = this.C;
                long j9 = this.F;
                d dVar = new d(this, z12);
                eVar.B = nVar;
                eVar.C = wVar3;
                eVar.D = zVar;
                eVar.E = context;
                eVar.F = zVar;
                eVar.G = eVar3;
                eVar.A = z12;
                eVar.J = 3;
                Object objB = wVar3.b(j9, dVar, eVar);
                if (objB != aVar) {
                    nVar2 = nVar;
                    eVar2 = eVar3;
                    wVar2 = wVar3;
                    objJ = objB;
                    zVar2 = zVar;
                    i iVar4 = (i) objJ;
                    iVar4.getClass();
                    kotlin.jvm.internal.m.e(context, "context");
                    iVar4.C = context;
                    iVar4.D = new Throwable();
                    if (this.A == this.B) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    zVar2.A = new d0(eVar2, iVar4, z11);
                    obj = zVar.A;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    d0 d0Var4 = (d0) obj;
                    a aVar4 = new a(this.C, d0Var4);
                    ThreadLocal threadLocal2 = this.D;
                    kotlin.jvm.internal.m.e(threadLocal2, "<this>");
                    k00.i iVarP2 = rd.a.P(aVar4, new f40.t(d0Var4, threadLocal2));
                    i2 i2Var2 = new i2(nVar2, zVar, (k00.c) null, 18);
                    eVar.B = wVar2;
                    eVar.C = zVar;
                    eVar.D = null;
                    eVar.E = null;
                    eVar.F = null;
                    eVar.G = null;
                    eVar.J = 4;
                    objJ = a40.c0.J(i2Var2, iVarP2, eVar);
                    if (objJ != aVar) {
                        zVar3 = zVar;
                        wVar = wVar2;
                        d0Var = (d0) zVar3.A;
                        if (d0Var != null) {
                            if (!d0Var.f5219e) {
                                d0Var.f5219e = true;
                                if (d0Var.f5216b.A.g()) {
                                    h0.v(d0Var.f5216b, "ROLLBACK TRANSACTION");
                                }
                            }
                            i iVar5 = d0Var.f5216b;
                            iVar5.C = null;
                            iVar5.D = null;
                            wVar.e(iVar5);
                        }
                        return objJ;
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                wVar = wVar3;
            }
        } else {
            if (!z12 && d0Var3.f5217c) {
                h0.M(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (eVar.getContext().get(this.C) == null) {
                a aVar5 = new a(this.C, d0Var3);
                ThreadLocal threadLocal3 = this.D;
                kotlin.jvm.internal.m.e(threadLocal3, "<this>");
                k00.i iVarP3 = rd.a.P(aVar5, new f40.t(d0Var3, threadLocal3));
                i2 i2Var3 = new i2(nVar, d0Var3, cVar2, 17);
                eVar.J = 1;
                Object objJ2 = a40.c0.J(i2Var3, iVarP3, eVar);
                if (objJ2 != aVar) {
                    return objJ2;
                }
            } else {
                eVar.J = 2;
                Object objInvoke = nVar.invoke(d0Var3, eVar);
                if (objInvoke != aVar) {
                    return objInvoke;
                }
            }
        }
        return aVar;
        try {
            throw th2;
        } catch (Throwable th7) {
            try {
                d0 d0Var5 = (d0) zVar.A;
                if (d0Var5 == null) {
                    throw th7;
                }
                if (!d0Var5.f5219e) {
                    d0Var5.f5219e = true;
                    if (d0Var5.f5216b.A.g()) {
                        h0.v(d0Var5.f5216b, "ROLLBACK TRANSACTION");
                    }
                }
                i iVar6 = d0Var5.f5216b;
                iVar6.C = null;
                iVar6.D = null;
                wVar.e(iVar6);
                throw th7;
            } catch (Throwable th8) {
                s0.V(th2, th8);
                throw th7;
            }
        }
    }
}
