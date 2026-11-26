package ca;

import a1.e1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.RenderEffect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.inputmethod.ExtractedText;
import c3.o0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.f1;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.x2;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.security.Obfuscated;
import g1.m6;
import g1.t4;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import l1.m1;
import l1.q2;
import l1.r1;
import m3.n0;
import m3.q0;
import m3.r0;
import qd.s0;

public abstract class v {
    public static long A(double d3) {
        ta.c0.r("not a normal value", C(d3));
        int exponent = Math.getExponent(d3);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static final f4 B(n0 n0Var, int i10, int i11, int i12, long j9, boolean z10, boolean z11) {
        e1.u uVar;
        if (z10) {
            uVar = null;
        } else {
            int i13 = q0.f10519c;
            int i14 = (int) (j9 >> 32);
            int i15 = (int) (4294967295L & j9);
            uVar = new e1.u(new e1.t(c7.i.E(n0Var, i14), i14, 1L), new e1.t(c7.i.E(n0Var, i15), i15, 1L), q0.h(j9));
        }
        return new f4(1, uVar, new androidx.media3.common.k(i10, i11, i12, n0Var), z11);
    }

    public static boolean C(double d3) {
        return Math.getExponent(d3) <= 1023;
    }

    public static boolean D(byte b7) {
        return b7 > -65;
    }

    public static final b2.r E(int i10, l1.j jVar, boolean z10) {
        b2.r rVarH;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(1550141676);
        b2.o oVar = b2.o.A;
        if (z10) {
            rVarH = c7.i.H(z1.x(z1.d(oVar, 1.0f), i10 == 3 ? b2.b.N : b2.b.M, 2), true, p0.f.a(6));
        } else {
            rVarH = z1.d(oVar, 1.0f);
        }
        g0Var.r(false);
        return rVarH;
    }

    public static final a20.e F(oj.q qVar, e20.b bVar) {
        kotlin.jvm.internal.m.e(qVar, "<this>");
        kotlin.jvm.internal.m.e(bVar, "annotationsOwner");
        return new a20.e(qVar, bVar, false);
    }

    public static d9.g G(d9.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (d9.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                d9.g gVar2 = new d9.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((d9.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((d9.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((d9.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static final ExtractedText H(r3.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f13099a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j9 = wVar.f13100b;
        extractedText.selectionStart = q0.g(j9);
        extractedText.selectionEnd = q0.f(j9);
        extractedText.flags = !r30.k.B0(wVar.f13099a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void I(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int J(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static Bundle K(g1 g1Var, x2 x2Var) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("REQUEST_METADATA", g1Var.b());
        bundle.putByteArray("REQUEST_PARAMS", x2Var.b());
        return bundle;
    }

    public static String L(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(N(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(N(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static g1 M(Context context) {
        String strValueOf;
        f1 f1VarR = g1.r();
        f1VarR.c();
        g1.v((g1) f1VarR.B);
        f1VarR.c();
        g1.w((g1) f1VarR.B);
        String packageName = context.getPackageName();
        f1VarR.c();
        g1.t((g1) f1VarR.B, packageName);
        f1VarR.c();
        g1.u((g1) f1VarR.B);
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            com.google.android.gms.internal.play_billing.q.h("DelegationApiParamsBuilder", "No version code is found!");
            strValueOf = null;
        }
        if (strValueOf != null) {
            f1VarR.c();
            g1.s((g1) f1VarR.B, strValueOf);
        }
        return (g1) f1VarR.a();
    }

    public static String N(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strL = w.c.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strL.length() + 8 + name2.length() + 1);
            a1.b.z(sb2, "<", strL, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final void a(boolean z10, u00.k kVar, u00.a aVar, m6 m6Var, l1.j jVar, int i10) {
        l1.g0 g0Var;
        r1 r1VarT;
        sp.a aVar2;
        kotlin.jvm.internal.m.e(kVar, "onMethodClicked");
        kotlin.jvm.internal.m.e(aVar, "onDismiss");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1847061802);
        int i11 = i10 | (g0Var2.h(z10) ? 4 : 2) | (g0Var2.i(kVar) ? 32 : 16) | (g0Var2.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.g(m6Var) ? 2048 : 1024);
        if (g0Var2.S(i11 & 1, (i11 & 1171) != 1170)) {
            g0Var2.X();
            if ((i10 & 1) != 0 && !g0Var2.A()) {
                g0Var2.V();
            }
            g0Var2.s();
            if (z10) {
                Object objN = g0Var2.N();
                l1.c cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = l1.q.o(g0Var2);
                    g0Var2.n0(objN);
                }
                a40.z zVar = (a40.z) objN;
                boolean zI = ((((i11 & 7168) ^ 3072) > 2048 && g0Var2.g(m6Var)) || (i11 & 3072) == 2048) | g0Var2.i(zVar) | ((i11 & 896) == 256);
                Object objN2 = g0Var2.N();
                if (zI || objN2 == cVar) {
                    objN2 = new cz.c(zVar, m6Var, aVar, 14);
                    g0Var2.n0(objN2);
                }
                g0Var = g0Var2;
                t4.a((u00.a) objN2, null, m6Var, 0.0f, false, null, dl.a.q, 0L, 0.0f, 0L, null, new qs.c(25), null, v1.d.d(863648264, new sp.b(0, kVar, z10), g0Var2), g0Var, (i11 >> 3) & 896, 3078, 5050);
            } else {
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                } else {
                    aVar2 = new sp.a(z10, kVar, aVar, m6Var, i10, 0);
                }
            }
            r1VarT.f9921d = aVar2;
        }
        g0Var = g0Var2;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            aVar2 = new sp.a(z10, kVar, aVar, m6Var, i10, 1);
            r1VarT.f9921d = aVar2;
        }
    }

    public static final void b(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2146769268);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, rr.a.class, aVarA, null, g0Var);
            }
            rr.a aVar = (rr.a) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, rr.b.class, aVarA2, null, g0Var);
            }
            rr.b bVar = (rr.b) objN2;
            h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("HOME_SCOPE_KEY", new b60.b("HOME_SCOPE_KEY")), g0Var);
            Object objU0 = h00.q.U0(bVar.b);
            boolean zI = g0Var.i(bVar) | g0Var.g(aVar);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar) {
                objN3 = new lu.w(bVar, aVar, (k00.c) null, 21);
                g0Var.n0(objN3);
            }
            l1.q.i(objU0, g0Var, (u00.n) objN3);
            z1.p pVar = bVar.b;
            h0.a0 a0Var = z1.f6478c;
            boolean zI2 = g0Var.i(bVar);
            Object objN4 = g0Var.N();
            if (zI2 || objN4 == cVar) {
                pi.c cVar2 = new pi.c(0, bVar, rr.b.class, "navigateBack", "navigateBack()V", 0, 14);
                g0Var.n0(cVar2);
                objN4 = cVar2;
            }
            List listS = va.a.S(bi.b.N(g0Var), p30.f.o0(g0Var));
            q2 q2Var = cq.l.a;
            p30.f.O(pVar, a0Var, (b2.d) null, (a10.g) objN4, listS, (sg.f) null, (u00.k) null, (u00.k) null, (u00.n) null, new e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new wy.k(i10, 2);
        }
    }

    public static final void c(float f3, int i10, b2.r rVar, bx.c cVar, l1.j jVar, u00.a aVar, ys.f fVar, boolean z10) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(aVar, "onStartListeningClicked");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1388806534);
        int i11 = (g0Var.g(fVar) ? 4 : 2) | i10 | (g0Var.i(cVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(rVar) ? 2048 : 1024) | (g0Var.d(f3) ? 16384 : 8192) | (g0Var.h(z10) ? 131072 : Cast.MAX_MESSAGE_LENGTH);
        if (!g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            g0Var.V();
        } else if (((gm.a) g0Var.k(dl.e.a)) == gm.a.A) {
            g0Var.c0(515859440);
            e(fVar, cVar, aVar, z10, rVar, g0Var, ((i11 << 3) & 57344) | (i11 & 14) | 64 | (i11 & 112) | (i11 & 896) | ((i11 >> 6) & 7168));
            g0Var = g0Var;
            g0Var.r(false);
        } else {
            g0Var.c0(516132984);
            int i12 = i11 >> 3;
            d(f3, (i11 & 14) | 64 | (i11 & 112) | (i11 & 896) | (i12 & 7168) | (i12 & 57344) | ((i11 << 6) & 458752), rVar, cVar, g0Var, aVar, fVar, z10);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.x(f3, i10, rVar, cVar, aVar, fVar, z10);
        }
    }

    public static final void d(float f3, int i10, b2.r rVar, bx.c cVar, l1.j jVar, u00.a aVar, ys.f fVar, boolean z10) throws NoWhenBranchMatchedException {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(247879471);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(cVar) : g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.d(f3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.h(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.g(rVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            b2.r rVarD = z1.d(rVar, 1.0f);
            int iA = y3.f.a(f3, 310);
            b2.o oVar = b2.o.A;
            b2.r rVarV = rVarD.V(iA > 0 ? z1.e(oVar, f3) : oVar);
            float f10 = 24;
            b2.r rVarC = h0.c.C(z.n.f(f2.h.c(rVarV, p0.f.a(f10)), i2.t.b(0.08f, dl.a.i), i2.b0.f7111b), 16);
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(f10), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar2 = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f2039f;
            l1.q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var, fVar5);
            String str = fVar != null ? fVar.d : null;
            String str2 = RuntimeVersion.SUFFIX;
            if (str == null) {
                str = RuntimeVersion.SUFFIX;
            }
            int i12 = (i11 >> 3) & 7168;
            int i13 = i11;
            f(str, 148, fVar == null, z10, g0Var, i12 | 48);
            b2.r rVarD2 = z1.d(oVar, 1.0f);
            h0.v vVarA2 = h0.u.a(h0.i.g(8), gVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar5);
            String str3 = fVar != null ? fVar.c : null;
            if (str3 != null) {
                str2 = str3;
            }
            int i14 = (i13 >> 6) & 896;
            g(str2, 3, z10, 2, g0Var, i14 | 3072, 0);
            h(fVar, 3, z10, g0Var, i14 | (i13 & 14));
            g0Var.r(true);
            if (!(((double) 1.0f) > 0.0d)) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            if (fVar != null || z10) {
                g0Var.c0(1766697270);
                j(fVar != null ? Integer.valueOf(fVar.b) : null, cVar != null ? Integer.valueOf(cVar.a) : null, aVar, z10, null, g0Var, (i13 & 896) | i12, 16);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(1766950013);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.s(f3, i10, rVar, cVar, aVar, fVar, z10);
        }
    }

    public static final void e(ys.f fVar, bx.c cVar, u00.a aVar, boolean z10, b2.r rVar, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        int i11;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1990193687);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(cVar) : g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        int i12 = i11;
        if (g0Var.S(i12 & 1, (i12 & 9363) != 9362)) {
            float f3 = 24;
            float f10 = 16;
            b2.r rVarC = h0.c.C(z.n.e(f2.h.c(z1.d(rVar, 1.0f), p0.f.c(f3, f3, 0.0f, 0.0f, 12)), sg.f.P(va.a.S(new i2.t(dl.a.t), new i2.t(i2.t.b(0.5f, dl.a.L)), new i2.t(i2.t.f7166f)), 0.0f, 0.0f, 14), null, 6), f10);
            v1 v1VarA = t1.a(h0.i.g(f10), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var, fVar5);
            if (!(((double) 1.0f) > 0.0d)) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            float f11 = 8;
            h0.v vVarA = h0.u.a(h0.i.g(f11), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar5);
            String str = fVar != null ? fVar.c : null;
            int i13 = (i12 >> 3) & 896;
            g(str == null ? RuntimeVersion.SUFFIX : str, 5, z10, 0, g0Var, i13, 8);
            h(fVar, 5, z10, g0Var, (i12 & 14) | i13);
            if (fVar != null || z10) {
                g0Var.c0(802385969);
                j(fVar != null ? Integer.valueOf(fVar.b) : null, cVar != null ? Integer.valueOf(cVar.a) : null, aVar, z10, h0.c.G(b2.o.A, 0.0f, f11, 0.0f, 0.0f, 13), g0Var, (i12 & 896) | 24576 | (i12 & 7168), 0);
                g0Var = g0Var;
                z11 = false;
                g0Var.r(false);
            } else {
                g0Var.c0(802724241);
                z11 = false;
                g0Var.r(false);
            }
            g0Var.r(true);
            String str2 = fVar != null ? fVar.d : null;
            f(str2 == null ? RuntimeVersion.SUFFIX : str2, 120, fVar == null ? true : z11, z10, g0Var, (i12 & 7168) | 48);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.r(fVar, cVar, aVar, z10, rVar, i10);
        }
    }

    public static final void f(String str, float f3, boolean z10, boolean z11, l1.j jVar, int i10) {
        int i11;
        r1 r1VarT;
        ct.v vVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-159246185);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.d(f3) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(z11) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            b2.o oVar = b2.o.A;
            if (z11) {
                g0Var.c0(1835902294);
                h0.o.a(c7.i.H(z1.m(oVar, f3), true, p0.f.f12243a), g0Var, 0);
                g0Var.r(false);
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                } else {
                    vVar = new ct.v(str, f3, z10, z11, i10, 0);
                }
            } else {
                g0Var.c0(1836076235);
                g0Var.r(false);
                if (z10) {
                    g0Var.c0(1836108506);
                    h0.o.a(z.n.f(f2.h.c(z1.m(oVar, f3), p0.f.f12243a), i2.t.b(0.12f, dl.a.i), i2.b0.f7111b), g0Var, 0);
                    g0Var.r(false);
                    r1VarT = g0Var.t();
                    if (r1VarT == null) {
                        return;
                    } else {
                        vVar = new ct.v(str, f3, z10, z11, i10, 1);
                    }
                } else {
                    g0Var.c0(1836309355);
                    g0Var.r(false);
                    wb.h hVar = new wb.h((Context) g0Var.k(o0.f2722b));
                    hVar.f15918c = str.length() > 0 ? str : null;
                    mb.j jVarI = mb.l.i(w.c.q(hVar, MediaError.DetailedErrorCode.TEXT_UNKNOWN), null, g0Var, 0, 62);
                    z.n.c(jVarI, null, rd.a.g0(f3, 0, dl.a.s, f2.h.c(z1.m(oVar, f3), p0.f.f12243a), !(jVarI.j() instanceof mb.g)), null, z2.o.f17145a, 0.0f, g0Var, 24624, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                }
            }
            r1VarT.f9921d = vVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            vVar = new ct.v(str, f3, z10, z11, i10, 2);
            r1VarT.f9921d = vVar;
        }
    }

    public static final void g(String str, int i10, boolean z10, int i11, l1.j jVar, int i12, int i13) {
        String str2;
        int i14;
        int i15;
        boolean z11;
        l1.g0 g0Var;
        int i16;
        r1 r1VarT;
        int i17;
        String str3;
        int i18;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(863359320);
        if ((i12 & 6) == 0) {
            str2 = str;
            i14 = (g0Var2.g(str2) ? 4 : 2) | i12;
        } else {
            str2 = str;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= g0Var2.e(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= g0Var2.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i19 = i13 & 8;
        if (i19 == 0) {
            if ((i12 & 3072) == 0) {
                i15 = i11;
                i14 |= g0Var2.e(i15) ? 2048 : 1024;
            }
            if ((i14 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var2.S(i14 & 1, z11)) {
                if (i19 != 0) {
                    i17 = 1;
                } else {
                    i17 = i15;
                }
                if (z10) {
                    str3 = "Abdulbasit Abdulsamad";
                } else if (r30.k.L0(str2)) {
                    str3 = "—";
                } else {
                    str3 = str2;
                }
                long jZ = kh.o.z(18);
                long jZ2 = kh.o.z(18);
                q3.u uVar = q3.u.M;
                long j9 = dl.a.n;
                if (z10) {
                    i18 = 1;
                } else {
                    i18 = i17;
                }
                g0Var = g0Var2;
                k00.f.a(str3, E(i10, g0Var2, z10), j9, jZ, new y3.o(jZ2), uVar, new x3.k(i10), i18, 0.0f, (r0) null, g0Var, ((i14 << 15) & 3670016) | 224256, 768);
                i16 = i17;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                i16 = i15;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new ct.t(str2, i10, z10, i16, i12, i13);
            }
        }
        i14 |= 3072;
        i15 = i11;
        if ((i14 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var2.S(i14 & 1, z11)) {
            if (i19 != 0) {
                i17 = 1;
            } else {
                i17 = i15;
            }
            if (z10) {
                str3 = "Abdulbasit Abdulsamad";
            } else if (r30.k.L0(str2)) {
                str3 = "—";
            } else {
                str3 = str2;
            }
            long jZ3 = kh.o.z(18);
            long jZ4 = kh.o.z(18);
            q3.u uVar2 = q3.u.M;
            long j10 = dl.a.n;
            if (z10) {
                i18 = 1;
            } else {
                i18 = i17;
            }
            g0Var = g0Var2;
            k00.f.a(str3, E(i10, g0Var2, z10), j10, jZ3, new y3.o(jZ4), uVar2, new x3.k(i10), i18, 0.0f, (r0) null, g0Var, ((i14 << 15) & 3670016) | 224256, 768);
            i16 = i17;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            i16 = i15;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.t(str2, i10, z10, i16, i12, i13);
        }
    }

    public static final void h(ys.f fVar, int i10, boolean z10, l1.j jVar, int i11) {
        int i12;
        l1.g0 g0Var;
        int i13;
        int i14;
        String strO;
        String strT;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1703591751);
        if ((i11 & 6) == 0) {
            i12 = (g0Var2.g(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= g0Var2.e(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= g0Var2.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var2.S(i12 & 1, (i12 & 147) != 146)) {
            if (z10) {
                i13 = 85;
            } else {
                i13 = fVar != null ? fVar.e : 0;
            }
            if (z10) {
                i14 = 12;
            } else {
                i14 = fVar != null ? fVar.f : 0;
            }
            if (i13 > 0) {
                g0Var2.c0(-1926331559);
                String strT2 = z3.T(2131886608, new Object[]{Integer.valueOf(i13)}, g0Var2);
                if (i14 == 1) {
                    strT = oi.k.o(g0Var2, 1390507985, 2131886610, g0Var2, false);
                } else {
                    g0Var2.c0(1390584648);
                    strT = z3.T(2131886611, new Object[]{Integer.valueOf(i14)}, g0Var2);
                    g0Var2.r(false);
                }
                strO = z3.T(2131886609, new Object[]{strT2, strT}, g0Var2);
                g0Var2.r(false);
            } else {
                strO = oi.k.o(g0Var2, -1926259856, 2131886607, g0Var2, false);
            }
            g0Var = g0Var2;
            String str = strO;
            k00.f.a(str, E(i10, g0Var2, z10), i2.t.b(0.5f, dl.a.k), kh.o.z(12), new y3.o(kh.o.z(12)), q3.u.J, new x3.k(i10), 2, 0.0f, (r0) null, g0Var, ((i12 << 15) & 3670016) | 12807168, 768);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.u(fVar, i10, z10, i11);
        }
    }

    public static final long i(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void j(Integer num, Integer num2, u00.a aVar, boolean z10, b2.r rVar, l1.j jVar, int i10, int i11) throws NoWhenBranchMatchedException {
        int i12;
        b2.r rVar2;
        boolean z11;
        b2.r rVar3;
        r1 r1VarT;
        b2.o oVar;
        gm.a aVar2;
        boolean zA;
        boolean zE;
        Object objN;
        int i13;
        int iOrdinal;
        b2.r rVarD;
        b2.r rVarN;
        b3.g gVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(815320062);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.g(num) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var.g(num2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.h(z10) ? 2048 : 1024;
        }
        int i14 = i11 & 16;
        if (i14 == 0) {
            if ((i10 & 24576) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 16384 : 8192;
            }
            if ((i12 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i12 & 1, z11)) {
                oVar = b2.o.A;
                if (i14 != 0) {
                    rVar3 = oVar;
                } else {
                    rVar3 = rVar2;
                }
                aVar2 = (gm.a) g0Var.k(dl.e.a);
                zA = kotlin.jvm.internal.m.a(num2, num);
                zE = g0Var.e(aVar2.ordinal()) | g0Var.h(zA);
                objN = g0Var.N();
                if (zE || objN == l1.i.f9868a) {
                    if (zA) {
                        iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 0) {
                            i13 = 2131886239;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i13 = 2131886366;
                        }
                    } else {
                        i13 = 2131887296;
                    }
                    objN = Integer.valueOf(i13);
                    g0Var.n0(objN);
                }
                int iIntValue = ((Number) objN).intValue();
                if (aVar2 == gm.a.B) {
                    rVarD = z1.d(z1.e(oVar, 48), 1.0f);
                } else {
                    rVarD = oVar;
                }
                float f3 = 32;
                b2.r rVarF = z.n.f(f2.h.c(c7.i.H(rVar3.V(rVarD), z10, p0.f.a(f3)), p0.f.a(f3)), dl.a.i, i2.b0.f7111b);
                if (z10) {
                    rVarN = oVar;
                } else {
                    rVarN = w50.c.n(oVar, true, aVar);
                }
                b2.r rVarD2 = h0.c.D(rVarF.V(rVarN), 16, 9);
                b2.h hVar = b2.b.K;
                h0.b bVar = h0.i.f6406a;
                v1 v1VarA = t1.a(h0.i.h(8, b2.b.N), hVar, g0Var, 54);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarD2, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC, g0Var, b3.h.f2037d);
                b2.r rVarM = z1.m(oVar, 10);
                m2.b bVarR = y3.R(2131231358, g0Var, 0);
                long j9 = dl.a.L;
                z3.j(bVarR, null, rVarM, j9, g0Var, 440, 0);
                k00.f.a(z3.U(g0Var, iIntValue), (b2.r) null, j9, kh.o.z(14), new y3.o(kh.o.z(14)), q3.u.D, (x3.k) null, 1, 0.0f, (r0) null, g0Var, 12807168, 834);
                g0Var = g0Var;
                g0Var.r(true);
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new ct.w(num, num2, aVar, z10, rVar3, i10, i11);
            }
        }
        i12 |= 24576;
        rVar2 = rVar;
        if ((i12 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var.S(i12 & 1, z11)) {
            oVar = b2.o.A;
            if (i14 != 0) {
                rVar3 = oVar;
            } else {
                rVar3 = rVar2;
            }
            aVar2 = (gm.a) g0Var.k(dl.e.a);
            zA = kotlin.jvm.internal.m.a(num2, num);
            zE = g0Var.e(aVar2.ordinal()) | g0Var.h(zA);
            objN = g0Var.N();
            if (zE) {
                if (zA) {
                    iOrdinal = aVar2.ordinal();
                    if (iOrdinal == 0) {
                        i13 = 2131886239;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i13 = 2131886366;
                    }
                } else {
                    i13 = 2131887296;
                }
                objN = Integer.valueOf(i13);
                g0Var.n0(objN);
            } else {
                if (zA) {
                    iOrdinal = aVar2.ordinal();
                    if (iOrdinal == 0) {
                        i13 = 2131886239;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i13 = 2131886366;
                    }
                } else {
                    i13 = 2131887296;
                }
                objN = Integer.valueOf(i13);
                g0Var.n0(objN);
            }
            int iIntValue2 = ((Number) objN).intValue();
            if (aVar2 == gm.a.B) {
                rVarD = z1.d(z1.e(oVar, 48), 1.0f);
            } else {
                rVarD = oVar;
            }
            float f10 = 32;
            b2.r rVarF2 = z.n.f(f2.h.c(c7.i.H(rVar3.V(rVarD), z10, p0.f.a(f10)), p0.f.a(f10)), dl.a.i, i2.b0.f7111b);
            if (z10) {
                rVarN = oVar;
            } else {
                rVarN = w50.c.n(oVar, true, aVar);
            }
            b2.r rVarD3 = h0.c.D(rVarF2.V(rVarN), 16, 9);
            b2.h hVar2 = b2.b.K;
            h0.b bVar2 = h0.i.f6406a;
            v1 v1VarA2 = t1.a(h0.i.h(8, b2.b.N), hVar2, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD3, g0Var);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            b2.r rVarM2 = z1.m(oVar, 10);
            m2.b bVarR2 = y3.R(2131231358, g0Var, 0);
            long j10 = dl.a.L;
            z3.j(bVarR2, null, rVarM2, j10, g0Var, 440, 0);
            k00.f.a(z3.U(g0Var, iIntValue2), (b2.r) null, j10, kh.o.z(14), new y3.o(kh.o.z(14)), q3.u.D, (x3.k) null, 1, 0.0f, (r0) null, g0Var, 12807168, 834);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.w(num, num2, aVar, z10, rVar3, i10, i11);
        }
    }

    public static final void k(int i10, b2.r rVar, String str, l1.j jVar, boolean z10) {
        l1.g0 g0Var;
        b2.r rVar2;
        String str2 = str;
        kotlin.jvm.internal.m.e(str2, "highlightText");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-701764100);
        int i11 = i10 | (g0Var2.g(str2) ? 4 : 2) | (g0Var2.h(z10) ? 32 : 16) | 384;
        if (g0Var2.S(i11 & 1, (i11 & 147) != 146)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.N, g0Var2, 48);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.f2040g);
            l1.q.E(g0Var2, b3.h.f2041h);
            l1.q.I(rVarC, g0Var2, b3.h.f2037d);
            if (z10) {
                g0Var2.c0(-153582295);
                String strU = z3.U(g0Var2, 2131886518);
                long jZ = kh.o.z(20);
                long jZ2 = kh.o.z(20);
                q3.u uVar = q3.u.D;
                long j9 = dl.a.k;
                z6.b(strU, null, j9, jZ, uVar, null, 0L, null, new x3.k(3), jZ2, 0, false, 0, 0, null, null, g0Var2, 1597440, 48, 258986);
                h0.c.h(z1.e(oVar, 8), g0Var2);
                z6.b(str2, null, dl.a.C, kh.o.z(20), uVar, null, 0L, null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, null, null, g0Var2, (i11 & 14) | 1597440, 48, 258986);
                h0.c.h(z1.e(oVar, 12), g0Var2);
                z6.b(z3.U(g0Var2, 2131886517), null, i2.t.b(0.7f, j9), kh.o.z(16), null, null, 0L, null, new x3.k(3), kh.o.z(16), 0, false, 0, 0, null, null, g0Var2, 24576, 48, 259050);
                g0Var = g0Var2;
                g0Var.r(false);
                rVar2 = oVar;
                str2 = str;
            } else {
                g0Var2.c0(-152616893);
                String strU2 = z3.U(g0Var2, 2131887350);
                long jZ3 = kh.o.z(20);
                long jZ4 = kh.o.z(20);
                q3.u uVar2 = q3.u.D;
                long j10 = dl.a.k;
                z6.b(strU2, null, j10, jZ3, uVar2, null, 0L, null, new x3.k(3), jZ4, 0, false, 0, 0, null, null, g0Var2, 1597440, 48, 258986);
                h0.c.h(z1.e(oVar, 8), g0Var2);
                str2 = str;
                z6.b(str2, null, dl.a.C, kh.o.z(20), uVar2, null, 0L, null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, null, null, g0Var2, (i11 & 14) | 1597440, 48, 258986);
                rVar2 = oVar;
                h0.c.h(z1.e(rVar2, 12), g0Var2);
                z6.b(z3.U(g0Var2, 2131886918), null, i2.t.b(0.7f, j10), kh.o.z(16), null, null, 0L, null, new x3.k(3), kh.o.z(16), 0, false, 0, 0, null, null, g0Var2, 24576, 48, 259050);
                g0Var = g0Var2;
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new es.e(str2, z10, rVar2, i10);
        }
    }

    public static Object l(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void m(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            I(parcel, (Parcelable) list.get(i10));
        }
    }

    public static final java.lang.Object n(v2.i0 r7, m00.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: ca.v.n(v2.i0, m00.a):java.lang.Object");
    }

    public static final void o(x40.v vVar, im.a aVar) {
        lm.b bVar = aVar.a;
        bVar.getClass();
        lm.a aVar2 = lm.a.A;
        List listW0 = r30.k.W0(Obfuscated.INSTANCE.decode("3cca102ad633b32340b923f5f50130bd6303ce7597c052fb26820e17f839df4725c3047dd755d925668f1ddbc74e39e14f1b960da7fe5eba27d97804863dde2536e822608d54f8124ca232d7f46b29a82c62da4ae3f16df277dc615cf201e40420ed42628750a1475e9f25b0840f4fa73516f118b5e355bf67a36342ba12c25c16f6254a8042e43c779307eaf7012ca35338e31897cc0ee37ba66a41b323c8417a945e20a27cb7217bc43ec1e97c2ca5326be464bcd049fb5d9f2f2fb428fc3d0d89074f8670aa5c448d2feafa0d5d"), new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(h00.r.q0(listW0, 10));
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            arrayList.add(r30.k.j1((String) it.next()).toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        x40.h hVar = null;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                String str2 = bVar.b;
                String[] strArr = {str};
                kotlin.jvm.internal.m.e(str2, "pattern");
                for (String str3 : strArr) {
                    arrayList3.add(new x40.g(str2, str3));
                }
            }
            for (String str4 : arrayList2) {
                String str5 = bVar.c;
                String[] strArr2 = {str4};
                kotlin.jvm.internal.m.e(str5, "pattern");
                for (String str6 : strArr2) {
                    arrayList3.add(new x40.g(str5, str6));
                }
            }
            hVar = new x40.h(h00.q.r1(arrayList3), (ri.t1) null);
        }
        if (hVar == null) {
            return;
        }
        hVar.equals(vVar.q);
        vVar.q = hVar;
    }

    public static void p(jk.f fVar, float f3) {
        kotlin.jvm.internal.m.e(fVar, "$this$blur");
        if (f3 <= 0.0f) {
            return;
        }
        if (fVar.F != null && f3 > fVar.E) {
            fVar.E = f3;
        }
        RenderEffect renderEffect = fVar.F;
        fVar.F = renderEffect != null ? RenderEffect.createBlurEffect(f3, f3, renderEffect, i2.b0.B(0)) : RenderEffect.createBlurEffect(f3, f3, i2.b0.B(0));
    }

    public static final Object q(Object obj, boolean z10) {
        v20.c cVar;
        kotlin.jvm.internal.m.e(obj, "possiblyPrimitiveType");
        if (z10) {
            obj = (g20.k) obj;
            if ((obj instanceof g20.j) && (cVar = ((g20.j) obj).i) != null) {
                n20.c cVar2 = cVar.D;
                if (cVar2 == null) {
                    v20.c.a(15);
                    throw null;
                }
                String strD = v20.b.b(cVar2).d();
                kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
                return g20.f.d(strD);
            }
        }
        return obj;
    }

    public static byte r(long j9) {
        ta.c0.p(j9, "out of range: %s", (j9 >> 8) == 0);
        return (byte) j9;
    }

    public static final void s(ma.c cVar, Throwable th2) {
        boolean zIsTerminated;
        if (cVar != null) {
            if (th2 != null) {
                try {
                    oi.k.z(cVar);
                    return;
                } catch (Throwable th3) {
                    s0.V(th2, th3);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (!(cVar instanceof ExecutorService)) {
                throw new IllegalArgumentException();
            }
            ExecutorService executorService = (ExecutorService) cVar;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean t(h00.i iVar, Map.Entry entry) {
        kotlin.jvm.internal.m.e(entry, "element");
        Object obj = iVar.get(entry.getKey());
        if (obj != null) {
            return obj.equals(entry.getValue());
        }
        return entry.getValue() == null && iVar.containsKey(entry.getKey());
    }

    public static android.graphics.Bitmap u(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, xb.g r7, xb.f r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ca.v.u(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, xb.g, xb.f, boolean):android.graphics.Bitmap");
    }

    public static final Object v(n nVar, String str, m00.c cVar) {
        Object objC = nVar.c(str, new bw.b(7), cVar);
        return objC == l00.a.A ? objC : g00.b0.a;
    }

    public static final b2.r w(b2.r rVar, float f3, float f10, float f11, float f12) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        boolean z10 = f10 > 0.0f;
        boolean z11 = f12 > 0.0f;
        return (z10 || z11) ? f2.h.f(i2.b0.p(rVar, new r9.e(21)), new vu.b(f3, f10, f11, f12, z10, z11)) : rVar;
    }

    public static final long x(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final int y(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static final Bundle z(String str, Bundle bundle) {
        kotlin.jvm.internal.m.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(a1.b.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
