package is;

import a40.u1;
import java.time.LocalDateTime;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A;
    public j40.a B;
    public y C;
    public int D;
    public int E;
    public int F;
    public final y G;

    public r(y yVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.G = yVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r(this.G, cVar, 0);
            default:
                return new r(this.G, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((r) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        j40.a aVar;
        j40.a aVar2;
        j40.a aVar3;
        y yVar;
        int i;
        Object objN;
        int i2;
        int i3;
        Object objN2;
        Object objN3;
        Object objN4;
        Object objN5;
        y yVar2;
        u1 u1Var;
        j40.a aVar4;
        y yVar3;
        int i4;
        int i5;
        int i6;
        Throwable th;
        j40.a aVar5;
        m1 m1Var;
        LocalDateTime localDateTimeNow;
        switch (this.A) {
            case 0:
                l00.a aVar6 = l00.a.A;
                int i7 = this.F;
                g00.b0 b0Var = g00.b0.a;
                try {
                    switch (i7) {
                        case 0:
                            t1.O(obj);
                            y yVar4 = this.G;
                            aVar3 = yVar4.r;
                            this.B = aVar3;
                            this.C = yVar4;
                            this.D = 0;
                            this.F = 1;
                            if (aVar3.l(this) == aVar6) {
                                return aVar6;
                            }
                            yVar = yVar4;
                            i = 0;
                            try {
                                j jVar = yVar.a;
                                this.B = aVar3;
                                this.C = yVar;
                                this.D = i;
                                this.E = 0;
                                this.F = 2;
                                try {
                                    objN = rd.a.N(jVar.a.a.a, false, true, new ks.e(0), this);
                                    if (objN != aVar6) {
                                        objN = b0Var;
                                    }
                                    if (objN != aVar6) {
                                        objN = b0Var;
                                    }
                                    if (objN != aVar6) {
                                        objN = b0Var;
                                    }
                                    if (objN == aVar6) {
                                        return aVar6;
                                    }
                                    i2 = i;
                                    i3 = 0;
                                    c cVar = yVar.c;
                                    this.B = aVar3;
                                    this.C = yVar;
                                    this.D = i2;
                                    this.E = i3;
                                    this.F = 3;
                                    try {
                                        objN2 = rd.a.N(cVar.a.a.a, false, true, new hx.t(26), this);
                                        if (objN2 != aVar6) {
                                            objN2 = b0Var;
                                        }
                                        if (objN2 != aVar6) {
                                            objN2 = b0Var;
                                        }
                                        if (objN2 != aVar6) {
                                            objN2 = b0Var;
                                        }
                                        if (objN2 == aVar6) {
                                            return aVar6;
                                        }
                                        m mVar = yVar.d;
                                        this.B = aVar3;
                                        this.C = yVar;
                                        this.D = i2;
                                        this.E = i3;
                                        this.F = 4;
                                        try {
                                            objN3 = rd.a.N(mVar.a.a.a, false, true, new ks.e(1), this);
                                            if (objN3 != aVar6) {
                                                objN3 = b0Var;
                                            }
                                            if (objN3 != aVar6) {
                                                objN3 = b0Var;
                                            }
                                            if (objN3 != aVar6) {
                                                objN3 = b0Var;
                                            }
                                            if (objN3 == aVar6) {
                                                return aVar6;
                                            }
                                            f fVar = yVar.b;
                                            this.B = aVar3;
                                            this.C = yVar;
                                            this.D = i2;
                                            this.E = i3;
                                            this.F = 5;
                                            try {
                                                objN4 = rd.a.N(fVar.a.a.a, false, true, new hx.t(28), this);
                                                if (objN4 != aVar6) {
                                                    objN4 = b0Var;
                                                }
                                                if (objN4 != aVar6) {
                                                    objN4 = b0Var;
                                                }
                                                if (objN4 != aVar6) {
                                                    objN4 = b0Var;
                                                }
                                                if (objN4 == aVar6) {
                                                    return aVar6;
                                                }
                                                m1 m1Var2 = yVar.e;
                                                this.B = aVar3;
                                                this.C = yVar;
                                                this.D = i2;
                                                this.E = i3;
                                                this.F = 6;
                                                try {
                                                    objN5 = rd.a.N(m1Var2.a.a.a, false, true, new ks.e(11), this);
                                                    if (objN5 != aVar6) {
                                                        objN5 = b0Var;
                                                    }
                                                    if (objN5 != aVar6) {
                                                        objN5 = b0Var;
                                                    }
                                                    if (objN5 != aVar6) {
                                                        objN5 = b0Var;
                                                    }
                                                    if (objN5 == aVar6) {
                                                        return aVar6;
                                                    }
                                                    aVar2 = aVar3;
                                                    yVar2 = yVar;
                                                    yVar2.n.set(null);
                                                    yVar2.o.set(null);
                                                    yVar2.p.set(null);
                                                    yVar2.q.set(null);
                                                    yVar2.t.clear();
                                                    u1Var = yVar2.u;
                                                    if (u1Var != null) {
                                                        u1Var.i(null);
                                                    }
                                                    yVar2.u = null;
                                                    yVar2.s = 0L;
                                                    aVar2.i(null);
                                                    return b0Var;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    aVar2 = aVar3;
                                                    aVar2.i(null);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                th = th;
                                                aVar2 = aVar3;
                                                aVar2.i(null);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            aVar2 = aVar3;
                                            aVar2.i(null);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        aVar2 = aVar3;
                                        aVar2.i(null);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = th;
                                    aVar2 = aVar3;
                                    aVar2.i(null);
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                aVar2 = aVar3;
                                aVar2.i(null);
                                throw th;
                            }
                        case 1:
                            int i8 = this.D;
                            y yVar5 = this.C;
                            j40.a aVar7 = this.B;
                            t1.O(obj);
                            i = i8;
                            aVar3 = aVar7;
                            yVar = yVar5;
                            j jVar2 = yVar.a;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i;
                            this.E = 0;
                            this.F = 2;
                            objN = rd.a.N(jVar2.a.a.a, false, true, new ks.e(0), this);
                            if (objN != aVar6) {
                                objN = b0Var;
                            }
                            if (objN != aVar6) {
                                objN = b0Var;
                            }
                            if (objN != aVar6) {
                                objN = b0Var;
                            }
                            if (objN == aVar6) {
                                return aVar6;
                            }
                            i2 = i;
                            i3 = 0;
                            c cVar2 = yVar.c;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 3;
                            objN2 = rd.a.N(cVar2.a.a.a, false, true, new hx.t(26), this);
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 == aVar6) {
                                return aVar6;
                            }
                            m mVar2 = yVar.d;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 4;
                            objN3 = rd.a.N(mVar2.a.a.a, false, true, new ks.e(1), this);
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 == aVar6) {
                                return aVar6;
                            }
                            f fVar2 = yVar.b;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 5;
                            objN4 = rd.a.N(fVar2.a.a.a, false, true, new hx.t(28), this);
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 == aVar6) {
                                return aVar6;
                            }
                            m1 m1Var3 = yVar.e;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 6;
                            objN5 = rd.a.N(m1Var3.a.a.a, false, true, new ks.e(11), this);
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 == aVar6) {
                                return aVar6;
                            }
                            aVar2 = aVar3;
                            yVar2 = yVar;
                            yVar2.n.set(null);
                            yVar2.o.set(null);
                            yVar2.p.set(null);
                            yVar2.q.set(null);
                            yVar2.t.clear();
                            u1Var = yVar2.u;
                            if (u1Var != null) {
                                u1Var.i(null);
                            }
                            yVar2.u = null;
                            yVar2.s = 0L;
                            aVar2.i(null);
                            return b0Var;
                        case 2:
                            int i9 = this.E;
                            i2 = this.D;
                            yVar = this.C;
                            j40.a aVar8 = this.B;
                            t1.O(obj);
                            i3 = i9;
                            aVar3 = aVar8;
                            c cVar3 = yVar.c;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 3;
                            objN2 = rd.a.N(cVar3.a.a.a, false, true, new hx.t(26), this);
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 != aVar6) {
                                objN2 = b0Var;
                            }
                            if (objN2 == aVar6) {
                                return aVar6;
                            }
                            m mVar3 = yVar.d;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 4;
                            objN3 = rd.a.N(mVar3.a.a.a, false, true, new ks.e(1), this);
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 == aVar6) {
                                return aVar6;
                            }
                            f fVar3 = yVar.b;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 5;
                            objN4 = rd.a.N(fVar3.a.a.a, false, true, new hx.t(28), this);
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 == aVar6) {
                                return aVar6;
                            }
                            m1 m1Var4 = yVar.e;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 6;
                            objN5 = rd.a.N(m1Var4.a.a.a, false, true, new ks.e(11), this);
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 == aVar6) {
                                return aVar6;
                            }
                            aVar2 = aVar3;
                            yVar2 = yVar;
                            yVar2.n.set(null);
                            yVar2.o.set(null);
                            yVar2.p.set(null);
                            yVar2.q.set(null);
                            yVar2.t.clear();
                            u1Var = yVar2.u;
                            if (u1Var != null) {
                                u1Var.i(null);
                            }
                            yVar2.u = null;
                            yVar2.s = 0L;
                            aVar2.i(null);
                            return b0Var;
                        case 3:
                            int i11 = this.E;
                            i2 = this.D;
                            yVar = this.C;
                            j40.a aVar9 = this.B;
                            t1.O(obj);
                            i3 = i11;
                            aVar3 = aVar9;
                            m mVar4 = yVar.d;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 4;
                            objN3 = rd.a.N(mVar4.a.a.a, false, true, new ks.e(1), this);
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 != aVar6) {
                                objN3 = b0Var;
                            }
                            if (objN3 == aVar6) {
                                return aVar6;
                            }
                            f fVar4 = yVar.b;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 5;
                            objN4 = rd.a.N(fVar4.a.a.a, false, true, new hx.t(28), this);
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 == aVar6) {
                                return aVar6;
                            }
                            m1 m1Var5 = yVar.e;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 6;
                            objN5 = rd.a.N(m1Var5.a.a.a, false, true, new ks.e(11), this);
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 == aVar6) {
                                return aVar6;
                            }
                            aVar2 = aVar3;
                            yVar2 = yVar;
                            yVar2.n.set(null);
                            yVar2.o.set(null);
                            yVar2.p.set(null);
                            yVar2.q.set(null);
                            yVar2.t.clear();
                            u1Var = yVar2.u;
                            if (u1Var != null) {
                                u1Var.i(null);
                            }
                            yVar2.u = null;
                            yVar2.s = 0L;
                            aVar2.i(null);
                            return b0Var;
                        case 4:
                            int i12 = this.E;
                            i2 = this.D;
                            yVar = this.C;
                            j40.a aVar10 = this.B;
                            t1.O(obj);
                            i3 = i12;
                            aVar3 = aVar10;
                            f fVar5 = yVar.b;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 5;
                            objN4 = rd.a.N(fVar5.a.a.a, false, true, new hx.t(28), this);
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 != aVar6) {
                                objN4 = b0Var;
                            }
                            if (objN4 == aVar6) {
                                return aVar6;
                            }
                            m1 m1Var6 = yVar.e;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 6;
                            objN5 = rd.a.N(m1Var6.a.a.a, false, true, new ks.e(11), this);
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 == aVar6) {
                                return aVar6;
                            }
                            aVar2 = aVar3;
                            yVar2 = yVar;
                            yVar2.n.set(null);
                            yVar2.o.set(null);
                            yVar2.p.set(null);
                            yVar2.q.set(null);
                            yVar2.t.clear();
                            u1Var = yVar2.u;
                            if (u1Var != null) {
                                u1Var.i(null);
                            }
                            yVar2.u = null;
                            yVar2.s = 0L;
                            aVar2.i(null);
                            return b0Var;
                        case 5:
                            int i13 = this.E;
                            i2 = this.D;
                            yVar = this.C;
                            j40.a aVar11 = this.B;
                            t1.O(obj);
                            i3 = i13;
                            aVar3 = aVar11;
                            m1 m1Var7 = yVar.e;
                            this.B = aVar3;
                            this.C = yVar;
                            this.D = i2;
                            this.E = i3;
                            this.F = 6;
                            objN5 = rd.a.N(m1Var7.a.a.a, false, true, new ks.e(11), this);
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 != aVar6) {
                                objN5 = b0Var;
                            }
                            if (objN5 == aVar6) {
                                return aVar6;
                            }
                            aVar2 = aVar3;
                            yVar2 = yVar;
                            yVar2.n.set(null);
                            yVar2.o.set(null);
                            yVar2.p.set(null);
                            yVar2.q.set(null);
                            yVar2.t.clear();
                            u1Var = yVar2.u;
                            if (u1Var != null) {
                                u1Var.i(null);
                            }
                            yVar2.u = null;
                            yVar2.s = 0L;
                            aVar2.i(null);
                            return b0Var;
                        case 6:
                            yVar2 = this.C;
                            aVar2 = this.B;
                            try {
                                t1.O(obj);
                                yVar2.n.set(null);
                                yVar2.o.set(null);
                                yVar2.p.set(null);
                                yVar2.q.set(null);
                                yVar2.t.clear();
                                u1Var = yVar2.u;
                                if (u1Var != null) {
                                    u1Var.i(null);
                                }
                                yVar2.u = null;
                                yVar2.s = 0L;
                                aVar2.i(null);
                                return b0Var;
                            } catch (Throwable th8) {
                                th = th8;
                                aVar2.i(null);
                                throw th;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th9) {
                    th = th9;
                    aVar2 = aVar;
                }
                break;
            default:
                l00.a aVar12 = l00.a.A;
                int i14 = this.F;
                try {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar5 = this.B;
                                try {
                                    t1.O(obj);
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                break;
                            } else {
                                int i15 = this.E;
                                i5 = this.D;
                                yVar3 = this.C;
                                j40.a aVar13 = this.B;
                                try {
                                    t1.O(obj);
                                    i6 = i15;
                                    aVar4 = aVar13;
                                    try {
                                        if (!yVar3.k.a.isAuthorized()) {
                                            m1Var = yVar3.e;
                                            this.B = aVar4;
                                            this.C = null;
                                            this.D = i5;
                                            this.E = i6;
                                            this.F = 3;
                                            try {
                                                localDateTimeNow = LocalDateTime.now();
                                                kotlin.jvm.internal.m.d(localDateTimeNow, "now(...)");
                                                if (m1Var.i(0, localDateTimeNow, this) == aVar12) {
                                                    return aVar12;
                                                }
                                                aVar5 = aVar4;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                th = th;
                                                aVar5 = aVar4;
                                                aVar5.i(null);
                                                throw th;
                                            }
                                        }
                                        aVar4.i(null);
                                        return g00.b0.a;
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    aVar5 = aVar13;
                                }
                            }
                            aVar5.i(null);
                            throw th;
                        }
                        int i16 = this.D;
                        yVar3 = this.C;
                        j40.a aVar14 = this.B;
                        t1.O(obj);
                        i4 = i16;
                        aVar4 = aVar14;
                        aVar4 = aVar5;
                        aVar4.i(null);
                        return g00.b0.a;
                    }
                    t1.O(obj);
                    y yVar6 = this.G;
                    aVar4 = yVar6.r;
                    this.B = aVar4;
                    this.C = yVar6;
                    this.D = 0;
                    this.F = 1;
                    if (aVar4.l(this) == aVar12) {
                        return aVar12;
                    }
                    yVar3 = yVar6;
                    i4 = 0;
                    this.B = aVar4;
                    this.C = yVar3;
                    this.D = i4;
                    this.E = 0;
                    this.F = 2;
                    if (y.b(yVar3, this) == aVar12) {
                        return aVar12;
                    }
                    i5 = i4;
                    i6 = 0;
                    if (!yVar3.k.a.isAuthorized()) {
                        m1Var = yVar3.e;
                        this.B = aVar4;
                        this.C = null;
                        this.D = i5;
                        this.E = i6;
                        this.F = 3;
                        localDateTimeNow = LocalDateTime.now();
                        kotlin.jvm.internal.m.d(localDateTimeNow, "now(...)");
                        if (m1Var.i(0, localDateTimeNow, this) == aVar12) {
                            return aVar12;
                        }
                        aVar5 = aVar4;
                        aVar4 = aVar5;
                    }
                    aVar4.i(null);
                    return g00.b0.a;
                } catch (Throwable th14) {
                    th = th14;
                    aVar5 = aVar4;
                    aVar5.i(null);
                    throw th;
                }
        }
    }
}
