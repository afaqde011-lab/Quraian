package e7;

import a1.u0;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.measurement.x5;
import e30.x0;
import j10.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

public final class l0 {

    public boolean f5147a;

    public boolean f5148b;

    public final Object f5149c;

    public final Object f5150d;

    public final Object f5151e;

    public l0(Context context, Looper looper, b0 b0Var) {
        this.f5149c = new u0(context.getApplicationContext(), 23);
        this.f5150d = b0Var.a(looper, null);
        this.f5151e = b0Var.a(Looper.getMainLooper(), null);
    }

    public l0(Context context, String str, qd.j0 j0Var, boolean z10, boolean z11) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(j0Var, "callback");
        this.f5149c = context;
        this.f5150d = str;
        this.f5151e = j0Var;
        this.f5147a = z10;
        this.f5148b = z11;
    }

    public l0(k10.a aVar, boolean z10, oj.q qVar, x10.a aVar2, boolean z11) {
        kotlin.jvm.internal.m.e(qVar, "containerContext");
        this.f5149c = aVar;
        this.f5147a = z10;
        this.f5150d = qVar;
        this.f5151e = aVar2;
        this.f5148b = z11;
    }

    public static void a(Object obj, ArrayList arrayList, a20.d dVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) dVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, dVar);
            }
        }
    }

    public static n20.d c(e30.a0 a0Var) {
        g30.i iVar = x0.a;
        j10.e eVarG = a0Var.m0().g();
        j10.e eVar = eVarG instanceof j10.e ? eVarG : null;
        if (eVar != null) {
            return q20.d.f(eVar);
        }
        return null;
    }

    public static f20.h d(h30.g gVar) {
        e30.a0 a0VarH;
        e30.a0 a0VarH2;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.q qVarG = f30.g.g(gVar);
        if (qVarG == null || (a0VarH = f30.g.R(qVarG)) == null) {
            a0VarH = f30.g.h(gVar);
            kotlin.jvm.internal.m.b(a0VarH);
        }
        if (f30.g.J(a0VarH)) {
            return f20.h.B;
        }
        e30.q qVarG2 = f30.g.g(gVar);
        if (qVarG2 == null || (a0VarH2 = f30.g.c0(qVarG2)) == null) {
            a0VarH2 = f30.g.h(gVar);
            kotlin.jvm.internal.m.b(a0VarH2);
        }
        if (f30.g.J(a0VarH2)) {
            return null;
        }
        return f20.h.C;
    }

    public f20.i b(h30.m mVar) throws NoWhenBranchMatchedException {
        List list;
        f20.h hVar;
        kotlin.jvm.internal.m.e(mVar, "<this>");
        if (!(mVar instanceof b20.f0)) {
            return null;
        }
        if (!(mVar instanceof r0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, mVar.getClass(), sb2).toString());
        }
        List upperBounds = ((r0) mVar).getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!f30.g.F((h30.g) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (d((h30.g) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                g00.h hVarI = rd.a.I(g00.i.C, new f20.a(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            kotlin.jvm.internal.m.e((h30.g) it2.next(), "<this>");
                            list = upperBounds;
                        }
                    }
                    return new f20.i(f20.h.A, false);
                }
                if (((List) hVarI.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) hVarI.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        kotlin.jvm.internal.m.e((h30.g) it3.next(), "<this>");
                        list = (List) hVarI.getValue();
                    }
                }
                return new f20.i(f20.h.A, true);
                if (list != null && list.isEmpty()) {
                    hVar = f20.h.B;
                    break;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        hVar = f20.h.B;
                        break;
                    }
                    if (!f30.g.L((h30.g) it4.next())) {
                        hVar = f20.h.C;
                        break;
                    }
                }
                return new f20.i(hVar, list != upperBounds);
            }
        }
        return null;
    }

    public void e(final boolean z10, final boolean z11) {
        d0 d0Var = (d0) this.f5150d;
        if (z10 && z11) {
            d0Var.d(new Runnable() {
                @Override
                public final void run() {
                    u0.o((u0) this.A.f5149c, z10, z11);
                }
            });
            return;
        }
        u0 u0Var = (u0) this.f5149c;
        Objects.requireNonNull(u0Var);
        final androidx.lifecycle.i0 i0Var = new androidx.lifecycle.i0(u0Var, 15);
        ((d0) this.f5151e).f5120a.postDelayed(i0Var, 1000L);
        d0Var.d(new Runnable() {
            @Override
            public final void run() {
                l0 l0Var = this.A;
                ((d0) l0Var.f5151e).f5120a.removeCallbacks(i0Var);
                u0.o((u0) l0Var.f5149c, z10, z11);
            }
        });
    }

    public void f(boolean z10) {
        if (this.f5148b == z10) {
            return;
        }
        this.f5148b = z10;
        if (this.f5147a) {
            e(true, z10);
        }
    }

    public ArrayList g(h30.g gVar) {
        oj.q qVar = (oj.q) this.f5150d;
        x10.s sVar = (x10.s) qVar.D.getValue();
        x10.b bVar = ((a20.b) qVar.B).q;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        f20.b bVar2 = new f20.b(gVar, x10.b.b(bVar, sVar, ((e30.w) gVar).getAnnotations()), (h30.m) null);
        a20.d dVar = new a20.d(this, 14);
        ArrayList arrayList = new ArrayList(1);
        a(bVar2, arrayList, dVar);
        return arrayList;
    }
}
