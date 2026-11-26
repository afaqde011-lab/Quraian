package d0;

public abstract class g3 {

    public static final bw.b f4431a = new bw.b(16);

    public static final void a(o9.q qVar, s2.b bVar, q1 q1Var, s2.a aVar, qd.j0 j0Var, long j9) {
        float fIntBitsToFloat;
        u.d0 d0Var = (u.d0) j0Var.C;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f13628c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f13628c & 4294967295L));
        if (f(bVar)) {
            j0Var.B = 0;
            d0Var.d();
        }
        if (!b(bVar) && !f(bVar)) {
            if (d0Var.f14838b == 3) {
                int i10 = j0Var.B;
                j0Var.B = i10 + 1;
                d0Var.n(i10, bVar);
            } else {
                d0Var.a(bVar);
            }
            if (j0Var.B == 3) {
                j0Var.B = 0;
            }
            Object[] objArr = d0Var.f14837a;
            int i11 = d0Var.f14838b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((s2.b) objArr[i12]).f13628c >> 32));
            }
            int i13 = d0Var.f14838b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i13;
            Object[] objArr2 = d0Var.f14837a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i14 = 0; i14 < i13; i14++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((s2.b) objArr2[i14]).f13628c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / d0Var.f14838b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (q1Var != null) {
            int i15 = aVar.f13625a;
            if (i15 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i15 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = q1Var == q1.B ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((e5.g) qVar.B).a(bVar.f13627b, h2.b.f(jFloatToRawIntBits, j9));
    }

    public static final boolean b(s2.b bVar) {
        return bVar.f13633h && !bVar.f13629d;
    }

    public static final Object c(n2 n2Var, float f3, x.y yVar, m00.c cVar) {
        u1 u1Var;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i10 = u1Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u1Var.C = i10 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(cVar);
            }
        } else {
            u1Var = new u1(cVar);
        }
        Object obj = u1Var.B;
        Object obj2 = l00.a.A;
        int i11 = u1Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            u00.n v1Var = new v1(f3, yVar, wVar2, null);
            u1Var.A = wVar2;
            u1Var.C = 1;
            if (n2Var.c(z.b1.A, v1Var, u1Var) == obj2) {
                return obj2;
            }
            wVar = wVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = u1Var.A;
            ri.t1.O(obj);
        }
        return new Float(wVar.A);
    }

    public static final java.lang.Object d(v2.i0 r8, v2.l r9, m00.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: d0.g3.d(v2.i0, v2.l, m00.a):java.lang.Object");
    }

    public static final Object e(v2.v vVar, u00.n nVar, k00.c cVar) {
        Object objB1 = ((v2.j0) vVar).B1(new v0(nVar, cVar.getContext(), (k00.c) null), cVar);
        return objB1 == l00.a.A ? objB1 : g00.b0.a;
    }

    public static final boolean f(s2.b bVar) {
        return !bVar.f13633h && bVar.f13629d;
    }

    public static final long g(s2.b bVar, q1 q1Var, s2.a aVar, boolean z10) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j9;
        long j10 = bVar.f13632g;
        if (q1Var != null) {
            int i10 = aVar.f13625a;
            if (i10 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            } else if (i10 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
            }
            if (q1Var == q1.B) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j9 = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j9 = jFloatToRawIntBits3 << 32;
            }
            j10 = j9 | (jFloatToRawIntBits & 4294967295L);
        }
        long jE = h2.b.e(h(bVar, q1Var, aVar), j10);
        if (z10 || !bVar.f13634i) {
            return jE;
        }
        return 0L;
    }

    public static final long h(s2.b bVar, q1 q1Var, s2.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j9;
        if (q1Var == null) {
            return bVar.f13628c;
        }
        int i10 = aVar.f13625a;
        if (i10 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f13628c >> 32));
        } else {
            if (i10 != 2) {
                return bVar.f13628c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f13628c & 4294967295L));
        }
        if (q1Var == q1.B) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j9 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j9 = jFloatToRawIntBits3 << 32;
        }
        return j9 | (4294967295L & jFloatToRawIntBits);
    }

    public static final Object i(n2 n2Var, float f3, m00.c cVar) {
        w1 w1Var;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i10 = w1Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w1Var.C = i10 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(cVar);
            }
        } else {
            w1Var = new w1(cVar);
        }
        Object obj = w1Var.B;
        Object obj2 = l00.a.A;
        int i11 = w1Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            u00.n x1Var = new x1(wVar2, f3, null, 0);
            w1Var.A = wVar2;
            w1Var.C = 1;
            if (n2Var.c(z.b1.A, x1Var, w1Var) == obj2) {
                return obj2;
            }
            wVar = wVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = w1Var.A;
            ri.t1.O(obj);
        }
        return new Float(wVar.A);
    }
}
