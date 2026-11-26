package is;

import a40.u1;
import a40.w1;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ri.t1;

public final class y {
    public final j a;
    public final f b;
    public final c c;
    public final m d;
    public final m1 e;
    public final br.i f;
    public final p0 g;
    public final c0 h;
    public final c1 i;
    public final l0 j;
    public final wo.c0 k;
    public final z l;
    public final a40.z m;
    public final AtomicReference n;
    public final AtomicReference o;
    public final AtomicReference p;
    public final AtomicReference q;
    public final j40.c r;
    public long s;
    public final ArrayList t;
    public u1 u;

    public y(j jVar, f fVar, c cVar, m mVar, m1 m1Var, br.i iVar, p0 p0Var, c0 c0Var, c1 c1Var, l0 l0Var, wo.c0 c0Var2, z zVar) {
        w1 w1VarE = a40.c0.e();
        h40.e eVar = a40.m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, h40.d.C));
        this.a = jVar;
        this.b = fVar;
        this.c = cVar;
        this.d = mVar;
        this.e = m1Var;
        this.f = iVar;
        this.g = p0Var;
        this.h = c0Var;
        this.i = c1Var;
        this.j = l0Var;
        this.k = c0Var2;
        this.l = zVar;
        this.m = cVarC;
        this.n = new AtomicReference(null);
        this.o = new AtomicReference(null);
        this.p = new AtomicReference(null);
        this.q = new AtomicReference(null);
        this.r = j40.d.a();
        this.t = new ArrayList();
        a40.c0.y(cVarC, null, null, new p(this, null, 0), 3);
    }

    public static final void a(y yVar, int i, LocalDateTime localDateTime, rs.e eVar) {
        LocalDateTime localDateTimeTruncatedTo = localDateTime.truncatedTo(ChronoUnit.HOURS);
        ArrayList arrayList = yVar.t;
        n1 n1Var = (n1) h00.q.U0(arrayList);
        if (n1Var != null && kotlin.jvm.internal.m.a(n1Var.c, eVar) && n1Var.b.equals(localDateTimeTruncatedTo)) {
            n1Var.d += i;
        } else {
            kotlin.jvm.internal.m.b(localDateTimeTruncatedTo);
            arrayList.add(new n1(localDateTime, localDateTimeTruncatedTo, eVar, i));
        }
    }

    public static final Object b(y yVar, m00.c cVar) {
        t tVar;
        int i;
        Iterator it;
        ArrayList arrayList = yVar.t;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.E = i2 - Integer.MIN_VALUE;
            } else {
                tVar = new t(yVar, cVar);
            }
        } else {
            tVar = new t(yVar, cVar);
        }
        Object obj = tVar.C;
        Object obj2 = l00.a.A;
        int i3 = tVar.E;
        if (i3 == 0) {
            t1.O(obj);
            u1 u1Var = yVar.u;
            yVar.u = null;
            if (u1Var != null && u1Var != tVar.getContext().get(a40.w.B)) {
                u1Var.i(null);
            }
            if (!arrayList.isEmpty()) {
                List listN1 = h00.q.n1(arrayList);
                arrayList.clear();
                i = 0;
                it = listN1.iterator();
            }
            return g00.b0.a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = tVar.B;
        it = tVar.A;
        t1.O(obj);
        while (it.hasNext()) {
            n1 n1Var = (n1) it.next();
            int i4 = n1Var.d;
            LocalDateTime localDateTime = n1Var.a;
            rs.e eVar = n1Var.c;
            tVar.A = it;
            tVar.B = i;
            tVar.E = 1;
            if (yVar.d(i4, localDateTime, eVar, tVar) == obj2) {
                return obj2;
            }
        }
        return g00.b0.a;
    }

    public final Object c(m00.c cVar) {
        h40.e eVar = a40.m0.a;
        Object objJ = a40.c0.J(new r(this, null, 0), h40.d.C, cVar);
        return objJ == l00.a.A ? objJ : g00.b0.a;
    }

    public final java.lang.Object d(int r10, java.time.LocalDateTime r11, rs.e r12, m00.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: is.y.d(int, java.time.LocalDateTime, rs.e, m00.c):java.lang.Object");
    }

    public final void e() {
        ta.c0.M(this.m, (k00.i) null, (u00.n) null, (u00.k) null, new r(this, null, 1), 31);
    }

    public final java.lang.Object f(int r32, java.time.LocalDateTime r33, rs.e r34, m00.c r35) {
        throw new UnsupportedOperationException("Method not decompiled: is.y.f(int, java.time.LocalDateTime, rs.e, m00.c):java.lang.Object");
    }

    public final java.lang.Object g(int r34, java.time.LocalDateTime r35, rs.e r36, m00.c r37) {
        throw new UnsupportedOperationException("Method not decompiled: is.y.g(int, java.time.LocalDateTime, rs.e, m00.c):java.lang.Object");
    }

    public final java.lang.Object h(int r32, java.time.LocalDateTime r33, m00.c r34) {
        throw new UnsupportedOperationException("Method not decompiled: is.y.h(int, java.time.LocalDateTime, m00.c):java.lang.Object");
    }

    public final java.lang.Object i(int r35, java.time.LocalDateTime r36, rs.e r37, m00.c r38) {
        throw new UnsupportedOperationException("Method not decompiled: is.y.i(int, java.time.LocalDateTime, rs.e, m00.c):java.lang.Object");
    }
}
