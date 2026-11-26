package d0;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class o0 extends b3.l implements b3.e2, s2.c, b3.j, z.i0 {
    public q1 Q;
    public u00.k R;
    public boolean S;
    public f0.i T;
    public z.j0 U;
    public c40.h V;
    public f0.b W;
    public boolean X;
    public boolean Y;
    public p Z;

    public s f4476a0;

    public r f4477b0;

    public q f4478c0;

    public g3 f4479d0;

    public o9.q f4480e0;

    public a8.i0 f4482g0;

    public c1 f4483h0;

    public long f4481f0 = 9205357640488583168L;

    public long f4484i0 = 0;

    public o0(u00.k kVar, boolean z10, f0.i iVar, q1 q1Var) {
        this.Q = q1Var;
        this.R = kVar;
        this.S = z10;
        this.T = iVar;
    }

    public static final Object E1(o0 o0Var, m00.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(o0Var, cVar);
            }
        } else {
            k0Var = new k0(o0Var, cVar);
        }
        Object obj = k0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = k0Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            f0.b bVar = o0Var.W;
            if (bVar != null) {
                f0.i iVar = o0Var.T;
                if (iVar != null) {
                    f0.a aVar2 = new f0.a(bVar);
                    k0Var.C = 1;
                    if (iVar.a(aVar2, k0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            o0Var.O1(new w(false, 0L));
            return g00.b0.a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        o0Var.W = null;
        o0Var.O1(new w(false, 0L));
        return g00.b0.a;
    }

    public static final Object F1(o0 o0Var, v vVar, m00.c cVar) {
        l0 l0Var;
        f0.i iVar;
        f0.b bVar;
        v vVar2;
        f0.b bVar2;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i10 = l0Var.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l0Var.E = i10 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(o0Var, cVar);
            }
        } else {
            l0Var = new l0(o0Var, cVar);
        }
        Object obj = l0Var.C;
        l00.a aVar = l00.a.A;
        int i11 = l0Var.E;
        if (i11 == 0) {
            ri.t1.O(obj);
            f0.b bVar3 = o0Var.W;
            if (bVar3 != null && (iVar = o0Var.T) != null) {
                f0.a aVar2 = new f0.a(bVar3);
                l0Var.A = vVar;
                l0Var.E = 1;
                if (iVar.a(aVar2, l0Var) != aVar) {
                }
                return aVar;
            }
            o0Var.W = bVar;
            o0Var.N1(vVar.f4523a);
            return g00.b0.a;
        }
        if (i11 == 1) {
            vVar = l0Var.A;
            ri.t1.O(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = l0Var.B;
            vVar2 = l0Var.A;
            ri.t1.O(obj);
        }
        bVar = bVar2;
        vVar = vVar2;
        o0Var.W = bVar;
        o0Var.N1(vVar.f4523a);
        return g00.b0.a;
        bVar = new f0.b();
        f0.i iVar2 = o0Var.T;
        if (iVar2 != null) {
            l0Var.A = vVar;
            l0Var.B = bVar;
            l0Var.E = 2;
            if (iVar2.a(bVar, l0Var) != aVar) {
                vVar2 = vVar;
                bVar2 = bVar;
                bVar = bVar2;
                vVar = vVar2;
            }
            return aVar;
        }
        o0Var.W = bVar;
        o0Var.N1(vVar.f4523a);
        return g00.b0.a;
    }

    public static final Object G1(o0 o0Var, w wVar, m00.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i10 = m0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(o0Var, cVar);
            }
        } else {
            m0Var = new m0(o0Var, cVar);
        }
        Object obj = m0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = m0Var.D;
        if (i11 == 0) {
            ri.t1.O(obj);
            f0.b bVar = o0Var.W;
            if (bVar != null) {
                f0.i iVar = o0Var.T;
                if (iVar != null) {
                    f0.c cVar2 = new f0.c(bVar);
                    m0Var.A = wVar;
                    m0Var.D = 1;
                    if (iVar.a(cVar2, m0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            o0Var.O1(wVar);
            return g00.b0.a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wVar = m0Var.A;
        ri.t1.O(obj);
        o0Var.W = null;
        o0Var.O1(wVar);
        return g00.b0.a;
    }

    public static void L1(o0 o0Var, v2.s sVar, long j9, long j10, int i10) {
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        r rVar = o0Var.f4477b0;
        if (rVar == null) {
            rVar = new r();
            rVar.f4496b = null;
            rVar.f4497c = Long.MAX_VALUE;
            rVar.f4498d = false;
            o0Var.f4477b0 = rVar;
        }
        rVar.f4496b = sVar;
        rVar.f4497c = j9;
        a8.i0 i0Var = o0Var.f4482g0;
        if (i0Var == null) {
            o0Var.f4482g0 = new a8.i0(o0Var.Q);
        } else {
            i0Var.C = o0Var.Q;
            i0Var.B = j10;
        }
        rVar.f4498d = false;
        o0Var.f4479d0 = rVar;
    }

    public void A(v2.k kVar, v2.l lVar, long j9) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z10 = true;
        this.Y = true;
        if (this.U == null) {
            z.j0 j0Var = new z.j0(this);
            B1(j0Var);
            this.U = j0Var;
        }
        if (this.S) {
            if (this.f4479d0 == null) {
                p pVar = this.Z;
                if (pVar == null) {
                    o oVar = o.C;
                    pVar = new p();
                    pVar.f4485b = oVar;
                    pVar.f4486c = false;
                    this.Z = pVar;
                }
                this.f4479d0 = pVar;
            }
            g3 g3Var = this.f4479d0;
            if (g3Var == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            if (g3Var instanceof p) {
                p pVar2 = (p) g3Var;
                if (!kVar.f15387a.isEmpty() && f3.e(kVar, false)) {
                    v2.s sVar = (v2.s) h00.q.L0((List) kVar.f15387a);
                    o oVar2 = j0.f4441a[pVar2.f4485b.ordinal()] == 1 ? !T1() ? o.A : o.B : pVar2.f4485b;
                    pVar2.f4485b = oVar2;
                    if (lVar == v2.l.A && oVar2 == o.B) {
                        sVar.a();
                        pVar2.f4486c = true;
                    }
                    if (lVar == v2.l.B) {
                        if (oVar2 == o.A) {
                            L1(this, sVar, sVar.f15399a, 0L, 12);
                            return;
                        }
                        if (pVar2.f4486c) {
                            S1(sVar, sVar, 0L);
                            R1(0L, sVar);
                            long j10 = sVar.f15399a;
                            s sVar2 = this.f4476a0;
                            if (sVar2 == null) {
                                sVar2 = new s();
                                sVar2.f4501b = Long.MAX_VALUE;
                                this.f4476a0 = sVar2;
                            }
                            sVar2.f4501b = j10;
                            this.f4479d0 = sVar2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = null;
            if (g3Var instanceof r) {
                r rVar = (r) g3Var;
                if (lVar == v2.l.A) {
                    return;
                }
                ?? r4 = kVar.f15387a;
                int size = r4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r4.get(i10);
                    if (v2.r.e(((v2.s) obj3).f15399a, rVar.f4497c)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                v2.s sVar3 = (v2.s) obj3;
                if (sVar3 == null) {
                    int size2 = r4.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            obj4 = null;
                            break;
                        }
                        obj4 = r4.get(i11);
                        if (((v2.s) obj4).f15402d) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    sVar3 = (v2.s) obj4;
                    if (sVar3 == null) {
                        J1();
                        return;
                    }
                    rVar.f4497c = sVar3.f15399a;
                }
                if (lVar == v2.l.B) {
                    if (sVar3.b()) {
                        v2.s sVar4 = rVar.f4496b;
                        if (sVar4 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j11 = rVar.f4497c;
                        a8.i0 i0Var = this.f4482g0;
                        if (i0Var == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        K1(sVar4, j11, i0Var);
                    } else if (v2.r.d(sVar3)) {
                        int size3 = r4.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            Object obj6 = r4.get(i12);
                            if (((v2.s) obj6).f15402d) {
                                obj5 = obj6;
                                break;
                            }
                        }
                        v2.s sVar5 = (v2.s) obj5;
                        if (sVar5 == null) {
                            J1();
                        } else {
                            rVar.f4497c = sVar5.f15399a;
                        }
                    } else {
                        float fI = i0.i((c3.c3) b3.m.h(this, c3.o1.f2744t), sVar3.f15407i);
                        a8.i0 i0Var2 = this.f4482g0;
                        if (i0Var2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long jF = i0Var2.F(fI, v2.r.h(sVar3, true), true);
                        if ((9223372034707292159L & jF) != 9205357640488583168L) {
                            boolean zO1 = o1(sVar3);
                            z.i0 i0VarJ = z.n.j(this);
                            boolean z11 = i0VarJ != null && i0VarJ.o1(sVar3);
                            if (zO1 || !z11) {
                                sVar3.a();
                                v2.s sVar6 = rVar.f4496b;
                                kotlin.jvm.internal.m.b(sVar6);
                                S1(sVar6, sVar3, jF);
                                R1(jF, sVar3);
                                long j12 = sVar3.f15399a;
                                s sVar7 = this.f4476a0;
                                if (sVar7 == null) {
                                    sVar7 = new s();
                                    sVar7.f4501b = Long.MAX_VALUE;
                                    this.f4476a0 = sVar7;
                                }
                                sVar7.f4501b = j12;
                                this.f4479d0 = sVar7;
                            } else {
                                rVar.f4498d = true;
                            }
                        } else {
                            rVar.f4498d = true;
                        }
                    }
                }
                if (lVar == v2.l.C && rVar.f4498d) {
                    if (!sVar3.b()) {
                        rVar.f4498d = false;
                        return;
                    }
                    v2.s sVar8 = rVar.f4496b;
                    if (sVar8 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j13 = rVar.f4497c;
                    a8.i0 i0Var3 = this.f4482g0;
                    if (i0Var3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    K1(sVar8, j13, i0Var3);
                    return;
                }
                return;
            }
            if (g3Var instanceof q) {
                q qVar = (q) g3Var;
                if (lVar != v2.l.C) {
                    return;
                }
                ?? r7 = kVar.f15387a;
                int size4 = r7.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    if (((v2.s) r7.get(i13)).b()) {
                        z10 = false;
                        break;
                    }
                }
                int size5 = r7.size();
                for (int i14 = 0; i14 < size5; i14++) {
                    if (((v2.s) r7.get(i14)).f15402d) {
                        if (r7.isEmpty()) {
                            break;
                        }
                        if (z10) {
                            long j14 = ((v2.s) h00.q.L0((List) r7)).f15401c;
                            v2.s sVar9 = qVar.f4492b;
                            kotlin.jvm.internal.m.b(sVar9);
                            long jE = h2.b.e(j14, sVar9.f15401c);
                            v2.s sVar10 = qVar.f4492b;
                            if (sVar10 == null) {
                                throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                            }
                            L1(this, sVar10, qVar.f4493c, jE, 8);
                            return;
                        }
                        return;
                    }
                }
                J1();
                return;
            }
            if (!(g3Var instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            s sVar11 = (s) g3Var;
            if (lVar != v2.l.B) {
                return;
            }
            long j15 = sVar11.f4501b;
            ?? r10 = kVar.f15387a;
            int size6 = r10.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size6) {
                    obj = null;
                    break;
                }
                obj = r10.get(i15);
                if (v2.r.e(((v2.s) obj).f15399a, j15)) {
                    break;
                } else {
                    i15++;
                }
            }
            v2.s sVar12 = (v2.s) obj;
            if (sVar12 == null) {
                return;
            }
            boolean zD = v2.r.d(sVar12);
            t tVar = t.f4509a;
            if (!zD) {
                if (sVar12.b()) {
                    P1().j(tVar);
                    return;
                } else {
                    if (h2.b.c(v2.r.h(sVar12, true)) == 0.0f) {
                        return;
                    }
                    R1(v2.r.h(sVar12, false), sVar12);
                    sVar12.a();
                    return;
                }
            }
            ?? r11 = kVar.f15387a;
            int size7 = r11.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size7) {
                    obj2 = null;
                    break;
                }
                obj2 = r11.get(i16);
                if (((v2.s) obj2).f15402d) {
                    break;
                } else {
                    i16++;
                }
            }
            v2.s sVar13 = (v2.s) obj2;
            if (sVar13 != null) {
                sVar11.f4501b = sVar13.f15399a;
                return;
            }
            if (sVar12.b() || !v2.r.d(sVar12)) {
                P1().j(tVar);
            } else {
                kh.n.x(Q1(), sVar12, 0L);
                float f3 = ((c3.c3) b3.m.h(this, c3.o1.f2744t)).f();
                long jG = Q1().G(p30.f.U(f3, f3));
                e5.g gVar = (e5.g) Q1().B;
                w2.c cVar = (w2.c) gVar.f5099c;
                h00.n.z0((Object) null, cVar.f15836d);
                cVar.f15837e = 0;
                w2.c cVar2 = (w2.c) gVar.f5097a;
                h00.n.z0((Object) null, cVar2.f15836d);
                cVar2.f15837e = 0;
                gVar.f5098b = 0L;
                P1().j(new w(false, r0.b(jG)));
                this.Y = false;
            }
            J1();
        }
    }

    @Override
    public final void C0() {
        c1 c1Var = this.f4483h0;
        if (c1Var != null) {
            c1Var.a();
            o0 o0Var = c1Var.f4408a;
            if (o0Var.X) {
                o0Var.M1(t.f4509a);
            }
            c1Var.f4414g = null;
            qd.j0 j0Var = c1Var.f4418k;
            j0Var.B = 0;
            ((u.y) j0Var.C).f14912b = 0;
        }
    }

    @Override
    public final boolean H0(s2.b bVar) {
        return g3.f(bVar) && this.S;
    }

    public final void H1() {
        f0.b bVar = this.W;
        if (bVar != null) {
            f0.i iVar = this.T;
            if (iVar != null) {
                iVar.b(new f0.a(bVar));
            }
            this.W = null;
        }
    }

    public abstract Object I1(n0 n0Var, n0 n0Var2);

    public final void J1() {
        p pVar = this.Z;
        if (pVar == null) {
            o oVar = o.C;
            pVar = new p();
            pVar.f4485b = oVar;
            pVar.f4486c = false;
            this.Z = pVar;
        }
        pVar.f4485b = o.C;
        pVar.f4486c = false;
        this.f4479d0 = pVar;
    }

    public final void K1(v2.s sVar, long j9, a8.i0 i0Var) {
        q qVar = this.f4478c0;
        if (qVar == null) {
            qVar = new q();
            qVar.f4492b = null;
            qVar.f4493c = Long.MAX_VALUE;
            this.f4478c0 = qVar;
        }
        qVar.f4492b = sVar;
        qVar.f4493c = j9;
        i0Var.B = 0L;
        this.f4479d0 = qVar;
    }

    public final void M1(x xVar) {
        if ((xVar instanceof v) && !this.X) {
            this.X = true;
            U1();
        }
        P1().j(xVar);
    }

    public abstract void N1(long j9);

    public abstract void O1(w wVar);

    public final c40.l P1() {
        c40.h hVar = this.V;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    public final o9.q Q1() {
        o9.q qVar = this.f4480e0;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void R1(long j9, v2.s sVar) {
        long jG = b3.m.x(this.A).G(0L);
        if (!h2.b.b(this.f4481f0, 9205357640488583168L) && !h2.b.b(jG, this.f4481f0)) {
            this.f4484i0 = h2.b.f(this.f4484i0, h2.b.e(jG, this.f4481f0));
        }
        this.f4481f0 = jG;
        kh.n.x(Q1(), sVar, this.f4484i0);
        P1().j(new u(false, j9));
    }

    public final void S1(v2.s sVar, v2.s sVar2, long j9) {
        if (this.f4480e0 == null) {
            this.f4480e0 = new o9.q(28);
        }
        kh.n.x(Q1(), sVar, 0L);
        long jE = h2.b.e(sVar2.f15401c, j9);
        this.f4484i0 = 0L;
        if (((Boolean) this.R.invoke(new v2.a0(sVar.f15407i))).booleanValue()) {
            if (!this.X) {
                if (this.V == null) {
                    this.V = ri.t1.b(Integer.MAX_VALUE, 6, null);
                }
                U1();
            }
            this.f4481f0 = b3.m.x(this).G(0L);
            P1().j(new v(jE));
        }
    }

    public abstract boolean T1();

    @Override
    public final void U(c50.h hVar, v2.l lVar) throws NoWhenBranchMatchedException {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10 = hVar.B;
        ArrayList arrayList = (ArrayList) hVar.C;
        if (this.U == null) {
            z.j0 j0Var = new z.j0(this);
            B1(j0Var);
            this.U = j0Var;
        }
        if (this.S) {
            if (this.f4483h0 == null) {
                this.f4483h0 = new c1(this);
            }
            c1 c1Var = this.f4483h0;
            if (c1Var != null) {
                o0 o0Var = c1Var.f4408a;
                int i11 = 0;
                if (c1Var.f4413f == null) {
                    x0 x0Var = c1Var.f4409b;
                    if (x0Var == null) {
                        w0 w0Var = w0.C;
                        x0Var = new x0();
                        x0Var.f4526b = w0Var;
                        x0Var.f4527c = false;
                        c1Var.f4409b = x0Var;
                    }
                    c1Var.f4413f = x0Var;
                }
                g3 g3Var = c1Var.f4413f;
                if (g3Var == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z10 = true;
                if (g3Var instanceof x0) {
                    x0 x0Var2 = (x0) g3Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i11 < size) {
                        if (!g3.f((s2.b) arrayList.get(i11))) {
                            return;
                        } else {
                            i11++;
                        }
                    }
                    s2.b bVar = (s2.b) h00.q.L0(arrayList);
                    w0 w0Var2 = b1.f4406a[x0Var2.f4526b.ordinal()] == 1 ? !o0Var.T1() ? w0.A : w0.B : x0Var2.f4526b;
                    x0Var2.f4526b = w0Var2;
                    if (lVar == v2.l.A && w0Var2 == w0.B) {
                        bVar.f13634i = true;
                        x0Var2.f4527c = true;
                    }
                    if (lVar == v2.l.B) {
                        if (w0Var2 == w0.A) {
                            c1.c(c1Var, bVar, bVar.f13626a, 0L, 12);
                            return;
                        }
                        if (x0Var2.f4527c) {
                            c1Var.f(bVar, bVar, new s2.a(i10), 0L);
                            c1Var.e(bVar, new s2.a(i10), 0L);
                            long j9 = bVar.f13626a;
                            a1 a1Var = c1Var.f4410c;
                            if (a1Var == null) {
                                a1Var = new a1();
                                a1Var.f4402b = Long.MAX_VALUE;
                                c1Var.f4410c = a1Var;
                            }
                            a1Var.f4402b = j9;
                            c1Var.f4413f = a1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(g3Var instanceof z0)) {
                    if (g3Var instanceof y0) {
                        y0 y0Var = (y0) g3Var;
                        if (lVar != v2.l.C) {
                            return;
                        }
                        int size2 = arrayList.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            if (((s2.b) arrayList.get(i12)).f13634i) {
                                z10 = false;
                                break;
                            }
                        }
                        int size3 = arrayList.size();
                        while (i11 < size3) {
                            if (((s2.b) arrayList.get(i11)).f13629d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z10) {
                                    long jH = g3.h((s2.b) h00.q.L0(arrayList), o0Var.Q, new s2.a(i10));
                                    s2.b bVar2 = y0Var.f4528b;
                                    kotlin.jvm.internal.m.b(bVar2);
                                    long jE = h2.b.e(jH, g3.h(bVar2, o0Var.Q, new s2.a(i10)));
                                    s2.b bVar3 = y0Var.f4528b;
                                    if (bVar3 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    c1.c(c1Var, bVar3, y0Var.f4529c, jE, 8);
                                    return;
                                }
                                return;
                            }
                            i11++;
                        }
                        c1Var.a();
                        return;
                    }
                    if (!(g3Var instanceof a1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a1 a1Var2 = (a1) g3Var;
                    if (lVar != v2.l.B) {
                        return;
                    }
                    long j10 = a1Var2.f4402b;
                    int size4 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i13);
                        if (v2.r.e(((s2.b) obj).f13626a, j10)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    s2.b bVar4 = (s2.b) obj;
                    if (bVar4 == null) {
                        return;
                    }
                    boolean zB = g3.b(bVar4);
                    t tVar = t.f4509a;
                    if (!zB) {
                        if (bVar4.f13634i) {
                            o0Var.M1(tVar);
                            return;
                        } else {
                            if (h2.b.c(g3.g(bVar4, o0Var.Q, new s2.a(i10), true)) == 0.0f) {
                                return;
                            }
                            c1Var.e(bVar4, new s2.a(i10), g3.g(bVar4, o0Var.Q, new s2.a(i10), false));
                            bVar4.f13634i = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i14);
                        if (((s2.b) obj2).f13629d) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    s2.b bVar5 = (s2.b) obj2;
                    if (bVar5 != null) {
                        a1Var2.f4402b = bVar5.f13626a;
                        return;
                    }
                    if (bVar4.f13634i || !g3.b(bVar4)) {
                        o0Var.M1(tVar);
                    } else {
                        g3.a(c1Var.d(), bVar4, o0Var.Q, new s2.a(i10), c1Var.f4417j, c1Var.l);
                        float f3 = ((c3.c3) b3.m.h(o0Var, c3.o1.f2744t)).f();
                        long jG = c1Var.d().G(p30.f.U(f3, f3));
                        e5.g gVar = (e5.g) c1Var.d().B;
                        w2.c cVar = (w2.c) gVar.f5099c;
                        h00.n.z0((Object) null, cVar.f15836d);
                        cVar.f15837e = 0;
                        w2.c cVar2 = (w2.c) gVar.f5097a;
                        h00.n.z0((Object) null, cVar2.f15836d);
                        cVar2.f15837e = 0;
                        gVar.f5098b = 0L;
                        o0Var.M1(new w(true, r0.b(jG)));
                    }
                    c1Var.a();
                    return;
                }
                z0 z0Var = (z0) g3Var;
                if (lVar == v2.l.A) {
                    return;
                }
                int size6 = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i15);
                    int i16 = i15;
                    if (v2.r.e(((s2.b) obj3).f13626a, z0Var.f4531c)) {
                        break;
                    } else {
                        i15 = i16 + 1;
                    }
                }
                s2.b bVar6 = (s2.b) obj3;
                if (bVar6 == null) {
                    int size7 = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i17);
                        if (((s2.b) obj5).f13629d) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    bVar6 = (s2.b) obj5;
                    if (bVar6 == null) {
                        c1Var.a();
                        return;
                    }
                    z0Var.f4531c = bVar6.f13626a;
                }
                if (lVar == v2.l.B) {
                    if (bVar6.f13634i) {
                        s2.b bVar7 = z0Var.f4530b;
                        if (bVar7 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j11 = z0Var.f4531c;
                        a8.i0 i0Var = c1Var.f4416i;
                        if (i0Var == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        c1Var.b(bVar7, j11, i0Var);
                    } else if (g3.b(bVar6)) {
                        int size8 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size8) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i18);
                            if (((s2.b) obj6).f13629d) {
                                obj4 = obj6;
                                break;
                            }
                            i18++;
                        }
                        s2.b bVar8 = (s2.b) obj4;
                        if (bVar8 == null) {
                            c1Var.a();
                        } else {
                            z0Var.f4531c = bVar8.f13626a;
                        }
                    } else {
                        c3.c3 c3Var = (c3.c3) b3.m.h(o0Var, c3.o1.f2744t);
                        float f10 = i0.f4433a;
                        float fG = c3Var.g();
                        a8.i0 i0Var2 = c1Var.f4416i;
                        if (i0Var2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long jF = i0Var2.F(fG, g3.g(bVar6, o0Var.Q, new s2.a(i10), true), true);
                        if ((9223372034707292159L & jF) != 9205357640488583168L) {
                            bVar6.f13634i = true;
                            s2.b bVar9 = z0Var.f4530b;
                            kotlin.jvm.internal.m.b(bVar9);
                            s2.b bVar10 = bVar6;
                            c1Var.f(bVar9, bVar10, new s2.a(i10), jF);
                            bVar6 = bVar10;
                            c1Var.e(bVar6, new s2.a(i10), jF);
                            long j12 = bVar6.f13626a;
                            a1 a1Var3 = c1Var.f4410c;
                            if (a1Var3 == null) {
                                a1Var3 = new a1();
                                a1Var3.f4402b = Long.MAX_VALUE;
                                c1Var.f4410c = a1Var3;
                            }
                            a1Var3.f4402b = j12;
                            c1Var.f4413f = a1Var3;
                        } else {
                            z0Var.f4532d = true;
                        }
                    }
                }
                if (lVar == v2.l.C && z0Var.f4532d) {
                    if (!bVar6.f13634i) {
                        z0Var.f4532d = false;
                        return;
                    }
                    s2.b bVar11 = z0Var.f4530b;
                    if (bVar11 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j13 = z0Var.f4531c;
                    a8.i0 i0Var3 = c1Var.f4416i;
                    if (i0Var3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    c1Var.b(bVar11, j13, i0Var3);
                }
            }
        }
    }

    public final void U1() {
        this.X = true;
        if (this.V == null) {
            this.V = ri.t1.b(Integer.MAX_VALUE, 6, null);
        }
        a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new n0(this, null), 3);
    }

    public final void V1(u00.k kVar, boolean z10, f0.i iVar, q1 q1Var, boolean z11) {
        this.R = kVar;
        boolean z12 = true;
        if (this.S != z10) {
            this.S = z10;
            if (!z10) {
                H1();
                this.f4483h0 = null;
            }
            z11 = true;
        }
        if (!kotlin.jvm.internal.m.a(this.T, iVar)) {
            H1();
            this.T = iVar;
        }
        if (this.Q != q1Var) {
            this.Q = q1Var;
        } else {
            z12 = z11;
        }
        if (z12) {
            boolean z13 = this.Y;
            t tVar = t.f4509a;
            if (z13) {
                J1();
                if (this.X) {
                    P1().j(tVar);
                }
                this.f4480e0 = null;
            }
            c1 c1Var = this.f4483h0;
            if (c1Var != null) {
                c1Var.a();
                o0 o0Var = c1Var.f4408a;
                if (o0Var.X) {
                    o0Var.M1(tVar);
                }
                c1Var.f4414g = null;
                qd.j0 j0Var = c1Var.f4418k;
                j0Var.B = 0;
                ((u.y) j0Var.C).f14912b = 0;
            }
        }
    }

    @Override
    public final void X() {
        if (this.Y) {
            J1();
            if (this.X) {
                P1().j(t.f4509a);
            }
            this.f4480e0 = null;
        }
        this.Y = false;
    }

    @Override
    public final boolean o1(v2.s sVar) {
        if (v2.r.b(sVar)) {
            return this.S;
        }
        if (!v2.r.d(sVar)) {
            if (this.f4482g0 == null) {
                this.f4482g0 = new a8.i0(this.Q);
            }
            float fG = ((c3.c3) b3.m.h(this, c3.o1.f2744t)).g();
            long jH = v2.r.h(sVar, false);
            a8.i0 i0Var = this.f4482g0;
            if (i0Var == null) {
                throw new IllegalArgumentException("Touch slop detector not initialized.");
            }
            if (!h2.b.b(i0Var.F(fG, jH, false), 9205357640488583168L)) {
                long jF = h2.b.f(i0Var.B, jH);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jF & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jF >> 32))))) * 180)) / 3.141592653589793d;
                q1 q1Var = (q1) i0Var.C;
                int i10 = q1Var == null ? -1 : h3.f4432a[q1Var.ordinal()];
                if (i10 == 1 ? dAtan2 < 30.0d : !(i10 != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void u1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        this.X = false;
        H1();
        this.f4484i0 = 0L;
        z.j0 j0Var = this.U;
        if (j0Var != null) {
            C1(j0Var);
        }
        this.U = null;
    }
}
