package z;

import android.view.KeyEvent;
import b3.e2;
import b3.j2;
import b3.o2;
import b3.v1;
import c3.c3;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class h extends b3.l implements e2, t2.e, j2, o2, b3.j, v1, s2.c, i0 {

    public static final l1 f16916k0 = new l1();
    public f0.i Q;
    public v0 R;
    public boolean S;
    public String T;
    public j3.k U;
    public boolean V;
    public u00.a W;
    public final g0 X;
    public v0 Y;
    public j0 Z;

    public b3.k f16917a0;

    public f0.k f16918b0;

    public f0.f f16919c0;

    public final u.z f16920d0;

    public long f16921e0;

    public f0.k f16922f0;

    public f0.i f16923g0;

    public boolean f16924h0;

    public a40.u1 f16925i0;

    public final l1 f16926j0;

    public h(f0.i iVar, v0 v0Var, boolean z10, boolean z11, String str, j3.k kVar, u00.a aVar) {
        this.Q = iVar;
        this.R = v0Var;
        this.S = z10;
        this.T = str;
        this.U = kVar;
        this.V = z11;
        this.W = aVar;
        this.X = new g0(iVar, 0, new c(1, this, h.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i10 = u.o.f14880a;
        this.f16920d0 = new u.z(6);
        this.f16921e0 = 0L;
        f0.i iVar2 = this.Q;
        this.f16923g0 = iVar2;
        this.f16924h0 = iVar2 == null;
        this.f16926j0 = f16916k0;
    }

    @Override
    public void A(v2.k kVar, v2.l lVar, long j9) {
        long jI = kh.n.I(j9);
        this.f16921e0 = (((long) Float.floatToRawIntBits((int) (jI & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jI >> 32)) << 32);
        L1();
        if (this.V) {
            if (this.Z == null) {
                j0 j0Var = new j0(this);
                B1(j0Var);
                this.Z = j0Var;
            }
            if (lVar == v2.l.B) {
                int i10 = kVar.f15392f;
                k00.c cVar = null;
                if (i10 == 4) {
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new g(this, cVar, 0), 3);
                } else if (i10 == 5) {
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new g(this, cVar, 1), 3);
                }
            }
        }
    }

    public void E1(j3.a0 a0Var) {
    }

    public final void F1() {
        f0.i iVar = this.Q;
        u.z zVar = this.f16920d0;
        if (iVar != null) {
            f0.k kVar = this.f16918b0;
            if (kVar != null) {
                iVar.b(new f0.j(kVar));
            }
            f0.k kVar2 = this.f16922f0;
            if (kVar2 != null) {
                iVar.b(new f0.j(kVar2));
            }
            f0.f fVar = this.f16919c0;
            if (fVar != null) {
                iVar.b(new f0.g(fVar));
            }
            Object[] objArr = zVar.f14915c;
            long[] jArr = zVar.f14913a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                iVar.b(new f0.j((f0.k) objArr[(i10 << 3) + i12]));
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.f16918b0 = null;
        this.f16922f0 = null;
        this.f16919c0 = null;
        zVar.a();
    }

    public final long G1(long j9) {
        long jB1 = b3.m.y(this).Z.b1(((c3) b3.m.h(this, c3.o1.f2744t)).e());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jB1 >> 32)) - ((int) (j9 >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void H1(boolean z10) {
        f0.i iVar = this.Q;
        if (iVar != null) {
            a40.u1 u1Var = this.f16925i0;
            if (u1Var == null || !u1Var.a()) {
                f0.k kVar = z10 ? this.f16922f0 : this.f16918b0;
                if (kVar != null) {
                    f0.j jVar = new f0.j(kVar);
                    a40.e1 e1Var = p1().A.get(a40.w.B);
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new pz.k(iVar, jVar, e1Var != null ? e1Var.f0(new ym.j0(iVar, jVar, 1)) : null, (k00.c) null, 24), 3);
                }
            } else {
                a40.u1 u1Var2 = this.f16925i0;
                if (u1Var2 != null) {
                    u1Var2.i((CancellationException) null);
                }
            }
            if (z10) {
                this.f16922f0 = null;
            } else {
                this.f16918b0 = null;
            }
        }
    }

    public final void I1(boolean z10, long j9) {
        f0.i iVar = this.Q;
        if (iVar != null) {
            a40.u1 u1Var = this.f16925i0;
            if (u1Var == null || !u1Var.a()) {
                f0.k kVar = z10 ? this.f16922f0 : this.f16918b0;
                if (kVar != null) {
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new d(kVar, iVar, null), 3);
                }
            } else {
                u1Var.i((CancellationException) null);
                a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new b1.w(u1Var, j9, iVar, (k00.c) null, 11), 3);
            }
            if (z10) {
                this.f16922f0 = null;
            } else {
                this.f16918b0 = null;
            }
        }
    }

    @Override
    public final void J0() {
        if (this.S) {
            b3.m.t(this, new a(this, 0));
        }
    }

    public final void J1(s2.b bVar) {
        f0.i iVar = this.Q;
        if (iVar != null) {
            f0.k kVar = new f0.k(bVar.f13628c);
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            b3.m.B(this, j0.P, new rx.c(22, new ym.j0(bVar, vVar, 4)));
            k00.c cVar = null;
            if (vVar.A || w.a(this)) {
                this.f16925i0 = a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new e(iVar, kVar, this, cVar, 0), 3);
            } else {
                this.f16922f0 = kVar;
                a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new d(iVar, kVar, cVar, 1), 3);
            }
        }
    }

    public final void K1(v2.s sVar) {
        f0.i iVar = this.Q;
        if (iVar != null) {
            f0.k kVar = new f0.k(sVar.f15401c);
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            b3.m.B(this, j0.P, new rx.c(22, new ym.j0(sVar, vVar, 5)));
            k00.c cVar = null;
            if (vVar.A || w.a(this)) {
                this.f16925i0 = a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new e(iVar, kVar, this, cVar, 1), 3);
            } else {
                this.f16918b0 = kVar;
                a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new d(iVar, kVar, cVar, 2), 3);
            }
        }
    }

    public final void L1() {
        if (this.f16917a0 != null) {
            return;
        }
        v0 v0Var = this.S ? this.Y : this.R;
        if (v0Var != null) {
            if (this.Q == null) {
                this.Q = new f0.i();
            }
            this.X.F1(this.Q);
            f0.i iVar = this.Q;
            kotlin.jvm.internal.m.b(iVar);
            b3.k kVarA = v0Var.a(iVar);
            B1(kVarA);
            this.f16917a0 = kVarA;
        }
    }

    public void M1() {
    }

    public abstract boolean N1(KeyEvent keyEvent);

    @Override
    public final boolean O(KeyEvent keyEvent) {
        boolean z10;
        L1();
        long jB = t2.d.b(keyEvent);
        boolean z11 = this.V;
        u.z zVar = this.f16920d0;
        if (z11 && t2.d.c(keyEvent) == 2 && androidx.compose.foundation.b.e(keyEvent)) {
            if (zVar.b(jB)) {
                z10 = false;
            } else {
                f0.k kVar = new f0.k(this.f16921e0);
                zVar.g(kVar, jB);
                if (this.Q != null) {
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new f(this, kVar, null, 2), 3);
                }
                z10 = true;
            }
            if (N1(keyEvent) || z10) {
                return true;
            }
            return false;
        }
        if (this.V && t2.d.c(keyEvent) == 1 && androidx.compose.foundation.b.e(keyEvent)) {
            f0.k kVar2 = (f0.k) zVar.f(jB);
            if (kVar2 != null) {
                if (this.Q != null) {
                    a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new f(this, kVar2, null, 3), 3);
                }
                O1(keyEvent);
            }
            if (kVar2 != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void O1(KeyEvent keyEvent);

    public final void P1(f0.i iVar, v0 v0Var, boolean z10, boolean z11, String str, j3.k kVar, u00.a aVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean z12;
        boolean z13;
        b3.k kVar2;
        if (kotlin.jvm.internal.m.a(this.f16923g0, iVar)) {
            z12 = false;
        } else {
            F1();
            this.f16923g0 = iVar;
            this.Q = iVar;
            z12 = true;
        }
        if (!kotlin.jvm.internal.m.a(this.R, v0Var)) {
            this.R = v0Var;
            z12 = true;
        }
        if (this.S != z10) {
            this.S = z10;
            if (z10) {
                J0();
            }
            z12 = true;
        }
        boolean z14 = this.V;
        g0 g0Var = this.X;
        if (z14 != z11) {
            if (z11) {
                B1(g0Var);
            } else {
                C1(g0Var);
                F1();
            }
            b3.m.o(this);
            this.V = z11;
        }
        if (!kotlin.jvm.internal.m.a(this.T, str)) {
            this.T = str;
            b3.m.o(this);
        }
        if (!kotlin.jvm.internal.m.a(this.U, kVar)) {
            this.U = kVar;
            b3.m.o(this);
        }
        this.W = aVar;
        boolean z15 = this.f16924h0;
        f0.i iVar2 = this.f16923g0;
        if (z15 != (iVar2 == null)) {
            boolean z16 = iVar2 == null;
            this.f16924h0 = z16;
            z13 = (z16 || this.f16917a0 != null) ? z12 : true;
        }
        if (z13 && ((kVar2 = this.f16917a0) != null || !this.f16924h0)) {
            if (kVar2 != null) {
                C1(kVar2);
            }
            this.f16917a0 = null;
            L1();
        }
        g0Var.F1(this.Q);
    }

    @Override
    public void X() {
        f0.f fVar;
        f0.i iVar = this.Q;
        if (iVar != null && (fVar = this.f16919c0) != null) {
            iVar.b(new f0.g(fVar));
        }
        this.f16919c0 = null;
    }

    @Override
    public final boolean i1() {
        return true;
    }

    @Override
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        j3.k kVar = this.U;
        if (kVar != null) {
            j3.y.k(a0Var, kVar.f7937a);
        }
        String str = this.T;
        a aVar = new a(this, 1);
        a10.w[] wVarArr = j3.y.f8004a;
        a0Var.a(j3.n.f7941b, new j3.a(str, aVar));
        if (this.V) {
            this.X.m1(a0Var);
        } else {
            a0Var.a(j3.w.f7987j, g00.b0.a);
        }
        E1(a0Var);
    }

    @Override
    public final Object o() {
        return this.f16926j0;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        J0();
        if (!this.f16924h0) {
            L1();
        }
        if (this.V) {
            B1(this.X);
        }
    }

    @Override
    public final void u1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        F1();
        if (this.f16923g0 == null) {
            this.Q = null;
        }
        b3.k kVar = this.f16917a0;
        if (kVar != null) {
            C1(kVar);
        }
        this.f16917a0 = null;
        j0 j0Var = this.Z;
        if (j0Var != null) {
            C1(j0Var);
        }
        this.Z = null;
    }
}
