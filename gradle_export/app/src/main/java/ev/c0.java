package ev;

import androidx.lifecycle.u0;
import bt.y0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d40.p1;
import kotlin.NoWhenBranchMatchedException;

public final class c0 extends vm.a {
    public final uu.a d;
    public final xw.k e;
    public final xu.f f;
    public final zt.a g;
    public final au.a h;
    public final p1 i;

    public c0(uu.a aVar, xw.k kVar, xu.f fVar, zt.a aVar2, au.a aVar3) {
        boolean z = true;
        k00.c cVar = null;
        u30.b bVarE = (4095 & 1) != 0 ? ze.d.E(h00.x.A) : null;
        if ((4095 & 2) != 0) {
            z = false;
        }
        super(new t(bVarE, z, "", (4095 & 8) != 0 ? 0 : 1, 0, null, y30.c.D, false, false, false, null, false));
        this.d = aVar;
        this.e = kVar;
        this.f = fVar;
        this.g = aVar2;
        this.h = aVar3;
        this.i = d40.o.c("");
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar, 2), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar, 1), 31);
    }

    public final void j(j action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof c) {
            ab.a0.A0(this, k.a);
            return;
        }
        if (action instanceof g) {
            this.i.j(((g) action).a);
            return;
        }
        if (action instanceof i) {
            k();
            return;
        }
        boolean z = action instanceof h;
        pm.b bVar = this.c;
        if (z) {
            int i = ((h) action).a;
            if (((t) bVar.d.getValue()).g.contains(Integer.valueOf(i))) {
                return;
            }
            i(t.a((t) bVar.d.getValue(), null, false, null, 0, i, null, null, false, false, false, null, false, 3567));
            return;
        }
        if (action instanceof b) {
            l(false);
            return;
        }
        if (action instanceof d) {
            l(true);
        } else if (action instanceof e) {
            i(t.a((t) bVar.d.getValue(), null, false, null, 0, 0, null, null, false, false, false, null, false, 3583));
        } else {
            if (!(action instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            i(t.a((t) bVar.d.getValue(), null, false, null, 0, 0, null, null, false, false, false, null, false, 3071));
        }
    }

    public final void k() {
        pm.b bVar = this.c;
        if (((t) bVar.d.getValue()).h) {
            return;
        }
        k00.c cVar = null;
        i(t.a((t) bVar.d.getValue(), null, false, null, 0, 0, null, null, true, false, false, null, false, 3711));
        ta.c0.M(u0.i(this), (k00.i) null, new y0(this, cVar, 5), (u00.k) null, new y(this, cVar, 0), 27);
    }

    public final void l(boolean z) {
        pm.b bVar = this.c;
        t tVar = (t) bVar.d.getValue();
        int i = tVar.e;
        int i2 = tVar.d;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i2;
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        if (iIntValue == 0) {
            numValueOf2 = null;
        }
        PlayerItem playerItem = tVar.f;
        if (numValueOf2 == null || numValueOf2.intValue() == i2) {
            ab.a0.A0(this, k.a);
            return;
        }
        if (playerItem == null || tVar.g.contains(numValueOf2) || tVar.l) {
            return;
        }
        if (this.f.f.getValue() == null) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, numValueOf2.intValue(), playerItem.getSurahNumber(), z, null), 31);
            return;
        }
        int iIntValue2 = numValueOf2.intValue();
        int surahNumber = playerItem.getSurahNumber();
        i(t.a((t) bVar.d.getValue(), null, false, null, 0, 0, null, null, false, false, false, null, true, 2047));
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x(this, iIntValue2, surahNumber, (k00.c) null), 31);
    }
}
