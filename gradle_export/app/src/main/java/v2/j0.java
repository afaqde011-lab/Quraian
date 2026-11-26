package v2;

import a40.u1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import b3.e2;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import qd.s0;

public final class j0 extends b2.q implements v, y3.c, e2 {
    public Object O;
    public Object P;
    public Object[] Q;
    public PointerInputEventHandler R;
    public u1 S;
    public k T = f0.f15365a;
    public final m1.e U;
    public final m1.e V;
    public final m1.e W;
    public k X;
    public long Y;

    public j0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.O = obj;
        this.P = obj2;
        this.Q = objArr;
        this.R = pointerInputEventHandler;
        m1.e eVar = new m1.e(0, new i0[16]);
        this.U = eVar;
        this.V = eVar;
        this.W = new m1.e(0, new i0[16]);
        this.Y = 0L;
    }

    @Override
    public final void A(k kVar, l lVar, long j9) {
        this.Y = j9;
        if (lVar == l.A) {
            this.T = kVar;
        }
        k00.c cVar = null;
        if (this.S == null) {
            this.S = a40.c0.y(p1(), (k00.i) null, a40.a0.D, new l6.d(this, cVar, 18), 1);
        }
        C1(kVar, lVar);
        ?? r7 = kVar.f15387a;
        int size = r7.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!r.d((s) r7.get(i10))) {
                this.X = kVar;
            }
        }
        kVar = null;
        this.X = kVar;
    }

    public final Object B1(u00.n nVar, k00.c cVar) {
        a40.k kVar = new a40.k(1, s0.j0(cVar));
        kVar.r();
        i0 i0Var = new i0(this, kVar);
        synchronized (this.V) {
            this.U.b(i0Var);
            new k00.k(s0.j0(s0.Z(i0Var, i0Var, nVar)), l00.a.A).resumeWith(g00.b0.a);
        }
        kVar.u(new b3.a(i0Var, 28));
        return kVar.q();
    }

    public final void C1(k kVar, l lVar) {
        Object[] objArr;
        int i10;
        int i11;
        i0 i0Var;
        a40.k kVar2;
        a40.k kVar3;
        synchronized (this.V) {
            m1.e eVar = this.W;
            eVar.d(eVar.C, this.U);
        }
        try {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                m1.e eVar2 = this.W;
                objArr = eVar2.A;
                i10 = eVar2.C;
                for (i11 = 0; i11 < i10; i11++) {
                    i0Var = (i0) objArr[i11];
                    if (lVar != i0Var.D && (kVar2 = i0Var.C) != null) {
                        i0Var.C = null;
                        kVar2.resumeWith(kVar);
                    }
                }
            } else if (iOrdinal == 1) {
                m1.e eVar3 = this.W;
                int i12 = eVar3.C - 1;
                Object[] objArr2 = eVar3.A;
                if (i12 < objArr2.length) {
                    while (i12 >= 0) {
                        i0 i0Var2 = (i0) objArr2[i12];
                        if (lVar == i0Var2.D && (kVar3 = i0Var2.C) != null) {
                            i0Var2.C = null;
                            kVar3.resumeWith(kVar);
                        }
                        i12--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m1.e eVar4 = this.W;
                objArr = eVar4.A;
                i10 = eVar4.C;
                while (i11 < i10) {
                    i0Var = (i0) objArr[i11];
                    if (lVar != i0Var.D) {
                    }
                }
            }
            this.W.g();
        } catch (Throwable th2) {
            this.W.g();
            throw th2;
        }
    }

    public final void D1() {
        u1 u1Var = this.S;
        if (u1Var != null) {
            u1Var.t(new PointerInputResetException());
            this.S = null;
        }
    }

    @Override
    public final void X() {
        k kVar = this.X;
        if (kVar == null) {
            return;
        }
        ?? r4 = kVar.f15387a;
        int size = r4.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((s) r4.get(i10)).f15402d) {
                ArrayList arrayList = new ArrayList(r4.size());
                int size2 = r4.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    s sVar = (s) r4.get(i11);
                    long j9 = sVar.f15399a;
                    long j10 = sVar.f15401c;
                    long j11 = sVar.f15400b;
                    float f3 = sVar.f15403e;
                    boolean z10 = sVar.f15402d;
                    arrayList.add(new s(j9, j11, j10, false, f3, j11, j10, z10, z10, sVar.f15407i, 0L, 1.0f, 0L));
                }
                k kVar2 = new k(arrayList, null);
                this.T = kVar2;
                C1(kVar2, l.A);
                C1(kVar2, l.B);
                C1(kVar2, l.C);
                this.X = null;
                return;
            }
        }
    }

    @Override
    public final float c() {
        return b3.m.y(this).Z.c();
    }

    @Override
    public final void e1() {
        D1();
    }

    @Override
    public final void h() {
        D1();
    }

    @Override
    public final float t0() {
        return b3.m.y(this).Z.t0();
    }

    @Override
    public final void u1() {
        D1();
    }
}
