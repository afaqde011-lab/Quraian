package a10;

import a1.h2;
import android.content.Context;
import android.database.SQLException;
import androidx.fragment.app.j0;
import androidx.lifecycle.u0;
import androidx.media3.common.v0;
import b3.p1;
import bt.t0;
import c3.o1;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.Task;
import h0.z1;
import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import l1.e1;
import l1.i1;
import l1.m1;
import l1.r1;
import l1.y1;
import l1.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.s0;
import ri.t1;
import x.b1;
import z2.w0;

public abstract class h0 {
    public static i2.d b;
    public static i2.a c;
    public static k2.b d;
    public static Boolean e;

    public static d4.k A(d4.i iVar) {
        d4.h hVar = new d4.h();
        hVar.c = new d4.m();
        d4.k kVar = new d4.k(hVar);
        hVar.b = kVar;
        hVar.a = iVar.getClass();
        try {
            Object objH = iVar.h(hVar);
            if (objH == null) {
                return kVar;
            }
            hVar.a = objH;
            return kVar;
        } catch (Exception e2) {
            kVar.B.l(e2);
            return kVar;
        }
    }

    public static final Type B(z zVar) {
        a0 a0Var = zVar.a;
        if (a0Var == null) {
            return i0.C;
        }
        x xVar = zVar.b;
        kotlin.jvm.internal.m.b(xVar);
        int iOrdinal = a0Var.ordinal();
        if (iOrdinal == 0) {
            return n(xVar, true);
        }
        if (iOrdinal == 1) {
            return new i0(null, n(xVar, true));
        }
        if (iOrdinal == 2) {
            return new i0(n(xVar, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int D(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final String E(Collection collection) {
        return r30.l.i0(h00.q.R0(collection, ",", null, null, null, 62), "    ") + r30.l.i0(" }", "    ");
    }

    public static final String F(Collection collection) {
        return r30.l.i0(h00.q.R0(collection, ",", null, null, null, 62), "    ") + r30.l.i0("},", "    ");
    }

    public static void G(d40.z zVar, androidx.lifecycle.w lifecycleOwner) {
        androidx.lifecycle.p pVar = androidx.lifecycle.p.D;
        kotlin.jvm.internal.m.e(lifecycleOwner, "lifecycleOwner");
        ta.c0.M(u0.g(lifecycleOwner), (k00.i) null, (u00.n) null, (u00.k) null, new pz.k(zVar, lifecycleOwner, pVar, null, 6), 31);
    }

    public static String I(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void L(x8.d dVar, int i, e7.h hVar) {
        long jE = dVar.e(i);
        List listG = dVar.g(jE);
        if (listG.isEmpty()) {
            return;
        }
        if (i == dVar.i() - 1) {
            throw new IllegalStateException();
        }
        long jE2 = dVar.e(i + 1) - dVar.e(i);
        if (jE2 > 0) {
            hVar.accept(new x8.a(jE, jE2, listG));
        }
    }

    public static final void M(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static byte[] N(oj.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = dVar.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (dVar.read() == -1) {
            return m(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void O(x8.d dVar, x8.j jVar, e7.h hVar) {
        int iD;
        boolean z;
        long j = jVar.a;
        if (j == -9223372036854775807L) {
            iD = 0;
        } else {
            iD = dVar.d(j);
            if (iD == -1) {
                iD = dVar.i();
            }
            if (iD > 0 && dVar.e(iD - 1) == j) {
                iD--;
            }
        }
        if (j == -9223372036854775807L || iD >= dVar.i()) {
            z = false;
        } else {
            List listG = dVar.g(j);
            long jE = dVar.e(iD);
            if (listG.isEmpty()) {
                z = false;
            } else {
                long j2 = jVar.a;
                if (j2 < jE) {
                    hVar.accept(new x8.a(j2, jE - j2, listG));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iD; i < dVar.i(); i++) {
            L(dVar, i, hVar);
        }
        if (jVar.b) {
            if (z) {
                iD--;
            }
            for (int i2 = 0; i2 < iD; i2++) {
                L(dVar, i2, hVar);
            }
            if (z) {
                hVar.accept(new x8.a(dVar.e(iD), j - dVar.e(iD), dVar.g(j)));
            }
        }
    }

    public static final List P(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(h00.q.L0(list));
        }
        return h00.x.A;
    }

    public static final Map Q(Map map) {
        int size = map.size();
        if (size == 0) {
            return h00.y.A;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) h00.q.K0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final Object R(Object obj) {
        if (obj instanceof Map) {
            return S((Map) obj);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(R(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        JSONArray jSONArray2 = new JSONArray();
        g00.s sVarI = kotlin.jvm.internal.m.i((Object[]) obj);
        while (sVarI.hasNext()) {
            jSONArray2.put(R(sVarI.next()));
        }
        return jSONArray2;
    }

    public static final JSONObject S(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, R(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final LinkedHashMap T(JSONObject jSONObject) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.m.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.m.b(next);
            linkedHashMap.put(next, z(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static final String U(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final ArrayList V(o1.g gVar, int i, Integer num) {
        a2.m mVar = new a2.m(gVar, 0);
        i = gVar.q(i);
        Integer numA = gVar.a(i);
        while (i >= 0) {
            mVar.g(gVar.i(i), gVar.k(i) ? gVar.p(gVar.b, i) : l1.i.a, gVar.a.m(i), num);
            if (i >= 0) {
                Integer num2 = numA;
                numA = gVar.a(i);
                i = gVar.q(i);
                num = num2;
            } else {
                num = numA;
            }
        }
        return ((a2.b) mVar).A;
    }

    public static final void W(j3.s sVar, int i, h2 h2Var) {
        m1.e eVar = new m1.e(0, new j3.s[16]);
        List listI = sVar.i(false, false);
        while (true) {
            eVar.c(eVar.C, listI);
            while (true) {
                int i2 = eVar.C;
                if (i2 == 0) {
                    return;
                }
                j3.s sVar2 = (j3.s) eVar.k(i2 - 1);
                boolean zG = j3.v.g(sVar2);
                j3.o oVar = sVar2.d;
                u.i0 i0Var = oVar.A;
                if (!zG && !i0Var.c(j3.w.j)) {
                    p1 p1VarD = sVar2.d();
                    if (p1VarD == null) {
                        throw a1.b.u("Expected semantics node to have a coordinator.");
                    }
                    y3.k kVarQ = k00.f.Q(z2.d0.g(p1VarD, true));
                    if (kVarQ.a < kVarQ.c && kVarQ.b < kVarQ.d) {
                        Object objG = oVar.A.g(j3.n.e);
                        if (objG == null) {
                            objG = null;
                        }
                        u00.n nVar = (u00.n) objG;
                        Object objG2 = i0Var.g(j3.w.w);
                        j3.l lVar = (j3.l) (objG2 != null ? objG2 : null);
                        if (nVar == null || lVar == null || ((Number) lVar.b.invoke()).floatValue() <= 0.0f) {
                            listI = sVar2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            h2Var.invoke(new i3.g(sVar2, i3, kVarQ, p1VarD));
                            W(sVar2, i3, h2Var);
                        }
                    }
                }
            }
        }
    }

    public static final void a(lo.e r18, b2.r r19, float r20, boolean r21, java.lang.Integer r22, boolean r23, l1.j r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: a10.h0.a(lo.e, b2.r, float, boolean, java.lang.Integer, boolean, l1.j, int, int):void");
    }

    public static final void d(final mr.g timerState, final int i, final u30.b weeklyStreaks, final boolean z, final boolean z2, final boolean z3, final u00.k onAction, final b2.r rVar, l1.j jVar, final int i2) {
        int i3;
        l1.j jVar2;
        boolean z4;
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1098095684);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? jVar3.g(timerState) : jVar3.i(timerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= jVar3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= jVar3.g(weeklyStreaks) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= jVar3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= jVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= jVar3.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= jVar3.i(onAction) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= jVar3.g(rVar) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (jVar3.S(i4 & 1, (i4 & 4793491) != 4793490)) {
            gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            float f = 16;
            b2.r rVarE = h0.c.E(z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.b), 0.0f, f, 1);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, jVar3, 48);
            int iHashCode = Long.hashCode(((l1.g0) jVar3).T);
            m1 m1VarM = jVar3.m();
            b2.r rVarC = b2.a.c(rVarE, jVar3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar3.g0();
            if (((l1.g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, jVar3, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, jVar3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, jVar3, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(jVar3, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, jVar3, fVar4);
            gm.a aVar2 = gm.a.B;
            b2.o oVar = b2.o.A;
            b2.r rVarS = aVar == aVar2 ? z1.s(oVar, 0.0f, 450, 1) : z1.d(oVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(((l1.g0) jVar3).T);
            m1 m1VarM2 = jVar3.m();
            b2.r rVarC2 = b2.a.c(rVarS, jVar3);
            jVar3.g0();
            if (((l1.g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            l1.q.I(w0VarD, jVar3, fVar);
            l1.q.I(m1VarM2, jVar3, fVar2);
            a1.b.v(iHashCode2, jVar3, fVar3, jVar3, eVar);
            l1.q.I(rVarC2, jVar3, fVar4);
            int i5 = i4 & 3670016;
            boolean z5 = i5 == 1048576;
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (z5 || objN == cVar) {
                objN = new t0(9, onAction);
                jVar3.n0(objN);
            }
            u00.a aVar3 = (u00.a) objN;
            boolean z6 = i5 == 1048576;
            Object objN2 = jVar3.N();
            if (z6 || objN2 == cVar) {
                objN2 = new t0(10, onAction);
                jVar3.n0(objN2);
            }
            int i6 = i4 & 112;
            jVar2 = jVar3;
            wr.k.Y(timerState, i, aVar3, (u00.a) objN2, f, jVar2, (i4 & 14) | 24576 | i6);
            jVar2.r(true);
            boolean z7 = i5 == 1048576;
            Object objN3 = jVar2.N();
            if (z7 || objN3 == cVar) {
                objN3 = new t0(11, onAction);
                jVar2.n0(objN3);
            }
            wr.h0.d(weeklyStreaks, (u00.a) objN3, null, jVar2, (i4 >> 6) & 14);
            if (aVar == gm.a.A) {
                jVar2.c0(-1610890035);
                b2.r rVarE2 = h0.c.E(z1.d(oVar, 1.0f), f, 0.0f, 2);
                boolean z8 = i5 == 1048576;
                Object objN4 = jVar2.N();
                if (z8 || objN4 == cVar) {
                    objN4 = new t0(12, onAction);
                    jVar2.n0(objN4);
                }
                u00.a aVar4 = (u00.a) objN4;
                boolean z9 = i5 == 1048576;
                Object objN5 = jVar2.N();
                if (z9 || objN5 == cVar) {
                    objN5 = new t0(13, onAction);
                    jVar2.n0(objN5);
                }
                z4 = false;
                wr.k.X(z, aVar4, (u00.a) objN5, rVarE2, jVar2, ((i4 >> 9) & 14) | 3072);
                jVar2.r(false);
            } else {
                z4 = false;
                jVar2.c0(-1610508208);
                jVar2.r(false);
            }
            jVar2.r(true);
            String strU = z3.U(jVar2, 2131887343);
            String strU2 = z3.U(jVar2, 2131887341);
            String strU3 = z3.U(jVar2, 2131887342);
            boolean z11 = i5 == r15 ? true : z4;
            Object objN6 = jVar2.N();
            if (z11 || objN6 == cVar) {
                objN6 = new t0(14, onAction);
                jVar2.n0(objN6);
            }
            u00.a aVar5 = (u00.a) objN6;
            boolean z12 = i5 != 1048576 ? z4 : true;
            Object objN7 = jVar2.N();
            if (z12 || objN7 == cVar) {
                objN7 = new as.d0(9, onAction);
                jVar2.n0(objN7);
            }
            el.a.a(z2, i, strU, strU3, strU2, aVar5, null, 0, 0.0f, 0, 0.0f, 0L, 0L, false, false, null, (u00.k) objN7, z3, false, jVar2, ((i4 >> 12) & 14) | i6, (29360128 & (i4 << 6)) | 100663296, 65472);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a10.h0.d(timerState, i, weeklyStreaks, z, z2, z3, onAction, rVar, (l1.j) obj, l1.q.K(i2 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void e(long j, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(509118662);
        int i2 = (g0Var.f(j) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                u40.e eVar = new u40.e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
                List list = yk.a.b;
                List list2 = yk.a.c;
                List list3 = yk.a.a;
                u40.g gVar = new u40.g();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
                v40.b bVar = new v40.b();
                long jConvert = timeUnit.convert(120L, timeUnit);
                bVar.a = jConvert;
                bVar.b = (jConvert / ((long) 30)) / 1000.0f;
                u40.b bVar2 = new u40.b(45, 25.0f, 50.0f, list2, list3, list, eVar, gVar, bVar);
                v40.b bVar3 = new v40.b();
                long jConvert2 = timeUnit.convert(150L, timeUnit);
                bVar3.a = jConvert2;
                bVar3.b = (jConvert2 / ((long) 50)) / 1000.0f;
                u40.b bVarA = u40.b.a(bVar2, 120, 35.0f, 62.0f, bVar3);
                v40.b bVar4 = new v40.b();
                long jConvert3 = timeUnit.convert(80L, timeUnit);
                bVar4.a = jConvert3;
                bVar4.b = (jConvert3 / ((long) 20)) / 1000.0f;
                objN = va.a.S(new u40.b[]{bVar2, bVarA, u40.b.a(bVar2, 25, 18.0f, 42.0f, bVar4)});
                g0Var.n0(objN);
            }
            t1.c(rVar.V(z1.c), (List) objN, g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q0.b(j, rVar, i);
        }
    }

    public static final void f(u00.a selected, u00.k onSelect, jk.a backdrop, b2.r rVar, boolean z, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        boolean z2;
        final boolean z3;
        final z0 z0Var;
        final float f;
        Object obj;
        Object kVar;
        u00.a aVar;
        Float fValueOf = Float.valueOf(0.001f);
        kotlin.jvm.internal.m.e(selected, "selected");
        kotlin.jvm.internal.m.e(onSelect, "onSelect");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1887481088);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(selected) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onSelect) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(backdrop) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            final long j = dl.a.D;
            final long jB = i2.t.b(0.36f, i2.b0.d(4286085248L));
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            boolean z4 = g0Var.k(o1.n) == y3.m.A;
            float fA0 = cVar.A0(20.0f);
            Object objN = g0Var.N();
            Object obj2 = l1.i.a;
            if (objN == obj2) {
                objN = l1.q.o(g0Var);
                g0Var.n0(objN);
            }
            a40.z zVar = (a40.z) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj2) {
                objN2 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN2);
            }
            final z0 z0Var2 = (z0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == obj2) {
                e1 e1Var = new e1(((Boolean) selected.invoke()).booleanValue() ? 1.0f : 0.0f);
                g0Var.n0(e1Var);
                objN3 = e1Var;
            }
            z0 z0Var3 = (e1) objN3;
            boolean zG = g0Var.g(zVar);
            Object objN4 = g0Var.N();
            if (zG || objN4 == obj2) {
                z3 = z4;
                z0Var = z0Var3;
                f = fA0;
                obj = obj2;
                objN4 = new tm.e(zVar, z0Var3.h(), new z00.a(0.0f, 1.0f), 0.001f, 1.5f, new qs.c(24), new az.k(onSelect, (Object) selected, z0Var2, z0Var, 14), new u00.o() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        float f2;
                        tm.e DampedDragAnimation = (tm.e) obj3;
                        h2.b bVar = (h2.b) obj5;
                        kotlin.jvm.internal.m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                        z0 z0Var4 = z0Var2;
                        if (!((Boolean) z0Var4.getValue()).booleanValue()) {
                            z0Var4.setValue(Boolean.valueOf(!(Float.intBitsToFloat((int) (bVar.a >> 32)) == 0.0f)));
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a >> 32)) / f;
                        boolean z5 = z3;
                        e1 e1Var2 = z0Var;
                        float f3 = 1.0f;
                        if (z5) {
                            float fH = e1Var2.h() + fIntBitsToFloat;
                            f2 = fH >= 0.0f ? fH : 0.0f;
                            if (f2 <= 1.0f) {
                                f3 = f2;
                            }
                        } else {
                            float fH2 = e1Var2.h() - fIntBitsToFloat;
                            f2 = fH2 >= 0.0f ? fH2 : 0.0f;
                            if (f2 <= 1.0f) {
                                f3 = f2;
                            }
                        }
                        e1Var2.i(f3);
                        return g00.b0.a;
                    }
                }, new q0.t1(selected, z0Var2, z0Var, 4), new b1(1.0f, 1800.0f, fValueOf), new b1(0.75f, 600.0f, fValueOf), new b1(0.75f, 600.0f, fValueOf));
                g0Var.n0(objN4);
            } else {
                z3 = z4;
                obj = obj2;
                z0Var = z0Var3;
                f = fA0;
            }
            final tm.e eVar = (tm.e) objN4;
            boolean zI = g0Var.i(eVar);
            Object objN5 = g0Var.N();
            k00.c cVar2 = null;
            if (zI || objN5 == obj) {
                objN5 = new rm.c(z0Var, eVar, cVar2, 7);
                g0Var.n0(objN5);
            }
            l1.q.i(eVar, g0Var, (u00.n) objN5);
            boolean zI2 = ((i3 & 14) == 4) | g0Var.i(eVar);
            Object objN6 = g0Var.N();
            if (zI2 || objN6 == obj) {
                aVar = selected;
                kVar = new pz.k(aVar, eVar, z0Var, cVar2, 9);
                g0Var.n0(kVar);
            } else {
                kVar = objN6;
                aVar = selected;
            }
            l1.q.i(aVar, g0Var, (u00.n) kVar);
            kk.c cVarD = kk.e.d(g0Var);
            Object objN7 = g0Var.N();
            if (objN7 == obj) {
                objN7 = new r9.e(12);
                g0Var.n0(objN7);
            }
            rVar2 = b2.o.A;
            b2.r rVarN = z1.n(j3.q.c(rVar2, false, (u00.k) objN7).V(eVar.t), 64.0f, 28.0f);
            w0 w0VarD = h0.o.d(b2.b.D, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarN, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.r rVarC2 = f2.h.c(kk.e.a(rVar2, cVarD), ok.e.b);
            boolean zI3 = g0Var.i(eVar) | g0Var.f(j);
            Object objN8 = g0Var.N();
            if (zI3 || objN8 == obj) {
                u00.k kVar2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj3) {
                        k2.d drawBehind = (k2.d) obj3;
                        kotlin.jvm.internal.m.e(drawBehind, "$this$drawBehind");
                        k2.d.R(drawBehind, i2.b0.u(jB, j, eVar.e()), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar2);
                objN8 = kVar2;
            }
            h0.o.a(z1.n(f2.h.e(rVarC2, (u00.k) objN8), 64.0f, 28.0f), g0Var, 0);
            boolean zI4 = g0Var.i(eVar) | g0Var.h(z3) | g0Var.d(f);
            Object objN9 = g0Var.N();
            if (zI4 || objN9 == obj) {
                objN9 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj3) {
                        i2.c0 graphicsLayer = (i2.c0) obj3;
                        kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                        float fE = eVar.e();
                        float fC = graphicsLayer.c() * 2.0f;
                        boolean z5 = z3;
                        float f2 = f;
                        graphicsLayer.T0(z5 ? b5.A(fC, f2 + fC, fE) : b5.A(-fC, -(fC + f2), fE));
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN9);
            }
            b2.r rVarP = i2.b0.p(rVar2, (u00.k) objN9);
            boolean zI5 = g0Var.i(eVar);
            Object objN10 = g0Var.N();
            if (zI5 || objN10 == obj) {
                objN10 = new sm.v(eVar, 1);
                g0Var.n0(objN10);
            }
            kk.b bVarC = kk.e.c(backdrop, kk.e.b(cVarD, (u00.n) objN10, g0Var), g0Var, (i3 >> 6) & 14);
            Object objN11 = g0Var.N();
            if (objN11 == obj) {
                objN11 = new q50.b(22);
                g0Var.n0(objN11);
            }
            u00.a aVar2 = (u00.a) objN11;
            boolean zI6 = g0Var.i(eVar);
            Object objN12 = g0Var.N();
            if (zI6 || objN12 == obj) {
                objN12 = new sm.e(eVar, 8);
                g0Var.n0(objN12);
            }
            u00.k kVar3 = (u00.k) objN12;
            boolean zI7 = g0Var.i(eVar);
            Object objN13 = g0Var.N();
            if (zI7 || objN13 == obj) {
                objN13 = new sm.b(eVar, 7);
                g0Var.n0(objN13);
            }
            u00.a aVar3 = (u00.a) objN13;
            Object objN14 = g0Var.N();
            if (objN14 == obj) {
                objN14 = new q50.b(23);
                g0Var.n0(objN14);
            }
            u00.a aVar4 = (u00.a) objN14;
            boolean zI8 = g0Var.i(eVar);
            Object objN15 = g0Var.N();
            if (zI8 || objN15 == obj) {
                objN15 = new sm.b(eVar, 8);
                g0Var.n0(objN15);
            }
            u00.a aVar5 = (u00.a) objN15;
            boolean zI9 = g0Var.i(eVar);
            Object objN16 = g0Var.N();
            if (zI9 || objN16 == obj) {
                objN16 = new sm.e(eVar, 9);
                g0Var.n0(objN16);
            }
            u00.k kVar4 = (u00.k) objN16;
            boolean zI10 = g0Var.i(eVar);
            Object objN17 = g0Var.N();
            if (zI10 || objN17 == obj) {
                objN17 = new sm.e(eVar, 10);
                g0Var.n0(objN17);
            }
            h0.o.a(z1.n(jk.d.b(rVarP, bVarC, aVar2, kVar3, aVar3, aVar4, aVar5, kVar4, (u00.k) objN17, 2944), 40.0f, 24.0f), g0Var, 0);
            g0Var.r(true);
            z2 = true;
        } else {
            g0Var.V();
            rVar2 = rVar;
            z2 = z;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.r(selected, onSelect, backdrop, rVar2, z2, i);
        }
    }

    public static final void g(b2.r rVar, l1.p1 p1Var, v1.c cVar, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-714464401);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(p1Var) ? 32 : 16;
        }
        int i3 = i & 384;
        v1.c cVar2 = v0.g.a;
        if (i3 == 0) {
            i2 |= g0Var.i(cVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                i1 i1Var = new i1((Object) null, l1.c.D);
                g0Var.n0(i1Var);
                objN = i1Var;
            }
            x0.c cVarJ = j(cVar2, g0Var, (i2 >> 6) & 14);
            l1.q.a(p1Var.a(cVarJ), v1.d.d(274270255, new dz.k(rVar, (z0) objN, cVar, cVarJ), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 27, rVar, p1Var, cVar);
        }
    }

    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        q30.j jVarN0 = q30.l.n0(type, g0.A);
        return ((Class) q30.l.q0(jVarN0)).getName() + r30.r.t0(q30.l.k0(jVarN0), "[]");
    }

    public static final Object i(Task task, m00.c cVar) throws Exception {
        if (!task.n()) {
            a40.k kVar = new a40.k(1, s0.j0(cVar));
            kVar.r();
            task.c(k40.a.A, new k40.b(kVar, 0));
            Object objQ = kVar.q();
            l00.a aVar = l00.a.A;
            return objQ;
        }
        Exception excJ = task.j();
        if (excJ != null) {
            throw excJ;
        }
        if (!task.m()) {
            return task.k();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final x0.c j(v1.c cVar, l1.j jVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((l1.g0) jVar).g(cVar)) || (i & 6) == 4;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar2 = l1.i.a;
        if (z || objN == cVar2) {
            objN = new x0.c(cVar);
            g0Var.n0(objN);
        }
        x0.c cVar3 = (x0.c) objN;
        boolean zG = g0Var.g(cVar3);
        Object objN2 = g0Var.N();
        if (zG || objN2 == cVar2) {
            objN2 = new q0.a(cVar3, 22);
            g0Var.n0(objN2);
        }
        l1.q.e(cVar3, (u00.k) objN2, jVar);
        return cVar3;
    }

    public static final List l(o1.k kVar, Integer num, int i, Integer num2) {
        int iG;
        int iS;
        u.d0 d0Var;
        if (kVar.w || kVar.p() == 0) {
            return h00.x.A;
        }
        a2.m mVar = new a2.m(kVar, 1);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = kVar.v;
            if (iG < 0) {
                iG = kVar.G(kVar.b, i);
            }
        }
        if (num == null) {
            int iP = kVar.i - kVar.P(kVar.b, kVar.r(i));
            u.w wVar = kVar.s;
            num = Integer.valueOf(iP + ((wVar == null || (d0Var = (u.d0) wVar.b(i)) == null) ? 0 : d0Var.b));
        }
        int iR = kVar.r(i) * 5;
        int[] iArr = kVar.b;
        if (iR < iArr.length) {
            iS = kVar.s(i);
        } else {
            int iG2 = iG >= 0 ? kVar.G(iArr, iG) : iG;
            iS = kVar.s(iG);
            int i2 = iG;
            iG = iG2;
            i = i2;
        }
        while (i >= 0) {
            mVar.g(iS, (kVar.b[(kVar.r(i) * 5) + 1] & 536870912) != 0 ? kVar.t(i) : l1.i.a, kVar.Q(i), num);
            num = kVar.b(i);
            if (iG >= 0) {
                int iG3 = kVar.G(kVar.b, iG);
                iS = kVar.s(iG);
                int i3 = iG;
                iG = iG3;
                i = i3;
            } else {
                i = iG;
            }
        }
        return ((a2.b) mVar).A;
    }

    public static byte[] m(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final Type n(x xVar, boolean z) {
        e eVarS = xVar.s();
        if (eVarS instanceof d10.r1) {
            return new c0((d10.r1) eVarS);
        }
        if (!(eVarS instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + xVar);
        }
        d dVar = (d) eVarS;
        Class clsG = z ? k00.f.G(dVar) : k00.f.D(dVar);
        List listR = xVar.r();
        if (listR.isEmpty()) {
            return clsG;
        }
        if (!clsG.isArray()) {
            return p(clsG, listR);
        }
        if (clsG.getComponentType().isPrimitive()) {
            return clsG;
        }
        z zVar = (z) h00.q.f1(listR);
        if (zVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + xVar);
        }
        a0 a0Var = zVar.a;
        x xVar2 = zVar.b;
        int i = a0Var == null ? -1 : f0.a[a0Var.ordinal()];
        if (i == -1 || i == 1) {
            return clsG;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        kotlin.jvm.internal.m.b(xVar2);
        Type typeN = n(xVar2, false);
        return typeN instanceof Class ? clsG : new a(typeN);
    }

    public static final double o(int i, int i2, int i3, int i4, xb.f fVar) {
        double d2 = ((double) i3) / ((double) i);
        double d3 = ((double) i4) / ((double) i2);
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d2, d3);
        }
        if (iOrdinal == 1) {
            return Math.min(d2, d3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final e0 p(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B((z) it.next()));
            }
            return new e0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(B((z) it2.next()));
            }
            return new e0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        e0 e0VarP = p(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(h00.r.q0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(B((z) it3.next()));
        }
        return new e0(cls, e0VarP, arrayList3);
    }

    public static final File r(Context context, String fileName) {
        kotlin.jvm.internal.m.e(context, "<this>");
        kotlin.jvm.internal.m.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    public static final boolean u(String current, String str) {
        kotlin.jvm.internal.m.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < current.length()) {
                char cCharAt = current.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != current.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                return kotlin.jvm.internal.m.a(r30.k.j1(strSubstring).toString(), str);
            }
        }
        return false;
    }

    public static final void v(ma.a aVar, String sql) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(sql, "sql");
        ma.c cVarK0 = aVar.k0(sql);
        try {
            cVarK0.d0();
            ca.v.s(cVarK0, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ca.v.s(cVarK0, th);
                throw th2;
            }
        }
    }

    public static final o10.c w(hf.c cVar, n20.b classId, k20.f metadataVersion) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        me.i iVarC = cVar.C(classId, metadataVersion);
        if (iVarC != null) {
            return (o10.c) iVarC.B;
        }
        return null;
    }

    public static final Integer x(o1.g gVar, l1.n nVar, int i, int i2) {
        Integer numX;
        int[] iArr = gVar.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (gVar.j(i) && gVar.i(i) == 206 && kotlin.jvm.internal.m.a(gVar.p(iArr, i), l1.l.e)) {
                Object objH = gVar.h(i, 0);
                l1.z1 z1Var = objH instanceof l1.z1 ? (l1.z1) objH : null;
                y1 y1VarA = z1Var != null ? z1Var.a() : null;
                l1.d0 d0Var = y1VarA instanceof l1.d0 ? (l1.d0) y1VarA : null;
                if (d0Var != null && d0Var.A.equals(nVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (gVar.d(i) && (numX = x(gVar, nVar, i + 1, i3)) != null) {
                return Integer.valueOf(numX.intValue());
            }
            i = i3;
        }
    }

    public static final String y(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return r30.l.i0(h00.q.R0(collection, ",\n", "\n", "\n", null, 56), "    ") + "},";
    }

    public static final Object z(Object obj) {
        if (obj instanceof JSONObject) {
            return T((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (kotlin.jvm.internal.m.a(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(z(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void C(ma.a connection, Object obj) {
        kotlin.jvm.internal.m.e(connection, "connection");
        if (obj == null) {
            return;
        }
        ma.c cVarK0 = connection.k0(q());
        try {
            k(cVarK0, obj);
            cVarK0.d0();
            ca.v.s(cVarK0, (Throwable) null);
            w00.a.x(connection);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ca.v.s(cVarK0, th);
                throw th2;
            }
        }
    }

    public abstract Throwable H(Throwable th);

    public void J(androidx.fragment.app.i1 i1Var, j0 j0Var) {
    }

    public void K(androidx.fragment.app.i1 i1Var, j0 j0Var) {
    }

    public abstract void k(ma.c cVar, Object obj);

    public abstract String q();

    public v0 s(j8.a aVar) {
        ByteBuffer byteBuffer = ((h7.e) aVar).E;
        byteBuffer.getClass();
        ta.c0.s(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return t(aVar, byteBuffer);
    }

    public abstract v0 t(j8.a aVar, ByteBuffer byteBuffer);
}
