package x0;

import d40.l;
import g00.b0;
import l1.g0;
import l1.i1;
import l1.j;
import l1.q;
import l1.r1;
import m00.i;
import u00.n;
import z.e1;

public final class c implements f {

    public final v1.c f16394a;

    public final e1 f16395b = new e1();

    public final i1 f16396c = q.z(null);

    public c(v1.c cVar) {
        this.f16394a = cVar;
    }

    @Override
    public final Object a(e eVar, i iVar) {
        Object objB = e1.b(this.f16395b, new l(this, new b(eVar), (k00.c) null, 8), iVar);
        return objB == l00.a.A ? objB : b0.a;
    }

    public final void b(final u00.a aVar, j jVar, final int i10) {
        final u00.a aVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(723898654);
        int i11 = (g0Var.g(this) ? 32 : 16) | i10;
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            b bVar = (b) this.f16396c.getValue();
            if (bVar == null) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final int i12 = 0;
                    r1VarT.f9921d = new n(this, aVar, i10, i12) {
                        public final int A;
                        public final c B;
                        public final u00.a C;

                        {
                            this.A = i12;
                            this.B = this;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = this.A;
                            j jVar2 = (j) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    this.B.b(this.C, jVar2, q.K(7));
                                    break;
                                default:
                                    this.B.b(this.C, jVar2, q.K(7));
                                    break;
                            }
                            return b0.a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.f16394a.t(bVar, bVar.f16392a, aVar2, g0Var, 384);
        } else {
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            final int i13 = 1;
            r1VarT2.f9921d = new n(this, aVar2, i10, i13) {
                public final int A;
                public final c B;
                public final u00.a C;

                {
                    this.A = i13;
                    this.B = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = this.A;
                    j jVar2 = (j) obj;
                    ((Integer) obj2).getClass();
                    switch (i14) {
                        case 0:
                            this.B.b(this.C, jVar2, q.K(7));
                            break;
                        default:
                            this.B.b(this.C, jVar2, q.K(7));
                            break;
                    }
                    return b0.a;
                }
            };
        }
    }
}
