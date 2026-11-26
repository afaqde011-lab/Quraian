package l1;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class x1 extends n {
    public static final d40.p1 B = d40.o.c(t1.b.D);
    public static final AtomicReference C = new AtomicReference(Boolean.FALSE);
    public final c A;

    public long f9949a;

    public final c3.w0 f9950b;

    public final k9.x0 f9951c;

    public final Object f9952d;

    public a40.e1 f9953e;

    public Throwable f9954f;

    public final ArrayList f9955g;

    public Object f9956h;

    public u.j0 f9957i;

    public final m1.e f9958j;

    public final ArrayList f9959k;
    public final ArrayList l;
    public final u.i0 m;

    public final h7.b f9960n;

    public final u.i0 f9961o;

    public final u.i0 f9962p;

    public ArrayList f9963q;

    public u.j0 f9964r;

    public a40.k f9965s;

    public boolean f9966t;

    public final d40.p1 f9967u;

    public boolean f9968v;

    public final d40.p1 f9969w;

    public final sd.p1 f9970x;

    public final a40.f1 f9971y;

    public final k00.i f9972z;

    public x1(k00.i iVar) {
        c3.w0 w0Var = new c3.w0(new t1(this, 0));
        this.f9950b = w0Var;
        this.f9951c = new k9.x0(new t1(this, 1));
        this.f9952d = new Object();
        this.f9955g = new ArrayList();
        this.f9957i = new u.j0();
        this.f9958j = new m1.e(0, new p[16]);
        this.f9959k = new ArrayList();
        this.l = new ArrayList();
        this.m = new u.i0();
        this.f9960n = new h7.b(11);
        this.f9961o = new u.i0();
        this.f9962p = new u.i0();
        this.f9967u = d40.o.c((Object) null);
        this.f9969w = d40.o.c(v1.C);
        this.f9970x = new sd.p1(14);
        a40.f1 f1Var = new a40.f1(iVar.get(a40.w.B));
        f1Var.f0(new h00.a(this, 17));
        this.f9971y = f1Var;
        this.f9972z = iVar.plus(w0Var).plus(f1Var);
        this.A = new c(9);
    }

    public static final void B(x1 x1Var, t0 t0Var, t0 t0Var2) {
        List list = t0Var2.f9937h;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t0 t0Var3 = (t0) list.get(i10);
                h7.b bVar = x1Var.f9960n;
                r0 r0Var = t0Var3.f9930a;
                m1.a.a((u.i0) bVar.A, r0Var, new a1(t0Var3, t0Var));
                m1.a.a((u.i0) bVar.B, t0Var, r0Var);
                B(x1Var, t0Var, t0Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, x1 x1Var, p pVar) {
        arrayList.clear();
        synchronized (x1Var.f9952d) {
            Iterator it = x1Var.l.iterator();
            while (it.hasNext()) {
                t0 t0Var = (t0) it.next();
                if (t0Var.f9932c.equals(pVar)) {
                    arrayList.add(t0Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(z1.b bVar) {
        try {
            if (bVar.w() instanceof z1.g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (Throwable th2) {
            bVar.c();
            throw th2;
        }
    }

    public final void A() {
        synchronized (this.f9952d) {
            if (((v1) this.f9969w.getValue()).compareTo(v1.E) >= 0) {
                d40.p1 p1Var = this.f9969w;
                v1 v1Var = v1.B;
                p1Var.getClass();
                p1Var.k((Object) null, v1Var);
            }
        }
        this.f9971y.i((CancellationException) null);
    }

    public final a40.j C() {
        v1 v1Var;
        d40.p1 p1Var = this.f9969w;
        int iCompareTo = ((v1) p1Var.getValue()).compareTo(v1.B);
        d40.p1 p1Var2 = this.f9967u;
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.f9959k;
        m1.e eVar = this.f9958j;
        if (iCompareTo > 0) {
            if (p1Var2.getValue() != null) {
                v1Var = v1.C;
            } else if (this.f9953e == null) {
                this.f9957i = new u.j0();
                eVar.g();
                v1Var = (D() || F()) ? v1.D : v1.C;
            } else {
                v1Var = (eVar.C != 0 || this.f9957i.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.m.j()) ? v1.F : v1.E;
            }
            p1Var.getClass();
            p1Var.k((Object) null, v1Var);
            if (v1Var != v1.F) {
                return null;
            }
            a40.k kVar = this.f9965s;
            this.f9965s = null;
            return kVar;
        }
        List listH = H();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
        this.f9955g.clear();
        this.f9956h = h00.x.A;
        this.f9957i = new u.j0();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f9963q = null;
        a40.k kVar2 = this.f9965s;
        if (kVar2 != null) {
            kVar2.h((Throwable) null);
        }
        this.f9965s = null;
        p1Var2.j((Object) null);
        return null;
    }

    public final boolean D() {
        return !this.f9968v && (((v1.a) ((ce.c) this.f9950b.C).D).get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.f9958j.C != 0 || D() || F() || this.m.j();
    }

    public final boolean F() {
        return !this.f9968v && (((v1.a) ((ce.c) this.f9951c.C).D).get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z10;
        synchronized (this.f9952d) {
            z10 = this.f9957i.h() || this.f9958j.C != 0 || D() || F();
        }
        return z10;
    }

    public final List H() {
        ?? r4 = this.f9956h;
        if (r4 != 0) {
            return r4;
        }
        ArrayList arrayList = this.f9955g;
        h00.x arrayList2 = arrayList.isEmpty() ? h00.x.A : new ArrayList(arrayList);
        this.f9956h = arrayList2;
        return arrayList2;
    }

    public final void I() {
        a40.k kVarC;
        synchronized (this.f9952d) {
            kVarC = C();
            if (((v1) this.f9969w.getValue()).compareTo(v1.B) <= 0) {
                throw a40.c0.a("Recomposer shutdown; frame clock awaiter will never resume", this.f9954f);
            }
        }
        if (kVarC != null) {
            kVarC.resumeWith(g00.b0.a);
        }
    }

    public final void J(p pVar) {
        synchronized (this.f9952d) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((t0) arrayList.get(i10)).f9932c.equals(pVar)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, pVar);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, pVar);
                    }
                    return;
                }
            }
        }
    }

    public final List L(List list, u.j0 j0Var) {
        z1.b bVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            p pVar = ((t0) obj).f9932c;
            Object arrayList2 = map.get(pVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(pVar, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            p pVar2 = (p) entry.getKey();
            List list2 = (List) entry.getValue();
            if (pVar2.V.F) {
                l.a("Check failed");
            }
            u00.k aVar = new h00.a(pVar2, 16);
            h1.v0 v0Var = new h1.v0(pVar2, j0Var, 22);
            z1.f fVarJ = z1.l.j();
            z1.b bVar = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(aVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                z1.f fVarJ2 = bVarC.j();
                try {
                    synchronized (this.f9952d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                t0 t0Var = (t0) list2.get(i11);
                                Object objB = m1.a.b(this.m, t0Var.f9930a);
                                t0 t0Var2 = (t0) objB;
                                if (t0Var2 != null) {
                                    this.f9960n.B(t0Var2);
                                }
                                arrayList.add(new g00.k(t0Var, objB));
                            }
                            int size3 = arrayList.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                g00.k kVar = (g00.k) arrayList.get(i12);
                                if (kVar.B == null) {
                                    if (((u.i0) this.f9960n.A).b(((t0) kVar.A).f9930a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i13 = 0; i13 < size4; i13++) {
                                            g00.k kVar2 = (g00.k) arrayList.get(i13);
                                            if (kVar2.B == null) {
                                                h7.b bVar2 = this.f9960n;
                                                r0 r0Var = ((t0) kVar2.A).f9930a;
                                                u.i0 i0Var = (u.i0) bVar2.A;
                                                a1 a1Var = (a1) m1.a.b(i0Var, r0Var);
                                                if (i0Var.i()) {
                                                    ((u.i0) bVar2.B).a();
                                                }
                                                if (a1Var != null) {
                                                    t0 t0Var3 = a1Var.f9825a;
                                                    m1.a.a(this.f9962p, a1Var.f9826b, t0Var3);
                                                    kVar2 = new g00.k(kVar2.A, t0Var3);
                                                }
                                            }
                                            arrayList3.add(kVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        if (((g00.k) arrayList.get(i14)).B != null) {
                            int size6 = arrayList.size();
                            for (int i15 = 0; i15 < size6; i15++) {
                                if (((g00.k) arrayList.get(i15)).B == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i16 = 0; i16 < size7; i16++) {
                                        g00.k kVar3 = (g00.k) arrayList.get(i16);
                                        t0 t0Var4 = kVar3.B == null ? (t0) kVar3.A : null;
                                        if (t0Var4 != null) {
                                            arrayList4.add(t0Var4);
                                        }
                                    }
                                    synchronized (this.f9952d) {
                                        h00.v.u0(arrayList4, this.l);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i17 = 0; i17 < size8; i17++) {
                                        Object obj2 = arrayList.get(i17);
                                        if (((g00.k) obj2).B != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    pVar2.t(arrayList);
                    z1.f.q(fVarJ2);
                    z(bVarC);
                } catch (Throwable th3) {
                    z1.f.q(fVarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                z(bVarC);
                throw th4;
            }
        }
        return h00.q.n1(map.keySet());
    }

    public final p M(p pVar, u.j0 j0Var) {
        z1.b bVarC;
        if (pVar.V.F || pVar.W == 3) {
            return null;
        }
        u.j0 j0Var2 = this.f9964r;
        if (j0Var2 == null || !j0Var2.c(pVar)) {
            u00.k aVar = new h00.a(pVar, 16);
            h1.v0 v0Var = new h1.v0(pVar, j0Var, 22);
            z1.f fVarJ = z1.l.j();
            z1.b bVar = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(aVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                z1.f fVarJ2 = bVarC.j();
                if (j0Var != null) {
                    try {
                        if (j0Var.h()) {
                            a1.o1 o1Var = new a1.o1(j0Var, pVar, 28);
                            g0 g0Var = pVar.V;
                            if (g0Var.F) {
                                l.a("Preparing a composition while composing is not supported");
                            }
                            g0Var.F = true;
                            try {
                                o1Var.invoke();
                                g0Var.F = false;
                            } catch (Throwable th2) {
                                g0Var.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        z1.f.q(fVarJ2);
                        throw th3;
                    }
                }
                boolean zX = pVar.x();
                z1.f.q(fVarJ2);
                z(bVarC);
                if (zX) {
                    return pVar;
                }
            } catch (Throwable th4) {
                z(bVarC);
                throw th4;
            }
        }
        return null;
    }

    public final void N(Throwable th2, p pVar) throws Throwable {
        if (!((Boolean) C.get()).booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f9952d) {
                Log.e("ComposeInternal", "Error was captured in composition.", th2);
                u1 u1Var = (u1) this.f9967u.getValue();
                if (u1Var != null) {
                    throw u1Var.f9941a;
                }
                d40.p1 p1Var = this.f9967u;
                u1 u1Var2 = new u1(th2);
                p1Var.getClass();
                p1Var.k((Object) null, u1Var2);
            }
            throw th2;
        }
        synchronized (this.f9952d) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f9959k.clear();
                this.f9958j.g();
                this.f9957i = new u.j0();
                this.l.clear();
                this.m.a();
                this.f9961o.a();
                d40.p1 p1Var2 = this.f9967u;
                u1 u1Var3 = new u1(th2);
                p1Var2.getClass();
                p1Var2.k((Object) null, u1Var3);
                if (pVar != null) {
                    P(pVar);
                }
                if (C() != null) {
                    l.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean O() {
        boolean zE;
        synchronized (this.f9952d) {
            if (this.f9957i.g()) {
                return E();
            }
            List listH = H();
            m1.h hVar = new m1.h(this.f9957i);
            this.f9957i = new u.j0();
            try {
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p) listH.get(i10)).y(hVar);
                    if (((v1) this.f9969w.getValue()).compareTo(v1.B) <= 0) {
                        break;
                    }
                }
                synchronized (this.f9952d) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th2) {
                synchronized (this.f9952d) {
                    u.j0 j0Var = this.f9957i;
                    j0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        j0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void P(p pVar) {
        ArrayList arrayList = this.f9963q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f9963q = arrayList;
        }
        if (!arrayList.contains(pVar)) {
            arrayList.add(pVar);
        }
        if (this.f9955g.remove(pVar)) {
            this.f9956h = null;
        }
    }

    public final Object Q(m00.i iVar) {
        Object objJ = a40.c0.J(new a1.f(this, new w1(this, null), q.u(iVar.getContext()), (k00.c) null, 4), this.f9950b, iVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objJ != aVar) {
            objJ = b0Var;
        }
        return objJ == aVar ? objJ : b0Var;
    }

    @Override
    public final void a(p pVar, u00.n nVar) throws Throwable {
        v1 v1Var;
        boolean zContains;
        z1.b bVarC;
        boolean z10 = pVar.V.F;
        synchronized (this.f9952d) {
            v1 v1Var2 = (v1) this.f9969w.getValue();
            v1Var = v1.B;
            zContains = v1Var2.compareTo(v1Var) > 0 ? true ^ H().contains(pVar) : true;
        }
        try {
            u00.k aVar = new h00.a(pVar, 16);
            h1.v0 v0Var = new h1.v0(pVar, null, 22);
            z1.f fVarJ = z1.l.j();
            z1.b bVar = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(aVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                z1.f fVarJ2 = bVarC.j();
                try {
                    pVar.m(nVar);
                    z1.f.q(fVarJ2);
                    z(bVarC);
                    synchronized (this.f9952d) {
                        if (((v1) this.f9969w.getValue()).compareTo(v1Var) > 0 && !H().contains(pVar)) {
                            this.f9955g.add(pVar);
                            this.f9956h = null;
                        }
                    }
                    if (!z10) {
                        z1.l.j().m();
                    }
                    try {
                        J(pVar);
                        try {
                            pVar.g();
                            pVar.i();
                            if (z10) {
                                return;
                            }
                            z1.l.j().m();
                        } catch (Throwable th2) {
                            N(th2, null);
                        }
                    } catch (Throwable th3) {
                        N(th3, pVar);
                    }
                } catch (Throwable th4) {
                    z1.f.q(fVarJ2);
                    throw th4;
                }
            } catch (Throwable th5) {
                z(bVarC);
                throw th5;
            }
        } catch (Throwable th6) {
            if (zContains) {
                synchronized (this.f9952d) {
                }
            }
            N(th6, pVar);
        }
    }

    @Override
    public final u.j0 b(p pVar, d2 d2Var, u00.n nVar) {
        sd.p1 p1Var = this.f9970x;
        try {
            d2 d2Var2 = pVar.P;
            pVar.P = d2Var;
            try {
                a(pVar, nVar);
                u.j0 j0Var = (u.j0) p1Var.get();
                if (j0Var == null) {
                    j0Var = u.r0.f14890a;
                    kotlin.jvm.internal.m.c(j0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                pVar.P = d2Var2;
                p1Var.F(null);
                return j0Var;
            } catch (Throwable th2) {
                pVar.P = d2Var2;
                throw th2;
            }
        } catch (Throwable th3) {
            p1Var.F(null);
            throw th3;
        }
    }

    @Override
    public final void c(t0 t0Var) {
        a40.k kVarC;
        synchronized (this.f9952d) {
            try {
                m1.a.a(this.m, t0Var.f9930a, t0Var);
                if (t0Var.f9937h != null) {
                    B(this, t0Var, t0Var);
                }
                kVarC = C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVarC != null) {
            kVarC.resumeWith(g00.b0.a);
        }
    }

    @Override
    public final boolean e() {
        return ((Boolean) C.get()).booleanValue();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final long h() {
        return 1000;
    }

    @Override
    public final m i() {
        return null;
    }

    @Override
    public final k00.i k() {
        return this.f9972z;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(t0 t0Var) {
        a40.k kVarC;
        synchronized (this.f9952d) {
            this.l.add(t0Var);
            kVarC = C();
        }
        if (kVarC != null) {
            kVarC.resumeWith(g00.b0.a);
        }
    }

    @Override
    public final void n(p pVar) {
        a40.j jVarC;
        synchronized (this.f9952d) {
            if (this.f9958j.h(pVar)) {
                jVarC = null;
            } else {
                this.f9958j.b(pVar);
                jVarC = C();
            }
        }
        if (jVarC != null) {
            ((a40.k) jVarC).resumeWith(g00.b0.a);
        }
    }

    @Override
    public final void o(t0 t0Var, s0 s0Var, a aVar) {
        u.d0 d0Var;
        synchronized (this.f9952d) {
            this.f9961o.m(t0Var, s0Var);
            Object objG = this.f9962p.g(t0Var);
            if (objG == null) {
                d0Var = u.o0.f14882b;
                kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            } else if (objG instanceof u.d0) {
                d0Var = (u.d0) objG;
            } else {
                Object[] objArr = u.o0.f14881a;
                u.d0 d0Var2 = new u.d0(1);
                d0Var2.a(objG);
                d0Var = d0Var2;
            }
            if (d0Var.i()) {
                u.i0 i0VarE = s0Var.f9927a.e(aVar, d0Var);
                Object[] objArr2 = i0VarE.f14857b;
                Object[] objArr3 = i0VarE.f14858c;
                long[] jArr = i0VarE.f14856a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j9 = jArr[i10];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j9) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr2[i13];
                                    this.f9961o.m((t0) obj, (s0) objArr3[i13]);
                                }
                                j9 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final s0 p(t0 t0Var) {
        s0 s0Var;
        synchronized (this.f9952d) {
            s0Var = (s0) this.f9961o.k(t0Var);
        }
        return s0Var;
    }

    @Override
    public final u.j0 q(p pVar, d2 d2Var, u.j0 j0Var) {
        sd.p1 p1Var = this.f9970x;
        try {
            O();
            pVar.y(new m1.h(j0Var));
            d2 d2Var2 = pVar.P;
            pVar.P = d2Var;
            try {
                p pVarM = M(pVar, null);
                if (pVarM != null) {
                    J(pVar);
                    pVarM.g();
                    pVarM.i();
                }
                u.j0 j0Var2 = (u.j0) p1Var.get();
                if (j0Var2 == null) {
                    j0Var2 = u.r0.f14890a;
                    kotlin.jvm.internal.m.c(j0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                pVar.P = d2Var2;
                p1Var.F(null);
                return j0Var2;
            } catch (Throwable th2) {
                pVar.P = d2Var2;
                throw th2;
            }
        } catch (Throwable th3) {
            p1Var.F(null);
            throw th3;
        }
    }

    @Override
    public final void r(Set set) {
    }

    @Override
    public final void t(r1 r1Var) {
        sd.p1 p1Var = this.f9970x;
        u.j0 j0Var = (u.j0) p1Var.get();
        if (j0Var == null) {
            u.j0 j0Var2 = u.r0.f14890a;
            j0Var = new u.j0();
            p1Var.F(j0Var);
        }
        j0Var.a(r1Var);
    }

    @Override
    public final void u(p pVar) {
        synchronized (this.f9952d) {
            try {
                u.j0 j0Var = this.f9964r;
                if (j0Var == null) {
                    u.j0 j0Var2 = u.r0.f14890a;
                    j0Var = new u.j0();
                    this.f9964r = j0Var;
                }
                j0Var.a(pVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final d v(b3.j0 j0Var) {
        k9.x0 x0Var = this.f9951c;
        ce.c cVar = (ce.c) x0Var.C;
        b1 b1Var = new b1();
        b1Var.f9829a = j0Var;
        return cVar.p(b1Var, (a1.o1) x0Var.D);
    }

    @Override
    public final void y(p pVar) {
        synchronized (this.f9952d) {
            if (this.f9955g.remove(pVar)) {
                this.f9956h = null;
            }
            this.f9958j.j(pVar);
            this.f9959k.remove(pVar);
        }
    }
}
