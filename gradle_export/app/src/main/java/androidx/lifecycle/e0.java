package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

public abstract class e0 {

    public static final Object f987k = new Object();

    public final Object f988a;

    public final r.f f989b;

    public int f990c;

    public boolean f991d;

    public volatile Object f992e;

    public volatile Object f993f;

    public int f994g;

    public boolean f995h;

    public boolean f996i;

    public final a50.d f997j;

    public e0() {
        this.f988a = new Object();
        this.f989b = new r.f();
        this.f990c = 0;
        Object obj = f987k;
        this.f993f = obj;
        this.f997j = new a50.d(this, 1);
        this.f992e = obj;
        this.f994g = -1;
    }

    public e0(int i10) {
        za.a0 a0Var = za.b0.f17349c;
        this.f988a = new Object();
        this.f989b = new r.f();
        this.f990c = 0;
        this.f993f = f987k;
        this.f997j = new a50.d(this, 1);
        this.f992e = a0Var;
        this.f994g = 0;
    }

    public static void a(String str) {
        q.a.g0().f12555a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a1.b.p("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(d0 d0Var) {
        if (d0Var.B) {
            if (!d0Var.e()) {
                d0Var.b(false);
                return;
            }
            int i10 = d0Var.C;
            int i11 = this.f994g;
            if (i10 >= i11) {
                return;
            }
            d0Var.C = i11;
            d0Var.A.b(this.f992e);
        }
    }

    public final void c(d0 d0Var) {
        if (this.f995h) {
            this.f996i = true;
            return;
        }
        this.f995h = true;
        do {
            this.f996i = false;
            if (d0Var != null) {
                b(d0Var);
                d0Var = null;
            } else {
                r.f fVar = this.f989b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.C.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((d0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f996i) {
                        break;
                    }
                }
            }
        } while (this.f996i);
        this.f995h = false;
    }

    public final void d(w wVar, g0 g0Var) {
        Object obj;
        a("observe");
        if (wVar.getLifecycle().b() == p.A) {
            return;
        }
        c0 c0Var = new c0(this, wVar, g0Var);
        r.f fVar = this.f989b;
        r.c cVarA = fVar.a(g0Var);
        if (cVarA != null) {
            obj = cVarA.B;
        } else {
            r.c cVar = new r.c(g0Var, c0Var);
            fVar.D++;
            r.c cVar2 = fVar.B;
            if (cVar2 == null) {
                fVar.A = cVar;
                fVar.B = cVar;
            } else {
                cVar2.C = cVar;
                cVar.D = cVar2;
                fVar.B = cVar;
            }
            obj = null;
        }
        d0 d0Var = (d0) obj;
        if (d0Var != null && !d0Var.d(wVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d0Var != null) {
            return;
        }
        wVar.getLifecycle().a(c0Var);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(g0 g0Var) {
        a("removeObserver");
        d0 d0Var = (d0) this.f989b.b(g0Var);
        if (d0Var == null) {
            return;
        }
        d0Var.c();
        d0Var.b(false);
    }

    public abstract void h(Object obj);
}
