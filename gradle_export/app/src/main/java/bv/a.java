package bv;

import android.content.res.Configuration;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(13), 115078047, false);

    public static final void a(o1 o1Var, u00.k kVar, l1.j jVar, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        l1.g0 g0Var;
        int i5;
        int iIntValue;
        boolean z2;
        Object objN;
        boolean z3;
        Object objN2;
        o1 uiState = o1Var;
        u00.k onAction = kVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        su.c cVar = uiState.W;
        u30.b bVar = uiState.E;
        yu.g gVar = uiState.t;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1349041215);
        int i6 = (i & 6) == 0 ? i | (g0Var2.g(uiState) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i6 |= g0Var2.i(onAction) ? 32 : 16;
        }
        int i7 = i6;
        if (g0Var2.S(i7 & 1, (i7 & 19) != 18)) {
            kk.c cVarD = kk.e.d(g0Var2);
            d00.u0 u0Var = d00.u0.C;
            Object objN3 = g0Var2.N();
            Object obj = l1.i.a;
            if (objN3 == obj) {
                objN3 = new d00.x0();
                g0Var2.n0(objN3);
            }
            d00.x0 x0Var = (d00.x0) objN3;
            x0Var.getClass();
            x0Var.a.setValue(u0Var);
            sg.f fVar = cm.a.A;
            Configuration configuration = (Configuration) g0Var2.k(c3.o0.a);
            fVar.getClass();
            boolean z4 = sg.f.J(configuration) == cm.a.B;
            c3.l2 l2VarU = c3.m0.u(g0Var2);
            boolean z5 = uiState.Q && uiState.x;
            l1.p2 p2VarB = x.d.b(z5 ? 0.0f : 1.0f, gv.p.J(), (String) null, g0Var2, 0, 28);
            l1.p2 p2VarA = w.b2.a(i2.t.b(0.7f, dl.a.P), (x.y) null, (String) null, g0Var2, 0, 14);
            h0.a0 a0Var = h0.z1.c;
            b2.r rVarA = u2.f.a(a0Var, l2VarU, (u2.d) null);
            int i8 = i7 & 112;
            boolean z6 = i8 == 32;
            Object objN4 = g0Var2.N();
            if (z6 || objN4 == obj) {
                objN4 = new n1(0, onAction);
                g0Var2.n0(objN4);
            }
            g00.b0 b0Var = g00.b0.a;
            b2.r rVarB = v2.f0.b(rVarA, b0Var, (PointerInputEventHandler) objN4);
            b2.i iVar = b2.b.A;
            boolean z7 = z5;
            z2.w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var2);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar2);
            } else {
                g0Var2.q0();
            }
            b3.f fVar2 = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar2);
            b3.f fVar3 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar4);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar5 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar5);
            b2.r rVarA2 = kk.e.a(a0Var, cVarD);
            kotlin.jvm.internal.m.e(rVarA2, "<this>");
            gv.p.f(uiState.m, uiState.C, rVarA2.V(new d00.v0(x0Var)), z7, g0Var2, 0);
            b2.r rVarP = z.n.p(a0Var, z.n.l(g0Var2), false, 14);
            boolean z8 = i8 == 32;
            Object objN5 = g0Var2.N();
            if (z8 || objN5 == obj) {
                objN5 = new n1(1, onAction);
                g0Var2.n0(objN5);
            }
            h0.o.a(v2.f0.b(rVarP, b0Var, (PointerInputEventHandler) objN5), g0Var2, 0);
            float f = 22;
            b2.r rVarG = h0.c.G(a0Var, f, gVar == yu.g.D ? 0 : 32, f, 0.0f, 8);
            z2.w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar2);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD2, g0Var2, fVar2);
            l1.q.I(m1VarM2, g0Var2, fVar3);
            a1.b.v(iHashCode2, g0Var2, fVar4, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar5);
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 0) {
                i3 = 2;
                z = true;
                i4 = 32;
                g0Var2.c0(-566034476);
                uiState = o1Var;
                onAction = kVar;
                gv.z1.c(uiState, onAction, cVarD, x0Var, ((i2.t) p2VarA.getValue()).a, g0Var2, i7 & 126);
                g0Var = g0Var2;
                g0Var.r(false);
            } else if (iOrdinal == 1) {
                z = true;
                g0Var = g0Var2;
                i3 = 2;
                i4 = 32;
                g0Var.c0(-566023797);
                uiState = o1Var;
                onAction = kVar;
                gv.p.H(uiState, onAction, cVarD, x0Var, g0Var, i7 & 126);
                g0Var.r(false);
            } else if (iOrdinal == 2) {
                z = true;
                g0Var = g0Var2;
                i4 = 32;
                i3 = 2;
                g0Var.c0(-566043167);
                uiState = o1Var;
                onAction = kVar;
                gv.v1.c(uiState, onAction, cVarD, x0Var, g0Var, i7 & 126);
                g0Var.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw oi.k.r(g0Var2, -566054938, false);
                }
                g0Var2.c0(-566053483);
                i4 = 32;
                uiState = o1Var;
                z = true;
                i3 = 2;
                gv.n1.d(uiState, onAction, cVarD, x0Var, ((i2.t) p2VarA.getValue()).a, g0Var2, i7 & 126);
                g0Var = g0Var2;
                g0Var.r(false);
                onAction = kVar;
            }
            g0Var.r(z);
            boolean z9 = uiState.d0;
            b2.i iVar2 = b2.b.B;
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            b2.r rVarA3 = sVar.a(oVar, iVar2);
            WeakHashMap weakHashMap = h0.m2.w;
            float f2 = 24;
            b2.r rVarG2 = h0.c.G(h0.c.L(rVarA3, h0.b.e(g0Var).o), f2, 8, f2, 0.0f, 8);
            x.b1 b1VarJ = gv.p.J();
            Object objN6 = g0Var.N();
            if (objN6 == r4) {
                objN6 = new a1.s0(26);
                g0Var.n0(objN6);
            }
            w.x0 x0VarA = w.s0.j((u00.k) objN6, b1VarJ).a(w.s0.c(gv.p.J(), i3));
            x.b1 b1VarJ2 = gv.p.J();
            Object objN7 = g0Var.N();
            if (objN7 == r4) {
                objN7 = new a1.s0(27);
                g0Var.n0(objN7);
            }
            l1.g0 g0Var3 = g0Var;
            i2 = 0;
            int i9 = i3;
            int i11 = i4;
            w.c0.c(z9, rVarG2, x0VarA, w.s0.l((u00.k) objN7, b1VarJ2).a(w.s0.d(gv.p.J(), i3)), (String) null, a, g0Var3, 196608, 16);
            b2.r rVarA4 = sVar.a(oVar, iVar2);
            boolean zG = g0Var3.g(p2VarB);
            Object objN8 = g0Var3.N();
            if (zG || objN8 == obj) {
                objN8 = new k1(p2VarB, 0);
                g0Var3.n0(objN8);
            }
            kl.a.a(i2.b0.p(rVarA4, (u00.k) objN8), gVar == yu.g.A, g0Var3, 0, 0);
            g0Var3.r(true);
            if (uiState.R && z4) {
                g0Var3.c0(-1273102996);
                gv.p.k(uiState, onAction, g0Var3, i7 & 126);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1272990559);
                g0Var3.r(false);
            }
            yu.a aVar = uiState.Z;
            if (aVar == null || !z4) {
                g0Var3.c0(-1272701887);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1272882555);
                iv.n.c(aVar, uiState.b(), onAction, g0Var3, (i7 << 3) & 896);
                g0Var3.r(false);
            }
            if (uiState.S) {
                g0Var3.c0(-1272641592);
                boolean z11 = i8 == i11;
                Object objN9 = g0Var3.N();
                if (z11 || objN9 == obj) {
                    objN9 = new bt.t0(i9, onAction);
                    g0Var3.n0(objN9);
                }
                gv.p.e((u00.a) objN9, g0Var3, 0);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1272494559);
                g0Var3.r(false);
            }
            if (uiState.T) {
                g0Var3.c0(-1272442696);
                boolean z12 = r2 == i11;
                Object objN10 = g0Var3.N();
                if (z12 || objN10 == obj) {
                    objN10 = new bt.t0(3, onAction);
                    g0Var3.n0(objN10);
                }
                gv.p.w((u00.a) objN10, g0Var3, 0);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1272311039);
                g0Var3.r(false);
            }
            ot.e eVar2 = uiState.U;
            if (eVar2 == null) {
                g0Var3.c0(-1272264943);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1272264942);
                boolean z13 = r2 == i11;
                Object objN11 = g0Var3.N();
                if (z13 || objN11 == obj) {
                    objN11 = new bt.t0(4, onAction);
                    g0Var3.n0(objN11);
                }
                gv.p.F(eVar2, (u00.a) objN11, g0Var3, 0);
                g0Var3.r(false);
            }
            if (uiState.V) {
                g0Var3.c0(-1272027141);
                boolean zG2 = g0Var3.g(bVar) | g0Var3.g(cVar != null ? cVar.a : null);
                Object objN12 = g0Var3.N();
                if (zG2 || objN12 == obj) {
                    su.b bVar2 = cVar != null ? cVar.a : null;
                    ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
                    Iterator<E> it = bVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ot.a) it.next()).a));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        int iIntValue2 = ((Number) obj2).intValue();
                        if (bVar2 != null) {
                            int i12 = bVar2.a;
                            if (iIntValue2 > new z00.e(i12, bVar2.b, 1).B || i12 > iIntValue2) {
                            }
                        }
                        arrayList2.add(obj2);
                    }
                    objN12 = g4.d0(arrayList2);
                    g0Var3.n0(objN12);
                }
                u30.b bVar3 = (u30.b) objN12;
                String strU = z3.U(g0Var3, 2131887059);
                String strU2 = z3.U(g0Var3, 2131887058);
                PlayerItem playerItem = uiState.f;
                int surahNumber = playerItem != null ? playerItem.getSurahNumber() : 1;
                Integer num = uiState.F;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                } else {
                    Integer num2 = (Integer) h00.q.N0(bVar3);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        i5 = 1;
                    }
                    yu.g gVar3 = uiState.t;
                    if (r2 == i11) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objN = g0Var3.N();
                    if (z2 || objN == obj) {
                        objN = new bt.t0(5, onAction);
                        g0Var3.n0(objN);
                    }
                    u00.a aVar2 = (u00.a) objN;
                    z3 = r2 == i11;
                    objN2 = g0Var3.N();
                    if (z3 || objN2 == obj) {
                        objN2 = new as.d0(6, onAction);
                        g0Var3.n0(objN2);
                    }
                    gv.p.b(strU, strU2, surahNumber, bVar3, i5, gVar3, aVar2, (u00.k) objN2, false, g0Var3, 6);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                }
                i5 = iIntValue;
                yu.g gVar4 = uiState.t;
                if (r2 == i11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN = g0Var3.N();
                if (z2) {
                    objN = new bt.t0(5, onAction);
                    g0Var3.n0(objN);
                } else {
                    objN = new bt.t0(5, onAction);
                    g0Var3.n0(objN);
                }
                u00.a aVar3 = (u00.a) objN;
                if (r2 == i11) {
                }
                objN2 = g0Var3.N();
                if (z3) {
                    objN2 = new as.d0(6, onAction);
                    g0Var3.n0(objN2);
                } else {
                    objN2 = new as.d0(6, onAction);
                    g0Var3.n0(objN2);
                }
                gv.p.b(strU, strU2, surahNumber, bVar3, i5, gVar4, aVar3, (u00.k) objN2, false, g0Var3, 6);
                g0Var2 = g0Var3;
                g0Var2.r(false);
            } else {
                g0Var2 = g0Var3;
                g0Var2.c0(-1271068063);
                g0Var2.r(false);
            }
        } else {
            i2 = 0;
            g0Var2.V();
        }
        l1.r1 r1VarT = g0Var2.t();
        if (r1VarT != null) {
            r1VarT.d = new l1(uiState, onAction, i, i2);
        }
    }
}
