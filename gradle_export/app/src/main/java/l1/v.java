package l1;

public final class v extends z1.b0 {

    public static final Object f9942h = new Object();

    public long f9943c;

    public int f9944d;

    public u.c0 f9945e;

    public Object f9946f;

    public int f9947g;

    public v(long j9) {
        super(j9);
        u.c0 c0Var = u.n0.f14879a;
        kotlin.jvm.internal.m.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f9945e = c0Var;
        this.f9946f = f9942h;
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        v vVar = (v) b0Var;
        this.f9945e = vVar.f9945e;
        this.f9946f = vVar.f9946f;
        this.f9947g = vVar.f9947g;
    }

    @Override
    public final z1.b0 b() {
        return new v(z1.l.j().g());
    }

    @Override
    public final z1.b0 c(long j9) {
        return new v(j9);
    }

    public final boolean d(w wVar, z1.f fVar) {
        boolean z10;
        boolean z11;
        Object obj = z1.l.f17038c;
        synchronized (obj) {
            z10 = true;
            z11 = (this.f9943c == fVar.g() && this.f9944d == fVar.h()) ? false : true;
        }
        if (this.f9946f == f9942h || (z11 && this.f9947g != e(wVar, fVar))) {
            z10 = false;
        }
        if (!z10 || !z11) {
            return z10;
        }
        synchronized (obj) {
            this.f9943c = fVar.g();
            this.f9944d = fVar.h();
        }
        return z10;
    }

    public final int e(w wVar, z1.f fVar) {
        u.c0 c0Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j9;
        long j10;
        int i13;
        ?? r26;
        ?? I;
        synchronized (z1.l.f17038c) {
            c0Var = this.f9945e;
        }
        int i14 = 7;
        if (c0Var.f14835e == 0) {
            return 7;
        }
        m1.e eVarP = q.p();
        Object[] objArr4 = eVarP.A;
        int i15 = eVarP.C;
        boolean z10 = false;
        for (int i16 = 0; i16 < i15; i16++) {
            ((f0) objArr4[i16]).b();
        }
        try {
            Object[] objArr5 = c0Var.f14832b;
            int[] iArr = c0Var.f14833c;
            long[] jArr3 = c0Var.f14831a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i17 = 0;
                while (true) {
                    long j11 = jArr3[i17];
                    long j12 = -9187201950435737472L;
                    if ((((~j11) << i14) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        i12 = i14;
                        ?? r4 = z10;
                        while (r4 < i19) {
                            if ((j11 & 255) < 128) {
                                ?? r18 = (i17 << 3) + r4;
                                j10 = j12;
                                z1.z zVar = (z1.z) objArr5[r18];
                                int i20 = i18;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r4;
                                    objArr3 = objArr5;
                                    j9 = j11;
                                } else {
                                    if (zVar instanceof w) {
                                        w wVar2 = (w) zVar;
                                        I = wVar2.h((v) z1.l.i(wVar2.D, fVar), fVar, z10, wVar2.B);
                                        u.c0 c0Var2 = I.f9945e;
                                        Object[] objArr6 = c0Var2.f14832b;
                                        long[] jArr4 = c0Var2.f14831a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r4;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr4[i21];
                                                j9 = j11;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j13) << i12) & j13 & j10) == j10) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i21 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i21++;
                                                    j11 = j9;
                                                    i20 = 8;
                                                } else {
                                                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                        if ((j13 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((z1.z) objArr6[(i21 << 3) + i23]);
                                                        }
                                                        j13 >>= i20;
                                                    }
                                                    if (i22 != i20) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i21 != length2) {
                                                        break;
                                                    }
                                                    i21++;
                                                    j11 = j9;
                                                    i20 = 8;
                                                }
                                            }
                                        } else {
                                            j9 = j11;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r4;
                                        objArr3 = objArr5;
                                        j9 = j11;
                                        I = z1.l.i(zVar.a(), fVar);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.f17009a);
                                    r25 = r26;
                                }
                                i13 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r4;
                                objArr3 = objArr5;
                                j9 = j11;
                                j10 = j12;
                                i13 = i18;
                            }
                            j11 = j9 >> i13;
                            i18 = i13;
                            j12 = j10;
                            objArr5 = objArr3;
                            z10 = false;
                            r4 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i12 = i14;
                        objArr2 = objArr5;
                    }
                    if (i17 != length) {
                        i17++;
                        i14 = i12;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z10 = false;
                    } else {
                        i14 = iIdentityHashCode;
                    }
                }
                objArr = eVarP.A;
                i10 = eVarP.C;
                for (i11 = 0; i11 < i10; i11++) {
                    ((f0) objArr[i11]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i14;
            objArr = eVarP.A;
            i10 = eVarP.C;
            while (i11 < i10) {
                ((f0) objArr[i11]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            Object[] objArr7 = eVarP.A;
            int i24 = eVarP.C;
            for (int i25 = 0; i25 < i24; i25++) {
                ((f0) objArr7[i25]).a();
            }
            throw th2;
        }
    }
}
