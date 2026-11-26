package d00;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.RenderEffect;
import android.view.WindowId;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public abstract class h0 {
    public static final RenderEffect a(RenderEffect renderEffect, RenderEffect renderEffect2, g0 blendMode, long j) {
        kotlin.jvm.internal.m.e(blendMode, "blendMode");
        if ((9223372034707292159L & j) != 9205357640488583168L && !h2.b.b(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
            kotlin.jvm.internal.m.d(renderEffect2, "createOffsetEffect(...)");
        }
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, h(blendMode));
        kotlin.jvm.internal.m.d(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public static final void b(b3.o0 o0Var) throws Exception {
        try {
            o0Var.a();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (!r30.k.A0(message, "mViewFlags", false) && !r30.k.A0(message, "LayoutNode", false)) {
                throw e;
            }
        }
    }

    public static final b2.r c(b2.r rVar, x0 x0Var, u00.k kVar) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        return rVar.V(new o0(x0Var, kVar));
    }

    public static final b2.r d(b2.r rVar, u00.k kVar) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        return rVar.V(new o0(null, kVar));
    }

    public static final long e(z2.a0 a0Var, u0 strategy) {
        kotlin.jvm.internal.m.e(a0Var, "<this>");
        kotlin.jvm.internal.m.e(strategy, "strategy");
        int iOrdinal = strategy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                try {
                    return a0Var.G(0L);
                } catch (Exception unused) {
                    return 9205357640488583168L;
                }
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a0Var.d0(0L);
    }

    public static final Context f(n0 n0Var) {
        return (Context) b3.m.h(n0Var, c3.o0.b);
    }

    public static final u0 g(u0 configured, List areas, WindowId windowId) {
        kotlin.jvm.internal.m.e(configured, "configured");
        kotlin.jvm.internal.m.e(areas, "areas");
        if (t0.a[configured.ordinal()] != 1) {
            return configured;
        }
        if (!areas.isEmpty()) {
            Iterator it = areas.iterator();
            while (it.hasNext()) {
                WindowId windowId2 = ((c) it.next()).d;
                if (windowId2 != null && !windowId2.equals(windowId)) {
                    return u0.B;
                }
            }
        }
        return u0.A;
    }

    public static final BlendMode h(g0 g0Var) {
        kotlin.jvm.internal.m.e(g0Var, "<this>");
        if (g0Var.equals(d.a)) {
            return BlendMode.CLEAR;
        }
        if (g0Var.equals(a0.a)) {
            return BlendMode.SRC;
        }
        if (g0Var.equals(j.a)) {
            return BlendMode.DST;
        }
        if (g0Var.equals(e0.a)) {
            return BlendMode.SRC_OVER;
        }
        if (g0Var.equals(n.a)) {
            return BlendMode.DST_OVER;
        }
        if (g0Var.equals(c0.a)) {
            return BlendMode.SRC_IN;
        }
        if (g0Var.equals(l.a)) {
            return BlendMode.DST_IN;
        }
        if (g0Var.equals(d0.a)) {
            return BlendMode.SRC_OUT;
        }
        if (g0Var.equals(m.a)) {
            return BlendMode.DST_OUT;
        }
        if (g0Var.equals(b0.a)) {
            return BlendMode.SRC_ATOP;
        }
        if (g0Var.equals(k.a)) {
            return BlendMode.DST_ATOP;
        }
        if (g0Var.equals(f0.a)) {
            return BlendMode.XOR;
        }
        if (g0Var.equals(w.a)) {
            return BlendMode.PLUS;
        }
        if (g0Var.equals(t.a)) {
            return BlendMode.MODULATE;
        }
        if (g0Var.equals(y.a)) {
            return BlendMode.SCREEN;
        }
        if (g0Var.equals(v.a)) {
            return BlendMode.OVERLAY;
        }
        if (g0Var.equals(h.a)) {
            return BlendMode.DARKEN;
        }
        if (g0Var.equals(r.a)) {
            return BlendMode.LIGHTEN;
        }
        if (g0Var.equals(g.a)) {
            return BlendMode.COLOR_DODGE;
        }
        if (g0Var.equals(f.a)) {
            return BlendMode.COLOR_BURN;
        }
        if (g0Var.equals(p.a)) {
            return BlendMode.HARD_LIGHT;
        }
        if (g0Var.equals(z.a)) {
            return BlendMode.SOFT_LIGHT;
        }
        if (g0Var.equals(i.a)) {
            return BlendMode.DIFFERENCE;
        }
        if (g0Var.equals(o.a)) {
            return BlendMode.EXCLUSION;
        }
        if (g0Var.equals(u.a)) {
            return BlendMode.MULTIPLY;
        }
        if (g0Var.equals(q.a)) {
            return BlendMode.HUE;
        }
        if (g0Var.equals(x.a)) {
            return BlendMode.SATURATION;
        }
        if (g0Var.equals(e.a)) {
            return BlendMode.COLOR;
        }
        if (g0Var.equals(s.a)) {
            return BlendMode.LUMINOSITY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
