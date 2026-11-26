package v2;

import b3.k0;
import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class c {

    public final z2.a0 f15357a;

    public boolean f15358b;

    public boolean f15359c;

    public boolean f15360d;

    public boolean f15361e;

    public final u.d0 f15362f = new u.d0();

    public final j f15363g = new j();

    public final u.z f15364h = new u.z(10);

    public c(z2.a0 a0Var) {
        this.f15357a = a0Var;
    }

    public final void a(long j9, boolean z10, List list) {
        u.z zVar;
        long[] jArr;
        i iVar;
        Object objD;
        Object obj;
        int size = list.size();
        j jVar = this.f15363g;
        j jVar2 = jVar;
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            zVar = this.f15364h;
            if (i10 >= size) {
                break;
            }
            b2.q qVar = (b2.q) list.get(i10);
            if (qVar.N) {
                qVar.M = new k0(this, qVar, 23);
                if (z11) {
                    m1.e eVar = jVar2.f15385a;
                    Object[] objArr = eVar.A;
                    int i11 = eVar.C;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i12];
                        if (kotlin.jvm.internal.m.a(((i) obj).f15377c, qVar)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    iVar = (i) obj;
                    if (iVar != null) {
                        iVar.f15383i = true;
                        iVar.f15378d.a(j9);
                        if (z10) {
                            Object objD2 = zVar.d(j9);
                            if (objD2 == null) {
                                objD2 = new u.d0();
                                zVar.g(objD2, j9);
                            }
                            ((u.d0) objD2).a(iVar);
                        }
                    } else {
                        z11 = false;
                        iVar = new i(qVar);
                        iVar.f15378d.a(j9);
                        if (z10) {
                            objD = zVar.d(j9);
                            if (objD == null) {
                                objD = new u.d0();
                                zVar.g(objD, j9);
                            }
                            ((u.d0) objD).a(iVar);
                        }
                        jVar2.f15385a.b(iVar);
                    }
                } else {
                    iVar = new i(qVar);
                    iVar.f15378d.a(j9);
                    if (z10) {
                        objD = zVar.d(j9);
                        if (objD == null) {
                            objD = new u.d0();
                            zVar.g(objD, j9);
                        }
                        ((u.d0) objD).a(iVar);
                    }
                    jVar2.f15385a.b(iVar);
                }
                jVar2 = iVar;
            }
            i10++;
        }
        if (z10) {
            long[] jArr2 = zVar.f14914b;
            Object[] objArr2 = zVar.f14915c;
            long[] jArr3 = zVar.f14913a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr3[i13];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((255 & j10) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j11 = jArr2[i17];
                                u.d0 d0Var = (u.d0) objArr2[i17];
                                m1.e eVar2 = jVar.f15385a;
                                Object[] objArr3 = eVar2.A;
                                int i18 = eVar2.C;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((i) objArr3[i19]).f(j11, d0Var);
                                }
                            }
                            j10 >>= i14;
                            i16++;
                            i14 = i14;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    jArr2 = jArr;
                }
            }
        }
        zVar.a();
    }

    public final boolean b(f4 f4Var, boolean z10) {
        u.q qVar = (u.q) f4Var.C;
        z2.a0 a0Var = this.f15357a;
        j jVar = this.f15363g;
        boolean zA = jVar.a(qVar, a0Var, f4Var, z10);
        m1.e eVar = jVar.f15385a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f15358b = true;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = ((i) objArr[i11]).e(f4Var, z10) || z12;
        }
        Object[] objArr2 = eVar.A;
        int i12 = eVar.C;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = ((i) objArr2[i13]).d(f4Var) || z13;
        }
        jVar.b(f4Var);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f15358b = false;
        if (this.f15361e) {
            this.f15361e = false;
            u.d0 d0Var = this.f15362f;
            int i14 = d0Var.f14838b;
            for (int i15 = 0; i15 < i14; i15++) {
                d((b2.q) d0Var.f(i15));
            }
            d0Var.d();
        }
        if (this.f15359c) {
            this.f15359c = false;
            c();
        }
        if (this.f15360d) {
            this.f15360d = false;
            jVar.f15385a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f15358b) {
            this.f15359c = true;
            return;
        }
        j jVar = this.f15363g;
        m1.e eVar = jVar.f15385a;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((i) objArr[i11]).c();
        }
        if (this.f15360d) {
            this.f15360d = true;
        } else {
            jVar.f15385a.g();
        }
    }

    public final void d(b2.q qVar) {
        if (this.f15358b) {
            this.f15361e = true;
            this.f15362f.a(qVar);
            return;
        }
        j jVar = this.f15363g;
        u.d0 d0Var = jVar.f15386b;
        d0Var.d();
        d0Var.a(jVar);
        while (d0Var.i()) {
            j jVar2 = (j) d0Var.k(d0Var.f14838b - 1);
            int i10 = 0;
            while (true) {
                m1.e eVar = jVar2.f15385a;
                if (i10 < eVar.C) {
                    i iVar = (i) eVar.A[i10];
                    if (kotlin.jvm.internal.m.a(iVar.f15377c, qVar)) {
                        jVar2.f15385a.j(iVar);
                        iVar.c();
                    } else {
                        d0Var.a(iVar);
                        i10++;
                    }
                }
            }
        }
    }
}
