package jx;

import ab.a0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersEffect$OpenReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;

public final class x extends vm.a {
    public final TopRecitersLauncher d;
    public final xw.k e;
    public final aq.a f;
    public final au.a g;
    public final zt.a h;

    public x(TopRecitersLauncher launcher, xw.k kVar, aq.a aVar, au.a aVar2, zt.a aVar3) {
        kotlin.jvm.internal.m.e(launcher, "launcher");
        String title = launcher.getTitle();
        boolean z = launcher.getItems().size() >= 10;
        h00.x xVar = h00.x.A;
        float f = 0;
        super(new s(true, z, title, ze.d.E(xVar), ze.d.E(xVar), "", false, false, f, f, true, ze.d.E(xVar)));
        this.d = launcher;
        this.e = kVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = aVar3;
        k00.c cVar = null;
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, cVar, 2), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, cVar, 1), 31);
    }

    public static u30.b k(u30.b bVar, String str) {
        String string = r30.k.j1(str).toString();
        if (r30.k.L0(string)) {
            return bVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : bVar) {
            if (((fx.b) obj).c.b(string)) {
                arrayList.add(obj);
            }
        }
        return g4.d0(arrayList);
    }

    public final void g() {
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, null, 3), 31);
    }

    public final void j(j action) {
        kotlin.jvm.internal.m.e(action, "action");
        k00.c cVar = null;
        if (action instanceof a) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, cVar, 0), 31);
            return;
        }
        if (action instanceof d) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new t(this, cVar, 1), 31);
            return;
        }
        if (action instanceof b) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new t(this, cVar, 0), 31);
            return;
        }
        if (action instanceof h) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, cVar, 4), 31);
            return;
        }
        boolean z = action instanceof g;
        pm.b bVar = this.c;
        if (z) {
            i(s.a((s) bVar.d.getValue(), null, null, null, false, false, 0.0f, ((g) action).a, false, null, 3583));
            return;
        }
        if (action instanceof i) {
            i(s.a((s) bVar.d.getValue(), null, null, null, false, false, ((i) action).a, 0.0f, false, null, 3839));
            return;
        }
        if (action instanceof f) {
            String str = ((f) action).a;
            i(s.a((s) bVar.d.getValue(), null, k(((s) bVar.d.getValue()).d, str), str, false, false, 0.0f, 0.0f, false, null, 4047));
        } else if (!(action instanceof e)) {
            if (!(action instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            a0.A0(this, new TopRecitersEffect$OpenReciterScreen(new ReciterLauncher(((c) action).a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
        } else {
            boolean z2 = ((e) action).a;
            if (((s) bVar.d.getValue()).h == z2) {
                return;
            }
            i(s.a((s) bVar.d.getValue(), null, null, null, false, z2, 0.0f, 0.0f, false, null, 3967));
            l();
        }
    }

    public final void l() {
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, null, 5), 31);
    }
}
