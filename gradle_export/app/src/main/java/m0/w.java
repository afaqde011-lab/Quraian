package m0;

import a1.p1;
import b3.l0;
import d0.n2;
import d0.q1;
import java.util.List;
import k9.x0;
import l0.q0;
import l0.s0;
import l0.t0;
import l0.u0;
import l0.v0;
import l1.e1;
import l1.f1;
import l1.i1;
import l1.z0;
import ri.t1;
import z.b1;

public abstract class w implements n2 {
    public final z0 A;
    public final i1 B;
    public final i1 C;
    public final i1 D;
    public final i1 E;

    public boolean f10385a;

    public q f10386b;

    public final i1 f10387c;

    public final a2.o f10388d;

    public int f10389e;

    public int f10390f;

    public long f10391g;

    public long f10392h;

    public float f10393i;

    public float f10394j;

    public final d0.n f10395k;
    public final boolean l;
    public final i1 m;

    public y3.c f10396n;

    public int f10397o;

    public final f0.i f10398p;

    public final f1 f10399q;

    public final f1 f10400r;

    public final v0 f10401s;

    public final j f10402t;

    public final hf.c f10403u;

    public final l0.d f10404v;

    public final i1 f10405w;

    public final j0.t f10406x;

    public final s0 f10407y;

    public final z0 f10408z;

    public w(int i10, float f3) {
        double d3 = f3;
        if (-0.5d > d3 || d3 > 0.5d) {
            g0.a.a("currentPageOffsetFraction " + f3 + " is not within the range -0.5 to 0.5");
        }
        this.f10387c = l1.q.z(new h2.b(0L));
        this.f10388d = new a2.o(i10, f3, this);
        this.f10389e = i10;
        this.f10391g = Long.MAX_VALUE;
        final int i11 = 0;
        this.f10395k = new d0.n(new u00.k(this) {
            public final w B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                q qVar;
                switch (i11) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        w wVar = this.B;
                        long jT = t1.t(wVar);
                        float f10 = wVar.f10393i + fFloatValue;
                        long jG = w00.a.G(f10);
                        wVar.f10393i = f10 - jG;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j9 = jT + jG;
                            long jA = ab.a0.A(j9, wVar.f10392h, wVar.f10391g);
                            boolean z10 = j9 != jA;
                            long j10 = jA - jT;
                            float f11 = j10;
                            wVar.f10394j = f11;
                            if (Math.abs(j10) != 0) {
                                wVar.D.setValue(Boolean.valueOf(f11 > 0.0f));
                                wVar.E.setValue(Boolean.valueOf(f11 < 0.0f));
                            }
                            int i12 = (int) j10;
                            int i13 = -i12;
                            q qVarF = ((q) wVar.m.getValue()).f(i13);
                            if (qVarF != null && (qVar = wVar.f10386b) != null) {
                                q qVarF2 = qVar.f(i13);
                                if (qVarF2 != null) {
                                    wVar.f10386b = qVarF2;
                                } else {
                                    qVarF = null;
                                }
                            }
                            if (qVarF != null) {
                                wVar.h(qVarF, wVar.f10385a, true);
                                wVar.f10408z.setValue(g00.b0.a);
                            } else {
                                a2.o oVar = wVar.f10388d;
                                w wVar2 = (w) oVar.A;
                                e1 e1Var = (e1) oVar.D;
                                e1Var.i(e1Var.h() + (wVar2.n() != 0 ? i12 / wVar2.n() : 0.0f));
                                l0 l0Var = (l0) wVar.f10405w.getValue();
                                if (l0Var != null) {
                                    l0Var.l();
                                }
                            }
                            if (z10) {
                                ValueOf = Long.valueOf(j10);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        w wVar3 = this.B;
                        t0 t0Var = (t0) obj;
                        z1.f fVarF = z1.q.f();
                        u00.k kVarE = fVarF != null ? fVarF.e() : null;
                        z1.f fVarK = z1.q.k(fVarF);
                        try {
                            t0Var.a(wVar3.f10389e);
                            return g00.b0.a;
                        } finally {
                            z1.q.n(fVarF, fVarK, kVarE);
                        }
                }
            }
        });
        this.l = true;
        this.m = new i1(z.f10411c, l1.c.D);
        this.f10396n = z.f10410b;
        this.f10398p = new f0.i();
        this.f10399q = new f1(-1);
        this.f10400r = new f1(i10);
        l1.c cVar = l1.c.G;
        l1.q.q(cVar, new c(this, 2));
        l1.q.q(cVar, new c(this, 3));
        final int i12 = 1;
        v0 v0Var = new v0(new u00.k(this) {
            public final w B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                q qVar;
                switch (i12) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        w wVar = this.B;
                        long jT = t1.t(wVar);
                        float f10 = wVar.f10393i + fFloatValue;
                        long jG = w00.a.G(f10);
                        wVar.f10393i = f10 - jG;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j9 = jT + jG;
                            long jA = ab.a0.A(j9, wVar.f10392h, wVar.f10391g);
                            boolean z10 = j9 != jA;
                            long j10 = jA - jT;
                            float f11 = j10;
                            wVar.f10394j = f11;
                            if (Math.abs(j10) != 0) {
                                wVar.D.setValue(Boolean.valueOf(f11 > 0.0f));
                                wVar.E.setValue(Boolean.valueOf(f11 < 0.0f));
                            }
                            int i13 = (int) j10;
                            int i14 = -i13;
                            q qVarF = ((q) wVar.m.getValue()).f(i14);
                            if (qVarF != null && (qVar = wVar.f10386b) != null) {
                                q qVarF2 = qVar.f(i14);
                                if (qVarF2 != null) {
                                    wVar.f10386b = qVarF2;
                                } else {
                                    qVarF = null;
                                }
                            }
                            if (qVarF != null) {
                                wVar.h(qVarF, wVar.f10385a, true);
                                wVar.f10408z.setValue(g00.b0.a);
                            } else {
                                a2.o oVar = wVar.f10388d;
                                w wVar2 = (w) oVar.A;
                                e1 e1Var = (e1) oVar.D;
                                e1Var.i(e1Var.h() + (wVar2.n() != 0 ? i13 / wVar2.n() : 0.0f));
                                l0 l0Var = (l0) wVar.f10405w.getValue();
                                if (l0Var != null) {
                                    l0Var.l();
                                }
                            }
                            if (z10) {
                                ValueOf = Long.valueOf(j10);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        w wVar3 = this.B;
                        t0 t0Var = (t0) obj;
                        z1.f fVarF = z1.q.f();
                        u00.k kVarE = fVarF != null ? fVarF.e() : null;
                        z1.f fVarK = z1.q.k(fVarF);
                        try {
                            t0Var.a(wVar3.f10389e);
                            return g00.b0.a;
                        } finally {
                            z1.q.n(fVarF, fVarK, kVarE);
                        }
                }
            }
        });
        this.f10401s = v0Var;
        this.f10402t = new j(new gi.c(this, 20), v0Var, new c(this, 4));
        this.f10403u = new hf.c(15);
        this.f10404v = new l0.d();
        this.f10405w = l1.q.z(null);
        this.f10406x = new j0.t(this, 2);
        y3.b.b(0, 0, 0, 0, 15);
        this.f10407y = new s0();
        this.f10408z = l0.q.h();
        this.A = l0.q.h();
        Boolean bool = Boolean.FALSE;
        this.B = l1.q.z(bool);
        this.C = l1.q.z(bool);
        this.D = l1.q.z(bool);
        this.E = l1.q.z(bool);
    }

    public static java.lang.Object q(m0.w r5, z.b1 r6, u00.n r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m0.w.q(m0.w, z.b1, u00.n, m00.c):java.lang.Object");
    }

    public static Object r(w wVar, int i10, m00.i iVar) {
        wVar.getClass();
        Object objC = wVar.c(b1.A, new p1(wVar, i10, (k00.c) null, 8), iVar);
        return objC == l00.a.A ? objC : g00.b0.a;
    }

    @Override
    public final boolean a() {
        return this.f10395k.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override
    public final Object c(b1 b1Var, u00.n nVar, m00.c cVar) {
        return q(this, b1Var, nVar, cVar);
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override
    public final float e(float f3) {
        return this.f10395k.e(f3);
    }

    public final Object f(int i10, x.b1 b1Var, m00.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.E;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.E = i11 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.C;
        Object obj2 = l00.a.A;
        int i12 = uVar.E;
        g00.b0 b0Var = g00.b0.a;
        if (i12 == 0) {
            t1.O(obj);
            a2.o oVar = this.f10388d;
            if ((i10 != ((f1) oVar.B).h() || ((e1) oVar.D).h() != 0.0f) && l() != 0) {
                uVar.B = b1Var;
                uVar.A = i10;
                uVar.E = 1;
                if (i(uVar) != obj2) {
                }
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        i10 = uVar.A;
        b1Var = uVar.B;
        t1.O(obj);
        x.b1 b1Var2 = b1Var;
        double d3 = 0.0f;
        if (-0.5d > d3 || d3 > 0.5d) {
            g0.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        u00.n aVar = new gc.a(this, j(i10), 0.0f * n(), b1Var2, null);
        uVar.B = null;
        uVar.E = 2;
        return c(b1.A, aVar, uVar) == obj2 ? obj2 : b0Var;
    }

    public final void h(q qVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        Object obj;
        boolean z16;
        boolean z17;
        l0.g gVar;
        List list;
        int size;
        int i11;
        ?? r7;
        boolean z18;
        ?? r12;
        ?? r13;
        float f3;
        ?? r4;
        long jG;
        long jY;
        long j9;
        List list2 = qVar.f10365a;
        int i12 = qVar.l;
        f fVar = qVar.f10373i;
        f fVar2 = qVar.f10374j;
        float f10 = qVar.f10375k;
        this.f10401s.f9802e = list2.size();
        int i13 = qVar.f10366b;
        this.f10397o = qVar.f10367c + i13;
        if (!z10 && this.f10385a) {
            this.f10386b = qVar;
            return;
        }
        boolean z19 = true;
        if (z10) {
            this.f10385a = true;
        }
        j jVar = this.f10402t;
        boolean z20 = this.l;
        a2.o oVar = this.f10388d;
        if (!z11) {
            oVar.getClass();
            oVar.E = fVar2 != null ? fVar2.f10324d : null;
            if (oVar.C || !list2.isEmpty()) {
                oVar.C = true;
                int i14 = fVar2 != null ? fVar2.f10321a : 0;
                ((f1) oVar.B).i(i14);
                ((q0) oVar.F).a(i14);
                ((e1) oVar.D).i(f10);
            }
            if (z20) {
                boolean z21 = z20;
                x0 x0Var = jVar.f10349o;
                u.w wVar = jVar.f10341e;
                x0Var.C = qVar;
                x0Var.D = jVar.f10348n;
                gi.c cVar = jVar.f10337a;
                int i15 = jVar.f10343g;
                int i16 = -1;
                float f11 = 0.0f;
                if (i15 != -1 && i15 != x0Var.H()) {
                    jVar.l = true;
                    if (x0Var.z()) {
                        int i17 = jVar.f10344h;
                        if (i17 < 0) {
                            i17 = 0;
                        }
                        jVar.f10344h = i17;
                        int iH = x0Var.C().f10365a.isEmpty() ? -1 : x0Var.H() - 1;
                        if (iH != -1) {
                            int i18 = jVar.f10345i;
                            if (i18 <= iH) {
                                iH = i18;
                            }
                            jVar.f10345i = iH;
                        }
                        if (jVar.f10342f <= 0.0f) {
                            jVar.f(x0Var.B(), jVar.m - 1);
                        } else {
                            jVar.f(0, x0Var.x());
                        }
                    }
                }
                jVar.m = x0Var.H();
                if (x0Var.z()) {
                    int size2 = x0Var.C().f10380r.size() + x0Var.C().f10365a.size() + x0Var.C().f10379q.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        int size3 = x0Var.C().f10379q.size();
                        float f12 = f11;
                        int size4 = x0Var.C().f10365a.size();
                        if (i19 < size3) {
                            i10 = ((f) x0Var.C().f10379q.get(i19)).f10321a;
                        } else if (i19 < size3 || i19 >= size3 + size4) {
                            i10 = i19 >= size3 + size4 ? ((f) x0Var.C().f10380r.get((i19 - size3) - size4)).f10321a : i16;
                        } else {
                            i10 = ((f) x0Var.C().f10365a.get(i19 - size3)).f10321a;
                        }
                        int size5 = x0Var.C().f10379q.size();
                        int size6 = x0Var.C().f10365a.size();
                        if (i19 < size5) {
                            obj = ((f) x0Var.C().f10379q.get(i19)).f10324d;
                        } else if (i19 < size5 || i19 >= size5 + size6) {
                            obj = i19 >= size5 + size6 ? ((f) x0Var.C().f10380r.get((i19 - size5) - size6)).f10324d : l0.g.f9740c;
                        } else {
                            obj = ((f) x0Var.C().f10365a.get(i19 - size5)).f10324d;
                        }
                        int i20 = x0Var.C().f10366b;
                        if (i10 != -1) {
                            if (wVar.a(i10)) {
                                Object objB = wVar.b(i10);
                                kotlin.jvm.internal.m.b(objB);
                                int i21 = ((l0.g) objB).f9742b;
                                Object objB2 = wVar.b(i10);
                                kotlin.jvm.internal.m.b(objB2);
                                z16 = z21;
                                Object obj2 = ((l0.g) objB2).f9741a;
                                if (i21 != i20 || !kotlin.jvm.internal.m.a(obj2, obj)) {
                                    z17 = true;
                                    jVar.l = true;
                                }
                                gVar = (l0.g) wVar.b(i10);
                                if (gVar != null) {
                                    gVar.f9742b = i20;
                                    gVar.f9741a = obj;
                                } else {
                                    gVar = new l0.g();
                                    gVar.f9741a = obj;
                                    gVar.f9742b = i20;
                                }
                                wVar.i(i10, gVar);
                                jVar.f10344h = Math.min(jVar.f10344h, i10);
                                jVar.f10345i = Math.max(jVar.f10345i, i10);
                                list = (List) jVar.f10338b.g(i10);
                                if (list != null) {
                                    size = list.size();
                                    for (i11 = 0; i11 < size; i11++) {
                                        ((u0) list.get(i11)).cancel();
                                    }
                                }
                            } else {
                                z16 = z21;
                            }
                            z17 = true;
                            gVar = (l0.g) wVar.b(i10);
                            if (gVar != null) {
                                gVar.f9742b = i20;
                                gVar.f9741a = obj;
                            } else {
                                gVar = new l0.g();
                                gVar.f9741a = obj;
                                gVar.f9742b = i20;
                            }
                            wVar.i(i10, gVar);
                            jVar.f10344h = Math.min(jVar.f10344h, i10);
                            jVar.f10345i = Math.max(jVar.f10345i, i10);
                            list = (List) jVar.f10338b.g(i10);
                            if (list != null) {
                                size = list.size();
                                while (i11 < size) {
                                    ((u0) list.get(i11)).cancel();
                                }
                            }
                        } else {
                            z16 = z21;
                            z17 = true;
                        }
                        i19++;
                        f11 = f12;
                        z19 = z17;
                        z21 = z16;
                        i16 = -1;
                    }
                    z12 = z21;
                    boolean z22 = z19;
                    float f13 = f11;
                    if (jVar.l) {
                        boolean z23 = jVar.f10342f <= f13 ? z22 ? 1 : 0 : false;
                        if (x0Var.z()) {
                            qd.s0.h0(x0Var.C());
                            z15 = false;
                            jVar.d(x0Var, x0Var.x(), x0Var.B(), x0Var.C().f10382t != null ? ((w) cVar.B).f10397o : 0, x0Var.D(), x0Var.E(), 0.0f, z23);
                        } else {
                            z15 = false;
                        }
                        jVar.l = z15;
                        z13 = z22;
                        z14 = z15;
                    } else {
                        z14 = false;
                        z13 = z22;
                    }
                } else {
                    z12 = z21;
                    z13 = true;
                    z14 = false;
                    jVar.g();
                }
                jVar.f10343g = x0Var.H();
                z18 = z13;
                r7 = z14;
            }
            this.m.setValue(qVar);
            this.B.setValue(Boolean.valueOf(qVar.m));
            if (fVar != null) {
                r12 = fVar.f10321a;
            } else {
                r12 = r7;
            }
            if (r12 == 0 || i12 != 0) {
                r13 = z18 ? 1 : 0;
            } else {
                r13 = r7;
            }
            this.C.setValue(Boolean.valueOf((boolean) r13));
            if (fVar != null) {
                this.f10389e = fVar.f10321a;
            }
            this.f10390f = i12;
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            if (z12) {
                try {
                    if (qVar.f10372h < l() && Math.abs(this.f10394j) > 0.5f) {
                        f3 = this.f10394j;
                        if (k().f10369e == q1.A) {
                            if (Math.signum(f3) == Math.signum(-Float.intBitsToFloat((int) (o() & 4294967295L)))) {
                                r4 = z18;
                            } else if (p()) {
                                r4 = z18;
                            } else {
                                r4 = r7;
                            }
                        } else if (Math.signum(f3) == Math.signum(-Float.intBitsToFloat((int) (o() >> 32)))) {
                            r4 = z18;
                        } else if (p()) {
                            r4 = z18;
                        } else {
                            r4 = r7;
                        }
                        if (r4 == 0) {
                            jVar.e(this.f10394j, qVar);
                        }
                    }
                } catch (Throwable th2) {
                    z1.q.n(fVarF, fVarK, kVarE);
                    throw th2;
                }
            }
            z1.q.n(fVarF, fVarK, kVarE);
            this.f10391g = z.a(qVar, l());
            l();
            if (qVar.f10369e == q1.B) {
                jG = qVar.g() >> 32;
            } else {
                jG = qVar.g() & 4294967295L;
            }
            int i22 = (int) jG;
            jY = ab.a0.y(qVar.f10376n.b(i22, i13, -qVar.f10370f, qVar.f10368d), r7, i22);
            j9 = this.f10391g;
            if (jY > j9) {
                jY = j9;
            }
            this.f10392h = jY;
        }
        ((e1) oVar.D).i(f10);
        z18 = true;
        z12 = z20;
        r7 = 0;
        this.m.setValue(qVar);
        this.B.setValue(Boolean.valueOf(qVar.m));
        if (fVar != null) {
            r12 = fVar.f10321a;
        } else {
            r12 = r7;
        }
        if (r12 == 0) {
            r13 = z18 ? 1 : 0;
        } else {
            r13 = z18 ? 1 : 0;
        }
        this.C.setValue(Boolean.valueOf((boolean) r13));
        if (fVar != null) {
            this.f10389e = fVar.f10321a;
        }
        this.f10390f = i12;
        z1.f fVarF2 = z1.q.f();
        u00.k kVarE2 = fVarF2 != null ? fVarF2.e() : null;
        z1.f fVarK2 = z1.q.k(fVarF2);
        if (z12) {
            if (qVar.f10372h < l()) {
                f3 = this.f10394j;
                if (k().f10369e == q1.A) {
                    if (Math.signum(f3) == Math.signum(-Float.intBitsToFloat((int) (o() & 4294967295L)))) {
                        r4 = z18;
                    } else if (p()) {
                        r4 = z18;
                    } else {
                        r4 = r7;
                    }
                } else if (Math.signum(f3) == Math.signum(-Float.intBitsToFloat((int) (o() >> 32)))) {
                    r4 = z18;
                } else if (p()) {
                    r4 = z18;
                } else {
                    r4 = r7;
                }
                if (r4 == 0) {
                    jVar.e(this.f10394j, qVar);
                }
            }
        }
        z1.q.n(fVarF2, fVarK2, kVarE2);
        this.f10391g = z.a(qVar, l());
        l();
        if (qVar.f10369e == q1.B) {
            jG = qVar.g() >> 32;
        } else {
            jG = qVar.g() & 4294967295L;
        }
        int i23 = (int) jG;
        jY = ab.a0.y(qVar.f10376n.b(i23, i13, -qVar.f10370f, qVar.f10368d), r7, i23);
        j9 = this.f10391g;
        if (jY > j9) {
            jY = j9;
        }
        this.f10392h = jY;
    }

    public final Object i(m00.c cVar) {
        Object objJ;
        return (this.m.getValue() == z.f10411c && (objJ = this.f10404v.j(cVar)) == l00.a.A) ? objJ : g00.b0.a;
    }

    public final int j(int i10) {
        if (l() > 0) {
            return ab.a0.y(i10, 0, l() - 1);
        }
        return 0;
    }

    public final q k() {
        return (q) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((q) this.m.getValue()).f10366b;
    }

    public final int n() {
        return ((q) this.m.getValue()).f10367c + m();
    }

    public final long o() {
        return ((h2.b) this.f10387c.getValue()).f6544a;
    }

    public final boolean p() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final void s(float f3, int i10, boolean z10) {
        a2.o oVar = this.f10388d;
        f1 f1Var = (f1) oVar.B;
        e1 e1Var = (e1) oVar.D;
        if (f1Var.h() != i10 || e1Var.h() != f3) {
            this.f10402t.g();
        }
        ((f1) oVar.B).i(i10);
        ((q0) oVar.F).a(i10);
        e1Var.i(f3);
        oVar.E = null;
        if (!z10) {
            this.A.setValue(g00.b0.a);
            return;
        }
        l0 l0Var = (l0) this.f10405w.getValue();
        if (l0Var != null) {
            l0Var.l();
        }
    }
}
