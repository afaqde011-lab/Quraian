package c3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public final class n extends b2.q implements g3.a, b3.j2, t2.e, b3.y, b3.o2, b3.k {
    public final b3.a O = new b3.a(this, 5);
    public final z P;

    public n(z zVar) {
        this.P = zVar;
    }

    @Override
    public final boolean O(KeyEvent keyEvent) {
        g2.f fVar;
        int[] iArr = g2.h.f6064a;
        long jB = t2.d.b(keyEvent);
        boolean z10 = true;
        if (t2.a.a(jB, t2.a.f14328b)) {
            fVar = new g2.f(2);
        } else if (t2.a.a(jB, t2.a.f14329c)) {
            fVar = new g2.f(1);
        } else if (t2.a.a(jB, t2.a.f14340p)) {
            fVar = new g2.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (t2.a.a(jB, t2.a.f14333g)) {
            fVar = new g2.f(4);
        } else if (t2.a.a(jB, t2.a.f14332f)) {
            fVar = new g2.f(3);
        } else if (t2.a.a(jB, t2.a.f14330d) || t2.a.a(jB, t2.a.C)) {
            fVar = new g2.f(5);
        } else if (t2.a.a(jB, t2.a.f14331e) || t2.a.a(jB, t2.a.D)) {
            fVar = new g2.f(6);
        } else if (t2.a.a(jB, t2.a.f14334h) || t2.a.a(jB, t2.a.f14342r) || t2.a.a(jB, t2.a.E)) {
            fVar = new g2.f(7);
        } else {
            fVar = (t2.a.a(jB, t2.a.f14327a) || t2.a.a(jB, t2.a.f14345u)) ? new g2.f(8) : null;
        }
        if (fVar != null) {
            int i10 = fVar.f6063a;
            if (t2.d.c(keyEvent) == 2) {
                z zVar = this.P;
                g2.a0 a0VarG = ((g2.n) zVar.getFocusOwner()).g();
                if (a0VarG == null || !a0VarG.O || !zVar.v(i10)) {
                    Boolean boolF = ((g2.n) zVar.getFocusOwner()).f(i10, zVar.getEmbeddedViewFocusRect(), new b3.a(fVar, 4));
                    if (!(boolF != null ? boolF.booleanValue() : true)) {
                        if (i10 != 1 && i10 != 2) {
                            z10 = false;
                        }
                        if (z10) {
                            Integer numC = g2.h.c(i10);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = zVar.getRootView();
                            kotlin.jvm.internal.m.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, zVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(zVar)) {
                                return ((g2.n) zVar.getFocusOwner()).i(i10);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(j9);
        return y0Var.J(l1VarO.A, l1VarO.B, h00.y.A, this.O, new m(l1VarO, 0));
    }

    @Override
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
    }

    @Override
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override
    public final Object x0(b3.p1 p1Var, b3.k0 k0Var, m00.c cVar) {
        long jD0 = p1Var.d0(0L);
        h2.c cVar2 = (h2.c) k0Var.invoke();
        h2.c cVarJ = cVar2 != null ? cVar2.j(jD0) : null;
        if (cVarJ != null) {
            this.P.requestRectangleOnScreen(new Rect((int) cVarJ.f6546a, (int) cVarJ.f6547b, (int) cVarJ.f6548c, (int) cVarJ.f6549d), false);
        }
        return g00.b0.a;
    }
}
