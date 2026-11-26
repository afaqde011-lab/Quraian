package q0;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class q1 {

    public final m3.h f12683a;

    public final m3.r0 f12684b;

    public final boolean f12687e;

    public final y3.c f12689g;

    public final q3.h f12690h;

    public ce.c f12692j;

    public y3.m f12693k;

    public final int f12685c = Integer.MAX_VALUE;

    public final int f12686d = 1;

    public final int f12688f = 1;

    public final List f12691i = h00.x.A;

    public q1(m3.h hVar, m3.r0 r0Var, boolean z10, y3.c cVar, q3.h hVar2, int i10) {
        this.f12683a = hVar;
        this.f12684b = r0Var;
        this.f12687e = z10;
        this.f12689g = cVar;
        this.f12690h = hVar2;
    }

    public final void a(y3.m mVar) throws NoWhenBranchMatchedException {
        ce.c cVar = this.f12692j;
        if (cVar == null || mVar != this.f12693k || cVar.b()) {
            this.f12693k = mVar;
            cVar = new ce.c(this.f12683a, m3.h0.j(this.f12684b, mVar), this.f12691i, this.f12689g, this.f12690h);
        }
        this.f12692j = cVar;
    }
}
