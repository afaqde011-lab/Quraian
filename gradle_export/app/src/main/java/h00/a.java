package h00;

import a40.e1;
import android.app.Application;
import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import b3.l0;
import c3.k1;
import com.google.android.gms.internal.measurement.y3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d40.p1;
import g1.k8;
import h1.v0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l0.r0;
import l1.a1;
import l1.e2;
import l1.f1;
import l1.n1;
import l1.t0;
import l1.v1;
import l1.x1;
import p40.q0;

public final class a implements u00.k {
    public final int A;
    public final Object B;

    public a(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public a(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        j0.n nVar;
        k0.p pVar;
        String strD;
        i2.k kVar;
        float f = 0.0f;
        char c = 1;
        i2.k kVar2 = null;
        switch (this.A) {
            case 0:
                return obj == ((b) this.B) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                g gVar = (g) this.B;
                Map.Entry it = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(it, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it.getKey();
                sb.append(key == gVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it.getValue();
                sb.append(value != gVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                return new k1((k8) this.B, 11);
            case 3:
                ((hw.j) this.B).j(new hw.a(((Integer) obj).intValue()));
                return g00.b0.a;
            case 4:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((rs.f) obj).a, ((rs.f) this.B).a));
            case 5:
                j0.k kVar3 = (j0.k) this.B;
                return kVar3.W0(((Integer) obj).intValue(), kVar3.E);
            case 6:
                j0.v vVar = (j0.v) this.B;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || vVar.d()) && (f2 <= 0.0f || vVar.b())) {
                    if (Math.abs(vVar.h) > 0.5f) {
                        g0.a.c("entered drag with non-zero pending scroll");
                    }
                    vVar.d = true;
                    float f3 = vVar.h + f2;
                    vVar.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = vVar.h;
                        int iRound = Math.round(f4);
                        i2.k kVarF = ((j0.n) vVar.f.getValue()).f(iRound, !vVar.b);
                        if (kVarF == null || (nVar = vVar.c) == null) {
                            kVar2 = kVarF;
                        } else {
                            j0.n nVarF = nVar.f(iRound, true);
                            if (nVarF != null) {
                                vVar.c = nVarF;
                                kVar2 = kVarF;
                            }
                        }
                        if (kVar2 != null) {
                            vVar.g(kVar2, vVar.b, true);
                            vVar.w.setValue(g00.b0.a);
                            vVar.i(f4 - vVar.h, kVar2);
                        } else {
                            l0 l0Var = vVar.l;
                            if (l0Var != null) {
                                l0Var.l();
                            }
                            vVar.i(f4 - vVar.h, vVar.h());
                        }
                    }
                    if (Math.abs(vVar.h) > 0.5f) {
                        f2 -= vVar.h;
                        vVar.h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 7:
                h1.g0 g0Var = (h1.g0) this.B;
                j3.a0 a0Var = (j3.a0) obj;
                if (g0Var.invoke() > 0.0f) {
                    j3.y.j(a0Var, new j3.j(g0Var.invoke(), new z00.a(0.0f, 1.0f)));
                }
                return g00.b0.a;
            case 8:
                ((j40.c) this.B).i(null);
                return g00.b0.a;
            case 9:
                return Integer.valueOf(((c50.f) this.B).d(((Integer) obj).intValue()));
            case 10:
                k0.y yVar = (k0.y) this.B;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= 0.0f || yVar.d()) && (f5 <= 0.0f || yVar.b())) {
                    if (Math.abs(yVar.g) > 0.5f) {
                        g0.a.c("entered drag with non-zero pending scroll");
                    }
                    float f6 = yVar.g + f5;
                    yVar.g = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = yVar.g;
                        int iF = w00.a.F(f7);
                        i2.k kVarF2 = ((k0.p) yVar.e.getValue()).f(iF, !yVar.b);
                        if (kVarF2 == null || (pVar = yVar.c) == null) {
                            kVar2 = kVarF2;
                        } else {
                            k0.p pVarF = pVar.f(iF, true);
                            if (pVarF != null) {
                                yVar.c = pVarF;
                                kVar2 = kVarF2;
                            }
                        }
                        if (kVar2 != null) {
                            yVar.f(kVar2, yVar.b, true);
                            yVar.r.setValue(g00.b0.a);
                            yVar.h(f7 - yVar.g, kVar2);
                        } else {
                            l0 l0Var2 = yVar.j;
                            if (l0Var2 != null) {
                                l0Var2.l();
                            }
                            yVar.h(f7 - yVar.g, yVar.g());
                        }
                    }
                    if (Math.abs(yVar.g) > 0.5f) {
                        f5 -= yVar.g;
                        yVar.g = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 11:
                kotlin.jvm.internal.e0 e0Var = (kotlin.jvm.internal.e0) this.B;
                a10.z it2 = (a10.z) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                e0Var.getClass();
                a10.a0 a0Var2 = it2.a;
                i2.k kVar4 = it2.b;
                if (a0Var2 == null) {
                    return "*";
                }
                kVar2 = kVar4 instanceof kotlin.jvm.internal.e0 ? (kotlin.jvm.internal.e0) kVar4 : null;
                String strValueOf = (kVar2 == null || (strD = kVar2.d(true)) == null) ? String.valueOf(kVar4) : strD;
                int iOrdinal = a0Var2.ordinal();
                if (iOrdinal == 0) {
                    return strValueOf;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strValueOf);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                return new k1((l0.h0) this.B, 13);
            case 13:
                return new k1((r0) this.B, 15);
            case 14:
                y1.f fVar = (y1.f) this.B;
                return Boolean.valueOf(fVar != null ? fVar.a(obj) : true);
            case 15:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((a1) obj).b, (t0) this.B));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((l1.p) this.B).c(obj);
                return g00.b0.a;
            case 17:
                x1 x1Var = (x1) this.B;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionA = a40.c0.a("Recomposer effect job completed", th);
                synchronized (x1Var.d) {
                    try {
                        e1 e1Var = x1Var.e;
                        if (e1Var != null) {
                            p1 p1Var = x1Var.w;
                            v1 v1Var = v1.B;
                            p1Var.getClass();
                            p1Var.k(null, v1Var);
                            if (x1Var.t) {
                                kVar = x1Var.s;
                                if (kVar != null) {
                                }
                                x1Var.s = null;
                                e1Var.f0(new v0(x1Var, th, 23));
                                kVar2 = kVar;
                            } else {
                                e1Var.i(cancellationExceptionA);
                            }
                            kVar = null;
                            x1Var.s = null;
                            e1Var.f0(new v0(x1Var, th, 23));
                            kVar2 = kVar;
                        } else {
                            x1Var.f = cancellationExceptionA;
                            p1 p1Var2 = x1Var.w;
                            v1 v1Var2 = v1.A;
                            p1Var2.getClass();
                            p1Var2.k(null, v1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (kVar2 != null) {
                    kVar2.resumeWith(g00.b0.a);
                }
                return g00.b0.a;
            case 18:
                e2 e2Var = (e2) this.B;
                c40.w wVar = e2Var.G;
                kotlin.jvm.internal.m.b(wVar);
                if (!kotlin.jvm.internal.m.a(e2Var.G, wVar)) {
                    n1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                u.j0 j0Var = e2Var.F;
                Object obj2 = e2Var.D;
                if (j0Var != null) {
                    if (obj2 != null) {
                        n1.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    j0Var.a(obj);
                } else if (obj2 == null) {
                    e2Var.D = obj;
                } else {
                    u.j0 j0Var2 = u.r0.a;
                    u.j0 j0Var3 = new u.j0();
                    j0Var3.a(obj2);
                    j0Var3.a(obj);
                    e2Var.F = j0Var3;
                    e2Var.D = null;
                }
                return g00.b0.a;
            case 19:
                ((e1) this.B).i(null);
                return g00.b0.a;
            case 20:
                ((lu.e0) this.B).k(new lu.j(((Boolean) obj).booleanValue()));
                return g00.b0.a;
            case 21:
                m0.b0 b0Var = (m0.b0) this.B;
                float fFloatValue = ((Float) obj).floatValue();
                m0.w wVar2 = b0Var.b;
                wVar2.q.i(wVar2.j(((f1) wVar2.d.B).h() + w00.a.F(wVar2.n() != 0 ? fFloatValue / wVar2.n() : 0.0f)));
                return g00.b0.a;
            case 22:
                n40.f fVar2 = (n40.f) this.B;
                int iIntValue = ((Integer) obj).intValue();
                return fVar2.f[iIntValue] + ": " + fVar2.g[iIntValue].a();
            case 23:
                return Integer.valueOf(((o1.h) this.B).a(y3.q(((t0) obj).e)));
            case 24:
                final Context context = (Context) this.B;
                y50.a module = (y50.a) obj;
                kotlin.jvm.internal.m.e(module, "$this$module");
                if (context instanceof Application) {
                    final int i = 0;
                    u00.n nVar2 = new u00.n() {
                        @Override
                        public final Object invoke(Object obj3, Object obj4) {
                            e60.a single = (e60.a) obj3;
                            a60.a it3 = (a60.a) obj4;
                            switch (i) {
                                case 0:
                                    m.e(single, "$this$single");
                                    m.e(it3, "it");
                                    return (Application) context;
                                default:
                                    m.e(single, "$this$single");
                                    m.e(it3, "it");
                                    return context;
                            }
                        }
                    };
                    b60.b bVar = c60.a.e;
                    v50.c cVar = v50.c.A;
                    kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                    v50.a aVar = new v50.a(bVar, b0Var2.b(Application.class), null, nVar2, cVar);
                    w50.e eVar = new w50.e(aVar);
                    module.a(eVar);
                    a10.d dVarB = b0Var2.b(Context.class);
                    aVar.f = q.Z0(dVarB, aVar.f);
                    String mapping = g60.a.a(dVarB) + "::" + bVar;
                    kotlin.jvm.internal.m.e(mapping, "mapping");
                    module.c.put(mapping, eVar);
                } else {
                    final char c2 = c == true ? 1 : 0;
                    module.a(new w50.e(new v50.a(c60.a.e, kotlin.jvm.internal.a0.a.b(Context.class), null, new u00.n() {
                        @Override
                        public final Object invoke(Object obj3, Object obj4) {
                            e60.a single = (e60.a) obj3;
                            a60.a it3 = (a60.a) obj4;
                            switch (c2) {
                                case 0:
                                    m.e(single, "$this$single");
                                    m.e(it3, "it");
                                    return (Application) context;
                                default:
                                    m.e(single, "$this$single");
                                    m.e(it3, "it");
                                    return context;
                            }
                        }
                    }, v50.c.A)));
                }
                return g00.b0.a;
            case 25:
                p40.v vVar2 = (p40.v) this.B;
                n40.a buildSerialDescriptor = (n40.a) obj;
                kotlin.jvm.internal.m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                List list = (List) vVar2.c;
                kotlin.jvm.internal.m.e(list, "<set-?>");
                buildSerialDescriptor.b = list;
                return g00.b0.a;
            case 26:
                q0 q0Var = (q0) this.B;
                int iIntValue2 = ((Integer) obj).intValue();
                return q0Var.e[iIntValue2] + ": " + q0Var.h(iIntValue2).a();
            case 27:
                p9.d dVar = (p9.d) this.B;
                Object obj3 = dVar.a.get(kotlin.jvm.internal.a0.a.b(obj.getClass()));
                kVar2 = obj3 instanceof p9.c ? (p9.c) obj3 : null;
                dVar.b.get(obj);
                if (kVar2 != null) {
                    return new p9.e(obj, ((p9.c) kVar2).b.invoke(obj), ((p9.c) kVar2).c, ((p9.c) kVar2).d);
                }
                throw new IllegalStateException(g4.c.h(obj, "Unknown screen "));
            case 28:
                ((y1.c) this.B).e(obj);
                return g00.b0.a;
            default:
                pl.j jVar = (pl.j) this.B;
                i2.c0 graphicsLayer = (i2.c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(jVar.a);
                float f8 = jVar.b;
                if (f8 > 0.5f) {
                    RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.CLAMP);
                    kotlin.jvm.internal.m.d(renderEffectCreateBlurEffect, "createBlurEffect(...)");
                    kVar2 = new i2.k(renderEffectCreateBlurEffect);
                }
                graphicsLayer.I(kVar2);
                return g00.b0.a;
        }
    }
}
