package l1;

public final class w extends z1.a0 implements p2 {
    public final u00.a B;
    public final k2 C;
    public v D = new v(z1.l.j().g());

    public w(k2 k2Var, u00.a aVar) {
        this.B = aVar;
        this.C = k2Var;
    }

    @Override
    public final z1.b0 a() {
        return this.D;
    }

    @Override
    public final void e(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.D = (v) b0Var;
    }

    @Override
    public final Object getValue() {
        u00.k kVarE = z1.l.j().e();
        if (kVarE != null) {
            kVarE.invoke(this);
        }
        z1.f fVarJ = z1.l.j();
        return h((v) z1.l.i(this.D, fVarJ), fVarJ, true, this.B).f9946f;
    }

    public final v h(v vVar, z1.f fVar, boolean z10, u00.a aVar) {
        v vVar2;
        k2 k2Var;
        int i10;
        if (vVar.d(this, fVar)) {
            if (z10) {
                m1.e eVarP = q.p();
                Object[] objArr = eVarP.A;
                int i11 = eVarP.C;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((f0) objArr[i12]).b();
                }
                try {
                    u.c0 c0Var = vVar.f9945e;
                    sd.p1 p1Var = l2.f9899a;
                    v1.e eVar = (v1.e) p1Var.get();
                    if (eVar == null) {
                        eVar = new v1.e();
                        p1Var.F(eVar);
                    }
                    int i13 = eVar.f15334a;
                    Object[] objArr2 = c0Var.f14832b;
                    int[] iArr = c0Var.f14833c;
                    long[] jArr = c0Var.f14831a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j9 = jArr[i14];
                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j9 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        z1.z zVar = (z1.z) objArr2[i18];
                                        i10 = i15;
                                        eVar.f15334a = i13 + iArr[i18];
                                        u00.k kVarE = fVar.e();
                                        if (kVarE != null) {
                                            kVarE.invoke(zVar);
                                        }
                                    } else {
                                        i10 = i15;
                                    }
                                    j9 >>= i10;
                                    i17++;
                                    i15 = i10;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    eVar.f15334a = i13;
                } finally {
                    Object[] objArr3 = eVarP.A;
                    int i19 = eVarP.C;
                    for (int i20 = 0; i20 < i19; i20++) {
                        ((f0) objArr3[i20]).a();
                    }
                }
            }
            return vVar;
        }
        u.c0 c0Var2 = new u.c0();
        sd.p1 p1Var2 = l2.f9899a;
        v1.e eVar2 = (v1.e) p1Var2.get();
        if (eVar2 == null) {
            eVar2 = new v1.e();
            p1Var2.F(eVar2);
        }
        v1.e eVar3 = eVar2;
        int i21 = eVar3.f15334a;
        m1.e eVarP2 = q.p();
        Object[] objArr4 = eVarP2.A;
        int i22 = eVarP2.C;
        for (int i23 = 0; i23 < i22; i23++) {
            ((f0) objArr4[i23]).b();
        }
        try {
            eVar3.f15334a = i21 + 1;
            Object objM = z1.q.m(new h0.u1(i21, 1, this, eVar3, c0Var2), aVar);
            eVar3.f15334a = i21;
            Object[] objArr5 = eVarP2.A;
            int i24 = eVarP2.C;
            for (int i25 = 0; i25 < i24; i25++) {
                ((f0) objArr5[i25]).a();
            }
            Object obj = z1.l.f17038c;
            synchronized (obj) {
                try {
                    z1.f fVarJ = z1.l.j();
                    Object obj2 = vVar.f9946f;
                    if (obj2 == v.f9942h || (k2Var = this.C) == null || !k2Var.a(objM, obj2)) {
                        v vVar3 = this.D;
                        synchronized (obj) {
                            z1.b0 b0VarM = z1.l.m(vVar3, this);
                            b0VarM.a(vVar3);
                            b0VarM.f17009a = fVarJ.g();
                            vVar2 = (v) b0VarM;
                            vVar2.f9945e = c0Var2;
                            vVar2.f9947g = vVar2.e(this, fVarJ);
                            vVar2.f9946f = objM;
                        }
                        return vVar2;
                    }
                    vVar.f9945e = c0Var2;
                    vVar.f9947g = vVar.e(this, fVarJ);
                    vVar2 = vVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            v1.e eVar4 = (v1.e) l2.f9899a.get();
            if (eVar4 == null || eVar4.f15334a != 0) {
                return vVar2;
            }
            z1.l.j().m();
            synchronized (obj) {
                z1.f fVarJ2 = z1.l.j();
                vVar2.f9943c = fVarJ2.g();
                vVar2.f9944d = fVarJ2.h();
                return vVar2;
            }
        } catch (Throwable th3) {
            Object[] objArr6 = eVarP2.A;
            int i26 = eVarP2.C;
            for (int i27 = 0; i27 < i26; i27++) {
                ((f0) objArr6[i27]).a();
            }
            throw th3;
        }
    }

    public final v i() {
        z1.f fVarJ = z1.l.j();
        return h((v) z1.l.i(this.D, fVarJ), fVarJ, false, this.B);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        v vVar = (v) z1.l.h(this.D);
        sb2.append(vVar.d(this, z1.l.j()) ? String.valueOf(vVar.f9946f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
