package b3;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class l extends b2.q {
    public final int O = q1.e(this);
    public b2.q P;

    @Override
    public final void A1(p1 p1Var) {
        this.H = p1Var;
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.A1(p1Var);
        }
    }

    public final k B1(k kVar) {
        b2.q qVar = ((b2.q) kVar).A;
        if (qVar != kVar) {
            b2.q qVar2 = kVar instanceof b2.q ? (b2.q) kVar : null;
            b2.q qVar3 = qVar2 != null ? qVar2.E : null;
            if (qVar != this.A || !kotlin.jvm.internal.m.a(qVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (qVar.N) {
                y2.a.c("Cannot delegate to an already attached node");
            }
            qVar.z1(this.A);
            int i10 = this.C;
            int iF = q1.f(qVar);
            qVar.C = iF;
            int i11 = this.C;
            int i12 = iF & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof y)) {
                y2.a.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar);
            }
            qVar.F = this.P;
            this.P = qVar;
            qVar.E = this;
            D1(iF | this.C, false);
            if (this.N) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    A1(this.H);
                } else {
                    a1.n nVar = m.y(this).f2059g0;
                    this.A.A1(null);
                    nVar.m();
                }
                qVar.r1();
                qVar.x1();
                if (!qVar.N) {
                    y2.a.c("autoInvalidateInsertedNode called on unattached node");
                }
                q1.a(qVar, -1, 1);
            }
        }
        return kVar;
    }

    public final void C1(k kVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b2.q qVar = null;
        for (b2.q qVar2 = this.P; qVar2 != null; qVar2 = qVar2.F) {
            if (qVar2 == kVar) {
                boolean z10 = qVar2.N;
                if (z10) {
                    u.c0 c0Var = q1.f2124a;
                    if (!z10) {
                        y2.a.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    q1.a(qVar2, -1, 2);
                    qVar2.y1();
                    qVar2.s1();
                }
                qVar2.z1(qVar2);
                qVar2.D = 0;
                if (qVar == null) {
                    this.P = qVar2.F;
                } else {
                    qVar.F = qVar2.F;
                }
                qVar2.F = null;
                qVar2.E = null;
                int i10 = this.C;
                int iF = q1.f(this);
                D1(iF, true);
                if (this.N && (i10 & 2) != 0 && (iF & 2) == 0) {
                    a1.n nVar = m.y(this).f2059g0;
                    this.A.A1(null);
                    nVar.m();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + kVar).toString());
    }

    public final void D1(int i10, boolean z10) {
        b2.q qVar;
        int i11 = this.C;
        this.C = i10;
        if (i11 != i10) {
            b2.q qVar2 = this.A;
            if (qVar2 == this) {
                this.D = i10;
            }
            boolean z11 = this.N;
            ?? r4 = this;
            if (z11) {
                while (r4 != 0) {
                    i10 |= r4.C;
                    r4.C = i10;
                    if (r4 == qVar2) {
                        break;
                    } else {
                        r4 = r4.E;
                    }
                }
                if (z10 && r4 == qVar2) {
                    i10 = q1.f(qVar2);
                    qVar2.C = i10;
                }
                int i12 = i10 | ((r4 == 0 || (qVar = r4.F) == null) ? 0 : qVar.D);
                for (?? r7 = r4; r7 != 0; r7 = r7.E) {
                    i12 |= r7.C;
                    r7.D = i12;
                }
            }
        }
    }

    @Override
    public final void r1() {
        super.r1();
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.A1(this.H);
            if (!qVar.N) {
                qVar.r1();
            }
        }
    }

    @Override
    public final void s1() {
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.s1();
        }
        super.s1();
    }

    @Override
    public final void w1() {
        super.w1();
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.w1();
        }
    }

    @Override
    public final void x1() {
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.x1();
        }
        super.x1();
    }

    @Override
    public final void y1() {
        super.y1();
        for (b2.q qVar = this.P; qVar != null; qVar = qVar.F) {
            qVar.y1();
        }
    }

    @Override
    public final void z1(b2.q qVar) {
        this.A = qVar;
        for (b2.q qVar2 = this.P; qVar2 != null; qVar2 = qVar2.F) {
            qVar2.z1(qVar);
        }
    }
}
