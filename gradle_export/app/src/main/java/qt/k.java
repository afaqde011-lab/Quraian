package qt;

import ab.a0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerAction$OnCloseScreen;
import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerEffect$CloseScreen;
import gv.e1;
import h00.d0;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ot.l;
import ot.m;
import ot.o;
import ot.q;
import ot.t;
import ta.c0;
import u00.n;

public final class k extends vm.a {
    public final ot.e d;
    public final ht.k e;
    public final ht.b f;
    public final pm.c g;
    public final rt.h h;
    public List i;

    public k(ot.e eVar, ht.k kVar, ht.b bVar, pm.c cVar, rt.h hVar) {
        super(new j(eVar, q.a, "", "", p30.f.d0()));
        x30.c cVar2 = x30.c.D;
        this.d = eVar;
        this.e = kVar;
        this.f = bVar;
        this.g = cVar;
        this.h = hVar;
        this.i = x.A;
    }

    public static final u30.f j(k kVar, List list) {
        int iP = d0.P(r.q0(list, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            linkedHashMap.put(oVar.a, kVar.e.d(oVar) ? m.a : ot.k.a);
        }
        return g4.e0(linkedHashMap);
    }

    public final void k(f action) {
        kotlin.jvm.internal.m.e(action, "action");
        boolean zEquals = action.equals(c.a);
        k00.c cVar = null;
        pm.b bVar = this.c;
        if (zEquals) {
            String strB = this.f.b(this.d);
            i(j.a((j) bVar.d.getValue(), null, strB, strB, null, 19));
            c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new l6.d(this, (k00.c) null, 12), 31);
            return;
        }
        if (action.equals(TafsirPickerAction$OnCloseScreen.INSTANCE)) {
            a0.A0(this, TafsirPickerEffect$CloseScreen.INSTANCE);
            return;
        }
        if (action.equals(b.a)) {
            c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new e1(this, cVar, 1), 31);
            return;
        }
        if (action.equals(d.a)) {
            c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new l6.d(this, (k00.c) null, 12), 31);
        } else {
            if (!(action instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            o oVar = ((e) action).a;
            i(j.a((j) bVar.d.getValue(), null, oVar.a, null, null, 27));
            l(oVar);
        }
    }

    public final void l(o oVar) {
        boolean zD = this.e.d(oVar);
        String str = oVar.a;
        if (zD) {
            n(str, m.a);
            m(str);
        } else {
            n(str, l.a);
            c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new g6.a(this, oVar, (k00.c) null, 29), 31);
        }
    }

    public final void m(String str) {
        pm.b bVar = this.c;
        t tVar = ((j) bVar.d.getValue()).b;
        if (tVar instanceof ot.r) {
            List<o> list = ((ot.r) tVar).a;
            ArrayList arrayList = new ArrayList(r.q0(list, 10));
            for (o oVarA : list) {
                if (kotlin.jvm.internal.m.a(oVarA.a, str)) {
                    oVarA = oVarA.a();
                }
                arrayList.add(oVarA);
            }
            this.i = arrayList;
            i(j.a((j) bVar.d.getValue(), new ot.r(arrayList), null, null, null, 29));
        }
    }

    public final void n(String str, ot.n nVar) {
        pm.b bVar = this.c;
        LinkedHashMap linkedHashMapB0 = d0.b0(((j) bVar.d.getValue()).e);
        linkedHashMapB0.put(str, nVar);
        i(j.a((j) bVar.d.getValue(), null, null, null, g4.e0(linkedHashMapB0), 15));
    }
}
