package qd;

import a1.f2;
import a1.o1;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.f1;
import bt.a2;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute;
import d0.q1;
import d10.e2;
import d10.j1;
import e30.a1;
import g1.c8;
import g1.m6;
import g1.o3;
import g1.t4;
import g1.v5;
import g1.z6;
import gz.b1;
import gz.e1;
import gz.g1;
import gz.x0;
import gz.y0;
import h0.m2;
import h0.n1;
import h0.z1;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import ri.t1;
import z2.w0;

public abstract class s0 implements o40.d, o40.b {

    public static p10.a f12966a;

    public static final void E(boolean z10, u00.a aVar, l1.j jVar, int i10, int i11) {
        boolean z11;
        int i12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else if ((i10 & 6) == 0) {
            z11 = z10;
            i12 = (g0Var.h(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var.i(aVar) ? 32 : 16;
        }
        if (g0Var.S(i12 & 1, (i12 & 19) != 18)) {
            boolean z12 = i13 != 0 ? true : z11;
            Object objA = t9.b.a(g0Var);
            if (objA == null) {
                g0Var.c0(535274673);
                objA = (d.g0) g0Var.k(e.i.f4939a);
                if (objA == null) {
                    g0Var.c0(1208426157);
                    View view = (View) g0Var.k(c3.o0.f2726f);
                    kotlin.jvm.internal.m.e(view, "<this>");
                    while (true) {
                        if (view == null) {
                            objA = null;
                            break;
                        }
                        Object tag = view.getTag(2131363130);
                        d.g0 g0Var2 = tag instanceof d.g0 ? (d.g0) tag : null;
                        if (g0Var2 != null) {
                            objA = g0Var2;
                            break;
                        } else {
                            Object objE = bi.b.E(view);
                            view = objE instanceof View ? (View) objE : null;
                        }
                    }
                } else {
                    g0Var.c0(1208423708);
                }
                g0Var.r(false);
                if (objA == null) {
                    g0Var.c0(1208428160);
                    Object baseContext = (Context) g0Var.k(c3.o0.f2722b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof d.g0) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    objA = (d.g0) baseContext;
                } else {
                    g0Var.c0(1208423789);
                }
                g0Var.r(false);
            } else {
                g0Var.c0(535271790);
            }
            g0Var.r(false);
            if (objA == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zG = g0Var.g(objA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                s9.d dVar = objA instanceof s9.d ? (s9.d) objA : null;
                s9.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                d.g0 g0Var3 = objA instanceof d.g0 ? (d.g0) objA : null;
                objN = new f.b(navigationEventDispatcher, g0Var3 != null ? g0Var3.getOnBackPressedDispatcher() : null);
                g0Var.n0(objN);
            }
            f.b bVar = (f.b) objN;
            long j9 = g0Var.T;
            boolean zG2 = g0Var.g(bVar) | g0Var.f(j9);
            Object objN2 = g0Var.N();
            Object obj = objN2;
            if (zG2 || objN2 == cVar) {
                e.f fVar = new e.f(new e.b(objA, j9));
                fVar.f4936c = new a2.f(24);
                g0Var.n0(fVar);
                obj = fVar;
            }
            e.f fVar2 = (e.f) obj;
            g0Var.c0(-585307852);
            boolean zI = g0Var.i(fVar2) | ((i12 & 112) == 32);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar) {
                objN3 = new o1(fVar2, aVar, 8);
                g0Var.n0(objN3);
            }
            l1.q.k((u00.a) objN3, g0Var);
            Boolean boolValueOf = Boolean.valueOf(z12);
            int i14 = i12 & 14;
            boolean zI2 = g0Var.i(fVar2) | (i14 == 4);
            Object objN4 = g0Var.N();
            if (zI2 || objN4 == cVar) {
                objN4 = new e.c(fVar2, z12, 0);
                g0Var.n0(objN4);
            }
            kh.n.j(boolValueOf, fVar2, null, (u00.k) objN4, g0Var, i14);
            boolean zI3 = g0Var.i(bVar) | g0Var.i(fVar2);
            Object objN5 = g0Var.N();
            if (zI3 || objN5 == cVar) {
                objN5 = new al.l(bVar, fVar2, 11);
                g0Var.n0(objN5);
            }
            l1.q.c(bVar, fVar2, (u00.k) objN5, g0Var);
            g0Var.r(false);
            z11 = z12;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.u(z11, aVar, i10, i11);
        }
    }

    public static final void F(boolean z10, boolean z11, u00.a aVar, b2.r rVar, boolean z12, int i10, l1.j jVar, int i11, int i12) {
        b2.r rVar2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        l1.g0 g0Var;
        b2.r rVar3;
        boolean z15;
        int i17;
        r1 r1VarT;
        int i18;
        b2.o oVar;
        int i19;
        boolean z16;
        boolean z17;
        long jB;
        float f3;
        b2.r rVarD;
        float f10;
        float f11;
        float f12;
        b3.g gVar;
        kotlin.jvm.internal.m.e(aVar, "onClick");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1101461320);
        int i20 = (g0Var2.h(z10) ? 4 : 2) | i11 | (g0Var2.h(z11) ? 32 : 16) | (g0Var2.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        int i21 = i12 & 8;
        if (i21 != 0) {
            i13 = i20 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i20 | (g0Var2.g(rVar2) ? 2048 : 1024);
        }
        int i22 = i12 & 16;
        if (i22 == 0) {
            if ((i11 & 24576) == 0) {
                z13 = z12;
                i13 |= g0Var2.h(z13) ? 16384 : 8192;
            }
            if ((i12 & 32) == 0) {
                i14 = i10;
                if (g0Var2.e(i14)) {
                    i15 = 131072;
                }
                i16 = i13 | i15;
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (g0Var2.S(i16 & 1, z14)) {
                    g0Var2.X();
                    i18 = i11 & 1;
                    oVar = b2.o.A;
                    if (i18 != 0 || g0Var2.A()) {
                        if (i21 != 0) {
                            rVar2 = oVar;
                        }
                        if (i22 != 0) {
                            z13 = false;
                        }
                        if ((i12 & 32) != 0) {
                            b2.r rVar4 = rVar2;
                            i19 = 2131886717;
                            rVar3 = rVar4;
                            z16 = z13;
                        }
                        g0Var2.s();
                        if (z10 || z11) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            jB = dl.a.i;
                        } else if (z16) {
                            jB = i2.t.b(0.6f, dl.a.i);
                        } else {
                            jB = i2.t.b(0.4f, dl.a.i);
                        }
                        if (z16 || z17) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.5f;
                        }
                        if (z16) {
                            rVarD = z1.e(oVar, 44);
                        } else {
                            rVarD = z1.d(oVar, 1.0f);
                        }
                        b2.r rVarV = rVar3.V(rVarD);
                        if (z16) {
                            f10 = 22;
                        } else {
                            f10 = 28;
                        }
                        b2.r rVarN = w50.c.n(z.n.f(f2.h.c(rVarV, p0.f.a(f10)), jB, i2.b0.f7111b), z17, aVar);
                        if (z16) {
                            f11 = 20;
                        } else {
                            f11 = 0;
                        }
                        if (z16) {
                            f12 = 0;
                        } else {
                            f12 = 16;
                        }
                        b2.r rVarD2 = h0.c.D(rVarN, f11, f12);
                        w0 w0VarD = h0.o.d(b2.b.E, false);
                        boolean z18 = z16;
                        int iHashCode = Long.hashCode(g0Var2.T);
                        m1 m1VarM = g0Var2.m();
                        b2.r rVarC = b2.a.c(rVarD2, g0Var2);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD, g0Var2, b3.h.f2039f);
                        l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.f2040g);
                        l1.q.E(g0Var2, b3.h.f2041h);
                        l1.q.I(rVarC, g0Var2, b3.h.f2037d);
                        String strU = z3.U(g0Var2, i19);
                        long j9 = i2.t.f7162b;
                        long jZ = kh.o.z(16);
                        long jZ2 = kh.o.z(20);
                        q3.u uVar = q3.u.D;
                        if (z11) {
                            f3 = 0.0f;
                        }
                        int i23 = i19;
                        z6.b(strU, f2.h.a(oVar, f3), j9, jZ, uVar, null, 0L, null, null, jZ2, 0, false, 0, 0, null, null, g0Var2, 1597824, 48, 260008);
                        g0Var = g0Var2;
                        if (z11) {
                            g0Var.c0(1490605148);
                            v5.a(z1.m(oVar, 22), dl.a.l, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                            g0Var = g0Var;
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1490772672);
                            g0Var.r(false);
                        }
                        g0Var.r(true);
                        z15 = z18;
                        i17 = i23;
                    } else {
                        g0Var2.V();
                    }
                    rVar3 = rVar2;
                    z16 = z13;
                    i19 = i14;
                    g0Var2.s();
                    if (z10) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        jB = dl.a.i;
                    } else if (z16) {
                        jB = i2.t.b(0.6f, dl.a.i);
                    } else {
                        jB = i2.t.b(0.4f, dl.a.i);
                    }
                    if (z16) {
                        f3 = 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (z16) {
                        rVarD = z1.e(oVar, 44);
                    } else {
                        rVarD = z1.d(oVar, 1.0f);
                    }
                    b2.r rVarV2 = rVar3.V(rVarD);
                    if (z16) {
                        f10 = 22;
                    } else {
                        f10 = 28;
                    }
                    b2.r rVarN2 = w50.c.n(z.n.f(f2.h.c(rVarV2, p0.f.a(f10)), jB, i2.b0.f7111b), z17, aVar);
                    if (z16) {
                        f11 = 20;
                    } else {
                        f11 = 0;
                    }
                    if (z16) {
                        f12 = 0;
                    } else {
                        f12 = 16;
                    }
                    b2.r rVarD3 = h0.c.D(rVarN2, f11, f12);
                    w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    boolean z19 = z16;
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarD3, g0Var2);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD2, g0Var2, b3.h.f2039f);
                    l1.q.I(m1VarM2, g0Var2, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.f2040g);
                    l1.q.E(g0Var2, b3.h.f2041h);
                    l1.q.I(rVarC2, g0Var2, b3.h.f2037d);
                    String strU2 = z3.U(g0Var2, i19);
                    long j10 = i2.t.f7162b;
                    long jZ3 = kh.o.z(16);
                    long jZ4 = kh.o.z(20);
                    q3.u uVar2 = q3.u.D;
                    if (z11) {
                        f3 = 0.0f;
                    }
                    int i24 = i19;
                    z6.b(strU2, f2.h.a(oVar, f3), j10, jZ3, uVar2, null, 0L, null, null, jZ4, 0, false, 0, 0, null, null, g0Var2, 1597824, 48, 260008);
                    g0Var = g0Var2;
                    if (z11) {
                        g0Var.c0(1490605148);
                        v5.a(z1.m(oVar, 22), dl.a.l, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                        g0Var = g0Var;
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1490772672);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    z15 = z19;
                    i17 = i24;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    rVar3 = rVar2;
                    z15 = z13;
                    i17 = i14;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new qz.a(z10, z11, aVar, rVar3, z15, i17, i11, i12);
                }
            }
            i14 = i10;
            i15 = Cast.MAX_MESSAGE_LENGTH;
            i16 = i13 | i15;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (g0Var2.S(i16 & 1, z14)) {
                g0Var2.X();
                i18 = i11 & 1;
                oVar = b2.o.A;
                if (i18 != 0) {
                    if (i21 != 0) {
                        rVar2 = oVar;
                    }
                    if (i22 != 0) {
                        z13 = false;
                    }
                    if ((i12 & 32) != 0) {
                        b2.r rVar5 = rVar2;
                        i19 = 2131886717;
                        rVar3 = rVar5;
                        z16 = z13;
                    } else {
                        rVar3 = rVar2;
                        z16 = z13;
                        i19 = i14;
                    }
                } else {
                    if (i21 != 0) {
                        rVar2 = oVar;
                    }
                    if (i22 != 0) {
                        z13 = false;
                    }
                    if ((i12 & 32) != 0) {
                        b2.r rVar6 = rVar2;
                        i19 = 2131886717;
                        rVar3 = rVar6;
                        z16 = z13;
                    } else {
                        rVar3 = rVar2;
                        z16 = z13;
                        i19 = i14;
                    }
                }
                g0Var2.s();
                if (z10) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    jB = dl.a.i;
                } else if (z16) {
                    jB = i2.t.b(0.6f, dl.a.i);
                } else {
                    jB = i2.t.b(0.4f, dl.a.i);
                }
                if (z16) {
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                }
                if (z16) {
                    rVarD = z1.e(oVar, 44);
                } else {
                    rVarD = z1.d(oVar, 1.0f);
                }
                b2.r rVarV3 = rVar3.V(rVarD);
                if (z16) {
                    f10 = 22;
                } else {
                    f10 = 28;
                }
                b2.r rVarN3 = w50.c.n(z.n.f(f2.h.c(rVarV3, p0.f.a(f10)), jB, i2.b0.f7111b), z17, aVar);
                if (z16) {
                    f11 = 20;
                } else {
                    f11 = 0;
                }
                if (z16) {
                    f12 = 0;
                } else {
                    f12 = 16;
                }
                b2.r rVarD4 = h0.c.D(rVarN3, f11, f12);
                w0 w0VarD3 = h0.o.d(b2.b.E, false);
                boolean z110 = z16;
                int iHashCode3 = Long.hashCode(g0Var2.T);
                m1 m1VarM3 = g0Var2.m();
                b2.r rVarC3 = b2.a.c(rVarD4, g0Var2);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD3, g0Var2, b3.h.f2039f);
                l1.q.I(m1VarM3, g0Var2, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode3), g0Var2, b3.h.f2040g);
                l1.q.E(g0Var2, b3.h.f2041h);
                l1.q.I(rVarC3, g0Var2, b3.h.f2037d);
                String strU3 = z3.U(g0Var2, i19);
                long j11 = i2.t.f7162b;
                long jZ5 = kh.o.z(16);
                long jZ6 = kh.o.z(20);
                q3.u uVar3 = q3.u.D;
                if (z11) {
                    f3 = 0.0f;
                }
                int i25 = i19;
                z6.b(strU3, f2.h.a(oVar, f3), j11, jZ5, uVar3, null, 0L, null, null, jZ6, 0, false, 0, 0, null, null, g0Var2, 1597824, 48, 260008);
                g0Var = g0Var2;
                if (z11) {
                    g0Var.c0(1490605148);
                    v5.a(z1.m(oVar, 22), dl.a.l, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    g0Var.c0(1490772672);
                    g0Var.r(false);
                }
                g0Var.r(true);
                z15 = z110;
                i17 = i25;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar3 = rVar2;
                z15 = z13;
                i17 = i14;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new qz.a(z10, z11, aVar, rVar3, z15, i17, i11, i12);
            }
        }
        i13 |= 24576;
        z13 = z12;
        if ((i12 & 32) == 0) {
            i14 = i10;
            if (g0Var2.e(i14)) {
                i15 = 131072;
            }
            i16 = i13 | i15;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (g0Var2.S(i16 & 1, z14)) {
                g0Var2.X();
                i18 = i11 & 1;
                oVar = b2.o.A;
                if (i18 != 0) {
                    if (i21 != 0) {
                        rVar2 = oVar;
                    }
                    if (i22 != 0) {
                        z13 = false;
                    }
                    if ((i12 & 32) != 0) {
                        b2.r rVar7 = rVar2;
                        i19 = 2131886717;
                        rVar3 = rVar7;
                        z16 = z13;
                    } else {
                        rVar3 = rVar2;
                        z16 = z13;
                        i19 = i14;
                    }
                } else {
                    if (i21 != 0) {
                        rVar2 = oVar;
                    }
                    if (i22 != 0) {
                        z13 = false;
                    }
                    if ((i12 & 32) != 0) {
                        b2.r rVar8 = rVar2;
                        i19 = 2131886717;
                        rVar3 = rVar8;
                        z16 = z13;
                    } else {
                        rVar3 = rVar2;
                        z16 = z13;
                        i19 = i14;
                    }
                }
                g0Var2.s();
                if (z10) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    jB = dl.a.i;
                } else if (z16) {
                    jB = i2.t.b(0.6f, dl.a.i);
                } else {
                    jB = i2.t.b(0.4f, dl.a.i);
                }
                if (z16) {
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                }
                if (z16) {
                    rVarD = z1.e(oVar, 44);
                } else {
                    rVarD = z1.d(oVar, 1.0f);
                }
                b2.r rVarV4 = rVar3.V(rVarD);
                if (z16) {
                    f10 = 22;
                } else {
                    f10 = 28;
                }
                b2.r rVarN4 = w50.c.n(z.n.f(f2.h.c(rVarV4, p0.f.a(f10)), jB, i2.b0.f7111b), z17, aVar);
                if (z16) {
                    f11 = 20;
                } else {
                    f11 = 0;
                }
                if (z16) {
                    f12 = 0;
                } else {
                    f12 = 16;
                }
                b2.r rVarD5 = h0.c.D(rVarN4, f11, f12);
                w0 w0VarD4 = h0.o.d(b2.b.E, false);
                boolean z111 = z16;
                int iHashCode4 = Long.hashCode(g0Var2.T);
                m1 m1VarM4 = g0Var2.m();
                b2.r rVarC4 = b2.a.c(rVarD5, g0Var2);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD4, g0Var2, b3.h.f2039f);
                l1.q.I(m1VarM4, g0Var2, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode4), g0Var2, b3.h.f2040g);
                l1.q.E(g0Var2, b3.h.f2041h);
                l1.q.I(rVarC4, g0Var2, b3.h.f2037d);
                String strU4 = z3.U(g0Var2, i19);
                long j12 = i2.t.f7162b;
                long jZ7 = kh.o.z(16);
                long jZ8 = kh.o.z(20);
                q3.u uVar4 = q3.u.D;
                if (z11) {
                    f3 = 0.0f;
                }
                int i26 = i19;
                z6.b(strU4, f2.h.a(oVar, f3), j12, jZ7, uVar4, null, 0L, null, null, jZ8, 0, false, 0, 0, null, null, g0Var2, 1597824, 48, 260008);
                g0Var = g0Var2;
                if (z11) {
                    g0Var.c0(1490605148);
                    v5.a(z1.m(oVar, 22), dl.a.l, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    g0Var.c0(1490772672);
                    g0Var.r(false);
                }
                g0Var.r(true);
                z15 = z111;
                i17 = i26;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar3 = rVar2;
                z15 = z13;
                i17 = i14;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new qz.a(z10, z11, aVar, rVar3, z15, i17, i11, i12);
            }
        }
        i14 = i10;
        i15 = Cast.MAX_MESSAGE_LENGTH;
        i16 = i13 | i15;
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (g0Var2.S(i16 & 1, z14)) {
            g0Var2.X();
            i18 = i11 & 1;
            oVar = b2.o.A;
            if (i18 != 0) {
                if (i21 != 0) {
                    rVar2 = oVar;
                }
                if (i22 != 0) {
                    z13 = false;
                }
                if ((i12 & 32) != 0) {
                    b2.r rVar9 = rVar2;
                    i19 = 2131886717;
                    rVar3 = rVar9;
                    z16 = z13;
                } else {
                    rVar3 = rVar2;
                    z16 = z13;
                    i19 = i14;
                }
            } else {
                if (i21 != 0) {
                    rVar2 = oVar;
                }
                if (i22 != 0) {
                    z13 = false;
                }
                if ((i12 & 32) != 0) {
                    b2.r rVar10 = rVar2;
                    i19 = 2131886717;
                    rVar3 = rVar10;
                    z16 = z13;
                } else {
                    rVar3 = rVar2;
                    z16 = z13;
                    i19 = i14;
                }
            }
            g0Var2.s();
            if (z10) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                jB = dl.a.i;
            } else if (z16) {
                jB = i2.t.b(0.6f, dl.a.i);
            } else {
                jB = i2.t.b(0.4f, dl.a.i);
            }
            if (z16) {
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
            }
            if (z16) {
                rVarD = z1.e(oVar, 44);
            } else {
                rVarD = z1.d(oVar, 1.0f);
            }
            b2.r rVarV5 = rVar3.V(rVarD);
            if (z16) {
                f10 = 22;
            } else {
                f10 = 28;
            }
            b2.r rVarN5 = w50.c.n(z.n.f(f2.h.c(rVarV5, p0.f.a(f10)), jB, i2.b0.f7111b), z17, aVar);
            if (z16) {
                f11 = 20;
            } else {
                f11 = 0;
            }
            if (z16) {
                f12 = 0;
            } else {
                f12 = 16;
            }
            b2.r rVarD6 = h0.c.D(rVarN5, f11, f12);
            w0 w0VarD5 = h0.o.d(b2.b.E, false);
            boolean z112 = z16;
            int iHashCode5 = Long.hashCode(g0Var2.T);
            m1 m1VarM5 = g0Var2.m();
            b2.r rVarC5 = b2.a.c(rVarD6, g0Var2);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD5, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM5, g0Var2, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode5), g0Var2, b3.h.f2040g);
            l1.q.E(g0Var2, b3.h.f2041h);
            l1.q.I(rVarC5, g0Var2, b3.h.f2037d);
            String strU5 = z3.U(g0Var2, i19);
            long j13 = i2.t.f7162b;
            long jZ9 = kh.o.z(16);
            long jZ10 = kh.o.z(20);
            q3.u uVar5 = q3.u.D;
            if (z11) {
                f3 = 0.0f;
            }
            int i27 = i19;
            z6.b(strU5, f2.h.a(oVar, f3), j13, jZ9, uVar5, null, 0L, null, null, jZ10, 0, false, 0, 0, null, null, g0Var2, 1597824, 48, 260008);
            g0Var = g0Var2;
            if (z11) {
                g0Var.c0(1490605148);
                v5.a(z1.m(oVar, 22), dl.a.l, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(1490772672);
                g0Var.r(false);
            }
            g0Var.r(true);
            z15 = z112;
            i17 = i27;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar3 = rVar2;
            z15 = z13;
            i17 = i14;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new qz.a(z10, z11, aVar, rVar3, z15, i17, i11, i12);
        }
    }

    public static final void G(u00.a aVar, c4.v vVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        u00.a aVar2;
        int i12;
        c4.v vVar2;
        int i13;
        boolean z10;
        boolean z11;
        c4.v vVar3;
        r1 r1VarT;
        View view;
        y3.c cVar2;
        y3.m mVar;
        l1.e0 e0VarF;
        z0 z0VarG;
        Object objN;
        l1.c cVar3;
        UUID uuid;
        boolean zE;
        Object objN2;
        c4.x xVar;
        boolean zI;
        Object objN3;
        boolean z12;
        boolean zE2;
        Object objN4;
        int i14;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(826668973);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i12 = (g0Var.i(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                vVar2 = vVar;
                i12 |= g0Var.g(vVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (g0Var.i(cVar)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            i13 = i12;
            z10 = false;
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i13 & 1, z11)) {
                if (i15 != 0) {
                    vVar2 = new c4.v(7, z10);
                }
                view = (View) g0Var.k(c3.o0.f2726f);
                cVar2 = (y3.c) g0Var.k(c3.o1.f2734h);
                mVar = (y3.m) g0Var.k(c3.o1.f2738n);
                e0VarF = l1.q.F(g0Var);
                z0VarG = l1.q.G(cVar, g0Var);
                Object[] objArr = new Object[0];
                objN = g0Var.N();
                cVar3 = l1.i.f9868a;
                if (objN == cVar3) {
                    objN = c4.c.B;
                    g0Var.n0(objN);
                }
                uuid = (UUID) y1.k.c(objArr, (u00.a) objN, g0Var, 48);
                zE = g0Var.e(vVar2.f2852g) | g0Var.g(view) | g0Var.g(cVar2) | g0Var.g(null);
                objN2 = g0Var.N();
                if (zE || objN2 == cVar3) {
                    c4.x xVar2 = new c4.x(aVar2, vVar2, view, mVar, cVar2, uuid);
                    v1.c cVar4 = new v1.c(new b2.n(z0VarG, 3), -1338939603, true);
                    c4.u uVar = xVar2.H;
                    uVar.setParentCompositionContext(e0VarF);
                    uVar.K.setValue(cVar4);
                    uVar.O = true;
                    uVar.d();
                    g0Var.n0(xVar2);
                    objN2 = xVar2;
                }
                xVar = (c4.x) objN2;
                zI = g0Var.i(xVar);
                objN3 = g0Var.N();
                if (zI || objN3 == cVar3) {
                    objN3 = new c4.a(xVar, 0);
                    g0Var.n0(objN3);
                }
                l1.q.e(xVar, (u00.k) objN3, g0Var);
                boolean zI2 = g0Var.i(xVar);
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zE2 = zI2 | z12 | ((i13 & 112) == 32) | g0Var.e(mVar.ordinal());
                objN4 = g0Var.N();
                if (zE2 || objN4 == cVar3) {
                    c4.v vVar4 = vVar2;
                    androidx.fragment.app.o oVar = new androidx.fragment.app.o(xVar, aVar, vVar4, mVar, 1);
                    vVar2 = vVar4;
                    g0Var.n0(oVar);
                    objN4 = oVar;
                }
                l1.q.k((u00.a) objN4, g0Var);
            } else {
                g0Var.V();
            }
            vVar3 = vVar2;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new gc.h(aVar, vVar3, cVar, i10, i11);
            }
        }
        i12 |= 48;
        vVar2 = vVar;
        if ((i10 & 384) == 0) {
            if (g0Var.i(cVar)) {
                i14 = 256;
            } else {
                i14 = Cast.MAX_NAMESPACE_LENGTH;
            }
            i12 |= i14;
        }
        i13 = i12;
        z10 = false;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var.S(i13 & 1, z11)) {
            if (i15 != 0) {
                vVar2 = new c4.v(7, z10);
            }
            view = (View) g0Var.k(c3.o0.f2726f);
            cVar2 = (y3.c) g0Var.k(c3.o1.f2734h);
            mVar = (y3.m) g0Var.k(c3.o1.f2738n);
            e0VarF = l1.q.F(g0Var);
            z0VarG = l1.q.G(cVar, g0Var);
            Object[] objArr2 = new Object[0];
            objN = g0Var.N();
            cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = c4.c.B;
                g0Var.n0(objN);
            }
            uuid = (UUID) y1.k.c(objArr2, (u00.a) objN, g0Var, 48);
            zE = g0Var.e(vVar2.f2852g) | g0Var.g(view) | g0Var.g(cVar2) | g0Var.g(null);
            objN2 = g0Var.N();
            if (zE) {
                c4.x xVar3 = new c4.x(aVar2, vVar2, view, mVar, cVar2, uuid);
                v1.c cVar5 = new v1.c(new b2.n(z0VarG, 3), -1338939603, true);
                c4.u uVar2 = xVar3.H;
                uVar2.setParentCompositionContext(e0VarF);
                uVar2.K.setValue(cVar5);
                uVar2.O = true;
                uVar2.d();
                g0Var.n0(xVar3);
                objN2 = xVar3;
            } else {
                c4.x xVar4 = new c4.x(aVar2, vVar2, view, mVar, cVar2, uuid);
                v1.c cVar6 = new v1.c(new b2.n(z0VarG, 3), -1338939603, true);
                c4.u uVar3 = xVar4.H;
                uVar3.setParentCompositionContext(e0VarF);
                uVar3.K.setValue(cVar6);
                uVar3.O = true;
                uVar3.d();
                g0Var.n0(xVar4);
                objN2 = xVar4;
            }
            xVar = (c4.x) objN2;
            zI = g0Var.i(xVar);
            objN3 = g0Var.N();
            if (zI) {
                objN3 = new c4.a(xVar, 0);
                g0Var.n0(objN3);
            } else {
                objN3 = new c4.a(xVar, 0);
                g0Var.n0(objN3);
            }
            l1.q.e(xVar, (u00.k) objN3, g0Var);
            boolean zI3 = g0Var.i(xVar);
            if ((i13 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            zE2 = zI3 | z12 | ((i13 & 112) == 32) | g0Var.e(mVar.ordinal());
            objN4 = g0Var.N();
            if (zE2) {
                c4.v vVar5 = vVar2;
                androidx.fragment.app.o oVar2 = new androidx.fragment.app.o(xVar, aVar, vVar5, mVar, 1);
                vVar2 = vVar5;
                g0Var.n0(oVar2);
                objN4 = oVar2;
            } else {
                c4.v vVar6 = vVar2;
                androidx.fragment.app.o oVar3 = new androidx.fragment.app.o(xVar, aVar, vVar6, mVar, 1);
                vVar2 = vVar6;
                g0Var.n0(oVar3);
                objN4 = oVar3;
            }
            l1.q.k((u00.a) objN4, g0Var);
        } else {
            g0Var.V();
        }
        vVar3 = vVar2;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new gc.h(aVar, vVar3, cVar, i10, i11);
        }
    }

    public static final long H(int i10) {
        if (!(i10 > 0)) {
            g0.a.a("The span value should be higher than 0");
        }
        return i10;
    }

    public static final void I(a2 a2Var, u00.k kVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(401237887);
        int i11 = (g0Var.i(a2Var) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, sy.c.class, aVarA, null, g0Var);
            }
            sy.c cVar2 = (sy.c) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, vp.x.class, aVarA2, null, g0Var);
            }
            vp.x xVar = (vp.x) objN2;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g(null) | g0Var.g(aVarA3);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(kotlin.jvm.internal.a0.a, ah.e.class, aVarA3, null, g0Var);
            }
            ah.e eVar = (ah.e) objN3;
            e60.a aVarA4 = q50.c.a(g0Var);
            boolean zG4 = g0Var.g(null) | g0Var.g(aVarA4);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                objN4 = oi.k.f(kotlin.jvm.internal.a0.a, xo.e.class, aVarA4, null, g0Var);
            }
            xo.e eVar2 = (xo.e) objN4;
            e60.a aVarA5 = q50.c.a(g0Var);
            boolean zG5 = g0Var.g(null) | g0Var.g(aVarA5);
            Object objN5 = g0Var.N();
            if (zG5 || objN5 == cVar) {
                objN5 = oi.k.f(kotlin.jvm.internal.a0.a, xo.a.class, aVarA5, null, g0Var);
            }
            xo.a aVar = (xo.a) objN5;
            Context context = (Context) g0Var.k(c3.o0.f2722b);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            z0 z0VarG = l1.q.G(Boolean.valueOf(g0Var.k(dl.e.a) == gm.a.B), g0Var);
            boolean zI = g0Var.i(a2Var) | g0Var.i(cVar2) | g0Var.g(z0VarG) | ((i11 & 112) == 32) | g0Var.i(context) | g0Var.i(aVar) | g0Var.g(bVar) | g0Var.i(eVar2) | g0Var.i(eVar) | g0Var.i(xVar);
            Object objN6 = g0Var.N();
            if (zI || objN6 == cVar) {
                b1 b1Var = new b1(a2Var, cVar2, z0VarG, kVar, context, aVar, bVar, eVar2, xVar, eVar, (k00.c) null);
                g0Var.n0(b1Var);
                objN6 = b1Var;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bt.k0(a2Var, kVar, i10, 1);
        }
    }

    public static final void J(b2.r rVar, boolean z10, l1.j jVar, int i10, int i11) throws NoWhenBranchMatchedException {
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        r1 r1VarT;
        boolean z14;
        int iOrdinal;
        int i13;
        float f3;
        int iOrdinal2;
        long jZ;
        int iOrdinal3;
        long jZ2;
        int iOrdinal4;
        long jZ3;
        int iOrdinal5;
        long jZ4;
        b3.g gVar;
        b3.f fVar;
        b3.f fVar2;
        b3.f fVar3;
        b3.f fVar4;
        b2.o oVar;
        float f10;
        b2.o oVar2;
        b3.f fVar5;
        int i14;
        b3.f fVar6;
        b3.f fVar7;
        b3.f fVar8;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(19909111);
        if ((i10 & 6) == 0) {
            i12 = i10 | (g0Var.g(rVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                z11 = z10;
                i12 |= g0Var.h(z11) ? 32 : 16;
            }
            if ((i12 & 19) != 18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i12 & 1, z12)) {
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                gm.a aVar = (gm.a) g0Var.k(dl.e.a);
                iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    i13 = 48;
                } else {
                    if (iOrdinal == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 50;
                }
                f3 = i13;
                iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 != 0) {
                    jZ = kh.o.z(17);
                } else {
                    if (iOrdinal2 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(19);
                }
                long j9 = jZ;
                iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 != 0) {
                    jZ2 = kh.o.z(22);
                } else {
                    if (iOrdinal3 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ2 = kh.o.z(24);
                }
                long j10 = jZ2;
                iOrdinal4 = aVar.ordinal();
                if (iOrdinal4 != 0) {
                    jZ3 = kh.o.z(15);
                } else {
                    if (iOrdinal4 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ3 = kh.o.z(17);
                }
                long j11 = jZ3;
                iOrdinal5 = aVar.ordinal();
                if (iOrdinal5 != 0) {
                    jZ4 = kh.o.z(20);
                } else {
                    if (iOrdinal5 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ4 = kh.o.z(22);
                }
                long j12 = jZ4;
                b2.r rVarD = z1.d(rVar, 1.0f);
                h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, g0Var, 0);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarD, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                fVar = b3.h.f2039f;
                l1.q.I(vVarA, g0Var, fVar);
                fVar2 = b3.h.f2038e;
                l1.q.I(m1VarM, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                fVar3 = b3.h.f2040g;
                l1.q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.f2041h;
                l1.q.E(g0Var, eVar);
                fVar4 = b3.h.f2037d;
                l1.q.I(rVarC, g0Var, fVar4);
                oVar = b2.o.A;
                if (z14) {
                    g0Var.c0(1060862500);
                    fVar7 = fVar;
                    f10 = f3;
                    fVar6 = fVar3;
                    i14 = 0;
                    fVar8 = fVar4;
                    fVar5 = fVar2;
                    oVar2 = oVar;
                    z6.b(z3.U(g0Var, 2131887183), h0.c.E(z1.d(oVar, 1.0f), 0.0f, 12, 1), dl.a.n, t1.N(g0Var), q3.u.D, null, 0L, null, null, t1.M(g0Var), 0, false, 0, 0, null, null, g0Var, 1572912, 0, 260008);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    f10 = f3;
                    oVar2 = oVar;
                    fVar5 = fVar2;
                    i14 = 0;
                    fVar6 = fVar3;
                    fVar7 = fVar;
                    fVar8 = fVar4;
                    g0Var.c0(1061269313);
                    g0Var.r(false);
                }
                float f11 = 24;
                b2.r rVarC2 = h0.c.C(z.n.f(f2.h.c(z1.d(oVar2, 1.0f), p0.f.a(f11)), i2.t.b(0.08f, dl.a.i), i2.b0.f7111b), f11);
                h0.v vVarA2 = h0.u.a(h0.i.g(16), b2.b.N, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarC2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA2, g0Var, fVar7);
                l1.q.I(m1VarM2, g0Var, fVar5);
                a1.b.v(iHashCode2, g0Var, fVar6, g0Var, eVar);
                l1.q.I(rVarC3, g0Var, fVar8);
                b2.r rVarM = z1.m(h0.c.C(oVar2, 12), f10);
                m2.b bVarR = y3.R(2131231375, g0Var, i14);
                long j13 = dl.a.n;
                o3.a(bVarR, null, rVarM, j13, g0Var, 56, 0);
                l1.g0 g0Var2 = g0Var;
                z6.b(z3.U(g0Var, 2131886544), null, j13, j9, q3.u.D, null, 0L, null, new x3.k(3), j10, 0, false, 0, 0, null, null, g0Var2, 1572864, 0, 258986);
                z6.b(z3.U(g0Var2, 2131886545), null, i2.t.b(0.5f, dl.a.k), j11, q3.u.B, null, 0L, null, new x3.k(3), j12, 0, false, 0, 0, null, null, g0Var2, 1572864, 0, 258986);
                g0Var = g0Var2;
                g0Var.r(true);
                g0Var.r(true);
                z13 = z14;
            } else {
                g0Var.V();
                z13 = z11;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new ct.d0(rVar, z13, i10, i11, 1);
            }
        }
        i12 |= 48;
        z11 = z10;
        if ((i12 & 19) != 18) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g0Var.S(i12 & 1, z12)) {
            if (i15 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                i13 = 48;
            } else {
                if (iOrdinal == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 50;
            }
            f3 = i13;
            iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 != 0) {
                jZ = kh.o.z(17);
            } else {
                if (iOrdinal2 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = kh.o.z(19);
            }
            long j14 = jZ;
            iOrdinal3 = aVar2.ordinal();
            if (iOrdinal3 != 0) {
                jZ2 = kh.o.z(22);
            } else {
                if (iOrdinal3 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ2 = kh.o.z(24);
            }
            long j15 = jZ2;
            iOrdinal4 = aVar2.ordinal();
            if (iOrdinal4 != 0) {
                jZ3 = kh.o.z(15);
            } else {
                if (iOrdinal4 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ3 = kh.o.z(17);
            }
            long j16 = jZ3;
            iOrdinal5 = aVar2.ordinal();
            if (iOrdinal5 != 0) {
                jZ4 = kh.o.z(20);
            } else {
                if (iOrdinal5 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ4 = kh.o.z(22);
            }
            long j17 = jZ4;
            b2.r rVarD2 = z1.d(rVar, 1.0f);
            h0.v vVarA3 = h0.u.a(h0.i.f6408c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarD2, g0Var);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            fVar = b3.h.f2039f;
            l1.q.I(vVarA3, g0Var, fVar);
            fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM3, g0Var, fVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf2, g0Var, fVar3);
            b3.e eVar2 = b3.h.f2041h;
            l1.q.E(g0Var, eVar2);
            fVar4 = b3.h.f2037d;
            l1.q.I(rVarC4, g0Var, fVar4);
            oVar = b2.o.A;
            if (z14) {
                g0Var.c0(1060862500);
                fVar7 = fVar;
                f10 = f3;
                fVar6 = fVar3;
                i14 = 0;
                fVar8 = fVar4;
                fVar5 = fVar2;
                oVar2 = oVar;
                z6.b(z3.U(g0Var, 2131887183), h0.c.E(z1.d(oVar, 1.0f), 0.0f, 12, 1), dl.a.n, t1.N(g0Var), q3.u.D, null, 0L, null, null, t1.M(g0Var), 0, false, 0, 0, null, null, g0Var, 1572912, 0, 260008);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                f10 = f3;
                oVar2 = oVar;
                fVar5 = fVar2;
                i14 = 0;
                fVar6 = fVar3;
                fVar7 = fVar;
                fVar8 = fVar4;
                g0Var.c0(1061269313);
                g0Var.r(false);
            }
            float f12 = 24;
            b2.r rVarC5 = h0.c.C(z.n.f(f2.h.c(z1.d(oVar2, 1.0f), p0.f.a(f12)), i2.t.b(0.08f, dl.a.i), i2.b0.f7111b), f12);
            h0.v vVarA4 = h0.u.a(h0.i.g(16), b2.b.N, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC6 = b2.a.c(rVarC5, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA4, g0Var, fVar7);
            l1.q.I(m1VarM4, g0Var, fVar5);
            a1.b.v(iHashCode4, g0Var, fVar6, g0Var, eVar2);
            l1.q.I(rVarC6, g0Var, fVar8);
            b2.r rVarM2 = z1.m(h0.c.C(oVar2, 12), f10);
            m2.b bVarR2 = y3.R(2131231375, g0Var, i14);
            long j18 = dl.a.n;
            o3.a(bVarR2, null, rVarM2, j18, g0Var, 56, 0);
            l1.g0 g0Var3 = g0Var;
            z6.b(z3.U(g0Var, 2131886544), null, j18, j14, q3.u.D, null, 0L, null, new x3.k(3), j15, 0, false, 0, 0, null, null, g0Var3, 1572864, 0, 258986);
            z6.b(z3.U(g0Var3, 2131886545), null, i2.t.b(0.5f, dl.a.k), j16, q3.u.B, null, 0L, null, new x3.k(3), j17, 0, false, 0, 0, null, null, g0Var3, 1572864, 0, 258986);
            g0Var = g0Var3;
            g0Var.r(true);
            g0Var.r(true);
            z13 = z14;
        } else {
            g0Var.V();
            z13 = z11;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.d0(rVar, z13, i10, i11, 1);
        }
    }

    public static final void K(l1.j jVar, int i10) {
        Object e1Var;
        gz.m1 m1Var;
        boolean z10;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1141226608);
        int i11 = 5;
        if (g0Var.S(i10 & 1, i10 != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            gz.m1 m1VarS = c7.i.S(b0Var.b(gz.m1.class), f1VarA.getViewModelStore(), null, bVarZ, aVarA, null);
            z0 z0VarQ = k00.f.q(((vm.a) m1VarS).c.d, g0Var, 0);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.f6423w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).f6430g, g0Var);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            j0.v vVarA = j0.x.a(0, g0Var, 3);
            j1.r rVarD = j1.k.d(g0Var);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = l1.q.o(g0Var);
                g0Var.n0(objN);
            }
            a40.z zVar = (a40.z) objN;
            k00.c cVar2 = null;
            m6 m6VarF = t4.f(true, null, g0Var, 6, 2);
            m6 m6VarF2 = t4.f(true, null, g0Var, 6, 2);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.f13126a);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = oi.k.f(b0Var, sy.c.class, aVarA2, null, g0Var);
            }
            sy.c cVar3 = (sy.c) objN2;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA3);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                objN3 = oi.k.f(b0Var, nm.b.class, aVarA3, null, g0Var);
            }
            nm.b bVar = (nm.b) objN3;
            boolean zA = kotlin.jvm.internal.m.a(h00.q.U0(cVar3.b), SettingsRoute.SettingsScreen.INSTANCE);
            boolean zI = g0Var.i(bVar) | g0Var.g(m1VarS) | g0Var.i(wVar);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar) {
                objN4 = new f2(bVar, wVar, m1VarS, cVar2, 11);
                g0Var.n0(objN4);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN4);
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zH = g0Var.h(zA) | g0Var.g(m1VarS);
            Object objN5 = g0Var.N();
            if (zH || objN5 == cVar) {
                objN5 = new ab.o(zA, m1VarS, cVar2, i11);
                g0Var.n0(objN5);
            }
            l1.q.i(boolValueOf, g0Var, (u00.n) objN5);
            boolean zG3 = g0Var.g(m1VarS) | g0Var.i(wVar);
            Object objN6 = g0Var.N();
            if (zG3 || objN6 == cVar) {
                objN6 = new al.l(wVar, m1VarS, 21);
                g0Var.n0(objN6);
            }
            l1.q.e(wVar, (u00.k) objN6, g0Var);
            boolean zE = g0Var.e(aVar.ordinal());
            Object objN7 = g0Var.N();
            if (zE || objN7 == cVar) {
                objN7 = l1.q.r(new g1.l0(aVar, i11));
                g0Var.n0(objN7);
            }
            p2 p2Var = (p2) objN7;
            Object objN8 = g0Var.N();
            if (objN8 == cVar) {
                objN8 = l1.q.r(new el.b(vVarA, 5));
                g0Var.n0(objN8);
            }
            p2 p2Var2 = (p2) objN8;
            a2 a2VarH = m1VarS.h();
            boolean zG4 = g0Var.g(m1VarS);
            Object objN9 = g0Var.N();
            if (zG4 || objN9 == cVar) {
                e1Var = new e1(1, m1VarS, gz.m1.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/main/SettingsAction;)V", 0, 0);
                m1Var = m1VarS;
                g0Var.n0(e1Var);
            } else {
                e1Var = objN9;
                m1Var = m1VarS;
            }
            I(a2VarH, (a10.g) e1Var, g0Var, 0);
            h0.a0 a0Var = z1.f6478c;
            b2.r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.f7111b);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            float fFloatValue = ((Number) p2Var2.getValue()).floatValue();
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.f6456a;
            b2.o oVar = b2.o.A;
            wr.k.N(fFloatValue, sVar.a(oVar, iVar), 0.0f, 0L, 0L, g0Var, 0);
            boolean z12 = ((g1) z0VarQ.getValue()).w;
            boolean zG5 = g0Var.g(m1Var);
            Object objN10 = g0Var.N();
            if (zG5 || objN10 == cVar) {
                objN10 = new gz.w0(m1Var, 15);
                g0Var.n0(objN10);
            }
            j1.k.b(z12, (u00.a) objN10, a0Var, rVarD, null, v1.d.d(952550609, new bz.n(aVar, t0VarL, n1Var, rVarD, z0VarQ, 1), g0Var), v1.d.d(1255438000, new gz.z0(n1Var, t0VarL, vVarA, p2Var, z0VarQ, m1Var, 0), g0Var), g0Var, 1769856);
            sm.a.a(z3.U(g0Var, 2131887255), ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar), 0.0f, g0Var, 0);
            g0Var.r(true);
            boolean z13 = ((g1) z0VarQ.getValue()).g;
            boolean zG6 = g0Var.g(m1Var);
            Object objN11 = g0Var.N();
            if (zG6 || objN11 == cVar) {
                objN11 = new gz.w0(m1Var, 16);
                g0Var.n0(objN11);
            }
            lz.a.b(z13, (u00.a) objN11, g0Var, 0);
            boolean z14 = ((g1) z0VarQ.getValue()).e;
            boolean zG7 = g0Var.g(m1Var);
            Object objN12 = g0Var.N();
            if (zG7 || objN12 == cVar) {
                objN12 = new gz.w0(m1Var, 17);
                g0Var.n0(objN12);
            }
            u00.a aVar2 = (u00.a) objN12;
            boolean zG8 = g0Var.g(m1Var);
            Object objN13 = g0Var.N();
            if (zG8 || objN13 == cVar) {
                objN13 = new gz.w0(m1Var, 18);
                g0Var.n0(objN13);
            }
            u00.a aVar3 = (u00.a) objN13;
            boolean zG9 = g0Var.g(m1Var);
            Object objN14 = g0Var.N();
            if (zG9 || objN14 == cVar) {
                objN14 = new gz.w0(m1Var, 19);
                g0Var.n0(objN14);
            }
            u00.a aVar4 = (u00.a) objN14;
            boolean zG10 = g0Var.g(m1Var);
            Object objN15 = g0Var.N();
            if (zG10 || objN15 == cVar) {
                objN15 = new gz.w0(m1Var, 6);
                g0Var.n0(objN15);
            }
            u00.a aVar5 = (u00.a) objN15;
            boolean zG11 = g0Var.g(m1Var);
            Object objN16 = g0Var.N();
            if (zG11 || objN16 == cVar) {
                objN16 = new gz.w0(m1Var, 13);
                g0Var.n0(objN16);
            }
            iz.d.h(z14, aVar2, aVar3, aVar4, aVar5, (u00.a) objN16, g0Var, 0);
            boolean z15 = ((g1) z0VarQ.getValue()).k;
            boolean z16 = ((g1) z0VarQ.getValue()).j;
            boolean z17 = ((g1) z0VarQ.getValue()).l;
            boolean zG12 = g0Var.g(m1Var);
            Object objN17 = g0Var.N();
            if (zG12 || objN17 == cVar) {
                objN17 = new gz.w0(m1Var, 20);
                g0Var.n0(objN17);
            }
            u00.a aVar6 = (u00.a) objN17;
            boolean zG13 = g0Var.g(m1Var);
            Object objN18 = g0Var.N();
            if (zG13 || objN18 == cVar) {
                objN18 = new gz.w0(m1Var, 24);
                g0Var.n0(objN18);
            }
            u00.a aVar7 = (u00.a) objN18;
            boolean zG14 = g0Var.g(m1Var);
            Object objN19 = g0Var.N();
            if (zG14 || objN19 == cVar) {
                objN19 = new y0(m1Var, 1);
                g0Var.n0(objN19);
            }
            iz.j.b(z15, z16, z17, aVar6, aVar7, (u00.k) objN19, g0Var, 0);
            g0Var = g0Var;
            boolean z18 = aVar == gm.a.B;
            boolean z19 = ((g1) z0VarQ.getValue()).o;
            boolean zI2 = g0Var.i(zVar) | g0Var.g(m6VarF) | g0Var.g(m1Var);
            Object objN20 = g0Var.N();
            int i12 = 14;
            if (zI2 || objN20 == cVar) {
                objN20 = new b1.l(zVar, m6VarF, m1Var, i12);
                g0Var.n0(objN20);
            }
            u00.k kVar = (u00.k) objN20;
            boolean zI3 = g0Var.i(zVar) | g0Var.g(m6VarF) | g0Var.g(m1Var);
            Object objN21 = g0Var.N();
            if (zI3 || objN21 == cVar) {
                objN21 = new x0(zVar, m6VarF, m1Var, 5);
                g0Var.n0(objN21);
            }
            ca.v.a(z19, kVar, (u00.a) objN21, m6VarF, g0Var, 0);
            if (((g1) z0VarQ.getValue()).p == null) {
                g0Var.c0(688229030);
                g0Var.r(false);
            } else {
                g0Var.c0(688229031);
                if (z18) {
                    g0Var.c0(-1108425746);
                    boolean zG15 = g0Var.g(m1Var);
                    Object objN22 = g0Var.N();
                    if (zG15 || objN22 == cVar) {
                        objN22 = new gz.w0(m1Var, 25);
                        g0Var.n0(objN22);
                    }
                    u00.a aVar8 = (u00.a) objN22;
                    boolean zG16 = g0Var.g(m1Var);
                    Object objN23 = g0Var.N();
                    if (zG16 || objN23 == cVar) {
                        objN23 = new gz.w0(m1Var, 26);
                        g0Var.n0(objN23);
                    }
                    u00.a aVar9 = (u00.a) objN23;
                    boolean zG17 = g0Var.g(m1Var);
                    Object objN24 = g0Var.N();
                    if (zG17 || objN24 == cVar) {
                        z10 = false;
                        objN24 = new gz.w0(m1Var, 0);
                        g0Var.n0(objN24);
                    } else {
                        z10 = false;
                    }
                    tp.h.b(aVar8, aVar9, (u00.a) objN24, g0Var, z10 ? 1 : 0);
                    g0Var.r(z10);
                } else {
                    g0Var.c0(-1107976401);
                    boolean zG18 = g0Var.g(m1Var);
                    Object objN25 = g0Var.N();
                    if (zG18 || objN25 == cVar) {
                        objN25 = new gz.w0(m1Var, 1);
                        g0Var.n0(objN25);
                    }
                    u00.a aVar10 = (u00.a) objN25;
                    boolean zG19 = g0Var.g(m1Var);
                    Object objN26 = g0Var.N();
                    if (zG19 || objN26 == cVar) {
                        objN26 = new gz.w0(m1Var, 2);
                        g0Var.n0(objN26);
                    }
                    u00.a aVar11 = (u00.a) objN26;
                    boolean zG20 = g0Var.g(m1Var);
                    Object objN27 = g0Var.N();
                    if (zG20 || objN27 == cVar) {
                        objN27 = new gz.w0(m1Var, 3);
                        g0Var.n0(objN27);
                    }
                    z10 = false;
                    tp.h.a(aVar10, aVar11, (u00.a) objN27, g0Var, 0);
                    g0Var.r(false);
                }
                g0Var.r(z10);
            }
            if (z18) {
                g0Var.c0(689172609);
                if (((g1) z0VarQ.getValue()).r) {
                    g0Var.c0(689212723);
                    boolean zG21 = g0Var.g(m1Var);
                    Object objN28 = g0Var.N();
                    if (zG21 || objN28 == cVar) {
                        objN28 = new gz.w0(m1Var, 4);
                        g0Var.n0(objN28);
                    }
                    ez.a.d((u00.a) objN28, g0Var, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(689396274);
                    g0Var.r(false);
                }
                if (((g1) z0VarQ.getValue()).s) {
                    g0Var.c0(689454957);
                    boolean zG22 = g0Var.g(m1Var);
                    Object objN29 = g0Var.N();
                    if (zG22 || objN29 == cVar) {
                        objN29 = new gz.w0(m1Var, 5);
                        g0Var.n0(objN29);
                    }
                    z11 = false;
                    wy.q.c((u00.a) objN29, g0Var, 0);
                    g0Var.r(false);
                } else {
                    z11 = false;
                    g0Var.c0(689644274);
                    g0Var.r(false);
                }
                g0Var.r(z11);
            } else {
                g0Var.c0(689650226);
                g0Var.r(false);
            }
            if (((g1) z0VarQ.getValue()).v) {
                g0Var.c0(689725246);
                boolean z20 = ((g1) z0VarQ.getValue()).q;
                String str = ((g1) z0VarQ.getValue()).x;
                String str2 = ((g1) z0VarQ.getValue()).y;
                boolean z21 = ((g1) z0VarQ.getValue()).z;
                boolean zI4 = g0Var.i(zVar) | g0Var.g(m6VarF2) | g0Var.g(m1Var);
                Object objN30 = g0Var.N();
                if (zI4 || objN30 == cVar) {
                    objN30 = new x0(zVar, m6VarF2, m1Var, 0);
                    g0Var.n0(objN30);
                }
                u00.a aVar12 = (u00.a) objN30;
                boolean zI5 = g0Var.i(zVar) | g0Var.g(m6VarF2) | g0Var.g(m1Var);
                Object objN31 = g0Var.N();
                if (zI5 || objN31 == cVar) {
                    objN31 = new x0(zVar, m6VarF2, m1Var, 1);
                    g0Var.n0(objN31);
                }
                u00.a aVar13 = (u00.a) objN31;
                boolean zI6 = g0Var.i(zVar) | g0Var.g(m6VarF2) | g0Var.g(m1Var);
                Object objN32 = g0Var.N();
                if (zI6 || objN32 == cVar) {
                    objN32 = new x0(zVar, m6VarF2, m1Var, 2);
                    g0Var.n0(objN32);
                }
                u00.a aVar14 = (u00.a) objN32;
                boolean zI7 = g0Var.i(zVar) | g0Var.g(m6VarF2) | g0Var.g(m1Var);
                Object objN33 = g0Var.N();
                if (zI7 || objN33 == cVar) {
                    objN33 = new x0(zVar, m6VarF2, m1Var, 3);
                    g0Var.n0(objN33);
                }
                u00.a aVar15 = (u00.a) objN33;
                boolean zI8 = g0Var.i(zVar) | g0Var.g(m6VarF2) | g0Var.g(m1Var);
                Object objN34 = g0Var.N();
                if (zI8 || objN34 == cVar) {
                    objN34 = new x0(zVar, m6VarF2, m1Var, 4);
                    g0Var.n0(objN34);
                }
                iz.d.b(z20, str, str2, z21, aVar12, aVar13, aVar14, aVar15, (u00.a) objN34, m6VarF2, g0Var, 0);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(691066802);
                g0Var.r(false);
            }
            boolean z22 = ((g1) z0VarQ.getValue()).t;
            boolean z23 = ((g1) z0VarQ.getValue()).u;
            boolean zG23 = g0Var.g(m1Var);
            Object objN35 = g0Var.N();
            if (zG23 || objN35 == cVar) {
                objN35 = new gz.w0(m1Var, 7);
                g0Var.n0(objN35);
            }
            u00.a aVar16 = (u00.a) objN35;
            boolean zG24 = g0Var.g(m1Var);
            Object objN36 = g0Var.N();
            if (zG24 || objN36 == cVar) {
                objN36 = new gz.w0(m1Var, 8);
                g0Var.n0(objN36);
            }
            iz.d.r(z22, z23, aVar16, (u00.a) objN36, g0Var, 0);
            boolean z24 = ((g1) z0VarQ.getValue()).h;
            zz.b bVar2 = ((g1) z0VarQ.getValue()).i;
            boolean zG25 = g0Var.g(m1Var);
            Object objN37 = g0Var.N();
            if (zG25 || objN37 == cVar) {
                objN37 = new y0(m1Var, 0);
                g0Var.n0(objN37);
            }
            u00.k kVar2 = (u00.k) objN37;
            boolean zG26 = g0Var.g(m1Var);
            Object objN38 = g0Var.N();
            if (zG26 || objN38 == cVar) {
                objN38 = new gz.w0(m1Var, 9);
                g0Var.n0(objN38);
            }
            iz.d.s(z24, bVar2, kVar2, (u00.a) objN38, g0Var, 0);
            boolean z25 = ((g1) z0VarQ.getValue()).m;
            boolean zG27 = g0Var.g(m1Var);
            Object objN39 = g0Var.N();
            if (zG27 || objN39 == cVar) {
                objN39 = new gz.w0(m1Var, 10);
                g0Var.n0(objN39);
            }
            iz.d.g(z25, (u00.a) objN39, g0Var, 0);
            if (((g1) z0VarQ.getValue()).n) {
                g0Var.c0(691946613);
                boolean zG28 = g0Var.g(m1Var);
                Object objN40 = g0Var.N();
                if (zG28 || objN40 == cVar) {
                    objN40 = new gz.w0(m1Var, 11);
                    g0Var.n0(objN40);
                }
                u00.a aVar17 = (u00.a) objN40;
                boolean zG29 = g0Var.g(m1Var);
                Object objN41 = g0Var.N();
                if (zG29 || objN41 == cVar) {
                    objN41 = new gz.w0(m1Var, 12);
                    g0Var.n0(objN41);
                }
                z3.a(aVar17, (u00.a) objN41, g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(692158994);
                g0Var.r(false);
            }
            boolean z26 = ((g1) z0VarQ.getValue()).A;
            String str3 = ((g1) z0VarQ.getValue()).B;
            boolean zG30 = g0Var.g(m1Var);
            Object objN42 = g0Var.N();
            if (zG30 || objN42 == cVar) {
                objN42 = new gz.w0(m1Var, 14);
                g0Var.n0(objN42);
            }
            iz.d.e(0, str3, g0Var, (u00.a) objN42, z26);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c8(i10, 5);
        }
    }

    public static final float L(p2 p2Var) {
        return ((y3.f) p2Var.getValue()).A;
    }

    public static final void M(b2.r rVar, u00.n nVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1090521195);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(nVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = c4.e.f2832b;
                g0Var.n0(objN);
            }
            w0 w0Var = (w0) objN;
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            int i12 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            nVar.invoke(g0Var, Integer.valueOf((i12 >> 6) & 14));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c4.f(rVar, nVar, i10, 0);
        }
    }

    public static final n20.b N(String str) {
        n20.c cVar = n20.h.a;
        return new n20.b(n20.h.h, n20.e.e(str));
    }

    public static final n20.b O(String str) {
        n20.c cVar = n20.h.a;
        return new n20.b(n20.h.a, n20.e.e(str));
    }

    public static final n20.b P(String str) {
        n20.c cVar = n20.h.a;
        return new n20.b(n20.h.c, n20.e.e(str));
    }

    public static final w6.a Q(androidx.lifecycle.e1 e1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r9.e eVar = new r9.e(23);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        a10.d dVarB = b0Var.b(w6.a.class);
        if (linkedHashMap.containsKey(dVarB)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + dVarB.m() + '.').toString());
        }
        linkedHashMap.put(dVarB, new t6.e(dVarB, eVar));
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.m.e(collectionValues, "initializers");
        t6.e[] eVarArr = (t6.e[]) collectionValues.toArray(new t6.e[0]);
        t6.c cVar = new t6.c((t6.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        t6.a aVar = t6.a.f14359b;
        kotlin.jvm.internal.m.e(e1Var, "store");
        kotlin.jvm.internal.m.e(aVar, "extras");
        p10.a aVar2 = new p10.a(e1Var, cVar, aVar);
        a10.d dVarB2 = b0Var.b(w6.a.class);
        String strM = dVarB2.m();
        if (strM != null) {
            return (w6.a) aVar2.o(dVarB2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final void R(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iP = h00.d0.P(h00.r.q0(setEntrySet, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final n20.b S(n20.e eVar) {
        n20.c cVar = n20.h.a;
        n20.b bVar = n20.h.l;
        return new n20.b(bVar.a, n20.e.e(eVar.c().concat(bVar.f().c())));
    }

    public static final n20.b T(String str) {
        n20.c cVar = n20.h.a;
        return new n20.b(n20.h.b, n20.e.e(str));
    }

    public static final n20.b U(n20.b bVar) {
        n20.c cVar = n20.h.a;
        return new n20.b(n20.h.a, n20.e.e("U".concat(bVar.f().c())));
    }

    public static void V(Throwable th2, Throwable th3) {
        kotlin.jvm.internal.m.e(th2, "<this>");
        kotlin.jvm.internal.m.e(th3, "exception");
        if (th2 != th3) {
            Integer num = p00.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = o00.a.a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static void X(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static final void Y(int i10, int i11) {
        if (i10 != i11) {
            throw new IllegalArgumentException(g4.c.e(i10, i11, "Class declares ", " type parameters, but ", " were provided."));
        }
    }

    public static k00.c Z(k00.c cVar, k00.c cVar2, u00.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        if (nVar instanceof m00.a) {
            return ((m00.a) nVar).create(cVar, cVar2);
        }
        k00.j context = cVar2.getContext();
        return context == k00.j.A ? new l00.b(cVar2, cVar, nVar) : new l00.c(cVar2, context, nVar, cVar);
    }

    public static final p30.a a0(a10.e eVar, List list, boolean z10, List list2) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(list, "arguments");
        kotlin.jvm.internal.m.e(list2, "annotations");
        return b0(eVar, list, z10, list2, null);
    }

    public static final p30.a b0(a10.e eVar, List list, boolean z10, List list2, a10.d dVar) throws NoWhenBranchMatchedException, a40.b0 {
        j10.e eVarM;
        e30.f0 f0Var;
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(list, "arguments");
        kotlin.jvm.internal.m.e(list2, "annotations");
        if (!e2.a) {
            a10.d dVar2 = eVar instanceof a10.d ? (a10.d) eVar : null;
            List listW = dVar2 != null ? p30.f.W(dVar2) : null;
            if (listW == null) {
                listW = h00.x.A;
            }
            Y(listW.size(), list.size());
            return new p30.r(eVar, list, z10, list2, (a10.x) null, false, false, false, dVar, (u00.a) null);
        }
        if (eVar instanceof j1) {
            eVarM = ((j1) eVar).M();
        } else {
            if (!(eVar instanceof d10.r1)) {
                throw new a40.b0("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
            }
            d10.r1 r1Var = (d10.r1) eVar;
            j10.e eVar2 = r1Var.E;
            if (eVar2 == null) {
                throw new IllegalStateException(("Descriptor-less type parameter: " + r1Var).toString());
            }
            eVarM = eVar2;
        }
        Y(eVarM.f().getParameters().size(), list.size());
        e30.m0 m0VarF = eVarM.f();
        kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
        List parameters = m0VarF.getParameters();
        kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
        e30.h0.B.getClass();
        e30.h0 h0Var = e30.h0.C;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                va.a.k0();
                throw null;
            }
            a10.z zVar = (a10.z) obj;
            p30.i iVar = zVar.b;
            e30.w wVar = iVar != null ? iVar.B : null;
            a10.a0 a0Var = zVar.a;
            int i12 = a0Var == null ? -1 : b10.a.a[a0Var.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                kotlin.jvm.internal.m.d(obj2, "get(...)");
                f0Var = new e30.f0((j10.r0) obj2);
            } else if (i12 == 1) {
                a1 a1Var = a1.C;
                kotlin.jvm.internal.m.b(wVar);
                f0Var = new e30.f0(wVar, a1Var);
            } else if (i12 == 2) {
                a1 a1Var2 = a1.D;
                kotlin.jvm.internal.m.b(wVar);
                f0Var = new e30.f0(wVar, a1Var2);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a1 a1Var3 = a1.E;
                kotlin.jvm.internal.m.b(wVar);
                f0Var = new e30.f0(wVar, a1Var3);
            }
            arrayList.add(f0Var);
            i10 = i11;
        }
        return new p30.i(e30.c.u(h0Var, m0VarF, arrayList, z10), (u00.a) null);
    }

    public static final void e0(long j9, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = r30.d.a[(int) ((j9 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final long g0(int i10, byte[] bArr) {
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    public static final int h0(m0.q qVar) {
        return (int) (qVar.f10369e == q1.A ? qVar.g() & 4294967295L : qVar.g() >> 32);
    }

    public static p10.a i0() {
        p10.a aVar;
        p10.a aVar2 = f12966a;
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = new p10.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            aVar = new p10.a((Object) null, (Object) null, (Object) null, (Object) null);
        }
        f12966a = aVar;
        return aVar;
    }

    public static k00.c j0(k00.c cVar) {
        k00.c cVarIntercepted;
        kotlin.jvm.internal.m.e(cVar, "<this>");
        m00.c cVar2 = cVar instanceof m00.c ? (m00.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static final za.b0 k0(za.i iVar, String str, Executor executor, u00.a aVar) {
        kotlin.jvm.internal.m.e(iVar, "tracer");
        kotlin.jvm.internal.m.e(str, "label");
        kotlin.jvm.internal.m.e(executor, "executor");
        androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0(0);
        return new za.b0(f0Var, a10.h0.A(new com.revenuecat.purchases.google.usecase.e(executor, iVar, str, aVar, f0Var)));
    }

    public static Boolean l0(Class cls) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.m.e(cls, "clazz");
        Method method = (Method) i0().A;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public static x40.d m0(x40.p pVar) {
        int i10;
        int length;
        int length2;
        int i11;
        String string;
        String string2;
        int length3;
        x40.p pVar2 = pVar;
        kotlin.jvm.internal.m.e(pVar2, "headers");
        int size = pVar2.size();
        int i12 = 0;
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iX = -1;
        int iX2 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iX3 = -1;
        int iX4 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i12 < size) {
            String strC = pVar2.c(i12);
            String strH = pVar2.h(i12);
            if (r30.r.q0(strC, "Cache-Control")) {
                if (str == null) {
                    str = strH;
                }
                i10 = 0;
                while (i10 < strH.length()) {
                    length = strH.length();
                    length2 = i10;
                    while (true) {
                        if (length2 < length) {
                            i11 = size;
                            length2 = strH.length();
                            break;
                        }
                        i11 = size;
                        if (r30.k.B0("=,;", strH.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i11;
                    }
                    String strSubstring = strH.substring(i10, length2);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = r30.k.j1(strSubstring).toString();
                    if (length2 != strH.length() || strH.charAt(length2) == ',' || strH.charAt(length2) == ';') {
                        i10 = length2 + 1;
                        string2 = null;
                    } else {
                        int length4 = length2 + 1;
                        byte[] bArr = y40.b.a;
                        int length5 = strH.length();
                        while (true) {
                            if (length4 >= length5) {
                                length4 = strH.length();
                                break;
                            }
                            char cCharAt = strH.charAt(length4);
                            int i13 = length5;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length4++;
                            length5 = i13;
                        }
                        if (length4 >= strH.length() || strH.charAt(length4) != '\"') {
                            int length6 = strH.length();
                            int i14 = length4;
                            while (true) {
                                if (i14 >= length6) {
                                    length3 = strH.length();
                                    break;
                                }
                                int i15 = length6;
                                int i16 = i14;
                                if (r30.k.B0(",;", strH.charAt(i14))) {
                                    length3 = i16;
                                    break;
                                }
                                i14 = i16 + 1;
                                length6 = i15;
                            }
                            String strSubstring2 = strH.substring(length4, length3);
                            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            string2 = r30.k.j1(strSubstring2).toString();
                            i10 = length3;
                        } else {
                            int i17 = length4 + 1;
                            int iI0 = r30.k.I0(strH, '\"', i17, 4);
                            string2 = strH.substring(i17, iI0);
                            kotlin.jvm.internal.m.d(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i10 = iI0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iX = y40.b.x(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iX2 = y40.b.x(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iX3 = y40.b.x(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iX4 = y40.b.x(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z18 = true;
                    }
                    size = i11;
                }
                i12++;
                pVar2 = pVar;
                size = size;
            } else {
                if (r30.r.q0(strC, "Pragma")) {
                }
                i12++;
                pVar2 = pVar;
                size = size;
            }
            z10 = false;
            i10 = 0;
            while (i10 < strH.length()) {
                length = strH.length();
                length2 = i10;
                while (true) {
                    if (length2 < length) {
                        i11 = size;
                        length2 = strH.length();
                        break;
                    }
                    i11 = size;
                    if (r30.k.B0("=,;", strH.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i11;
                }
                String strSubstring3 = strH.substring(i10, length2);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = r30.k.j1(strSubstring3).toString();
                if (length2 != strH.length()) {
                    i10 = length2 + 1;
                    string2 = null;
                } else {
                    i10 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z11 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z12 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iX = y40.b.x(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iX2 = y40.b.x(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z13 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z14 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z15 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iX3 = y40.b.x(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iX4 = y40.b.x(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z16 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z17 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z18 = true;
                }
                size = i11;
            }
            i12++;
            pVar2 = pVar;
            size = size;
        }
        return new x40.d(z11, z12, iX, iX2, z13, z14, z15, iX3, iX4, z16, z17, z18, !z10 ? null : str);
    }

    public static j20.a n0(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        z00.e eVar = new z00.e(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(h00.r.q0(eVar, 10));
        z00.d it = eVar.iterator();
        while (true) {
            z00.d dVar = it;
            if (!dVar.C) {
                int[] iArrM1 = h00.q.m1(arrayList);
                return new j20.a(Arrays.copyOf(iArrM1, iArrM1.length));
            }
            dVar.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static long o0(e7.u uVar, int i10, int i11) {
        uVar.N(i10);
        if (uVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = uVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i11 || (iM & 32) == 0 || uVar.A() < 7 || uVar.a() < 7 || (uVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        uVar.k(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static final boolean p0(e30.w wVar) {
        j10.e eVarG = wVar.m0().g();
        if (eVarG != null && ((q20.f.b(eVarG) && q20.f.e(eVarG) && !u20.d.g(eVarG).equals(g10.p.h)) || q20.f.g(wVar))) {
            return true;
        }
        j10.r0 r0VarG = wVar.m0().g();
        j10.r0 r0Var = r0VarG instanceof j10.r0 ? r0VarG : null;
        return r0Var != null && p0(ab.a0.g0(r0Var));
    }

    public static void q0(TextView textView, int i10) {
        rd.a.h(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static al.n r0(long j9) {
        x.d0 d0Var = (x.d0) al.b.a.getValue();
        kotlin.jvm.internal.m.e(d0Var, "animationSpec");
        return new al.n(j9, d0Var);
    }

    public static String s0(Throwable th2) {
        kotlin.jvm.internal.m.e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final void t0(String str, int i10, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i10 + ", but was '" + str.charAt(i10) + '\'');
    }

    public static Object u0(u00.n nVar, Object obj, k00.c cVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        k00.j context = cVar.getContext();
        l00.d dVar = context == k00.j.A ? new l00.d(cVar) : new l00.e(cVar, context);
        kotlin.jvm.internal.d0.d(2, nVar);
        return nVar.invoke(obj, dVar);
    }

    public static int v0(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long w0(long j9) {
        return (j9 >>> 1) ^ (-(1 & j9));
    }

    public o40.b A(n40.e eVar, int i10) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        return c(eVar);
    }

    public void B(n40.e eVar, int i10, double d3) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        c0(eVar, i10);
        e(d3);
    }

    public void C(n40.e eVar, int i10, l40.a aVar, Object obj) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        kotlin.jvm.internal.m.e(aVar, "serializer");
        c0(eVar, i10);
        y(aVar, obj);
    }

    public void D(String str) throws SerializationException {
        kotlin.jvm.internal.m.e(str, "value");
        d0(str);
    }

    public abstract String W();

    public void a(n40.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
    }

    public o40.b c(n40.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        return this;
    }

    public void c0(n40.e eVar, int i10) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
    }

    public void d() throws SerializationException {
        throw new SerializationException("'null' is not supported by default");
    }

    public void d0(Object obj) throws SerializationException {
        kotlin.jvm.internal.m.e(obj, "value");
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        sb2.append(b0Var.b(cls));
        sb2.append(" is not supported by ");
        sb2.append(b0Var.b(getClass()));
        sb2.append(" encoder");
        throw new SerializationException(sb2.toString());
    }

    public void e(double d3) throws SerializationException {
        d0(Double.valueOf(d3));
    }

    public void f(short s6) throws SerializationException {
        d0(Short.valueOf(s6));
    }

    public abstract void f0(sg.u uVar, float f3, float f10);

    public void g(byte b7) throws SerializationException {
        d0(Byte.valueOf(b7));
    }

    public void h(boolean z10) throws SerializationException {
        d0(Boolean.valueOf(z10));
    }

    public void i(n40.e eVar, int i10, String str) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        kotlin.jvm.internal.m.e(str, "value");
        c0(eVar, i10);
        D(str);
    }

    public void j(p40.s0 s0Var, int i10, byte b7) throws SerializationException {
        kotlin.jvm.internal.m.e(s0Var, "descriptor");
        c0(s0Var, i10);
        g(b7);
    }

    public boolean k(n40.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        return true;
    }

    public void l(float f3) throws SerializationException {
        d0(Float.valueOf(f3));
    }

    public o40.d m(p40.s0 s0Var, int i10) {
        kotlin.jvm.internal.m.e(s0Var, "descriptor");
        c0(s0Var, i10);
        return o(s0Var.h(i10));
    }

    public void n(p40.s0 s0Var, int i10, char c10) throws SerializationException {
        kotlin.jvm.internal.m.e(s0Var, "descriptor");
        c0(s0Var, i10);
        p(c10);
    }

    public o40.d o(n40.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        return this;
    }

    public void p(char c10) throws SerializationException {
        d0(Character.valueOf(c10));
    }

    public void q(n40.e eVar, int i10) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "enumDescriptor");
        d0(Integer.valueOf(i10));
    }

    public void r(p40.s0 s0Var, int i10, short s6) throws SerializationException {
        kotlin.jvm.internal.m.e(s0Var, "descriptor");
        c0(s0Var, i10);
        f(s6);
    }

    public void s(n40.e eVar, int i10, float f3) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        c0(eVar, i10);
        l(f3);
    }

    public void t(n40.e eVar, int i10, long j9) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        c0(eVar, i10);
        z(j9);
    }

    public void u(n40.e eVar, int i10, boolean z10) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        c0(eVar, i10);
        h(z10);
    }

    public void v(int i10) throws SerializationException {
        d0(Integer.valueOf(i10));
    }

    public void w(int i10, int i11, n40.e eVar) throws SerializationException {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        c0(eVar, i10);
        v(i11);
    }

    public void x(n40.e eVar, int i10, l40.a aVar, Object obj) {
        kotlin.jvm.internal.m.e(eVar, "descriptor");
        kotlin.jvm.internal.m.e(aVar, "serializer");
        c0(eVar, i10);
        rd.a.z(this, aVar, obj);
    }

    public void y(l40.a aVar, Object obj) {
        kotlin.jvm.internal.m.e(aVar, "serializer");
        aVar.serialize(this, obj);
    }

    public void z(long j9) throws SerializationException {
        d0(Long.valueOf(j9));
    }
}
