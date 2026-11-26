package a1;

public final class t1 extends b3.l implements b3.y, b3.o, b3.j, b3.p, b3.j2 {
    public boolean Q;
    public boolean R;
    public s2 S;
    public w2 T;
    public b1.e0 U;
    public i2.q V;
    public boolean W;
    public z.p1 X;
    public d0.q1 Y;
    public w0.l Z;

    public e1.q f123a0;

    public d0 f124b0;

    public a40.u1 f125c0;

    public m3.q0 f126d0;

    public h2.c f127e0 = new h2.c(-1.0f, -1.0f, -1.0f, -1.0f);

    public int f128f0;

    public int f129g0;

    public final b1.h f130h0;

    public final w0.j f131i0;

    public t1(boolean z10, boolean z11, s2 s2Var, w2 w2Var, b1.e0 e0Var, i2.q qVar, boolean z12, z.p1 p1Var, d0.q1 q1Var, w0.l lVar, e1.q qVar2) {
        this.Q = z10;
        this.R = z11;
        this.S = s2Var;
        this.T = w2Var;
        this.U = e0Var;
        this.V = qVar;
        this.W = z12;
        this.X = p1Var;
        this.Y = q1Var;
        this.Z = lVar;
        this.f123a0 = qVar2;
        int i10 = 1;
        int i11 = 0;
        boolean z13 = z10 || z11;
        j3.z zVar = z.a1.f16893a;
        b1.h hVar = new b1.h(w2Var, e0Var, s2Var, z13);
        B1(hVar);
        this.f130h0 = hVar;
        k00.c cVar = null;
        w0.j jVar = new w0.j(this.Z, new q1(this, cVar, i11), new r1(this, cVar, i11), new e1(this, i10));
        B1(jVar);
        this.f131i0 = jVar;
    }

    public final boolean E1() {
        if (!this.W) {
            return false;
        }
        if (!this.Q && !this.R) {
            return false;
        }
        i2.q qVar = this.V;
        float f3 = m1.f98a;
        return ((qVar instanceof i2.v0) && ((i2.v0) qVar).f7174a == 16) ? false : true;
    }

    public final void F1() {
        if (this.f124b0 == null) {
            this.f124b0 = new d0(((Boolean) b3.m.h(this, c3.o1.f2748x)).booleanValue());
            b3.m.m(this);
        }
        this.f125c0 = a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new a0(this, (k00.c) null, 1), 3);
    }

    public final void G1(z2.k1 k1Var, int i10, int i11, long j9, y3.m mVar) {
        int i12;
        m3.n0 n0VarC;
        float f3;
        this.X.f16952b.i(i10);
        this.X.f(i11 - i10);
        m3.q0 q0Var = this.f126d0;
        if (q0Var != null) {
            int i13 = m3.q0.f10519c;
            int i14 = (int) (j9 & 4294967295L);
            long j10 = q0Var.f10520a;
            if (i14 == ((int) (j10 & 4294967295L))) {
                i12 = (int) (j9 >> 32);
                if (i12 == ((int) (j10 >> 32)) && i11 == this.f128f0 && i10 == this.f129g0) {
                    i12 = -1;
                }
            } else {
                int i15 = m3.q0.f10519c;
                i12 = (int) (j9 & 4294967295L);
            }
        } else {
            int i16 = m3.q0.f10519c;
            i12 = (int) (j9 & 4294967295L);
        }
        if (i12 < 0 || !E1() || (n0VarC = this.S.c()) == null) {
            return;
        }
        h2.c cVarC = n0VarC.c(ab.a0.z(i12, new z00.e(0, n0VarC.f10496a.f10483a.B.length(), 1)));
        float f10 = cVarC.f6546a;
        float f11 = cVarC.f6548c;
        boolean z10 = mVar == y3.m.B;
        int iR0 = k1Var.R0(m1.f98a);
        float f12 = z10 ? i11 - f11 : f10;
        float f13 = z10 ? (i11 - f11) + iR0 : f10 + iR0;
        float f14 = cVarC.f6547b;
        float f15 = cVarC.f6549d;
        h2.c cVar = new h2.c(f12, f14, f13, f15);
        h2.c cVar2 = this.f127e0;
        boolean z11 = (f12 == cVar2.f6546a && f14 == cVar2.f6547b && i11 == this.f128f0) ? false : true;
        if (z11 || i10 != this.f129g0) {
            boolean z12 = this.Y == d0.q1.A;
            if (z12) {
                f12 = f14;
            }
            if (z12) {
                f13 = f15;
            }
            int iH = this.X.f16951a.h();
            float f16 = iH + i10;
            if (f13 > f16) {
                f3 = f13 - f16;
            } else {
                float f17 = iH;
                if (f12 >= f17 || f13 - f12 <= i10) {
                    f3 = (f12 >= f17 || f13 - f12 > ((float) i10)) ? 0.0f : f12 - f17;
                } else {
                    f3 = f13 - f16;
                }
            }
            this.f126d0 = new m3.q0(j9);
            this.f127e0 = cVar;
            this.f129g0 = i10;
            this.f128f0 = i11;
            a40.c0.y(p1(), (k00.i) null, a40.a0.D, new s1(this, f3, z11, cVarC, (k00.c) null), 1);
        }
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.S.f119d.setValue(p1Var);
        this.f130h0.W(p1Var);
    }

    @Override
    public final z2.x0 e(final z2.y0 y0Var, z2.v0 v0Var, long j9) {
        d0.q1 q1Var = this.Y;
        d0.q1 q1Var2 = d0.q1.A;
        h00.y yVar = h00.y.A;
        if (q1Var == q1Var2) {
            final z2.l1 l1VarO = v0Var.O(y3.a.a(j9, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int iMin = Math.min(l1VarO.B, y3.a.g(j9));
            final int i10 = 1;
            return y0Var.o0(l1VarO.A, iMin, yVar, new u00.k(this) {
                public final t1 B;

                {
                    this.B = this;
                }

                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            z2.k1 k1Var = (z2.k1) obj;
                            z2.l1 l1Var = l1VarO;
                            int i11 = l1Var.A;
                            t1 t1Var = this.B;
                            t1Var.G1(k1Var, iMin, i11, t1Var.T.d().D, y0Var.getLayoutDirection());
                            z2.k1.k(k1Var, l1Var, -t1Var.X.f16951a.h(), 0);
                            break;
                        default:
                            z2.k1 k1Var2 = (z2.k1) obj;
                            z2.l1 l1Var2 = l1VarO;
                            int i12 = l1Var2.B;
                            t1 t1Var2 = this.B;
                            t1Var2.G1(k1Var2, iMin, i12, t1Var2.T.d().D, y0Var.getLayoutDirection());
                            z2.k1.k(k1Var2, l1Var2, 0, -t1Var2.X.f16951a.h());
                            break;
                    }
                    return g00.b0.a;
                }
            });
        }
        final z2.l1 l1VarO2 = v0Var.O(y3.a.a(j9, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int iMin2 = Math.min(l1VarO2.A, y3.a.h(j9));
        final int i11 = 0;
        return y0Var.o0(iMin2, l1VarO2.B, yVar, new u00.k(this) {
            public final t1 B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        z2.k1 k1Var = (z2.k1) obj;
                        z2.l1 l1Var = l1VarO2;
                        int i12 = l1Var.A;
                        t1 t1Var = this.B;
                        t1Var.G1(k1Var, iMin2, i12, t1Var.T.d().D, y0Var.getLayoutDirection());
                        z2.k1.k(k1Var, l1Var, -t1Var.X.f16951a.h(), 0);
                        break;
                    default:
                        z2.k1 k1Var2 = (z2.k1) obj;
                        z2.l1 l1Var2 = l1VarO2;
                        int i13 = l1Var2.B;
                        t1 t1Var2 = this.B;
                        t1Var2.G1(k1Var2, iMin2, i13, t1Var2.T.d().D, y0Var.getLayoutDirection());
                        z2.k1.k(k1Var2, l1Var2, 0, -t1Var2.X.f16951a.h());
                        break;
                }
                return g00.b0.a;
            }
        });
    }

    @Override
    public final void i(b3.o0 o0Var) throws Throwable {
        b3.o0 o0Var2 = o0Var;
        k2.b bVar = o0Var2.A;
        o0Var2.a();
        z0.b bVarD = this.T.d();
        m3.n0 n0VarC = this.S.c();
        if (n0VarC == null) {
            return;
        }
        g00.k kVar = bVarD.F;
        g00.k kVar2 = bVarD.F;
        long j9 = bVarD.D;
        if (kVar != null) {
            int i10 = ((z0.i) kVar.A).f17000a;
            long j10 = ((m3.q0) kVar.B).f10520a;
            if (!m3.q0.d(j10)) {
                i2.g gVarJ = n0VarC.j(m3.q0.g(j10), m3.q0.f(j10));
                m3.r0 r0Var = n0VarC.f10496a.f10484b;
                if (i10 == 1) {
                    i2.q qVarB = r0Var.b();
                    if (qVarB != null) {
                        k2.d.P0(o0Var2, gVarJ, qVarB, 0.2f, null, 56);
                        o0Var2 = o0Var;
                    } else {
                        long jC = r0Var.c();
                        if (jC == 16) {
                            jC = i2.t.f7162b;
                        }
                        o0Var2 = o0Var;
                        k2.d.X0(o0Var2, gVarJ, i2.t.b(i2.t.d(jC) * 0.2f, jC), 0.0f, null, 60);
                    }
                } else {
                    o0Var2 = o0Var;
                    k2.d.X0(o0Var2, gVarJ, ((e1.a1) b3.m.h(this, e1.b1.f4956a)).f4955b, 0.0f, null, 60);
                }
            }
        }
        if (m3.q0.d(j9)) {
            m3.h0.h(bVar.B.n(), n0VarC);
            if (kVar2 == null) {
                i2.q qVar = this.V;
                boolean zE1 = E1();
                d0 d0Var = this.f124b0;
                b1.e0 e0Var = this.U;
                float f3 = m1.f98a;
                float fH = d0Var != null ? d0Var.f32c.h() : 0.0f;
                if (fH != 0.0f && zE1) {
                    h2.c cVarK = e0Var.k();
                    float f10 = cVarK.f6548c;
                    float f11 = cVarK.f6546a;
                    float f12 = f10 - f11;
                    o0Var2.A.e(qVar, (((long) Float.floatToRawIntBits((f12 / 2.0f) + f11)) << 32) | (((long) Float.floatToRawIntBits(cVarK.f6547b)) & 4294967295L), cVarK.b(), f12, fH);
                }
            }
        } else {
            if (kVar2 == null) {
                float f13 = m1.f98a;
                int iG = m3.q0.g(j9);
                int iF = m3.q0.f(j9);
                if (iG != iF) {
                    k2.d.X0(o0Var2, n0VarC.j(iG, iF), ((e1.a1) b3.m.h(this, e1.b1.f4956a)).f4955b, 0.0f, null, 60);
                }
            }
            m3.h0.h(bVar.B.n(), n0VarC);
        }
        this.f130h0.i(o0Var2);
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        this.f130h0.m1(a0Var);
    }

    @Override
    public final void t1() {
        if (this.Q && E1()) {
            F1();
        }
    }
}
