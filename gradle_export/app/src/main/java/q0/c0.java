package q0;

import a1.p2;
import a1.s2;
import a1.w2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c3.g3;
import c3.u2;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;

public abstract class c0 {

    public static final long f12577a;

    public static final int f12578b = 0;

    static {
        float f3 = 40;
        f12577a = f50.c.b(f3, f3);
    }

    public static final void a(String str, u00.k kVar, b2.r rVar, boolean z10, m3.r0 r0Var, i1 i1Var, h1 h1Var, boolean z11, int i10, int i11, r3.e0 e0Var, u00.k kVar2, f0.i iVar, i2.v0 v0Var, v1.c cVar, l1.j jVar, int i12, int i13, int i14) {
        int i15;
        boolean z12;
        int i16;
        int i17;
        h1 h1Var2;
        int i18;
        int i19;
        boolean z13;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z14;
        l1.g0 g0Var;
        u00.k kVar3;
        boolean z15;
        h1 h1Var3;
        boolean z16;
        r3.e0 e0Var2;
        f0.i iVar2;
        l1.r1 r1VarT;
        int i31;
        l1.c cVar2;
        r3.e0 e0Var3;
        Object objN;
        f0.i iVar3;
        boolean z17;
        h1 h1Var4;
        Object objN2;
        l1.z0 z0Var;
        r3.w wVarA;
        boolean zG;
        Object objN3;
        boolean z18;
        Object objN4;
        l1.z0 z0Var2;
        boolean z19;
        int i32;
        boolean z20;
        Object objN5;
        int i33;
        int i34;
        int i35;
        int i36;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(2026950908);
        if ((i12 & 6) == 0) {
            i15 = (g0Var2.g(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= g0Var2.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i37 = i14 & 8;
        if (i37 == 0) {
            if ((i12 & 3072) == 0) {
                z12 = z10;
                i15 |= g0Var2.h(z12) ? 2048 : 1024;
            }
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (g0Var2.h(false)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i15 |= i16;
            }
            if ((i12 & 196608) == 0) {
                if (g0Var2.g(r0Var)) {
                    i36 = 131072;
                } else {
                    i36 = Cast.MAX_MESSAGE_LENGTH;
                }
                i15 |= i36;
            }
            if ((i12 & 1572864) == 0) {
                if (g0Var2.g(i1Var)) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i15 |= i35;
            }
            i17 = i14 & Cast.MAX_NAMESPACE_LENGTH;
            if (i17 != 0) {
                i15 |= 12582912;
                h1Var2 = h1Var;
            } else {
                h1Var2 = h1Var;
                if ((i12 & 12582912) == 0) {
                    if (g0Var2.g(h1Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i15 |= i18;
                }
            }
            i19 = i14 & 256;
            if (i19 != 0) {
                i15 |= 100663296;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i12 & 100663296) == 0) {
                    if (g0Var2.h(z13)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i15 |= i20;
                }
            }
            if ((i12 & 805306368) == 0) {
                if (g0Var2.e(i10)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i13 & 6) == 0) {
                if (g0Var2.e(i11)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i21 = i13 | i33;
            } else {
                i21 = i13;
            }
            i22 = i14 & 2048;
            if (i22 != 0) {
                i24 = i21 | 48;
            } else {
                if (g0Var2.g(e0Var)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i24 = i21 | i23;
            }
            i25 = i24;
            i26 = i25 | 384;
            i27 = i14 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3456;
            } else {
                if (g0Var2.g(iVar)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i29 = i26 | i28;
            }
            i30 = i29 | (g0Var2.g(v0Var) ? 16384 : 8192);
            if ((i15 & 306783379) == 306783378 || (i30 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (g0Var2.S(i15 & 1, z14)) {
                g0Var2.X();
                i31 = i12 & 1;
                cVar2 = l1.i.f9868a;
                if (i31 != 0 || g0Var2.A()) {
                    if (i37 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        h1Var2 = h1.f12619c;
                    }
                    if (i19 != 0) {
                        z13 = false;
                    }
                    if (i22 != 0) {
                        e0Var3 = r3.d0.A;
                    } else {
                        e0Var3 = e0Var;
                    }
                    objN = g0Var2.N();
                    if (objN == cVar2) {
                        objN = new pp.d(4);
                        g0Var2.n0(objN);
                    }
                    u00.k kVar4 = (u00.k) objN;
                    if (i27 != 0) {
                        iVar3 = null;
                    } else {
                        iVar3 = iVar;
                    }
                    boolean z21 = z13;
                    e0Var2 = e0Var3;
                    z17 = z21;
                    kVar3 = kVar4;
                    h1Var4 = h1Var2;
                    iVar2 = iVar3;
                } else {
                    g0Var2.V();
                    kVar3 = kVar2;
                    z17 = z13;
                    h1Var4 = h1Var2;
                    e0Var2 = e0Var;
                    iVar2 = iVar;
                }
                g0Var2.s();
                objN2 = g0Var2.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.z(new r3.w(str, 0L, 6));
                    g0Var2.n0(objN2);
                }
                z0Var = (l1.z0) objN2;
                wVarA = r3.w.a((r3.w) z0Var.getValue(), str);
                zG = g0Var2.g(wVarA);
                objN3 = g0Var2.N();
                if (zG || objN3 == cVar2) {
                    objN3 = new l6.c(wVarA, z0Var, 12);
                    g0Var2.n0(objN3);
                }
                l1.q.k((u00.a) objN3, g0Var2);
                if ((i15 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objN4 = g0Var2.N();
                if (z18 || objN4 == cVar2) {
                    objN4 = l1.q.z(str);
                    g0Var2.n0(objN4);
                }
                z0Var2 = (l1.z0) objN4;
                r3.j jVarC = i1Var.c(z17);
                boolean z22 = z12;
                boolean z23 = !z17;
                z19 = true;
                int i38 = z17 ? 1 : i11;
                if (z17) {
                    i32 = 1;
                } else {
                    i32 = i10;
                }
                boolean zG2 = g0Var2.g(z0Var2);
                boolean z24 = z17;
                if ((i15 & 112) != 32) {
                    z19 = false;
                }
                z20 = zG2 | z19;
                objN5 = g0Var2.N();
                if (z20 || objN5 == cVar2) {
                    objN5 = new b1.l(kVar, z0Var, z0Var2, 27);
                    g0Var2.n0(objN5);
                }
                int i39 = i30 << 9;
                g0Var = g0Var2;
                q.i(wVarA, (u00.k) objN5, rVar, r0Var, e0Var2, kVar3, iVar2, v0Var, z23, i32, i38, jVarC, h1Var4, z22, cVar, g0Var, (i15 & 896) | ((i15 >> 6) & 7168) | (i39 & 57344) | 196608 | (3670016 & i39) | (i39 & 29360128), ((i15 >> 15) & 896) | (i15 & 7168) | (i15 & 57344) | 196608);
                h1Var3 = h1Var4;
                z16 = z22;
                z15 = z24;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                kVar3 = kVar2;
                z15 = z13;
                h1Var3 = h1Var2;
                z16 = z12;
                e0Var2 = e0Var;
                iVar2 = iVar;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new r(str, kVar, rVar, z16, r0Var, i1Var, h1Var3, z15, i10, i11, e0Var2, kVar3, iVar2, v0Var, cVar, i12, i13, i14, 1);
            }
        }
        i15 |= 3072;
        z12 = z10;
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i12 & 24576) == 0) {
            if (g0Var2.h(false)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i15 |= i16;
        }
        if ((i12 & 196608) == 0) {
            if (g0Var2.g(r0Var)) {
                i36 = 131072;
            } else {
                i36 = Cast.MAX_MESSAGE_LENGTH;
            }
            i15 |= i36;
        }
        if ((i12 & 1572864) == 0) {
            if (g0Var2.g(i1Var)) {
                i35 = 1048576;
            } else {
                i35 = 524288;
            }
            i15 |= i35;
        }
        i17 = i14 & Cast.MAX_NAMESPACE_LENGTH;
        if (i17 != 0) {
            i15 |= 12582912;
            h1Var2 = h1Var;
        } else {
            h1Var2 = h1Var;
            if ((i12 & 12582912) == 0) {
                if (g0Var2.g(h1Var2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
        }
        i19 = i14 & 256;
        if (i19 != 0) {
            i15 |= 100663296;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i12 & 100663296) == 0) {
                if (g0Var2.h(z13)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i15 |= i20;
            }
        }
        if ((i12 & 805306368) == 0) {
            if (g0Var2.e(i10)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i15 |= i34;
        }
        if ((i13 & 6) == 0) {
            if (g0Var2.e(i11)) {
                i33 = 4;
            } else {
                i33 = 2;
            }
            i21 = i13 | i33;
        } else {
            i21 = i13;
        }
        i22 = i14 & 2048;
        if (i22 != 0) {
            i24 = i21 | 48;
        } else {
            if (g0Var2.g(e0Var)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i24 = i21 | i23;
        }
        i25 = i24;
        i26 = i25 | 384;
        i27 = i14 & 8192;
        if (i27 != 0) {
            i29 = i25 | 3456;
        } else {
            if (g0Var2.g(iVar)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i29 = i26 | i28;
        }
        i30 = i29 | (g0Var2.g(v0Var) ? 16384 : 8192);
        if ((i15 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (g0Var2.S(i15 & 1, z14)) {
            g0Var2.X();
            i31 = i12 & 1;
            cVar2 = l1.i.f9868a;
            if (i31 != 0) {
                if (i37 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    h1Var2 = h1.f12619c;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                if (i22 != 0) {
                    e0Var3 = r3.d0.A;
                } else {
                    e0Var3 = e0Var;
                }
                objN = g0Var2.N();
                if (objN == cVar2) {
                    objN = new pp.d(4);
                    g0Var2.n0(objN);
                }
                u00.k kVar5 = (u00.k) objN;
                if (i27 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                boolean z25 = z13;
                e0Var2 = e0Var3;
                z17 = z25;
                kVar3 = kVar5;
                h1Var4 = h1Var2;
                iVar2 = iVar3;
            } else {
                if (i37 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    h1Var2 = h1.f12619c;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                if (i22 != 0) {
                    e0Var3 = r3.d0.A;
                } else {
                    e0Var3 = e0Var;
                }
                objN = g0Var2.N();
                if (objN == cVar2) {
                    objN = new pp.d(4);
                    g0Var2.n0(objN);
                }
                u00.k kVar6 = (u00.k) objN;
                if (i27 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                boolean z26 = z13;
                e0Var2 = e0Var3;
                z17 = z26;
                kVar3 = kVar6;
                h1Var4 = h1Var2;
                iVar2 = iVar3;
            }
            g0Var2.s();
            objN2 = g0Var2.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.z(new r3.w(str, 0L, 6));
                g0Var2.n0(objN2);
            }
            z0Var = (l1.z0) objN2;
            wVarA = r3.w.a((r3.w) z0Var.getValue(), str);
            zG = g0Var2.g(wVarA);
            objN3 = g0Var2.N();
            if (zG) {
                objN3 = new l6.c(wVarA, z0Var, 12);
                g0Var2.n0(objN3);
            } else {
                objN3 = new l6.c(wVarA, z0Var, 12);
                g0Var2.n0(objN3);
            }
            l1.q.k((u00.a) objN3, g0Var2);
            if ((i15 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            objN4 = g0Var2.N();
            if (z18) {
                objN4 = l1.q.z(str);
                g0Var2.n0(objN4);
            } else {
                objN4 = l1.q.z(str);
                g0Var2.n0(objN4);
            }
            z0Var2 = (l1.z0) objN4;
            r3.j jVarC2 = i1Var.c(z17);
            boolean z27 = z12;
            boolean z28 = !z17;
            z19 = true;
            if (z17) {
            }
            if (z17) {
                i32 = 1;
            } else {
                i32 = i10;
            }
            boolean zG3 = g0Var2.g(z0Var2);
            boolean z29 = z17;
            if ((i15 & 112) != 32) {
                z19 = false;
            }
            z20 = zG3 | z19;
            objN5 = g0Var2.N();
            if (z20) {
                objN5 = new b1.l(kVar, z0Var, z0Var2, 27);
                g0Var2.n0(objN5);
            } else {
                objN5 = new b1.l(kVar, z0Var, z0Var2, 27);
                g0Var2.n0(objN5);
            }
            int i310 = i30 << 9;
            g0Var = g0Var2;
            q.i(wVarA, (u00.k) objN5, rVar, r0Var, e0Var2, kVar3, iVar2, v0Var, z28, i32, i38, jVarC2, h1Var4, z27, cVar, g0Var, (i15 & 896) | ((i15 >> 6) & 7168) | (i310 & 57344) | 196608 | (3670016 & i310) | (i310 & 29360128), ((i15 >> 15) & 896) | (i15 & 7168) | (i15 & 57344) | 196608);
            h1Var3 = h1Var4;
            z16 = z27;
            z15 = z29;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            kVar3 = kVar2;
            z15 = z13;
            h1Var3 = h1Var2;
            z16 = z12;
            e0Var2 = e0Var;
            iVar2 = iVar;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new r(str, kVar, rVar, z16, r0Var, i1Var, h1Var3, z15, i10, i11, e0Var2, kVar3, iVar2, v0Var, cVar, i12, i13, i14, 1);
        }
    }

    public static final void b(r3.w wVar, u00.k kVar, b2.r rVar, boolean z10, m3.r0 r0Var, i1 i1Var, h1 h1Var, boolean z11, int i10, int i11, r3.e0 e0Var, u00.k kVar2, f0.i iVar, i2.q qVar, v1.c cVar, l1.j jVar, int i12, int i13, int i14) {
        int i15;
        boolean z12;
        int i16;
        int i17;
        m3.r0 r0Var2;
        int i18;
        int i19;
        h1 h1Var2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z13;
        boolean z14;
        int i35;
        u00.k kVar3;
        f0.i iVar2;
        boolean z15;
        m3.r0 r0Var3;
        h1 h1Var3;
        int i36;
        r3.e0 e0Var2;
        l1.r1 r1VarT;
        int i37;
        l1.c cVar2;
        m3.r0 r0Var4;
        h1 h1Var4;
        boolean z16;
        int i38;
        int i39;
        r3.e0 e0Var3;
        Object objN;
        f0.i iVar3;
        f0.i iVar4;
        boolean z17;
        boolean z18;
        r3.e0 e0Var4;
        u00.k kVar4;
        int i40;
        int i41;
        m3.r0 r0Var5;
        h1 h1Var5;
        int i42;
        boolean z19;
        int i43;
        int i44;
        boolean z20;
        boolean z21;
        Object objN2;
        int i45;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-971111025);
        if ((i12 & 6) == 0) {
            i15 = (g0Var.g(wVar) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i46 = i14 & 8;
        if (i46 == 0) {
            if ((i12 & 3072) == 0) {
                z12 = z10;
                i15 |= g0Var.h(z12) ? 2048 : 1024;
            }
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i12 & 24576) == 0) {
                if (g0Var.h(false)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i15 |= i16;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                i15 |= 196608;
                r0Var2 = r0Var;
            } else {
                r0Var2 = r0Var;
                if ((i12 & 196608) == 0) {
                    if (g0Var.g(r0Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i15 |= i18;
                }
            }
            if ((i12 & 1572864) == 0) {
                if (g0Var.g(i1Var)) {
                    i45 = 1048576;
                } else {
                    i45 = 524288;
                }
                i15 |= i45;
            }
            i19 = i14 & Cast.MAX_NAMESPACE_LENGTH;
            if (i19 != 0) {
                i15 |= 12582912;
                h1Var2 = h1Var;
            } else {
                h1Var2 = h1Var;
                if ((i12 & 12582912) == 0) {
                    if (g0Var.g(h1Var2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i15 |= i20;
                }
            }
            i21 = i14 & 256;
            if (i21 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (g0Var.h(z11)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            if ((i12 & 805306368) != 0) {
                i15 |= ((i14 & 512) == 0 || !g0Var.e(i10)) ? 268435456 : 536870912;
            }
            i23 = i14 & 1024;
            if (i23 != 0) {
                i25 = i13 | 6;
            } else {
                if (g0Var.e(i11)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i25 = i13 | i24;
            }
            i26 = i14 & 2048;
            if (i26 != 0) {
                i28 = i25 | 48;
            } else {
                if (g0Var.g(e0Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i28 = i25 | i27;
            }
            i29 = i28;
            i30 = i15;
            i31 = i29 | 384;
            i32 = i14 & 8192;
            if (i32 != 0) {
                i33 = i29 | 3456;
            } else if ((i13 & 3072) == 0) {
                if (g0Var.g(iVar)) {
                    i34 = 2048;
                } else {
                    i34 = 1024;
                }
                i33 = i31 | i34;
            } else {
                i33 = i31;
            }
            if ((i13 & 24576) != 0) {
                i33 |= g0Var.g(qVar) ? 16384 : 8192;
            }
            if ((i30 & 306783379) == 306783378 || (i33 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (g0Var.S(i30 & 1, z13)) {
                g0Var.X();
                i37 = i12 & 1;
                cVar2 = l1.i.f9868a;
                if (i37 != 0 || g0Var.A()) {
                    if (i46 != 0) {
                        z12 = true;
                    }
                    if (i17 != 0) {
                        r0Var4 = m3.r0.f10521d;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (i19 != 0) {
                        h1Var4 = h1.f12619c;
                    } else {
                        h1Var4 = h1Var2;
                    }
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if ((i14 & 512) != 0) {
                        if (z16) {
                            i38 = 1;
                        } else {
                            i38 = Integer.MAX_VALUE;
                        }
                        i30 &= -1879048193;
                    } else {
                        i38 = i10;
                    }
                    if (i23 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i11;
                    }
                    if (i26 != 0) {
                        e0Var3 = r3.d0.A;
                    } else {
                        e0Var3 = e0Var;
                    }
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = new pp.d(4);
                        g0Var.n0(objN);
                    }
                    u00.k kVar5 = (u00.k) objN;
                    if (i32 != 0) {
                        iVar3 = null;
                    } else {
                        iVar3 = iVar;
                    }
                    boolean z22 = z16;
                    iVar4 = iVar3;
                    z17 = z22;
                    r3.e0 e0Var5 = e0Var3;
                    z18 = z12;
                    e0Var4 = e0Var5;
                    kVar4 = kVar5;
                    i40 = i38;
                    i41 = i39;
                    r0Var5 = r0Var4;
                    h1Var5 = h1Var4;
                    i42 = i30;
                } else {
                    g0Var.V();
                    if ((i14 & 512) != 0) {
                        i40 = i10;
                        i41 = i11;
                        kVar4 = kVar2;
                        iVar4 = iVar;
                        z18 = z12;
                        r0Var5 = r0Var2;
                        h1Var5 = h1Var2;
                        e0Var4 = e0Var;
                        i42 = i30 & (-1879048193);
                        z17 = z11;
                    } else {
                        z17 = z11;
                        i40 = i10;
                        i41 = i11;
                        kVar4 = kVar2;
                        iVar4 = iVar;
                        z18 = z12;
                        r0Var5 = r0Var2;
                        h1Var5 = h1Var2;
                        i42 = i30;
                        e0Var4 = e0Var;
                    }
                }
                g0Var.s();
                r3.j jVarC = i1Var.c(z17);
                z19 = z17;
                f0.i iVar5 = iVar4;
                boolean z23 = !z19;
                if (z19) {
                    i43 = 1;
                } else {
                    i43 = i41;
                }
                if (z19) {
                    i44 = 1;
                } else {
                    i44 = i40;
                }
                m3.r0 r0Var6 = r0Var5;
                if ((i42 & 14) == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = z20 | ((i42 & 112) == 32);
                objN2 = g0Var.N();
                if (z21 || objN2 == cVar2) {
                    objN2 = new mu.q(wVar, kVar, 4);
                    g0Var.n0(objN2);
                }
                int i47 = i33 << 9;
                r3.e0 e0Var6 = e0Var4;
                q.i(wVar, (u00.k) objN2, rVar, r0Var6, e0Var6, kVar4, iVar5, qVar, z23, i44, i43, jVarC, h1Var5, z18, cVar, g0Var, (i42 & 910) | ((i42 >> 6) & 7168) | (i47 & 57344) | 196608 | (i47 & 3670016) | (i47 & 29360128), (i42 & 7168) | ((i42 >> 15) & 896) | (i42 & 57344) | 196608);
                e0Var2 = e0Var6;
                h1Var3 = h1Var5;
                z15 = z18;
                z14 = z19;
                i35 = i40;
                i36 = i41;
                kVar3 = kVar4;
                iVar2 = iVar5;
                r0Var3 = r0Var6;
            } else {
                g0Var.V();
                z14 = z11;
                i35 = i10;
                kVar3 = kVar2;
                iVar2 = iVar;
                z15 = z12;
                r0Var3 = r0Var2;
                h1Var3 = h1Var2;
                i36 = i11;
                e0Var2 = e0Var;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new r(wVar, kVar, rVar, z15, r0Var3, i1Var, h1Var3, z14, i35, i36, e0Var2, kVar3, iVar2, qVar, cVar, i12, i13, i14, 0);
            }
        }
        i15 |= 3072;
        z12 = z10;
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i12 & 24576) == 0) {
            if (g0Var.h(false)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i15 |= i16;
        }
        i17 = i14 & 32;
        if (i17 != 0) {
            i15 |= 196608;
            r0Var2 = r0Var;
        } else {
            r0Var2 = r0Var;
            if ((i12 & 196608) == 0) {
                if (g0Var.g(r0Var2)) {
                    i18 = 131072;
                } else {
                    i18 = Cast.MAX_MESSAGE_LENGTH;
                }
                i15 |= i18;
            }
        }
        if ((i12 & 1572864) == 0) {
            if (g0Var.g(i1Var)) {
                i45 = 1048576;
            } else {
                i45 = 524288;
            }
            i15 |= i45;
        }
        i19 = i14 & Cast.MAX_NAMESPACE_LENGTH;
        if (i19 != 0) {
            i15 |= 12582912;
            h1Var2 = h1Var;
        } else {
            h1Var2 = h1Var;
            if ((i12 & 12582912) == 0) {
                if (g0Var.g(h1Var2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i15 |= i20;
            }
        }
        i21 = i14 & 256;
        if (i21 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (g0Var.h(z11)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i15 |= i22;
        }
        if ((i12 & 805306368) != 0) {
            i15 |= ((i14 & 512) == 0 || !g0Var.e(i10)) ? 268435456 : 536870912;
        }
        i23 = i14 & 1024;
        if (i23 != 0) {
            i25 = i13 | 6;
        } else {
            if (g0Var.e(i11)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i25 = i13 | i24;
        }
        i26 = i14 & 2048;
        if (i26 != 0) {
            i28 = i25 | 48;
        } else {
            if (g0Var.g(e0Var)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i28 = i25 | i27;
        }
        i29 = i28;
        i30 = i15;
        i31 = i29 | 384;
        i32 = i14 & 8192;
        if (i32 != 0) {
            i33 = i29 | 3456;
        } else if ((i13 & 3072) == 0) {
            if (g0Var.g(iVar)) {
                i34 = 2048;
            } else {
                i34 = 1024;
            }
            i33 = i31 | i34;
        } else {
            i33 = i31;
        }
        if ((i13 & 24576) != 0) {
            i33 |= g0Var.g(qVar) ? 16384 : 8192;
        }
        if ((i30 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (g0Var.S(i30 & 1, z13)) {
            g0Var.X();
            i37 = i12 & 1;
            cVar2 = l1.i.f9868a;
            if (i37 != 0) {
                if (i46 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    r0Var4 = m3.r0.f10521d;
                } else {
                    r0Var4 = r0Var2;
                }
                if (i19 != 0) {
                    h1Var4 = h1.f12619c;
                } else {
                    h1Var4 = h1Var2;
                }
                if (i21 != 0) {
                    z16 = false;
                } else {
                    z16 = z11;
                }
                if ((i14 & 512) != 0) {
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    i30 &= -1879048193;
                } else {
                    i38 = i10;
                }
                if (i23 != 0) {
                    i39 = 1;
                } else {
                    i39 = i11;
                }
                if (i26 != 0) {
                    e0Var3 = r3.d0.A;
                } else {
                    e0Var3 = e0Var;
                }
                objN = g0Var.N();
                if (objN == cVar2) {
                    objN = new pp.d(4);
                    g0Var.n0(objN);
                }
                u00.k kVar6 = (u00.k) objN;
                if (i32 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                boolean z24 = z16;
                iVar4 = iVar3;
                z17 = z24;
                r3.e0 e0Var7 = e0Var3;
                z18 = z12;
                e0Var4 = e0Var7;
                kVar4 = kVar6;
                i40 = i38;
                i41 = i39;
                r0Var5 = r0Var4;
                h1Var5 = h1Var4;
                i42 = i30;
            } else {
                if (i46 != 0) {
                    z12 = true;
                }
                if (i17 != 0) {
                    r0Var4 = m3.r0.f10521d;
                } else {
                    r0Var4 = r0Var2;
                }
                if (i19 != 0) {
                    h1Var4 = h1.f12619c;
                } else {
                    h1Var4 = h1Var2;
                }
                if (i21 != 0) {
                    z16 = false;
                } else {
                    z16 = z11;
                }
                if ((i14 & 512) != 0) {
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    i30 &= -1879048193;
                } else {
                    i38 = i10;
                }
                if (i23 != 0) {
                    i39 = 1;
                } else {
                    i39 = i11;
                }
                if (i26 != 0) {
                    e0Var3 = r3.d0.A;
                } else {
                    e0Var3 = e0Var;
                }
                objN = g0Var.N();
                if (objN == cVar2) {
                    objN = new pp.d(4);
                    g0Var.n0(objN);
                }
                u00.k kVar7 = (u00.k) objN;
                if (i32 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                boolean z25 = z16;
                iVar4 = iVar3;
                z17 = z25;
                r3.e0 e0Var8 = e0Var3;
                z18 = z12;
                e0Var4 = e0Var8;
                kVar4 = kVar7;
                i40 = i38;
                i41 = i39;
                r0Var5 = r0Var4;
                h1Var5 = h1Var4;
                i42 = i30;
            }
            g0Var.s();
            r3.j jVarC2 = i1Var.c(z17);
            z19 = z17;
            f0.i iVar6 = iVar4;
            boolean z26 = !z19;
            if (z19) {
                i43 = 1;
            } else {
                i43 = i41;
            }
            if (z19) {
                i44 = 1;
            } else {
                i44 = i40;
            }
            m3.r0 r0Var7 = r0Var5;
            if ((i42 & 14) == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            z21 = z20 | ((i42 & 112) == 32);
            objN2 = g0Var.N();
            if (z21) {
                objN2 = new mu.q(wVar, kVar, 4);
                g0Var.n0(objN2);
            } else {
                objN2 = new mu.q(wVar, kVar, 4);
                g0Var.n0(objN2);
            }
            int i48 = i33 << 9;
            r3.e0 e0Var9 = e0Var4;
            q.i(wVar, (u00.k) objN2, rVar, r0Var7, e0Var9, kVar4, iVar6, qVar, z26, i44, i43, jVarC2, h1Var5, z18, cVar, g0Var, (i42 & 910) | ((i42 >> 6) & 7168) | (i48 & 57344) | 196608 | (i48 & 3670016) | (i48 & 29360128), (i42 & 7168) | ((i42 >> 15) & 896) | (i42 & 57344) | 196608);
            e0Var2 = e0Var9;
            h1Var3 = h1Var5;
            z15 = z18;
            z14 = z19;
            i35 = i40;
            i36 = i41;
            kVar3 = kVar4;
            iVar2 = iVar6;
            r0Var3 = r0Var7;
        } else {
            g0Var.V();
            z14 = z11;
            i35 = i10;
            kVar3 = kVar2;
            iVar2 = iVar;
            z15 = z12;
            r0Var3 = r0Var2;
            h1Var3 = h1Var2;
            i36 = i11;
            e0Var2 = e0Var;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new r(wVar, kVar, rVar, z15, r0Var3, i1Var, h1Var3, z14, i35, i36, e0Var2, kVar3, iVar2, qVar, cVar, i12, i13, i14, 0);
        }
    }

    public static final void c(final z0.g gVar, final b2.r rVar, final boolean z10, final h1.l lVar, final m3.r0 r0Var, final i1 i1Var, final qp.b bVar, final z0.f fVar, final f0.i iVar, final i2.q qVar, final a1.r rVar2, final z0.c cVar, final z.p1 p1Var, boolean z11, l1.j jVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        final boolean z12;
        l1.g0 g0Var;
        final boolean z13;
        boolean z14;
        y3.c cVar2;
        y3.m mVar;
        final boolean zA;
        l1.c cVar3;
        int i15;
        f0.i iVar2;
        d0.q1 q1Var;
        d0.q1 q1Var2;
        boolean zBooleanValue;
        Object objN;
        l1.z0 z0Var;
        boolean zG;
        Object objN2;
        int i16;
        boolean z15;
        Object objN3;
        d40.w0 w0Var;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objN4;
        a1.r rVar3;
        a1.h1 h1Var;
        w2 w2Var;
        boolean zG2;
        Object objN5;
        s2 s2Var;
        Object objN6;
        a40.z zVar;
        t3.b bVarQ;
        e1.q qVarB;
        Object objN7;
        w0.l lVar2;
        c3.g1 g1Var;
        boolean zG3;
        Object e0Var;
        f0.i iVar3;
        y3.m mVar2;
        w2 w2Var2;
        char c10;
        y3.c cVar4;
        final e1.q qVar2;
        c3.g1 g1Var2;
        int i17;
        boolean z20;
        s2 s2Var2;
        final w0.l lVar3;
        a40.z zVar2;
        b1.e0 e0Var2;
        q2.a aVar;
        boolean zG4;
        Object objN8;
        y yVar;
        w2 w2Var3;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        Object sVar;
        b1.e0 e0Var3;
        w2 w2Var4;
        boolean z26;
        boolean zI;
        Object objN9;
        int i18;
        boolean z27;
        boolean zH;
        Object objN10;
        boolean z28;
        d0.q1 q1Var3;
        boolean z29;
        b3.g gVar2;
        int i19;
        boolean z30;
        boolean z31;
        Object objN11;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(965149429);
        if ((i10 & 6) == 0) {
            i13 = (g0Var2.g(gVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= g0Var2.g(rVar) ? 32 : 16;
        }
        int i20 = i10 & 384;
        int i21 = Cast.MAX_NAMESPACE_LENGTH;
        if (i20 == 0) {
            i13 |= g0Var2.h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= g0Var2.h(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= g0Var2.g(lVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 |= g0Var2.g(r0Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= g0Var2.g(i1Var) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= g0Var2.g(bVar) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= g0Var2.g(fVar) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i13 |= g0Var2.i(null) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i14 = i11 | (g0Var2.g(iVar) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= g0Var2.g(qVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            if (g0Var2.g(rVar2)) {
                i21 = 256;
            }
            i14 |= i21;
        }
        int i22 = i14;
        if ((i12 & 8192) != 0) {
            i22 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i22 |= g0Var2.g(null) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i22 |= (32768 & i11) == 0 ? g0Var2.g(cVar) : g0Var2.i(cVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i22 |= g0Var2.g(p1Var) ? 131072 : 65536;
        }
        int i23 = i12 & Cast.MAX_MESSAGE_LENGTH;
        if (i23 != 0) {
            i22 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i22 |= g0Var2.h(z11) ? 1048576 : 524288;
        }
        if (g0Var2.S(i13 & 1, ((i13 & 306783379) == 306783378 && (599187 & i22) == 599186) ? false : true)) {
            g0Var2.X();
            if ((i10 & 1) == 0 || g0Var2.A()) {
                if (i23 != 0) {
                    z14 = false;
                }
                g0Var2.s();
                cVar2 = (y3.c) g0Var2.k(c3.o1.f2734h);
                mVar = (y3.m) g0Var2.k(c3.o1.f2738n);
                zA = kotlin.jvm.internal.m.a(fVar, z0.e.B);
                cVar3 = l1.i.f9868a;
                if (iVar == null) {
                    g0Var2.c0(-2038132442);
                    objN11 = g0Var2.N();
                    if (objN11 == cVar3) {
                        objN11 = w.c.g(g0Var2);
                    }
                    f0.i iVar4 = (f0.i) objN11;
                    i15 = 0;
                    g0Var2.r(false);
                    iVar2 = iVar4;
                } else {
                    i15 = 0;
                    g0Var2.c0(-204294191);
                    g0Var2.r(false);
                    iVar2 = iVar;
                }
                if (zA) {
                    q1Var = d0.q1.B;
                } else {
                    q1Var = d0.q1.A;
                }
                q1Var2 = q1Var;
                zBooleanValue = ((Boolean) g4.x(iVar2, g0Var2, i15).getValue()).booleanValue();
                objN = g0Var2.N();
                if (objN == cVar3) {
                    objN = l1.q.z(Boolean.FALSE);
                    g0Var2.n0(objN);
                }
                z0Var = (l1.z0) objN;
                zG = g0Var2.g(iVar2);
                objN2 = g0Var2.N();
                if (zG || objN2 == cVar3) {
                    objN2 = new a1.h0(iVar2, z0Var, null, 0);
                    g0Var2.n0(objN2);
                }
                l1.q.i(iVar2, g0Var2, (u00.n) objN2);
                final boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
                if (zBooleanValue) {
                    g0Var2.c0(-204276188);
                    boolean zB = ((c3.f2) ((g3) g0Var2.k(c3.o1.f2745u))).b();
                    i16 = 0;
                    g0Var2.r(false);
                    z15 = zB;
                } else {
                    i16 = 0;
                    g0Var2.c0(-2037593295);
                    g0Var2.r(false);
                    z15 = false;
                }
                objN3 = g0Var2.N();
                if (objN3 == cVar3) {
                    objN3 = d40.o.b(i16, 2, c40.a.C);
                    g0Var2.n0(objN3);
                }
                w0Var = (d40.w0) objN3;
                if ((i13 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i22 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z32 = z17 | z16;
                if ((i22 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z32 | z18;
                objN4 = g0Var2.N();
                if (z19 || objN4 == cVar3) {
                    if (rVar2 == null) {
                        if (zA) {
                            h1Var = a1.h1.f53a;
                        } else {
                            h1Var = null;
                        }
                        rVar3 = h1Var;
                    } else {
                        rVar3 = rVar2;
                    }
                    objN4 = new w2(gVar, lVar, rVar3);
                    g0Var2.n0(objN4);
                }
                w2Var = (w2) objN4;
                zG2 = g0Var2.g(w2Var);
                objN5 = g0Var2.N();
                if (zG2 || objN5 == cVar3) {
                    objN5 = new s2();
                    g0Var2.n0(objN5);
                }
                s2Var = (s2) objN5;
                if (lVar != null) {
                    lVar.getClass();
                }
                i1Var.getClass();
                objN6 = g0Var2.N();
                if (objN6 == cVar3) {
                    objN6 = l1.q.o(g0Var2);
                    g0Var2.n0(objN6);
                }
                zVar = (a40.z) objN6;
                g0Var2.c0(-2035821392);
                bVarQ = r0Var.f10522a.f10467k;
                if (bVarQ == null) {
                    t3.b bVar2 = t3.b.C;
                    bVarQ = t3.c.f14353a.q();
                }
                e1.s sVar2 = e1.s.A;
                qVarB = e1.r.b(bVarQ, g0Var2);
                g0Var2.r(false);
                objN7 = g0Var2.N();
                if (objN7 == cVar3) {
                    objN7 = new w0.l();
                    g0Var2.n0(objN7);
                }
                lVar2 = (w0.l) objN7;
                g1Var = (c3.g1) g0Var2.k(c3.o1.f2732f);
                zG3 = g0Var2.g(w2Var);
                Object objN12 = g0Var2.N();
                if (!zG3 || objN12 == cVar3) {
                    iVar3 = iVar2;
                    g0Var = g0Var2;
                    mVar2 = mVar;
                    w2Var2 = w2Var;
                    c10 = 16384;
                    cVar4 = cVar2;
                    e0Var = new b1.e0(w2Var2, s2Var, cVar4, z10, z15, z14, lVar2, zVar, qVarB, g1Var);
                    qVar2 = qVarB;
                    g1Var2 = g1Var;
                    i17 = i22;
                    z20 = true;
                    s2Var2 = s2Var;
                    lVar3 = lVar2;
                    zVar2 = zVar;
                    g0Var.n0(e0Var);
                } else {
                    w2Var2 = w2Var;
                    i17 = i22;
                    qVar2 = qVarB;
                    lVar3 = lVar2;
                    c10 = 16384;
                    z20 = true;
                    zVar2 = zVar;
                    s2Var2 = s2Var;
                    mVar2 = mVar;
                    g1Var2 = g1Var;
                    cVar4 = cVar2;
                    iVar3 = iVar2;
                    e0Var = objN12;
                    g0Var = g0Var2;
                }
                e0Var2 = (b1.e0) e0Var;
                aVar = (q2.a) g0Var.k(c3.o1.l);
                zG4 = g0Var.g((u2) g0Var.k(c3.o1.f2742r)) | g0Var.g(zVar2);
                objN8 = g0Var.N();
                if (zG4 || objN8 == cVar3) {
                    objN8 = new y();
                    g0Var.n0(objN8);
                }
                yVar = (y) objN8;
                boolean zG5 = g0Var.g(w2Var2);
                w2Var3 = w2Var2;
                if ((i13 & 57344) == c10) {
                    z21 = z20;
                } else {
                    z21 = false;
                }
                boolean zI2 = z21 | zG5 | g0Var.i(e0Var2) | g0Var.i(aVar) | g0Var.i(g1Var2) | g0Var.g(yVar) | g0Var.g(cVar4);
                if ((i13 & 896) == 256) {
                    z22 = z20;
                } else {
                    z22 = false;
                }
                boolean z33 = zI2 | z22;
                if ((i13 & 7168) == 2048) {
                    z23 = z20;
                } else {
                    z23 = false;
                }
                boolean z34 = z33 | z23;
                if ((3670016 & i17) == 1048576) {
                    z24 = z20;
                } else {
                    z24 = false;
                }
                z25 = z34 | z24;
                Object objN13 = g0Var.N();
                if (!z25 || objN13 == cVar3) {
                    boolean z35 = z14;
                    y3.c cVar5 = cVar4;
                    e0Var3 = e0Var2;
                    w2Var4 = w2Var3;
                    sVar = new s(w2Var4, lVar, e0Var3, aVar, g1Var2, yVar, cVar5, z10, z35);
                    z26 = z10;
                    z14 = z35;
                    g0Var.n0(sVar);
                } else {
                    z26 = z10;
                    sVar = objN13;
                    e0Var3 = e0Var2;
                    w2Var4 = w2Var3;
                }
                l1.q.k((u00.a) sVar, g0Var);
                zI = g0Var.i(e0Var3);
                objN9 = g0Var.N();
                if (!zI || objN9 == cVar3) {
                    i18 = 2;
                    objN9 = new b1.s(e0Var3, i18);
                    g0Var.n0(objN9);
                } else {
                    i18 = 2;
                }
                l1.q.e(e0Var3, (u00.k) objN9, g0Var);
                if (z14) {
                    z27 = false;
                } else {
                    i19 = i1Var.f12627c;
                    if (i19 == 7) {
                        z30 = z20;
                    } else {
                        z30 = false;
                    }
                    if (z30) {
                        z27 = false;
                    } else {
                        if (i19 == 8) {
                            z31 = z20;
                        } else {
                            z31 = false;
                        }
                        if (z31) {
                            z27 = false;
                        } else {
                            z27 = z20;
                        }
                    }
                }
                zH = g0Var.h(z27) | g0Var.i(w0Var);
                objN10 = g0Var.N();
                if (zH || objN10 == cVar3) {
                    objN10 = new ea.d(z27, w0Var, z20 ? 1 : 0);
                    g0Var.n0(objN10);
                }
                int i24 = i18;
                boolean z36 = z14;
                final s2 s2Var3 = s2Var2;
                int i25 = i13;
                final w2 w2Var5 = w2Var4;
                final b1.e0 e0Var4 = e0Var3;
                b2.r rVarV = y0.b.a(rVar, z26, z27, (u00.a) objN10).V(new a1.u1(w2Var4, s2Var3, e0Var3, lVar, z26, i1Var, bVar, zA, iVar3, z36, w0Var));
                if (z10 || ((b1.p) e0Var4.f1955r.getValue()) != b1.p.A) {
                    z28 = false;
                } else {
                    z28 = true;
                }
                if (mVar2 == y3.m.B || q1Var2 == d0.q1.A) {
                    z29 = true;
                } else {
                    p1Var = p1Var;
                    q1Var3 = q1Var2;
                    iVar3 = iVar3;
                    z29 = false;
                }
                b2.r rVarB = d0.e2.b(rVarV, p1Var, q1Var3, z28, z29, iVar3);
                final d0.q1 q1Var4 = q1Var3;
                v2.p.f15394a.getClass();
                b2.r rVarA = w0.h.a(v2.r.g(rVarB, v2.r.f15396b), new al.i(e0Var4, zVar2, i24));
                z2.w0 w0VarD = h0.o.d(b2.b.A, true);
                int iHashCode = Long.hashCode(g0Var.T);
                l1.m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarA, g0Var);
                b3.i.f2042c.getClass();
                gVar2 = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC, g0Var, b3.h.f2037d);
                final boolean z37 = z15;
                z12 = z10;
                q.g(e0Var4, z12, v1.d.d(-673241599, new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        l1.j jVar2 = (l1.j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.g0 g0Var3 = (l1.g0) jVar2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            z0.c cVar6 = cVar;
                            if (cVar6 == null) {
                                cVar6 = z.f12719b;
                            }
                            final z0.f fVar2 = fVar;
                            final s2 s2Var4 = s2Var3;
                            final m3.r0 r0Var2 = r0Var;
                            final boolean z38 = z37;
                            final boolean z39 = zBooleanValue2;
                            final w2 w2Var6 = w2Var5;
                            final b1.e0 e0Var5 = e0Var4;
                            final i2.q qVar3 = qVar;
                            final boolean z40 = z10;
                            final z.p1 p1Var2 = p1Var;
                            final d0.q1 q1Var5 = q1Var4;
                            final w0.l lVar4 = lVar3;
                            final e1.q qVar4 = qVar2;
                            final boolean z41 = zA;
                            final i1 i1Var2 = i1Var;
                            cVar6.a(v1.d.d(1969169726, new u00.n() {
                                public final Object invoke(Object obj3, Object obj4) {
                                    l1.j jVar3 = (l1.j) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    l1.g0 g0Var4 = (l1.g0) jVar3;
                                    if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        int i26 = fVar2 instanceof z0.d ? Integer.MAX_VALUE : 1;
                                        s2 s2Var5 = s2Var4;
                                        b2.r rVarL = z2.d0.l(b2.o.A, new a1.w(s2Var5, 15));
                                        q.F(1, i26);
                                        m3.r0 r0Var3 = r0Var2;
                                        if (i26 != Integer.MAX_VALUE) {
                                            rVarL = rVarL.V(new a1(r0Var3, 1, i26));
                                        }
                                        b2.r rVarD = f2.h.d(rVarL.V(new c2(r0Var3)));
                                        boolean z42 = z38;
                                        boolean z43 = z39;
                                        w2 w2Var7 = w2Var6;
                                        b1.e0 e0Var6 = e0Var5;
                                        i2.q qVar5 = qVar3;
                                        boolean z44 = z40;
                                        b2.r rVarV2 = rVarD.V(new a1.l1(z42, z43, s2Var5, w2Var7, e0Var6, qVar5, z44, p1Var2, q1Var5, lVar4, qVar4));
                                        z2.w0 w0VarD2 = h0.o.d(b2.b.A, true);
                                        int iHashCode2 = Long.hashCode(g0Var4.T);
                                        l1.m1 m1VarM2 = g0Var4.m();
                                        b2.r rVarC2 = b2.a.c(rVarV2, jVar3);
                                        b3.i.f2042c.getClass();
                                        b3.g gVar3 = b3.h.f2035b;
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar3);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        l1.q.I(w0VarD2, jVar3, b3.h.f2039f);
                                        l1.q.I(m1VarM2, jVar3, b3.h.f2038e);
                                        l1.q.I(Integer.valueOf(iHashCode2), jVar3, b3.h.f2040g);
                                        l1.q.E(jVar3, b3.h.f2041h);
                                        l1.q.I(rVarC2, jVar3, b3.h.f2037d);
                                        h0.o.a(new p2(s2Var5, w2Var7, r0Var3, z41, i1Var2), jVar3, 0);
                                        if (z44 && z42 && ((Boolean) e0Var6.l.getValue()).booleanValue()) {
                                            g0Var4.c0(-810654004);
                                            c0.f(e0Var6, jVar3, 0);
                                            g0Var4.c0(-810526873);
                                            c0.e(e0Var6, jVar3, 0);
                                            g0Var4.r(false);
                                            g0Var4.r(false);
                                        } else {
                                            g0Var4.c0(-810390690);
                                            g0Var4.r(false);
                                        }
                                        g0Var4.r(true);
                                    } else {
                                        g0Var4.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, jVar2), jVar2, 6);
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, ((i25 >> 3) & 112) | 384);
                g0Var.r(true);
                z13 = z36;
            } else {
                g0Var2.V();
            }
            z14 = z11;
            g0Var2.s();
            cVar2 = (y3.c) g0Var2.k(c3.o1.f2734h);
            mVar = (y3.m) g0Var2.k(c3.o1.f2738n);
            zA = kotlin.jvm.internal.m.a(fVar, z0.e.B);
            cVar3 = l1.i.f9868a;
            if (iVar == null) {
                g0Var2.c0(-2038132442);
                objN11 = g0Var2.N();
                if (objN11 == cVar3) {
                    objN11 = w.c.g(g0Var2);
                }
                f0.i iVar5 = (f0.i) objN11;
                i15 = 0;
                g0Var2.r(false);
                iVar2 = iVar5;
            } else {
                i15 = 0;
                g0Var2.c0(-204294191);
                g0Var2.r(false);
                iVar2 = iVar;
            }
            if (zA) {
                q1Var = d0.q1.B;
            } else {
                q1Var = d0.q1.A;
            }
            q1Var2 = q1Var;
            zBooleanValue = ((Boolean) g4.x(iVar2, g0Var2, i15).getValue()).booleanValue();
            objN = g0Var2.N();
            if (objN == cVar3) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            z0Var = (l1.z0) objN;
            zG = g0Var2.g(iVar2);
            objN2 = g0Var2.N();
            if (zG) {
                objN2 = new a1.h0(iVar2, z0Var, null, 0);
                g0Var2.n0(objN2);
            } else {
                objN2 = new a1.h0(iVar2, z0Var, null, 0);
                g0Var2.n0(objN2);
            }
            l1.q.i(iVar2, g0Var2, (u00.n) objN2);
            final boolean zBooleanValue3 = ((Boolean) z0Var.getValue()).booleanValue();
            if (zBooleanValue) {
                g0Var2.c0(-204276188);
                boolean zB2 = ((c3.f2) ((g3) g0Var2.k(c3.o1.f2745u))).b();
                i16 = 0;
                g0Var2.r(false);
                z15 = zB2;
            } else {
                i16 = 0;
                g0Var2.c0(-2037593295);
                g0Var2.r(false);
                z15 = false;
            }
            objN3 = g0Var2.N();
            if (objN3 == cVar3) {
                objN3 = d40.o.b(i16, 2, c40.a.C);
                g0Var2.n0(objN3);
            }
            w0Var = (d40.w0) objN3;
            if ((i13 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i22 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z38 = z17 | z16;
            if ((i22 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z38 | z18;
            objN4 = g0Var2.N();
            if (z19) {
                if (rVar2 == null) {
                    if (zA) {
                        h1Var = a1.h1.f53a;
                    } else {
                        h1Var = null;
                    }
                    rVar3 = h1Var;
                } else {
                    rVar3 = rVar2;
                }
                objN4 = new w2(gVar, lVar, rVar3);
                g0Var2.n0(objN4);
            } else {
                if (rVar2 == null) {
                    if (zA) {
                        h1Var = a1.h1.f53a;
                    } else {
                        h1Var = null;
                    }
                    rVar3 = h1Var;
                } else {
                    rVar3 = rVar2;
                }
                objN4 = new w2(gVar, lVar, rVar3);
                g0Var2.n0(objN4);
            }
            w2Var = (w2) objN4;
            zG2 = g0Var2.g(w2Var);
            objN5 = g0Var2.N();
            if (zG2) {
                objN5 = new s2();
                g0Var2.n0(objN5);
            } else {
                objN5 = new s2();
                g0Var2.n0(objN5);
            }
            s2Var = (s2) objN5;
            if (lVar != null) {
                lVar.getClass();
            }
            i1Var.getClass();
            objN6 = g0Var2.N();
            if (objN6 == cVar3) {
                objN6 = l1.q.o(g0Var2);
                g0Var2.n0(objN6);
            }
            zVar = (a40.z) objN6;
            g0Var2.c0(-2035821392);
            bVarQ = r0Var.f10522a.f10467k;
            if (bVarQ == null) {
                t3.b bVar3 = t3.b.C;
                bVarQ = t3.c.f14353a.q();
            }
            e1.s sVar3 = e1.s.A;
            qVarB = e1.r.b(bVarQ, g0Var2);
            g0Var2.r(false);
            objN7 = g0Var2.N();
            if (objN7 == cVar3) {
                objN7 = new w0.l();
                g0Var2.n0(objN7);
            }
            lVar2 = (w0.l) objN7;
            g1Var = (c3.g1) g0Var2.k(c3.o1.f2732f);
            zG3 = g0Var2.g(w2Var);
            Object objN14 = g0Var2.N();
            if (zG3) {
                iVar3 = iVar2;
                g0Var = g0Var2;
                mVar2 = mVar;
                w2Var2 = w2Var;
                c10 = 16384;
                cVar4 = cVar2;
                e0Var = new b1.e0(w2Var2, s2Var, cVar4, z10, z15, z14, lVar2, zVar, qVarB, g1Var);
                qVar2 = qVarB;
                g1Var2 = g1Var;
                i17 = i22;
                z20 = true;
                s2Var2 = s2Var;
                lVar3 = lVar2;
                zVar2 = zVar;
                g0Var.n0(e0Var);
            } else {
                iVar3 = iVar2;
                g0Var = g0Var2;
                mVar2 = mVar;
                w2Var2 = w2Var;
                c10 = 16384;
                cVar4 = cVar2;
                e0Var = new b1.e0(w2Var2, s2Var, cVar4, z10, z15, z14, lVar2, zVar, qVarB, g1Var);
                qVar2 = qVarB;
                g1Var2 = g1Var;
                i17 = i22;
                z20 = true;
                s2Var2 = s2Var;
                lVar3 = lVar2;
                zVar2 = zVar;
                g0Var.n0(e0Var);
            }
            e0Var2 = (b1.e0) e0Var;
            aVar = (q2.a) g0Var.k(c3.o1.l);
            zG4 = g0Var.g((u2) g0Var.k(c3.o1.f2742r)) | g0Var.g(zVar2);
            objN8 = g0Var.N();
            if (zG4) {
                objN8 = new y();
                g0Var.n0(objN8);
            } else {
                objN8 = new y();
                g0Var.n0(objN8);
            }
            yVar = (y) objN8;
            boolean zG6 = g0Var.g(w2Var2);
            w2Var3 = w2Var2;
            if ((i13 & 57344) == c10) {
                z21 = z20;
            } else {
                z21 = false;
            }
            boolean zI3 = z21 | zG6 | g0Var.i(e0Var2) | g0Var.i(aVar) | g0Var.i(g1Var2) | g0Var.g(yVar) | g0Var.g(cVar4);
            if ((i13 & 896) == 256) {
                z22 = z20;
            } else {
                z22 = false;
            }
            boolean z39 = zI3 | z22;
            if ((i13 & 7168) == 2048) {
                z23 = z20;
            } else {
                z23 = false;
            }
            boolean z310 = z39 | z23;
            if ((3670016 & i17) == 1048576) {
                z24 = z20;
            } else {
                z24 = false;
            }
            z25 = z310 | z24;
            Object objN15 = g0Var.N();
            if (z25) {
                boolean z311 = z14;
                y3.c cVar6 = cVar4;
                e0Var3 = e0Var2;
                w2Var4 = w2Var3;
                sVar = new s(w2Var4, lVar, e0Var3, aVar, g1Var2, yVar, cVar6, z10, z311);
                z26 = z10;
                z14 = z311;
                g0Var.n0(sVar);
            } else {
                boolean z312 = z14;
                y3.c cVar7 = cVar4;
                e0Var3 = e0Var2;
                w2Var4 = w2Var3;
                sVar = new s(w2Var4, lVar, e0Var3, aVar, g1Var2, yVar, cVar7, z10, z312);
                z26 = z10;
                z14 = z312;
                g0Var.n0(sVar);
            }
            l1.q.k((u00.a) sVar, g0Var);
            zI = g0Var.i(e0Var3);
            objN9 = g0Var.N();
            if (zI) {
                i18 = 2;
                objN9 = new b1.s(e0Var3, i18);
                g0Var.n0(objN9);
            } else {
                i18 = 2;
                objN9 = new b1.s(e0Var3, i18);
                g0Var.n0(objN9);
            }
            l1.q.e(e0Var3, (u00.k) objN9, g0Var);
            if (z14) {
                z27 = false;
            } else {
                i19 = i1Var.f12627c;
                if (i19 == 7) {
                    z30 = z20;
                } else {
                    z30 = false;
                }
                if (z30) {
                    z27 = false;
                } else {
                    if (i19 == 8) {
                        z31 = z20;
                    } else {
                        z31 = false;
                    }
                    if (z31) {
                        z27 = z20;
                    } else {
                        z27 = false;
                    }
                }
            }
            zH = g0Var.h(z27) | g0Var.i(w0Var);
            objN10 = g0Var.N();
            if (zH) {
                objN10 = new ea.d(z27, w0Var, z20 ? 1 : 0);
                g0Var.n0(objN10);
            } else {
                objN10 = new ea.d(z27, w0Var, z20 ? 1 : 0);
                g0Var.n0(objN10);
            }
            int i26 = i18;
            boolean z313 = z14;
            final s2 s2Var4 = s2Var2;
            int i27 = i13;
            final w2 w2Var6 = w2Var4;
            final b1.e0 e0Var5 = e0Var3;
            b2.r rVarV2 = y0.b.a(rVar, z26, z27, (u00.a) objN10).V(new a1.u1(w2Var4, s2Var4, e0Var3, lVar, z26, i1Var, bVar, zA, iVar3, z313, w0Var));
            if (z10) {
                z28 = false;
            } else {
                z28 = false;
            }
            q1Var3 = mVar2 == y3.m.B ? q1Var2 : q1Var2;
            z29 = true;
            b2.r rVarB2 = d0.e2.b(rVarV2, p1Var, q1Var3, z28, z29, iVar3);
            final d0.q1 q1Var5 = q1Var3;
            v2.p.f15394a.getClass();
            b2.r rVarA2 = w0.h.a(v2.r.g(rVarB2, v2.r.f15396b), new al.i(e0Var5, zVar2, i26));
            z2.w0 w0VarD2 = h0.o.d(b2.b.A, true);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarA2, g0Var);
            b3.i.f2042c.getClass();
            gVar2 = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            final boolean z314 = z15;
            z12 = z10;
            q.g(e0Var5, z12, v1.d.d(-673241599, new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    l1.j jVar2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.g0 g0Var3 = (l1.g0) jVar2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z0.c cVar8 = cVar;
                        if (cVar8 == null) {
                            cVar8 = z.f12719b;
                        }
                        final z0.f fVar2 = fVar;
                        final s2 s2Var5 = s2Var4;
                        final m3.r0 r0Var2 = r0Var;
                        final boolean z315 = z314;
                        final boolean z316 = zBooleanValue3;
                        final w2 w2Var7 = w2Var6;
                        final b1.e0 e0Var6 = e0Var5;
                        final i2.q qVar3 = qVar;
                        final boolean z40 = z10;
                        final z.p1 p1Var2 = p1Var;
                        final d0.q1 q1Var6 = q1Var5;
                        final w0.l lVar4 = lVar3;
                        final e1.q qVar4 = qVar2;
                        final boolean z41 = zA;
                        final i1 i1Var2 = i1Var;
                        cVar8.a(v1.d.d(1969169726, new u00.n() {
                            public final Object invoke(Object obj3, Object obj4) {
                                l1.j jVar3 = (l1.j) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                l1.g0 g0Var4 = (l1.g0) jVar3;
                                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    int i28 = fVar2 instanceof z0.d ? Integer.MAX_VALUE : 1;
                                    s2 s2Var6 = s2Var5;
                                    b2.r rVarL = z2.d0.l(b2.o.A, new a1.w(s2Var6, 15));
                                    q.F(1, i28);
                                    m3.r0 r0Var3 = r0Var2;
                                    if (i28 != Integer.MAX_VALUE) {
                                        rVarL = rVarL.V(new a1(r0Var3, 1, i28));
                                    }
                                    b2.r rVarD = f2.h.d(rVarL.V(new c2(r0Var3)));
                                    boolean z42 = z315;
                                    boolean z43 = z316;
                                    w2 w2Var8 = w2Var7;
                                    b1.e0 e0Var7 = e0Var6;
                                    i2.q qVar5 = qVar3;
                                    boolean z44 = z40;
                                    b2.r rVarV3 = rVarD.V(new a1.l1(z42, z43, s2Var6, w2Var8, e0Var7, qVar5, z44, p1Var2, q1Var6, lVar4, qVar4));
                                    z2.w0 w0VarD3 = h0.o.d(b2.b.A, true);
                                    int iHashCode3 = Long.hashCode(g0Var4.T);
                                    l1.m1 m1VarM3 = g0Var4.m();
                                    b2.r rVarC3 = b2.a.c(rVarV3, jVar3);
                                    b3.i.f2042c.getClass();
                                    b3.g gVar3 = b3.h.f2035b;
                                    g0Var4.g0();
                                    if (g0Var4.S) {
                                        g0Var4.l(gVar3);
                                    } else {
                                        g0Var4.q0();
                                    }
                                    l1.q.I(w0VarD3, jVar3, b3.h.f2039f);
                                    l1.q.I(m1VarM3, jVar3, b3.h.f2038e);
                                    l1.q.I(Integer.valueOf(iHashCode3), jVar3, b3.h.f2040g);
                                    l1.q.E(jVar3, b3.h.f2041h);
                                    l1.q.I(rVarC3, jVar3, b3.h.f2037d);
                                    h0.o.a(new p2(s2Var6, w2Var8, r0Var3, z41, i1Var2), jVar3, 0);
                                    if (z44 && z42 && ((Boolean) e0Var7.l.getValue()).booleanValue()) {
                                        g0Var4.c0(-810654004);
                                        c0.f(e0Var7, jVar3, 0);
                                        g0Var4.c0(-810526873);
                                        c0.e(e0Var7, jVar3, 0);
                                        g0Var4.r(false);
                                        g0Var4.r(false);
                                    } else {
                                        g0Var4.c0(-810390690);
                                        g0Var4.r(false);
                                    }
                                    g0Var4.r(true);
                                } else {
                                    g0Var4.V();
                                }
                                return g00.b0.a;
                            }
                        }, jVar2), jVar2, 6);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, ((i27 >> 3) & 112) | 384);
            g0Var.r(true);
            z13 = z313;
        } else {
            z12 = z10;
            g0Var = g0Var2;
            g0Var.V();
            z13 = z11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    c0.c(gVar, rVar, z12, lVar, r0Var, i1Var, bVar, fVar, iVar, qVar, rVar2, cVar, p1Var, z13, (l1.j) obj, iK, iK2, i12);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(final z0.g gVar, final b2.r rVar, boolean z10, final m3.r0 r0Var, final i1 i1Var, final qp.b bVar, final z0.f fVar, f0.i iVar, final i2.q qVar, final z0.c cVar, z.p1 p1Var, l1.j jVar, final int i10, final int i11) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        final f0.i iVar2;
        int i16;
        int i17;
        l1.g0 g0Var;
        final z.p1 p1Var2;
        final boolean z12;
        z.p1 p1VarL;
        f0.i iVar3;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(469439921);
        int i18 = i10 | (g0Var2.g(gVar) ? 4 : 2) | (g0Var2.g(rVar) ? 32 : 16);
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 = i18 | 384;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i18 | (g0Var2.h(z11) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        }
        if ((i11 & 8) != 0) {
            i13 = i12 | 3072;
        } else {
            i13 = i12 | (g0Var2.h(false) ? 2048 : 1024);
        }
        int i20 = 8192;
        if ((i11 & 16) != 0) {
            i14 = i13 | 24576;
        } else {
            i14 = i13 | (g0Var2.g(null) ? 16384 : 8192);
        }
        int i21 = i14 | (g0Var2.g(r0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH);
        if ((i10 & 1572864) == 0) {
            i21 |= g0Var2.g(i1Var) ? 1048576 : 524288;
        }
        int i22 = i21 | (g0Var2.g(bVar) ? 8388608 : 4194304);
        if ((i10 & 100663296) == 0) {
            i22 |= g0Var2.g(fVar) ? 67108864 : 33554432;
        }
        if ((i11 & 512) != 0) {
            i15 = 805306368;
        } else {
            i15 = g0Var2.i(null) ? 536870912 : 268435456;
        }
        int i23 = i22 | i15;
        int i24 = i11 & 1024;
        if (i24 != 0) {
            i16 = 6;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            i16 = g0Var2.g(iVar2) ? 4 : 2;
        }
        int i25 = i16 | (g0Var2.g(qVar) ? 32 : 16);
        if ((i11 & 4096) != 0) {
            i17 = i25 | 384;
        } else {
            i17 = i25 | (g0Var2.g(null) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        }
        int i26 = i17 | (g0Var2.g(cVar) ? 2048 : 1024);
        if ((i11 & 16384) == 0 && g0Var2.g(p1Var)) {
            i20 = 16384;
        }
        int i27 = i26 | i20;
        if (g0Var2.S(i23 & 1, ((i23 & 306783379) == 306783378 && (i27 & 9363) == 9362) ? false : true)) {
            g0Var2.X();
            if ((i10 & 1) == 0 || g0Var2.A()) {
                if (i19 != 0) {
                    z11 = true;
                }
                f0.i iVar4 = i24 != 0 ? null : iVar2;
                if ((i11 & 16384) != 0) {
                    i27 &= -57345;
                    p1VarL = z.n.l(g0Var2);
                } else {
                    p1VarL = p1Var;
                }
                iVar3 = iVar4;
            } else {
                g0Var2.V();
                if ((i11 & 16384) != 0) {
                    i27 &= -57345;
                }
                p1VarL = p1Var;
                iVar3 = iVar2;
            }
            g0Var2.s();
            int i28 = i27 << 3;
            g0Var = g0Var2;
            boolean z13 = z11;
            c(gVar, rVar, z13, null, r0Var, i1Var, bVar, fVar, iVar3, qVar, null, cVar, p1VarL, false, g0Var, i23 & 2147483646, (i27 & 14) | 384 | (i27 & 112) | (i28 & 7168) | (57344 & i28) | (i28 & 458752), Cast.MAX_MESSAGE_LENGTH);
            z12 = z13;
            iVar2 = iVar3;
            p1Var2 = p1VarL;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            p1Var2 = p1Var;
            z12 = z11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    c0.d(gVar, rVar, z12, r0Var, i1Var, bVar, fVar, iVar2, qVar, cVar, p1Var2, (l1.j) obj, iK, i11);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void e(b1.e0 e0Var, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1991581797);
        int i11 = (g0Var.i(e0Var) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            boolean zG = g0Var.g(e0Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = l1.q.r(new b1.j(e0Var, 9));
                g0Var.n0(objN);
            }
            if (((Boolean) ((l1.p2) objN).getValue()).booleanValue()) {
                g0Var.c0(535437134);
                boolean zI = g0Var.i(e0Var);
                Object objN2 = g0Var.N();
                if (zI || objN2 == cVar) {
                    objN2 = new a0(e0Var, 0);
                    g0Var.n0(objN2);
                }
                e1.n nVar = (e1.n) objN2;
                boolean zI2 = g0Var.i(e0Var);
                Object objN3 = g0Var.N();
                if (zI2 || objN3 == cVar) {
                    objN3 = new b0(e0Var, 0);
                    g0Var.n0(objN3);
                }
                c.a(nVar, v2.f0.b(b2.o.A, e0Var, (PointerInputEventHandler) objN3), f12577a, g0Var, 384, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(535820573);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new w(e0Var, i10, 1);
        }
    }

    public static final void f(b1.e0 e0Var, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2025287684);
        int i11 = (g0Var.i(e0Var) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            boolean zG = g0Var.g(e0Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = l1.q.r(new b1.j(e0Var, 7));
                g0Var.n0(objN);
            }
            b1.c cVar2 = (b1.c) ((l1.p2) objN).getValue();
            boolean z10 = cVar2.f1934a;
            b2.o oVar = b2.o.A;
            if (z10) {
                g0Var.c0(-354609545);
                boolean zI = g0Var.i(e0Var);
                Object objN2 = g0Var.N();
                if (zI || objN2 == cVar) {
                    objN2 = new a0(e0Var, 1);
                    g0Var.n0(objN2);
                }
                e1.n nVar = (e1.n) objN2;
                x3.j jVar2 = cVar2.f1937d;
                boolean z11 = cVar2.f1938e;
                boolean zI2 = g0Var.i(e0Var);
                Object objN3 = g0Var.N();
                if (zI2 || objN3 == cVar) {
                    objN3 = new b0(e0Var, 1);
                    g0Var.n0(objN3);
                }
                a.a.d(nVar, true, jVar2, z11, f12577a, cVar2.f1936c, v2.f0.b(oVar, e0Var, (PointerInputEventHandler) objN3), g0Var, 24624, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-353981826);
                g0Var.r(false);
            }
            boolean zG2 = g0Var.g(e0Var);
            Object objN4 = g0Var.N();
            if (zG2 || objN4 == cVar) {
                objN4 = l1.q.r(new b1.j(e0Var, 8));
                g0Var.n0(objN4);
            }
            b1.c cVar3 = (b1.c) ((l1.p2) objN4).getValue();
            if (cVar3.f1934a) {
                g0Var.c0(-353488678);
                boolean zI3 = g0Var.i(e0Var);
                Object objN5 = g0Var.N();
                if (zI3 || objN5 == cVar) {
                    objN5 = new a0(e0Var, 2);
                    g0Var.n0(objN5);
                }
                e1.n nVar2 = (e1.n) objN5;
                x3.j jVar3 = cVar3.f1937d;
                boolean z12 = cVar3.f1938e;
                boolean zI4 = g0Var.i(e0Var);
                Object objN6 = g0Var.N();
                if (zI4 || objN6 == cVar) {
                    objN6 = new b0(e0Var, 2);
                    g0Var.n0(objN6);
                }
                a.a.d(nVar2, false, jVar3, z12, f12577a, cVar3.f1936c, v2.f0.b(oVar, e0Var, (PointerInputEventHandler) objN6), g0Var, 24624, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-352863842);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new w(e0Var, i10, 0);
        }
    }
}
