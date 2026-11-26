package x;

import java.util.concurrent.CancellationException;
import q0.f2;

public final class y0 extends f5.c {
    public static final k T = new k(0.0f);
    public static final k U = new k(1.0f);
    public final l1.i1 C;
    public final l1.i1 D;
    public Object E;
    public n1 F;
    public long G;
    public final f2 H;
    public z1.u I;
    public final l1.e1 J;
    public a40.k K;
    public final j40.c L;
    public final n0 M;
    public long N;
    public final u.d0 O;
    public r0 P;
    public final q0 Q;
    public float R;
    public final q0 S;

    public y0(Object obj) {
        super(11);
        this.C = l1.q.z(obj);
        this.D = l1.q.z(obj);
        this.E = obj;
        this.H = new f2(this, 17);
        this.J = new l1.e1(0.0f);
        this.L = j40.d.a();
        this.M = new n0();
        this.N = Long.MIN_VALUE;
        this.O = new u.d0();
        final int i10 = 0;
        this.Q = new u00.k(this) {
            public final y0 B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i10) {
                    case 0:
                        this.B.N = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        y0 y0Var = this.B;
                        long j9 = jLongValue - y0Var.N;
                        y0Var.N = jLongValue;
                        long jG = w00.a.G(j9 / ((double) y0Var.R));
                        u.d0 d0Var = y0Var.O;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.f14837a;
                            int i11 = d0Var.f14838b;
                            int i12 = 0;
                            for (int i13 = 0; i13 < i11; i13++) {
                                r0 r0Var = (r0) objArr[i13];
                                y0.c1(r0Var, jG);
                                r0Var.f16357c = true;
                            }
                            n1 n1Var = y0Var.F;
                            if (n1Var != null) {
                                n1Var.o();
                            }
                            int i14 = d0Var.f14838b;
                            Object[] objArr2 = d0Var.f14837a;
                            z00.e eVarI0 = ab.a0.I0(0, i14);
                            int i15 = ((z00.c) eVarI0).A;
                            int i16 = ((z00.c) eVarI0).B;
                            if (i15 <= i16) {
                                while (true) {
                                    objArr2[i15 - i12] = objArr2[i15];
                                    if (((r0) objArr2[i15]).f16357c) {
                                        i12++;
                                    }
                                    if (i15 != i16) {
                                        i15++;
                                    }
                                }
                            }
                            h00.n.y0(i14 - i12, i14, (Object) null, objArr2);
                            d0Var.f14838b -= i12;
                        }
                        r0 r0Var2 = y0Var.P;
                        if (r0Var2 != null) {
                            r0Var2.f16361g = y0Var.G;
                            y0.c1(r0Var2, jG);
                            y0Var.f1(r0Var2.f16358d);
                            if (r0Var2.f16358d == 1.0f) {
                                y0Var.P = null;
                            }
                            y0Var.e1();
                        }
                        break;
                }
                return g00.b0.a;
            }
        };
        final int i11 = 1;
        this.S = new u00.k(this) {
            public final y0 B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i11) {
                    case 0:
                        this.B.N = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        y0 y0Var = this.B;
                        long j9 = jLongValue - y0Var.N;
                        y0Var.N = jLongValue;
                        long jG = w00.a.G(j9 / ((double) y0Var.R));
                        u.d0 d0Var = y0Var.O;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.f14837a;
                            int i12 = d0Var.f14838b;
                            int i13 = 0;
                            for (int i14 = 0; i14 < i12; i14++) {
                                r0 r0Var = (r0) objArr[i14];
                                y0.c1(r0Var, jG);
                                r0Var.f16357c = true;
                            }
                            n1 n1Var = y0Var.F;
                            if (n1Var != null) {
                                n1Var.o();
                            }
                            int i15 = d0Var.f14838b;
                            Object[] objArr2 = d0Var.f14837a;
                            z00.e eVarI0 = ab.a0.I0(0, i15);
                            int i16 = ((z00.c) eVarI0).A;
                            int i17 = ((z00.c) eVarI0).B;
                            if (i16 <= i17) {
                                while (true) {
                                    objArr2[i16 - i13] = objArr2[i16];
                                    if (((r0) objArr2[i16]).f16357c) {
                                        i13++;
                                    }
                                    if (i16 != i17) {
                                        i16++;
                                    }
                                }
                            }
                            h00.n.y0(i15 - i13, i15, (Object) null, objArr2);
                            d0Var.f14838b -= i13;
                        }
                        r0 r0Var2 = y0Var.P;
                        if (r0Var2 != null) {
                            r0Var2.f16361g = y0Var.G;
                            y0.c1(r0Var2, jG);
                            y0Var.f1(r0Var2.f16358d);
                            if (r0Var2.f16358d == 1.0f) {
                                y0Var.P = null;
                            }
                            y0Var.e1();
                        }
                        break;
                }
                return g00.b0.a;
            }
        };
    }

    public static final void W0(y0 y0Var) {
        n1 n1Var = y0Var.F;
        l1.e1 e1Var = y0Var.J;
        if (n1Var == null) {
            return;
        }
        r0 r0Var = y0Var.P;
        if (r0Var == null) {
            if (y0Var.G <= 0 || e1Var.h() == 1.0f || kotlin.jvm.internal.m.a(y0Var.D.getValue(), y0Var.C.getValue())) {
                r0Var = null;
            } else {
                r0Var = new r0();
                r0Var.f16358d = e1Var.h();
                long j9 = y0Var.G;
                r0Var.f16361g = j9;
                r0Var.f16362h = w00.a.G((1.0d - ((double) e1Var.h())) * j9);
                r0Var.f16359e.e(e1Var.h(), 0);
            }
        }
        if (r0Var != null) {
            r0Var.f16361g = y0Var.G;
            y0Var.O.a(r0Var);
            n1Var.m(r0Var);
        }
        y0Var.P = null;
    }

    public static final Object X0(y0 y0Var, m00.c cVar) {
        t0 t0Var;
        u.d0 d0Var = y0Var.O;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i10 = t0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(y0Var, cVar);
            }
        } else {
            t0Var = new t0(y0Var, cVar);
        }
        Object obj = t0Var.A;
        Object obj2 = l00.a.A;
        int i11 = t0Var.C;
        g00.b0 b0Var = g00.b0.a;
        if (i11 == 0) {
            ri.t1.O(obj);
            if (d0Var.h() && y0Var.P == null) {
                return b0Var;
            }
            if (c.q(t0Var.getContext()) == 0.0f) {
                y0Var.b1();
                y0Var.N = Long.MIN_VALUE;
                return b0Var;
            }
            if (y0Var.N == Long.MIN_VALUE) {
                q0 q0Var = y0Var.Q;
                t0Var.C = 1;
                if (l1.q.u(t0Var.getContext()).b0(q0Var, t0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        do {
            if (!d0Var.i() && y0Var.P == null) {
                y0Var.N = Long.MIN_VALUE;
                return b0Var;
            }
            t0Var.C = 2;
        } while (y0Var.a1(t0Var) != obj2);
        return obj2;
    }

    public static final Object Y0(y0 y0Var, m00.c cVar) {
        w0 w0Var;
        Object value;
        Object obj;
        j40.c cVar2 = y0Var.L;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i10 = w0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(y0Var, cVar);
            }
        } else {
            w0Var = new w0(y0Var, cVar);
        }
        Object obj2 = w0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = w0Var.D;
        if (i11 == 0) {
            ri.t1.O(obj2);
            value = y0Var.C.getValue();
            w0Var.A = value;
            w0Var.D = 1;
            if (cVar2.l(w0Var) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            Object obj3 = w0Var.A;
            ri.t1.O(obj2);
            value = obj3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = w0Var.A;
            ri.t1.O(obj2);
        }
        if (kotlin.jvm.internal.m.a(obj2, obj)) {
            return g00.b0.a;
        }
        y0Var.N = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        w0Var.A = value;
        w0Var.D = 2;
        a40.k kVar = new a40.k(1, qd.s0.j0(w0Var));
        kVar.r();
        y0Var.K = kVar;
        cVar2.i((Object) null);
        Object objQ = kVar.q();
        if (objQ != aVar) {
            obj = value;
            obj2 = objQ;
            if (kotlin.jvm.internal.m.a(obj2, obj)) {
                return g00.b0.a;
            }
            y0Var.N = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    public static final Object Z0(y0 y0Var, m00.c cVar) {
        x0 x0Var;
        Object value;
        Object obj;
        j40.c cVar2 = y0Var.L;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i10 = x0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(y0Var, cVar);
            }
        } else {
            x0Var = new x0(y0Var, cVar);
        }
        Object obj2 = x0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = x0Var.D;
        if (i11 == 0) {
            ri.t1.O(obj2);
            value = y0Var.C.getValue();
            x0Var.A = value;
            x0Var.D = 1;
            if (cVar2.l(x0Var) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            Object obj3 = x0Var.A;
            ri.t1.O(obj2);
            value = obj3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = x0Var.A;
            ri.t1.O(obj2);
        }
        if (!kotlin.jvm.internal.m.a(obj2, obj)) {
            y0Var.N = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return g00.b0.a;
        if (!kotlin.jvm.internal.m.a(value, y0Var.E)) {
            x0Var.A = value;
            x0Var.D = 2;
            a40.k kVar = new a40.k(1, qd.s0.j0(x0Var));
            kVar.r();
            y0Var.K = kVar;
            cVar2.i((Object) null);
            Object objQ = kVar.q();
            if (objQ != aVar) {
                obj = value;
                obj2 = objQ;
                if (!kotlin.jvm.internal.m.a(obj2, obj)) {
                    y0Var.N = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        cVar2.i((Object) null);
        return g00.b0.a;
    }

    public static void c1(r0 r0Var, long j9) {
        long j10 = r0Var.f16355a;
        k kVar = r0Var.f16359e;
        long j11 = j10 + j9;
        r0Var.f16355a = j11;
        long j12 = r0Var.f16362h;
        if (j11 >= j12) {
            r0Var.f16358d = 1.0f;
            return;
        }
        v1 v1Var = r0Var.f16356b;
        if (v1Var == null) {
            float f3 = j11 / j12;
            r0Var.f16358d = (f3 * 1.0f) + ((1 - f3) * kVar.a(0));
            return;
        }
        k kVar2 = r0Var.f16360f;
        if (kVar2 == null) {
            kVar2 = T;
        }
        r0Var.f16358d = ab.a0.x(((k) v1Var.r(j11, kVar, U, kVar2)).a(0), 0.0f, 1.0f);
    }

    @Override
    public final Object J0() {
        return this.D.getValue();
    }

    @Override
    public final Object L0() {
        return this.C.getValue();
    }

    @Override
    public final void R0(Object obj) {
        this.D.setValue(obj);
    }

    @Override
    public final void S0(n1 n1Var) {
        n1 n1Var2 = this.F;
        if (n1Var2 != null && !n1Var.equals(n1Var2)) {
            o0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.F + ", new instance: " + n1Var);
        }
        this.F = n1Var;
    }

    @Override
    public final void T0() {
        this.F = null;
        z1.u uVar = this.I;
        if (uVar != null) {
            uVar.b(this);
        }
    }

    public final Object a1(m00.c cVar) {
        float fQ = c.q(cVar.getContext());
        g00.b0 b0Var = g00.b0.a;
        if (fQ <= 0.0f) {
            b1();
            return b0Var;
        }
        this.R = fQ;
        Object objB0 = l1.q.u(cVar.getContext()).b0(this.S, cVar);
        return objB0 == l00.a.A ? objB0 : b0Var;
    }

    public final void b1() {
        n1 n1Var = this.F;
        if (n1Var != null) {
            n1Var.c();
        }
        this.O.d();
        if (this.P != null) {
            this.P = null;
            f1(1.0f);
            e1();
        }
    }

    public final Object d1(float f3, Object obj, m00.i iVar) {
        if (0.0f > f3 || f3 > 1.0f) {
            o0.a("Expecting fraction between 0 and 1. Got " + f3);
        }
        n1 n1Var = this.F;
        if (n1Var != null) {
            Object objA = n0.a(this.M, new v0(obj, this.C.getValue(), this, n1Var, f3, null), iVar);
            if (objA == l00.a.A) {
                return objA;
            }
        }
        return g00.b0.a;
    }

    public final void e1() {
        n1 n1Var = this.F;
        if (n1Var == null) {
            return;
        }
        n1Var.l(w00.a.G(((double) this.J.h()) * ((Number) n1Var.l.getValue()).longValue()));
    }

    public final void f1(float f3) {
        this.J.i(f3);
    }

    public final void g1(z1.u uVar) {
        y8.g gVar;
        if (kotlin.jvm.internal.m.a(this.I, uVar)) {
            return;
        }
        z1.u uVar2 = this.I;
        if (uVar2 != null) {
            uVar2.b(this);
        }
        z1.u uVar3 = this.I;
        if (uVar3 != null && (gVar = uVar3.f17071h) != null) {
            gVar.a();
        }
        this.I = uVar;
        if (uVar != null) {
            uVar.e();
        }
        z1.u uVar4 = this.I;
        if (uVar4 != null) {
            uVar4.d(this, c.f16257j, this.H);
        }
    }
}
