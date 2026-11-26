package a1;

import android.content.ClipData;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import g1.d4;
import g1.m6;
import g1.n6;
import g1.x5;
import g1.z6;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class y1 implements u00.n {
    public final int A;
    public final Object B;

    public y1(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public y1(Object obj, int i10, int i11) {
        this.A = i11;
        this.B = obj;
    }

    public y1(l1.r0 r0Var, Object obj) {
        this.A = 26;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        n6 n6Var;
        char c10;
        char c11;
        char c12 = 7;
        c40.w string = null;
        switch (this.A) {
            case 0:
                j2 j2Var = (j2) this.B;
                j2Var.G1();
                j2Var.S.d();
                ClipData clipData = ((c3.e1) obj).f2653a;
                int itemCount = clipData.getItemCount();
                int i10 = 0;
                boolean z10 = false;
                while (i10 < itemCount) {
                    boolean z11 = z10 || clipData.getItemAt(i10).getText() != null;
                    i10++;
                    z10 = z11;
                }
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    int i11 = 0;
                    boolean z12 = false;
                    while (i11 < itemCount2) {
                        CharSequence text = clipData.getItemAt(i11).getText();
                        if (text != null) {
                            if (z12) {
                                sb2.append("\n");
                            }
                            sb2.append(text);
                            z12 = true;
                        }
                        i11++;
                        z12 = z12;
                    }
                    string = sb2.toString();
                }
                b0.a.a(j2Var);
                if (string != null) {
                    w2.h(j2Var.Q, string, false, 14);
                }
                return Boolean.TRUE;
            case 1:
                ((Integer) obj2).getClass();
                as.a.b((PlaylistLauncher) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((av.l) this.B).j((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((av.n) this.B).j((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((av.p) this.B).j((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((av.q) this.B).j((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((av.t) this.B).j((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 7:
                ys.c cVar = (ys.c) this.B;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6.b(z3.U(jVar, cVar.A), null, dl.a.k, kh.o.z(16), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 24576, 0, 262122);
                } else {
                    g0Var.V();
                }
                return g00.b0.a;
            case 8:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.B;
                float fFloatValue = ((Float) obj2).floatValue();
                ((v2.s) obj).a();
                wVar.A = fFloatValue;
                return g00.b0.a;
            case 9:
                d0.m2 m2Var = (d0.m2) this.B;
                a40.c0.y(m2Var.p1(), (k00.i) null, (a40.a0) null, new d0.l2(m2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 10:
                dq.u uVar = (dq.u) this.B;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b2.r rVarD = h0.z1.d(h0.z1.e(b2.o.A, 48.0f), 1.0f);
                    p0.e eVarA = p0.f.a(32);
                    h0.p1 p1Var = g1.s.f5954a;
                    g1.r rVarA = g1.s.a(i2.t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, jVar2, 12);
                    boolean zG = g0Var2.g(uVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new dq.h(uVar, 2);
                        g0Var2.n0(objN);
                    }
                    x5.a((u00.a) objN, rVarD, false, eVarA, rVarA, null, null, null, dq.v.a, jVar2, 805306416, 484);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 11:
                ((Integer) obj2).getClass();
                p30.f.M((du.t0) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 12:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.B;
                ((v2.s) obj).a();
                yVar.A = ((h2.b) obj2).f6544a;
                return g00.b0.a;
            case 13:
                e40.p pVar = (e40.p) this.B;
                int iIntValue3 = ((Integer) obj).intValue();
                c40.w wVar2 = (k00.g) obj2;
                a40.w key = wVar2.getKey();
                c40.w wVar3 = pVar.B.get(key);
                if (key == a40.w.B) {
                    c40.w wVar4 = (a40.e1) wVar3;
                    c40.w parent = (a40.e1) wVar2;
                    while (parent != null) {
                        if (parent != wVar4 && (parent instanceof f40.p)) {
                            a40.n nVar = (a40.n) a40.m1.B.get((f40.p) parent);
                            parent = nVar != null ? nVar.getParent() : null;
                        } else {
                            string = parent;
                            if (string == wVar4) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + string + ", expected child of " + wVar4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (wVar4 != null) {
                                iIntValue3++;
                            }
                        }
                    }
                    if (string == wVar4) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + string + ", expected child of " + wVar4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (wVar4 != null) {
                        iIntValue3++;
                    }
                } else if (wVar2 != wVar3) {
                    iIntValue3 = Integer.MIN_VALUE;
                } else {
                    iIntValue3++;
                }
                return Integer.valueOf(iIntValue3);
            case 14:
                g1.o0 o0Var = (g1.o0) this.B;
                a40.c0.y(o0Var.p1(), (k00.i) null, (a40.a0) null, new g1.m0(o0Var, (h2.b) obj2, string, false ? 1 : 0), 3);
                return g00.b0.a;
            case 15:
                return (x.b1) this.B;
            case 16:
                ((Integer) obj2).getClass();
                ((d4) this.B).a((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 17:
                m6 m6Var = (m6) this.B;
                y3.l lVar = (y3.l) obj;
                float fG = y3.a.g(((y3.a) obj2).f16587a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                n6 n6Var2 = n6.A;
                linkedHashMap.put(n6Var2, Float.valueOf(fG));
                if (((int) (lVar.f16596a & 4294967295L)) > fG / 2 && !m6Var.f5884a) {
                    linkedHashMap.put(n6.C, Float.valueOf(fG / 2.0f));
                }
                int i12 = (int) (lVar.f16596a & 4294967295L);
                if (i12 != 0) {
                    linkedHashMap.put(n6.B, Float.valueOf(Math.max(0.0f, fG - i12)));
                }
                h1.n0 n0Var = new h1.n0(linkedHashMap);
                int iOrdinal = ((n6) ((l1.w) m6Var.f5887d.f5633h).getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        n6Var = n6.B;
                        if (linkedHashMap.containsKey(n6Var)) {
                            n6Var2 = n6Var;
                        }
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n6Var = n6.C;
                        if (linkedHashMap.containsKey(n6Var)) {
                            n6Var2 = n6Var;
                        } else {
                            n6Var = n6.B;
                            if (linkedHashMap.containsKey(n6Var)) {
                                n6Var2 = n6Var;
                            }
                        }
                    }
                }
                return new g00.k(n0Var, n6Var2);
            case TYPE_SINT64_VALUE:
                ((Integer) obj2).getClass();
                gn.a.e((hn.a) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new y3.j((((long) ((b2.c) this.B).a(0, (int) (((y3.l) obj).f16596a >> 32), (y3.m) obj2)) << 32) | (((long) 0) & 4294967295L));
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new y3.j((((long) 0) << 32) | (((long) ((b2.h) this.B).a(0, (int) (((y3.l) obj).f16596a & 4294967295L))) & 4294967295L));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new y3.j(((b2.d) this.B).a(0L, ((y3.l) obj).f16596a, (y3.m) obj2));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((Integer) obj2).getClass();
                w50.c.c((gm.a) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 23:
                ((Integer) obj2).getClass();
                a.a.f((b6.m) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 24:
                ((Integer) obj2).getClass();
                k00.f.b((ln.c) this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 25:
                v1.i iVar = (v1.i) this.B;
                ((Integer) obj).getClass();
                if (obj2 instanceof l1.f) {
                    l1.f fVar = (l1.f) obj2;
                    u.j0 j0Var = iVar.f15342h;
                    if (j0Var == null) {
                        u.j0 j0Var2 = u.r0.f14890a;
                        j0Var = new u.j0();
                        iVar.f15342h = j0Var;
                    }
                    j0Var.j(fVar);
                    iVar.f15340f.b(fVar);
                }
                if (obj2 instanceof l1.z1) {
                    iVar.e((l1.z1) obj2);
                }
                if (obj2 instanceof l1.r1) {
                    ((l1.r1) obj2).d();
                }
                return g00.b0.a;
            case RuntimeVersion.MINOR:
                Object obj3 = this.B;
                l1.j jVar3 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    q9.a.f12786a.invoke(obj3, jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            case 27:
                l1.x0 x0Var = (l1.x0) this.B;
                Set set = (Set) obj;
                synchronized (x0Var.B) {
                    try {
                        u.i0 i0Var = x0Var.C;
                        h1.v0 v0Var = new h1.v0(set, x0Var, 21);
                        kotlin.jvm.internal.d0.d(1, v0Var);
                        Object[] objArr = i0Var.f14857b;
                        long[] jArr = i0Var.f14856a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j9 = jArr[i13];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j9 & 255) < 128) {
                                            v0Var.invoke(objArr[(i13 << 3) + i15]);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i14 == 8) {
                                        if (i13 != length) {
                                            i13++;
                                        }
                                    }
                                } else if (i13 != length) {
                                    i13++;
                                }
                            }
                        }
                        u.j0 j0Var3 = x0Var.E;
                        Object[] objArr2 = j0Var3.f14865b;
                        long[] jArr2 = j0Var3.f14864a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i16 = 0;
                            while (true) {
                                long j10 = jArr2[i16];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                    for (int i18 = 0; i18 < i17; i18++) {
                                        if ((j10 & 255) < 128) {
                                            ((c40.w) objArr2[(i16 << 3) + i18]).j(g00.b0.a);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i17 == 8) {
                                        if (i16 != length2) {
                                            i16++;
                                        }
                                    }
                                } else if (i16 != length2) {
                                    i16++;
                                }
                            }
                        }
                        x0Var.E.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return g00.b0.a;
            case 28:
                l1.x1 x1Var = (l1.x1) this.B;
                Set set2 = (Set) obj;
                synchronized (x1Var.f9952d) {
                    try {
                        if (((l1.v1) x1Var.f9969w.getValue()).compareTo(l1.v1.E) >= 0) {
                            u.j0 j0Var4 = x1Var.f9957i;
                            if (set2 instanceof m1.h) {
                                u.j0 j0Var5 = ((m1.h) set2).A;
                                Object[] objArr3 = j0Var5.f14865b;
                                long[] jArr3 = j0Var5.f14864a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j11 = jArr3[i19];
                                        if ((((~j11) << c12) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j11 & 255) < 128) {
                                                    Object obj4 = objArr3[(i19 << 3) + i21];
                                                    c11 = c12;
                                                    if (!(obj4 instanceof z1.a0) || ((z1.a0) obj4).f(1)) {
                                                        j0Var4.a(obj4);
                                                    }
                                                } else {
                                                    c11 = c12;
                                                }
                                                j11 >>= 8;
                                                i21++;
                                                c12 = c11;
                                            }
                                            c10 = c12;
                                            if (i20 == 8) {
                                            }
                                        } else {
                                            c10 = c12;
                                        }
                                        if (i19 != length3) {
                                            i19++;
                                            c12 = c10;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set2) {
                                    if (!(obj5 instanceof z1.a0) || ((z1.a0) obj5).f(1)) {
                                        j0Var4.a(obj5);
                                    }
                                }
                            }
                            string = x1Var.C();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (string != null) {
                    ((a40.k) string).resumeWith(g00.b0.a);
                }
                return g00.b0.a;
            default:
                l1.e2 e2Var = (l1.e2) this.B;
                Set set3 = (Set) obj;
                synchronized (e2Var.B) {
                    try {
                        u.j0 j0Var6 = e2Var.E;
                        if (j0Var6 != null) {
                            Object[] objArr4 = j0Var6.f14865b;
                            long[] jArr4 = j0Var6.f14864a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j12 = jArr4[i22];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 < i23) {
                                                if ((j12 & 255) >= 128 || !set3.contains(objArr4[(i22 << 3) + i24])) {
                                                    j12 >>= 8;
                                                    i24++;
                                                } else {
                                                    string = e2Var.G;
                                                }
                                            } else if (i23 == 8) {
                                                if (i22 != length4) {
                                                    i22++;
                                                }
                                            }
                                        }
                                    } else if (i22 != length4) {
                                        i22++;
                                    }
                                }
                            }
                        } else if (h00.q.F0(set3, e2Var.C)) {
                            string = e2Var.G;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (string != null) {
                    string.j(g00.b0.a);
                }
                return g00.b0.a;
        }
    }
}
