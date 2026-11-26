package b1;

import a1.o1;
import a1.v2;
import a1.w1;
import a1.w2;
import a1.x0;
import a40.e1;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Trace;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import b3.o0;
import bv.y2;
import com.google.android.gms.internal.measurement.b5;
import com.google.protobuf.RuntimeVersion;
import d0.n3;
import d0.q1;
import d0.q2;
import d0.s2;
import d0.u2;
import d00.r0;
import e1.v0;
import g1.k8;
import g1.m6;
import g1.n5;
import gz.a1;
import gz.f1;
import gz.g1;
import gz.m1;
import h0.n1;
import i2.l0;
import i2.p0;
import i2.s0;
import i2.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;
import l1.z0;
import m3.n0;
import m3.q0;
import q0.e2;
import q0.j1;
import q0.p1;
import q0.y0;
import z2.k1;
import z2.l1;

public final class l implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public l(e0 e0Var, a40.z zVar, Context context) {
        this.A = 2;
        this.B = e0Var;
        this.C = zVar;
        this.D = context;
    }

    public l(d0.i iVar, n3 n3Var, e1 e1Var, s2 s2Var) {
        this.A = 3;
        this.C = iVar;
        this.D = e1Var;
        this.B = s2Var;
    }

    public l(Object obj, e0 e0Var, Object obj2, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = e0Var;
        this.D = obj2;
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.B = obj3;
    }

    public l(kotlin.jvm.internal.w wVar, q2 q2Var, kotlin.jvm.internal.w wVar2, d0.l lVar) {
        this.A = 4;
        this.C = wVar;
        this.D = q2Var;
        this.B = wVar2;
    }

    public l(l6.y yVar, l6.x xVar, d6.r rVar, l6.f fVar) {
        this.A = 20;
        this.C = yVar;
        this.D = xVar;
        this.B = fVar;
    }

    private final Object a(Object obj) throws Throwable {
        j1 j1Var = (j1) this.C;
        r3.w wVar = (r3.w) this.D;
        r3.p pVar = (r3.p) this.B;
        k2.d dVar = (k2.d) obj;
        e2 e2VarD = j1Var.d();
        if (e2VarD != null) {
            i2.s sVarN = dVar.G0().n();
            long j9 = ((q0) j1Var.A.getValue()).f10520a;
            long j10 = ((q0) j1Var.B.getValue()).f10520a;
            n0 n0Var = e2VarD.f12608a;
            i2.e eVar = j1Var.f12660y;
            long j11 = j1Var.f12661z;
            if (!q0.d(j9)) {
                eVar.e(j11);
                int iZ = pVar.z(q0.g(j9));
                int iZ2 = pVar.z(q0.f(j9));
                if (iZ != iZ2) {
                    sVarN.b(n0Var.j(iZ, iZ2), eVar);
                }
            } else if (!q0.d(j10)) {
                long jC = n0Var.f10496a.f10484b.c();
                i2.t tVar = new i2.t(jC);
                if (jC == 16) {
                    tVar = null;
                }
                long j12 = tVar != null ? tVar.f7169a : i2.t.f7162b;
                eVar.e(i2.t.b(i2.t.d(j12) * 0.2f, j12));
                int iZ3 = pVar.z(q0.g(j10));
                int iZ4 = pVar.z(q0.f(j10));
                if (iZ3 != iZ4) {
                    sVarN.b(n0Var.j(iZ3, iZ4), eVar);
                }
            } else if (!q0.d(wVar.f13100b)) {
                eVar.e(j11);
                long j13 = wVar.f13100b;
                int iZ5 = pVar.z(q0.g(j13));
                int iZ6 = pVar.z(q0.f(j13));
                if (iZ5 != iZ6) {
                    sVarN.b(n0Var.j(iZ5, iZ6), eVar);
                }
            }
            m3.h0.h(sVarN, n0Var);
        }
        return g00.b0.a;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        boolean z10;
        Object obj2;
        Long l;
        m3.f fVar;
        int i10 = this.A;
        Object obj3 = t0.e.f14317a;
        int i11 = 6;
        int i12 = 4;
        int i13 = 5;
        k00.c cVar = null;
        int i14 = 3;
        final int i15 = 0;
        g00.b0 b0Var = g00.b0.a;
        Object obj4 = this.B;
        Object obj5 = this.D;
        Object obj6 = this.C;
        final int i16 = 1;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj6;
                e0 e0Var = (e0) obj4;
                yVar.A = e1.g0.a(e0Var.k().b());
                ((kotlin.jvm.internal.y) obj5).A = 0L;
                e0Var.v(true);
                z2.a0 a0VarQ = e0Var.q();
                e0Var.f1952o.setValue(new h2.b(a0VarQ != null ? a0VarQ.e(0L) : 9205357640488583168L));
                e0Var.A(y0.A, yVar.A);
                return b0Var;
            case 1:
                e0 e0Var2 = (e0) obj4;
                w1 w1Var = (w1) obj5;
                h2.b bVar = (h2.b) obj;
                ((o1) obj6).invoke();
                boolean z11 = e0Var2.f1949j;
                a1.s2 s2Var = e0Var2.f1941b;
                if (z11 && e0Var2.f1943d) {
                    w1Var.invoke();
                    if (e0Var2.f1940a.d().C.length() > 0) {
                        e0Var2.w(true);
                    }
                    e0Var2.x(k0.A);
                    e0Var2.u(x0.o(s2Var, s2Var.a(bVar.f6544a)));
                }
                return b0Var;
            case 2:
                e0 e0Var3 = (e0) obj4;
                final a40.z zVar = (a40.z) obj6;
                Context context = (Context) obj5;
                s0.a aVar = (s0.a) obj;
                aVar.a();
                u.d0 d0Var = aVar.f13618a;
                p1[] p1VarArr = p1.B;
                boolean z12 = (q0.d(e0Var3.f1940a.d().D) || !e0Var3.m() || e0Var3.f1944e) ? false : true;
                k00.c cVar2 = null;
                final i0 i0Var = new i0(e0Var3, cVar2, i15);
                u00.a aVar2 = new u00.a(zVar, i0Var, i15) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i15;
                        this.C = (m00.i) i0Var;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                k0 k0Var = k0.A;
                Resources resources = context.getResources();
                az.k kVar = new az.k(aVar2, (Object) null, e0Var3, k0Var, 1);
                if (z12) {
                    d0Var.a(new t0.d(obj3, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, kVar));
                }
                p1[] p1VarArr2 = p1.B;
                boolean z13 = (q0.d(e0Var3.f1940a.d().D) || e0Var3.f1944e) ? false : true;
                final i0 i0Var2 = new i0(e0Var3, cVar2, i16);
                u00.a aVar3 = new u00.a(zVar, i0Var2, i15) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i15;
                        this.C = (m00.i) i0Var2;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                Resources resources2 = context.getResources();
                az.k kVar2 = new az.k(aVar3, (Object) null, e0Var3, k0Var, 1);
                if (z13) {
                    d0Var.a(new t0.d(t0.e.f14318b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, kVar2));
                }
                p1[] p1VarArr3 = p1.B;
                if (!e0Var3.m()) {
                    z10 = false;
                } else if (e0Var3.f1963z.B) {
                    z10 = true;
                } else {
                    u00.a aVar4 = e0Var3.f1951n;
                    if (aVar4 != null && aVar4.invoke() != null) {
                        throw new ClassCastException();
                    }
                    z10 = false;
                }
                final i0 i0Var3 = new i0(e0Var3, cVar2, 2);
                u00.a aVar5 = new u00.a(zVar, i0Var3, i15) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i15;
                        this.C = (m00.i) i0Var3;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                Resources resources3 = context.getResources();
                az.k kVar3 = new az.k(aVar5, (Object) null, e0Var3, k0Var, 1);
                if (z10) {
                    d0Var.a(new t0.d(t0.e.f14319c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, kVar3));
                }
                p1[] p1VarArr4 = p1.B;
                w2 w2Var = e0Var3.f1940a;
                boolean z14 = q0.e(w2Var.d().D) != w2Var.d().C.length();
                k0 k0Var2 = k0.C;
                j jVar = new j(e0Var3, i12);
                j jVar2 = new j(e0Var3, i13);
                Resources resources4 = context.getResources();
                az.k kVar4 = new az.k(jVar2, jVar, e0Var3, k0Var2, 1);
                if (z14) {
                    d0Var.a(new t0.d(t0.e.f14320d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, kVar4));
                }
                p1[] p1VarArr5 = p1.B;
                boolean z15 = e0Var3.m() && q0.d(e0Var3.f1940a.d().D);
                j jVar3 = new j(e0Var3, i11);
                Resources resources5 = context.getResources();
                az.k kVar5 = new az.k(jVar3, (Object) null, e0Var3, k0Var, 1);
                if (z15) {
                    d0Var.a(new t0.d(t0.e.f14321e, resources5.getString(R.string.autofill), 0, kVar5));
                }
                aVar.a();
                return b0Var;
            case 3:
                d0.i iVar = (d0.i) obj6;
                e1 e1Var = (e1) obj5;
                s2 s2Var2 = (s2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float f3 = iVar.Q ? 1.0f : -1.0f;
                u2 u2Var = iVar.P;
                long jE = u2Var.e(u2Var.h(f3 * fFloatValue));
                u2 u2Var2 = s2Var2.f4508a;
                float fG = u2Var.g(u2Var.e(u2Var2.c(u2Var2.f4522k, jE, 1))) * f3;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    e1Var.i(a40.c0.a("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', (Throwable) null));
                }
                return b0Var;
            case 4:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj6;
                x.h hVar = (x.h) obj;
                float fFloatValue2 = ((Number) hVar.f16286e.getValue()).floatValue() - wVar.A;
                float fA = ((q2) obj5).a(fFloatValue2);
                wVar.A = ((Number) hVar.f16286e.getValue()).floatValue();
                ((kotlin.jvm.internal.w) obj4).A = ((Number) hVar.f16282a.f16364b.invoke(hVar.f16287f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    hVar.a();
                }
                return b0Var;
            case 5:
                b2.r rVar = (b2.r) obj6;
                dz.n nVar = (dz.n) obj5;
                u00.k kVar6 = (u00.k) obj4;
                j0.h hVar2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar2, "$this$LazyColumn");
                j0.h.q(hVar2, null, new v1.c(new cz.h(rVar, 2), 1472549298, true), 3);
                j0.h.q(hVar2, null, new v1.c(new cz.h(rVar, 3), 1603780251, true), 3);
                j0.h.q(hVar2, null, new v1.c(new dz.i(nVar, kVar6, rVar, 1), -53328006, true), 3);
                j0.h.q(hVar2, null, dz.a.b, 3);
                j0.h.q(hVar2, null, new v1.c(new cz.h(rVar, 4), 927422776, true), 3);
                j0.h.q(hVar2, null, new v1.c(new dz.i(nVar, kVar6, rVar, 2), -729685481, true), 3);
                j0.h.q(hVar2, null, dz.a.c, 3);
                j0.h.q(hVar2, null, new v1.c(new cz.h(rVar, 5), 251065301, true), 3);
                j0.h.q(hVar2, null, new v1.c(new dz.i(nVar, kVar6, rVar, 0), -1406042956, true), 3);
                j0.h.q(hVar2, null, dz.a.d, 3);
                j0.h.q(hVar2, null, new v1.c(new dz.j(0, rVar, kVar6), 309211929, true), 3);
                return b0Var;
            case 6:
                l2.b bVar2 = (l2.b) obj5;
                r0 r0Var = (r0) obj4;
                k2.d dVar = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar, "$this$drawScaledContent");
                e00.d dVar2 = ((e00.o) obj6).a;
                Object obj7 = e00.e.a;
                dVar2.o(r0Var.a.S);
                float fK = dVar2.k();
                if (Float.isNaN(fK)) {
                    fK = 0;
                }
                float f10 = fK;
                float fN = dVar2.n();
                List listL = dVar2.l();
                d00.n0 n0Var = r0Var.a;
                long j9 = n0Var.W;
                long j10 = n0Var.Y;
                int i17 = kotlin.jvm.internal.m.a(dVar2.k, (Object) null) ? 3 : 0;
                kotlin.jvm.internal.m.e(r0Var, "context");
                kh.o.n("HazeEffectNode-getOrCreateRenderEffect");
                try {
                    p0 p0VarA = e00.e.a(r0Var, new e00.p(f10, fN, 1.0f, j9, j10, listL, 1.0f, (i2.q) null, i17));
                    Trace.endSection();
                    bVar2.j(p0VarA);
                    bVar2.f(dVar2.j);
                    rd.a.x(dVar, bVar2);
                    return b0Var;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 7:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                v2.s sVar = (v2.s) obj;
                if (((e1.m) obj6).b(sVar.f15401c, (du.w) obj5)) {
                    sVar.a();
                    vVar.A = true;
                }
                return b0Var;
            case 8:
                final v0 v0Var = (v0) obj6;
                final a40.z zVar2 = (a40.z) obj5;
                Context context2 = (Context) obj4;
                s0.a aVar6 = (s0.a) obj;
                aVar6.a();
                u.d0 d0Var2 = aVar6.f13618a;
                p1[] p1VarArr6 = p1.B;
                boolean z16 = (q0.d(v0Var.n().f13100b) || !v0Var.j() || (v0Var.f5020f instanceof r3.q) || v0Var.f5022h == null) ? false : true;
                final e1.q0 q0Var = new e1.q0(v0Var, cVar, i16);
                u00.a aVar7 = new u00.a(zVar2, q0Var, i16) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i16;
                        this.C = (m00.i) q0Var;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                Resources resources6 = context2.getResources();
                al.l lVar = new al.l(aVar7, (Object) null, 12);
                if (z16) {
                    d0Var2.a(new t0.d(obj3, resources6.getString(R.string.cut), R.attr.actionModeCutDrawable, lVar));
                }
                p1[] p1VarArr7 = p1.B;
                boolean z17 = (q0.d(v0Var.n().f13100b) || (v0Var.f5020f instanceof r3.q) || v0Var.f5022h == null) ? false : true;
                final e1.q0 q0Var2 = new e1.q0(v0Var, cVar, 2);
                u00.a aVar8 = new u00.a(zVar2, q0Var2, i16) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i16;
                        this.C = (m00.i) q0Var2;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                Resources resources7 = context2.getResources();
                al.l lVar2 = new al.l(aVar8, (Object) null, 12);
                if (z17) {
                    d0Var2.a(new t0.d(t0.e.f14318b, resources7.getString(R.string.copy), R.attr.actionModeCopyDrawable, lVar2));
                }
                p1[] p1VarArr8 = p1.B;
                boolean z18 = v0Var.j() && ((Boolean) v0Var.f5036x.getValue()).booleanValue() && v0Var.f5022h != null;
                final e1.q0 q0Var3 = new e1.q0(v0Var, cVar, i14);
                u00.a aVar9 = new u00.a(zVar2, q0Var3, i16) {
                    public final int A;
                    public final a40.z B;
                    public final m00.i C;

                    {
                        this.A = i16;
                        this.C = (m00.i) q0Var3;
                    }

                    public final Object invoke() {
                        switch (this.A) {
                            case 0:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(0, null, this.C), 1);
                                break;
                            default:
                                a40.c0.y(this.B, (k00.i) null, a40.a0.D, new j0(1, null, this.C), 1);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                Resources resources8 = context2.getResources();
                al.l lVar3 = new al.l(aVar9, (Object) null, 12);
                if (z18) {
                    d0Var2.a(new t0.d(t0.e.f14319c, resources8.getString(R.string.paste), R.attr.actionModePasteDrawable, lVar3));
                }
                p1[] p1VarArr9 = p1.B;
                boolean z19 = q0.e(v0Var.n().f13100b) != v0Var.n().f13099a.B.length();
                u00.a aVar10 = new u00.a() {
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return Boolean.valueOf(!v0Var.B);
                            case 1:
                                v0 v0Var2 = v0Var;
                                r3.w wVarE = v0.e(v0Var2.n().f13099a, m3.h0.b(0, v0Var2.n().f13099a.B.length()));
                                v0Var2.f5017c.invoke(wVarE);
                                long j11 = wVarE.f13100b;
                                v0Var2.f5035w = new m3.q0(j11);
                                v0Var2.f5033u = r3.w.b(v0Var2.f5033u, null, j11, 5);
                                v0Var2.h(true);
                                return g00.b0.a;
                            default:
                                u00.a aVar11 = v0Var.f5021g;
                                if (aVar11 != null) {
                                    aVar11.invoke();
                                }
                                return g00.b0.a;
                        }
                    }
                };
                u00.a aVar11 = new u00.a() {
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return Boolean.valueOf(!v0Var.B);
                            case 1:
                                v0 v0Var2 = v0Var;
                                r3.w wVarE = v0.e(v0Var2.n().f13099a, m3.h0.b(0, v0Var2.n().f13099a.B.length()));
                                v0Var2.f5017c.invoke(wVarE);
                                long j11 = wVarE.f13100b;
                                v0Var2.f5035w = new m3.q0(j11);
                                v0Var2.f5033u = r3.w.b(v0Var2.f5033u, null, j11, 5);
                                v0Var2.h(true);
                                return g00.b0.a;
                            default:
                                u00.a aVar12 = v0Var.f5021g;
                                if (aVar12 != null) {
                                    aVar12.invoke();
                                }
                                return g00.b0.a;
                        }
                    }
                };
                Resources resources9 = context2.getResources();
                al.l lVar4 = new al.l(aVar11, aVar10, 12);
                if (z19) {
                    d0Var2.a(new t0.d(t0.e.f14320d, resources9.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, lVar4));
                }
                p1[] p1VarArr10 = p1.B;
                i16 = (v0Var.j() && q0.d(v0Var.n().f13100b)) ? 1 : 0;
                final int i18 = 2;
                u00.a aVar12 = new u00.a() {
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return Boolean.valueOf(!v0Var.B);
                            case 1:
                                v0 v0Var2 = v0Var;
                                r3.w wVarE = v0.e(v0Var2.n().f13099a, m3.h0.b(0, v0Var2.n().f13099a.B.length()));
                                v0Var2.f5017c.invoke(wVarE);
                                long j11 = wVarE.f13100b;
                                v0Var2.f5035w = new m3.q0(j11);
                                v0Var2.f5033u = r3.w.b(v0Var2.f5033u, null, j11, 5);
                                v0Var2.h(true);
                                return g00.b0.a;
                            default:
                                u00.a aVar13 = v0Var.f5021g;
                                if (aVar13 != null) {
                                    aVar13.invoke();
                                }
                                return g00.b0.a;
                        }
                    }
                };
                Resources resources10 = context2.getResources();
                al.l lVar5 = new al.l(aVar12, (Object) null, 12);
                if (i16 != 0) {
                    d0Var2.a(new t0.d(t0.e.f14321e, resources10.getString(R.string.autofill), 0, lVar5));
                }
                aVar6.a();
                return b0Var;
            case 9:
                f6.a aVar13 = (f6.a) obj;
                int i19 = ActionCallbackBroadcastReceiver.f869a;
                f6.j jVarT = f6.k.t();
                jVarT.c();
                f6.k.n((f6.k) jVarT.B, (String) obj6);
                int i20 = ((d6.h) obj5).f4631a;
                jVarT.c();
                f6.k.o((f6.k) jVarT.B, i20);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(((c6.f) obj4).f2891a);
                ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    arrayList.add(new g00.k(((c6.c) entry.getKey()).f2888a, entry.getValue()));
                }
                g00.k[] kVarArr = (g00.k[]) arrayList.toArray(new g00.k[0]);
                Bundle bundleN = f50.c.n(new g00.k[]{new g00.k("ActionCallbackBroadcastReceiver:parameters", f50.c.n((g00.k[]) Arrays.copyOf(kVarArr, kVarArr.length)))});
                Parcel parcelObtain = Parcel.obtain();
                bundleN.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                androidx.glance.appwidget.protobuf.h hVarC = androidx.glance.appwidget.protobuf.i.c(0, bArrMarshall.length, bArrMarshall);
                jVarT.c();
                f6.k.p((f6.k) jVarT.B, hVarC);
                f6.k kVar7 = (f6.k) jVarT.a();
                aVar13.c();
                f6.n.r((f6.n) aVar13.B, kVar7);
                return b0Var;
            case 10:
                final m6 m6Var = (m6) obj5;
                final u00.a aVar14 = (u00.a) obj4;
                a40.c0.y((a40.z) obj6, (k00.i) null, (a40.a0) null, new y2(m6Var, ((Float) obj).floatValue(), (k00.c) null, 1), 3).f0(new u00.k() {
                    public final Object invoke(Object obj8) {
                        switch (i16) {
                            case 0:
                                if (!m6Var.d()) {
                                    aVar14.invoke();
                                }
                                break;
                            default:
                                if (!m6Var.d()) {
                                    aVar14.invoke();
                                }
                                break;
                        }
                        return g00.b0.a;
                    }
                });
                return b0Var;
            case 11:
                n1 n1Var = (n1) obj5;
                b2.c cVar3 = (b2.c) obj4;
                o0 o0Var = (o0) obj;
                long j11 = ((h2.e) ((h1.y0) obj6).get()).f6558a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fA0 = o0Var.A0(n5.f5893a);
                    k2.b bVar3 = o0Var.A;
                    float fA1 = o0Var.A0(n1Var.b(o0Var.getLayoutDirection()));
                    float fA2 = cVar3.a(w00.a.F(fIntBitsToFloat), w00.a.F((Float.intBitsToFloat((int) (bVar3.b() >> 32)) - fA1) - o0Var.A0(n1Var.d(o0Var.getLayoutDirection()))), o0Var.getLayoutDirection()) + fA1;
                    float f11 = 2;
                    float f12 = fIntBitsToFloat / f11;
                    float f13 = fA2 + f12;
                    float f14 = (f13 - f12) - fA0;
                    float f15 = f14 < 0.0f ? 0.0f : f14;
                    float f16 = f13 + f12 + fA0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar3.b() >> 32));
                    float f17 = f16 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f16;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                    float f18 = (-fIntBitsToFloat3) / f11;
                    float f19 = fIntBitsToFloat3 / f11;
                    a1.i iVar2 = bVar3.B;
                    long jQ = iVar2.q();
                    iVar2.n().i();
                    try {
                        ((hf.c) iVar2.B).y(f15, f18, f17, f19, 0);
                        o0Var.a();
                    } finally {
                        w.c.t(iVar2, jQ);
                    }
                } else {
                    o0Var.a();
                }
                return b0Var;
            case 12:
                z0 z0Var = (z0) obj6;
                z0 z0Var2 = (z0) obj5;
                z0 z0Var3 = (z0) obj4;
                z2.a0 a0Var = (z2.a0) obj;
                z2.a0 a0VarH = a0Var.h();
                z0Var.setValue(new y3.j(a0VarH != null ? kh.n.I(a0VarH.p()) : 0L));
                z0Var2.setValue(z2.d0.f(a0Var));
                z0Var3.setValue(new h2.b(((h2.c) z0Var2.getValue()).c()));
                return b0Var;
            case 13:
                p2 p2Var = (p2) obj6;
                z0 z0Var4 = (z0) obj5;
                m1 m1Var = (m1) obj4;
                j0.h hVar3 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar3, "$this$LazyColumn");
                j0.h.q(hVar3, null, new v1.c(new eu.x(p2Var, 1), -538838587, true), 3);
                if (!((g1) z0Var4.getValue()).c) {
                    j0.h.q(hVar3, null, new v1.c(new c0.f(m1Var, p2Var, 7), 230974432, true), 3);
                }
                j0.h.q(hVar3, null, new v1.c(new az.j(m1Var, z0Var4, p2Var, 9), 2075019452, true), 3);
                n00.b bVar4 = ry.f.G;
                hVar3.r(bVar4.a(), null, new as.r0(5, bVar4), new v1.c(new f1(bVar4, m1Var, z0Var4, p2Var), 2039820996, true));
                j0.h.q(hVar3, null, new v1.c(new a1(z0Var4, 0), -1673555203, true), 3);
                return b0Var;
            case 14:
                ep.e eVar = (ep.e) obj;
                kotlin.jvm.internal.m.e(eVar, "it");
                ta.c0.M((a40.z) obj6, null, null, null, new ev.p((m6) obj5, (m1) obj4, eVar, (k00.c) null, 4), 31);
                return b0Var;
            case 15:
                androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) obj6;
                androidx.lifecycle.l lVar6 = new androidx.lifecycle.l((u00.k) obj5, i13);
                wVar2.getLifecycle().a(lVar6);
                return new gv.k((u00.a) obj4, wVar2, lVar6);
            case 16:
                o1 o1Var = new o1((a40.z) obj5, (k8) obj4, 15);
                a10.w[] wVarArr = j3.y.f8004a;
                ((j3.a0) obj).a(j3.n.f7942c, new j3.a((String) obj6, o1Var));
                return b0Var;
            case 17:
                h1.d0 d0Var3 = (h1.d0) obj5;
                l1 l1Var = (l1) obj4;
                k1 k1Var = (k1) obj;
                float fD = ((z2.y0) obj6).w0() ? d0Var3.O.g().d(((l1.w) d0Var3.O.f5633h).getValue()) : d0Var3.O.k();
                q1 q1Var = d0Var3.Q;
                float f20 = q1Var == q1.B ? fD : 0.0f;
                if (q1Var != q1.A) {
                    fD = 0.0f;
                }
                k1Var.A = true;
                k1Var.h(l1Var, w00.a.F(f20), w00.a.F(fD), 0.0f);
                k1Var.A = false;
                return b0Var;
            case TYPE_SINT64_VALUE:
                p2 p2Var2 = (p2) obj5;
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.I0(((Number) p2Var2.getValue()).floatValue());
                c0Var.N(((Number) p2Var2.getValue()).floatValue());
                c0Var.s0(((Number) ((p2) obj4).getValue()).floatValue());
                c0Var.S0(((w0) ((z0) obj6).getValue()).f7177a);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                j0.h hVar4 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar4, "$this$LazyColumn");
                List list = (List) ((p2) obj6).getValue();
                hVar4.r(list.size(), new v2(new ks.e(13), list, 21), new as.r0(12, list), new v1.c(new jv.j(list, (bv.o1) obj5, (u00.k) obj4, 1), 802480018, true));
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                l6.y yVar2 = (l6.y) obj6;
                l6.x xVar = (l6.x) obj5;
                l6.f fVar2 = (l6.f) obj4;
                if (s30.b.c(yVar2.a(), xVar.f10047b) < 0) {
                    long j12 = xVar.f10047b;
                    AtomicReference atomicReference = yVar2.B;
                    do {
                        obj2 = atomicReference.get();
                        l = (Long) obj2;
                        if (l == null) {
                            throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                        }
                        if (j12 <= 0) {
                            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
                        }
                    } while (!atomicReference.compareAndSet(obj2, Long.valueOf(s30.b.e(j12) + l.longValue())));
                }
                a40.c0.y(yVar2, (k00.i) null, (a40.a0) null, new l6.e(fVar2, cVar, i16), 3);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                l0 l0Var = (l0) obj6;
                i2.g gVar = (i2.g) obj5;
                mk.c cVar4 = (mk.c) obj4;
                k2.d dVar3 = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar3, "$this$record");
                ((hf.c) dVar3.G0().B).I(1.0f, 1.0f);
                try {
                    i2.s sVarN = dVar3.G0().n();
                    sVarN.i();
                    jk.d.a(sVarN, l0Var, gVar);
                    i2.b0.l(sVarN, l0Var, cVar4.R);
                    sVarN.q();
                    return b0Var;
                } finally {
                    float f21 = -1.0f;
                    ((hf.c) dVar3.G0().B).I(f21, f21);
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                lu.z zVar3 = (lu.z) obj6;
                u00.k kVar8 = (u00.k) obj5;
                ju.k kVar9 = (ju.k) obj4;
                j0.h hVar5 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar5, "$this$LazyColumn");
                j0.h.q(hVar5, null, mu.d.a, 3);
                if (zVar3.a) {
                    j0.h.q(hVar5, null, mu.d.b, 3);
                } else {
                    h00.b bVar5 = zVar3.e;
                    hVar5.r(bVar5.a(), null, new as.r0(14, bVar5), new v1.c(new az.o(bVar5, kVar8, kVar9, 4), 802480018, true));
                }
                return b0Var;
            case 23:
                String str = (String) obj6;
                q2.a aVar15 = (q2.a) obj5;
                u00.k kVar10 = (u00.k) obj4;
                r3.w wVar3 = (r3.w) obj;
                kotlin.jvm.internal.m.e(wVar3, "value");
                String str2 = wVar3.f13099a.B;
                StringBuilder sb2 = new StringBuilder();
                int length = str2.length();
                while (i15 < length) {
                    char cCharAt = str2.charAt(i15);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                    i15++;
                }
                String string = sb2.toString();
                if (string.length() <= 6 && !string.equals(str)) {
                    ((q2.c) aVar15).a(9);
                    kVar10.invoke(string);
                }
                return b0Var;
            case 24:
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                l1.y0 y0Var = (l1.y0) obj4;
                n0 n0Var2 = (n0) obj;
                kotlin.jvm.internal.m.e(n0Var2, "result");
                if (n0Var2.d()) {
                    l1.f1 f1Var = (l1.f1) y0Var;
                    if (f1Var.h() < 0) {
                        f1Var.i(ab.a0.y((n0Var2.f10497b.c(1, true) - str3.length()) - 3, 0, str4.length()));
                    } else if (f1Var.h() > 0) {
                        int iH = f1Var.h() - 2;
                        f1Var.i(iH >= 0 ? iH : 0);
                    }
                }
                return b0Var;
            case 25:
                z0 z0Var5 = (z0) obj6;
                z1.s sVar2 = (z1.s) obj5;
                z1.s sVar3 = (z1.s) obj4;
                z2.a0 a0Var2 = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var2, "coordinates");
                if (a0Var2.A()) {
                    z0Var5.setValue(z2.d0.i(a0Var2).F(a0Var2, true));
                    Iterator it = sVar2.B.iterator();
                    while (((z1.y) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((z1.y) it).next();
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        g00.k kVar11 = (g00.k) entry2.getValue();
                        b5.h(sVar3, z0Var5, iIntValue, (z2.a0) kVar11.A, ((Boolean) kVar11.B).booleanValue());
                    }
                }
                return b0Var;
            case RuntimeVersion.MINOR:
                h00.b bVar6 = (u30.b) obj6;
                j0.h hVar6 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar6, "$this$LazyColumn");
                hVar6.r(bVar6.a(), new v2(new m3.c0(23), bVar6, 27), new as.r0(17, bVar6), new v1.c(new az.o(bVar6, (u00.k) obj5, (u00.k) obj4, 5), 802480018, true));
                return b0Var;
            case 27:
                u00.k kVar12 = (u00.k) obj6;
                z0 z0Var6 = (z0) obj4;
                r3.w wVar4 = (r3.w) obj;
                ((z0) obj5).setValue(wVar4);
                boolean zA = kotlin.jvm.internal.m.a((String) z0Var6.getValue(), wVar4.f13099a.B);
                m3.h hVar7 = wVar4.f13099a;
                z0Var6.setValue(hVar7.B);
                if (!zA) {
                    kVar12.invoke(hVar7.B);
                }
                return b0Var;
            case 28:
                return a(obj);
            default:
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj6;
                m3.f fVar3 = (m3.f) obj5;
                m3.i0 i0Var4 = (m3.i0) obj4;
                m3.f fVar4 = (m3.f) obj;
                if (vVar2.A) {
                    Object obj8 = fVar4.f10423a;
                    int i21 = fVar4.f10425c;
                    int i22 = fVar4.f10424b;
                    if ((obj8 instanceof m3.i0) && i22 == fVar3.f10424b && i21 == fVar3.f10425c) {
                        if (i0Var4 == null) {
                            i0Var4 = new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65535);
                        }
                        fVar = new m3.f(i0Var4, i22, i21);
                    } else {
                        fVar = fVar4;
                    }
                } else {
                    fVar = fVar4;
                }
                vVar2.A = fVar3.equals(fVar4);
                return fVar;
        }
    }
}
