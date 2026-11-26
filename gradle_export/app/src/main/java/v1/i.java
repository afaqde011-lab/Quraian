package v1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import l1.y1;
import l1.z1;
import u.i0;
import u.j0;
import u.r0;

public final class i {

    public Set f15335a;

    public a2.e f15336b;

    public final m1.e f15337c;

    public j0 f15338d;

    public m1.e f15339e;

    public final m1.e f15340f;

    public final m1.e f15341g;

    public j0 f15342h;

    public i0 f15343i;

    public ArrayList f15344j;

    public j0 f15345k;

    public i() {
        m1.e eVar = new m1.e(0, new z1[16]);
        this.f15337c = eVar;
        j0 j0Var = r0.f14890a;
        this.f15338d = new j0();
        this.f15339e = eVar;
        this.f15340f = new m1.e(0, new Object[16]);
        this.f15341g = new m1.e(0, new u00.a[16]);
    }

    public static final boolean f(z1 z1Var, m1.e eVar) {
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            y1 y1VarA = ((z1) objArr[i11]).a();
            if (y1VarA instanceof f) {
                m1.e eVar2 = ((f) y1VarA).B;
                if (eVar2.j(z1Var) || f(z1Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f15335a = null;
        this.f15336b = null;
        m1.e eVar = this.f15337c;
        eVar.g();
        this.f15338d.b();
        this.f15339e = eVar;
        this.f15340f.g();
        this.f15341g.g();
        this.f15342h = null;
        this.f15343i = null;
        this.f15344j = null;
    }

    public final void b() {
        Set set = this.f15335a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                y1 y1Var = (y1) it.next();
                it.remove();
                y1Var.b();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: v1.i.c():void");
    }

    public final void d() {
        m1.e eVar = this.f15341g;
        if (eVar.C != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.A;
                int i10 = eVar.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((u00.a) objArr[i11]).invoke();
                }
                eVar.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(z1 z1Var) {
        if (!this.f15338d.c(z1Var)) {
            j0 j0Var = this.f15345k;
            if (j0Var == null || !j0Var.c(z1Var)) {
                this.f15340f.b(z1Var);
                return;
            }
            return;
        }
        this.f15338d.l(z1Var);
        if (!this.f15339e.j(z1Var)) {
            m1.e eVar = this.f15337c;
            if (!eVar.j(z1Var)) {
                f(z1Var, eVar);
            }
        }
        Set set = this.f15335a;
        if (set == null) {
            return;
        }
        set.add(z1Var.a());
    }

    public final void g(Set set, a2.e eVar) {
        a();
        this.f15335a = set;
        this.f15336b = eVar;
    }

    public final void h(z1 z1Var) {
        this.f15339e.b(z1Var);
        this.f15338d.a(z1Var);
    }
}
