package b4;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import g2.a0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class u extends b2.q implements g2.s, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View O;
    public ViewTreeObserver P;
    public final t Q = new t(this, 0);
    public final t R = new t(this, 1);

    public final a0 B1() {
        boolean z10;
        if (!this.A.N) {
            y2.a.c("visitLocalDescendants called on an unattached node");
        }
        b2.q qVar = this.A;
        if ((qVar.D & 1024) != 0) {
            boolean z11 = false;
            for (b2.q qVar2 = qVar.F; qVar2 != null; qVar2 = qVar2.F) {
                if ((qVar2.C & 1024) != 0) {
                    b2.q qVarE = qVar2;
                    m1.e eVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof a0) {
                            a0 a0Var = (a0) qVarE;
                            if (z11) {
                                return a0Var;
                            }
                            z10 = false;
                            z11 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10 && (qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                            int i10 = 0;
                            for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                if ((qVar3.C & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarE = qVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (qVarE != null) {
                                            eVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        eVar.b(qVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVarE = b3.m.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean z10;
        boolean z11;
        if (b3.m.y(this).O == null) {
            return;
        }
        View viewC = l.c(this);
        g2.l focusOwner = ((c3.z) b3.m.z(this)).getFocusOwner();
        Owner ownerZ = b3.m.z(this);
        if (view != null && !view.equals(ownerZ)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z10 = false;
                    break;
                } else {
                    if (parent == viewC.getParent()) {
                        z10 = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (view2 != null && !view2.equals(ownerZ)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z11 = false;
                    break;
                } else {
                    if (parent2 == viewC.getParent()) {
                        z11 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (z10 && z11) {
            this.O = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.O = null;
                return;
            }
            this.O = null;
            if (B1().G1().a()) {
                ((g2.n) focusOwner).c(8, false, false);
                return;
            }
            return;
        }
        this.O = view2;
        a0 a0VarB1 = B1();
        int iOrdinal = a0VarB1.G1().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        g2.d.w(a0VarB1);
    }

    @Override
    public final void q0(g2.p pVar) {
        pVar.e(false);
        pVar.b(this.Q);
        pVar.d(this.R);
    }

    @Override
    public final void t1() {
        ViewTreeObserver viewTreeObserver = b3.m.A(this).getViewTreeObserver();
        this.P = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override
    public final void u1() {
        ViewTreeObserver viewTreeObserver = this.P;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.P = null;
        b3.m.A(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.O = null;
    }
}
