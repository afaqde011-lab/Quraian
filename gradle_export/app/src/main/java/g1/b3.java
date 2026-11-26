package g1;

import java.time.LocalDate;
import java.util.Locale;

public final class b3 {

    public final z00.e f5728a;

    public final Locale f5729b;

    public final h1.v f5730c;

    public final l1.i1 f5731d;

    public final l1.i1 f5732e;

    public final l1.i1 f5733f;

    public final l1.i1 f5734g;

    public b3(Long l, Long l10, z00.e eVar, int i10, d6 d6Var, Locale locale) {
        h1.w wVarE;
        this.f5728a = eVar;
        this.f5729b = locale;
        h1.v vVar = new h1.v(locale);
        this.f5730c = vVar;
        this.f5731d = l1.q.z(d6Var);
        if (l10 != null) {
            wVarE = vVar.a(l10.longValue());
            if (!eVar.e(wVarE.f6534a)) {
                h1.s sVarB = vVar.b();
                wVarE = vVar.e(LocalDate.of(sVarB.A, sVarB.B, 1));
            }
        } else {
            h1.s sVarB2 = vVar.b();
            wVarE = vVar.e(LocalDate.of(sVarB2.A, sVarB2.B, 1));
        }
        this.f5732e = l1.q.z(wVarE);
        h1.s sVar = null;
        if (l != null) {
            h1.s sVarD = this.f5730c.d(l.longValue());
            if (eVar.e(sVarD.A)) {
                sVar = sVarD;
            }
        }
        this.f5733f = l1.q.z(sVar);
        this.f5734g = l1.q.z(new i3(i10));
    }

    public final int a() {
        return ((i3) this.f5734g.getValue()).f5841a;
    }

    public final Long b() {
        h1.s sVar = (h1.s) this.f5733f.getValue();
        if (sVar != null) {
            return Long.valueOf(sVar.D);
        }
        return null;
    }
}
