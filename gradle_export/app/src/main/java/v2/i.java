package v2;

import b3.e2;
import b3.l0;
import b3.p1;
import com.google.android.gms.internal.measurement.f4;
import java.util.ArrayList;

public final class i extends j {

    public final b2.q f15377c;

    public final e7.q f15378d;

    public final u.q f15379e;

    public p1 f15380f;

    public k f15381g;

    public boolean f15382h;

    public boolean f15383i;

    public boolean f15384j;

    public i(b2.q qVar) {
        this.f15377c = qVar;
        e7.q qVar2 = new e7.q();
        qVar2.f5167c = new long[2];
        this.f15378d = qVar2;
        this.f15379e = new u.q(2);
        this.f15383i = true;
        this.f15384j = true;
    }

    @Override
    public final boolean a(u.q qVar, z2.a0 a0Var, f4 f4Var, boolean z10) {
        u.q qVar2;
        e7.q qVar3;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        k kVar;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zA = super.a(qVar, a0Var, f4Var, z10);
        ?? E = this.f15377c;
        if (E.N) {
            ?? eVar = 0;
            while (E != 0) {
                if (E instanceof e2) {
                    this.f15380f = b3.m.v((e2) E, 16);
                } else if ((E.C & 16) != 0 && (E instanceof b3.l)) {
                    b2.q qVar4 = ((b3.l) E).P;
                    int i14 = 0;
                    E = E;
                    eVar = eVar;
                    while (qVar4 != null) {
                        if ((qVar4.C & 16) != 0) {
                            i14++;
                            eVar = eVar;
                            if (i14 == 1) {
                                E = qVar4;
                            } else {
                                if (eVar == 0) {
                                    eVar = new m1.e(0, new b2.q[16]);
                                }
                                if (E != 0) {
                                    eVar.b(E);
                                    E = 0;
                                }
                                eVar.b(qVar4);
                            }
                        }
                        qVar4 = qVar4.F;
                        E = E;
                        eVar = eVar;
                    }
                    if (i14 == 1) {
                    }
                }
                E = b3.m.e(eVar);
            }
            if (this.f15380f != null) {
                int iG = qVar.g();
                int i15 = 0;
                while (true) {
                    qVar2 = this.f15379e;
                    qVar3 = this.f15378d;
                    if (i15 >= iG) {
                        break;
                    }
                    long jD = qVar.d(i15);
                    s sVar = (s) qVar.h(i15);
                    if (qVar3.c(jD)) {
                        long j9 = sVar.f15405g;
                        ArrayList arrayList = sVar.m;
                        long j10 = sVar.f15401c;
                        if ((((j9 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList2 = h00.x.A;
                            ArrayList arrayList3 = new ArrayList((arrayList == null ? arrayList2 : arrayList).size());
                            if (arrayList == null) {
                                arrayList = arrayList2;
                            }
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                int i17 = size;
                                b bVar = (b) arrayList.get(i16);
                                long j11 = jD;
                                ArrayList arrayList4 = arrayList;
                                long j12 = bVar.f15353b;
                                if ((((j12 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j13 = bVar.f15352a;
                                    p1 p1Var = this.f15380f;
                                    kotlin.jvm.internal.m.b(p1Var);
                                    arrayList3.add(new b(j13, p1Var.o(a0Var, j12, true), bVar.f15354c, bVar.f15355d, bVar.f15356e));
                                }
                                i16++;
                                arrayList = arrayList4;
                                size = i17;
                                jD = j11;
                                sVar = sVar;
                                i15 = i15;
                            }
                            i13 = i15;
                            long j14 = jD;
                            p1 p1Var2 = this.f15380f;
                            kotlin.jvm.internal.m.b(p1Var2);
                            long jO = p1Var2.o(a0Var, j9, true);
                            p1 p1Var3 = this.f15380f;
                            kotlin.jvm.internal.m.b(p1Var3);
                            s sVar2 = new s(sVar.f15399a, sVar.f15400b, p1Var3.o(a0Var, j10, true), sVar.f15402d, sVar.f15403e, sVar.f15404f, jO, sVar.f15406h, sVar.f15407i, arrayList3, sVar.f15408j, sVar.f15409k, sVar.l, sVar.f15410n);
                            s sVar3 = sVar.f15413q;
                            if (sVar3 == null) {
                                sVar3 = sVar;
                            }
                            sVar2.f15413q = sVar3;
                            s sVar4 = sVar.f15413q;
                            if (sVar4 != null) {
                                sVar = sVar4;
                            }
                            sVar2.f15413q = sVar;
                            qVar2.e(sVar2, j14);
                        } else {
                            i13 = i15;
                        }
                    } else {
                        i13 = i15;
                    }
                    i15 = i13 + 1;
                    iG = iG;
                    zA = zA;
                }
                boolean z16 = zA;
                if (qVar2.g() == 0) {
                    qVar3.f5166b = 0;
                    this.f15385a.g();
                    return true;
                }
                int i18 = qVar3.f5166b;
                while (true) {
                    i18--;
                    if (-1 >= i18) {
                        break;
                    }
                    if (qVar.c(qVar3.f5167c[i18]) < 0 && i18 < (i12 = qVar3.f5166b)) {
                        int i19 = i12 - 1;
                        int i20 = i18;
                        while (i20 < i19) {
                            long[] jArr = qVar3.f5167c;
                            int i21 = i20 + 1;
                            jArr[i20] = jArr[i21];
                            i20 = i21;
                        }
                        qVar3.f5166b--;
                    }
                }
                ArrayList arrayList5 = new ArrayList(qVar2.g());
                int iG2 = qVar2.g();
                for (int i22 = 0; i22 < iG2; i22++) {
                    arrayList5.add(qVar2.h(i22));
                }
                k kVar2 = new k(arrayList5, f4Var);
                int size2 = arrayList5.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList5.get(i23);
                    if (f4Var.g(((s) obj).f15399a)) {
                        break;
                    }
                    i23++;
                }
                s sVar5 = (s) obj;
                if (sVar5 != null) {
                    boolean z17 = sVar5.f15402d;
                    if (z10) {
                        z11 = false;
                        if (!this.f15383i && (z17 || sVar5.f15406h)) {
                            p1 p1Var4 = this.f15380f;
                            kotlin.jvm.internal.m.b(p1Var4);
                            long j15 = p1Var4.C;
                            long j16 = sVar5.f15401c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                            z12 = true;
                            this.f15383i = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j15 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j15 & 4294967295L)))));
                        }
                        z14 = this.f15383i;
                        z15 = this.f15382h;
                        if (z14 == z15 && ((i11 = kVar2.f15392f) == 3 || i11 == 4 || i11 == 5)) {
                            kVar2.f15392f = z14 ? 4 : 5;
                        } else {
                            i10 = kVar2.f15392f;
                            if (i10 != 4 && z15 && !this.f15384j) {
                                kVar2.f15392f = 3;
                            } else if (i10 == 5 && z14 && z17) {
                                kVar2.f15392f = 3;
                            }
                        }
                    } else {
                        z11 = false;
                        this.f15383i = false;
                    }
                    z12 = true;
                    z14 = this.f15383i;
                    z15 = this.f15382h;
                    if (z14 == z15) {
                        i10 = kVar2.f15392f;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                kVar2.f15392f = 3;
                            }
                        } else if (i10 == 5) {
                            kVar2.f15392f = 3;
                        }
                    } else {
                        i10 = kVar2.f15392f;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                kVar2.f15392f = 3;
                            }
                        } else if (i10 == 5) {
                            kVar2.f15392f = 3;
                        }
                    }
                } else {
                    z11 = false;
                    z12 = true;
                }
                if (!z16 && kVar2.f15392f == 3 && (kVar = this.f15381g) != null) {
                    ?? r4 = kVar.f15387a;
                    int size3 = r4.size();
                    ?? r7 = kVar2.f15387a;
                    if (size3 != r7.size()) {
                        z13 = z12;
                        break;
                    }
                    int size4 = r7.size();
                    ?? r10 = z11;
                    while (true) {
                        if (r10 >= size4) {
                            z13 = z11;
                            break;
                        }
                        if (!h2.b.b(((s) r4.get(r10)).f15401c, ((s) r7.get(r10)).f15401c)) {
                            z13 = z12;
                            break;
                        }
                        r10++;
                    }
                } else {
                    z13 = z12;
                    break;
                }
                this.f15381g = kVar2;
                return z13;
            }
        }
        return true;
    }

    @Override
    public final void b(f4 f4Var) {
        super.b(f4Var);
        k kVar = this.f15381g;
        if (kVar == null) {
            return;
        }
        this.f15382h = this.f15383i;
        ?? r4 = kVar.f15387a;
        int size = r4.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) r4.get(i10);
            boolean z10 = sVar.f15402d;
            long j9 = sVar.f15399a;
            boolean zG = f4Var.g(j9);
            boolean z11 = this.f15383i;
            if ((!z10 && !zG) || (!z10 && !z11)) {
                this.f15378d.e(j9);
            }
        }
        this.f15383i = false;
        this.f15384j = kVar.f15392f == 5;
    }

    public final void c() {
        m1.e eVar = this.f15385a;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((i) objArr[i11]).c();
        }
        ?? E = this.f15377c;
        ?? eVar2 = 0;
        while (E != 0) {
            if (E instanceof e2) {
                ((e2) E).X();
            } else if ((E.C & 16) != 0 && (E instanceof b3.l)) {
                b2.q qVar = ((b3.l) E).P;
                int i12 = 0;
                eVar2 = eVar2;
                E = E;
                while (qVar != null) {
                    if ((qVar.C & 16) != 0) {
                        i12++;
                        eVar2 = eVar2;
                        if (i12 == 1) {
                            E = qVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new m1.e(0, new b2.q[16]);
                            }
                            if (E != 0) {
                                eVar2.b(E);
                                E = 0;
                            }
                            eVar2.b(qVar);
                        }
                    }
                    qVar = qVar.F;
                    eVar2 = eVar2;
                    E = E;
                }
                if (i12 == 1) {
                }
            }
            E = b3.m.e(eVar2);
        }
    }

    public final boolean d(f4 f4Var) {
        Object[] objArr;
        l0 l0Var;
        u.q qVar = this.f15379e;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (qVar.g() != 0) {
            b2.q qVar2 = this.f15377c;
            if (qVar2.N) {
                p1 p1Var = qVar2.H;
                if ((p1Var == null || (l0Var = p1Var.O) == null) ? false : l0Var.K()) {
                    k kVar = this.f15381g;
                    kotlin.jvm.internal.m.b(kVar);
                    p1 p1Var2 = this.f15380f;
                    kotlin.jvm.internal.m.b(p1Var2);
                    long j9 = p1Var2.C;
                    b2.q qVarE = qVar2;
                    m1.e eVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof e2) {
                            ((e2) qVarE).A(kVar, l.C, j9);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((qVarE.C & 16) != 0) != false && (qVarE instanceof b3.l)) {
                                int i10 = 0;
                                for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if (((qVar3.C & 16) != 0) != false) {
                                        i10++;
                                        if (i10 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar.b(qVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                        }
                        qVarE = b3.m.e(eVar);
                    }
                    if (qVar2.N) {
                        m1.e eVar2 = this.f15385a;
                        Object[] objArr2 = eVar2.A;
                        int i11 = eVar2.C;
                        for (int i12 = 0; i12 < i11; i12++) {
                            ((i) objArr2[i12]).d(f4Var);
                        }
                    }
                    z10 = true;
                }
            }
        }
        b(f4Var);
        qVar.a();
        this.f15380f = null;
        return z10;
    }

    public final boolean e(f4 f4Var, boolean z10) {
        boolean z11;
        boolean z12;
        l0 l0Var;
        if (this.f15379e.g() == 0) {
            return false;
        }
        b2.q qVarE = this.f15377c;
        if (qVarE.N) {
            p1 p1Var = qVarE.H;
            if ((p1Var == null || (l0Var = p1Var.O) == null) ? false : l0Var.K()) {
                k kVar = this.f15381g;
                kotlin.jvm.internal.m.b(kVar);
                p1 p1Var2 = this.f15380f;
                kotlin.jvm.internal.m.b(p1Var2);
                long j9 = p1Var2.C;
                b2.q qVarE2 = qVarE;
                m1.e eVar = null;
                while (qVarE2 != null) {
                    if (qVarE2 instanceof e2) {
                        ((e2) qVarE2).A(kVar, l.A, j9);
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        if (((qVarE2.C & 16) != 0) && (qVarE2 instanceof b3.l)) {
                            int i10 = 0;
                            for (b2.q qVar = ((b3.l) qVarE2).P; qVar != null; qVar = qVar.F) {
                                if ((qVar.C & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarE2 = qVar;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (qVarE2 != null) {
                                            eVar.b(qVarE2);
                                            qVarE2 = null;
                                        }
                                        eVar.b(qVar);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                    }
                    qVarE2 = b3.m.e(eVar);
                }
                if (qVarE.N) {
                    m1.e eVar2 = this.f15385a;
                    Object[] objArr = eVar2.A;
                    int i11 = eVar2.C;
                    for (int i12 = 0; i12 < i11; i12++) {
                        i iVar = (i) objArr[i12];
                        kotlin.jvm.internal.m.b(this.f15380f);
                        iVar.e(f4Var, z10);
                    }
                }
                if (qVarE.N) {
                    m1.e eVar3 = null;
                    while (qVarE != null) {
                        if (qVarE instanceof e2) {
                            ((e2) qVarE).A(kVar, l.B, j9);
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            if (((qVarE.C & 16) != 0) && (qVarE instanceof b3.l)) {
                                int i13 = 0;
                                for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                    if ((qVar2.C & 16) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarE = qVar2;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar3.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar3.b(qVar2);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                        }
                        qVarE = b3.m.e(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j9, u.d0 d0Var) {
        e7.q qVar = this.f15378d;
        if (qVar.c(j9) && d0Var.g(this) < 0) {
            qVar.e(j9);
            this.f15379e.f(j9);
        }
        m1.e eVar = this.f15385a;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((i) objArr[i11]).f(j9, d0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f15377c + ", children=" + this.f15385a + ", pointerIds=" + this.f15378d + ')';
    }
}
