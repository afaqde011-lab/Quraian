package kh;

import a1.c1;
import a1.e1;
import a1.o1;
import a1.t2;
import a1.w2;
import a1.x2;
import a10.h0;
import a40.g1;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.Trace;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.lifecycle.f1;
import b3.l0;
import b3.p1;
import c3.m0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.protobuf.RuntimeVersion;
import d0.q1;
import d0.t0;
import d10.c2;
import d10.i2;
import d10.l1;
import d10.v0;
import d10.x0;
import d10.y0;
import g1.c8;
import h0.m2;
import h0.n1;
import h0.z1;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import l0.n0;
import l1.m1;
import l1.p2;
import l1.q2;
import l1.r1;
import l1.z0;
import m3.q0;
import ri.t1;
import s10.f0;
import s10.g0;
import s10.j0;
import s10.k0;
import u.i0;
import z.h1;
import z2.w0;

public abstract class o {
    public static final int A(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static d4.k B(k00.i iVar, u00.n nVar) {
        a40.a0 a0Var = a40.a0.A;
        kotlin.jvm.internal.m.e(iVar, "context");
        return h0.A(new ce.a(iVar, a0Var, nVar));
    }

    public static i7.g C() {
        HashMap map = new HashMap();
        map.put(j7.j.f8248c.f8249a, 144179200);
        i7.g.a(300000, 0, "backBufferDurationMs", "0");
        return new i7.g(new w7.e(), 50000, 1000, 50000, 50000, 1000, 1000, CastStatusCodes.AUTHENTICATION_FAILED, 1000, true, 300000, true, map);
    }

    public static final void D(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.m.d(databasePath, "getDatabasePath(...)");
        if (databasePath.exists()) {
            za.v.d().a(ab.t.f411a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.m.d(databasePath2, "getDatabasePath(...)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            kotlin.jvm.internal.m.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
            String[] strArr = ab.t.f412b;
            int iP = h00.d0.P(strArr.length);
            if (iP < 16) {
                iP = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : h00.d0.V(linkedHashMap, new g00.k(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        za.v.d().g(ab.t.f411a, "Over-writing contents of " + file2);
                    }
                    za.v.d().a(ab.t.f411a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final long E(float f3, long j9) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j9 : i2.t.b(i2.t.d(j9) * f3, j9);
    }

    public static final long F(float f3, long j9) {
        long jFloatToRawIntBits = j9 | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        y3.p[] pVarArr = y3.o.f16598b;
        return jFloatToRawIntBits;
    }

    public static final g00.q G(String str) {
        kotlin.jvm.internal.m.e(str, "mediaId");
        if (r30.r.x0(str, "pltt/", false)) {
            List listW0 = r30.k.W0(r30.k.R0(str, "pltt/"), new String[]{"/"}, 6);
            String str2 = (String) h00.q.O0(0, listW0);
            Integer numY0 = str2 != null ? r30.r.y0(str2) : null;
            String str3 = (String) h00.q.O0(1, listW0);
            Integer numY1 = str3 != null ? r30.r.y0(str3) : null;
            String str4 = (String) h00.q.O0(2, listW0);
            Integer numY2 = str4 != null ? r30.r.y0(str4) : null;
            if (numY0 != null && numY1 != null && numY2 != null) {
                return new g00.q(numY0, numY1, numY2);
            }
        }
        return null;
    }

    public static final g00.k H(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "mediaId");
        if (r30.r.x0(str, str2, false)) {
            List listW0 = r30.k.W0(r30.k.R0(str, str2), new String[]{"/"}, 6);
            String str3 = (String) h00.q.O0(0, listW0);
            Integer numY0 = str3 != null ? r30.r.y0(str3) : null;
            String str4 = (String) h00.q.O0(1, listW0);
            Integer numY1 = str4 != null ? r30.r.y0(str4) : null;
            if (numY0 != null && numY1 != null) {
                return new g00.k(numY0, numY1);
            }
        }
        return null;
    }

    public static final void I(ViewStructure viewStructure, l0 l0Var, AutofillId autofillId, String str, k3.b bVar) {
        long j9;
        long j10;
        char c10;
        long j11;
        l3.a aVar;
        m3.h hVar;
        c2.f fVar;
        j3.k kVar;
        c2.d dVar;
        boolean z10;
        boolean z11;
        c2.m mVar;
        Boolean bool;
        boolean z12;
        Integer num;
        boolean z13;
        List list;
        Integer numValueOf;
        boolean z14;
        boolean z15;
        boolean z16;
        String strX;
        int size;
        String strK;
        int i10;
        String[] strArrJ;
        String[] strArrJ2;
        i0 i0Var;
        Object[] objArr;
        int i11;
        Object[] objArr2;
        boolean z17;
        i0 i0Var2;
        l3.a aVar2;
        m3.h hVar2;
        c2.f fVar2;
        j3.k kVar2;
        boolean zBooleanValue;
        int i12;
        j3.z zVar = j3.w.f7978a;
        j3.z zVar2 = j3.n.f7940a;
        j3.o oVarZ = l0Var.z();
        int i13 = 8;
        if (oVarZ == null || (i0Var2 = oVarZ.A) == null) {
            j9 = 128;
            j10 = 255;
            c10 = 7;
            j11 = -9187201950435737472L;
            aVar = null;
            hVar = null;
            fVar = null;
            kVar = null;
            dVar = null;
            z10 = true;
            z11 = false;
            mVar = null;
            bool = null;
            z12 = false;
            num = null;
        } else {
            Object[] objArr3 = i0Var2.f14857b;
            j9 = 128;
            Object[] objArr4 = i0Var2.f14858c;
            long[] jArr = i0Var2.f14856a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                dVar = null;
                j10 = 255;
                z11 = false;
                aVar2 = null;
                hVar2 = null;
                fVar2 = null;
                mVar = null;
                bool = null;
                kVar2 = null;
                z12 = false;
                zBooleanValue = true;
                num = null;
                c10 = 7;
                while (true) {
                    long j12 = jArr[i14];
                    j11 = -9187201950435737472L;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j12 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj = objArr3[i17];
                                Object obj2 = objArr4[i17];
                                j3.z zVar3 = (j3.z) obj;
                                i12 = i13;
                                if (kotlin.jvm.internal.m.a(zVar3, j3.w.f7994s)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    dVar = (c2.d) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.f7978a)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) h00.q.N0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.f7993r)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    mVar = (c2.m) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.f7995t)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    fVar2 = (c2.f) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.G)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    hVar2 = (m3.h) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.l)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.R)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.N)) {
                                    z12 = true;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.f7990o)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.f8001z)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    kVar2 = (j3.k) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.K)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.w.L)) {
                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (l3.a) obj2;
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.n.f7941b)) {
                                    viewStructure.setClickable(true);
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.n.f7942c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.n.f7960w)) {
                                    viewStructure.setFocusable(true);
                                } else if (kotlin.jvm.internal.m.a(zVar3, j3.n.f7950k)) {
                                    z11 = true;
                                }
                            } else {
                                i12 = i13;
                            }
                            j12 >>= i12;
                            i16++;
                            i13 = i12;
                        }
                        if (i15 != i13) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                        i13 = 8;
                    } else if (i14 != length) {
                        break;
                        break;
                    } else {
                        i14++;
                        i13 = 8;
                    }
                }
            } else {
                j10 = 255;
                c10 = 7;
                j11 = -9187201950435737472L;
                dVar = null;
                z11 = false;
                aVar2 = null;
                hVar2 = null;
                fVar2 = null;
                mVar = null;
                bool = null;
                kVar2 = null;
                z12 = false;
                zBooleanValue = true;
                num = null;
            }
            aVar = aVar2;
            hVar = hVar2;
            fVar = fVar2;
            kVar = kVar2;
            z10 = zBooleanValue;
        }
        j3.o oVarZ2 = l0Var.z();
        if (oVarZ2 != null && oVarZ2.C && !oVarZ2.D) {
            oVarZ2 = oVarZ2.c();
            u.d0 d0Var = new u.d0(((m1.e) ((m1.b) l0Var.o()).B).C);
            d0Var.b(l0Var.o());
            while (d0Var.i()) {
                l0 l0Var2 = (l0) d0Var.k(d0Var.f14838b - 1);
                j3.o oVarZ3 = l0Var2.z();
                if (oVarZ3 != null && !oVarZ3.C) {
                    oVarZ2.h(oVarZ3);
                    if (!oVarZ3.D) {
                        d0Var.b(l0Var2.o());
                    }
                }
            }
        }
        if (oVarZ2 == null || (i0Var = oVarZ2.A) == null) {
            z13 = z10;
            list = null;
        } else {
            Object[] objArr5 = i0Var.f14857b;
            Object[] objArr6 = i0Var.f14858c;
            long[] jArr2 = i0Var.f14856a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                list = null;
                while (true) {
                    long j13 = jArr2[i18];
                    long[] jArr3 = jArr2;
                    Object[] objArr7 = objArr5;
                    if ((((~j13) << c10) & j13 & j11) != j11) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j13 & j10) < j9) {
                                int i21 = (i18 << 3) + i20;
                                Object obj3 = objArr7[i21];
                                i11 = i20;
                                Object obj4 = objArr6[i21];
                                objArr2 = objArr6;
                                j3.z zVar4 = (j3.z) obj3;
                                z17 = z10;
                                if (kotlin.jvm.internal.m.a(zVar4, j3.w.f7987j)) {
                                    viewStructure.setEnabled(false);
                                } else if (kotlin.jvm.internal.m.a(zVar4, j3.w.C)) {
                                    kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                i11 = i20;
                                objArr2 = objArr6;
                                z17 = z10;
                            }
                            j13 >>= 8;
                            i20 = i11 + 1;
                            objArr6 = objArr2;
                            z10 = z17;
                        }
                        objArr = objArr6;
                        z13 = z10;
                        if (i19 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr6;
                        z13 = z10;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    objArr5 = objArr7;
                    jArr2 = jArr3;
                    objArr6 = objArr;
                    z10 = z13;
                }
            } else {
                z13 = z10;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(l0Var.B);
        if (l0Var.x() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (dVar != null) {
            numValueOf = Integer.valueOf(dVar.f2610a);
        } else if (z11) {
            numValueOf = 1;
        } else {
            numValueOf = aVar != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (hVar != null) {
            String strH1 = hVar.B;
            if (strH1.length() >= 5000) {
                strH1 = (Character.isHighSurrogate(strH1.charAt(4999)) && Character.isLowSurrogate(strH1.charAt(5000))) ? r30.k.h1(4999, strH1) : r30.k.h1(5000, strH1);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strH1));
        }
        if (fVar != null) {
            viewStructure.setAutofillValue(fVar.f2612a);
        }
        if (mVar != null && (strArrJ2 = n.J(mVar)) != null) {
            viewStructure.setAutofillHints(strArrJ2);
        }
        bVar.f8932b.F(l0Var.B, new c2.n(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(aVar == l3.a.A);
        } else if (bool != null && (kVar == null || kVar.f7937a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        c2.m.f2621a.getClass();
        String str2 = (String) h00.n.D0(n.J(c2.l.f2618b));
        if (mVar != null && (strArrJ = n.J(mVar)) != null) {
            z14 = true;
            boolean z18 = h00.n.m0(str2, strArrJ);
            if (!z12 || z18) {
                z15 = z14;
            } else {
                z15 = false;
            }
            if (!z15 || z13) {
                z16 = z14;
            } else {
                z16 = false;
            }
            viewStructure.setDataIsSensitive(z16);
            viewStructure.setVisibility(((p1) l0Var.f2059g0.E).H1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strK = RuntimeVersion.SUFFIX;
                for (i10 = 0; i10 < size; i10++) {
                    strK = g4.c.k(x5.q(strK), ((m3.h) list.get(i10)).B, '\n');
                }
                viewStructure.setText(strK);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((m1.b) l0Var.o()).isEmpty() && kVar != null && (strX = m0.x(kVar.f7937a)) != null) {
                viewStructure.setClassName(strX);
            }
            if (z11) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z15) {
                    viewStructure.setInputType(129);
                }
            }
        }
        z14 = true;
        if (z12) {
            z15 = z14;
        } else {
            z15 = z14;
        }
        if (z15) {
            z16 = z14;
        } else {
            z16 = z14;
        }
        viewStructure.setDataIsSensitive(z16);
        viewStructure.setVisibility(((p1) l0Var.f2059g0.E).H1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strK = RuntimeVersion.SUFFIX;
            while (i10 < size) {
                strK = g4.c.k(x5.q(strK), ((m3.h) list.get(i10)).B, '\n');
            }
            viewStructure.setText(strK);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((m1.b) l0Var.o()).isEmpty()) {
            viewStructure.setClassName(strX);
        }
        if (z11) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z15) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static final s10.s J(i20.h hVar, k20.g gVar) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        kotlin.jvm.internal.m.e(gVar, "strings");
        String strX = x(gVar, hVar.C);
        List<i20.f> list = hVar.D;
        kotlin.jvm.internal.m.d(list, "getArgumentList(...)");
        ArrayList arrayList = new ArrayList();
        for (i20.f fVar : list) {
            i20.e eVar = fVar.D;
            kotlin.jvm.internal.m.d(eVar, "getValue(...)");
            s10.m0 m0VarK = K(eVar, gVar);
            g00.k kVar = m0VarK != null ? new g00.k(gVar.getString(fVar.C), m0VarK) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return new s10.s(strX, h00.d0.Y(arrayList));
    }

    public static final s10.m0 K(i20.e eVar, k20.g gVar) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        kotlin.jvm.internal.m.e(gVar, "strings");
        if (k20.e.P.g(eVar.M).booleanValue()) {
            i20.d dVar = eVar.C;
            int i10 = dVar != null ? t10.j.a[dVar.ordinal()] : -1;
            if (i10 == 1) {
                return new s10.i0((byte) eVar.D);
            }
            if (i10 == 2) {
                return new s10.l0((short) eVar.D);
            }
            if (i10 == 3) {
                return new j0((int) eVar.D);
            }
            if (i10 == 4) {
                return new k0(eVar.D);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + eVar.C).toString());
        }
        i20.d dVar2 = eVar.C;
        switch (dVar2 != null ? t10.j.a[dVar2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new s10.x((byte) eVar.D);
            case 2:
                return new g0((short) eVar.D);
            case 3:
                return new s10.c0((int) eVar.D);
            case 4:
                return new f0(eVar.D);
            case 5:
                return new s10.y((char) eVar.D);
            case 6:
                return new s10.b0(eVar.E);
            case 7:
                return new s10.z(eVar.F);
            case 8:
                return new s10.w(eVar.D != 0);
            case 9:
                return new s10.h0(gVar.getString(eVar.G));
            case 10:
                String strX = x(gVar, eVar.H);
                int i11 = eVar.L;
                return i11 == 0 ? new s10.d0(strX) : new s10.u(strX, i11);
            case 11:
                return new s10.a0(x(gVar, eVar.H), gVar.getString(eVar.I));
            case 12:
                i20.h hVar = eVar.J;
                kotlin.jvm.internal.m.d(hVar, "getAnnotation(...)");
                return new s10.t(J(hVar, gVar));
            case 13:
                List<i20.e> list = eVar.K;
                kotlin.jvm.internal.m.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList();
                for (i20.e eVar2 : list) {
                    kotlin.jvm.internal.m.b(eVar2);
                    s10.m0 m0VarK = K(eVar2, gVar);
                    if (m0VarK != null) {
                        arrayList.add(m0VarK);
                    }
                }
                return new s10.v(arrayList);
        }
    }

    public static final void L(j0.h hVar, fy.u uVar, u00.k kVar, float f3) {
        hy.g.c(hVar, "SEARCH_RECENT_SECTION_KEY", 2131887182, uVar.d, f3, 16, new as.d0(16, kVar), new as.d0(17, kVar), new bs.e(3, kVar), new fy.r(0, kVar));
    }

    public static final r6.a M(androidx.lifecycle.p pVar, l1.j jVar) {
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) ((l1.g0) jVar).k(r6.d.f13126a);
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zG = g0Var.g(wVar);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new r6.a();
            g0Var.n0(objN);
        }
        r6.a aVar = (r6.a) objN;
        boolean zI = g0Var.i(aVar) | g0Var.i(wVar);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            objN2 = new mu.q(wVar, aVar, 13);
            g0Var.n0(objN2);
        }
        l1.q.c(aVar, wVar, (u00.k) objN2, jVar);
        boolean zI2 = g0Var.i(aVar) | g0Var.e(pVar.ordinal());
        Object objN3 = g0Var.N();
        if (zI2 || objN3 == cVar) {
            objN3 = new lu.w(aVar, pVar, (k00.c) null, 10);
            g0Var.n0(objN3);
        }
        l1.q.h(aVar, pVar, (u00.n) objN3, jVar);
        return aVar;
    }

    public static final void N(j0.h hVar, fy.u uVar, u00.k kVar, float f3) {
        hy.g.c(hVar, "SEARCH_RESULTS_SECTION_KEY", 2131887183, uVar.b, f3, 16, new as.d0(18, kVar), new as.d0(19, kVar), new bs.e(4, kVar), (fy.r) null);
    }

    public static final b2.r O(b2.r rVar, float f3) {
        return h0.c.G(rVar, f3, 16, f3, 0.0f, 8);
    }

    public static boolean P(a8.m mVar, boolean z10) {
        int i10;
        e7.u uVar = new e7.u(16);
        boolean z11 = true;
        while (true) {
            uVar.K(8);
            if (!mVar.i(uVar.f5182a, 0, 8, true)) {
                break;
            }
            long jC = uVar.C();
            int iM = uVar.m();
            if (jC != 1) {
                i10 = 8;
            } else {
                if (!mVar.i(uVar.f5182a, 8, 8, true)) {
                    break;
                }
                jC = uVar.G();
                i10 = 16;
            }
            long j9 = i10;
            if (jC < j9) {
                break;
            }
            int i11 = (int) (jC - j9);
            if (z11) {
                if (iM != 1718909296 || i11 < 8) {
                    break;
                }
                uVar.K(4);
                mVar.i(uVar.f5182a, 0, 4, false);
                if (uVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    return true;
                }
                mVar.b(i11 - 4, false);
                z11 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    mVar.b(i11, false);
                }
            }
        }
        return false;
    }

    public static final String Q(int i10, int i11) {
        return w.c.h(i10, i11, "surah/", "/");
    }

    public static n20.c R(n20.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "shortName");
        String strB = eVar.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return new n20.c(new n20.d(strB, n20.c.c.a, eVar));
    }

    public static String S(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 127);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int T(j0.n nVar) {
        ?? r4 = nVar.f7781k;
        if (r4.isEmpty()) {
            return 0;
        }
        int size = r4.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((j0.o) r4.get(i11)).f7799p;
        }
        return (i10 / r4.size()) + nVar.f7785q;
    }

    public static final List U(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((mr.b) it.next()).b == mr.c.G) {
                    return arrayList;
                }
            }
        }
        mr.b bVar = new mr.b("audio-stories", mr.c.G);
        Iterator it2 = arrayList.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            if (((mr.b) it2.next()).b == mr.c.C) {
                ArrayList arrayListO1 = h00.q.o1(arrayList);
                arrayListO1.add(i10 + 1, bVar);
                return arrayListO1;
            }
            i10++;
        }
        i10 = -1;
        ArrayList arrayListO2 = h00.q.o1(arrayList);
        arrayListO2.add(i10 + 1, bVar);
        return arrayListO2;
    }

    public static int V(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) {
        int i11 = i10 + 1;
        byte b7 = bArr[i10];
        if (b7 < 0) {
            return W(b7, bArr, i11, dVar);
        }
        dVar.f881a = b7;
        return i11;
    }

    public static int W(int i10, byte[] bArr, int i11, androidx.glance.appwidget.protobuf.d dVar) {
        byte b7 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b7 >= 0) {
            dVar.f881a = i13 | (b7 << 7);
            return i12;
        }
        int i14 = i13 | ((b7 & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            dVar.f881a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            dVar.f881a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            dVar.f881a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                dVar.f881a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int X(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) {
        long j9 = bArr[i10];
        int i11 = i10 + 1;
        if (j9 >= 0) {
            dVar.f882b = j9;
            return i11;
        }
        int i12 = i10 + 2;
        byte b7 = bArr[i11];
        long j10 = (j9 & 127) | (((long) (b7 & 127)) << 7);
        int i13 = 7;
        while (b7 < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b10 & 127)) << i13;
            b7 = b10;
            i12 = i14;
        }
        dVar.f882b = j10;
        return i12;
    }

    public static int Y(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long Z(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static q3.a0 a(int i10, q3.u uVar, int i11, q3.t tVar, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return new q3.a0(i10, uVar, i11, tVar);
    }

    public static int a0(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        int iV = V(bArr, i10, dVar);
        int i11 = dVar.f881a;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            dVar.f883c = RuntimeVersion.SUFFIX;
            return iV;
        }
        int i12 = q6.f3840a;
        int length = bArr.length;
        if ((((length - iV) - i11) | iV | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iV), Integer.valueOf(i11)));
        }
        int i13 = iV + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iV < i13) {
            byte b7 = bArr[iV];
            if (b7 < 0) {
                break;
            }
            iV++;
            cArr[i14] = (char) b7;
            i14++;
        }
        while (iV < i13) {
            int i15 = iV + 1;
            byte b10 = bArr[iV];
            if (b10 >= 0) {
                cArr[i14] = (char) b10;
                i14++;
                iV = i15;
                while (iV < i13) {
                    byte b11 = bArr[iV];
                    if (b11 < 0) {
                        break;
                    }
                    iV++;
                    cArr[i14] = (char) b11;
                    i14++;
                }
            } else {
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i15 >= i13 - 2) {
                            throw new zzmr("Protocol message had invalid UTF-8.");
                        }
                        byte b12 = bArr[i15];
                        int i16 = iV + 3;
                        byte b13 = bArr[iV + 2];
                        iV += 4;
                        byte b14 = bArr[i16];
                        if (!t1.i0(b12)) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && !t1.i0(b13) && !t1.i0(b14)) {
                                int i17 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                cArr[i14] = (char) ((i17 >>> 10) + 55232);
                                cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                                i14 += 2;
                            }
                        }
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    if (i15 >= i13 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    int i18 = i14 + 1;
                    int i19 = iV + 2;
                    byte b15 = bArr[i15];
                    iV += 3;
                    byte b16 = bArr[i19];
                    if (!t1.i0(b15)) {
                        if (b10 != -32) {
                            if (b10 != -19) {
                                if (!t1.i0(b16)) {
                                    cArr[i14] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                                    i14 = i18;
                                }
                            } else if (b15 < -96) {
                                b10 = -19;
                                if (!t1.i0(b16)) {
                                    cArr[i14] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                                    i14 = i18;
                                }
                            }
                        } else if (b15 >= -96) {
                            b10 = -32;
                            if (b10 != -19) {
                                if (!t1.i0(b16)) {
                                    cArr[i14] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                                    i14 = i18;
                                }
                            } else if (b15 < -96) {
                                b10 = -19;
                                if (!t1.i0(b16)) {
                                    cArr[i14] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                                    i14 = i18;
                                }
                            }
                        }
                    }
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                int i20 = i14 + 1;
                iV += 2;
                byte b17 = bArr[i15];
                if (b10 < -62 || t1.i0(b17)) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b17 & 63) | ((b10 & 31) << 6));
                i14 = i20;
            }
        }
        dVar.f883c = new String(cArr, 0, i14);
        return i13;
    }

    public static final void b(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1588049115);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, zs.a.class, aVarA, null, g0Var);
            }
            zs.a aVar = (zs.a) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar2) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, zs.b.class, aVarA2, null, g0Var);
            }
            zs.b bVar = (zs.b) objN2;
            h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("INSIGHTS_SCOPE_KEY", new b60.b("INSIGHTS_SCOPE_KEY")), g0Var);
            Object objU0 = h00.q.U0(bVar.a);
            boolean zG3 = g0Var.g(bVar) | g0Var.g(aVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar2) {
                objN3 = new a1.c0(bVar, aVar, cVar, 14);
                g0Var.n0(objN3);
            }
            l1.q.i(objU0, g0Var, (u00.n) objN3);
            z1.p pVar = bVar.a;
            h0.a0 a0Var = z1.f6478c;
            boolean zG4 = g0Var.g(bVar);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar2) {
                av.k kVar = new av.k(0, bVar, zs.b.class, "navigateBack", "navigateBack()V", 0, 6);
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            List listS = va.a.S(bi.b.N(g0Var), p30.f.o0(g0Var));
            q2 q2Var = cq.l.a;
            p30.f.O(pVar, a0Var, (b2.d) null, (a10.g) objN4, listS, (sg.f) null, (u00.k) null, (u00.k) null, (u00.n) null, new e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dm.a(i10, 16);
        }
    }

    public static int b0(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        int iV = V(bArr, i10, dVar);
        int i11 = dVar.f881a;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iV) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            dVar.f883c = v4.C;
            return iV;
        }
        dVar.f883c = v4.e(iV, i11, bArr);
        return iV + i11;
    }

    public static final void c(final b2.r rVar, k0.y yVar, final k0.e eVar, final n1 n1Var, final t0 t0Var, final boolean z10, final h1 h1Var, final h0.h hVar, final h0.e eVar2, final u00.k kVar, l1.j jVar, final int i10, final int i11) {
        int i12;
        int i13;
        k0.y yVar2;
        l1.g0 g0Var;
        boolean z11;
        Object oVar;
        k0.y yVar3;
        boolean z12;
        boolean z13;
        a10.r rVar2;
        b2.r rVarM;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(708740370);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.g(yVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? g0Var2.g(eVar) : g0Var2.i(eVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var2.g(n1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= g0Var2.h(false) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= g0Var2.h(true) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= g0Var2.g(t0Var) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= g0Var2.h(z10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= g0Var2.g(h1Var) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= g0Var2.g(hVar) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (g0Var2.g(eVar2) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if (g0Var2.S(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true)) {
            g0Var2.X();
            if ((i10 & 1) != 0 && !g0Var2.A()) {
                g0Var2.V();
            }
            g0Var2.s();
            int i14 = i12 >> 3;
            int i15 = i14 & 14;
            int i16 = i15 | (i13 & 112);
            z0 z0VarG = l1.q.G(kVar, g0Var2);
            int i17 = i12;
            boolean z14 = (((i16 & 14) ^ 6) > 4 && g0Var2.g(yVar)) || (i16 & 6) == 4;
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.f9868a;
            if (z14 || objN == cVar) {
                l1.c cVar2 = l1.c.E;
                objN = new f40.h(0, 4, p2.class, l1.q.q(cVar2, new o1(l1.q.q(cVar2, new ct.k(z0VarG, 9)), yVar, 23)), "value", "getValue()Ljava/lang/Object;");
                g0Var2.n0(objN);
            }
            a10.r rVar3 = (a10.r) objN;
            int i18 = i15 | ((i17 >> 9) & 112);
            boolean z15 = ((((i18 & 14) ^ 6) > 4 && g0Var2.g(yVar)) || (i18 & 6) == 4) | ((((i18 & 112) ^ 48) > 32 && g0Var2.h(false)) || (i18 & 48) == 32);
            Object objN2 = g0Var2.N();
            if (z15 || objN2 == cVar) {
                objN2 = new k0.b0(yVar);
                g0Var2.n0(objN2);
            }
            k0.b0 b0Var = (k0.b0) objN2;
            Object objN3 = g0Var2.N();
            if (objN3 == cVar) {
                objN3 = l1.q.o(g0Var2);
                g0Var2.n0(objN3);
            }
            a40.z zVar = (a40.z) objN3;
            i2.y yVar4 = (i2.y) g0Var2.k(c3.o1.f2733g);
            l0.f fVar = !((Boolean) g0Var2.k(c3.o1.f2747w)).booleanValue() ? l0.o1.f9782a : null;
            int i19 = (i17 & 524272) | ((i13 << 18) & 3670016) | ((i17 >> 6) & 29360128);
            boolean z16 = ((((i19 & 896) ^ 384) > 256 && g0Var2.g(eVar)) || (i19 & 384) == 256) | ((((i19 & 112) ^ 48) > 32 && g0Var2.g(yVar)) || (i19 & 48) == 32) | ((((i19 & 7168) ^ 3072) > 2048 && g0Var2.g(n1Var)) || (i19 & 3072) == 2048);
            if (((57344 & i19) ^ 24576) > 16384 && g0Var2.h(false)) {
                z11 = true;
            } else if ((i19 & 24576) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zG = ((((i19 & 29360128) ^ 12582912) > 8388608 && g0Var2.g(hVar)) || (i19 & 12582912) == 8388608) | z16 | z11 | ((((458752 & i19) ^ 196608) > 131072 && g0Var2.h(true)) || (i19 & 196608) == 131072) | ((((i19 & 3670016) ^ 1572864) > 1048576 && g0Var2.g(eVar2)) || (i19 & 1572864) == 1048576) | g0Var2.g(yVar4);
            Object objN4 = g0Var2.N();
            if (zG || objN4 == cVar) {
                yVar3 = yVar;
                z12 = false;
                z13 = true;
                oVar = new k0.o(yVar3, n1Var, rVar3, eVar, hVar, eVar2, zVar, yVar4, fVar);
                rVar2 = rVar3;
                g0Var2.n0(oVar);
            } else {
                oVar = objN4;
                rVar2 = rVar3;
                z12 = false;
                z13 = true;
                yVar3 = yVar;
            }
            n0 n0Var = (n0) oVar;
            q1 q1Var = q1.A;
            if (z10) {
                g0Var2.c0(27281635);
                if (((i15 ^ 6) <= 4 || !g0Var2.g(yVar3)) && (i14 & 6) != 4) {
                    z13 = z12;
                }
                Object objN5 = g0Var2.N();
                if (z13 || objN5 == cVar) {
                    objN5 = new k0.f(yVar3);
                    g0Var2.n0(objN5);
                }
                rVarM = l0.q.m((k0.f) objN5, yVar3.f8554n, q1Var);
                g0Var2.r(z12);
            } else {
                g0Var2.c0(27577840);
                g0Var2.r(z12);
                rVarM = b2.o.A;
            }
            yVar2 = yVar3;
            g0Var = g0Var2;
            l0.q.a(rVar2, z.n.n(l0.q.n(rVar.V(yVar3.f8553k).V(yVar3.l), rVar2, b0Var, q1Var, z10).V(rVarM).V(yVar3.m.f9739k), yVar3, q1Var, h1Var, z10, t0Var, yVar3.f8548f, null), yVar2.f8555o, n0Var, g0Var, 0);
        } else {
            yVar2 = yVar;
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final k0.y yVar5 = yVar2;
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kh.o.c(rVar, yVar5, eVar, n1Var, t0Var, z10, h1Var, hVar, eVar2, kVar, (l1.j) obj, l1.q.K(i10 | 1), l1.q.K(i11));
                    return g00.b0.a;
                }
            };
        }
    }

    public static int c0(Object obj, f6 f6Var, byte[] bArr, int i10, int i11, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        int iW = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iW = W(i12, bArr, iW, dVar);
            i12 = dVar.f881a;
        }
        int i13 = iW;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = dVar.f884d + 1;
        dVar.f884d = i14;
        if (i14 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        f6Var.d(obj, bArr, i13, i15, dVar);
        dVar.f884d--;
        dVar.f883c = obj;
        return i15;
    }

    public static final void d(float r45, int r46, int r47, b2.h r48, b2.r r49, e0.h r50, e0.o r51, h0.n1 r52, l1.j r53, m0.g r54, m0.w r55, u2.a r56, v1.c r57, z.h1 r58, boolean r59) {
        throw new UnsupportedOperationException("Method not decompiled: kh.o.d(float, int, int, b2.h, b2.r, e0.h, e0.o, h0.n1, l1.j, m0.g, m0.w, u2.a, v1.c, z.h1, boolean):void");
    }

    public static int d0(Object obj, f6 f6Var, byte[] bArr, int i10, int i11, int i12, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        y5 y5Var = (y5) f6Var;
        int i13 = dVar.f884d + 1;
        dVar.f884d = i13;
        if (i13 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = y5Var.s(obj, bArr, i10, i11, i12, dVar);
        dVar.f884d--;
        dVar.f883c = obj;
        return iS;
    }

    public static final void e(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-583983467);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            hw.j jVarS = c7.i.S(b0Var.b(hw.j.class), f1VarA.getViewModelStore(), null, bVarZ, aVarA, null);
            z0 z0VarQ = k00.f.q(((vm.a) jVarS).c.d, g0Var, 0);
            e60.a aVarA2 = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(b0Var, cq.a.class, aVarA2, null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.f6423w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).f6430g, g0Var);
            k0.y yVarA = k0.a0.a(0, g0Var, 3);
            p2 p2VarC = sm.a.c(yVarA, g0Var);
            String strU = z3.U(g0Var, 2131887119);
            j1.r rVarD = j1.k.d(g0Var);
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.r(new hw.d(yVarA, 0));
                g0Var.n0(objN2);
            }
            p2 p2Var = (p2) objN2;
            boolean zG2 = g0Var.g(jVarS) | g0Var.i(aVar);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar2) {
                objN3 = new g6.a(jVarS, aVar, cVar, 6);
                g0Var.n0(objN3);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN3);
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
            float fFloatValue = ((Number) p2Var.getValue()).floatValue();
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.f6456a;
            b2.o oVar = b2.o.A;
            wr.k.N(fFloatValue, sVar.a(oVar, iVar), 0.0f, 0L, 0L, g0Var, 0);
            boolean z10 = ((hw.f) z0VarQ.getValue()).c;
            boolean zG3 = g0Var.g(jVarS);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar2) {
                objN4 = new g1.l0(jVarS, 8);
                g0Var.n0(objN4);
            }
            j1.k.b(z10, (u00.a) objN4, a0Var, rVarD, null, v1.d.d(-101399180, new bz.n(aVar2, t0VarL, n1Var, rVarD, z0VarQ, 2), g0Var), v1.d.d(698175349, new bz.o(strU, jVarS, yVarA, z0VarQ, 3), g0Var), g0Var, 1769856);
            sm.a.a(strU, ((Number) p2VarC.getValue()).floatValue(), sVar.a(oVar, iVar), 0.0f, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c8(i10, 11);
        }
    }

    public static int e0(int i10, byte[] bArr, int i11, int i12, k5 k5Var, androidx.glance.appwidget.protobuf.d dVar) {
        f5 f5Var = (f5) k5Var;
        int iV = V(bArr, i11, dVar);
        f5Var.e(dVar.f881a);
        while (iV < i12) {
            int iV2 = V(bArr, iV, dVar);
            if (i10 != dVar.f881a) {
                break;
            }
            iV = V(bArr, iV2, dVar);
            f5Var.e(dVar.f881a);
        }
        return iV;
    }

    public static final void f(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(340166934);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, fw.b.class, aVarA, null, g0Var);
            }
            fw.b bVar = (fw.b) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar2) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, fw.c.class, aVarA2, null, g0Var);
            }
            fw.c cVar3 = (fw.c) objN2;
            h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("PLAYLISTS_SCOPE_KEY", new b60.b("PLAYLISTS_SCOPE_KEY")), g0Var);
            Object objU0 = h00.q.U0(cVar3.a);
            boolean zG3 = g0Var.g(cVar3) | g0Var.g(bVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar2) {
                objN3 = new a1.c0(cVar3, bVar, cVar, 20);
                g0Var.n0(objN3);
            }
            l1.q.i(objU0, g0Var, (u00.n) objN3);
            z1.p pVar = cVar3.a;
            h0.a0 a0Var = z1.f6478c;
            boolean zG4 = g0Var.g(cVar3);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar2) {
                av.k kVar = new av.k(0, cVar3, fw.c.class, "navigateBack", "navigateBack()V", 0, 15);
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            List listS = va.a.S(bi.b.N(g0Var), p30.f.o0(g0Var));
            q2 q2Var = cq.l.a;
            p30.f.O(pVar, a0Var, (b2.d) null, (a10.g) objN4, listS, (sg.f) null, (u00.k) null, (u00.k) null, (u00.n) null, new e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c8(i10, 3);
        }
    }

    public static int f0(byte[] bArr, int i10, k5 k5Var, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        f5 f5Var = (f5) k5Var;
        int iV = V(bArr, i10, dVar);
        int i11 = dVar.f881a + iV;
        while (iV < i11) {
            iV = V(bArr, iV, dVar);
            f5Var.e(dVar.f881a);
        }
        if (iV == i11) {
            return iV;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static final void g(fy.u uVar, u00.k kVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1617894851);
        int i11 = (g0Var.i(uVar) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.f6423w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).f6430g, g0Var);
            float fA = ((gm.a) g0Var.k(dl.e.a)).a();
            String strU = z3.U(g0Var, 2131887196);
            j0.v vVarA = j0.x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            kk.c cVarD = kk.e.d(g0Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = l1.q.r(new el.b(vVarA, 2));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
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
            float fFloatValue = ((Number) p2Var.getValue()).floatValue();
            b2.o oVar = b2.o.A;
            b2.r rVarA = kk.e.a(oVar, cVarD);
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.f6456a;
            wr.k.N(fFloatValue, sVar.a(rVarA, iVar), 0.0f, 0L, 0L, g0Var, 0);
            h0.p1 p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c(), 0.0f, t0VarL.a() + n1Var.a(), 5);
            boolean zD = g0Var.d(fA) | g0Var.g(strU) | ((i11 & 14) == 4 || g0Var.i(uVar)) | ((i11 & 112) == 32);
            Object objN2 = g0Var.N();
            if (zD || objN2 == cVar) {
                objN2 = new fy.t(uVar, kVar, fA, strU);
                g0Var.n0(objN2);
            }
            g0Var = g0Var;
            k00.f.d(a0Var, vVarA, p1VarG, (h0.h) null, (b2.c) null, (t0) null, false, (h1) null, (u00.k) objN2, g0Var, 6, 504);
            sm.a.a(strU, ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar), 0.0f, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.i(uVar, kVar, i10, 14);
        }
    }

    public static int g0(f6 f6Var, int i10, byte[] bArr, int i11, int i12, k5 k5Var, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        e5 e5VarZza = f6Var.zza();
        f6 f6Var2 = f6Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        androidx.glance.appwidget.protobuf.d dVar2 = dVar;
        int iC0 = c0(e5VarZza, f6Var2, bArr2, i11, i13, dVar2);
        f6Var2.g(e5VarZza);
        dVar2.f883c = e5VarZza;
        k5Var.add(e5VarZza);
        while (iC0 < i13) {
            androidx.glance.appwidget.protobuf.d dVar3 = dVar2;
            int i14 = i13;
            int iV = V(bArr2, iC0, dVar3);
            if (i10 != dVar3.f881a) {
                break;
            }
            byte[] bArr3 = bArr2;
            f6 f6Var3 = f6Var2;
            e5 e5VarZza2 = f6Var3.zza();
            iC0 = c0(e5VarZza2, f6Var3, bArr3, iV, i14, dVar3);
            f6Var2 = f6Var3;
            bArr2 = bArr3;
            i13 = i14;
            dVar2 = dVar3;
            f6Var2.g(e5VarZza2);
            dVar2.f883c = e5VarZza2;
            k5Var.add(e5VarZza2);
        }
        return iC0;
    }

    public static final void h(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1552219046);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            fy.c0 c0VarS = c7.i.S(b0Var.b(fy.c0.class), f1VarA.getViewModelStore(), null, bVarZ, aVarA, null);
            z0 z0VarQ = k00.f.q(((vm.a) c0VarS).c.d, g0Var, 0);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, cq.a.class, aVarA2, null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA3);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(b0Var, aq.a.class, aVarA3, null, g0Var);
            }
            aq.a aVar2 = (aq.a) objN2;
            boolean zG3 = g0Var.g(c0VarS) | g0Var.i(aVar) | g0Var.i(aVar2);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = new ev.p(c0VarS, aVar, aVar2, (k00.c) null, 2);
                g0Var.n0(objN3);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN3);
            fy.u uVar = (fy.u) z0VarQ.getValue();
            boolean zG4 = g0Var.g(c0VarS);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                g1 g1Var = new g1(1, c0VarS, fy.c0.class, "action", "action(Lcom/mchutov/quranify/search/presentation/screen/SearchAction;)V", 0, 26);
                g0Var.n0(g1Var);
                objN4 = g1Var;
            }
            g(uVar, (a10.g) objN4, g0Var, 8);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new fo.b(i10);
        }
    }

    public static int h0(int i10, byte[] bArr, int i11, int i12, j6 j6Var, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iX = X(bArr, i11, dVar);
            j6Var.d(i10, Long.valueOf(dVar.f882b));
            return iX;
        }
        if (i13 == 1) {
            j6Var.d(i10, Long.valueOf(Z(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iV = V(bArr, i11, dVar);
            int i14 = dVar.f881a;
            if (i14 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iV) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                j6Var.d(i10, v4.C);
            } else {
                j6Var.d(i10, v4.e(iV, i14, bArr));
            }
            return iV + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            j6Var.d(i10, Integer.valueOf(Y(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        j6 j6VarA = j6.a();
        int i16 = dVar.f884d + 1;
        dVar.f884d = i16;
        if (i16 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iV2 = V(bArr, i11, dVar);
            int i18 = dVar.f881a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iV2;
                break;
            }
            i11 = h0(i18, bArr, iV2, i12, j6VarA, dVar);
            i17 = i18;
        }
        dVar.f884d--;
        if (i11 > i12 || i17 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        j6Var.d(i10, j6VarA);
        return i11;
    }

    public static final e10.g i(d10.y yVar, boolean z10) throws NoWhenBranchMatchedException, a40.b0 {
        v0 v0Var;
        Method method;
        e10.x rVar;
        l20.c cVar;
        e10.x tVar;
        if (l1.A.b(yVar.A().J)) {
            return e10.a0.a;
        }
        n20.b bVar = c2.a;
        y0 y0VarB = c2.b(yVar.A().A());
        if (y0VarB instanceof y0) {
            y0 y0Var = y0VarB;
            k20.g gVar = y0Var.e;
            l20.d dVar = y0Var.d;
            if (z10) {
                if (dVar.g()) {
                    cVar = dVar.E;
                } else {
                    cVar = null;
                }
            } else if ((dVar.B & 8) == 8) {
                cVar = dVar.F;
            } else {
                cVar = null;
            }
            Method methodY = cVar != null ? yVar.A().H.y(gVar.getString(cVar.C), gVar.getString(cVar.D)) : null;
            if (methodY != null) {
                if (!Modifier.isStatic(methodY.getModifiers())) {
                    tVar = t1.D(yVar) ? new e10.r(methodY, w(yVar)) : new e10.v(methodY);
                } else if (yVar.A().A().getAnnotations().d(i2.a)) {
                    tVar = t1.D(yVar) ? new e10.s(methodY, false, 4) : new e10.v(4, 1, methodY, true);
                } else {
                    tVar = t1.D(yVar) ? new e10.t(methodY, false, w(yVar)) : new e10.v(6, 2, methodY, false);
                }
                rVar = tVar;
            } else if (q20.f.d(yVar.A().A()) && kotlin.jvm.internal.m.a(yVar.A().A().getVisibility(), j10.p.d)) {
                Class clsJ0 = n.j0(yVar.A().A().l());
                if (clsJ0 == null) {
                    throw new a40.b0("Underlying property of inline class " + yVar.A() + " should have a field");
                }
                Method methodL = n.L(clsJ0, yVar.A().A());
                rVar = t1.D(yVar) ? new e10.x(methodL, w(yVar)) : new e10.y(methodL, va.a.R(methodL.getDeclaringClass()));
            } else {
                Field field = (Field) yVar.A().L.getValue();
                if (field == null) {
                    throw new a40.b0("No accessors or field is found for property " + yVar.A());
                }
                rVar = r(yVar, z10, field);
            }
        } else if (y0VarB instanceof d10.w0) {
            rVar = r(yVar, z10, ((d10.w0) y0VarB).b);
        } else {
            if (!(y0VarB instanceof x0)) {
                if (!(y0VarB instanceof d10.z0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    v0Var = ((d10.z0) y0VarB).b;
                } else {
                    v0Var = ((d10.z0) y0VarB).c;
                    if (v0Var == null) {
                        throw new a40.b0("No setter found for property " + yVar.A());
                    }
                }
                l1 l1Var = yVar.A().H;
                m20.e eVar = v0Var.b;
                Method methodY2 = l1Var.y(eVar.b, eVar.c);
                if (methodY2 != null) {
                    Modifier.isStatic(methodY2.getModifiers());
                    return t1.D(yVar) ? new e10.r(methodY2, w(yVar)) : new e10.v(methodY2);
                }
                throw new a40.b0("No accessor found for property " + yVar.A());
            }
            if (z10) {
                method = ((x0) y0VarB).b;
            } else {
                x0 x0Var = (x0) y0VarB;
                method = x0Var.c;
                if (method == null) {
                    throw new a40.b0("No source found for setter of Java method property: " + x0Var.b);
                }
            }
            rVar = t1.D(yVar) ? new e10.r(method, w(yVar)) : new e10.v(method);
        }
        return n.B(rVar, yVar.z(), false);
    }

    public static int i0(int i10, byte[] bArr, int i11, int i12, androidx.glance.appwidget.protobuf.d dVar) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return X(bArr, i11, dVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return V(bArr, i11, dVar) + dVar.f881a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = V(bArr, i11, dVar);
            i15 = dVar.f881a;
            if (i15 == i14) {
                break;
            }
            i11 = i0(i15, bArr, i11, i12, dVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzmr("Failed to parse the message.");
        }
        return i11;
    }

    public static final boolean j(e2.g gVar, long j9) {
        if (!gVar.A.N) {
            return false;
        }
        b3.u uVar = (b3.u) b3.m.y(gVar).f2059g0.D;
        if (!uVar.f2133u0.N) {
            return false;
        }
        long jD0 = uVar.d0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD0 & 4294967295L));
        long j10 = gVar.R;
        float f3 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f10 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f3) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f10;
    }

    public static final Object[] k(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        h00.n.v0(0, i10, 6, objArr, objArr2);
        h00.n.q0(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] l(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        h00.n.v0(0, i10, 6, objArr, objArr2);
        h00.n.q0(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void m(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "methodName");
        Trace.beginAsyncSection(S(str), i10);
    }

    public static final void n(String str) {
        kotlin.jvm.internal.m.e(str, "label");
        Trace.beginSection(S(str));
    }

    public static final long o(int i10, int i11, w2 w2Var) {
        a1.t0 t0Var;
        t2 t2Var;
        if (i10 == -1) {
            return (((long) i11) << 32) | (4294967295L & ((long) (-1)));
        }
        boolean z10 = i10 > i11;
        l1.w wVar = w2Var.f138d;
        c1 c1Var = (wVar == null || (t2Var = (t2) wVar.getValue()) == null) ? null : t2Var.f133b;
        long jA = c1Var != null ? c1Var.a(i10, false) : m3.h0.b(i10, i10);
        long jF = w2Var.f(jA);
        if (q0.d(jA) && q0.d(jF)) {
            t0Var = a1.t0.A;
        } else if (q0.d(jA) || q0.d(jF)) {
            t0Var = (!q0.d(jA) || q0.d(jF)) ? a1.t0.D : a1.t0.B;
        } else {
            t0Var = a1.t0.C;
        }
        int iOrdinal = t0Var.ordinal();
        if (iOrdinal == 0) {
            return k00.f.t(i10, z10 ? x2.A : x2.B);
        }
        if (iOrdinal == 1) {
            if (z10) {
                return i10 == ((int) (jF >> 32)) ? k00.f.t(i10, x2.A) : k00.f.t((int) (jF & 4294967295L), x2.B);
            }
            return i10 == ((int) (jF & 4294967295L)) ? k00.f.t(i10, x2.B) : k00.f.t((int) (jF >> 32), x2.A);
        }
        if (iOrdinal == 2) {
            return z10 ? k00.f.t((int) (jF & 4294967295L), x2.A) : k00.f.t((int) (jF >> 32), x2.B);
        }
        if (iOrdinal == 3) {
            return (((long) i10) << 32) | (4294967295L & ((long) (-1)));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void p(long j9, long j10) {
        y3.p[] pVarArr = y3.o.f16598b;
        if ((j9 & 1095216660480L) == 0 || (1095216660480L & j10) == 0) {
            y3.i.a("Cannot perform operation for Unspecified type.");
        }
        if (y3.p.a(y3.o.b(j9), y3.o.b(j10))) {
            return;
        }
        y3.i.a("Cannot perform operation for " + ((Object) y3.p.b(y3.o.b(j9))) + " and " + ((Object) y3.p.b(y3.o.b(j10))));
    }

    public static int q(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final e10.w r(d10.y yVar, boolean z10, Field field) {
        c30.s sVarA = yVar.A().A();
        j10.k kVarL = sVarA.l();
        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
        if (q20.d.k(kVarL)) {
            j10.k kVarL2 = kVarL.l();
            if ((q20.d.l(kVarL2, j10.f.B) || q20.d.l(kVarL2, j10.f.E)) && (!(sVarA instanceof c30.s) || !m20.g.d(sVarA.b0))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (yVar.A().A().getAnnotations().d(i2.a)) {
                        if (z10) {
                        }
                    }
                    if (z10) {
                        if (t1.D(yVar)) {
                        }
                    }
                    if (t1.D(yVar)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (yVar.A().A().getAnnotations().d(i2.a)) {
                return z10 ? new e10.l(field, false, 2) : new e10.p(field, s(yVar), false, 2);
            }
            if (z10) {
                return t1.D(yVar) ? new e10.k(field, false) : new e10.l(field, true, 1);
            }
            return t1.D(yVar) ? new e10.o(field, s(yVar), false) : new e10.p(field, s(yVar), true, 1);
        }
        if (z10) {
            if (t1.D(yVar)) {
                return new e10.j(field, w(yVar));
            }
            kotlin.jvm.internal.m.e(field, "field");
            return new e10.l(field, true, 0);
        }
        if (t1.D(yVar)) {
            return new e10.n(field, s(yVar), w(yVar));
        }
        boolean zS = s(yVar);
        kotlin.jvm.internal.m.e(field, "field");
        return new e10.p(field, zS, true, 0);
    }

    public static final boolean s(d10.y yVar) {
        return !e30.x0.e(yVar.A().A().getType());
    }

    public static void t(i7.z zVar) {
        zVar.setAudioAttributes(new androidx.media3.common.d(2, 0, 1, 1, 0, false, true), true);
        zVar.A();
        if (zVar.f7489l0) {
            return;
        }
        zVar.f7510y.o(true);
    }

    public static final void u(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "methodName");
        Trace.endAsyncSection(S(str), i10);
    }

    public static final d4.k v(Executor executor, String str, u00.a aVar) {
        kotlin.jvm.internal.m.e(executor, "<this>");
        return h0.A(new ce.a(executor, str, aVar, 17));
    }

    public static final Object w(d10.y yVar) {
        d10.m0 m0VarA = yVar.A();
        return n.z(m0VarA.K, m0VarA.A());
    }

    public static final String x(k20.g gVar, int i10) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        String strA = gVar.a(i10);
        return gVar.b(i10) ? a1.b.o(".", strA) : strA;
    }

    public static final long y(double d3) {
        return F((float) d3, 4294967296L);
    }

    public static final long z(int i10) {
        return F(i10, 4294967296L);
    }
}
