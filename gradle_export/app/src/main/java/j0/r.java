package j0;

import ab.a0;
import d0.n2;
import d0.y1;
import java.util.List;
import l1.e1;
import l1.f1;
import ri.t1;

public final class r implements y1 {

    public final int f7813a;

    public final y1 f7814b;

    public final n2 f7815c;

    public r(y1 y1Var, n2 n2Var, int i10) {
        this.f7813a = i10;
        this.f7815c = n2Var;
        this.f7814b = y1Var;
    }

    @Override
    public final float a(float f3) {
        switch (this.f7813a) {
            case 0:
                break;
        }
        return this.f7814b.a(f3);
    }

    public final int b(int i10) {
        Object obj;
        switch (this.f7813a) {
            case 0:
                n nVarH = ((v) this.f7815c).h();
                if (nVarH.f7781k.isEmpty()) {
                    return 0;
                }
                int iC = c();
                if (i10 > e() || iC > i10) {
                    return ((i10 - c()) * kh.o.T(nVarH)) - d();
                }
                ?? r10 = nVarH.f7781k;
                int size = r10.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        obj = r10.get(i11);
                        if (((o) obj).f7786a != i10) {
                            i11++;
                        }
                    } else {
                        obj = null;
                    }
                }
                o oVar = (o) obj;
                if (oVar != null) {
                    return oVar.f7798o;
                }
                return 0;
            default:
                m0.w wVar = (m0.w) this.f7815c;
                return (int) (a0.A(t1.t(wVar) + ((long) w00.a.F(((wVar.n() * (i10 - ((f1) wVar.f10388d.B).h())) - (((e1) wVar.f10388d.D).h() * wVar.n())) + 0)), wVar.f10392h, wVar.f10391g) - t1.t(wVar));
        }
    }

    public final int c() {
        switch (this.f7813a) {
            case 0:
                return ((v) this.f7815c).f7821e.f7808b.h();
            default:
                return ((m0.w) this.f7815c).f10389e;
        }
    }

    public final int d() {
        switch (this.f7813a) {
            case 0:
                return ((v) this.f7815c).f7821e.f7809c.h();
            default:
                return ((m0.w) this.f7815c).f10390f;
        }
    }

    public final int e() {
        switch (this.f7813a) {
            case 0:
                o oVar = (o) h00.q.U0((List) ((v) this.f7815c).h().f7781k);
                if (oVar != null) {
                    return oVar.f7786a;
                }
                return 0;
            default:
                return ((m0.f) h00.q.T0(((m0.w) this.f7815c).k().f10365a)).f10321a;
        }
    }

    public final void f(int i10) {
        switch (this.f7813a) {
            case 0:
                ((v) this.f7815c).k(i10);
                break;
            default:
                m0.w wVar = (m0.w) this.f7815c;
                float fN = wVar.n();
                wVar.s(fN != 0.0f ? 0 / fN : 0.0f, i10, true);
                break;
        }
    }
}
