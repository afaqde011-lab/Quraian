package l0;

import android.view.View;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l1.q2;
import l1.r1;
import z2.v1;

public abstract class q {

    public static final z[] f9783a = new z[0];

    public static final b3.c0 f9784b = new b3.c0(4);

    public static final void a(final u00.a aVar, final b2.r rVar, final v0 v0Var, final n0 n0Var, l1.j jVar, final int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1055276397);
        int i11 = (g0Var.i(aVar) ? 4 : 2) | i10 | (g0Var.g(rVar) ? 32 : 16) | (g0Var.g(v0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(n0Var) ? 2048 : 1024);
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            final l1.z0 z0VarG = l1.q.G(aVar, g0Var);
            c(v1.d.d(-933153643, new u00.o() {
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b2.r rVarV;
                    y1.c cVar = (y1.c) obj;
                    l1.j jVar2 = (l1.j) obj2;
                    ((Integer) obj3).getClass();
                    l1.g0 g0Var2 = (l1.g0) jVar2;
                    Object objN = g0Var2.N();
                    l1.c cVar2 = l1.i.f9868a;
                    if (objN == cVar2) {
                        objN = new i0(cVar, new ct.k(z0VarG, 10));
                        g0Var2.n0(objN);
                    }
                    final i0 i0Var = (i0) objN;
                    Object objN2 = g0Var2.N();
                    if (objN2 == cVar2) {
                        h7.b bVar = new h7.b();
                        bVar.A = i0Var;
                        u.c0 c0Var = u.n0.f14879a;
                        bVar.B = new u.c0();
                        objN2 = new v1(bVar);
                        g0Var2.n0(objN2);
                    }
                    final v1 v1Var = (v1) objN2;
                    final v0 v0Var2 = v0Var;
                    if (v0Var2 != null) {
                        g0Var2.c0(1743490539);
                        g0Var2.c0(887527095);
                        final k1 k1Var = m1.f9777a;
                        if (k1Var != null) {
                            g0Var2.c0(1345554384);
                        } else {
                            g0Var2.c0(1345603457);
                            View view = (View) g0Var2.k(c3.o0.f2726f);
                            boolean zG = g0Var2.g(view);
                            Object objN3 = g0Var2.N();
                            if (zG || objN3 == cVar2) {
                                Object tag = view.getTag(2131362060);
                                objN3 = tag instanceof k1 ? (k1) tag : null;
                                if (objN3 == null) {
                                    objN3 = new a(view);
                                    view.setTag(2131362060, objN3);
                                }
                                g0Var2.n0(objN3);
                            }
                            k1Var = (k1) objN3;
                        }
                        g0Var2.r(false);
                        g0Var2.r(false);
                        Object[] objArr = {v0Var2, i0Var, v1Var, k1Var};
                        boolean zG2 = g0Var2.g(v0Var2) | g0Var2.i(i0Var) | g0Var2.i(v1Var) | g0Var2.i(k1Var);
                        Object objN4 = g0Var2.N();
                        if (zG2 || objN4 == cVar2) {
                            objN4 = new u00.k() {
                                public final Object invoke(Object obj4) {
                                    c7.c cVar3 = new c7.c();
                                    cVar3.B = i0Var;
                                    cVar3.C = v1Var;
                                    cVar3.D = k1Var;
                                    cVar3.A = true;
                                    v0 v0Var3 = v0Var2;
                                    v0Var3.f9800c = cVar3;
                                    return new c3.k1(v0Var3, 14);
                                }
                            };
                            g0Var2.n0(objN4);
                        }
                        l1.q.f(objArr, (u00.k) objN4, jVar2);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(1744076749);
                        g0Var2.r(false);
                    }
                    int i12 = w0.f9804a;
                    b2.r rVar2 = rVar;
                    if (v0Var2 != null && (rVarV = rVar2.V(new p1(v0Var2))) != null) {
                        rVar2 = rVarV;
                    }
                    boolean zG3 = g0Var2.g(i0Var);
                    n0 n0Var2 = n0Var;
                    boolean zG4 = zG3 | g0Var2.g(n0Var2);
                    Object objN5 = g0Var2.N();
                    if (zG4 || objN5 == cVar2) {
                        objN5 = new g0(i0Var, n0Var2, 1);
                        g0Var2.n0(objN5);
                    }
                    z2.d0.c(v1Var, rVar2, (u00.n) objN5, jVar2, 8);
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(aVar, rVar, v0Var, n0Var, i10) {
                public final u00.a A;
                public final b2.r B;
                public final v0 C;
                public final n0 D;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    q.a(this.A, this.B, this.C, this.D, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(Object obj, int i10, s0 s0Var, v1.c cVar, l1.j jVar, int i11) {
        int i12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(872548579);
        if ((i11 & 6) == 0) {
            i12 = (g0Var.i(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= g0Var.e(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= g0Var.i(s0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i11 & 3072) == 0) {
            i12 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zG = g0Var.g(obj) | g0Var.g(s0Var);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (zG || objN == cVar2) {
                objN = new r0(obj, s0Var);
                g0Var.n0(objN);
            }
            r0 r0Var = (r0) objN;
            r0Var.f9787c = i10;
            l1.i1 i1Var = r0Var.f9791g;
            l1.t tVar = z2.j1.f17126a;
            r0 r0Var2 = (r0) g0Var.k(tVar);
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                if (r0Var2 != ((r0) i1Var.getValue())) {
                    i1Var.setValue(r0Var2);
                    if (r0Var.f9788d > 0) {
                        r0 r0Var3 = r0Var.f9789e;
                        if (r0Var3 != null) {
                            r0Var3.b();
                        }
                        if (r0Var2 != null) {
                            r0Var2.a();
                        } else {
                            r0Var2 = null;
                        }
                        r0Var.f9789e = r0Var2;
                    }
                }
                z1.q.n(fVarF, fVarK, kVarE);
                boolean zG2 = g0Var.g(r0Var);
                Object objN2 = g0Var.N();
                if (zG2 || objN2 == cVar2) {
                    objN2 = new h00.a(r0Var, 13);
                    g0Var.n0(objN2);
                }
                l1.q.e(r0Var, (u00.k) objN2, g0Var);
                l1.q.a(tVar.a(r0Var), cVar, g0Var, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.a(obj, i10, s0Var, cVar, i11);
        }
    }

    public static final void c(v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-709502251);
        if (g0Var.S(i10 & 1, (i10 & 3) != 2)) {
            q2 q2Var = y1.h.f16584a;
            y1.f fVar = (y1.f) g0Var.k(q2Var);
            y1.d dVarG = y1.k.g(g0Var);
            Object[] objArr = {fVar};
            s10.w0 w0Var = new s10.w0(new jk.c(17), new h1.v0(fVar, dVarG, 19), 15);
            boolean zI = g0Var.i(fVar) | g0Var.i(dVarG);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new a1.o1(fVar, dVarG, 25);
                g0Var.n0(objN);
            }
            g1 g1Var = (g1) y1.k.f(objArr, w0Var, (u00.a) objN, g0Var, 0);
            l1.q.a(q2Var.a(g1Var), v1.d.d(-412824043, new g0(cVar, g1Var, 2), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.j(cVar, i10, 3);
        }
    }

    public static final void d(j0 j0Var, Object obj, int i10, Object obj2, l1.j jVar, int i11) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1439843069);
        int i12 = (g0Var.g(j0Var) ? 4 : 2) | i11 | (g0Var.g(obj) ? 32 : 16) | (g0Var.e(i10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(obj2) ? 2048 : 1024);
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            ((y1.c) obj).f(obj2, v1.d.d(980966366, new ct.l(i10, obj2, j0Var), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(j0Var, obj, i10, obj2, i11);
        }
    }

    public static final int e(int i10, m1.e eVar) {
        int i11 = eVar.C - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = eVar.A;
            int i14 = ((k) objArr[i13]).f9774a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((k) objArr[i12]).f9774a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final List f(f fVar, int i10, int i11, ArrayList arrayList, u.v vVar, int i12, int i13, int i14, u00.k kVar) {
        int i15;
        u.v vVar2;
        long j9;
        long j10;
        int i16;
        Object obj;
        int i17;
        if (fVar == null || arrayList.isEmpty() || (i15 = vVar.f14904b) == 0) {
            return h00.x.A;
        }
        int i18 = -1;
        if (i11 - i10 < 0 || i15 == 0) {
            vVar2 = u.k.f14870a;
        } else {
            z00.e eVarI0 = ab.a0.I0(0, i15);
            int i19 = ((z00.c) eVarI0).A;
            int i20 = ((z00.c) eVarI0).B;
            int iC = -1;
            if (i19 <= i20) {
                while (vVar.c(i19) <= i10) {
                    iC = vVar.c(i19);
                    if (i19 == i20) {
                        break;
                    }
                    i19++;
                }
            }
            if (iC == -1) {
                vVar2 = u.k.f14870a;
            } else {
                u.v vVar3 = u.k.f14870a;
                vVar2 = new u.v(1);
                vVar2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            Object obj2 = arrayList.get(i21);
            int index = ((p0) obj2).getIndex();
            int[] iArr = vVar.f14903a;
            int i22 = vVar.f14904b;
            for (int i23 = 0; i23 < i22; i23++) {
                if (iArr[i23] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = vVar2.f14903a;
        int i24 = vVar2.f14904b;
        int i25 = 0;
        while (i25 < i24) {
            int i26 = iArr2[i25];
            Iterator it = arrayList.iterator();
            int i27 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i27 = i18;
                    break;
                }
                if (((p0) it.next()).getIndex() == i26) {
                    break;
                }
                i27++;
            }
            p0 p0Var = i27 == i18 ? (p0) kVar.invoke(Integer.valueOf(i26)) : (p0) arrayList.remove(i27);
            int iC2 = p0Var.c();
            if (i27 == i18) {
                j9 = 4294967295L;
                i16 = Integer.MIN_VALUE;
            } else {
                long j11 = p0Var.j(0);
                if (p0Var.h()) {
                    j9 = 4294967295L;
                    j10 = j11 & 4294967295L;
                } else {
                    j9 = 4294967295L;
                    j10 = j11 >> 32;
                }
                i16 = (int) j10;
            }
            int size2 = arrayList3.size();
            int i28 = 0;
            while (true) {
                if (i28 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i28);
                if (((p0) obj).getIndex() != i26) {
                    break;
                }
                i28++;
            }
            p0 p0Var2 = (p0) obj;
            if (p0Var2 != null) {
                long j12 = p0Var2.j(0);
                i17 = (int) (p0Var2.h() ? j12 & j9 : j12 >> 32);
            } else {
                i17 = Integer.MIN_VALUE;
            }
            int iMax = i16 == Integer.MIN_VALUE ? -i12 : Math.max(-i12, i16);
            if (i17 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i17 - iC2);
            }
            p0Var.i();
            p0Var.b(iMax, 0, i13, i14);
            arrayList2.add(p0Var);
            i25++;
            i18 = -1;
        }
        return arrayList2;
    }

    public static final List g(j0 j0Var, s0 s0Var, hf.c cVar) {
        z00.e eVar;
        m1.e eVar2 = (m1.e) cVar.B;
        if (!(eVar2.C != 0) && s0Var.A.isEmpty()) {
            return h00.x.A;
        }
        ArrayList arrayList = new ArrayList();
        if (((m1.e) cVar.B).C != 0) {
            int i10 = eVar2.C;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar2.A;
            int i11 = ((o) objArr[0]).f9780a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((o) objArr[i12]).f9780a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                g0.a.a("negative minIndex");
            }
            int i14 = eVar2.C;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar2.A;
            int i15 = ((o) objArr2[0]).f9781b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = ((o) objArr2[i16]).f9781b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            eVar = new z00.e(i11, Math.min(i15, j0Var.a() - 1), 1);
        } else {
            eVar = z00.e.D;
        }
        int size = s0Var.A.size();
        for (int i18 = 0; i18 < size; i18++) {
            r0 r0Var = (r0) s0Var.get(i18);
            int i19 = i(r0Var.f9787c, r0Var.f9785a, j0Var);
            int i20 = ((z00.c) eVar).A;
            if ((i19 > ((z00.c) eVar).B || i20 > i19) && i19 >= 0 && i19 < j0Var.a()) {
                arrayList.add(Integer.valueOf(i19));
            }
        }
        int i21 = ((z00.c) eVar).A;
        int i22 = ((z00.c) eVar).B;
        if (i21 <= i22) {
            while (true) {
                arrayList.add(Integer.valueOf(i21));
                if (i21 == i22) {
                    break;
                }
                i21++;
            }
        }
        return arrayList;
    }

    public static l1.z0 h() {
        return new l1.i1(g00.b0.a, l1.c.D);
    }

    public static final int i(int i10, Object obj, j0 j0Var) {
        int iE;
        return (obj == null || j0Var.a() == 0 || (i10 < j0Var.a() && obj.equals(j0Var.b(i10))) || (iE = j0Var.e(obj)) == -1) ? i10 : iE;
    }

    public static final b2.r m(u uVar, hf.c cVar, d0.q1 q1Var) {
        return new p(uVar, cVar, q1Var);
    }

    public static final b2.r n(b2.r rVar, a10.r rVar2, b1 b1Var, d0.q1 q1Var, boolean z10) {
        return rVar.V(new c1(rVar2, b1Var, q1Var, z10));
    }

    public static final List o(int i10, int i11, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return h00.x.A;
        }
        ArrayList arrayListO1 = h00.q.o1(list);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p0 p0Var = (p0) arrayList.get(i12);
            int index = p0Var.getIndex();
            if (i10 <= index && index <= i11) {
                arrayListO1.add(p0Var);
            }
        }
        h00.u.t0(arrayListO1, f9784b);
        return arrayListO1;
    }

    public Object j(int i10) {
        k kVarK = k().k(i10);
        return kVarK.f9776c.getType().invoke(Integer.valueOf(i10 - kVarK.f9774a));
    }

    public abstract c50.h k();

    public Object l(int i10) {
        Object objInvoke;
        k kVarK = k().k(i10);
        int i11 = i10 - kVarK.f9774a;
        u00.k key = kVarK.f9776c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new i(i10) : objInvoke;
    }
}
