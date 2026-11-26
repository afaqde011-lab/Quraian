package ob;

import ca.p;
import h00.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k50.g0;
import k50.i0;
import k50.o;
import k50.z;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;

public final class d extends o {

    public final o f11916b;

    public d(o oVar) {
        m.e(oVar, "delegate");
        this.f11916b = oVar;
    }

    public final g0 a(z zVar) {
        m.e(zVar, "file");
        return this.f11916b.a(zVar);
    }

    public final void b(z zVar, z zVar2) {
        m.e(zVar, "source");
        m.e(zVar2, "target");
        this.f11916b.b(zVar, zVar2);
    }

    public final void d(z zVar) {
        this.f11916b.d(zVar);
    }

    public final void e(z zVar) {
        m.e(zVar, "path");
        this.f11916b.e(zVar);
    }

    public final List h(z zVar) {
        m.e(zVar, "dir");
        List<z> listH = this.f11916b.h(zVar);
        ArrayList arrayList = new ArrayList();
        for (z zVar2 : listH) {
            m.e(zVar2, "path");
            arrayList.add(zVar2);
        }
        u.s0(arrayList);
        return arrayList;
    }

    public final p j(z zVar) {
        m.e(zVar, "path");
        p pVarJ = this.f11916b.j(zVar);
        if (pVarJ == null) {
            return null;
        }
        z zVar2 = (z) pVarJ.f3067d;
        if (zVar2 == null) {
            return pVarJ;
        }
        boolean z10 = pVarJ.f3065b;
        boolean z11 = pVarJ.f3066c;
        Long l = (Long) pVarJ.f3068e;
        Long l10 = (Long) pVarJ.f3069f;
        Long l11 = (Long) pVarJ.f3070g;
        Long l12 = (Long) pVarJ.f3071h;
        Map map = (Map) pVarJ.f3072i;
        m.e(map, "extras");
        return new p(z10, z11, zVar2, l, l10, l11, l12, map);
    }

    public final k50.u k(z zVar) {
        return this.f11916b.k(zVar);
    }

    public final k50.u l(z zVar) {
        return this.f11916b.l(zVar);
    }

    public final g0 m(z zVar) {
        z zVarC = zVar.c();
        if (zVarC != null) {
            c(zVarC);
        }
        return this.f11916b.m(zVar);
    }

    public final i0 n(z zVar) {
        m.e(zVar, "file");
        return this.f11916b.n(zVar);
    }

    public final String toString() {
        return a0.a.b(d.class).n() + '(' + this.f11916b + ')';
    }
}
