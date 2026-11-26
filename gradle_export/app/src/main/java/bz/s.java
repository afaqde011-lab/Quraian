package bz;

import a1.r1;
import ab.a0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.settings.presentation.screen.devices.DevicesEffect$CloseScreen;
import d40.p1;
import h00.x;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;
import wo.b0;

public final class s extends vm.a {
    public final b0 d;
    public final qy.a e;

    public s(b0 b0Var, qy.a aVar) {
        super(new p(true, false, ze.d.E(x.A), null, null, false, false, false));
        this.d = b0Var;
        this.e = aVar;
        m();
    }

    public static final void j(s sVar, ep.c cVar) {
        p pVar;
        u30.b bVarD0;
        String strA;
        String str;
        String str2;
        pm.b bVar = sVar.c;
        p pVar2 = (p) bVar.d.getValue();
        if (cVar != null) {
            ArrayList<ep.b> arrayList = cVar.a;
            qy.a aVar = sVar.e;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
            for (ep.b from : arrayList) {
                aVar.getClass();
                kotlin.jvm.internal.m.e(from, "from");
                String str3 = from.e;
                String str4 = from.b;
                String str5 = from.a;
                String str6 = from.c;
                String str7 = r30.k.L0(str6) ? str4 : str6;
                String lowerCase = x5.m(str4, " ", str6).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                ry.e eVar = (r30.k.A0(lowerCase, "ipad", false) || r30.k.A0(lowerCase, "tablet", false)) ? ry.e.B : (r30.k.A0(lowerCase, "mac", false) || r30.k.A0(lowerCase, "laptop", false) || r30.k.A0(lowerCase, "desktop", false) || r30.k.A0(lowerCase, "computer", false)) ? ry.e.C : ry.e.A;
                pm.c cVar2 = aVar.f;
                if (r30.k.L0(str3)) {
                    aVar = aVar;
                    pVar2 = pVar2;
                    str = "";
                } else {
                    Instant instantX = qy.a.X(str3);
                    if (instantX == null) {
                        aVar = aVar;
                        pVar2 = pVar2;
                        str = str3;
                    } else {
                        long minutes = Duration.between(instantX, Instant.now()).toMinutes();
                        long j = minutes < 0 ? 0L : minutes;
                        if (j < 1) {
                            strA = cVar2.a(2131887228, new Object[0]);
                        } else if (j < 60) {
                            strA = cVar2.a(2131887230, Integer.valueOf((int) j));
                        } else if (j < 1440) {
                            strA = cVar2.a(2131887227, Integer.valueOf((int) (j / ((long) 60))));
                        } else {
                            strA = qy.b.a.format(instantX);
                            kotlin.jvm.internal.m.d(strA, "format(...)");
                        }
                        str = strA;
                    }
                }
                if (r30.k.L0(str3)) {
                    str2 = "";
                } else {
                    Instant instantX2 = qy.a.X(str3);
                    if (instantX2 != null) {
                        str3 = qy.b.a.format(instantX2);
                        kotlin.jvm.internal.m.d(str3, "format(...)");
                    }
                    str2 = str3;
                }
                arrayList2.add(new ry.a(str5, str7, eVar, str, str2, from.f, from.g, from.h));
                pVar2 = pVar2;
                aVar = aVar;
            }
            pVar = pVar2;
            bVarD0 = g4.d0(arrayList2);
            if (bVarD0 == null) {
            }
            sVar.i(p.a(pVar, false, bVarD0, null, null, false, false, false, 250));
        }
        pVar = pVar2;
        bVarD0 = ((p) bVar.d.getValue()).c;
        sVar.i(p.a(pVar, false, bVarD0, null, null, false, false, false, 250));
    }

    public static final int k(s sVar, String str, boolean z) {
        sVar.getClass();
        boolean z2 = str != null;
        if (z && z2) {
            return 2131887242;
        }
        if (z) {
            return 2131887241;
        }
        return z2 ? 2131887235 : 2131887239;
    }

    public final void l(j jVar) {
        Object next;
        if (jVar instanceof b) {
            a0.A0(this, DevicesEffect$CloseScreen.INSTANCE);
            return;
        }
        boolean z = jVar instanceof d;
        pm.b bVar = this.c;
        if (z) {
            String str = ((d) jVar).a;
            if (r30.k.L0(str)) {
                return;
            }
            i(p.a((p) bVar.d.getValue(), false, null, str, null, false, false, false, 247));
            return;
        }
        if (jVar instanceof e) {
            i(p.a((p) bVar.d.getValue(), false, null, null, null, false, false, false, 247));
            return;
        }
        if (jVar instanceof h) {
            String str2 = ((h) jVar).a;
            if (((p) bVar.d.getValue()).h || r30.k.L0(str2)) {
                return;
            }
            i(p.a((p) bVar.d.getValue(), false, null, null, str2, true, false, false, 143));
            return;
        }
        if (jVar instanceof i) {
            if (((p) bVar.d.getValue()).h) {
                return;
            }
            i(p.a((p) bVar.d.getValue(), false, null, null, null, false, true, false, 143));
            return;
        }
        if (jVar instanceof f) {
            if (((p) bVar.d.getValue()).h) {
                return;
            }
            i(p.a((p) bVar.d.getValue(), false, null, null, null, false, false, false, 143));
            return;
        }
        k00.c cVar = null;
        if (!(jVar instanceof c)) {
            if (!(jVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            p pVar = (p) bVar.d.getValue();
            if (pVar.b || pVar.a || pVar.h) {
                return;
            }
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, new r1(this, (k00.c) null, 1), new r(this, cVar, 1), 23);
            return;
        }
        p1 p1Var = bVar.d;
        if (((p) p1Var.getValue()).h) {
            return;
        }
        String str3 = ((p) p1Var.getValue()).e;
        boolean z2 = ((p) p1Var.getValue()).g;
        String str4 = ((p) p1Var.getValue()).d;
        Iterator<E> it = ((p) p1Var.getValue()).c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ry.a) next).a.equals(str4));
        ry.a aVar = (ry.a) next;
        boolean z3 = false;
        if (aVar != null && aVar.f) {
            z3 = true;
        }
        if (str3 != null || z2) {
            c0.M(u0.i(this), (k00.i) null, new a1.c0(this, str3, (k00.c) null, 10), (u00.k) null, new q(this, str3, str4, z2, z3, (k00.c) null), 27);
        }
    }

    public final void m() {
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new r(this, null, 0), 31);
    }
}
