package w;

import com.google.android.gms.cast.MediaError;
import l1.p2;

public final class g0 {

    public final u1 f15758a;

    public final x.n1 f15759b;

    public final u00.a f15760c;

    public final l1.i1 f15761d;

    public final l1.i1 f15762e;

    public x.y f15763f = h0.f15771a;

    public final l1.i1 f15764g = l1.q.z(null);

    public g0(u1 u1Var, x.n1 n1Var, x.j1 j1Var, oo.k0 k0Var, u00.a aVar) {
        this.f15758a = u1Var;
        this.f15759b = n1Var;
        this.f15760c = aVar;
        this.f15761d = l1.q.z(j1Var);
        this.f15762e = l1.q.z(k0Var);
    }

    public final void a(h2.c cVar, h2.c cVar2, oo.k0 k0Var) {
        x.y yVarW;
        if (this.f15758a.b()) {
            l1.i1 i1Var = this.f15764g;
            if (((p2) i1Var.getValue()) == null) {
                if (k0Var == null) {
                    k0Var = (oo.k0) this.f15762e.getValue();
                }
                switch (k0Var.a) {
                    case 0:
                        yVarW = x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, x.x.f16384a, 2);
                        break;
                    case 1:
                        yVarW = x.c.u();
                        break;
                    default:
                        yVarW = x.c.v(0.0f, 0.0f, x.z1.f16390a, 3);
                        break;
                }
                this.f15763f = yVarW;
            }
            i1Var.setValue(((x.j1) this.f15761d.getValue()).a(new g(this, 2), new b3.n0(this, cVar2, cVar, 6)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.f15759b.f16326d.getValue()).booleanValue();
    }

    public final h2.c c() {
        p2 p2Var;
        h2.c cVar;
        if (!this.f15758a.b() || (p2Var = (p2) this.f15764g.getValue()) == null || (cVar = (h2.c) p2Var.getValue()) == null) {
            return null;
        }
        long j9 = ((h2.b) this.f15760c.invoke()).f6544a;
        return !h2.b.b(j9, 0L) ? cVar.j(j9) : cVar;
    }
}
