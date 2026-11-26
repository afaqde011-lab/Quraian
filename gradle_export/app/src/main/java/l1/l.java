package l1;

import androidx.compose.runtime.ComposeRuntimeError;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;

public abstract class l {

    public static final c1 f9891a = new c1("provider");

    public static final c1 f9892b = new c1("provider");

    public static final c1 f9893c = new c1("compositionLocalMap");

    public static final c1 f9894d = new c1("providers");

    public static final c1 f9895e = new c1("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(a1.b.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(a1.b.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final s0 c(p pVar, t0 t0Var, o1.k kVar, a aVar) throws KotlinNothingValueException {
        c cVar;
        o1.h hVar;
        boolean z10;
        ArrayList arrayList;
        o1.b bVar;
        long[] jArr;
        o1.b bVar2;
        c cVar2;
        o1.h hVar2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean zG;
        int i13;
        int i14;
        long j9;
        t0 t0Var2 = t0Var;
        c cVar3 = i.f9868a;
        o1.h hVar3 = new o1.h();
        if (kVar.f11494e != null) {
            hVar3.c();
        }
        if (kVar.f11495f != null) {
            hVar3.K = new u.w();
        }
        int i15 = kVar.f11507t;
        if (aVar != null && kVar.F(i15) > 0) {
            int iG = kVar.f11509v;
            while (iG > 0 && !kVar.y(iG)) {
                iG = kVar.G(kVar.f11491b, iG);
            }
            if (iG >= 0 && kVar.y(iG)) {
                Object objE = kVar.E(iG);
                int i16 = iG + 1;
                int iU = kVar.u(iG) + iG;
                int iF = 0;
                while (i16 < iU) {
                    int iU2 = kVar.u(i16) + i16;
                    if (iU2 > i15) {
                        break;
                    }
                    iF += kVar.y(i16) ? 1 : kVar.F(i16);
                    i16 = iU2;
                }
                int iF2 = kVar.y(i15) ? 1 : kVar.F(i15);
                aVar.e(objE);
                aVar.h(iF, iF2);
                aVar.l();
            }
        }
        o1.b bVar3 = t0Var2.f9934e;
        if (bVar3.a()) {
            kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            if (pVar.N.f14860e > 0) {
                arrayList = new ArrayList();
                u.i0 i0Var = pVar.N;
                long[] jArr2 = i0Var.f14856a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j10 = jArr2[i17];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j10 & 255) < 128) {
                                    int i21 = i18;
                                    int i22 = (i17 << 3) + i20;
                                    bVar2 = bVar3;
                                    Object obj = i0Var.f14857b[i22];
                                    Object obj2 = i0Var.f14858c[i22];
                                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                                    if (obj2 instanceof u.j0) {
                                        u.j0 j0Var = (u.j0) obj2;
                                        Object[] objArr = j0Var.f14865b;
                                        long[] jArr3 = j0Var.f14864a;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            i11 = i20;
                                            int i23 = 0;
                                            while (true) {
                                                long j11 = jArr3[i23];
                                                cVar2 = cVar3;
                                                hVar2 = hVar3;
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j11 & 255) < 128) {
                                                            i13 = i25;
                                                            int i26 = (i23 << 3) + i13;
                                                            j9 = j11;
                                                            Object obj3 = objArr[i26];
                                                            r1 r1Var = (r1) obj;
                                                            o1.b bVar4 = r1Var.f9920c;
                                                            if (bVar4 != null) {
                                                                o1.b bVarQ = y3.q(bVar2);
                                                                o1.b bVarQ2 = y3.q(bVar4);
                                                                int iC = kVar.c(bVarQ);
                                                                i14 = length;
                                                                int i27 = kVar.f11491b[(iC * 5) + 3] + iC;
                                                                int i28 = bVarQ2.f11470a;
                                                                if (iC <= i28 && i28 < i27) {
                                                                    arrayList.add(new g00.k(r1Var, obj3));
                                                                    j0Var.m(i26);
                                                                }
                                                            } else {
                                                                i14 = length;
                                                            }
                                                        } else {
                                                            i13 = i25;
                                                            i14 = length;
                                                            j9 = j11;
                                                        }
                                                        j11 = j9 >> i21;
                                                        i25 = i13 + 1;
                                                        length = i14;
                                                    }
                                                    i10 = length;
                                                    if (i24 != i21) {
                                                        break;
                                                    }
                                                } else {
                                                    i10 = length;
                                                }
                                                if (i23 == length2) {
                                                    break;
                                                }
                                                i23++;
                                                cVar3 = cVar2;
                                                hVar3 = hVar2;
                                                length = i10;
                                                i21 = 8;
                                            }
                                        } else {
                                            cVar2 = cVar3;
                                            hVar2 = hVar3;
                                            i10 = length;
                                            i11 = i20;
                                        }
                                        zG = j0Var.g();
                                    } else {
                                        cVar2 = cVar3;
                                        hVar2 = hVar3;
                                        i10 = length;
                                        i11 = i20;
                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        r1 r1Var2 = (r1) obj;
                                        o1.b bVar5 = r1Var2.f9920c;
                                        if (bVar5 != null) {
                                            o1.b bVarQ3 = y3.q(bVar2);
                                            o1.b bVarQ4 = y3.q(bVar5);
                                            int iC2 = kVar.c(bVarQ3);
                                            int i29 = kVar.f11491b[(iC2 * 5) + 3] + iC2;
                                            int i30 = bVarQ4.f11470a;
                                            if (iC2 > i30 || i30 >= i29) {
                                                z11 = false;
                                            } else {
                                                arrayList.add(new g00.k(r1Var2, obj2));
                                                z11 = true;
                                            }
                                        } else {
                                            z11 = false;
                                        }
                                        zG = z11;
                                    }
                                    if (zG) {
                                        i0Var.l(i22);
                                    }
                                    i12 = 8;
                                } else {
                                    bVar2 = bVar3;
                                    cVar2 = cVar3;
                                    hVar2 = hVar3;
                                    i10 = length;
                                    i11 = i20;
                                    i12 = i18;
                                }
                                j10 >>= i12;
                                i20 = i11 + 1;
                                i18 = i12;
                                bVar3 = bVar2;
                                jArr2 = jArr2;
                                cVar3 = cVar2;
                                hVar3 = hVar2;
                                length = i10;
                            }
                            bVar = bVar3;
                            cVar = cVar3;
                            hVar = hVar3;
                            jArr = jArr2;
                            int i31 = length;
                            if (i19 != i18) {
                                break;
                            }
                            length = i31;
                        } else {
                            bVar = bVar3;
                            cVar = cVar3;
                            hVar = hVar3;
                            jArr = jArr2;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17++;
                        bVar3 = bVar;
                        jArr2 = jArr;
                        cVar3 = cVar;
                        hVar3 = hVar;
                    }
                } else {
                    cVar = cVar3;
                    hVar = hVar3;
                }
            } else {
                cVar = cVar3;
                hVar = hVar3;
                arrayList = h00.x.A;
            }
            t0Var2 = t0Var;
            t0Var2.f9935f = h00.q.Y0(arrayList, (Collection) t0Var2.f9935f);
        } else {
            cVar = cVar3;
            hVar = hVar3;
        }
        o1.k kVarK = hVar.k();
        try {
            kVarK.d();
            c cVar4 = cVar;
            kVarK.S(126665345, t0Var2.f9930a, cVar4, false);
            o1.k.z(kVarK);
            kVarK.U(t0Var2.f9931b);
            List listD = kVar.D(y3.q(t0Var2.f9934e), kVarK);
            kVarK.N();
            kVarK.j();
            kVarK.k();
            kVarK.e(true);
            o1.h hVar4 = hVar;
            s0 s0Var = new s0(hVar4);
            if (!listD.isEmpty()) {
                int size = listD.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size) {
                        z10 = false;
                        break;
                    }
                    o1.b bVar6 = (o1.b) listD.get(i32);
                    if (hVar4.l(bVar6)) {
                        int iA = hVar4.a(bVar6);
                        int iB = o1.j.b(hVar4.A, iA);
                        int i33 = iA + 1;
                        if (((i33 < hVar4.B ? hVar4.A[(i33 * 5) + 4] : hVar4.C.length) - iB > 0 ? hVar4.C[iB] : cVar4) instanceof r1) {
                            z10 = true;
                            break;
                        }
                    }
                    i32++;
                }
            } else {
                z10 = false;
                break;
            }
            if (!z10) {
                return s0Var;
            }
            k kVar2 = new k(pVar, t0Var2);
            o1.k kVarK2 = hVar4.k();
            try {
                q.m(kVarK2, listD, kVar2);
                boolean z12 = true;
                return s0Var;
            } finally {
                kVarK2.e(false);
            }
        } catch (Throwable th2) {
            kVarK.e(false);
            throw th2;
        }
    }
}
