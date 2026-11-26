package h1;

import a1.v2;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import g1.k8;
import g1.z6;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l1.m1;
import l1.q1;
import l1.r1;
import ri.t1;

public abstract class f {

    public static final StackTraceElement[] f6502a = new StackTraceElement[0];

    public static o2.f f6503b;

    public static o2.f f6504c;

    public static o2.f f6505d;

    public static o2.f f6506e;

    public static o2.f f6507f;

    public static final void a(c4.b0 b0Var, v1.c cVar, k8 k8Var, v1.c cVar2, l1.j jVar, int i10) {
        c4.b0 b0Var2;
        int i11;
        l1.z0 z0Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1221877520);
        if ((i10 & 6) == 0) {
            b0Var2 = b0Var;
            i11 = (g0Var.g(b0Var2) ? 4 : 2) | i10;
        } else {
            b0Var2 = b0Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? g0Var.g(k8Var) : g0Var.i(k8Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i12 = i10 & 3072;
        b2.o oVar = b2.o.A;
        if (i12 == 0) {
            i11 |= g0Var.g(oVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(null) ? 16384 : 8192;
        }
        boolean z10 = false;
        if ((i10 & 196608) == 0) {
            i11 |= g0Var.h(false) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var.h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= g0Var.i(cVar2) ? 67108864 : 33554432;
        }
        int i13 = i11;
        if (g0Var.S(i13 & 1, (38347923 & i13) != 38347922)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = l1.q.o(g0Var);
                g0Var.n0(objN);
            }
            a40.z zVar = (a40.z) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN2);
            }
            l1.z0 z0Var2 = (l1.z0) objN2;
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(oVar, g0Var);
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
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            if (k8Var.b()) {
                g0Var.c0(-1891243071);
                z0Var = z0Var2;
                d(b0Var2, k8Var, zVar, false, z0Var, cVar, g0Var, (i13 & 14) | 196608 | ((i13 >> 3) & 112) | ((i13 >> 6) & 896) | ((i13 << 15) & 3670016));
                g0Var.r(false);
            } else {
                z0Var = z0Var2;
                g0Var.c0(-1890863476);
                g0Var.r(false);
            }
            e(k8Var, z0Var, cVar2, g0Var, ((i13 >> 18) & 14) | 384 | ((i13 >> 3) & 112) | ((i13 >> 12) & 7168) | (57344 & (i13 << 3)) | ((i13 >> 9) & 458752));
            g0Var.r(true);
            if ((i13 & 896) == 256 || ((i13 & 512) != 0 && g0Var.i(k8Var))) {
                z10 = true;
            }
            Object objN3 = g0Var.N();
            if (z10 || objN3 == cVar3) {
                objN3 = new h00.a(k8Var, 2);
                g0Var.n0(objN3);
            }
            l1.q.e(k8Var, (u00.k) objN3, g0Var);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g1.a(b0Var, cVar, k8Var, cVar2, i10);
        }
    }

    public static final void b(androidx.lifecycle.w wVar, u00.k kVar, u00.a aVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1868327245);
        int i11 = (g0Var.i(wVar) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            boolean zI = ((i11 & 112) == 32) | g0Var.i(wVar) | ((i11 & 896) == 256);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new b1.l(wVar, kVar, aVar, 15);
                g0Var.n0(objN);
            }
            l1.q.e(wVar, (u00.k) objN, g0Var);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b1.n(i10, 10, wVar, kVar, aVar);
        }
    }

    public static final void c(long j9, m3.r0 r0Var, u00.n nVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-684938728);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.f(j9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(r0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            l1.t tVar = z6.f6045a;
            l1.q.b(new q1[]{g1.y0.f6028a.a(new i2.t(j9)), tVar.a(((m3.r0) g0Var.k(tVar)).e(r0Var))}, nVar, g0Var, ((i11 >> 3) & 112) | 8);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new t0(j9, r0Var, nVar, i10, 0);
        }
    }

    public static final void d(c4.b0 b0Var, k8 k8Var, a40.z zVar, boolean z10, l1.z0 z0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        c4.b0 b0Var2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1413720282);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(b0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(k8Var) : g0Var.i(k8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(null) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(zVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.h(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.g(z0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var.i(cVar) ? 1048576 : 524288;
        }
        if (g0Var.S(i11 & 1, (599187 & i11) != 599186)) {
            String strU = z3.U(g0Var, 2131887351);
            boolean zI = ((i11 & 112) == 32 || ((i11 & 64) != 0 && g0Var.i(k8Var))) | ((i11 & 896) == 256) | g0Var.i(zVar) | ((458752 & i11) == 131072);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new d0.g(k8Var, zVar, z0Var, 3);
                g0Var.n0(objN);
            }
            b0Var2 = b0Var;
            c4.n.a(b0Var2, (u00.a) objN, new c4.c0(z10), v1.d.d(-1287705660, new g1.w(strU, cVar, 9), g0Var), g0Var, (i11 & 14) | 3072, 0);
        } else {
            b0Var2 = b0Var;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c0.h(b0Var2, k8Var, zVar, z10, z0Var, cVar, i10);
        }
    }

    public static final void e(k8 k8Var, l1.z0 z0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1873232064);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.h(true) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(k8Var) : g0Var.i(k8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(z0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(false) ? 2048 : 1024;
        }
        int i12 = i10 & 24576;
        b2.o oVar = b2.o.A;
        if (i12 == 0) {
            i11 |= g0Var.g(oVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.i(cVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = l1.q.o(g0Var);
                g0Var.n0(objN);
            }
            a40.z zVar = (a40.z) objN;
            b2.r rVarE = t2.d.e(g2.d.s(v2.f0.b(v2.f0.b(oVar, k8Var, new r(k8Var, 0)), k8Var, new r(k8Var, 1)).V(new r0(new b1.l(z3.U(g0Var, 2131887352), zVar, k8Var, 16))), new al.l(zVar, k8Var, 27)), new v2(k8Var, z0Var, 14));
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar.invoke(g0Var, Integer.valueOf((i11 >> 15) & 14));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(k8Var, z0Var, cVar, i10);
        }
    }

    public static final Object f(u00.a aVar, u00.n nVar, m00.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.B = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object obj = dVar.A;
        l00.a aVar2 = l00.a.A;
        int i11 = dVar.B;
        try {
            if (i11 == 0) {
                t1.O(obj);
                ev.p pVar = new ev.p(aVar, nVar, (k00.c) null, 9);
                dVar.B = 1;
                if (a40.c0.k(pVar, dVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return g00.b0.a;
    }

    public static b2.r g(b2.r rVar) {
        return rVar.V(new z(new e6.c(18)));
    }

    public static final b2.r h(b2.r rVar, fc.n nVar, u00.n nVar2) {
        d0.q1 q1Var = d0.q1.A;
        return rVar.V(new c0(nVar, nVar2));
    }

    public static final String i(long j9, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j9));
    }

    public static DateTimeFormatter j(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        kotlin.jvm.internal.m.c(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
        return (DateTimeFormatter) objWithDecimalStyle;
    }

    public static final Object k(z2.v0 v0Var) {
        Object objU = v0Var.U();
        z2.e0 e0Var = objU instanceof z2.e0 ? (z2.e0) objU : null;
        if (e0Var != null) {
            return e0Var.O;
        }
        return null;
    }

    public static final String l(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.k(c3.o0.f2721a);
        return ((Context) g0Var.k(c3.o0.f2722b)).getResources().getString(i10);
    }

    public static final int m(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        int i12 = i10 - i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }
}
