package mn;

import a1.e2;
import a40.c0;
import a40.m0;
import android.content.Context;
import b1.n;
import com.google.android.gms.internal.measurement.g4;
import d6.c2;
import d6.f2;
import d6.h;
import d6.p0;
import d6.w;
import dn.l;
import f50.k;
import g00.m;
import h00.r;
import h40.e;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.a0;
import l0.g0;
import ri.t1;
import z00.d;

public final class c extends p0 {
    public final l a;

    public c(int i) {
        this(l.B);
        switch (i) {
            case 1:
                this(l.A);
                break;
            default:
                break;
        }
    }

    public c(l lVar) {
        this.a = lVar;
    }

    public static void g(c cVar, Context context, m00.c cVar2) {
        a aVar;
        Locale locale;
        Object objS;
        ln.c cVar3;
        u30.b bVarV;
        int value;
        ArrayList arrayList;
        Iterator it;
        d dVar;
        int iNextInt;
        ln.b bVar;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i = aVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.E = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object objJ = aVar.C;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.E;
        if (i2 == 0) {
            t1.O(objJ);
            locale = context.getResources().getConfiguration().getLocales().get(0);
            s50.a aVar3 = u50.a.b;
            if (aVar3 == null) {
                objS = null;
            } else {
                try {
                    e60.a aVar4 = aVar3.c.d;
                    a10.d dVarB = a0.a.b(jn.a.class);
                    aVar4.getClass();
                    objS = aVar4.f(dVarB, null, null);
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                if (objS instanceof m) {
                    objS = null;
                }
            }
            jn.a aVar5 = (jn.a) objS;
            if (aVar5 != null) {
                kotlin.jvm.internal.m.b(locale);
                aVar.A = cVar;
                aVar.B = locale;
                aVar.E = 1;
                e eVar = m0.a;
                objJ = c0.J(new g6.a(aVar5, locale, (k00.c) null, 11), h40.d.C, aVar);
                if (objJ == aVar2) {
                    return;
                }
            } else {
                kotlin.jvm.internal.m.b(locale);
                bVarV = k.v(locale);
                value = LocalDate.now().getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
                z00.e eVarI0 = ab.a0.I0(0, 7);
                arrayList = new ArrayList(r.q0(eVarI0, 10));
                it = eVarI0.iterator();
                while (true) {
                    dVar = (d) it;
                    if (dVar.C) {
                        break;
                    }
                    iNextInt = dVar.nextInt();
                    String str = (String) bVarV.get(iNextInt);
                    if (iNextInt == value) {
                        bVar = ln.b.C;
                    } else {
                        bVar = ln.b.D;
                    }
                    arrayList.add(new ln.a(str, bVar));
                }
                cVar3 = new ln.c(0L, 5, g4.d0(arrayList));
            }
            v1.c cVar4 = new v1.c(new n(cVar3, locale, cVar, 16), -1291136128, true);
            aVar.A = null;
            aVar.B = null;
            aVar.E = 2;
            w.r(cVar4, aVar);
            l00.a aVar6 = l00.a.A;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                throw a1.b.t(objJ);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Locale locale2 = aVar.B;
        c cVar5 = aVar.A;
        t1.O(objJ);
        locale = locale2;
        cVar = cVar5;
        cVar3 = (ln.c) objJ;
        if (cVar3 == null) {
            kotlin.jvm.internal.m.b(locale);
            bVarV = k.v(locale);
            value = LocalDate.now().getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
            z00.e eVarI1 = ab.a0.I0(0, 7);
            arrayList = new ArrayList(r.q0(eVarI1, 10));
            it = eVarI1.iterator();
            while (true) {
                dVar = (d) it;
                if (dVar.C) {
                    break;
                    break;
                }
                iNextInt = dVar.nextInt();
                String str2 = (String) bVarV.get(iNextInt);
                if (iNextInt == value) {
                    bVar = ln.b.C;
                } else {
                    bVar = ln.b.D;
                }
                arrayList.add(new ln.a(str2, bVar));
            }
            cVar3 = new ln.c(0L, 5, g4.d0(arrayList));
        }
        v1.c cVar6 = new v1.c(new n(cVar3, locale, cVar, 16), -1291136128, true);
        aVar.A = null;
        aVar.B = null;
        aVar.E = 2;
        w.r(cVar6, aVar);
        l00.a aVar7 = l00.a.A;
    }

    public static void h(c cVar, Context context, int i, m00.c cVar2) {
        b bVar;
        ln.b bVar2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i2 = bVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.C = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar, cVar2);
            }
        } else {
            bVar = new b(cVar, cVar2);
        }
        Object obj = bVar.A;
        l00.a aVar = l00.a.A;
        int i3 = bVar.C;
        if (i3 != 0) {
            if (i3 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        kotlin.jvm.internal.m.d(locale, "get(...)");
        u30.b bVarV = k.v(locale);
        z00.e eVarI0 = ab.a0.I0(0, 7);
        ArrayList arrayList = new ArrayList(r.q0(eVarI0, 10));
        Iterator it = eVarI0.iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.C) {
                v1.c cVar3 = new v1.c(new g0(new ln.c(300L, 15, g4.d0(arrayList)), cVar, 6), 194413806, true);
                bVar.C = 1;
                w.r(cVar3, bVar);
                l00.a aVar2 = l00.a.A;
                return;
            }
            int iNextInt = dVar.nextInt();
            String str = (String) bVarV.get(iNextInt);
            if (iNextInt < 3) {
                bVar2 = ln.b.A;
            } else {
                bVar2 = iNextInt == 3 ? ln.b.C : ln.b.D;
            }
            arrayList.add(new ln.a(str, bVar2));
        }
    }

    public final f2 c() {
        return c2.a;
    }

    public final void d(Context context, h hVar, e2 e2Var) {
        g(this, context, e2Var);
        l00.a aVar = l00.a.A;
    }

    public final void e(Context context, int i, d6.e eVar) {
        h(this, context, i, eVar);
        l00.a aVar = l00.a.A;
    }
}
