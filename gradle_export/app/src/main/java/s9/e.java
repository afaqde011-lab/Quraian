package s9;

import h00.x;
import java.util.List;

public abstract class e {

    public g f13914a;

    public List f13915b;

    public List f13916c;

    public l f13917d;

    public boolean f13918e;

    public boolean f13919f;

    public c f13920g;

    public e(g gVar, boolean z10, int i10) {
        kotlin.jvm.internal.m.e(gVar, "initialInfo");
        this.f13914a = gVar;
        x xVar = x.A;
        this.f13915b = xVar;
        this.f13916c = xVar;
        this.f13917d = j.f13937a;
        this.f13918e = z10;
        this.f13919f = false;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public void e() {
    }

    public final void f() {
        c cVar = this.f13920g;
        if (cVar == null || !cVar.f13912c.remove(this)) {
            return;
        }
        i iVar = cVar.f13911b;
        iVar.getClass();
        if (equals(iVar.f13930f)) {
            int i10 = iVar.f13931g;
            j jVar = j.f13937a;
            if (i10 == -1) {
                this.f13917d = jVar;
                a();
            } else if (i10 == 1) {
                this.f13917d = jVar;
                e();
            }
            iVar.f13930f = null;
            iVar.f13931g = 0;
            iVar.f13932h = null;
        }
        iVar.f13928d.remove(this);
        iVar.f13929e.remove(this);
        this.f13920g = null;
        iVar.b();
    }

    public final void g(boolean z10) {
        i iVar;
        if (this.f13918e == z10) {
            return;
        }
        this.f13918e = z10;
        c cVar = this.f13920g;
        if (cVar == null || (iVar = cVar.f13911b) == null) {
            return;
        }
        iVar.b();
    }
}
