package w;

import com.google.android.gms.cast.Cast;
import java.util.ListIterator;

public abstract class m {

    public static final long f15790a;

    static {
        long j9 = Integer.MIN_VALUE;
        f15790a = (j9 & 4294967295L) | (j9 << 32);
    }

    public static final void a(Object obj, b2.r rVar, u00.k kVar, b2.d dVar, String str, u00.k kVar2, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        int i13;
        u00.k kVar3;
        int i14;
        int i15;
        b2.d dVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        b2.r rVar2;
        u00.k kVar4;
        u00.k kVar5;
        b2.d dVar3;
        String str2;
        l1.r1 r1VarT;
        b2.r rVar3;
        l1.c cVar2;
        int i21;
        u00.k kVar6;
        b2.d dVar4;
        u00.k kVar7;
        Object objN;
        Object objN2;
        int i22;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1501828832);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? g0Var.g(obj) : g0Var.i(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= g0Var.g(rVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    kVar3 = kVar;
                    if (g0Var.i(kVar3)) {
                        i14 = 256;
                    } else {
                        i14 = Cast.MAX_NAMESPACE_LENGTH;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        dVar2 = dVar;
                        if (g0Var.g(dVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (g0Var.g(str)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            if ((196608 & i10) == 0) {
                                if (g0Var.i(kVar2)) {
                                    i20 = 131072;
                                } else {
                                    i20 = Cast.MAX_MESSAGE_LENGTH;
                                }
                                i12 |= i20;
                            }
                            if ((1572864 & i10) == 0) {
                                if (g0Var.i(cVar)) {
                                    i22 = 1048576;
                                } else {
                                    i22 = 524288;
                                }
                                i12 |= i22;
                            }
                            if ((599187 & i12) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (g0Var.S(i12 & 1, z10)) {
                                if (i23 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                cVar2 = l1.i.f9868a;
                                if (i13 != 0) {
                                    objN2 = g0Var.N();
                                    if (objN2 == cVar2) {
                                        objN2 = f.B;
                                        g0Var.n0(objN2);
                                    }
                                    kVar6 = (u00.k) objN2;
                                    i21 = i19;
                                } else {
                                    i21 = i19;
                                    kVar6 = kVar3;
                                }
                                if (i15 != 0) {
                                    dVar4 = b2.b.A;
                                } else {
                                    dVar4 = dVar2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedContent";
                                } else {
                                    str2 = str;
                                }
                                if (i21 != 0) {
                                    objN = g0Var.N();
                                    if (objN == cVar2) {
                                        objN = f.C;
                                        g0Var.n0(objN);
                                    }
                                    kVar7 = (u00.k) objN;
                                } else {
                                    kVar7 = kVar2;
                                }
                                x.n1 n1VarY = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                                int i24 = i12 & 8176;
                                int i25 = i12 >> 3;
                                b(n1VarY, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i24 | (57344 & i25) | (i25 & 458752));
                                rVar2 = rVar3;
                                kVar5 = kVar6;
                                dVar3 = dVar4;
                                kVar4 = kVar7;
                            } else {
                                g0Var.V();
                                rVar2 = rVar;
                                kVar4 = kVar2;
                                kVar5 = kVar3;
                                dVar3 = dVar2;
                                str2 = str;
                            }
                            r1VarT = g0Var.t();
                            if (r1VarT != null) {
                                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                            }
                        }
                        i12 |= 196608;
                        if ((1572864 & i10) == 0) {
                            if (g0Var.i(cVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((599187 & i12) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i12 & 1, z10)) {
                            if (i23 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            cVar2 = l1.i.f9868a;
                            if (i13 != 0) {
                                objN2 = g0Var.N();
                                if (objN2 == cVar2) {
                                    objN2 = f.B;
                                    g0Var.n0(objN2);
                                }
                                kVar6 = (u00.k) objN2;
                                i21 = i19;
                            } else {
                                i21 = i19;
                                kVar6 = kVar3;
                            }
                            if (i15 != 0) {
                                dVar4 = b2.b.A;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i21 != 0) {
                                objN = g0Var.N();
                                if (objN == cVar2) {
                                    objN = f.C;
                                    g0Var.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                            } else {
                                kVar7 = kVar2;
                            }
                            x.n1 n1VarY2 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                            int i26 = i12 & 8176;
                            int i27 = i12 >> 3;
                            b(n1VarY2, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i26 | (57344 & i27) | (i27 & 458752));
                            rVar2 = rVar3;
                            kVar5 = kVar6;
                            dVar3 = dVar4;
                            kVar4 = kVar7;
                        } else {
                            g0Var.V();
                            rVar2 = rVar;
                            kVar4 = kVar2;
                            kVar5 = kVar3;
                            dVar3 = dVar2;
                            str2 = str;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                        }
                    }
                    i12 |= 24576;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            if (g0Var.i(kVar2)) {
                                i20 = 131072;
                            } else {
                                i20 = Cast.MAX_MESSAGE_LENGTH;
                            }
                            i12 |= i20;
                        }
                        if ((1572864 & i10) == 0) {
                            if (g0Var.i(cVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((599187 & i12) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i12 & 1, z10)) {
                            if (i23 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            cVar2 = l1.i.f9868a;
                            if (i13 != 0) {
                                objN2 = g0Var.N();
                                if (objN2 == cVar2) {
                                    objN2 = f.B;
                                    g0Var.n0(objN2);
                                }
                                kVar6 = (u00.k) objN2;
                                i21 = i19;
                            } else {
                                i21 = i19;
                                kVar6 = kVar3;
                            }
                            if (i15 != 0) {
                                dVar4 = b2.b.A;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i21 != 0) {
                                objN = g0Var.N();
                                if (objN == cVar2) {
                                    objN = f.C;
                                    g0Var.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                            } else {
                                kVar7 = kVar2;
                            }
                            x.n1 n1VarY3 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                            int i28 = i12 & 8176;
                            int i29 = i12 >> 3;
                            b(n1VarY3, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i28 | (57344 & i29) | (i29 & 458752));
                            rVar2 = rVar3;
                            kVar5 = kVar6;
                            dVar3 = dVar4;
                            kVar4 = kVar7;
                        } else {
                            g0Var.V();
                            rVar2 = rVar;
                            kVar4 = kVar2;
                            kVar5 = kVar3;
                            dVar3 = dVar2;
                            str2 = str;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                        }
                    }
                    i12 |= 196608;
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY4 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i210 = i12 & 8176;
                        int i211 = i12 >> 3;
                        b(n1VarY4, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i210 | (57344 & i211) | (i211 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 3072;
                dVar2 = dVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (g0Var.g(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            if (g0Var.i(kVar2)) {
                                i20 = 131072;
                            } else {
                                i20 = Cast.MAX_MESSAGE_LENGTH;
                            }
                            i12 |= i20;
                        }
                        if ((1572864 & i10) == 0) {
                            if (g0Var.i(cVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((599187 & i12) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i12 & 1, z10)) {
                            if (i23 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            cVar2 = l1.i.f9868a;
                            if (i13 != 0) {
                                objN2 = g0Var.N();
                                if (objN2 == cVar2) {
                                    objN2 = f.B;
                                    g0Var.n0(objN2);
                                }
                                kVar6 = (u00.k) objN2;
                                i21 = i19;
                            } else {
                                i21 = i19;
                                kVar6 = kVar3;
                            }
                            if (i15 != 0) {
                                dVar4 = b2.b.A;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i21 != 0) {
                                objN = g0Var.N();
                                if (objN == cVar2) {
                                    objN = f.C;
                                    g0Var.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                            } else {
                                kVar7 = kVar2;
                            }
                            x.n1 n1VarY5 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                            int i212 = i12 & 8176;
                            int i213 = i12 >> 3;
                            b(n1VarY5, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i212 | (57344 & i213) | (i213 & 458752));
                            rVar2 = rVar3;
                            kVar5 = kVar6;
                            dVar3 = dVar4;
                            kVar4 = kVar7;
                        } else {
                            g0Var.V();
                            rVar2 = rVar;
                            kVar4 = kVar2;
                            kVar5 = kVar3;
                            dVar3 = dVar2;
                            str2 = str;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                        }
                    }
                    i12 |= 196608;
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY6 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i214 = i12 & 8176;
                        int i215 = i12 >> 3;
                        b(n1VarY6, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i214 | (57344 & i215) | (i215 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY7 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i216 = i12 & 8176;
                        int i217 = i12 >> 3;
                        b(n1VarY7, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i216 | (57344 & i217) | (i217 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY8 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i218 = i12 & 8176;
                    int i219 = i12 >> 3;
                    b(n1VarY8, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i218 | (57344 & i219) | (i219 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 384;
            kVar3 = kVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    dVar2 = dVar;
                    if (g0Var.g(dVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (g0Var.g(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            if (g0Var.i(kVar2)) {
                                i20 = 131072;
                            } else {
                                i20 = Cast.MAX_MESSAGE_LENGTH;
                            }
                            i12 |= i20;
                        }
                        if ((1572864 & i10) == 0) {
                            if (g0Var.i(cVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((599187 & i12) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i12 & 1, z10)) {
                            if (i23 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            cVar2 = l1.i.f9868a;
                            if (i13 != 0) {
                                objN2 = g0Var.N();
                                if (objN2 == cVar2) {
                                    objN2 = f.B;
                                    g0Var.n0(objN2);
                                }
                                kVar6 = (u00.k) objN2;
                                i21 = i19;
                            } else {
                                i21 = i19;
                                kVar6 = kVar3;
                            }
                            if (i15 != 0) {
                                dVar4 = b2.b.A;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i21 != 0) {
                                objN = g0Var.N();
                                if (objN == cVar2) {
                                    objN = f.C;
                                    g0Var.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                            } else {
                                kVar7 = kVar2;
                            }
                            x.n1 n1VarY9 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                            int i2110 = i12 & 8176;
                            int i2111 = i12 >> 3;
                            b(n1VarY9, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2110 | (57344 & i2111) | (i2111 & 458752));
                            rVar2 = rVar3;
                            kVar5 = kVar6;
                            dVar3 = dVar4;
                            kVar4 = kVar7;
                        } else {
                            g0Var.V();
                            rVar2 = rVar;
                            kVar4 = kVar2;
                            kVar5 = kVar3;
                            dVar3 = dVar2;
                            str2 = str;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                        }
                    }
                    i12 |= 196608;
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY10 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i2112 = i12 & 8176;
                        int i2113 = i12 >> 3;
                        b(n1VarY10, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2112 | (57344 & i2113) | (i2113 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY11 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i2114 = i12 & 8176;
                        int i2115 = i12 >> 3;
                        b(n1VarY11, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2114 | (57344 & i2115) | (i2115 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY12 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i2116 = i12 & 8176;
                    int i2117 = i12 >> 3;
                    b(n1VarY12, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2116 | (57344 & i2117) | (i2117 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 3072;
            dVar2 = dVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (g0Var.g(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY13 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i2118 = i12 & 8176;
                        int i2119 = i12 >> 3;
                        b(n1VarY13, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2118 | (57344 & i2119) | (i2119 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY14 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i21110 = i12 & 8176;
                    int i21111 = i12 >> 3;
                    b(n1VarY14, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21110 | (57344 & i21111) | (i21111 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    if (g0Var.i(kVar2)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i12 |= i20;
                }
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY15 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i21112 = i12 & 8176;
                    int i21113 = i12 >> 3;
                    b(n1VarY15, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21112 | (57344 & i21113) | (i21113 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i23 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                cVar2 = l1.i.f9868a;
                if (i13 != 0) {
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = f.B;
                        g0Var.n0(objN2);
                    }
                    kVar6 = (u00.k) objN2;
                    i21 = i19;
                } else {
                    i21 = i19;
                    kVar6 = kVar3;
                }
                if (i15 != 0) {
                    dVar4 = b2.b.A;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i21 != 0) {
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = f.C;
                        g0Var.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                } else {
                    kVar7 = kVar2;
                }
                x.n1 n1VarY16 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                int i21114 = i12 & 8176;
                int i21115 = i12 >> 3;
                b(n1VarY16, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21114 | (57344 & i21115) | (i21115 & 458752));
                rVar2 = rVar3;
                kVar5 = kVar6;
                dVar3 = dVar4;
                kVar4 = kVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                kVar4 = kVar2;
                kVar5 = kVar3;
                dVar3 = dVar2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                kVar3 = kVar;
                if (g0Var.i(kVar3)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    dVar2 = dVar;
                    if (g0Var.g(dVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (g0Var.g(str)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((196608 & i10) == 0) {
                            if (g0Var.i(kVar2)) {
                                i20 = 131072;
                            } else {
                                i20 = Cast.MAX_MESSAGE_LENGTH;
                            }
                            i12 |= i20;
                        }
                        if ((1572864 & i10) == 0) {
                            if (g0Var.i(cVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((599187 & i12) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i12 & 1, z10)) {
                            if (i23 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            cVar2 = l1.i.f9868a;
                            if (i13 != 0) {
                                objN2 = g0Var.N();
                                if (objN2 == cVar2) {
                                    objN2 = f.B;
                                    g0Var.n0(objN2);
                                }
                                kVar6 = (u00.k) objN2;
                                i21 = i19;
                            } else {
                                i21 = i19;
                                kVar6 = kVar3;
                            }
                            if (i15 != 0) {
                                dVar4 = b2.b.A;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i21 != 0) {
                                objN = g0Var.N();
                                if (objN == cVar2) {
                                    objN = f.C;
                                    g0Var.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                            } else {
                                kVar7 = kVar2;
                            }
                            x.n1 n1VarY17 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                            int i21116 = i12 & 8176;
                            int i21117 = i12 >> 3;
                            b(n1VarY17, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21116 | (57344 & i21117) | (i21117 & 458752));
                            rVar2 = rVar3;
                            kVar5 = kVar6;
                            dVar3 = dVar4;
                            kVar4 = kVar7;
                        } else {
                            g0Var.V();
                            rVar2 = rVar;
                            kVar4 = kVar2;
                            kVar5 = kVar3;
                            dVar3 = dVar2;
                            str2 = str;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                        }
                    }
                    i12 |= 196608;
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY18 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i21118 = i12 & 8176;
                        int i21119 = i12 >> 3;
                        b(n1VarY18, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21118 | (57344 & i21119) | (i21119 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 24576;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY19 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i211110 = i12 & 8176;
                        int i211111 = i12 >> 3;
                        b(n1VarY19, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i211110 | (57344 & i211111) | (i211111 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY110 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i211112 = i12 & 8176;
                    int i211113 = i12 >> 3;
                    b(n1VarY110, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i211112 | (57344 & i211113) | (i211113 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 3072;
            dVar2 = dVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (g0Var.g(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY111 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i211114 = i12 & 8176;
                        int i211115 = i12 >> 3;
                        b(n1VarY111, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i211114 | (57344 & i211115) | (i211115 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY112 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i211116 = i12 & 8176;
                    int i211117 = i12 >> 3;
                    b(n1VarY112, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i211116 | (57344 & i211117) | (i211117 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    if (g0Var.i(kVar2)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i12 |= i20;
                }
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY113 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i211118 = i12 & 8176;
                    int i211119 = i12 >> 3;
                    b(n1VarY113, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i211118 | (57344 & i211119) | (i211119 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i23 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                cVar2 = l1.i.f9868a;
                if (i13 != 0) {
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = f.B;
                        g0Var.n0(objN2);
                    }
                    kVar6 = (u00.k) objN2;
                    i21 = i19;
                } else {
                    i21 = i19;
                    kVar6 = kVar3;
                }
                if (i15 != 0) {
                    dVar4 = b2.b.A;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i21 != 0) {
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = f.C;
                        g0Var.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                } else {
                    kVar7 = kVar2;
                }
                x.n1 n1VarY114 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                int i2111110 = i12 & 8176;
                int i2111111 = i12 >> 3;
                b(n1VarY114, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2111110 | (57344 & i2111111) | (i2111111 & 458752));
                rVar2 = rVar3;
                kVar5 = kVar6;
                dVar3 = dVar4;
                kVar4 = kVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                kVar4 = kVar2;
                kVar5 = kVar3;
                dVar3 = dVar2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
            }
        }
        i12 |= 384;
        kVar3 = kVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                dVar2 = dVar;
                if (g0Var.g(dVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (g0Var.g(str)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(kVar2)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i12 |= i20;
                    }
                    if ((1572864 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((599187 & i12) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i12 & 1, z10)) {
                        if (i23 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        cVar2 = l1.i.f9868a;
                        if (i13 != 0) {
                            objN2 = g0Var.N();
                            if (objN2 == cVar2) {
                                objN2 = f.B;
                                g0Var.n0(objN2);
                            }
                            kVar6 = (u00.k) objN2;
                            i21 = i19;
                        } else {
                            i21 = i19;
                            kVar6 = kVar3;
                        }
                        if (i15 != 0) {
                            dVar4 = b2.b.A;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i21 != 0) {
                            objN = g0Var.N();
                            if (objN == cVar2) {
                                objN = f.C;
                                g0Var.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                        } else {
                            kVar7 = kVar2;
                        }
                        x.n1 n1VarY115 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                        int i2111112 = i12 & 8176;
                        int i2111113 = i12 >> 3;
                        b(n1VarY115, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2111112 | (57344 & i2111113) | (i2111113 & 458752));
                        rVar2 = rVar3;
                        kVar5 = kVar6;
                        dVar3 = dVar4;
                        kVar4 = kVar7;
                    } else {
                        g0Var.V();
                        rVar2 = rVar;
                        kVar4 = kVar2;
                        kVar5 = kVar3;
                        dVar3 = dVar2;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY116 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i2111114 = i12 & 8176;
                    int i2111115 = i12 >> 3;
                    b(n1VarY116, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2111114 | (57344 & i2111115) | (i2111115 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 24576;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    if (g0Var.i(kVar2)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i12 |= i20;
                }
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY117 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i2111116 = i12 & 8176;
                    int i2111117 = i12 >> 3;
                    b(n1VarY117, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2111116 | (57344 & i2111117) | (i2111117 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i23 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                cVar2 = l1.i.f9868a;
                if (i13 != 0) {
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = f.B;
                        g0Var.n0(objN2);
                    }
                    kVar6 = (u00.k) objN2;
                    i21 = i19;
                } else {
                    i21 = i19;
                    kVar6 = kVar3;
                }
                if (i15 != 0) {
                    dVar4 = b2.b.A;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i21 != 0) {
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = f.C;
                        g0Var.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                } else {
                    kVar7 = kVar2;
                }
                x.n1 n1VarY118 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                int i2111118 = i12 & 8176;
                int i2111119 = i12 >> 3;
                b(n1VarY118, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i2111118 | (57344 & i2111119) | (i2111119 & 458752));
                rVar2 = rVar3;
                kVar5 = kVar6;
                dVar3 = dVar4;
                kVar4 = kVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                kVar4 = kVar2;
                kVar5 = kVar3;
                dVar3 = dVar2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
            }
        }
        i12 |= 3072;
        dVar2 = dVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (g0Var.g(str)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((196608 & i10) == 0) {
                    if (g0Var.i(kVar2)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i12 |= i20;
                }
                if ((1572864 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i12 & 1, z10)) {
                    if (i23 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    cVar2 = l1.i.f9868a;
                    if (i13 != 0) {
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = f.B;
                            g0Var.n0(objN2);
                        }
                        kVar6 = (u00.k) objN2;
                        i21 = i19;
                    } else {
                        i21 = i19;
                        kVar6 = kVar3;
                    }
                    if (i15 != 0) {
                        dVar4 = b2.b.A;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i21 != 0) {
                        objN = g0Var.N();
                        if (objN == cVar2) {
                            objN = f.C;
                            g0Var.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                    } else {
                        kVar7 = kVar2;
                    }
                    x.n1 n1VarY119 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                    int i21111110 = i12 & 8176;
                    int i21111111 = i12 >> 3;
                    b(n1VarY119, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21111110 | (57344 & i21111111) | (i21111111 & 458752));
                    rVar2 = rVar3;
                    kVar5 = kVar6;
                    dVar3 = dVar4;
                    kVar4 = kVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    kVar4 = kVar2;
                    kVar5 = kVar3;
                    dVar3 = dVar2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i23 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                cVar2 = l1.i.f9868a;
                if (i13 != 0) {
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = f.B;
                        g0Var.n0(objN2);
                    }
                    kVar6 = (u00.k) objN2;
                    i21 = i19;
                } else {
                    i21 = i19;
                    kVar6 = kVar3;
                }
                if (i15 != 0) {
                    dVar4 = b2.b.A;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i21 != 0) {
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = f.C;
                        g0Var.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                } else {
                    kVar7 = kVar2;
                }
                x.n1 n1VarY1110 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                int i21111112 = i12 & 8176;
                int i21111113 = i12 >> 3;
                b(n1VarY1110, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21111112 | (57344 & i21111113) | (i21111113 & 458752));
                rVar2 = rVar3;
                kVar5 = kVar6;
                dVar3 = dVar4;
                kVar4 = kVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                kVar4 = kVar2;
                kVar5 = kVar3;
                dVar3 = dVar2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
            }
        }
        i12 |= 24576;
        i19 = i11 & 32;
        if (i19 != 0) {
            if ((196608 & i10) == 0) {
                if (g0Var.i(kVar2)) {
                    i20 = 131072;
                } else {
                    i20 = Cast.MAX_MESSAGE_LENGTH;
                }
                i12 |= i20;
            }
            if ((1572864 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i23 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                cVar2 = l1.i.f9868a;
                if (i13 != 0) {
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = f.B;
                        g0Var.n0(objN2);
                    }
                    kVar6 = (u00.k) objN2;
                    i21 = i19;
                } else {
                    i21 = i19;
                    kVar6 = kVar3;
                }
                if (i15 != 0) {
                    dVar4 = b2.b.A;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i21 != 0) {
                    objN = g0Var.N();
                    if (objN == cVar2) {
                        objN = f.C;
                        g0Var.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                } else {
                    kVar7 = kVar2;
                }
                x.n1 n1VarY1111 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
                int i21111114 = i12 & 8176;
                int i21111115 = i12 >> 3;
                b(n1VarY1111, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21111114 | (57344 & i21111115) | (i21111115 & 458752));
                rVar2 = rVar3;
                kVar5 = kVar6;
                dVar3 = dVar4;
                kVar4 = kVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                kVar4 = kVar2;
                kVar5 = kVar3;
                dVar3 = dVar2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
            }
        }
        i12 |= 196608;
        if ((1572864 & i10) == 0) {
            if (g0Var.i(cVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((599187 & i12) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i12 & 1, z10)) {
            if (i23 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar;
            }
            cVar2 = l1.i.f9868a;
            if (i13 != 0) {
                objN2 = g0Var.N();
                if (objN2 == cVar2) {
                    objN2 = f.B;
                    g0Var.n0(objN2);
                }
                kVar6 = (u00.k) objN2;
                i21 = i19;
            } else {
                i21 = i19;
                kVar6 = kVar3;
            }
            if (i15 != 0) {
                dVar4 = b2.b.A;
            } else {
                dVar4 = dVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedContent";
            } else {
                str2 = str;
            }
            if (i21 != 0) {
                objN = g0Var.N();
                if (objN == cVar2) {
                    objN = f.C;
                    g0Var.n0(objN);
                }
                kVar7 = (u00.k) objN;
            } else {
                kVar7 = kVar2;
            }
            x.n1 n1VarY1112 = x.c.y(obj, str2, g0Var, (i12 & 14) | ((i12 >> 9) & 112), 0);
            int i21111116 = i12 & 8176;
            int i21111117 = i12 >> 3;
            b(n1VarY1112, rVar3, kVar6, dVar4, kVar7, cVar, g0Var, i21111116 | (57344 & i21111117) | (i21111117 & 458752));
            rVar2 = rVar3;
            kVar5 = kVar6;
            dVar3 = dVar4;
            kVar4 = kVar7;
        } else {
            g0Var.V();
            rVar2 = rVar;
            kVar4 = kVar2;
            kVar5 = kVar3;
            dVar3 = dVar2;
            str2 = str;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new mb.z(obj, rVar2, kVar5, dVar3, str2, kVar4, cVar, i10, i11);
        }
    }

    public static final void b(x.n1 n1Var, b2.r rVar, u00.k kVar, b2.d dVar, u00.k kVar2, v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var;
        f5.c cVar2;
        u00.k kVar3;
        v vVar;
        z1.p pVar;
        v vVar2;
        x.j1 j1VarN;
        boolean z10;
        u00.k kVar4 = kVar;
        f5.c cVar3 = n1Var.f16323a;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(511725103);
        int i11 = (i10 & 6) == 0 ? (g0Var2.g(n1Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= g0Var2.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var2.i(kVar4) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var2.g(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var2.i(kVar2) ? 16384 : 8192;
        }
        v1.c cVar4 = cVar;
        if ((196608 & i10) == 0) {
            i11 |= g0Var2.i(cVar4) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if (g0Var2.S(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objN = g0Var2.N();
            l1.c cVar5 = l1.i.f9868a;
            if (z11 || objN == cVar5) {
                objN = new v(n1Var, dVar);
                g0Var2.n0(objN);
            }
            v vVar3 = (v) objN;
            boolean z12 = i12 == 4;
            Object objN2 = g0Var2.N();
            if (z12 || objN2 == cVar5) {
                objN2 = l1.q.y(cVar3.J0());
                g0Var2.n0(objN2);
            }
            z1.p pVar2 = (z1.p) objN2;
            boolean z13 = i12 == 4;
            Object objN3 = g0Var2.N();
            if (z13 || objN3 == cVar5) {
                long[] jArr = u.q0.f14885a;
                objN3 = new u.i0();
                g0Var2.n0(objN3);
            }
            u.i0 i0Var = (u.i0) objN3;
            l1.i1 i1Var = n1Var.f16326d;
            if (!pVar2.contains(cVar3.J0())) {
                pVar2.clear();
                pVar2.add(cVar3.J0());
            }
            if (kotlin.jvm.internal.m.a(cVar3.J0(), i1Var.getValue())) {
                if (pVar2.size() != 1 || !kotlin.jvm.internal.m.a(pVar2.get(0), cVar3.J0())) {
                    pVar2.clear();
                    pVar2.add(cVar3.J0());
                }
                if (i0Var.f14860e != 1 || i0Var.c(cVar3.J0())) {
                    i0Var.a();
                }
                vVar3.f15813b = dVar;
            }
            if (kotlin.jvm.internal.m.a(cVar3.J0(), i1Var.getValue()) || pVar2.contains(i1Var.getValue())) {
                cVar2 = cVar3;
            } else {
                ListIterator listIterator = pVar2.listIterator();
                int i13 = 0;
                while (true) {
                    b3.q qVar = (b3.q) listIterator;
                    cVar2 = cVar3;
                    if (!qVar.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.m.a(kVar2.invoke(qVar.next()), kVar2.invoke(i1Var.getValue()))) {
                            break;
                        }
                        i13++;
                        cVar3 = cVar2;
                    }
                }
                if (i13 == -1) {
                    pVar2.add(i1Var.getValue());
                } else {
                    pVar2.set(i13, i1Var.getValue());
                }
            }
            if (i0Var.c(i1Var.getValue()) && i0Var.c(cVar2.J0())) {
                g0Var2.c0(1968995539);
                g0Var2.r(false);
                kVar3 = kVar4;
                vVar = vVar3;
            } else {
                g0Var2.c0(1966410449);
                i0Var.a();
                int size = pVar2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj = pVar2.get(i14);
                    v vVar4 = vVar3;
                    i0Var.m(obj, v1.d.d(-23915175, new j(n1Var, obj, kVar4, vVar4, pVar2, cVar4), g0Var2));
                    cVar4 = cVar;
                    kVar4 = kVar4;
                    vVar3 = vVar4;
                }
                kVar3 = kVar4;
                vVar = vVar3;
                g0Var2.r(false);
            }
            boolean zG = g0Var2.g(n1Var.f()) | g0Var2.g(vVar);
            Object objN4 = g0Var2.N();
            if (zG || objN4 == cVar5) {
                objN4 = (j0) kVar3.invoke(vVar);
                g0Var2.n0(objN4);
            }
            j0 j0Var = (j0) objN4;
            x.n1 n1Var2 = vVar.f15812a;
            boolean zG2 = g0Var2.g(vVar);
            Object objN5 = g0Var2.N();
            if (zG2 || objN5 == cVar5) {
                objN5 = l1.q.z(Boolean.FALSE);
                g0Var2.n0(objN5);
            }
            l1.z0 z0Var = (l1.z0) objN5;
            l1.z0 z0VarG = l1.q.G(j0Var.f15779d, g0Var2);
            if (kotlin.jvm.internal.m.a(n1Var2.f16323a.J0(), n1Var2.f16326d.getValue())) {
                z0Var.setValue(Boolean.FALSE);
            } else if (z0VarG.getValue() != null) {
                z0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
            b2.r rVarD = b2.o.A;
            if (zBooleanValue) {
                g0Var2.c0(1353077497);
                v vVar5 = vVar;
                pVar = pVar2;
                vVar2 = vVar5;
                g0Var = g0Var2;
                j1VarN = x.c.n(vVar5.f15812a, x.c.f16263r, null, g0Var, 0, 2);
                boolean zG3 = g0Var.g(j1VarN);
                Object objN6 = g0Var.N();
                if (zG3 || objN6 == cVar5) {
                    c2 c2Var = (c2) z0VarG.getValue();
                    if (c2Var == null || c2Var.f15744a) {
                        rVarD = f2.h.d(rVarD);
                    }
                    g0Var.n0(rVarD);
                    objN6 = rVarD;
                }
                rVarD = (b2.r) objN6;
                g0Var.r(false);
            } else {
                pVar = pVar2;
                g0Var = g0Var2;
                vVar2 = vVar;
                g0Var.c0(1353343539);
                g0Var.r(false);
                j1VarN = null;
            }
            b2.r rVarV = rVar.V(rVarD.V(new r(j1VarN, z0VarG, vVar2)));
            Object objN7 = g0Var.N();
            if (objN7 == cVar5) {
                objN7 = new o(vVar2);
                g0Var.n0(objN7);
            }
            o oVar = (o) objN7;
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(oVar, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.v(g0Var, Integer.valueOf(iHashCode), b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            g0Var.c0(-860173498);
            int size2 = pVar.size();
            int i15 = 0;
            while (i15 < size2) {
                z1.p pVar3 = pVar;
                Object obj2 = pVar3.get(i15);
                g0Var.Z(-2026002954, kVar2.invoke(obj2));
                u00.n nVar = (u00.n) i0Var.g(obj2);
                if (nVar == null) {
                    g0Var.c0(1618454323);
                    z10 = false;
                } else {
                    z10 = false;
                    g0Var.c0(-2026001778);
                    nVar.invoke(g0Var, 0);
                }
                g0Var.r(z10);
                g0Var.r(z10);
                i15++;
                pVar = pVar3;
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k(n1Var, rVar, kVar, dVar, kVar2, cVar, i10);
        }
    }

    public static c2 c(int i10) {
        return new c2((i10 & 1) != 0, l.B);
    }

    public static final j0 d(x0 x0Var, y0 y0Var) {
        return new j0(x0Var, y0Var, (c2) null, 12);
    }
}
