package s7;

import android.os.Looper;
import androidx.media3.common.k2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a {

    public final ArrayList f13637a = new ArrayList(1);

    public final HashSet f13638b = new HashSet(1);

    public final c50.h f13639c = new c50.h(new CopyOnWriteArrayList(), 0, (a0) null);

    public final n7.h f13640d = new n7.h(new CopyOnWriteArrayList(), 0, null);

    public Looper f13641e;

    public k2 f13642f;

    public j7.j f13643g;

    public boolean a(androidx.media3.common.q0 q0Var) {
        return false;
    }

    public abstract y b(a0 a0Var, a1.i iVar, long j9);

    public final void c(b0 b0Var) {
        HashSet hashSet = this.f13638b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(b0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public void d() {
    }

    public final void e(b0 b0Var) {
        this.f13641e.getClass();
        HashSet hashSet = this.f13638b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(b0Var);
        if (zIsEmpty) {
            f();
        }
    }

    public void f() {
    }

    public k2 g() {
        return null;
    }

    public abstract androidx.media3.common.q0 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(b0 b0Var, g7.s sVar, j7.j jVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f13641e;
        ta.c0.s(looper == null || looper == looperMyLooper);
        this.f13643g = jVar;
        k2 k2Var = this.f13642f;
        this.f13637a.add(b0Var);
        if (this.f13641e == null) {
            this.f13641e = looperMyLooper;
            this.f13638b.add(b0Var);
            l(sVar);
        } else if (k2Var != null) {
            e(b0Var);
            b0Var.a(this, k2Var);
        }
    }

    public abstract void l(g7.s sVar);

    public final void m(k2 k2Var) {
        this.f13642f = k2Var;
        Iterator it = this.f13637a.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a(this, k2Var);
        }
    }

    public abstract void n(y yVar);

    public final void o(b0 b0Var) {
        ArrayList arrayList = this.f13637a;
        arrayList.remove(b0Var);
        if (!arrayList.isEmpty()) {
            c(b0Var);
            return;
        }
        this.f13641e = null;
        this.f13642f = null;
        this.f13643g = null;
        this.f13638b.clear();
        p();
    }

    public abstract void p();

    public final void q(n7.i iVar) {
        CopyOnWriteArrayList<n7.g> copyOnWriteArrayList = this.f13640d.f11170c;
        for (n7.g gVar : copyOnWriteArrayList) {
            if (gVar.f11167b == iVar) {
                copyOnWriteArrayList.remove(gVar);
            }
        }
    }

    public final void r(g0 g0Var) {
        CopyOnWriteArrayList<f0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13639c.D;
        for (f0 f0Var : copyOnWriteArrayList) {
            if (f0Var.f13681b == g0Var) {
                copyOnWriteArrayList.remove(f0Var);
            }
        }
    }

    public void s(androidx.media3.common.q0 q0Var) {
    }
}
