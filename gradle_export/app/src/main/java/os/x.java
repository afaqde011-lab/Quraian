package os;

import a40.m0;
import a40.u1;
import a40.w1;
import ab.a0;
import as.y0;
import bt.y1;
import bv.i2;
import d40.p1;
import g00.b0;
import h00.d0;
import h00.j0;
import is.c1;
import is.g1;
import is.l0;
import is.m1;
import is.p0;
import is.z;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import ri.t1;
import wo.c0;

public final class x {
    public final p1 A;
    public final p1 B;
    public final p1 C;
    public final p1 D;
    public volatile boolean E;
    public boolean F;
    public final p0 a;
    public final c1 b;
    public final g1 c;
    public final is.y d;
    public final is.j e;
    public final is.f f;
    public final is.m g;
    public final m1 h;
    public final l0 i;
    public final c0 j;
    public final au.a k;
    public final br.i l;
    public final is.c0 m;
    public final ns.c n;
    public final z o;
    public final f40.c p;
    public final j40.c q;
    public final j40.c r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile ss.l u;
    public final p1 v;
    public volatile int w;
    public u1 x;
    public u1 y;
    public final p1 z;

    public x(p0 p0Var, c1 c1Var, g1 g1Var, is.y yVar, is.j jVar, is.f fVar, is.m mVar, m1 m1Var, l0 l0Var, c0 c0Var, au.a aVar, br.i iVar, is.c0 c0Var2, ns.c cVar, z zVar) {
        this.a = p0Var;
        this.b = c1Var;
        this.c = g1Var;
        this.d = yVar;
        this.e = jVar;
        this.f = fVar;
        this.g = mVar;
        this.h = m1Var;
        this.i = l0Var;
        this.j = c0Var;
        this.k = aVar;
        this.l = iVar;
        this.m = c0Var2;
        this.n = cVar;
        this.o = zVar;
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, h40.d.C));
        this.p = cVarC;
        this.q = j40.d.a();
        this.r = j40.d.a();
        Boolean bool = Boolean.FALSE;
        this.v = d40.o.c(bool);
        this.z = d40.o.c(bool);
        this.A = d40.o.c(bool);
        h00.z zVar2 = h00.z.A;
        this.B = d40.o.c(zVar2);
        this.C = d40.o.c(zVar2);
        this.D = d40.o.c(bool);
        k00.c cVar2 = null;
        a40.c0.y(cVarC, null, null, new a(3, cVar2, this), 3);
        a40.c0.y(cVarC, null, null, new a(1, cVar2, this), 3);
    }

    public static final java.lang.Object a(os.x r9, java.time.Instant r10, m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.a(os.x, java.time.Instant, m00.c):java.lang.Object");
    }

    public static final Object b(x xVar, boolean z, k00.c cVar) {
        l lVar;
        Object obj;
        br.i iVar;
        is.c0 c0Var;
        j40.a aVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        l0 l0Var;
        boolean z2;
        int i6;
        c1 c1Var;
        g1 g1Var;
        ?? r2;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i7 = lVar.K;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.K = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(xVar, cVar);
            }
        } else {
            lVar = new l(xVar, cVar);
        }
        Object obj2 = lVar.I;
        l00.a aVar2 = l00.a.A;
        ?? r3 = lVar.K;
        try {
            try {
                try {
                    try {
                        try {
                            switch (r3) {
                                case 0:
                                    t1.O(obj2);
                                    u1 u1Var = xVar.y;
                                    if (u1Var != null) {
                                        u1Var.i(null);
                                    }
                                    u1 u1Var2 = xVar.x;
                                    if (u1Var2 != null) {
                                        u1Var2.i(null);
                                    }
                                    xVar.w = 0;
                                    xVar.t = false;
                                    xVar.u = null;
                                    p1 p1Var = xVar.v;
                                    Boolean bool = Boolean.FALSE;
                                    p1Var.getClass();
                                    p1Var.k(null, bool);
                                    p1 p1Var2 = xVar.A;
                                    p1Var2.getClass();
                                    p1Var2.k(null, bool);
                                    xVar.s = false;
                                    xVar.h.h(null);
                                    p1 p1Var3 = xVar.C;
                                    h00.z zVar = h00.z.A;
                                    p1Var3.getClass();
                                    p1Var3.k(null, zVar);
                                    xVar.E = false;
                                    j40.c cVar2 = xVar.q;
                                    lVar.H = cVar2;
                                    lVar.A = z;
                                    lVar.B = 0;
                                    lVar.C = 0;
                                    lVar.D = 0;
                                    lVar.E = 0;
                                    lVar.F = 0;
                                    lVar.K = 1;
                                    if (cVar2.l(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    aVar = cVar2;
                                    i = 0;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                    l0Var = xVar.i;
                                    lVar.H = aVar;
                                    lVar.A = z;
                                    lVar.B = i5;
                                    lVar.C = i4;
                                    lVar.D = i3;
                                    lVar.E = i2;
                                    lVar.F = i;
                                    lVar.G = 0;
                                    lVar.K = 2;
                                    if (l0Var.c(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    z2 = z;
                                    i6 = 0;
                                    r3 = aVar;
                                    try {
                                        xVar.i.e = null;
                                        c1Var = xVar.b;
                                        lVar.H = r3;
                                        lVar.A = z2;
                                        lVar.B = i5;
                                        lVar.C = i4;
                                        lVar.D = i3;
                                        lVar.E = i2;
                                        lVar.F = i;
                                        lVar.G = i6;
                                        lVar.K = 3;
                                        r3 = r3;
                                        if (c1Var.b(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        g1Var = xVar.c;
                                        lVar.H = r3;
                                        lVar.A = z2;
                                        lVar.B = i5;
                                        lVar.C = i4;
                                        lVar.D = i3;
                                        lVar.E = i2;
                                        lVar.F = i;
                                        lVar.G = i6;
                                        lVar.K = 4;
                                        if (g1Var.a(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        z = z2;
                                        r2 = r3;
                                        r2.i(null);
                                        if (z) {
                                            iVar = xVar.l;
                                            lVar.H = null;
                                            lVar.A = z;
                                            lVar.B = 0;
                                            lVar.C = 0;
                                            lVar.D = 0;
                                            lVar.E = 0;
                                            lVar.K = 5;
                                            if (iVar.d(lVar) == aVar2) {
                                                return aVar2;
                                            }
                                            c0Var = xVar.m;
                                            lVar.H = null;
                                            lVar.A = z;
                                            lVar.B = 0;
                                            lVar.C = 0;
                                            lVar.D = 0;
                                            lVar.E = 0;
                                            lVar.K = 6;
                                            if (c0Var.a(lVar) == aVar2) {
                                                return aVar2;
                                            }
                                            break;
                                        }
                                        return b0.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        r3.i(null);
                                        throw th;
                                    }
                                case 1:
                                    int i8 = lVar.F;
                                    int i9 = lVar.E;
                                    int i11 = lVar.D;
                                    int i12 = lVar.C;
                                    int i13 = lVar.B;
                                    boolean z3 = lVar.A;
                                    j40.a aVar3 = lVar.H;
                                    try {
                                        t1.O(obj2);
                                        i = i8;
                                        z = z3;
                                        i5 = i13;
                                        i4 = i12;
                                        i3 = i11;
                                        i2 = i9;
                                        aVar = aVar3;
                                        l0Var = xVar.i;
                                        lVar.H = aVar;
                                        lVar.A = z;
                                        lVar.B = i5;
                                        lVar.C = i4;
                                        lVar.D = i3;
                                        lVar.E = i2;
                                        lVar.F = i;
                                        lVar.G = 0;
                                        lVar.K = 2;
                                        if (l0Var.c(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        z2 = z;
                                        i6 = 0;
                                        r3 = aVar;
                                        xVar.i.e = null;
                                        c1Var = xVar.b;
                                        lVar.H = r3;
                                        lVar.A = z2;
                                        lVar.B = i5;
                                        lVar.C = i4;
                                        lVar.D = i3;
                                        lVar.E = i2;
                                        lVar.F = i;
                                        lVar.G = i6;
                                        lVar.K = 3;
                                        r3 = r3;
                                        if (c1Var.b(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        g1Var = xVar.c;
                                        lVar.H = r3;
                                        lVar.A = z2;
                                        lVar.B = i5;
                                        lVar.C = i4;
                                        lVar.D = i3;
                                        lVar.E = i2;
                                        lVar.F = i;
                                        lVar.G = i6;
                                        lVar.K = 4;
                                        if (g1Var.a(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        z = z2;
                                        r2 = r3;
                                        r2.i(null);
                                        if (z) {
                                            iVar = xVar.l;
                                            lVar.H = null;
                                            lVar.A = z;
                                            lVar.B = 0;
                                            lVar.C = 0;
                                            lVar.D = 0;
                                            lVar.E = 0;
                                            lVar.K = 5;
                                            if (iVar.d(lVar) == aVar2) {
                                                return aVar2;
                                            }
                                            c0Var = xVar.m;
                                            lVar.H = null;
                                            lVar.A = z;
                                            lVar.B = 0;
                                            lVar.C = 0;
                                            lVar.D = 0;
                                            lVar.E = 0;
                                            lVar.K = 6;
                                            if (c0Var.a(lVar) == aVar2) {
                                                return aVar2;
                                            }
                                            break;
                                        }
                                        return b0.a;
                                    } catch (Throwable unused) {
                                        z = z3;
                                    }
                                    break;
                                case 2:
                                    i6 = lVar.G;
                                    int i14 = lVar.F;
                                    i2 = lVar.E;
                                    i3 = lVar.D;
                                    i4 = lVar.C;
                                    i5 = lVar.B;
                                    z2 = lVar.A;
                                    j40.a aVar4 = lVar.H;
                                    t1.O(obj2);
                                    i = i14;
                                    r3 = aVar4;
                                    xVar.i.e = null;
                                    c1Var = xVar.b;
                                    lVar.H = r3;
                                    lVar.A = z2;
                                    lVar.B = i5;
                                    lVar.C = i4;
                                    lVar.D = i3;
                                    lVar.E = i2;
                                    lVar.F = i;
                                    lVar.G = i6;
                                    lVar.K = 3;
                                    r3 = r3;
                                    if (c1Var.b(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    g1Var = xVar.c;
                                    lVar.H = r3;
                                    lVar.A = z2;
                                    lVar.B = i5;
                                    lVar.C = i4;
                                    lVar.D = i3;
                                    lVar.E = i2;
                                    lVar.F = i;
                                    lVar.G = i6;
                                    lVar.K = 4;
                                    if (g1Var.a(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    z = z2;
                                    r2 = r3;
                                    r2.i(null);
                                    if (z) {
                                        iVar = xVar.l;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 5;
                                        if (iVar.d(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        c0Var = xVar.m;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 6;
                                        if (c0Var.a(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        break;
                                    }
                                    return b0.a;
                                case 3:
                                    i6 = lVar.G;
                                    int i15 = lVar.F;
                                    i2 = lVar.E;
                                    i3 = lVar.D;
                                    i4 = lVar.C;
                                    i5 = lVar.B;
                                    z2 = lVar.A;
                                    j40.a aVar5 = lVar.H;
                                    t1.O(obj2);
                                    i = i15;
                                    r3 = aVar5;
                                    g1Var = xVar.c;
                                    lVar.H = r3;
                                    lVar.A = z2;
                                    lVar.B = i5;
                                    lVar.C = i4;
                                    lVar.D = i3;
                                    lVar.E = i2;
                                    lVar.F = i;
                                    lVar.G = i6;
                                    lVar.K = 4;
                                    if (g1Var.a(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    z = z2;
                                    r2 = r3;
                                    r2.i(null);
                                    if (z) {
                                        iVar = xVar.l;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 5;
                                        if (iVar.d(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        c0Var = xVar.m;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 6;
                                        if (c0Var.a(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        break;
                                    }
                                    return b0.a;
                                case 4:
                                    z = lVar.A;
                                    j40.a aVar6 = lVar.H;
                                    t1.O(obj2);
                                    r2 = aVar6;
                                    r2.i(null);
                                    if (z) {
                                        iVar = xVar.l;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 5;
                                        if (iVar.d(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        c0Var = xVar.m;
                                        lVar.H = null;
                                        lVar.A = z;
                                        lVar.B = 0;
                                        lVar.C = 0;
                                        lVar.D = 0;
                                        lVar.E = 0;
                                        lVar.K = 6;
                                        if (c0Var.a(lVar) == aVar2) {
                                            return aVar2;
                                        }
                                        break;
                                    }
                                    return b0.a;
                                case 5:
                                    z = lVar.A;
                                    t1.O(obj2);
                                    c0Var = xVar.m;
                                    lVar.H = null;
                                    lVar.A = z;
                                    lVar.B = 0;
                                    lVar.C = 0;
                                    lVar.D = 0;
                                    lVar.E = 0;
                                    lVar.K = 6;
                                    if (c0Var.a(lVar) == aVar2) {
                                        return aVar2;
                                    }
                                    return b0.a;
                                case 6:
                                    t1.O(obj2);
                                    return b0.a;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable th3) {
                th = th3;
                r3 = obj;
            }
        } catch (Throwable unused4) {
        }
    }

    public static final java.lang.Object c(os.x r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.c(os.x, m00.c):java.lang.Object");
    }

    public static long d(ss.v vVar, String str) {
        ss.x xVar = vVar.d;
        Object obj = null;
        if (!xVar.c.equals(str)) {
            xVar = null;
        }
        if (xVar != null) {
            return xVar.a;
        }
        for (Object obj2 : vVar.f) {
            if (kotlin.jvm.internal.m.a(((ss.c) obj2).a, str)) {
                obj = obj2;
                break;
            }
        }
        ss.c cVar = (ss.c) obj;
        if (cVar != null) {
            return cVar.b;
        }
        return 0L;
    }

    public final void e(ss.v vVar) {
        int iIntValue;
        if (this.j.a.isAuthorized()) {
            m1 m1Var = this.h;
            if (m1Var.c() != null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(vVar.a);
            int iIntValue2 = numValueOf.intValue();
            if (1 > iIntValue2 || iIntValue2 >= 181) {
                numValueOf = null;
            }
            if (numValueOf == null || (iIntValue = numValueOf.intValue()) == m1Var.b()) {
                return;
            }
            m1Var.g(iIntValue);
        }
    }

    public final boolean f() {
        return this.j.a.isAuthorized() && ((Boolean) this.k.c.getValue()).booleanValue();
    }

    public final java.lang.Object g(m00.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.g(m00.c):java.lang.Object");
    }

    public final java.lang.Object h(m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.h(m00.c):java.lang.Object");
    }

    public final Object i(ss.v vVar, m00.c cVar) {
        h hVar;
        Object objN;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.D = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.B;
        Object obj2 = l00.a.A;
        int i2 = hVar.D;
        Object obj3 = b0.a;
        if (i2 == 0) {
            t1.O(obj);
            hVar.A = vVar;
            hVar.D = 1;
            if (this.i.c(hVar) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            vVar = hVar.A;
            t1.O(obj);
        } else {
            if (i2 == 2) {
                vVar = hVar.A;
                t1.O(obj);
                LocalDate localDateNow = LocalDate.now();
                kotlin.jvm.internal.m.d(localDateNow, "now(...)");
                String strZ = f50.c.z(localDateNow);
                this.l.h(strZ, Long.valueOf(d(vVar, strZ)));
                hVar.A = null;
                hVar.D = 3;
                if (this.b.d(hVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return obj3;
            }
            t1.O(obj);
        }
        hVar.A = null;
        hVar.D = 4;
        objN = rd.a.N(this.c.b.a.a, false, true, new ks.e(10), hVar);
        if (objN != obj2) {
            objN = obj3;
        }
        if (objN != obj2) {
            objN = obj3;
        }
        if (objN != obj2) {
            objN = obj3;
        }
        if (objN != obj2) {
            return obj2;
        }
        return obj3;
        hVar.A = vVar;
        hVar.D = 2;
        if (g(hVar) != obj2) {
            LocalDate localDateNow2 = LocalDate.now();
            kotlin.jvm.internal.m.d(localDateNow2, "now(...)");
            String strZ2 = f50.c.z(localDateNow2);
            this.l.h(strZ2, Long.valueOf(d(vVar, strZ2)));
            hVar.A = null;
            hVar.D = 3;
            if (this.b.d(hVar) != obj2) {
                hVar.A = null;
                hVar.D = 4;
                objN = rd.a.N(this.c.b.a.a, false, true, new ks.e(10), hVar);
                if (objN != obj2) {
                    objN = obj3;
                }
                if (objN != obj2) {
                    objN = obj3;
                }
                if (objN != obj2) {
                    objN = obj3;
                }
                if (objN != obj2) {
                    return obj3;
                }
            }
        }
        return obj2;
    }

    public final Object j(k00.c cVar) {
        i iVar;
        Object objS;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.C = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objJ = iVar.A;
        l00.a aVar = l00.a.A;
        int i2 = iVar.C;
        ns.c cVar2 = this.n;
        try {
            if (i2 == 0) {
                t1.O(objJ);
                iVar.C = 1;
                h40.e eVar = m0.a;
                objJ = a40.c0.J(new d6.e(cVar2, (k00.c) null, 6), h40.d.C, iVar);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objJ);
            }
            objS = (Boolean) objJ;
            objS.getClass();
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof g00.m) {
            objS = obj;
        }
        if (!((Boolean) objS).booleanValue()) {
            cVar2.b();
        }
        return b0.a;
    }

    public final void k(int i) {
        p1 p1Var;
        Object value;
        do {
            p1Var = this.C;
            value = p1Var.getValue();
        } while (!p1Var.i(value, j0.r0((Set) value, Integer.valueOf(i))));
        a40.c0.y(this.p, null, null, new j(this, i, null, 0), 3);
    }

    public final d40.i l() {
        return d40.o.o(d40.o.k(this.z, this.A, this.B, this.D, new k(5, null)));
    }

    public final Object m(int i, boolean z, m00.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.E = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.C;
        Object obj2 = l00.a.A;
        int i3 = mVar.E;
        b0 b0Var = b0.a;
        if (i3 == 0) {
            t1.O(obj);
            if (f()) {
                mVar.A = i;
                mVar.B = z;
                mVar.E = 1;
                if (j(mVar) != obj2) {
                }
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        z = mVar.B;
        i = mVar.A;
        t1.O(obj);
        i2 i2Var = new i2(i, z, this, (k00.c) null);
        mVar.A = i;
        mVar.B = z;
        mVar.E = 2;
        return a40.c0.k(i2Var, mVar) == obj2 ? obj2 : b0Var;
    }

    public final java.lang.Object n(int r8, boolean r9, m00.c r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: os.x.n(int, boolean, m00.c):java.lang.Object");
    }

    public final java.lang.Object o(boolean r12, m00.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.o(boolean, m00.c):java.lang.Object");
    }

    public final Object p(m00.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.C = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.A;
        l00.a aVar = l00.a.A;
        int i2 = qVar.C;
        if (i2 == 0) {
            t1.O(obj);
            l0 l0Var = this.i;
            qVar.C = 1;
            if (l0Var.i(qVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        this.i.e = null;
        return b0.a;
    }

    public final Object q(m00.c cVar) throws Throwable {
        r rVar;
        j40.a aVar;
        int i;
        j40.a aVar2;
        int i2;
        Integer numC;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i3 = rVar.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.F = i3 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.D;
        l00.a aVar3 = l00.a.A;
        int i4 = rVar.F;
        m1 m1Var = this.h;
        b0 b0Var = b0.a;
        try {
            if (i4 == 0) {
                t1.O(obj);
                aVar = this.r;
                rVar.A = aVar;
                i = 0;
                rVar.B = 0;
                rVar.F = 1;
                if (aVar.l(rVar) != aVar3) {
                }
                return aVar3;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = rVar.C;
                aVar2 = rVar.A;
                try {
                    t1.O(obj);
                    numC = m1Var.c();
                    if (numC != null && numC.intValue() == i2) {
                        m1Var.h(null);
                    }
                    aVar2.i(null);
                    return b0Var;
                } catch (Throwable th) {
                    th = th;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = rVar.B;
            j40.a aVar4 = rVar.A;
            t1.O(obj);
            aVar = aVar4;
            Integer numC2 = m1Var.c();
            if (numC2 == null) {
                aVar.i(null);
                return b0Var;
            }
            int iIntValue = numC2.intValue();
            if (!f()) {
                aVar.i(null);
                return b0Var;
            }
            p0 p0Var = this.a;
            rVar.A = aVar;
            rVar.B = i;
            rVar.C = iIntValue;
            rVar.F = 2;
            ms.b bVar = p0Var.b;
            String id = ZoneId.systemDefault().getId();
            kotlin.jvm.internal.m.d(id, "getId(...)");
            Object objI = bVar.i(id, new hs.f(a0.y(iIntValue, 1, 180)), rVar);
            if (objI != aVar3) {
                objI = b0Var;
            }
            if (objI != aVar3) {
                aVar2 = aVar;
                i2 = iIntValue;
                numC = m1Var.c();
                if (numC != null) {
                    m1Var.h(null);
                }
                aVar2.i(null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final void r(ss.v vVar) {
        this.s = true;
        e(vVar);
    }

    public final Object s(m00.c cVar) {
        s sVar;
        long j;
        int iY;
        u00.k kVar;
        long j2;
        x xVar;
        m1 m1Var;
        List listK1;
        x xVar2;
        u00.k kVar2;
        List list;
        ArrayList<g00.k> arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Iterator it;
        m1 m1Var2;
        List listK2;
        Object objS;
        List list2;
        x xVar3;
        long j3;
        u00.k kVar3;
        ArrayList<rs.d> arrayList3;
        Iterator it2;
        long j4;
        long j5;
        long j6;
        Iterator it3;
        long j7;
        int iY2;
        Integer num;
        int iIntValue;
        g00.q qVar;
        Object arrayList4;
        String str;
        g00.k kVar4;
        int i;
        int length;
        ArrayList<g00.k> arrayList5;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList6;
        List listK3;
        Object objS2;
        int i2;
        List list3;
        List list4;
        List list5;
        u00.k kVar5;
        List list6;
        Iterator it4;
        long j8;
        g00.q qVar2;
        Object arrayList7;
        String str2;
        g00.k kVar6;
        rs.b bVar;
        int i3;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList8;
        int i4;
        long j9;
        String str3;
        rs.f fVar;
        x xVar4 = this;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i5 = sVar.J;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sVar.J = i5 - Integer.MIN_VALUE;
            } else {
                sVar = new s(xVar4, cVar);
            }
        } else {
            sVar = new s(xVar4, cVar);
        }
        Object obj = sVar.H;
        l00.a aVar = l00.a.A;
        int i6 = sVar.J;
        m1 m1Var3 = xVar4.h;
        if (i6 == 0) {
            j = 0;
            t1.O(obj);
            long epochSecond = Instant.now().getEpochSecond();
            cl.b bVar2 = new cl.b(epochSecond, xVar4, 4);
            int iB = m1Var3.b();
            if (iB <= 0) {
                iB = 5;
            }
            iY = a0.y(iB, 1, 180);
            sVar.B = bVar2;
            sVar.C = xVar4;
            sVar.A = epochSecond;
            sVar.G = iY;
            sVar.J = 1;
            Serializable serializableB = xVar4.e.b(Long.MAX_VALUE, sVar);
            if (serializableB != aVar) {
                kVar = bVar2;
                obj = serializableB;
                j2 = epochSecond;
                xVar = xVar4;
            }
            return aVar;
        }
        if (i6 == 1) {
            j = 0;
            iY = sVar.G;
            j2 = sVar.A;
            xVar = (x) sVar.C;
            u00.k kVar7 = sVar.B;
            t1.O(obj);
            kVar = kVar7;
        } else {
            if (i6 == 2) {
                j = 0;
                iY = sVar.G;
                j2 = sVar.A;
                xVar2 = (x) sVar.D;
                listK1 = (List) sVar.C;
                kVar2 = sVar.B;
                t1.O(obj);
                m1Var = m1Var3;
                list = listK1;
                xVar2.getClass();
                ArrayList<rs.d> arrayList9 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    rs.d dVar = (rs.d) obj2;
                    i = dVar.c;
                    if (i < 0) {
                        if (i >= 24 && dVar.e > 0 && 1 <= (length = dVar.d.length())) {
                            if (length < 65) {
                                arrayList9.add(obj2);
                            }
                        }
                    }
                }
                arrayList = new ArrayList();
                for (rs.d dVar2 : arrayList9) {
                    str = (String) kVar2.invoke(Long.valueOf(dVar2.b));
                    if (str != null) {
                        kVar4 = new g00.k(new g00.q(str, Integer.valueOf(dVar2.c), dVar2.d), dVar2);
                    } else {
                        kVar4 = null;
                    }
                    if (kVar4 != null) {
                        arrayList.add(kVar4);
                    }
                }
                linkedHashMap = new LinkedHashMap();
                for (g00.k kVar8 : arrayList) {
                    qVar = (g00.q) kVar8.A;
                    arrayList4 = linkedHashMap.get(qVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(qVar, arrayList4);
                    }
                    ((List) arrayList4).add((rs.d) kVar8.B);
                }
                TreeMap treeMapD0 = d0.d0(linkedHashMap, new ay.b(new ay.b(new ba.m(15), 7), 8));
                arrayList2 = new ArrayList(treeMapD0.size());
                it = treeMapD0.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    g00.q qVar3 = (g00.q) entry.getKey();
                    List list7 = (List) entry.getValue();
                    kotlin.jvm.internal.m.b(list7);
                    arrayList3 = new ArrayList();
                    for (Object obj3 : list7) {
                        Iterator it5 = it;
                        if (((rs.d) obj3).f != null) {
                            arrayList3.add(obj3);
                        }
                        it = it5;
                    }
                    Iterator it6 = it;
                    it2 = arrayList3.iterator();
                    j4 = j;
                    while (it2.hasNext()) {
                        j4 += (long) ((rs.d) it2.next()).e;
                        arrayList3 = arrayList3;
                        m1Var = m1Var;
                    }
                    m1 m1Var4 = m1Var;
                    j5 = j;
                    for (rs.d dVar3 : arrayList3) {
                        num = dVar3.f;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        j5 = (((long) dVar3.e) * ((long) iIntValue)) + j5;
                    }
                    j6 = j5;
                    String str4 = (String) qVar3.A;
                    int iIntValue2 = ((Number) qVar3.B).intValue();
                    String str5 = (String) qVar3.C;
                    it3 = list7.iterator();
                    j7 = j;
                    while (it3.hasNext()) {
                        j7 += (long) ((rs.d) it3.next()).e;
                    }
                    long j11 = j7 * 1000;
                    if (j4 > j) {
                        iY2 = a0.y((int) (j6 / j4), 0, 1000);
                    } else {
                        iY2 = 0;
                    }
                    arrayList2.add(new ss.b(iIntValue2, iY2, j11, str4, str5));
                    it = it6;
                    m1Var = m1Var4;
                }
                m1Var2 = m1Var;
                listK2 = h00.q.k1(20000, arrayList2);
                y1 y1VarB = xVar4.f.b();
                sVar.B = kVar2;
                sVar.C = list;
                sVar.D = listK2;
                sVar.E = xVar4;
                sVar.A = j2;
                sVar.G = iY;
                sVar.J = 3;
                objS = d40.o.s(y1VarB, sVar);
                if (objS != aVar) {
                    list2 = listK2;
                    obj = objS;
                    xVar3 = xVar4;
                    j3 = j2;
                    kVar3 = kVar2;
                    xVar3.getClass();
                    ArrayList<rs.b> arrayList10 = new ArrayList();
                    while (r1.hasNext()) {
                        bVar = (rs.b) obj;
                        if (bVar.d <= 0) {
                        }
                    }
                    arrayList5 = new ArrayList();
                    for (rs.b bVar3 : arrayList10) {
                        str2 = (String) kVar3.invoke(Long.valueOf(bVar3.b));
                        if (str2 != null) {
                            kVar6 = new g00.k(new g00.q(str2, Integer.valueOf(bVar3.d), Integer.valueOf(bVar3.c)), bVar3);
                        } else {
                            kVar6 = null;
                        }
                        if (kVar6 != null) {
                            arrayList5.add(kVar6);
                        }
                    }
                    linkedHashMap2 = new LinkedHashMap();
                    for (g00.k kVar9 : arrayList5) {
                        qVar2 = (g00.q) kVar9.A;
                        arrayList7 = linkedHashMap2.get(qVar2);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap2.put(qVar2, arrayList7);
                        }
                        ((List) arrayList7).add((rs.b) kVar9.B);
                    }
                    TreeMap treeMapD1 = d0.d0(linkedHashMap2, new ay.b(new ay.b(new ba.m(17), 10), 11));
                    arrayList6 = new ArrayList(treeMapD1.size());
                    for (Map.Entry entry2 : treeMapD1.entrySet()) {
                        g00.q qVar4 = (g00.q) entry2.getKey();
                        list6 = (List) entry2.getValue();
                        String str6 = (String) qVar4.A;
                        int iIntValue3 = ((Number) qVar4.B).intValue();
                        int iIntValue4 = ((Number) qVar4.C).intValue();
                        kotlin.jvm.internal.m.b(list6);
                        j8 = j;
                        for (it4 = list6.iterator(); it4.hasNext(); it4 = it4) {
                            j8 += (long) ((rs.b) it4.next()).e;
                            list6 = list6;
                        }
                        arrayList6.add(new ss.w(iIntValue3, iIntValue4, list6.size(), j8 * 1000, str6));
                    }
                    listK3 = h00.q.k1(30000, arrayList6);
                    if (!list.isEmpty()) {
                    }
                    y1 y1VarE = m1Var2.e();
                    sVar.B = kVar3;
                    sVar.C = list;
                    sVar.D = list2;
                    sVar.E = listK3;
                    sVar.F = xVar4;
                    sVar.A = j3;
                    sVar.G = iY;
                    sVar.J = 4;
                    objS2 = d40.o.s(y1VarE, sVar);
                    if (objS2 != aVar) {
                        i2 = iY;
                        list3 = list;
                        list4 = list2;
                        list5 = listK3;
                        obj = objS2;
                        kVar5 = kVar3;
                    }
                }
                return aVar;
            }
            if (i6 == 3) {
                iY = sVar.G;
                long j12 = sVar.A;
                xVar3 = (x) sVar.E;
                List list8 = (List) sVar.D;
                List list9 = (List) sVar.C;
                j = 0;
                kVar3 = sVar.B;
                t1.O(obj);
                m1Var2 = m1Var3;
                list = list9;
                j3 = j12;
                list2 = list8;
                xVar3.getClass();
                ArrayList<rs.b> arrayList11 = new ArrayList();
                for (Object obj4 : (List) obj) {
                    bVar = (rs.b) obj4;
                    if (bVar.d <= 0 && 1 <= (i3 = bVar.c) && i3 < 115 && bVar.e > 0) {
                        arrayList11.add(obj4);
                    }
                }
                arrayList5 = new ArrayList();
                while (r9.hasNext()) {
                    str2 = (String) kVar3.invoke(Long.valueOf(bVar3.b));
                    if (str2 != null) {
                        kVar6 = new g00.k(new g00.q(str2, Integer.valueOf(bVar3.d), Integer.valueOf(bVar3.c)), bVar3);
                    } else {
                        kVar6 = null;
                    }
                    if (kVar6 != null) {
                        arrayList5.add(kVar6);
                    }
                }
                linkedHashMap2 = new LinkedHashMap();
                while (r1.hasNext()) {
                    qVar2 = (g00.q) kVar9.A;
                    arrayList7 = linkedHashMap2.get(qVar2);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap2.put(qVar2, arrayList7);
                    }
                    ((List) arrayList7).add((rs.b) kVar9.B);
                }
                TreeMap treeMapD2 = d0.d0(linkedHashMap2, new ay.b(new ay.b(new ba.m(17), 10), 11));
                arrayList6 = new ArrayList(treeMapD2.size());
                while (r1.hasNext()) {
                    g00.q qVar5 = (g00.q) entry2.getKey();
                    list6 = (List) entry2.getValue();
                    String str7 = (String) qVar5.A;
                    int iIntValue5 = ((Number) qVar5.B).intValue();
                    int iIntValue6 = ((Number) qVar5.C).intValue();
                    kotlin.jvm.internal.m.b(list6);
                    j8 = j;
                    while (it4.hasNext()) {
                        j8 += (long) ((rs.b) it4.next()).e;
                        list6 = list6;
                    }
                    arrayList6.add(new ss.w(iIntValue5, iIntValue6, list6.size(), j8 * 1000, str7));
                }
                listK3 = h00.q.k1(30000, arrayList6);
                if (!list.isEmpty() && listK3.isEmpty() && list2.isEmpty()) {
                    return null;
                }
                y1 y1VarE2 = m1Var2.e();
                sVar.B = kVar3;
                sVar.C = list;
                sVar.D = list2;
                sVar.E = listK3;
                sVar.F = xVar4;
                sVar.A = j3;
                sVar.G = iY;
                sVar.J = 4;
                objS2 = d40.o.s(y1VarE2, sVar);
                if (objS2 != aVar) {
                    i2 = iY;
                    list3 = list;
                    list4 = list2;
                    list5 = listK3;
                    obj = objS2;
                    kVar5 = kVar3;
                }
                return aVar;
            }
            if (i6 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = sVar.G;
            x xVar5 = sVar.F;
            List list10 = (List) sVar.E;
            List list11 = (List) sVar.D;
            List list12 = (List) sVar.C;
            kVar5 = sVar.B;
            t1.O(obj);
            i2 = i7;
            xVar4 = xVar5;
            list5 = list10;
            list3 = list12;
            list4 = list11;
            j = 0;
        }
        xVar4.getClass();
        linkedHashMap3 = new LinkedHashMap();
        for (rs.f fVar2 : (List) obj) {
            str3 = (String) kVar5.invoke(Long.valueOf(fVar2.b));
            if (str3 != null && ((fVar = (rs.f) linkedHashMap3.get(str3)) == null || fVar2.c > fVar.c)) {
                linkedHashMap3.put(str3, fVar2);
            }
        }
        TreeMap treeMap = new TreeMap(linkedHashMap3);
        arrayList8 = new ArrayList(treeMap.size());
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str8 = (String) entry3.getKey();
            rs.f fVar3 = (rs.f) entry3.getValue();
            kotlin.jvm.internal.m.b(str8);
            i4 = fVar3.d;
            if (i4 <= 0) {
                i4 = i2;
            }
            int iY3 = a0.y(i4, 1, 180);
            j9 = fVar3.c;
            if (j9 < j) {
                j9 = j;
            }
            arrayList8.add(new ss.k(str8, j9 * 1000, iY3));
        }
        List listK4 = h00.q.k1(5000, arrayList8);
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return new ss.n(string, i2, list3, listK4, list5, list4);
        xVar.getClass();
        ArrayList<rs.c> arrayList12 = new ArrayList();
        for (Object obj5 : (List) obj) {
            rs.c cVar2 = (rs.c) obj5;
            int i8 = cVar2.c;
            if (i8 >= 0 && i8 < 24 && cVar2.d > 0) {
                arrayList12.add(obj5);
            }
        }
        ArrayList<g00.k> arrayList13 = new ArrayList();
        for (rs.c cVar3 : arrayList12) {
            m1 m1Var5 = m1Var3;
            String str9 = (String) kVar.invoke(Long.valueOf(cVar3.b));
            g00.k kVar10 = str9 != null ? new g00.k(new g00.k(str9, Integer.valueOf(cVar3.c)), cVar3) : null;
            if (kVar10 != null) {
                arrayList13.add(kVar10);
            }
            m1Var3 = m1Var5;
        }
        m1Var = m1Var3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (g00.k kVar11 : arrayList13) {
            g00.k kVar12 = (g00.k) kVar11.A;
            Object arrayList14 = linkedHashMap4.get(kVar12);
            if (arrayList14 == null) {
                arrayList14 = new ArrayList();
                linkedHashMap4.put(kVar12, arrayList14);
            }
            ((List) arrayList14).add((rs.c) kVar11.B);
        }
        TreeMap treeMapD3 = d0.d0(linkedHashMap4, new ay.b(new ba.m(16), 9));
        ArrayList arrayList15 = new ArrayList(treeMapD3.size());
        for (Map.Entry entry4 : treeMapD3.entrySet()) {
            g00.k kVar13 = (g00.k) entry4.getKey();
            List list13 = (List) entry4.getValue();
            String str10 = (String) kVar13.A;
            int iIntValue7 = ((Number) kVar13.B).intValue();
            kotlin.jvm.internal.m.b(list13);
            Iterator it7 = list13.iterator();
            long j13 = j;
            while (it7.hasNext()) {
                j13 += (long) ((rs.c) it7.next()).d;
                kVar = kVar;
            }
            arrayList15.add(new ss.i(str10, j13 * 1000, iIntValue7));
            kVar = kVar;
        }
        u00.k kVar14 = kVar;
        listK1 = h00.q.k1(10000, arrayList15);
        is.m mVar = xVar4.g;
        y1 y1Var = new y1(rd.a.o(mVar.a.a.a, false, new String[]{"listening_hour_background_sound_stat_data"}, new ks.e(2)), mVar, 9);
        sVar.B = kVar14;
        sVar.C = listK1;
        sVar.D = xVar4;
        sVar.A = j2;
        sVar.G = iY;
        sVar.J = 2;
        Object objS3 = d40.o.s(y1Var, sVar);
        if (objS3 != aVar) {
            xVar2 = xVar4;
            kVar2 = kVar14;
            obj = objS3;
            list = listK1;
            xVar2.getClass();
            ArrayList<rs.d> arrayList16 = new ArrayList();
            while (r1.hasNext()) {
                rs.d dVar4 = (rs.d) obj2;
                i = dVar4.c;
                if (i < 0) {
                    if (i >= 24) {
                    }
                }
            }
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                str = (String) kVar2.invoke(Long.valueOf(dVar2.b));
                if (str != null) {
                    kVar4 = new g00.k(new g00.q(str, Integer.valueOf(dVar2.c), dVar2.d), dVar2);
                } else {
                    kVar4 = null;
                }
                if (kVar4 != null) {
                    arrayList.add(kVar4);
                }
            }
            linkedHashMap = new LinkedHashMap();
            while (r1.hasNext()) {
                qVar = (g00.q) kVar8.A;
                arrayList4 = linkedHashMap.get(qVar);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(qVar, arrayList4);
                }
                ((List) arrayList4).add((rs.d) kVar8.B);
            }
            TreeMap treeMapD4 = d0.d0(linkedHashMap, new ay.b(new ay.b(new ba.m(15), 7), 8));
            arrayList2 = new ArrayList(treeMapD4.size());
            it = treeMapD4.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it.next();
                g00.q qVar6 = (g00.q) entry5.getKey();
                List list14 = (List) entry5.getValue();
                kotlin.jvm.internal.m.b(list14);
                arrayList3 = new ArrayList();
                while (r12.hasNext()) {
                    Iterator it8 = it;
                    if (((rs.d) obj3).f != null) {
                        arrayList3.add(obj3);
                    }
                    it = it8;
                }
                Iterator it9 = it;
                it2 = arrayList3.iterator();
                j4 = j;
                while (it2.hasNext()) {
                    j4 += (long) ((rs.d) it2.next()).e;
                    arrayList3 = arrayList3;
                    m1Var = m1Var;
                }
                m1 m1Var6 = m1Var;
                j5 = j;
                while (r1.hasNext()) {
                    num = dVar3.f;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    j5 = (((long) dVar3.e) * ((long) iIntValue)) + j5;
                }
                j6 = j5;
                String str11 = (String) qVar6.A;
                int iIntValue8 = ((Number) qVar6.B).intValue();
                String str12 = (String) qVar6.C;
                it3 = list14.iterator();
                j7 = j;
                while (it3.hasNext()) {
                    j7 += (long) ((rs.d) it3.next()).e;
                }
                long j14 = j7 * 1000;
                if (j4 > j) {
                    iY2 = a0.y((int) (j6 / j4), 0, 1000);
                } else {
                    iY2 = 0;
                }
                arrayList2.add(new ss.b(iIntValue8, iY2, j14, str11, str12));
                it = it9;
                m1Var = m1Var6;
            }
            m1Var2 = m1Var;
            listK2 = h00.q.k1(20000, arrayList2);
            y1 y1VarB2 = xVar4.f.b();
            sVar.B = kVar2;
            sVar.C = list;
            sVar.D = listK2;
            sVar.E = xVar4;
            sVar.A = j2;
            sVar.G = iY;
            sVar.J = 3;
            objS = d40.o.s(y1VarB2, sVar);
            if (objS != aVar) {
                list2 = listK2;
                obj = objS;
                xVar3 = xVar4;
                j3 = j2;
                kVar3 = kVar2;
                xVar3.getClass();
                ArrayList<rs.b> arrayList17 = new ArrayList();
                while (r1.hasNext()) {
                    bVar = (rs.b) obj4;
                    if (bVar.d <= 0) {
                    }
                }
                arrayList5 = new ArrayList();
                while (r9.hasNext()) {
                    str2 = (String) kVar3.invoke(Long.valueOf(bVar3.b));
                    if (str2 != null) {
                        kVar6 = new g00.k(new g00.q(str2, Integer.valueOf(bVar3.d), Integer.valueOf(bVar3.c)), bVar3);
                    } else {
                        kVar6 = null;
                    }
                    if (kVar6 != null) {
                        arrayList5.add(kVar6);
                    }
                }
                linkedHashMap2 = new LinkedHashMap();
                while (r1.hasNext()) {
                    qVar2 = (g00.q) kVar9.A;
                    arrayList7 = linkedHashMap2.get(qVar2);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap2.put(qVar2, arrayList7);
                    }
                    ((List) arrayList7).add((rs.b) kVar9.B);
                }
                TreeMap treeMapD5 = d0.d0(linkedHashMap2, new ay.b(new ay.b(new ba.m(17), 10), 11));
                arrayList6 = new ArrayList(treeMapD5.size());
                while (r1.hasNext()) {
                    g00.q qVar7 = (g00.q) entry2.getKey();
                    list6 = (List) entry2.getValue();
                    String str13 = (String) qVar7.A;
                    int iIntValue9 = ((Number) qVar7.B).intValue();
                    int iIntValue10 = ((Number) qVar7.C).intValue();
                    kotlin.jvm.internal.m.b(list6);
                    j8 = j;
                    while (it4.hasNext()) {
                        j8 += (long) ((rs.b) it4.next()).e;
                        list6 = list6;
                    }
                    arrayList6.add(new ss.w(iIntValue9, iIntValue10, list6.size(), j8 * 1000, str13));
                }
                listK3 = h00.q.k1(30000, arrayList6);
                if (!list.isEmpty()) {
                }
                y1 y1VarE3 = m1Var2.e();
                sVar.B = kVar3;
                sVar.C = list;
                sVar.D = list2;
                sVar.E = listK3;
                sVar.F = xVar4;
                sVar.A = j3;
                sVar.G = iY;
                sVar.J = 4;
                objS2 = d40.o.s(y1VarE3, sVar);
                if (objS2 != aVar) {
                    i2 = iY;
                    list3 = list;
                    list4 = list2;
                    list5 = listK3;
                    obj = objS2;
                    kVar5 = kVar3;
                    xVar4.getClass();
                    linkedHashMap3 = new LinkedHashMap();
                    while (r1.hasNext()) {
                        str3 = (String) kVar5.invoke(Long.valueOf(fVar2.b));
                        if (str3 != null) {
                            linkedHashMap3.put(str3, fVar2);
                        }
                    }
                    TreeMap treeMap2 = new TreeMap(linkedHashMap3);
                    arrayList8 = new ArrayList(treeMap2.size());
                    while (r1.hasNext()) {
                        String str14 = (String) entry3.getKey();
                        rs.f fVar4 = (rs.f) entry3.getValue();
                        kotlin.jvm.internal.m.b(str14);
                        i4 = fVar4.d;
                        if (i4 <= 0) {
                            i4 = i2;
                        }
                        int iY4 = a0.y(i4, 1, 180);
                        j9 = fVar4.c;
                        if (j9 < j) {
                            j9 = j;
                        }
                        arrayList8.add(new ss.k(str14, j9 * 1000, iY4));
                    }
                    List listK5 = h00.q.k1(5000, arrayList8);
                    String string2 = UUID.randomUUID().toString();
                    kotlin.jvm.internal.m.d(string2, "toString(...)");
                    return new ss.n(string2, i2, list3, listK5, list5, list4);
                }
            }
        }
        return aVar;
    }

    public final void t() {
        u1 u1Var = this.y;
        if (u1Var == null || !u1Var.a()) {
            this.y = a40.c0.y(this.p, null, null, new y0(this, null, 5), 3);
        }
    }

    public final void u() {
        a40.c0.y(this.p, null, null, new t(this, null), 3);
    }

    public final java.lang.Object v(m00.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.v(m00.c):java.lang.Object");
    }

    public final java.lang.Object w(int r6, m00.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: os.x.w(int, m00.c):java.lang.Object");
    }

    public final void x() {
        Boolean boolValueOf = Boolean.valueOf(this.j.a.isAuthorized() && this.i.h());
        p1 p1Var = this.A;
        p1Var.getClass();
        p1Var.k(null, boolValueOf);
    }
}
