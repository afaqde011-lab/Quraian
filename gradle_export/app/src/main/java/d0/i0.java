package d0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.o3;

public abstract class i0 {

    public static final float f4433a = ((float) 0.125d) / 18;

    public static final java.lang.Object a(v2.i0 r17, long r18, m00.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.a(v2.i0, long, m00.c):java.lang.Object");
    }

    public static final java.lang.Object b(v2.i0 r18, long r19, int r21, a1.y1 r22, m00.a r23) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.b(v2.i0, long, int, a1.y1, m00.a):java.lang.Object");
    }

    public static final Object c(v2.i0 i0Var, long j9, m00.c cVar) {
        b0 b0Var;
        Object obj;
        v2.s sVar;
        kotlin.jvm.internal.v vVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i10 = b0Var.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.E = i10 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(cVar);
            }
        } else {
            b0Var = new b0(cVar);
        }
        Object obj2 = b0Var.D;
        l00.a aVar = l00.a.A;
        int i11 = b0Var.E;
        try {
            if (i11 == 0) {
                ri.t1.O(obj2);
                if (!h(i0Var.F.T, j9)) {
                    ?? r12 = i0Var.F.T.f15387a;
                    int size = r12.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i12);
                        if (v2.r.e(((v2.s) obj).f15399a, j9)) {
                            break;
                        }
                        i12++;
                    }
                    sVar = (v2.s) obj;
                    if (sVar != null) {
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                        zVar2.A = sVar;
                        long jB = i0Var.f().b();
                        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                        c0 c0Var = new c0(vVar2, zVar2, zVar, null);
                        b0Var.A = sVar;
                        b0Var.B = zVar;
                        b0Var.C = vVar2;
                        b0Var.E = 1;
                        if (i0Var.i(jB, c0Var, b0Var) == aVar) {
                            return aVar;
                        }
                        vVar = vVar2;
                        j9 = zVar;
                    }
                }
                return null;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = b0Var.C;
            kotlin.jvm.internal.z zVar3 = b0Var.B;
            sVar = b0Var.A;
            ri.t1.O(obj2);
            j9 = zVar3;
            if (vVar.A) {
                v2.s sVar2 = (v2.s) ((kotlin.jvm.internal.z) j9).A;
                return sVar2 == null ? sVar : sVar2;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            v2.s sVar3 = (v2.s) j9.A;
            return sVar3 == null ? sVar : sVar3;
        }
    }

    public static final java.lang.Object d(v2.i0 r18, long r19, a1.y1 r21, m00.a r22) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.d(v2.i0, long, a1.y1, m00.a):java.lang.Object");
    }

    public static final Object e(v2.v vVar, final u00.k kVar, u00.a aVar, u00.a aVar2, u00.n nVar, k00.c cVar) {
        final int i10 = 0;
        Object objE = g3.e(vVar, new e0(new a2.f(18), new u00.o() {
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i10) {
                    case 0:
                        kVar.invoke(new h2.b(((v2.s) obj2).f15401c));
                        break;
                    case 1:
                        l1.j jVar = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e((h0.w1) obj, "$this$LiquidBottomTabs");
                        l1.g0 g0Var = (l1.g0) jVar;
                        if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            float f3 = eq.m.b;
                            b2.o oVar = b2.o.A;
                            b2.r rVarC = h0.z1.c(h0.z1.q(oVar, f3), 1.0f);
                            j3.k kVar2 = new j3.k(4);
                            u00.k kVar3 = kVar;
                            boolean zG = g0Var.g(kVar3);
                            Object objN = g0Var.N();
                            if (zG || objN == l1.i.f9868a) {
                                objN = new bt.t0(19, kVar3);
                                g0Var.n0(objN);
                            }
                            b2.r rVarB = androidx.compose.foundation.b.b(rVarC, null, null, false, kVar2, (u00.a) objN, 12);
                            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                            int iHashCode = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM = g0Var.m();
                            b2.r rVarC2 = b2.a.c(rVarB, jVar);
                            b3.i.f2042c.getClass();
                            b3.g gVar = b3.h.f2035b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(w0VarD, jVar, b3.h.f2039f);
                            l1.q.I(m1VarM, jVar, b3.h.f2038e);
                            l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                            l1.q.E(jVar, b3.h.f2041h);
                            l1.q.I(rVarC2, jVar, b3.h.f2037d);
                            o3.a(y3.R(2131231375, jVar, 0), z3.U(jVar, 2131887196), h0.z1.m(oVar, 20), dl.a.k, jVar, 392, 0);
                            g0Var.r(true);
                        } else {
                            g0Var.V();
                        }
                        break;
                    case 2:
                        h0.w1 w1Var = (h0.w1) obj;
                        l1.j jVar2 = (l1.j) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e(w1Var, "$this$LiquidBottomTabs");
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= ((l1.g0) jVar2).g(w1Var) ? 4 : 2;
                        }
                        int i11 = iIntValue2;
                        l1.g0 g0Var2 = (l1.g0) jVar2;
                        if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
                            for (int i12 = 0; i12 < 5; i12++) {
                                u00.k kVar4 = kVar;
                                boolean zG2 = g0Var2.g(kVar4) | g0Var2.e(i12);
                                Object objN2 = g0Var2.N();
                                if (zG2 || objN2 == l1.i.f9868a) {
                                    objN2 = new eq.d(i12, 1, kVar4);
                                    g0Var2.n0(objN2);
                                }
                                sm.k0.a(w1Var, (u00.a) objN2, (b2.r) null, v1.d.d(929726447, new eq.l(i12, 0), jVar2), jVar2, (i11 & 14) | 3072);
                            }
                        } else {
                            g0Var2.V();
                        }
                        break;
                    default:
                        l1.j jVar3 = (l1.j) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e((j0.b) obj, "$this$item");
                        l1.g0 g0Var3 = (l1.g0) jVar3;
                        if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            String strU = z3.U(jVar3, 2131886333);
                            String strU2 = z3.U(jVar3, 2131886372);
                            u00.k kVar5 = kVar;
                            boolean zG3 = g0Var3.g(kVar5);
                            Object objN3 = g0Var3.N();
                            if (zG3 || objN3 == l1.i.f9868a) {
                                objN3 = new wy.l(2, kVar5);
                                g0Var3.n0(objN3);
                            }
                            yy.b.a(strU, strU2, (u00.a) objN3, jVar3, 0);
                        } else {
                            g0Var3.V();
                        }
                        break;
                }
                return g00.b0.a;
            }
        }, nVar, aVar2, new ca.q(1, aVar), null), cVar);
        l00.a aVar3 = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objE != aVar3) {
            objE = b0Var;
        }
        return objE == aVar3 ? objE : b0Var;
    }

    public static final java.lang.Object f(v2.i0 r4, long r5, u00.k r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.f(v2.i0, long, u00.k, m00.c):java.lang.Object");
    }

    public static final java.lang.Object g(v2.i0 r17, long r18, a1.e1 r20, m00.a r21) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.g(v2.i0, long, a1.e1, m00.a):java.lang.Object");
    }

    public static final boolean h(v2.k kVar, long j9) {
        Object obj;
        ?? r7 = kVar.f15387a;
        int size = r7.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r7.get(i10);
            if (v2.r.e(((v2.s) obj).f15399a, j9)) {
                break;
            }
            i10++;
        }
        v2.s sVar = (v2.s) obj;
        if (sVar != null && sVar.f15402d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float i(c3.c3 c3Var, int i10) {
        return i10 == 2 ? c3Var.g() * f4433a : c3Var.g();
    }

    public static final java.lang.Object j(v2.i0 r25, v2.s r26, a2.f r27, d0.y r28, u00.n r29, u00.a r30, ca.q r31, m00.a r32) {
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.j(v2.i0, v2.s, a2.f, d0.y, u00.n, u00.a, ca.q, m00.a):java.lang.Object");
    }
}
