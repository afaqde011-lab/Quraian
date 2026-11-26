package z;

import android.view.KeyEvent;
import c3.c3;
import d0.f3;
import d0.g3;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public final class z extends h {
    public boolean A0;

    public final u.z f16973l0;

    public final u.z f16974m0;

    public v2.s f16975n0;

    public a40.u1 f16976o0;

    public a40.u1 f16977p0;

    public boolean f16978q0;

    public boolean f16979r0;

    public long f16980s0;

    public boolean f16981t0;

    public s2.b f16982u0;

    public a40.u1 f16983v0;

    public a40.u1 f16984w0;

    public boolean f16985x0;

    public boolean f16986y0;

    public long f16987z0;

    public z(f0.i iVar, u00.a aVar) {
        super(iVar, null, false, true, null, null, aVar);
        int i10 = u.o.f14880a;
        this.f16973l0 = new u.z(6);
        this.f16974m0 = new u.z(6);
        this.f16980s0 = -1L;
        this.f16987z0 = -1L;
    }

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        super.A(kVar, lVar, j9);
        if (lVar != v2.l.B) {
            if (lVar != v2.l.C || this.f16975n0 == null || this.f16979r0) {
                return;
            }
            ?? r7 = kVar.f15387a;
            int size = r7.size();
            for (int i10 = 0; i10 < size; i10++) {
                v2.s sVar = (v2.s) r7.get(i10);
                if (sVar.b() && !sVar.equals(this.f16975n0)) {
                    Q1(false);
                    return;
                }
            }
            return;
        }
        if (this.f16975n0 == null) {
            if (f3.e(kVar, true)) {
                v2.s sVar2 = (v2.s) kVar.f15387a.get(0);
                sVar2.a();
                this.f16975n0 = sVar2;
                if (this.V) {
                    a40.u1 u1Var = this.f16977p0;
                    if (u1Var != null && u1Var.a()) {
                        ((c3) b3.m.h(this, c3.o1.f2744t)).getClass();
                        if (sVar2.f15400b - this.f16980s0 < 40) {
                            this.f16981t0 = true;
                            return;
                        }
                        this.f16978q0 = true;
                        a40.u1 u1Var2 = this.f16977p0;
                        if (u1Var2 != null) {
                            u1Var2.i((CancellationException) null);
                        }
                        this.f16977p0 = null;
                    }
                    this.f16979r0 = false;
                    K1(sVar2);
                    return;
                }
                return;
            }
            return;
        }
        int i11 = kVar.f15389c;
        ?? r10 = kVar.f15387a;
        if (this.f16979r0) {
            int size2 = r10.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (!v2.r.d((v2.s) r10.get(i12))) {
                    int size3 = r10.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        ((v2.s) r10.get(i13)).a();
                    }
                    return;
                }
            }
            v2.s sVar3 = (v2.s) r10.get(0);
            sVar3.a();
            long j10 = sVar3.f15400b;
            v2.s sVar4 = this.f16975n0;
            kotlin.jvm.internal.m.b(sVar4);
            S1(j10, sVar4);
            return;
        }
        int size4 = r10.size();
        for (int i14 = 0; i14 < size4; i14++) {
            if (!v2.r.c((v2.s) r10.get(i14))) {
                long jG1 = G1(j9);
                int size5 = r10.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    v2.s sVar5 = (v2.s) r10.get(i15);
                    if (sVar5.b() || v2.r.f(sVar5, j9, jG1)) {
                        Q1(false);
                        return;
                    }
                }
                return;
            }
        }
        v2.s sVar6 = (v2.s) r10.get(0);
        sVar6.a();
        long j11 = sVar6.f15400b;
        v2.s sVar7 = this.f16975n0;
        kotlin.jvm.internal.m.b(sVar7);
        S1(j11, sVar7);
    }

    @Override
    public final void C0() {
        Q1(true);
    }

    @Override
    public final void E1(j3.a0 a0Var) {
    }

    @Override
    public final void M1() {
        T1();
    }

    @Override
    public final boolean N1(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final void O1(KeyEvent keyEvent) {
        long jB = t2.d.b(keyEvent);
        u.z zVar = this.f16973l0;
        boolean z10 = false;
        if (zVar.d(jB) != null) {
            a40.e1 e1Var = (a40.e1) zVar.d(jB);
            if (e1Var != null) {
                if (e1Var.a()) {
                    e1Var.i((CancellationException) null);
                } else {
                    z10 = true;
                }
            }
            zVar.f(jB);
        }
        if (z10) {
            return;
        }
        this.W.invoke();
    }

    public final void Q1(boolean z10) {
        if (z10) {
            this.f16982u0 = null;
            a40.u1 u1Var = this.f16983v0;
            if (u1Var != null) {
                u1Var.i((CancellationException) null);
            }
            this.f16983v0 = null;
            a40.u1 u1Var2 = this.f16984w0;
            if (u1Var2 != null) {
                u1Var2.i((CancellationException) null);
            }
            this.f16984w0 = null;
            this.f16985x0 = false;
            this.f16986y0 = false;
            this.f16987z0 = -1L;
            this.A0 = false;
        } else {
            this.f16975n0 = null;
            a40.u1 u1Var3 = this.f16976o0;
            if (u1Var3 != null) {
                u1Var3.i((CancellationException) null);
            }
            this.f16976o0 = null;
            a40.u1 u1Var4 = this.f16977p0;
            if (u1Var4 != null) {
                u1Var4.i((CancellationException) null);
            }
            this.f16977p0 = null;
            this.f16978q0 = false;
            this.f16979r0 = false;
            this.f16980s0 = -1L;
            this.f16981t0 = false;
        }
        H1(z10);
    }

    public final void R1(long j9, s2.b bVar) {
        if (this.V && !this.A0) {
            I1(true, bVar.f13628c);
            this.f16987z0 = j9;
            if (!this.f16986y0 && !this.f16985x0) {
                this.W.invoke();
            }
        }
        this.f16982u0 = null;
        this.A0 = false;
        this.f16985x0 = false;
        a40.u1 u1Var = this.f16983v0;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.f16983v0 = null;
        this.f16986y0 = false;
    }

    public final void S1(long j9, v2.s sVar) {
        if (this.V && !this.f16981t0) {
            I1(false, sVar.f15401c);
            this.f16980s0 = j9;
            if (!this.f16979r0 && !this.f16978q0) {
                this.W.invoke();
            }
        }
        this.f16975n0 = null;
        this.f16981t0 = false;
        this.f16978q0 = false;
        a40.u1 u1Var = this.f16976o0;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.f16976o0 = null;
        this.f16979r0 = false;
    }

    public final void T1() {
        char c10;
        long j9;
        long j10;
        long j11;
        u.z zVar = this.f16973l0;
        Object[] objArr = zVar.f14915c;
        long[] jArr = zVar.f14913a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j12 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            j10 = 128;
            while (true) {
                long j13 = jArr[i10];
                j11 = 255;
                if ((((~j13) << c11) & j13 & j12) != j12) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & 255) < 128) {
                            ((a40.e1) objArr[(i10 << 3) + i12]).i((CancellationException) null);
                        }
                        j13 >>= 8;
                        i12++;
                        c11 = c11;
                        j12 = j12;
                    }
                    c10 = c11;
                    j9 = j12;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = c11;
                    j9 = j12;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c11 = c10;
                j12 = j9;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        zVar.a();
        u.z zVar2 = this.f16974m0;
        Object[] objArr2 = zVar2.f14915c;
        long[] jArr2 = zVar2.f14913a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr2[i13];
                if ((((~j14) << c10) & j14 & j9) == j9) {
                    if (i13 != length2) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & j11) < j10) {
                            ((y) objArr2[(i13 << 3) + i15]).getClass();
                            throw null;
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        zVar2.a();
    }

    @Override
    public final void U(c50.h hVar, v2.l lVar) {
        ArrayList arrayList = (ArrayList) hVar.C;
        L1();
        if (this.V && this.Z == null) {
            j0 j0Var = new j0(this);
            B1(j0Var);
            this.Z = j0Var;
        }
        int i10 = 0;
        if (lVar != v2.l.B) {
            if (lVar != v2.l.C || this.f16982u0 == null || this.f16986y0) {
                return;
            }
            int size = arrayList.size();
            while (i10 < size) {
                s2.b bVar = (s2.b) arrayList.get(i10);
                if (bVar.f13634i && !bVar.equals(this.f16982u0)) {
                    Q1(true);
                    return;
                }
                i10++;
            }
            return;
        }
        if (this.f16982u0 == null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (g3.f((s2.b) arrayList.get(i11))) {
                    s2.b bVar2 = (s2.b) arrayList.get(0);
                    bVar2.f13634i = true;
                    this.f16982u0 = bVar2;
                    if (this.V) {
                        a40.u1 u1Var = this.f16984w0;
                        if (u1Var != null && u1Var.a()) {
                            ((c3) b3.m.h(this, c3.o1.f2744t)).getClass();
                            if (bVar2.f13627b - this.f16987z0 < 40) {
                                this.A0 = true;
                                return;
                            }
                            this.f16985x0 = true;
                            a40.u1 u1Var2 = this.f16984w0;
                            if (u1Var2 != null) {
                                u1Var2.i((CancellationException) null);
                            }
                            this.f16984w0 = null;
                        }
                        this.f16986y0 = false;
                        J1(bVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f16986y0) {
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                s2.b bVar3 = (s2.b) arrayList.get(i12);
                if (!bVar3.f13633h || bVar3.f13629d) {
                    int size4 = arrayList.size();
                    while (i10 < size4) {
                        ((s2.b) arrayList.get(i10)).f13634i = true;
                        i10++;
                    }
                    return;
                }
            }
            s2.b bVar4 = (s2.b) arrayList.get(0);
            bVar4.f13634i = true;
            long j9 = bVar4.f13627b;
            s2.b bVar5 = this.f16982u0;
            kotlin.jvm.internal.m.b(bVar5);
            R1(j9, bVar5);
            return;
        }
        int size5 = arrayList.size();
        for (int i13 = 0; i13 < size5; i13++) {
            s2.b bVar6 = (s2.b) arrayList.get(i13);
            if (bVar6.f13634i || !bVar6.f13633h || bVar6.f13629d) {
                float fG = ((c3) b3.m.h(this, c3.o1.f2744t)).g();
                int size6 = arrayList.size();
                for (int i14 = 0; i14 < size6; i14++) {
                    s2.b bVar7 = (s2.b) arrayList.get(i14);
                    long j10 = bVar7.f13628c;
                    s2.b bVar8 = this.f16982u0;
                    kotlin.jvm.internal.m.b(bVar8);
                    boolean z10 = Math.abs(h2.b.c(h2.b.e(j10, bVar8.f13628c))) > fG;
                    if (bVar7.f13634i || z10) {
                        Q1(true);
                        return;
                    }
                }
                return;
            }
        }
        s2.b bVar9 = (s2.b) arrayList.get(0);
        bVar9.f13634i = true;
        long j11 = bVar9.f13627b;
        s2.b bVar10 = this.f16982u0;
        kotlin.jvm.internal.m.b(bVar10);
        R1(j11, bVar10);
    }

    @Override
    public final void X() {
        super.X();
        Q1(false);
    }

    @Override
    public final void v1() {
        T1();
    }
}
