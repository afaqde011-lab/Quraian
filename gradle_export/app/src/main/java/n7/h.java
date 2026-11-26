package n7;

import e7.i0;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.a0;

public final class h {

    public final int f11168a;

    public final a0 f11169b;

    public final CopyOnWriteArrayList f11170c;

    public h(CopyOnWriteArrayList copyOnWriteArrayList, int i10, a0 a0Var) {
        this.f11170c = copyOnWriteArrayList;
        this.f11168a = i10;
        this.f11169b = a0Var;
    }

    public final void a(gj.e eVar) {
        for (g gVar : this.f11170c) {
            i0.M(gVar.f11166a, new ab.e(this, gVar.f11167b, eVar, 22));
        }
    }

    public final void b() {
        for (g gVar : this.f11170c) {
            i0.M(gVar.f11166a, new f(this, gVar.f11167b, 1));
        }
    }

    public final void c(int i10) {
        for (g gVar : this.f11170c) {
            i0.M(gVar.f11166a, new d.l(this, gVar.f11167b, i10, 5));
        }
    }

    public final void d(Exception exc) {
        for (g gVar : this.f11170c) {
            i0.M(gVar.f11166a, new ab.e(this, gVar.f11167b, exc, 21));
        }
    }

    public final void e() {
        for (g gVar : this.f11170c) {
            i0.M(gVar.f11166a, new f(this, gVar.f11167b, 0));
        }
    }
}
