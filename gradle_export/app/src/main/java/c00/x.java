package c00;

import androidx.lifecycle.u0;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerAction$OnCloseScreen;
import d40.p1;
import i7.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import ta.c0;

public final class x extends vm.a {
    public final pm.c d;
    public final a00.a e;
    public final b00.c f;
    public final vp.x g;
    public final aq.a h;
    public final AudioPlayerAnalytics i;
    public final vz.c j;

    public x(pm.c cVar, a00.a aVar, b00.c cVar2, vp.x xVar, aq.a aVar2, AudioPlayerAnalytics audioPlayerAnalytics, vz.c cVar3) {
        boolean z = (255 & 1) != 0;
        x30.c cVar4 = x30.c.D;
        x30.c cVarD0 = p30.f.d0();
        v30.g gVar = v30.g.B;
        super(new t(z, gVar, gVar, cVarD0, "", null, null, null));
        this.d = cVar;
        this.e = aVar;
        this.f = cVar2;
        this.g = xVar;
        this.h = aVar2;
        this.i = audioPlayerAnalytics;
        this.j = cVar3;
    }

    public static final Object j(x xVar, zz.a aVar, m00.c cVar) {
        w wVar;
        String str;
        Object objC;
        zz.a aVar2;
        String strF;
        String str2;
        String strK;
        zz.a aVar3 = aVar;
        a00.a aVar4 = xVar.e;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.E = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(xVar, cVar);
            }
        } else {
            wVar = new w(xVar, cVar);
        }
        Object obj = wVar.C;
        l00.a aVar5 = l00.a.A;
        int i2 = wVar.E;
        if (i2 == 0) {
            t1.O(obj);
            str = aVar3.a;
            if (r30.r.x0(aVar3.c, "http", false) || r30.r.x0(aVar3.b, "http", false)) {
                wVar.A = aVar3;
                wVar.B = str;
                wVar.E = 1;
                objC = ((uz.f) aVar4).c(aVar3, wVar);
                if (objC == aVar5) {
                    return aVar5;
                }
            }
            aVar2 = aVar3;
            strF = aVar2.c;
            if (r30.r.x0(strF, "http", false)) {
                strF = xVar.j.f(str, strF);
            }
            str2 = strF;
            strK = ((uz.f) aVar4).k(str, aVar2.b);
            if (r30.k.L0(str2)) {
                return null;
            }
            return zz.a.a(aVar2, strK, str2, false, false, false, 249);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = wVar.B;
        zz.a aVar6 = wVar.A;
        t1.O(obj);
        str = str3;
        aVar3 = aVar6;
        objC = obj;
        if (!((Boolean) objC).booleanValue()) {
            return null;
        }
        aVar2 = aVar3;
        strF = aVar2.c;
        if (r30.r.x0(strF, "http", false)) {
            strF = xVar.j.f(str, strF);
        }
        str2 = strF;
        strK = ((uz.f) aVar4).k(str, aVar2.b);
        if (r30.k.L0(str2)) {
            return null;
        }
        return zz.a.a(aVar2, strK, str2, false, false, false, 249);
    }

    public static final ArrayList l(u30.b bVar, String str) {
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            zz.a aVarA = (zz.a) it.next();
            if (kotlin.jvm.internal.m.a(aVarA.a, str)) {
                aVarA = zz.a.a(aVarA, null, null, false, false, false, 255);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    public final void g() {
        this.f.b();
    }

    public final void k(f action) {
        kotlin.jvm.internal.m.e(action, "action");
        boolean z = action instanceof d;
        pm.b bVar = this.c;
        k00.c cVar = null;
        if (z) {
            b00.c cVar2 = this.f;
            zz.a aVar = (zz.a) cVar2.h.getValue();
            i(t.a((t) bVar.d.getValue(), false, null, null, null, null, aVar, aVar, 159));
            ExoPlayer exoPlayer = (ExoPlayer) cVar2.g.getValue();
            if (exoPlayer != null) {
                z zVar = (z) exoPlayer;
                zVar.A();
                if (zVar.l0) {
                    exoPlayer = null;
                }
                if (exoPlayer != null) {
                    ((androidx.media3.common.f) exoPlayer).pause();
                }
            }
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar, 1), 31);
            return;
        }
        if (action instanceof SoundEffectPickerAction$OnCloseScreen) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar, 0), 31);
            return;
        }
        if (action instanceof b) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new u(this, null), 31);
            return;
        }
        if (action instanceof e) {
            String str = ((e) action).a;
            i(t.a((t) bVar.d.getValue(), false, null, g4.d0(m(str, ((t) bVar.d.getValue()).b)), null, str, null, null, 235));
            return;
        }
        if (!(action instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        zz.a aVar2 = ((c) action).a;
        if (aVar2 != null) {
            String str2 = aVar2.a;
            p1 p1Var = bVar.d;
            i(t.a((t) p1Var.getValue(), false, g4.d0(l(((t) p1Var.getValue()).b, str2)), g4.d0(l(((t) p1Var.getValue()).c, str2)), null, null, null, null, 249));
        }
        if (kotlin.jvm.internal.m.a(aVar2, ((t) bVar.d.getValue()).f)) {
            return;
        }
        if (aVar2 == null) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar, 2), 31);
        } else if (!aVar2.g || this.g.k()) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.g(aVar2, this, (k00.c) null, 10), 31);
        } else {
            ((bq.a) this.h).f(true, zp.b.GENERAL);
        }
    }

    public final List m(String str, List list) {
        String strA;
        if (r30.k.L0(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ResourceText resourceText = ((zz.a) obj).d;
            if (resourceText != null) {
                pm.c cVar = this.d;
                cVar.getClass();
                strA = com.mchutov.core.compose.widgets.lce.a.a(resourceText, cVar.a);
            } else {
                strA = null;
            }
            if (strA == null) {
                strA = "";
            }
            if (r30.k.A0(strA, str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
