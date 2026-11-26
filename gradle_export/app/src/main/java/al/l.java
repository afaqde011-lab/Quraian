package al;

import a1.v2;
import a40.u1;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.w;
import androidx.media3.common.f1;
import androidx.media3.ui.PlayerView;
import as.r0;
import az.o;
import b3.o0;
import bt.j2;
import c00.t;
import c40.s;
import ca.v;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d.a0;
import d.e0;
import d.f0;
import d.y;
import d0.n3;
import d0.q0;
import d0.q1;
import d0.s0;
import d0.s2;
import d0.u;
import d0.u2;
import g00.b0;
import g1.a7;
import g1.b3;
import g1.d6;
import g1.k8;
import g1.m6;
import g1.t4;
import g1.u6;
import g1.w6;
import g1.z7;
import g2.x;
import h0.h1;
import h0.j1;
import h0.m2;
import h1.k0;
import h1.l0;
import h1.m0;
import h1.v0;
import i2.c0;
import i2.t0;
import java.util.List;
import java.util.Locale;
import k1.d0;
import l1.e1;
import l1.p2;
import l1.z;
import l1.z0;
import qr.r;
import x.m1;
import z2.k1;
import z2.l1;

public final class l implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public l(w6 w6Var, m1 m1Var, z0 z0Var) {
        this.A = 28;
        this.C = m1Var;
        this.B = z0Var;
    }

    public l(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        int i2 = 5;
        int i3 = 2;
        char c = 1;
        b0 b0Var = b0.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                h hVar = (h) obj3;
                p2 p2Var = (p2) obj2;
                z DisposableEffect = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                hVar.getClass();
                kotlin.jvm.internal.m.e(p2Var, "<set-?>");
                hVar.b.setValue(p2Var);
                return new g(hVar, 1);
            case 1:
                ((b40.c) obj3).C.removeCallbacks((ab.f) obj2);
                return b0Var;
            case 2:
                j0.h LazyRow = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                n00.b bVar = r.C;
                LazyRow.r(bVar.a(), (u00.k) null, new r0(1, bVar), new v1.c(new o(bVar, (r) obj3, (u00.k) obj2, c == true ? 1 : 0), 802480018, true));
                return b0Var;
            case 3:
                w wVar = (w) obj3;
                z DisposableEffect2 = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                androidx.lifecycle.l lVar = new androidx.lifecycle.l((j2) obj2, 1);
                wVar.getLifecycle().a(lVar);
                return new bt.z0(wVar, lVar, 0);
            case 4:
                t tVar = (t) obj3;
                u00.k kVar = (u00.k) obj2;
                k0.i LazyVerticalGrid = (k0.i) obj;
                kotlin.jvm.internal.m.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                k0.i.p(LazyVerticalGrid, "no_sound", (u00.k) null, new v1.c(new c0.f(tVar, kVar, 1), -1849088400, true), 6);
                u30.b bVar2 = tVar.c;
                LazyVerticalGrid.q(((h00.b) bVar2).a(), new v2(new bw.b(i2), bVar2, 8), new r0(2, bVar2), new v1.c(new o(bVar2, tVar, kVar, i3), -1117249557, true));
                return b0Var;
            case 5:
                w wVar2 = (w) obj3;
                z DisposableEffect3 = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect3, "$this$DisposableEffect");
                androidx.lifecycle.l lVar2 = new androidx.lifecycle.l((ct.b) obj2, 2);
                wVar2.getLifecycle().a(lVar2);
                return new bt.z0(wVar2, lVar2, 1);
            case 6:
                ((m1.e) ((me.i) obj3).B).j((d0.f) obj2);
                return b0Var;
            case 7:
                h1.k kVar2 = (h1.k) obj3;
                s0 s0Var = (s0) obj2;
                long j = ((u) obj).a;
                long jG = s0Var.o0 ? h2.b.g(-1.0f, j) : h2.b.g(1.0f, j);
                q1 q1Var = s0Var.k0;
                q0 q0Var = d0.r0.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (q1Var == q1.A ? jG & 4294967295L : jG >> 32));
                fc.n nVar = kVar2.a;
                h1.j.a((h1.j) nVar.n, nVar.j(fIntBitsToFloat));
                return b0Var;
            case 8:
                s2 s2Var = (s2) obj3;
                u2 u2Var = (u2) obj2;
                u uVar = (u) obj;
                float f = uVar.b ? -1.0f : 1.0f;
                long j2 = uVar.a;
                s2Var.a(1, h2.b.g(f, u2Var.d == q1.B ? h2.b.a(0.0f, 1, j2) : h2.b.a(0.0f, 2, j2)));
                return b0Var;
            case 9:
                n3 n3Var = (n3) obj3;
                ((Long) obj).longValue();
                float f2 = n3Var.e;
                n3Var.e = 0.0f;
                ((u00.k) obj2).invoke(Float.valueOf(f2));
                return b0Var;
            case 10:
                ((u1) obj3).i(null);
                ((s) ((c40.t) obj2)).j((db.c) obj);
                return b0Var;
            case 11:
                f.b bVar3 = (f.b) obj3;
                e.f fVar = (e.f) obj2;
                s9.c cVar = bVar3.a;
                if (cVar != null) {
                    s9.c.a(cVar, fVar.b);
                } else {
                    e0 e0Var = bVar3.b;
                    if (e0Var == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    f0 onBackPressedCallback = fVar.a;
                    kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
                    y yVar = new y(onBackPressedCallback, new a0((w) null, onBackPressedCallback));
                    ((d.z) onBackPressedCallback).a.add(yVar);
                    s9.c.a(e0Var.b().c, yVar);
                }
                return new bt.z0(bVar3, fVar, 2);
            case 12:
                u00.a aVar = (u00.a) obj2;
                t0.g gVar = (t0.g) obj;
                ((u00.a) obj3).invoke();
                if (aVar != null ? ((Boolean) aVar.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                return b0Var;
            case 13:
                j3.y.e((j3.a0) obj, ((String) obj3) + ", " + ((String) obj2));
                return b0Var;
            case 14:
                d6 d6Var = (d6) obj3;
                Locale locale = (Locale) obj2;
                List list = (List) obj;
                Long l = (Long) list.get(0);
                Long l2 = (Long) list.get(1);
                Object obj4 = list.get(2);
                kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = list.get(3);
                kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type kotlin.Int");
                z00.e eVar = new z00.e(iIntValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list.get(4);
                kotlin.jvm.internal.m.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                return new b3(l, l2, eVar, ((Integer) obj6).intValue(), d6Var, locale);
            case 15:
                x.b bVar4 = (x.b) obj2;
                c0 c0Var = (c0) obj;
                float fH = ((e1) ((m6) obj3).d.j).h();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0Var.b() & 4294967295L));
                if (!Float.isNaN(fH) && !Float.isNaN(fIntBitsToFloat2) && fIntBitsToFloat2 != 0.0f) {
                    float fFloatValue = ((Number) bVar4.d()).floatValue();
                    c0Var.I0(t4.d(c0Var, fFloatValue));
                    c0Var.N(t4.e(c0Var, fFloatValue));
                    c0Var.S0(i2.b0.h(0.5f, (fH + fIntBitsToFloat2) / fIntBitsToFloat2));
                }
                return b0Var;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                j3.a0 a0Var = (j3.a0) obj;
                j3.y.p(a0Var, 1.0f);
                j3.y.e(a0Var, (String) obj3);
                a0Var.a(j3.n.b, new j3.a((String) null, new es.b(2, (u00.a) obj2)));
                return b0Var;
            case 17:
                g1.h hVar2 = (g1.h) obj3;
                a7 a7Var = (a7) obj2;
                o0 o0Var = (o0) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(o0Var.A0(y3.g.a(z7.v(hVar2))))) << 32) | (((long) Float.floatToRawIntBits(o0Var.A0(y3.g.b(z7.v(hVar2))))) & 4294967295L);
                float fA0 = o0Var.A0(d0.g) / 2.0f;
                float fI = hVar2.i();
                k2.b bVar5 = o0Var.A;
                float fR0 = (fA0 * bVar5.R0(fI)) / bVar5.R0(d0.b);
                long j3 = a7Var.b;
                k2.d.M(o0Var, i2.t.b, fR0, jFloatToRawIntBits, 0, 56);
                o0Var.a();
                k2.d.M(o0Var, j3, fR0, jFloatToRawIntBits, 11, 56);
                o0Var.P(j3, v.x(bVar5.b()), h2.b.e(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fR0 * ((float) Math.cos(((Number) hVar2.f.d()).floatValue())))) << 32) | (((long) Float.floatToRawIntBits(((float) Math.sin(((Number) hVar2.f.d()).floatValue())) * fR0)) & 4294967295L)), o0Var.A0(d0.h), 3);
                k2.d.M(o0Var, j3, o0Var.A0(d0.e) / 2, v.x(bVar5.b()), 0, 120);
                k2.d.M(o0Var, a7Var.e, fR0, jFloatToRawIntBits, 4, 56);
                return b0Var;
            case 18:
                gj.i iVar = (gj.i) obj3;
                String str = (String) obj2;
                t5.b bVar6 = (t5.b) obj;
                iVar.getClass();
                bVar6.e(gj.i.d, str);
                iVar.d(bVar6, str);
                return null;
            case 19:
                w wVar3 = (w) obj3;
                z DisposableEffect4 = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect4, "$this$DisposableEffect");
                androidx.lifecycle.l lVar3 = new androidx.lifecycle.l((b00.c) obj2, 3);
                wVar3.getLifecycle().a(lVar3);
                return new bt.z0(wVar3, lVar3, 3);
            case 20:
                p2 p2Var2 = (p2) obj2;
                PlayerView playerView = (PlayerView) obj;
                kotlin.jvm.internal.m.e(playerView, "playerView");
                f1 f1Var = ((b00.c) obj3).f;
                if (playerView.getPlayer() != f1Var) {
                    playerView.setPlayer(f1Var);
                }
                playerView.setRenderEffect(((Number) p2Var2.getValue()).floatValue() > 0.0f ? RenderEffect.createBlurEffect(((Number) p2Var2.getValue()).floatValue(), ((Number) p2Var2.getValue()).floatValue(), Shader.TileMode.CLAMP) : null);
                return b0Var;
            case 21:
                w wVar4 = (w) obj3;
                z DisposableEffect5 = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect5, "$this$DisposableEffect");
                androidx.lifecycle.l lVar4 = new androidx.lifecycle.l((gz.m1) obj2, 4);
                wVar4.getLifecycle().a(lVar4);
                return new bt.z0(wVar4, lVar4, 4);
            case 22:
                h1 h1Var = (h1) obj3;
                l1 l1Var = (l1) obj2;
                k1 k1Var = (k1) obj;
                if (h1Var.Q) {
                    k1.k(k1Var, l1Var, k1Var.R0(h1Var.O), k1Var.R0(h1Var.P));
                } else {
                    k1Var.h(l1Var, k1Var.R0(h1Var.O), k1Var.R0(h1Var.P), 0.0f);
                }
                return b0Var;
            case 23:
                j1 j1Var = (j1) obj3;
                l1 l1Var2 = (l1) obj2;
                k1 k1Var2 = (k1) obj;
                long j4 = ((y3.j) j1Var.O.invoke(k1Var2)).a;
                if (j1Var.P) {
                    k1.o(k1Var2, l1Var2, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                } else {
                    k1.s(k1Var2, l1Var2, (int) (j4 >> 32), (int) (j4 & 4294967295L), (u00.k) null, 12);
                }
                return b0Var;
            case 24:
                h0.m1 m1Var = (h0.m1) obj3;
                l1 l1Var3 = (l1) obj2;
                k1 k1Var3 = (k1) obj;
                if (m1Var.S) {
                    k1.k(k1Var3, l1Var3, k1Var3.R0(m1Var.O), k1Var3.R0(m1Var.P));
                } else {
                    k1Var3.h(l1Var3, k1Var3.R0(m1Var.O), k1Var3.R0(m1Var.P), 0.0f);
                }
                return b0Var;
            case 25:
                m2 m2Var = (m2) obj3;
                View view = (View) obj2;
                m2Var.a(view);
                return new bt.z0(m2Var, view, 5);
            case 26:
                AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = (m0) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((androidx.lifecycle.o) obj) == androidx.lifecycle.o.ON_RESUME) {
                    accessibilityStateChangeListener.getClass();
                    ((m0) accessibilityStateChangeListener).C.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
                    l0 l0Var = ((m0) accessibilityStateChangeListener).D;
                    if (l0Var != null) {
                        l0Var.A.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(l0Var);
                    }
                    k0 k0Var = ((m0) accessibilityStateChangeListener).E;
                    if (k0Var != null) {
                        k0Var.a.setValue(Boolean.valueOf(m0.a(accessibilityManager)));
                        k0Var.b.setValue(Boolean.valueOf(m0.c(accessibilityManager)));
                        accessibilityManager.addAccessibilityServicesStateChangeListener(k0Var);
                    }
                }
                return b0Var;
            case 27:
                a40.c0.y((a40.z) obj3, null, null, new g6.a((x) obj, (k8) obj2, (k00.c) null, 4), 3);
                return b0Var;
            case 28:
                z0 z0Var = (z0) obj3;
                h2.e eVar2 = (h2.e) obj;
                float fFloatValue2 = ((Number) ((p2) obj2).getValue()).floatValue();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (eVar2.a >> 32)) * fFloatValue2;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (eVar2.a & 4294967295L)) * fFloatValue2;
                if (Float.intBitsToFloat((int) (((h2.e) z0Var.getValue()).a >> 32)) != fIntBitsToFloat3 || Float.intBitsToFloat((int) (((h2.e) z0Var.getValue()).a & 4294967295L)) != fIntBitsToFloat4) {
                    z0Var.setValue(new h2.e((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L)));
                }
                return b0Var;
            default:
                f2.d dVar = (f2.d) obj;
                return dVar.a(new b3.a(new v0(((t0) obj3).a(dVar.A.b(), dVar.A.getLayoutDirection(), dVar), (u6) obj2, 0), 14));
        }
    }
}
