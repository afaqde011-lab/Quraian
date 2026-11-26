package in;

import a1.e2;
import a40.c0;
import a40.m0;
import al.i;
import android.content.Context;
import android.graphics.BitmapFactory;
import b1.n;
import com.google.android.gms.internal.measurement.g4;
import d6.f2;
import d6.h;
import d6.p0;
import d6.w;
import dn.l;
import g00.k;
import g00.m;
import h00.q;
import h00.r;
import h40.e;
import java.util.ArrayList;
import kotlin.jvm.internal.a0;
import ri.t1;

public abstract class c extends p0 {
    public final int a;
    public final l b;
    public final f2 c;

    public c(l lVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = lVar;
                this.c = lVar.c();
                break;
            default:
                this.b = lVar;
                this.c = lVar.c();
                break;
        }
    }

    public static void g(c cVar, Context context, m00.c cVar2) {
        a aVar;
        Object objS;
        hn.b bVar;
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
            s50.a aVar3 = u50.a.b;
            if (aVar3 == null) {
                objS = null;
            } else {
                try {
                    e60.a aVar4 = aVar3.c.d;
                    a10.d dVarB = a0.a.b(fn.b.class);
                    aVar4.getClass();
                    objS = aVar4.f(dVarB, null, null);
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                if (objS instanceof m) {
                    objS = null;
                }
            }
            fn.b bVar2 = (fn.b) objS;
            if (bVar2 != null) {
                aVar.A = cVar;
                aVar.B = context;
                aVar.E = 1;
                e eVar = m0.a;
                objJ = c0.J(new fn.a(bVar2, context, null), h40.d.C, aVar);
                if (objJ == aVar2) {
                    return;
                }
            } else {
                bVar = null;
            }
            v1.c cVar3 = new v1.c(new n(bVar, context, cVar, 12), -1286323128, true);
            aVar.A = null;
            aVar.B = null;
            aVar.E = 2;
            w.r(cVar3, aVar);
            l00.a aVar5 = l00.a.A;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                throw a1.b.t(objJ);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        context = aVar.B;
        cVar = aVar.A;
        t1.O(objJ);
        bVar = (hn.b) objJ;
        v1.c cVar4 = new v1.c(new n(bVar, context, cVar, 12), -1286323128, true);
        aVar.A = null;
        aVar.B = null;
        aVar.E = 2;
        w.r(cVar4, aVar);
        l00.a aVar6 = l00.a.A;
    }

    public static void h(c cVar, m00.c cVar2) {
        rn.b bVar;
        Object objS;
        qn.b bVar2;
        if (cVar2 instanceof rn.b) {
            bVar = (rn.b) cVar2;
            int i = bVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.D = i - Integer.MIN_VALUE;
            } else {
                bVar = new rn.b(cVar, cVar2);
            }
        } else {
            bVar = new rn.b(cVar, cVar2);
        }
        Object objJ = bVar.B;
        l00.a aVar = l00.a.A;
        int i2 = bVar.D;
        if (i2 == 0) {
            t1.O(objJ);
            s50.a aVar2 = u50.a.b;
            if (aVar2 == null) {
                objS = null;
            } else {
                try {
                    e60.a aVar3 = aVar2.c.d;
                    a10.d dVarB = a0.a.b(on.d.class);
                    aVar3.getClass();
                    objS = aVar3.f(dVarB, null, null);
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                if (objS instanceof m) {
                    objS = null;
                }
            }
            on.d dVar = (on.d) objS;
            if (dVar != null) {
                bVar.A = cVar;
                bVar.D = 1;
                e eVar = m0.a;
                objJ = c0.J(new on.b(dVar, null), h40.d.C, bVar);
                if (objJ == aVar) {
                    return;
                }
            } else {
                bVar2 = null;
            }
            v1.c cVar3 = new v1.c(new rn.a(bVar2, cVar, 0), 858099347, true);
            bVar.A = null;
            bVar.D = 2;
            w.r(cVar3, bVar);
            l00.a aVar4 = l00.a.A;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                throw a1.b.t(objJ);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = bVar.A;
        t1.O(objJ);
        bVar2 = (qn.b) objJ;
        v1.c cVar4 = new v1.c(new rn.a(bVar2, cVar, 0), 858099347, true);
        bVar.A = null;
        bVar.D = 2;
        w.r(cVar4, bVar);
        l00.a aVar5 = l00.a.A;
    }

    public static void i(c cVar, Context context, int i, m00.c cVar2) {
        b bVar;
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
        kotlin.jvm.internal.m.e(context, "context");
        ArrayList arrayListT1 = q.t1(va.a.S(new Integer[]{2131887369, 2131887370, 2131887371, 2131887372}), va.a.S(new Integer[]{2131231701, 2131231702, 2131231703, 2131231704}));
        ArrayList arrayList = new ArrayList(r.q0(arrayListT1, 10));
        int i4 = 0;
        for (Object obj2 : arrayListT1) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                va.a.k0();
                throw null;
            }
            k kVar = (k) obj2;
            int iIntValue = ((Number) kVar.A).intValue();
            int iIntValue2 = ((Number) kVar.B).intValue();
            String string = context.getString(iIntValue);
            kotlin.jvm.internal.m.d(string, "getString(...)");
            String string2 = context.getString(2131887373);
            kotlin.jvm.internal.m.d(string2, "getString(...)");
            arrayList.add(new hn.a(i4, string, string2, BitmapFactory.decodeResource(context.getResources(), iIntValue2), false));
            i4 = i5;
        }
        v1.c cVar3 = new v1.c(new i(new hn.b(g4.d0(arrayList)), cVar, 24), -611257318, true);
        bVar.C = 1;
        w.r(cVar3, bVar);
        l00.a aVar2 = l00.a.A;
    }

    public static void j(c cVar, Context context, int i, m00.c cVar2) {
        rn.c cVar3;
        if (cVar2 instanceof rn.c) {
            cVar3 = (rn.c) cVar2;
            int i2 = cVar3.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar3.C = i2 - Integer.MIN_VALUE;
            } else {
                cVar3 = new rn.c(cVar, cVar2);
            }
        } else {
            cVar3 = new rn.c(cVar, cVar2);
        }
        Object obj = cVar3.A;
        l00.a aVar = l00.a.A;
        int i3 = cVar3.C;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        kotlin.jvm.internal.m.e(context, "context");
        ArrayList arrayListT1 = q.t1(va.a.S(new Integer[]{2131887369, 2131887370, 2131887371, 2131887372}), va.a.S(new Integer[]{2131231701, 2131231702, 2131231703, 2131231704}));
        ArrayList arrayList = new ArrayList(r.q0(arrayListT1, 10));
        int i5 = 0;
        for (Object obj2 : arrayListT1) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                va.a.k0();
                throw null;
            }
            k kVar = (k) obj2;
            int iIntValue = ((Number) kVar.A).intValue();
            int iIntValue2 = ((Number) kVar.B).intValue();
            String string = context.getString(iIntValue);
            kotlin.jvm.internal.m.d(string, "getString(...)");
            String string2 = context.getString(2131887373);
            kotlin.jvm.internal.m.d(string2, "getString(...)");
            arrayList.add(new qn.a(1, null, string2, i5, null, string, string, BitmapFactory.decodeResource(context.getResources(), iIntValue2), false));
            i5 = i6;
        }
        v1.c cVar4 = new v1.c(new rn.a(new qn.b(g4.d0(arrayList)), cVar, i4), 654084865, true);
        cVar3.C = 1;
        w.r(cVar4, cVar3);
        l00.a aVar2 = l00.a.A;
    }

    public final f2 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final void d(Context context, h hVar, e2 e2Var) {
        switch (this.a) {
            case 0:
                g(this, context, e2Var);
                l00.a aVar = l00.a.A;
                break;
            default:
                h(this, e2Var);
                l00.a aVar2 = l00.a.A;
                break;
        }
    }

    public final void e(Context context, int i, d6.e eVar) {
        switch (this.a) {
            case 0:
                i(this, context, i, eVar);
                l00.a aVar = l00.a.A;
                break;
            default:
                j(this, context, i, eVar);
                l00.a aVar2 = l00.a.A;
                break;
        }
    }
}
