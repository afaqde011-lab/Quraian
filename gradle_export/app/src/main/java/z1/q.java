package z1;

import h0.u1;

public abstract class q {

    public static final Object f17048a = new Object();

    public static final Object f17049b = new Object();

    public static final Object f17050c = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final boolean b(w wVar, int i10, r1.c cVar, boolean z10) {
        boolean z11;
        synchronized (f17048a) {
            try {
                int i11 = wVar.f17075d;
                if (i11 == i10) {
                    wVar.f17074c = cVar;
                    z11 = true;
                    if (z10) {
                        wVar.f17076e++;
                    }
                    wVar.f17075d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final boolean c(d0 d0Var, int i10, t1.b bVar) {
        boolean z10;
        synchronized (f17050c) {
            int i11 = d0Var.f17016d;
            if (i11 == i10) {
                d0Var.f17015c = bVar;
                z10 = true;
                d0Var.f17016d = i11 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static final int d(long[] jArr, long j9) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j10 = jArr[i11];
            if (j9 > j10) {
                i10 = i11 + 1;
            } else {
                if (j9 >= j10) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static f f() {
        return (f) l.f17037b.get();
    }

    public static final int g(v vVar) {
        d0 d0Var = vVar.A;
        kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((d0) l.h(d0Var)).f17016d;
    }

    public static final w h(p pVar) {
        w wVar = pVar.A;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (w) l.t(wVar, pVar);
    }

    public static final d0 i(v vVar) {
        d0 d0Var = vVar.A;
        kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (d0) l.t(d0Var, vVar);
    }

    public static final int j(p pVar) {
        w wVar = pVar.A;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((w) l.h(wVar)).f17076e;
    }

    public static f k(f fVar) {
        if (fVar instanceof f0) {
            f0 f0Var = (f0) fVar;
            if (f0Var.f17028t == v1.d.b()) {
                f0Var.f17026r = null;
                return fVar;
            }
        }
        if (fVar instanceof g0) {
            g0 g0Var = (g0) fVar;
            if (g0Var.f17034i == v1.d.b()) {
                g0Var.f17033h = null;
                return fVar;
            }
        }
        f fVarG = l.g(fVar, null, false);
        fVarG.j();
        return fVarG;
    }

    public static final boolean l(p pVar, u00.k kVar) {
        int i10;
        r1.c cVar;
        Object objInvoke;
        f fVarJ;
        boolean zB;
        do {
            synchronized (f17048a) {
                w wVar = pVar.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            r1.f fVarI = cVar.i();
            objInvoke = kVar.invoke(fVarI);
            r1.c cVarE = fVarI.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar)) {
                break;
            }
            w wVar3 = pVar.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = b((w) l.w(wVar3, pVar, fVarJ), i10, cVarE, true);
            }
            l.n(fVarJ, pVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object m(u1 u1Var, u00.a aVar) {
        f f0Var;
        f fVar = (f) l.f17037b.get();
        if (fVar instanceof f0) {
            f0 f0Var2 = (f0) fVar;
            if (f0Var2.f17028t == v1.d.b()) {
                u00.k kVar = f0Var2.f17026r;
                u00.k kVar2 = f0Var2.f17027s;
                try {
                    ((f0) fVar).f17026r = l.k(true, u1Var, kVar);
                    ((f0) fVar).f17027s = kVar2;
                    return aVar.invoke();
                } finally {
                    f0Var2.f17026r = kVar;
                    f0Var2.f17027s = kVar2;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            f0Var = new f0(fVar instanceof b ? (b) fVar : null, u1Var, null, true, false);
        } else {
            f0Var = fVar.u(u1Var);
        }
        try {
            f fVarJ = f0Var.j();
            try {
                Object objInvoke = aVar.invoke();
                f.q(fVarJ);
                f0Var.c();
                return objInvoke;
            } catch (Throwable th2) {
                f.q(fVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            f0Var.c();
            throw th3;
        }
    }

    public static void n(f fVar, f fVar2, u00.k kVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof f0) {
            ((f0) fVar).f17026r = kVar;
        } else if (fVar instanceof g0) {
            ((g0) fVar).f17033h = kVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static final void o() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();
}
