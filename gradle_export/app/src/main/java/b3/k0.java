package b3;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import c3.r2;
import c3.z2;

public final class k0 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public k0(Object obj, Object obj2, int i10) {
        super(0);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public k0(kotlin.jvm.internal.z zVar, b2.q qVar, int i10) {
        super(0);
        this.A = i10;
        this.C = zVar;
        this.B = qVar;
    }

    public k0(kotlin.jvm.internal.z zVar, u00.k kVar) {
        super(0);
        this.A = 10;
        this.B = (kotlin.jvm.internal.n) kVar;
        this.C = zVar;
    }

    public final Object invoke() {
        j3.s sVar;
        l0 l0Var;
        h2.c cVar;
        int i10 = this.A;
        int i11 = 1;
        g00.b0 b0Var = g00.b0.a;
        Object obj = this.C;
        Object obj2 = this.B;
        switch (i10) {
            case 0:
                a1.n nVar = ((l0) obj2).f2059g0;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj;
                if ((((b2.q) nVar.G).D & 8) != 0) {
                    for (b2.q qVar = (l2) nVar.F; qVar != null; qVar = qVar.E) {
                        if ((qVar.C & 8) != 0) {
                            ?? E = qVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof j2) {
                                    j2 j2Var = (j2) E;
                                    if (j2Var.Y()) {
                                        j3.o oVar = new j3.o();
                                        zVar.A = oVar;
                                        oVar.D = true;
                                    }
                                    if (j2Var.i1()) {
                                        ((j3.o) zVar.A).C = true;
                                    }
                                    j2Var.m1((j3.a0) zVar.A);
                                } else if ((E.C & 8) != 0 && (E instanceof l)) {
                                    b2.q qVar2 = ((l) E).P;
                                    int i12 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.C & 8) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                E = qVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.F;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                E = m.e(eVar);
                            }
                        }
                    }
                }
                return b0Var;
            case 1:
                i2.q0 q0Var = p1.f2089p0;
                ((u00.k) obj2).invoke(q0Var);
                p1 p1Var = (p1) obj;
                boolean zA = kotlin.jvm.internal.m.a(p1Var.f2099f0, q0Var.M);
                boolean z10 = p1Var.f2100g0;
                boolean z11 = q0Var.N;
                boolean z12 = z10 != z11;
                if (!zA || z12) {
                    p1Var.f2099f0 = q0Var.M;
                    p1Var.f2100g0 = z11;
                    if (p1Var.f2101h0 && (z12 || (z11 && !zA))) {
                        p1Var.O.H();
                    }
                }
                p1Var.f2101h0 = true;
                q0Var.V = q0Var.M.a(q0Var.P, q0Var.R, q0Var.Q);
                return b0Var;
            case 2:
                ((kotlin.jvm.internal.z) obj).A = m.h((b4.w) obj2, z2.j1.f17126a);
                return b0Var;
            case 3:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 4:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case 5:
                c3.f0 f0Var = (c3.f0) obj;
                r2 r2Var = (r2) obj2;
                j3.l lVar = r2Var.E;
                j3.l lVar2 = r2Var.F;
                Float f3 = r2Var.C;
                Float f10 = r2Var.D;
                float fFloatValue = (lVar == null || f3 == null) ? 0.0f : ((Number) lVar.f7938a.invoke()).floatValue() - f3.floatValue();
                float fFloatValue2 = (lVar2 == null || f10 == null) ? 0.0f : ((Number) lVar2.f7938a.invoke()).floatValue() - f10.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = f0Var.A(r2Var.A);
                    j3.t tVar = (j3.t) f0Var.s().b(f0Var.K);
                    if (tVar != null) {
                        try {
                            a5.g gVar = f0Var.M;
                            if (gVar != null) {
                                gVar.f187a.setBoundsInScreen(f0Var.k(tVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    j3.t tVar2 = (j3.t) f0Var.s().b(f0Var.L);
                    if (tVar2 != null) {
                        try {
                            a5.g gVar2 = f0Var.N;
                            if (gVar2 != null) {
                                gVar2.f187a.setBoundsInScreen(f0Var.k(tVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    f0Var.D.invalidate();
                    j3.t tVar3 = (j3.t) f0Var.s().b(iA);
                    if (tVar3 != null && (sVar = tVar3.f7971a) != null && (l0Var = sVar.f7967c) != null) {
                        if (lVar != null) {
                            f0Var.P.i(iA, lVar);
                        }
                        if (lVar2 != null) {
                            f0Var.Q.i(iA, lVar2);
                        }
                        f0Var.w(l0Var);
                    }
                }
                if (lVar != null) {
                    r2Var.C = (Float) lVar.f7938a.invoke();
                }
                if (lVar2 != null) {
                    r2Var.D = (Float) lVar2.f7938a.invoke();
                }
                return b0Var;
            case 6:
                ((c3.a) obj2).removeOnAttachStateChangeListener((z2) obj);
                return b0Var;
            case 7:
                ((f2.c) obj2).Q.invoke((f2.d) obj);
                return b0Var;
            case 8:
                ((kotlin.jvm.internal.z) obj).A = ((g2.a0) obj2).D1();
                return b0Var;
            case 9:
                u00.a aVar = (u00.a) obj2;
                if (aVar != null && (cVar = (h2.c) aVar.invoke()) != null) {
                    return cVar;
                }
                p1 p1Var2 = (p1) obj;
                if (!p1Var2.z1().N) {
                    p1Var2 = null;
                }
                if (p1Var2 != null) {
                    return bi.b.g(0L, kh.n.m0(p1Var2.C));
                }
                return null;
            case 10:
                ((kotlin.jvm.internal.n) obj2).invoke(((kotlin.jvm.internal.z) obj).A);
                return b0Var;
            case 11:
                k5.c cVar2 = (k5.c) obj2;
                cVar2.g().execute(new ji.a(cVar2, (f5.o) obj, 3));
                return b0Var;
            case 12:
                k5.c cVar3 = (k5.c) obj2;
                cVar3.g().execute(new ji.a(cVar3, (kotlin.jvm.internal.z) obj, 4));
                return b0Var;
            case 13:
                k5.c cVar4 = (k5.c) obj2;
                cVar4.g().execute(new k5.b(cVar4, (GetCredentialException) obj, i11));
                return b0Var;
            case 14:
                k5.c cVar5 = (k5.c) obj2;
                cVar5.g().execute(new ji.a(cVar5, (GetCredentialUnknownException) obj, 5));
                return b0Var;
            case 15:
                m5.c cVar6 = (m5.c) obj2;
                cVar6.h().execute(new ji.a(cVar6, (f5.o) obj, 23));
                return b0Var;
            case 16:
                m5.c cVar7 = (m5.c) obj2;
                cVar7.h().execute(new ji.a(cVar7, (kotlin.jvm.internal.z) obj, 24));
                return b0Var;
            case 17:
                m5.c cVar8 = (m5.c) obj2;
                cVar8.h().execute(new m5.b(cVar8, (GetCredentialException) obj, i11));
                return b0Var;
            case TYPE_SINT64_VALUE:
                m5.c cVar9 = (m5.c) obj2;
                cVar9.h().execute(new ji.a(cVar9, (GetCredentialUnknownException) obj, 25));
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                m5.c cVar10 = (m5.c) obj2;
                cVar10.h().execute(new ji.a(cVar10, (GetCredentialUnsupportedException) obj, 26));
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                String str = k50.z.B;
                Context context = (Context) obj2;
                kotlin.jvm.internal.m.d(context, "applicationContext");
                String absolutePath = a10.h0.r(context, ((q5.b) obj).f12764a).getAbsolutePath();
                kotlin.jvm.internal.m.d(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
                return gj.e.i(absolutePath, false);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                kotlin.jvm.internal.m.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                Context context2 = (Context) obj2;
                kotlin.jvm.internal.m.d(context2, "applicationContext");
                return k00.f.O(context2, (String) ((rv.p) obj).a);
            default:
                ((v2.c) obj2).d((b2.q) obj);
                return b0Var;
        }
    }
}
