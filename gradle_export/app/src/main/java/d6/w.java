package d6;

import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SizeF;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class w {

    public static final v1.c f4709a = new v1.c(new cp.a(12), 1997540052, false);

    public static final java.lang.Object A(d6.p0 r6, android.app.Application r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d6.w.A(d6.p0, android.app.Application, m00.c):java.lang.Object");
    }

    public static final LinkedHashMap B(b6.j jVar) {
        ArrayList arrayList = jVar.f2178b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                va.a.k0();
                throw null;
            }
            b6.h hVar = (b6.h) obj;
            b6.m mVarB = hVar.b();
            g00.k kVar = mVarB.c(u1.B) ? (g00.k) mVarB.a(new g00.k((Object) null, b6.k.f2179a), n1.I) : new g00.k((Object) null, mVarB);
            c6.b bVar = (c6.b) kVar.A;
            b6.m mVar = (b6.m) kVar.B;
            c6.a aVar = bVar != null ? bVar.f2887a : null;
            g00.k kVar2 = aVar instanceof c6.e ? new g00.k(aVar, mVar) : new g00.k((Object) null, mVar);
            if (hVar instanceof b6.j) {
                for (Map.Entry entry : B((b6.j) hVar).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i10 = i11;
        }
        return linkedHashMap;
    }

    public static final void a(int i10, final long j9, f2 f2Var, l1.j jVar, u00.n nVar) throws NoWhenBranchMatchedException {
        Set setR;
        f2 f2Var2 = f2Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(361732211);
        u00.n nVar2 = nVar;
        int i11 = (g0Var.g(f2Var2) ? 4 : 2) | i10 | (g0Var.f(j9) ? 32 : 16) | (g0Var.i(nVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if ((i11 & 147) == 146 && g0Var.C()) {
            g0Var.V();
        } else {
            if (f2Var2 instanceof e2) {
                setR = va.a.R(new y3.h(j9));
            } else if (f2Var2 instanceof c2) {
                g0Var.c0(291633998);
                Bundle bundle = (Bundle) g0Var.k(x.f4712a);
                boolean z10 = (i11 & 112) == 32;
                Object objN = g0Var.N();
                if (z10 || objN == l1.i.f9868a) {
                    objN = new u00.a() {
                        public final Object invoke() {
                            return new y3.h(j9);
                        }
                    };
                    g0Var.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                    int i12 = bundle.getInt("appWidgetMinHeight", 0);
                    int i13 = bundle.getInt("appWidgetMaxHeight", 0);
                    int i14 = bundle.getInt("appWidgetMinWidth", 0);
                    int i15 = bundle.getInt("appWidgetMaxWidth", 0);
                    setR = (i12 == 0 || i13 == 0 || i14 == 0 || i15 == 0) ? va.a.R(aVar.invoke()) : va.a.S(new y3.h(f50.c.b(i14, i13)), new y3.h(f50.c.b(i15, i12)));
                } else {
                    ArrayList arrayList = new ArrayList(h00.r.q0(parcelableArrayList, 10));
                    for (SizeF sizeF : parcelableArrayList) {
                        arrayList.add(new y3.h(f50.c.b(sizeF.getWidth(), sizeF.getHeight())));
                    }
                    setR = arrayList;
                }
                g0Var.r(false);
            } else {
                if (!(f2Var2 instanceof d2)) {
                    throw new NoWhenBranchMatchedException();
                }
                g0Var.c0(292006649);
                g0Var.r(false);
                setR = ((d2) f2Var2).f4623a;
            }
            List listG0 = h00.q.G0(setR);
            ArrayList arrayList2 = new ArrayList(h00.r.q0(listG0, 10));
            Iterator it = listG0.iterator();
            while (it.hasNext()) {
                c(((i11 << 3) & 112) | (i11 & 896), ((y3.h) it.next()).f16589a, f2Var2, g0Var, nVar2);
                arrayList2.add(g00.b0.a);
                f2Var2 = f2Var;
                nVar2 = nVar;
            }
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a2(f2Var, j9, nVar, i10);
        }
    }

    public static final void b(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1257244356);
        if (i10 == 0 && g0Var.C()) {
            g0Var.V();
        } else {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = i1.A;
                g0Var.n0(objN);
            }
            u00.a aVar = (a10.g) objN;
            g0Var.d0(-1115894518);
            g0Var.d0(1886828752);
            if (!(g0Var.f9842a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(new b6.n(1, aVar));
            } else {
                g0Var.q0();
            }
            x5.z(g0Var, true, false, false);
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new cp.a(i10, 13);
        }
    }

    public static final void c(int i10, long j9, f2 f2Var, l1.j jVar, u00.n nVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-771692794);
        int i11 = (g0Var.f(j9) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(f2Var) : g0Var.i(f2Var) ? 32 : 16;
        }
        if (((i11 | (g0Var.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH)) & 147) == 146 && g0Var.C()) {
            g0Var.V();
        } else {
            l1.q.a(b6.g.f2168a.a(new y3.h(j9)), v1.d.d(-367769018, new a2(nVar, j9, f2Var), g0Var), g0Var, 56);
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new h1.t0(j9, f2Var, nVar, i10, 2);
        }
    }

    public static final void d(final i2 i2Var, final RemoteViews remoteViews, b6.m mVar, final j1 j1Var) throws NoWhenBranchMatchedException {
        int i10;
        final Context context = i2Var.f4640a;
        final kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar3 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar4 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar5 = new kotlin.jvm.internal.z();
        zVar5.A = b6.v.A;
        final kotlin.jvm.internal.z zVar6 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar7 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar8 = new kotlin.jvm.internal.z();
        final kotlin.jvm.internal.z zVar9 = new kotlin.jvm.internal.z();
        u00.n nVar = new u00.n(zVar6, zVar, zVar2, context, remoteViews, j1Var, zVar3, zVar5, zVar4, i2Var, zVar8, zVar7, zVar9) {
            public final kotlin.jvm.internal.z A;
            public final kotlin.jvm.internal.z B;
            public final kotlin.jvm.internal.z C;
            public final RemoteViews D;
            public final j1 E;
            public final kotlin.jvm.internal.z F;
            public final kotlin.jvm.internal.z G;
            public final kotlin.jvm.internal.z H;
            public final kotlin.jvm.internal.z I;

            {
                this.D = remoteViews;
                this.E = j1Var;
                this.F = zVar3;
                this.G = zVar4;
                this.H = zVar7;
                this.I = zVar9;
            }

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                j6.o oVar;
                b6.l lVar = (b6.l) obj2;
                if (lVar instanceof c6.b) {
                    kotlin.jvm.internal.z zVar10 = this.A;
                    if (zVar10.A != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    zVar10.A = lVar;
                } else if (lVar instanceof j6.s) {
                    this.B.A = lVar;
                } else if (lVar instanceof j6.m) {
                    this.C.A = lVar;
                } else if (lVar instanceof b6.c) {
                    b6.c cVar = (b6.c) lVar;
                    int i11 = this.E.f4655a;
                    if (!(cVar instanceof b6.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o6.a aVar = cVar.f2163a;
                    boolean z10 = aVar instanceof o6.g;
                    RemoteViews remoteViews2 = this.D;
                    if (z10) {
                        remoteViews2.setInt(i11, "setBackgroundColor", i2.b0.C(((o6.g) aVar).f11665a));
                    } else if (aVar instanceof o6.h) {
                        e5.f.d(remoteViews2, i11, "setBackgroundColor", ((o6.h) aVar).f11666a);
                    } else {
                        Log.w("GlanceAppWidget", "Unexpected background color modifier: " + aVar);
                    }
                } else if (lVar instanceof j6.o) {
                    kotlin.jvm.internal.z zVar11 = this.F;
                    j6.o oVar2 = (j6.o) zVar11.A;
                    if (oVar2 != null) {
                        j6.o oVar3 = (j6.o) lVar;
                        oVar = new j6.o(oVar2.f8190a.a(oVar3.f8190a), oVar2.f8191b.a(oVar3.f8191b), oVar2.f8192c.a(oVar3.f8192c), oVar2.f8193d.a(oVar3.f8193d), oVar2.f8194e.a(oVar3.f8194e), oVar2.f8195f.a(oVar3.f8195f));
                    } else {
                        oVar = (j6.o) lVar;
                    }
                    zVar11.A = oVar;
                } else if (lVar instanceof c0) {
                    this.G.A = ((c0) lVar).f4621a;
                } else if (!(lVar instanceof a)) {
                    if (lVar instanceof g0) {
                        this.H.A = lVar;
                    } else if (lVar instanceof k6.b) {
                        this.I.A = lVar;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + lVar + "', nothing done.");
                    }
                }
                return g00.b0.a;
            }
        };
        RemoteViews remoteViews2 = remoteViews;
        mVar.a(g00.b0.a, nVar);
        j6.s sVar = (j6.s) zVar.A;
        j6.m mVar2 = (j6.m) zVar2.A;
        Object obj = o1.f4679a;
        int i11 = j1Var.f4656b;
        int i12 = j1Var.f4655a;
        if (i11 != -1) {
            throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
        }
        if (sVar != null) {
            f(remoteViews2, sVar, i12);
        }
        if (mVar2 != null) {
            e(remoteViews2, mVar2, i12);
        }
        c6.b bVar = (c6.b) zVar6.A;
        int i13 = 0;
        if (bVar != null) {
            c6.a aVar = bVar.f2887a;
            Integer num = i2Var.m;
            int iIntValue = num != null ? num.intValue() : i12;
            try {
                if (i2Var.f4645f) {
                    remoteViews2.setOnClickFillInIntent(iIntValue, e6.f.e(aVar, i2Var, iIntValue, new e6.c(i13)));
                } else {
                    remoteViews2.setOnClickPendingIntent(iIntValue, e6.f.g(aVar, i2Var, iIntValue, new e6.c(i13)));
                }
            } catch (Throwable th2) {
                Log.e("GlanceAppWidget", "Unrecognized Action: " + aVar, th2);
            }
        }
        o6.f fVar = (o6.f) zVar4.A;
        if (fVar != null) {
            remoteViews2.setBoolean(i12, "setClipToOutline", true);
            if (!(fVar instanceof o6.b)) {
                throw new IllegalStateException(("Rounded corners should not be " + fVar.getClass().getCanonicalName()).toString());
            }
            remoteViews2.setViewOutlinePreferredRadius(i12, ((o6.b) fVar).f11661a, 1);
        }
        j6.o oVar = (j6.o) zVar3.A;
        if (oVar != null) {
            Resources resources = context.getResources();
            j6.n nVar2 = oVar.f8190a;
            float fL = w50.c.l(nVar2.f8189b, resources) + nVar2.f8188a;
            j6.n nVar3 = oVar.f8191b;
            float fL2 = w50.c.l(nVar3.f8189b, resources) + nVar3.f8188a;
            j6.n nVar4 = oVar.f8192c;
            float fL3 = w50.c.l(nVar4.f8189b, resources) + nVar4.f8188a;
            j6.n nVar5 = oVar.f8193d;
            float fL4 = w50.c.l(nVar5.f8189b, resources) + nVar5.f8188a;
            j6.n nVar6 = oVar.f8194e;
            float fL5 = w50.c.l(nVar6.f8189b, resources) + nVar6.f8188a;
            j6.n nVar7 = oVar.f8195f;
            float fL6 = w50.c.l(nVar7.f8189b, resources) + nVar7.f8188a;
            boolean z10 = i2Var.f4642c;
            float f3 = fL + (z10 ? fL5 : fL2);
            if (!z10) {
                fL2 = fL5;
            }
            float f10 = fL4 + fL2;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i14 = j1Var.f4655a;
            int iApplyDimension = (int) TypedValue.applyDimension(1, f3, displayMetrics);
            int iApplyDimension2 = (int) TypedValue.applyDimension(1, fL3, displayMetrics);
            int iApplyDimension3 = (int) TypedValue.applyDimension(1, f10, displayMetrics);
            int iApplyDimension4 = (int) TypedValue.applyDimension(1, fL6, displayMetrics);
            remoteViews2 = remoteViews;
            remoteViews2.setViewPadding(i14, iApplyDimension, iApplyDimension2, iApplyDimension3, iApplyDimension4);
        }
        if (zVar8.A != null) {
            throw new ClassCastException();
        }
        k6.b bVar2 = (k6.b) zVar9.A;
        if (bVar2 != null) {
            Object obj2 = bVar2.f8973a.f8972a.get(k6.c.f8974a);
            List list = (List) (obj2 != null ? obj2 : null);
            if (list != null) {
                remoteViews2.setContentDescription(i12, h00.q.R0(list, (CharSequence) null, (String) null, (String) null, (u00.k) null, 63));
            }
        }
        int iOrdinal = ((b6.v) zVar5.A).ordinal();
        if (iOrdinal == 0) {
            i10 = 0;
        } else if (iOrdinal == 1) {
            i10 = 4;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 8;
        }
        remoteViews2.setViewVisibility(i12, i10);
    }

    public static final void e(RemoteViews remoteViews, j6.m mVar, int i10) {
        o6.f fVar = mVar.f8187a;
        if (fVar instanceof o6.e) {
            remoteViews.setViewLayoutHeight(i10, -2.0f, 0);
            return;
        }
        if (fVar instanceof o6.c) {
            remoteViews.setViewLayoutHeight(i10, 0.0f, 0);
        } else if (fVar instanceof o6.b) {
            remoteViews.setViewLayoutHeight(i10, ((o6.b) fVar).f11661a, 1);
        } else {
            if (!fVar.equals(o6.d.f11663a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutHeight(i10, -1.0f, 0);
        }
    }

    public static final void f(RemoteViews remoteViews, j6.s sVar, int i10) {
        o6.f fVar = sVar.f8197a;
        if (fVar instanceof o6.e) {
            remoteViews.setViewLayoutWidth(i10, -2.0f, 0);
            return;
        }
        if (fVar instanceof o6.c) {
            remoteViews.setViewLayoutWidth(i10, 0.0f, 0);
        } else if (fVar instanceof o6.b) {
            remoteViews.setViewLayoutWidth(i10, ((o6.b) fVar).f11661a, 1);
        } else {
            if (!fVar.equals(o6.d.f11663a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutWidth(i10, -1.0f, 0);
        }
    }

    public static final Object g(p0 p0Var, Context context, int i10, AppWidgetProviderInfo appWidgetProviderInfo, m00.c cVar) {
        d dVar;
        p0 p0Var2;
        AppWidgetProviderInfo appWidgetProviderInfo2;
        x1 x1Var;
        Context context2;
        Context context3 = context;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.E;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.E = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object objK = dVar.D;
        l00.a aVar = l00.a.A;
        int i12 = dVar.E;
        k00.c cVar2 = null;
        if (i12 == 0) {
            ri.t1.O(objK);
            e eVar = new e(p0Var, context3, i10, null);
            dVar.A = p0Var;
            dVar.B = context3;
            dVar.C = appWidgetProviderInfo;
            dVar.E = 1;
            objK = a40.c0.k(eVar, dVar);
            if (objK != aVar) {
                p0Var2 = p0Var;
                appWidgetProviderInfo2 = appWidgetProviderInfo;
            }
            return aVar;
        }
        if (i12 == 1) {
            appWidgetProviderInfo2 = dVar.C;
            context3 = (Context) dVar.B;
            p0 p0Var3 = (p0) dVar.A;
            ri.t1.O(objK);
            p0Var2 = p0Var3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x1Var = (x1) dVar.B;
            Context context4 = (Context) dVar.A;
            ri.t1.O(objK);
            context2 = context4;
        }
        x1 x1Var2 = x1Var;
        p(x1Var2, true);
        l1 l1Var = new l1(context2, new LinkedHashMap(), 0, -1, null, 48);
        return z(context2, -1, x1Var2, l1Var, l1Var.a(x1Var2), null, new l9.f0(new ComponentName(context2, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context2, (Class<?>) GlanceRemoteViewsService.class)));
        Context context5 = context3;
        u00.n nVar = (u00.n) objK;
        long j9 = appWidgetProviderInfo2 != null ? j(appWidgetProviderInfo2, context5.getResources().getDisplayMetrics()) : 0L;
        x1Var = new x1(50);
        b6.b bVar = new b6.b(x1Var);
        l1.x1 x1Var3 = new l1.x1(dVar.getContext());
        new l1.p(x1Var3, bVar).A(new v1.c(new b(context5, p0Var2, j9, nVar), 265674463, true));
        c3.w0 w0Var = new c3.w0((u00.a) null);
        d0.i2 i2Var = new d0.i2(x1Var3, cVar2, 5);
        dVar.A = context5;
        dVar.B = x1Var;
        dVar.C = null;
        dVar.E = 2;
        if (a40.c0.J(i2Var, w0Var, dVar) != aVar) {
            context2 = context5;
            x1 x1Var4 = x1Var;
            p(x1Var4, true);
            l1 l1Var2 = new l1(context2, new LinkedHashMap(), 0, -1, null, 48);
            return z(context2, -1, x1Var4, l1Var2, l1Var2.a(x1Var4), null, new l9.f0(new ComponentName(context2, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context2, (Class<?>) GlanceRemoteViewsService.class)));
        }
        return aVar;
    }

    public static final f6.w h(b6.h hVar) {
        f6.x xVar;
        f6.o oVar;
        f6.v vVarA = f6.w.A();
        if (hVar instanceof j6.i) {
            xVar = f6.x.BOX;
        } else if (hVar instanceof j6.k) {
            xVar = m(((j6.k) hVar).f8183c) ? f6.x.RADIO_ROW : f6.x.ROW;
        } else if (hVar instanceof j6.j) {
            xVar = m(((j6.j) hVar).f8180c) ? f6.x.RADIO_COLUMN : f6.x.COLUMN;
        } else if (hVar instanceof n6.a) {
            xVar = f6.x.TEXT;
        } else if (hVar instanceof j6.l) {
            xVar = f6.x.SPACER;
        } else if (hVar instanceof b6.i) {
            xVar = f6.x.IMAGE;
        } else if (hVar instanceof x1) {
            xVar = f6.x.REMOTE_VIEWS_ROOT;
        } else {
            if (!(hVar instanceof f0)) {
                throw new IllegalArgumentException("Unknown element type " + hVar.getClass().getCanonicalName());
            }
            xVar = f6.x.SIZE_BOX;
        }
        vVarA.c();
        f6.w.n((f6.w) vVarA.B, xVar);
        j6.s sVar = (j6.s) hVar.b().a(null, n1.S);
        o6.f fVar = o6.e.f11664a;
        boolean z10 = (sVar != null ? sVar.f8197a : fVar) instanceof o6.c;
        f6.p pVar = f6.p.WRAP;
        f6.p pVar2 = f6.p.EXPAND;
        f6.p pVar3 = z10 ? pVar2 : pVar;
        vVarA.c();
        f6.w.o((f6.w) vVarA.B, pVar3);
        j6.m mVar = (j6.m) hVar.b().a(null, n1.T);
        if (mVar != null) {
            fVar = mVar.f8187a;
        }
        if (fVar instanceof o6.c) {
            pVar = pVar2;
        }
        vVarA.c();
        f6.w.p((f6.w) vVarA.B, pVar);
        boolean z11 = hVar.b().a(null, n1.Q) != null;
        vVarA.c();
        f6.w.u((f6.w) vVarA.B, z11);
        if (hVar.b().a(null, n1.R) != null) {
            vVarA.c();
            f6.w.t((f6.w) vVarA.B);
        }
        if (hVar instanceof b6.i) {
            b6.i iVar = (b6.i) hVar;
            int i10 = iVar.f2176e;
            if (i10 == 1) {
                oVar = f6.o.FIT;
            } else if (i10 == 0) {
                oVar = f6.o.CROP;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) j6.h.a(iVar.f2176e))).toString());
                }
                oVar = f6.o.FILL_BOUNDS;
            }
            vVarA.c();
            f6.w.s((f6.w) vVarA.B, oVar);
            boolean z12 = !w50.c.T(iVar);
            vVarA.c();
            f6.w.w((f6.w) vVarA.B, z12);
            boolean z13 = iVar.f2174c != null;
            vVarA.c();
            f6.w.x((f6.w) vVarA.B, z13);
            boolean z14 = iVar.f2175d != null;
            vVarA.c();
            f6.w.y((f6.w) vVarA.B, z14);
        } else if (hVar instanceof j6.j) {
            f6.q qVarW = w(((j6.j) hVar).f8182e);
            vVarA.c();
            f6.w.q((f6.w) vVarA.B, qVarW);
        } else if (hVar instanceof j6.k) {
            f6.y yVarV = v(((j6.k) hVar).f8185e);
            vVarA.c();
            f6.w.r((f6.w) vVarA.B, yVarV);
        } else if (hVar instanceof j6.i) {
            j6.i iVar2 = (j6.i) hVar;
            f6.q qVarW2 = w(iVar2.f8179d.f8174a);
            vVarA.c();
            f6.w.q((f6.w) vVarA.B, qVarW2);
            f6.y yVarV2 = v(iVar2.f8179d.f8175b);
            vVarA.c();
            f6.w.r((f6.w) vVarA.B, yVarV2);
        }
        if (hVar instanceof b6.j) {
            ArrayList arrayList = ((b6.j) hVar).f2178b;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(h((b6.h) it.next()));
            }
            vVarA.c();
            f6.w.v((f6.w) vVarA.B, arrayList2);
        }
        return (f6.w) vVarA.a();
    }

    public static final String i(int i10) {
        return g4.c.f(i10, "appWidget-");
    }

    public static final long j(AppWidgetProviderInfo appWidgetProviderInfo, DisplayMetrics displayMetrics) {
        int iMin = Math.min(appWidgetProviderInfo.minWidth, (appWidgetProviderInfo.resizeMode & 1) != 0 ? appWidgetProviderInfo.minResizeWidth : Integer.MAX_VALUE);
        int iMin2 = Math.min(appWidgetProviderInfo.minHeight, (appWidgetProviderInfo.resizeMode & 2) != 0 ? appWidgetProviderInfo.minResizeHeight : Integer.MAX_VALUE);
        float f3 = displayMetrics.density;
        return f50.c.b(iMin / f3, iMin2 / f3);
    }

    public static final void k(BroadcastReceiver broadcastReceiver, k00.i iVar, u00.n nVar) {
        if (i0.f4639a.get()) {
            throw new IllegalStateException("goAsync must never be called when the AsyncRequestWorker is meant to be used");
        }
        f40.c cVarC = a40.c0.c(iVar);
        a40.c0.y(cVarC, (k00.i) null, (a40.a0) null, new a1.e2(cVarC, broadcastReceiver.goAsync(), nVar, (k00.c) null), 3);
    }

    public static final boolean l(h hVar) {
        int i10 = hVar.f4631a;
        return Integer.MIN_VALUE <= i10 && i10 < -1;
    }

    public static final boolean m(b6.m mVar) {
        return mVar.c(new bw.b(24));
    }

    public static final String n(int i10) {
        return g4.c.f(i10, "appWidgetLayout-");
    }

    public static final boolean o(Context context, u00.k kVar) {
        if (!i0.f4639a.get() && (!kotlin.jvm.internal.m.a(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        f6.a aVarE = f6.n.E();
        kVar.invoke(aVarE);
        f6.n nVar = (f6.n) aVarE.a();
        kotlin.jvm.internal.m.e(context, "context");
        ab.y yVarL0 = ab.y.l0(context);
        za.x xVar = new za.x(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int iB = nVar.b(null);
            byte[] bArr = new byte[iB];
            Logger logger = androidx.glance.appwidget.protobuf.o.f932c;
            androidx.glance.appwidget.protobuf.m mVar = new androidx.glance.appwidget.protobuf.m(iB, bArr);
            nVar.m(mVar);
            if (mVar.C0() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            String str = za.h.f17369a;
            Byte[] bArr2 = new Byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr2[i10] = Byte.valueOf(bArr[i10]);
            }
            linkedHashMap.put("request", bArr2);
            za.g gVar = new za.g(linkedHashMap);
            kh.n.f0(gVar);
            yVarL0.w(((za.x) xVar.h(gVar)).b());
            za.l lVar = za.l.B;
            za.x xVar2 = (za.x) new za.x(AsyncRequestWorker.class).g(3650L, TimeUnit.DAYS);
            xVar2.f17385c.f7013j = new za.e(new ib.f(null), za.w.A, true, false, false, false, -1L, -1L, h00.q.r1(new LinkedHashSet()));
            yVarL0.x("updateRequestWorkerKeepEnabled", lVar, (za.y) xVar2.b());
            return true;
        } catch (IOException e3) {
            throw new RuntimeException("Serializing " + f6.n.class.getName() + " to a byte array threw an IOException (should never happen).", e3);
        }
    }

    public static final void p(x1 x1Var, boolean z10) {
        ArrayList<b6.h> arrayList = x1Var.f2178b;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((b6.h) it.next()) instanceof f0)) {
                            if (arrayList.size() != 1) {
                                j6.i iVar = new j6.i();
                                h00.v.u0(arrayList, iVar.f2178b);
                                arrayList.clear();
                                arrayList.add(iVar);
                            }
                        }
                    }
                }
            }
            for (b6.h hVar : arrayList) {
                kotlin.jvm.internal.m.c(hVar, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                ArrayList arrayList2 = ((f0) hVar).f2178b;
                if (arrayList2.size() != 1) {
                    j6.i iVar2 = new j6.i();
                    h00.v.u0(arrayList2, iVar2.f2178b);
                    arrayList2.clear();
                    arrayList2.add(iVar2);
                }
            }
        } else if (arrayList.size() != 1) {
            j6.i iVar3 = new j6.i();
            h00.v.u0(arrayList, iVar3.f2178b);
            arrayList.clear();
            arrayList.add(iVar3);
        }
        q(x1Var);
        x(x1Var, new t1(0, z10));
    }

    public static final void q(b6.j jVar) {
        ArrayList<b6.h> arrayList = jVar.f2178b;
        for (b6.h hVar : arrayList) {
            if (hVar instanceof b6.j) {
                q((b6.j) hVar);
            }
        }
        j6.m mVar = (j6.m) jVar.b().a(null, n1.J);
        o6.f fVar = o6.e.f11664a;
        if (((mVar != null ? mVar.f8187a : fVar) instanceof o6.e) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6.m mVar2 = (j6.m) ((b6.h) it.next()).b().a(null, n1.L);
                if ((mVar2 != null ? mVar2.f8187a : null) instanceof o6.d) {
                    jVar.c(jVar.b().d(new j6.m(o6.d.f11663a)));
                    break;
                }
            }
        }
        j6.s sVar = (j6.s) jVar.b().a(null, n1.K);
        if (sVar != null) {
            fVar = sVar.f8197a;
        }
        if (fVar instanceof o6.e) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j6.s sVar2 = (j6.s) ((b6.h) it2.next()).b().a(null, n1.M);
                    if ((sVar2 != null ? sVar2.f8197a : null) instanceof o6.d) {
                        jVar.c(ze.d.v(jVar.b()));
                        return;
                    }
                }
            }
        }
    }

    public static final void r(v1.c cVar, m00.c cVar2) throws KotlinNothingValueException {
        q0 q0Var;
        if (cVar2 instanceof q0) {
            q0Var = (q0) cVar2;
            int i10 = q0Var.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.B = i10 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(cVar2);
            }
        } else {
            q0Var = new q0(cVar2);
        }
        Object obj = q0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = q0Var.B;
        if (i11 != 0) {
            if (i11 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        b0 b0Var = (b0) q0Var.getContext().get(a0.A);
        if (b0Var == null) {
            throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        }
        q0Var.B = 1;
        b0Var.Z(cVar, q0Var);
    }

    public static final void s(RemoteViews remoteViews, i2 i2Var, j1 j1Var, List list) throws NoWhenBranchMatchedException {
        int i10 = 0;
        for (Object obj : h00.q.j1(list, 10)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                va.a.k0();
                throw null;
            }
            y(remoteViews, i2Var.b(j1Var, i10), (b6.h) obj);
            i10 = i11;
        }
    }

    public static final boolean t(b6.h hVar) {
        if (hVar instanceof e0) {
            return true;
        }
        if (!(hVar instanceof b6.j)) {
            return false;
        }
        ArrayList arrayList = ((b6.j) hVar).f2178b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (t((b6.h) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final int u(j6.c cVar) {
        int i10 = cVar.f8174a;
        int i11 = 8388611;
        if (i10 != 0) {
            if (i10 == 2) {
                i11 = 8388613;
            } else if (i10 == 1) {
                i11 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) j6.a.b(i10)));
            }
        }
        int i12 = cVar.f8175b;
        int i13 = 48;
        if (i12 != 0) {
            if (i12 == 2) {
                i13 = 80;
            } else if (i12 == 1) {
                i13 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) j6.b.b(i12)));
            }
        }
        return i11 | i13;
    }

    public static final f6.y v(int i10) {
        if (i10 == 0) {
            return f6.y.TOP;
        }
        if (i10 == 1) {
            return f6.y.CENTER_VERTICALLY;
        }
        if (i10 == 2) {
            return f6.y.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) j6.b.b(i10))).toString());
    }

    public static final f6.q w(int i10) {
        if (i10 == 0) {
            return f6.q.START;
        }
        if (i10 == 1) {
            return f6.q.CENTER_HORIZONTALLY;
        }
        if (i10 == 2) {
            return f6.q.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) j6.a.b(i10))).toString());
    }

    public static final void x(b6.j jVar, t1 t1Var) {
        int i10 = 0;
        for (Object obj : jVar.f2178b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                va.a.k0();
                throw null;
            }
            b6.h hVar = (b6.h) t1Var.invoke((b6.h) obj);
            jVar.f2178b.set(i10, hVar);
            if (hVar instanceof b6.j) {
                x((b6.j) hVar, t1Var);
            }
            i10 = i11;
        }
    }

    public static final void y(RemoteViews remoteViews, i2 i2Var, b6.h hVar) throws NoWhenBranchMatchedException {
        s1 s1Var;
        Context context = i2Var.f4640a;
        if (hVar instanceof j6.i) {
            j6.i iVar = (j6.i) hVar;
            ArrayList<b6.h> arrayList = iVar.f2178b;
            s1 s1Var2 = s1.C;
            int size = arrayList.size();
            b6.m mVar = iVar.f8178c;
            j6.c cVar = iVar.f8179d;
            j1 j1VarB = o1.b(remoteViews, i2Var, s1Var2, size, mVar, new j6.a(cVar.f8174a), new j6.b(cVar.f8175b));
            d(i2Var, remoteViews, iVar.f8178c, j1VarB);
            for (b6.h hVar2 : arrayList) {
                hVar2.c(hVar2.b().d(new a(iVar.f8179d)));
            }
            s(remoteViews, i2Var, j1VarB, arrayList);
            return;
        }
        if (hVar instanceof j6.k) {
            j6.k kVar = (j6.k) hVar;
            s1 s1Var3 = m(kVar.f8183c) ? s1.f4696b0 : s1.A;
            ArrayList<b6.h> arrayList2 = kVar.f2178b;
            j1 j1VarB2 = o1.b(remoteViews, i2Var, s1Var3, arrayList2.size(), kVar.f8183c, null, new j6.b(kVar.f8185e));
            remoteViews.setInt(j1VarB2.f4655a, "setGravity", u(new j6.c(kVar.f8184d, kVar.f8185e)));
            d(i2.a(i2Var, 0, null, null, null, 0L, null, 61439), remoteViews, kVar.f8183c, j1VarB2);
            s(remoteViews, i2Var, j1VarB2, arrayList2);
            if (!m(kVar.f8183c) || arrayList2.isEmpty()) {
                return;
            }
            for (b6.h hVar3 : arrayList2) {
            }
            return;
        }
        if (hVar instanceof j6.j) {
            j6.j jVar = (j6.j) hVar;
            s1 s1Var4 = m(jVar.f8180c) ? s1.f4697c0 : s1.B;
            ArrayList<b6.h> arrayList3 = jVar.f2178b;
            j1 j1VarB3 = o1.b(remoteViews, i2Var, s1Var4, arrayList3.size(), jVar.f8180c, new j6.a(jVar.f8182e), null);
            remoteViews.setInt(j1VarB3.f4655a, "setGravity", u(new j6.c(jVar.f8182e, jVar.f8181d)));
            d(i2.a(i2Var, 0, null, null, null, 0L, null, 61439), remoteViews, jVar.f8180c, j1VarB3);
            s(remoteViews, i2Var, j1VarB3, arrayList3);
            if (!m(jVar.f8180c) || arrayList3.isEmpty()) {
                return;
            }
            for (b6.h hVar4 : arrayList3) {
            }
            return;
        }
        boolean z10 = false;
        if (hVar instanceof n6.a) {
            n6.a aVar = (n6.a) hVar;
            j1 j1VarC = o1.c(remoteViews, i2Var, s1.D, aVar.f11111d);
            int i10 = j1VarC.f4655a;
            CharSequence charSequence = aVar.f11108a;
            n6.e eVar = aVar.f11109b;
            int i11 = aVar.f11110c;
            if (i11 != Integer.MAX_VALUE) {
                remoteViews.setInt(i10, "setMaxLines", i11);
            }
            if (eVar == null) {
                remoteViews.setTextViewText(i10, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                y3.o oVar = eVar.f11114b;
                if (oVar != null) {
                    long j9 = oVar.f16600a;
                    if ((1095216660480L & j9) != 4294967296L) {
                        throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                    }
                    remoteViews.setTextViewTextSize(i10, 2, y3.o.c(j9));
                }
                ArrayList arrayList4 = new ArrayList();
                n6.b bVar = eVar.f11115c;
                if (bVar != null) {
                    int i12 = bVar.f11112a;
                    arrayList4.add(new TextAppearanceSpan(context, i12 == 700 ? 2131951984 : i12 == 500 ? 2131951986 : 2131951987));
                }
                if (eVar.f11116d != null) {
                    remoteViews.setInt(i10, "setGravity", 49);
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i10, spannableString);
                o6.a aVar2 = eVar.f11113a;
                if (aVar2 instanceof o6.g) {
                    remoteViews.setTextColor(i10, i2.b0.C(((o6.g) aVar2).f11665a));
                } else if (aVar2 instanceof o6.h) {
                    e5.f.g(remoteViews, i10, "setTextColor", ((o6.h) aVar2).f11666a);
                } else {
                    Log.w("GlanceAppWidget", "Unexpected text color: " + aVar2);
                }
            }
            d(i2Var, remoteViews, aVar.f11111d, j1VarC);
            return;
        }
        if (hVar instanceof j6.l) {
            j6.l lVar = (j6.l) hVar;
            d(i2Var, remoteViews, lVar.f8186a, o1.c(remoteViews, i2Var, s1.I, lVar.f8186a));
            return;
        }
        if (!(hVar instanceof b6.i)) {
            if (!(hVar instanceof f0)) {
                throw new IllegalArgumentException("Unknown element type " + hVar.getClass().getCanonicalName());
            }
            ArrayList arrayList5 = ((f0) hVar).f2178b;
            if (arrayList5.size() > 1) {
                throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList5.size() + ". The normalization of the composition tree failed.").toString());
            }
            b6.h hVar5 = (b6.h) h00.q.N0(arrayList5);
            if (hVar5 != null) {
                y(remoteViews, i2Var, hVar5);
                return;
            }
            return;
        }
        b6.i iVar2 = (b6.i) hVar;
        boolean zT = w50.c.T(iVar2);
        int i13 = iVar2.f2176e;
        if (i13 == 0) {
            s1Var = zT ? s1.W : s1.T;
        } else if (i13 == 1) {
            s1Var = zT ? s1.X : s1.U;
        } else if (i13 == 2) {
            s1Var = zT ? s1.Y : s1.V;
        } else {
            Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) j6.h.a(iVar2.f2176e)));
            s1Var = s1.U;
        }
        j1 j1VarC2 = o1.c(remoteViews, i2Var, s1Var, iVar2.f2172a);
        int i14 = j1VarC2.f4655a;
        b6.t tVar = iVar2.f2173b;
        if (tVar instanceof b6.a) {
            remoteViews.setImageViewResource(i14, ((b6.a) tVar).f2162a);
        } else {
            if (!(tVar instanceof b6.d)) {
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            }
            remoteViews.setImageViewBitmap(i14, ((b6.d) tVar).f2164a);
        }
        b6.u uVar = iVar2.f2174c;
        if (uVar != null) {
            if (!(uVar instanceof b6.u)) {
                throw new IllegalArgumentException("An unsupported ColorFilter was used.");
            }
            o6.a aVar3 = uVar.f2180a;
            if (aVar3 instanceof o6.h) {
                e5.f.d(remoteViews, i14, "setColorFilter", ((o6.h) aVar3).f11666a);
            } else {
                remoteViews.setInt(i14, "setColorFilter", i2.b0.C(aVar3.a(context)));
            }
        }
        Float f3 = iVar2.f2175d;
        if (f3 != null) {
            remoteViews.setInt(i14, "setImageAlpha", ab.a0.y((int) Math.rint(ab.a0.x(f3.floatValue(), 0.0f, 1.0f) * 255), 0, 255));
        }
        d(i2Var, remoteViews, iVar2.f2172a, j1VarC2);
        if (iVar2.f2176e == 1) {
            j6.s sVar = (j6.s) iVar2.f2172a.a(null, h6.a.B);
            o6.f fVar = sVar != null ? sVar.f8197a : null;
            o6.e eVar2 = o6.e.f11664a;
            if (kotlin.jvm.internal.m.a(fVar, eVar2)) {
                z10 = true;
            } else {
                j6.m mVar2 = (j6.m) iVar2.f2172a.a(null, h6.a.C);
                if (kotlin.jvm.internal.m.a(mVar2 != null ? mVar2.f8187a : null, eVar2)) {
                    z10 = true;
                }
            }
        }
        remoteViews.setBoolean(i14, "setAdjustViewBounds", z10);
    }

    public static final RemoteViews z(Context context, int i10, x1 x1Var, l1 l1Var, int i11, ComponentName componentName, l9.f0 f0Var) throws NoWhenBranchMatchedException {
        i2 i2Var = new i2(context, i10, context.getResources().getConfiguration().getLayoutDirection() == 1, l1Var, -1, false, new AtomicInteger(-1), new j1(0, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, f0Var);
        ArrayList<b6.h> arrayList = x1Var.f2178b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((b6.h) it.next()) instanceof f0)) {
                    b6.h hVar = (b6.h) h00.q.d1(arrayList);
                    w1 w1VarA = o1.a(i2Var, hVar.b(), i11);
                    RemoteViews remoteViews = w1VarA.f4710a;
                    y(remoteViews, i2.a(i2Var.b(w1VarA.f4711b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), hVar);
                    return remoteViews;
                }
            }
        }
        Object objL0 = h00.q.L0(arrayList);
        kotlin.jvm.internal.m.c(objL0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        f2 f2Var = ((f0) objL0).f4627d;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        for (b6.h hVar2 : arrayList) {
            kotlin.jvm.internal.m.c(hVar2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            f0 f0Var2 = (f0) hVar2;
            long j9 = f0Var2.f4626c;
            w1 w1VarA2 = o1.a(i2Var, f0Var2.b(), i11);
            RemoteViews remoteViews2 = w1VarA2.f4710a;
            y(remoteViews2, i2.a(i2Var.b(w1VarA2.f4711b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j9, null, 64703), hVar2);
            arrayList2.add(new g00.k(new SizeF(y3.h.b(j9), y3.h.a(j9)), remoteViews2));
        }
        if (f2Var instanceof e2) {
            return (RemoteViews) ((g00.k) h00.q.d1(arrayList2)).B;
        }
        if ((f2Var instanceof d2) || kotlin.jvm.internal.m.a(f2Var, c2.f4622a)) {
            return new RemoteViews((Map<SizeF, RemoteViews>) h00.d0.Y(arrayList2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
