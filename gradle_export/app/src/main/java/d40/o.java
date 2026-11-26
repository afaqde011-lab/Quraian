package d40;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ri.t1;

public abstract class o {
    public static final xn.a a = new xn.a(17);
    public static final cp.a b = new cp.a(11);
    public static final eh.l c = new eh.l("NO_VALUE", 2);
    public static final eh.l d = new eh.l("NONE", 2);
    public static final eh.l e = new eh.l("PENDING", 2);

    public static final d1 a(int i, int i2, c40.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(g4.c.f(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && aVar != c40.a.A) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new d1(i, i3, aVar);
    }

    public static d1 b(int i, int i2, c40.a aVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            aVar = c40.a.A;
        }
        return a(i3, i, aVar);
    }

    public static final p1 c(Object obj) {
        if (obj == null) {
            obj = e40.b.b;
        }
        return new p1(obj);
    }

    public static final void d(j jVar, Object obj, Object obj2, m00.c cVar) {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i = b0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0Var.C = i - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(cVar);
            }
        } else {
            b0Var = new b0(cVar);
        }
        Object obj3 = b0Var.B;
        Object obj4 = l00.a.A;
        int i2 = b0Var.C;
        if (i2 == 0) {
            t1.O(obj3);
            b0Var.A = obj2;
            b0Var.C = 1;
            if (jVar.emit(obj, b0Var) == obj4) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = b0Var.A;
            t1.O(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    public static final Object e(r1 r1Var, u00.o oVar, Throwable th, m00.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i = pVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.C = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(cVar);
            }
        } else {
            pVar = new p(cVar);
        }
        Object obj = pVar.B;
        Object obj2 = l00.a.A;
        int i2 = pVar.C;
        try {
            if (i2 == 0) {
                t1.O(obj);
                pVar.A = th;
                pVar.C = 1;
                if (oVar.invoke(r1Var, th, pVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = pVar.A;
                t1.O(obj);
            }
            return g00.b0.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                qd.s0.V(th2, th);
            }
            throw th2;
        }
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static i g(i iVar, int i) {
        c40.a aVar = c40.a.A;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(g4.c.f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            aVar = c40.a.B;
            i = 0;
        }
        int i2 = i;
        c40.a aVar2 = aVar;
        return iVar instanceof e40.m ? e40.b.b((e40.m) iVar, null, i2, aVar2, 1) : new e40.f(iVar, null, i2, aVar2, 2);
    }

    public static final Serializable h(i iVar, j jVar, m00.c cVar) throws Throwable {
        u uVar;
        kotlin.jvm.internal.z zVar;
        a40.e1 e1Var;
        CancellationException cancellationExceptionX;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.C = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(cVar);
            }
        } else {
            uVar = new u(cVar);
        }
        Object obj = uVar.B;
        l00.a aVar = l00.a.A;
        int i2 = uVar.C;
        if (i2 == 0) {
            t1.O(obj);
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            try {
                j wVar = new w(jVar, zVar2);
                uVar.A = zVar2;
                uVar.C = 1;
                if (iVar.collect(wVar, uVar) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                zVar = zVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = uVar.A;
            try {
                t1.O(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) zVar.A;
        if ((th3 != null && th3.equals(th)) || ((e1Var = (a40.e1) uVar.getContext().get(a40.w.B)) != null && e1Var.isCancelled() && (cancellationExceptionX = e1Var.x()) != null && cancellationExceptionX.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            qd.s0.V(th3, th);
            throw th3;
        }
        qd.s0.V(th, th3);
        throw th;
    }

    public static final Object i(i iVar, u00.n nVar, k00.c cVar) {
        int i = h0.a;
        Object objCollect = g(y(iVar, new g0(nVar, (k00.c) null, 0)), 0).collect(e40.o.A, cVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? objCollect : b0Var;
    }

    public static final t0 j(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, u00.r rVar) {
        return new t0(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, rVar);
    }

    public static final t0 k(i iVar, i iVar2, i iVar3, i iVar4, u00.q qVar) {
        return new t0(new i[]{iVar, iVar2, iVar3, iVar4}, qVar);
    }

    public static final t0 l(i iVar, i iVar2, i iVar3, u00.p pVar) {
        return new t0(new i[]{iVar, iVar2, iVar3}, pVar);
    }

    public static final oe.o m(i iVar) {
        c40.l.d.getClass();
        int i = c40.k.b;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if (iVar instanceof e40.d) {
            e40.d dVar = (e40.d) iVar;
            c40.a aVar = dVar.C;
            i iVarG = dVar.g();
            if (iVarG != null) {
                int i3 = dVar.B;
                if (i3 != -3 && i3 != -2 && i3 != 0) {
                    i2 = i3;
                } else if (aVar != c40.a.A || i3 == 0) {
                    i2 = 0;
                }
                return new oe.o(i2, aVar, iVarG, dVar.A);
            }
        }
        return new oe.o(i2, c40.a.A, iVar, k00.j.A);
    }

    public static final h n(i iVar, u00.n nVar) {
        kotlin.jvm.internal.d0.d(2, nVar);
        return p(iVar, a, nVar);
    }

    public static final i o(i iVar) {
        return iVar instanceof n1 ? iVar : p(iVar, a, b);
    }

    public static final h p(i iVar, u00.k kVar, u00.n nVar) {
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            if (hVar.B == kVar && hVar.C == nVar) {
                return hVar;
            }
        }
        return new h(iVar, kVar, nVar);
    }

    public static final Object q(j jVar, i iVar, m00.i iVar2) throws Throwable {
        if (jVar instanceof r1) {
            throw ((r1) jVar).A;
        }
        Object objCollect = iVar.collect(jVar, iVar2);
        return objCollect == l00.a.A ? objCollect : g00.b0.a;
    }

    public static final java.lang.Object r(d40.j r6, c40.v r7, boolean r8, k00.c r9) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: d40.o.r(d40.j, c40.v, boolean, k00.c):java.lang.Object");
    }

    public static final Object s(i iVar, k00.c cVar) {
        k0 k0Var;
        kotlin.jvm.internal.z zVar;
        AbortFlowException e2;
        i0 i0Var;
        eh.l lVar = e40.b.b;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i = k0Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                k0Var.D = i - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(cVar);
            }
        } else {
            k0Var = new k0(cVar);
        }
        Object obj = k0Var.C;
        Object obj2 = l00.a.A;
        int i2 = k0Var.D;
        if (i2 == 0) {
            t1.O(obj);
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            zVar2.A = lVar;
            i0 i0Var2 = new i0(zVar2, 0);
            try {
                k0Var.A = zVar2;
                k0Var.B = i0Var2;
                k0Var.D = 1;
                if (iVar.collect(i0Var2, k0Var) == obj2) {
                    return obj2;
                }
                zVar = zVar2;
            } catch (AbortFlowException e3) {
                zVar = zVar2;
                e2 = e3;
                i0Var = i0Var2;
                if (e2.A == i0Var) {
                    throw e2;
                }
                a40.c0.m(k0Var.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = k0Var.B;
            zVar = k0Var.A;
            try {
                t1.O(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.A == i0Var) {
                    throw e2;
                }
                a40.c0.m(k0Var.getContext());
            }
        }
        Object obj3 = zVar.A;
        if (obj3 != lVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    public static final Object t(i iVar, u00.n nVar, m00.c cVar) {
        l0 l0Var;
        kotlin.jvm.internal.z zVar;
        AbortFlowException e2;
        j jVar;
        eh.l lVar = e40.b.b;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i = l0Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0Var.D = i - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(cVar);
            }
        } else {
            l0Var = new l0(cVar);
        }
        Object obj = l0Var.C;
        Object obj2 = l00.a.A;
        int i2 = l0Var.D;
        if (i2 == 0) {
            t1.O(obj);
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            zVar2.A = lVar;
            j gVar = new b1.g(nVar, zVar2, 4);
            try {
                l0Var.A = zVar2;
                l0Var.B = gVar;
                l0Var.D = 1;
                if (iVar.collect(gVar, l0Var) == obj2) {
                    return obj2;
                }
                zVar = zVar2;
            } catch (AbortFlowException e3) {
                zVar = zVar2;
                e2 = e3;
                jVar = gVar;
                if (e2.A == jVar) {
                    throw e2;
                }
                a40.c0.m(l0Var.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = l0Var.B;
            zVar = l0Var.A;
            try {
                t1.O(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.A == jVar) {
                    throw e2;
                }
                a40.c0.m(l0Var.getContext());
            }
        }
        Object obj3 = zVar.A;
        if (obj3 != lVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    public static final Object u(i iVar, m00.c cVar) {
        m0 m0Var;
        kotlin.jvm.internal.z zVar;
        AbortFlowException e2;
        i0 i0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i = m0Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0Var.D = i - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(cVar);
            }
        } else {
            m0Var = new m0(cVar);
        }
        Object obj = m0Var.C;
        Object obj2 = l00.a.A;
        int i2 = m0Var.D;
        if (i2 == 0) {
            t1.O(obj);
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            i0 i0Var2 = new i0(zVar2, 1);
            try {
                m0Var.A = zVar2;
                m0Var.B = i0Var2;
                m0Var.D = 1;
                if (iVar.collect(i0Var2, m0Var) == obj2) {
                    return obj2;
                }
                zVar = zVar2;
            } catch (AbortFlowException e3) {
                zVar = zVar2;
                e2 = e3;
                i0Var = i0Var2;
                if (e2.A == i0Var) {
                    throw e2;
                }
                a40.c0.m(m0Var.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = m0Var.B;
            zVar = m0Var.A;
            try {
                t1.O(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.A == i0Var) {
                    throw e2;
                }
                a40.c0.m(m0Var.getContext());
            }
        }
        return zVar.A;
    }

    public static final i v(i iVar, k00.i iVar2) {
        if (iVar2.get(a40.w.B) == null) {
            if (iVar2.equals(k00.j.A)) {
                return iVar;
            }
            return iVar instanceof e40.m ? e40.b.b((e40.m) iVar, iVar2, 0, null, 6) : new e40.f(iVar, iVar2, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar2).toString());
    }

    public static final i w(a1 a1Var, k00.i iVar, int i, c40.a aVar) {
        return ((i == 0 || i == -3) && aVar == c40.a.A) ? a1Var : new e40.f(i, aVar, a1Var, iVar);
    }

    public static final z0 x(i iVar, a40.z zVar, h1 h1Var, Object obj) {
        oe.o oVarM = m(iVar);
        p1 p1VarC = c(obj);
        a40.c0.x(zVar, (k00.i) oVarM.D, h1Var.equals(g1.a) ? a40.a0.A : a40.a0.D, new a1.g(h1Var, (i) oVarM.B, p1VarC, obj, (k00.c) null));
        return new z0(p1VarC);
    }

    public static final e40.i y(i iVar, u00.o oVar) {
        int i = h0.a;
        return new e40.i(oVar, iVar, k00.j.A, -2, c40.a.A);
    }
}
