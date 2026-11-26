package kh;

import a1.s2;
import a1.w2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.window.BackEvent;
import androidx.media3.common.q0;
import c3.o0;
import c3.o1;
import c3.t2;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import d0.q1;
import d0.t0;
import d10.d2;
import d10.g2;
import d10.i2;
import d10.w1;
import e30.x0;
import g00.b0;
import g1.o3;
import g1.x5;
import g1.z6;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.v0;
import j10.e0;
import j10.u0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import l0.b1;
import l0.n0;
import l1.f1;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import m10.r0;
import p1.l0;
import q0.y0;
import qd.s0;
import s10.k1;
import s10.l1;
import s10.m0;
import s10.p0;
import w.e2;
import z.h1;
import z.i1;
import z2.w0;

public abstract class n {
    public static x20.n A(String str, Collection collection) {
        x20.a aVar;
        kotlin.jvm.internal.m.e(str, "message");
        kotlin.jvm.internal.m.e(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(h00.r.q0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((e30.w) it.next()).N());
        }
        n30.f fVarV = w50.c.V(arrayList);
        int i10 = fVarV.A;
        if (i10 != 0) {
            aVar = i10 != 1 ? new x20.a(str, (x20.n[]) fVarV.toArray(new x20.n[0])) : (x20.n) fVarV.get(0);
        } else {
            aVar = x20.m.b;
        }
        return fVarV.A <= 1 ? aVar : new x20.j(aVar);
    }

    public static final e10.g B(e10.g gVar, j10.c cVar, boolean z10) {
        List listO;
        e30.w returnType;
        e30.w wVarK;
        j10.h hVarG;
        boolean zB;
        Iterator it;
        e30.w type;
        kotlin.jvm.internal.m.e(cVar, "descriptor");
        if (!q20.f.a(cVar)) {
            List listB0 = cVar.b0();
            kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
            if (listB0.isEmpty()) {
                listO = cVar.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                if (listO.isEmpty()) {
                    returnType = cVar.getReturnType();
                    if (returnType == null) {
                        wVarK = K(cVar);
                        if (wVarK != null || !q20.f.f(wVarK)) {
                            return gVar;
                        }
                    } else {
                        hVarG = returnType.m0().g();
                        if (hVarG != null) {
                            zB = q20.f.b(hVarG);
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            wVarK = K(cVar);
                            if (wVarK != null) {
                            }
                            return gVar;
                        }
                    }
                } else {
                    it = listO.iterator();
                    while (it.hasNext()) {
                        type = ((r0) it.next()).getType();
                        kotlin.jvm.internal.m.d(type, "getType(...)");
                        if (q20.f.f(type)) {
                        }
                    }
                    returnType = cVar.getReturnType();
                    if (returnType == null) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                    hVarG = returnType.m0().g();
                    if (hVarG != null) {
                        zB = q20.f.b(hVarG);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                }
            } else {
                Iterator it2 = listB0.iterator();
                while (it2.hasNext()) {
                    if (q20.f.f(((m10.u) it2.next()).getType())) {
                    }
                }
                listO = cVar.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                if (listO.isEmpty()) {
                    returnType = cVar.getReturnType();
                    if (returnType == null) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                    hVarG = returnType.m0().g();
                    if (hVarG != null) {
                        zB = q20.f.b(hVarG);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                } else {
                    it = listO.iterator();
                    while (it.hasNext()) {
                        type = ((r0) it.next()).getType();
                        kotlin.jvm.internal.m.d(type, "getType(...)");
                        if (q20.f.f(type)) {
                        }
                    }
                    returnType = cVar.getReturnType();
                    if (returnType == null) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                    hVarG = returnType.m0().g();
                    if (hVarG != null) {
                        zB = q20.f.b(hVarG);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        wVarK = K(cVar);
                        if (wVarK != null) {
                        }
                        return gVar;
                    }
                }
            }
        }
        return new e10.c0(gVar, cVar, z10);
    }

    public static final float C(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f3 += fArr[i10] * fArr2[i10];
        }
        return f3;
    }

    public static za.g D(byte[] bArr) {
        boolean z10;
        kotlin.jvm.internal.m.e(bArr, "bytes");
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bArr.length == 0) {
            return za.g.f17367b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            byte b7 = (byte) (-21267);
            int i10 = 0;
            if (bArr2[0] == ((byte) 16777132)) {
                z10 = true;
                if (bArr2[1] != b7) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            byteArrayInputStream.reset();
            if (z10) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    while (i10 < i11) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i10++;
                    }
                    objectInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ta.c0.C(objectInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s6 = dataInputStream.readShort();
                    if (s6 != -21521) {
                        throw new IllegalStateException(g4.c.f(s6, "Magic number doesn't match: ").toString());
                    }
                    short s10 = dataInputStream.readShort();
                    if (s10 != 1) {
                        throw new IllegalStateException(g4.c.f(s10, "Unsupported version number: ").toString());
                    }
                    int i12 = dataInputStream.readInt();
                    while (i10 < i12) {
                        linkedHashMap.put(dataInputStream.readUTF(), E(dataInputStream, dataInputStream.readByte()));
                        i10++;
                    }
                    dataInputStream.close();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ta.c0.C(dataInputStream, th4);
                        throw th5;
                    }
                }
            }
        } catch (IOException e3) {
            za.v.d().c(za.h.f17369a, "Error in Data#fromByteArray: ", e3);
        } catch (ClassNotFoundException e10) {
            za.v.d().c(za.h.f17369a, "Error in Data#fromByteArray: ", e10);
        }
        return new za.g(linkedHashMap);
    }

    public static final Serializable E(DataInputStream dataInputStream, byte b7) throws IOException {
        if (b7 == 0) {
            return null;
        }
        if (b7 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b7 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b7 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b7 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b7 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b7 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b7 == 7) {
            return dataInputStream.readUTF();
        }
        int i10 = 0;
        if (b7 == 8) {
            int i11 = dataInputStream.readInt();
            ?? r4 = new Boolean[i11];
            while (i10 < i11) {
                r4[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                i10++;
            }
            return r4;
        }
        if (b7 == 9) {
            int i12 = dataInputStream.readInt();
            ?? r7 = new Byte[i12];
            while (i10 < i12) {
                r7[i10] = Byte.valueOf(dataInputStream.readByte());
                i10++;
            }
            return r7;
        }
        if (b7 == 10) {
            int i13 = dataInputStream.readInt();
            ?? r10 = new Integer[i13];
            while (i10 < i13) {
                r10[i10] = Integer.valueOf(dataInputStream.readInt());
                i10++;
            }
            return r10;
        }
        if (b7 == 11) {
            int i14 = dataInputStream.readInt();
            ?? r11 = new Long[i14];
            while (i10 < i14) {
                r11[i10] = Long.valueOf(dataInputStream.readLong());
                i10++;
            }
            return r11;
        }
        if (b7 == 12) {
            int i15 = dataInputStream.readInt();
            ?? r12 = new Float[i15];
            while (i10 < i15) {
                r12[i10] = Float.valueOf(dataInputStream.readFloat());
                i10++;
            }
            return r12;
        }
        if (b7 == 13) {
            int i16 = dataInputStream.readInt();
            ?? r13 = new Double[i16];
            while (i10 < i16) {
                r13[i10] = Double.valueOf(dataInputStream.readDouble());
                i10++;
            }
            return r13;
        }
        if (b7 != 14) {
            throw new IllegalStateException(g4.c.f(b7, "Unsupported type "));
        }
        int i17 = dataInputStream.readInt();
        ?? r14 = new String[i17];
        while (i10 < i17) {
            String utf = dataInputStream.readUTF();
            if (kotlin.jvm.internal.m.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r14[i10] = utf;
            i10++;
        }
        return r14;
    }

    public static n20.b F(String str, boolean z10) {
        String strV0;
        kotlin.jvm.internal.m.e(str, "string");
        int iI0 = r30.k.I0(str, '`', 0, 6);
        if (iI0 == -1) {
            iI0 = str.length();
        }
        int iN0 = r30.k.N0(iI0, 4, str, "/");
        String str2 = RuntimeVersion.SUFFIX;
        if (iN0 == -1) {
            strV0 = r30.r.v0(str, "`", RuntimeVersion.SUFFIX);
        } else {
            String strSubstring = str.substring(0, iN0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            String strU0 = r30.r.u0(strSubstring, '/', '.');
            String strSubstring2 = str.substring(iN0 + 1);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            strV0 = r30.r.v0(strSubstring2, "`", RuntimeVersion.SUFFIX);
            str2 = strU0;
        }
        return new n20.b(new n20.c(str2), new n20.c(strV0), z10);
    }

    public static final void G(t10.h hVar) {
        int i10 = t10.c.B;
        if (hVar.b != 1 || hVar.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static final String H() {
        byte[] bArr = new byte[16];
        t30.a.a.nextBytes(bArr);
        byte b7 = (byte) (bArr[6] & 15);
        bArr[6] = b7;
        bArr[6] = (byte) (b7 | 64);
        byte b10 = (byte) (bArr[8] & 63);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | 128);
        long jG0 = s0.g0(0, bArr);
        long jG1 = s0.g0(8, bArr);
        return ((jG0 == 0 && jG1 == 0) ? t30.b.C : new t30.b(jG0, jG1)).toString();
    }

    public static final long I(long j9) {
        return (((j9 << 32) >> 33) & 4294967295L) | ((j9 >> 33) << 32);
    }

    public static final String[] J(c2.m mVar) {
        kotlin.jvm.internal.m.c(mVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((c2.e) mVar).f2611b.toArray(new String[0]);
    }

    public static final e30.w K(j10.c cVar) {
        m10.u uVarX = cVar.X();
        m10.u uVarT = cVar.T();
        if (uVarX != null) {
            return uVarX.getType();
        }
        if (uVarT != null) {
            if (cVar instanceof j10.j) {
                return uVarT.getType();
            }
            j10.e eVarL = cVar.l();
            j10.e eVar = eVarL instanceof j10.e ? eVarL : null;
            if (eVar != null) {
                return eVar.n();
            }
        }
        return null;
    }

    public static final Method L(Class cls, j10.c cVar) throws a40.b0 {
        kotlin.jvm.internal.m.e(cVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            kotlin.jvm.internal.m.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new a40.b0("No unbox method found in inline class: " + cls + " (calling " + cVar + ')');
        }
    }

    public static final ArrayList M(e30.a0 a0Var) {
        ArrayList arrayListN = N(e30.c.b(a0Var));
        if (arrayListN == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(arrayListN, 10));
        Iterator it = arrayListN.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        j10.e eVarG = a0Var.m0().g();
        kotlin.jvm.internal.m.c(eVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsI = i2.i(eVarG);
        kotlin.jvm.internal.m.b(clsI);
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsI.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    public static final ArrayList N(e30.a0 a0Var) {
        ?? R;
        if (!q20.f.g(a0Var)) {
            return null;
        }
        j10.e eVarG = a0Var.m0().g();
        kotlin.jvm.internal.m.c(eVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i10 = u20.d.a;
        j10.s0 s0VarJ0 = eVarG.j0();
        j10.a0 a0Var2 = s0VarJ0 instanceof j10.a0 ? (j10.a0) s0VarJ0 : null;
        kotlin.jvm.internal.m.b(a0Var2);
        ArrayList<g00.k> arrayList = a0Var2.a;
        ArrayList arrayList2 = new ArrayList();
        for (g00.k kVar : arrayList) {
            n20.e eVar = (n20.e) kVar.A;
            ArrayList arrayListN = N((e30.a0) kVar.B);
            if (arrayListN != null) {
                R = new ArrayList(h00.r.q0(arrayListN, 10));
                Iterator it = arrayListN.iterator();
                while (it.hasNext()) {
                    R.add(eVar.c() + '-' + ((String) it.next()));
                }
            } else {
                R = va.a.R(eVar.c());
            }
            h00.v.u0((Iterable) R, arrayList2);
        }
        return arrayList2;
    }

    public static boolean P(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final a10.d Q(ClassLoader classLoader, String str) {
        kotlin.jvm.internal.m.e(str, "name");
        Class clsG = i2.g(classLoader, h0(str), 0);
        if (clsG != null) {
            return k00.f.I(clsG);
        }
        return null;
    }

    public static final void R(kotlin.jvm.internal.p pVar) {
        kotlin.jvm.internal.m.d(k20.e.p, "MEMBER_KIND");
        n00.b bVar = k1.C;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        g00.s sVar = new g00.s(bVar, 4);
        while (sVar.hasNext()) {
            arrayList.add(((k1) sVar.next()).A);
        }
    }

    public static final p10.a S(kotlin.jvm.internal.p pVar) {
        k20.c cVar = k20.e.e;
        kotlin.jvm.internal.m.d(cVar, "MODALITY");
        n00.b bVar = l1.G;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        g00.s sVar = new g00.s(bVar, 4);
        while (sVar.hasNext()) {
            arrayList.add(((l1) sVar.next()).A);
        }
        return new p10.a(pVar, cVar, bVar, arrayList);
    }

    public static final a60.a T(Object... objArr) {
        return new a60.a(2, new ArrayList((Collection) new h00.l(objArr, false)));
    }

    public static final void U(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            y2.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            kotlin.jvm.internal.m.e(fArr8, "<this>");
            kotlin.jvm.internal.m.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr9 = fArr5[i19];
                float fC = C(fArr7, fArr9);
                for (int i20 = 0; i20 < i10; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * fC);
                }
            }
            float fSqrt = (float) Math.sqrt(C(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f3 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                fArr7[i21] = fArr7[i21] * f3;
            }
            float[] fArr10 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr10[i22] = i22 < i18 ? 0.0f : C(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fC2 = C(fArr5[i23], fArr2);
            float[] fArr11 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fC2 -= fArr11[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fC2 / fArr11[i23];
        }
    }

    public static final void V(t10.h hVar) {
        int i10 = t10.d.B;
        if (hVar.b != 1 || hVar.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static final q0 W(dh.o oVar, bx.c cVar, String str, qv.a aVar) {
        kotlin.jvm.internal.m.e(oVar, "<this>");
        kotlin.jvm.internal.m.e(cVar, "reciter");
        String strF = g4.c.f(cVar.a, "reciter/");
        String str2 = cVar.b;
        String str3 = cVar.e;
        if (r30.k.L0(str3)) {
            str3 = null;
        }
        return dh.o.d(oVar, strF, str2, null, str3, null, str, aVar, qv.a.A, 276);
    }

    public static final void X(r10.b bVar, r10.a aVar, e0 e0Var, n20.e eVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlin.jvm.internal.m.e(aVar, "from");
        kotlin.jvm.internal.m.e(e0Var, "scopeOwner");
        kotlin.jvm.internal.m.e(eVar, "name");
        String str = ((m10.c0) e0Var).F.a.a;
        kotlin.jvm.internal.m.d(eVar.b(), "asString(...)");
        kotlin.jvm.internal.m.e(str, "packageFqName");
    }

    public static final long Y(long j9) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j9 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void Z(l0 l0Var, int i10, Object obj) {
        l0Var.f12281e[(l0Var.f12282f - l0Var.f12277a[l0Var.f12278b - 1].c) + i10] = obj;
    }

    public static final void a(String str, u00.n nVar, l1.j jVar, int i10) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-67008865);
        int i11 = i10 | (g0Var2.g(str) ? 4 : 2) | (g0Var2.h(false) ? 32 : 16) | (g0Var2.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.i(null) ? 2048 : 1024);
        if (g0Var2.S(i11 & 1, (i11 & 1171) != 1170)) {
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(b2.o.A, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.f2040g);
            l1.q.E(g0Var2, b3.h.f2041h);
            l1.q.I(rVarC, g0Var2, b3.h.f2037d);
            if (nVar == null) {
                g0Var2.c0(1305334772);
                g0Var2.r(false);
            } else {
                g0Var2.c0(1305334773);
                nVar.invoke(g0Var2, 0);
                g0Var2.r(false);
            }
            z6.b(str, null, 0L, o.z(16), null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, g0Var2, 24576, 24960, 241646);
            g0Var = g0Var2;
            g0Var.c0(1305592692);
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.i(str, nVar, i10, 17);
        }
    }

    public static final void a0(l0 l0Var, int i10, Object obj, int i11, Object obj2) {
        int i12 = l0Var.f12282f - l0Var.f12277a[l0Var.f12278b - 1].c;
        Object[] objArr = l0Var.f12281e;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static final void b(String str, l1.j jVar, int i10) {
        boolean z10;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1323005268);
        int i11 = (g0Var.g(str) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            b2.o oVar = b2.o.A;
            float f3 = 10;
            b2.r rVarC = f2.h.c(z1.m(oVar, 44), p0.f.a(f3));
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            b3.f fVar = b3.h.f2039f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var, fVar4);
            if (str == null || r30.k.L0(str)) {
                g0Var.c0(-18565456);
                b2.r rVarF = z.n.f(z1.f6478c, dl.a.q, i2.b0.f7111b);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarF, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD2, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC3, g0Var, fVar4);
                o3.a(y3.R(2131231344, g0Var, 0), null, z1.m(oVar, 18), i2.t.b(0.5f, dl.a.k), g0Var, 440, 0);
                z10 = true;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var.c0(-19425923);
                wb.h hVar = new wb.h((Context) g0Var.k(o0.f2722b));
                hVar.f15918c = str;
                mb.j jVarI = mb.l.i(w.c.q(hVar, 44), null, g0Var, 0, 62);
                z.n.c(jVarI, null, rd.a.g0(f3, 0, dl.a.s, z1.f6478c, !(jVarI.j() instanceof mb.g)), null, z2.o.f17145a, 0.0f, g0Var, 24624, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                g0Var = g0Var;
                g0Var.r(false);
                z10 = true;
            }
            g0Var.r(z10);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.n(str, i10, 6);
        }
    }

    public static final void b0(l0 l0Var, Object obj, Object obj2, Object obj3) {
        int i10 = l0Var.f12282f - l0Var.f12277a[l0Var.f12278b - 1].c;
        Object[] objArr = l0Var.f12281e;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        objArr[i10 + 2] = obj3;
    }

    public static final void c(qr.a aVar, u00.a aVar2, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        u00.a aVar3;
        boolean z10;
        String strT;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2067319261);
        int i11 = i10 | (g0Var.g(aVar) ? 4 : 2) | (g0Var.i(aVar2) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            y3.m mVar = (y3.m) g0Var.k(o1.f2738n);
            long j9 = aVar.e;
            int i12 = aVar.d;
            boolean zF = g0Var.f(j9);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zF || objN == cVar) {
                objN = f50.c.w(aVar.e);
                g0Var.n0(objN);
            }
            String str = (String) objN;
            boolean zE = g0Var.e(i12);
            Object objN2 = g0Var.N();
            if (zE || objN2 == cVar) {
                objN2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                g0Var.n0(objN2);
            }
            String str2 = (String) objN2;
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.c.C(z1.d(oVar, 1.0f), 16);
            float f3 = 12;
            v1 v1VarA = t1.a(h0.i.g(f3), b2.b.K, g0Var, 54);
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
            b3.f fVar = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var, fVar4);
            b(aVar.c, g0Var, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.v vVarA = h0.u.a(h0.i.g(2), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            String str3 = aVar.b;
            long jZ = o.z(16);
            long jZ2 = o.z(16);
            long j10 = dl.a.i;
            z6.b(str3, null, j10, jZ, q3.u.D, null, 0L, null, null, jZ2, 2, false, 1, 0, null, null, g0Var, 1597440, 25008, 239530);
            int iOrdinal = mVar.ordinal();
            if (iOrdinal == 0) {
                z10 = false;
                g0Var.c0(1331314153);
                strT = z3.T(2131887324, new Object[]{Integer.valueOf(i12), str}, g0Var);
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, 1331305212, false);
                }
                g0Var.c0(1331307085);
                strT = z3.T(2131887325, new Object[]{str2, str}, g0Var);
                z10 = false;
                g0Var.r(false);
            }
            z6.b(strT, null, i2.t.b(0.7f, dl.a.k), o.z(13), q3.u.B, null, 0L, null, null, o.z(13), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260010);
            g0Var.r(true);
            aVar3 = aVar2;
            z6.b(z3.U(g0Var, 2131886415), h0.c.D(w50.c.o(z.n.f(f2.h.c(oVar, p0.f.a(32)), i2.t.b(0.15f, j10), i2.b0.f7111b), z10, (j3.k) null, aVar2, 7), f3, 9), j10, o.z(14), q3.u.C, null, 0L, null, null, o.z(14), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            aVar3 = aVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0.g0(aVar, aVar3, i10, 4);
        }
    }

    public static final void d(u30.b bVar, u00.k kVar, b2.r rVar, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(bVar, "collectionDownloads");
        kotlin.jvm.internal.m.e(kVar, "onDeleteDownloads");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1064197176);
        int i11 = (g0Var.g(bVar) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            b2.r rVarF = z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.f7111b);
            h0.v vVarA = h0.u.a(h0.i.g(0), b2.b.M, g0Var, 6);
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
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            if (((h00.b) bVar).isEmpty()) {
                g0Var.c0(-1883642750);
                f(g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1883581339);
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    qr.a aVar = (qr.a) it.next();
                    boolean zG = ((i11 & 112) == 32) | g0Var.g(aVar);
                    Object objN = g0Var.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new l6.c(kVar, aVar, 2);
                        g0Var.n0(objN);
                    }
                    c(aVar, (u00.a) objN, g0Var, 0);
                }
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new hz.a(bVar, kVar, rVar, i10, 1);
        }
    }

    public static final Annotation d0(s10.s sVar, ClassLoader classLoader) throws a40.b0 {
        String str = sVar.a;
        Class clsG = i2.g(classLoader, h0(str), 0);
        if (clsG == null) {
            throw new a40.b0(a1.b.o("Annotation class not found: ", str));
        }
        Map map = sVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h00.d0.P(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), e0((m0) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) f50.k.l(clsG, linkedHashMap);
    }

    public static final c2.e e(String str) {
        return new c2.e(w50.c.g0(str));
    }

    public static final Object e0(m0 m0Var, String str, String str2, ClassLoader classLoader) throws NoWhenBranchMatchedException, a40.b0 {
        List parameters;
        if (m0Var instanceof s10.t) {
            return d0(((s10.t) m0Var).a, classLoader);
        }
        int i10 = 0;
        if (m0Var instanceof s10.u) {
            s10.u uVar = (s10.u) m0Var;
            String str3 = uVar.a;
            a10.d dVarQ = Q(classLoader, str3);
            if (dVarQ == null) {
                throw new a40.b0("Unresolved class: ".concat(str3));
            }
            Class clsD = k00.f.D(dVarQ);
            int i11 = uVar.b;
            while (i10 < i11) {
                clsD = i2.c(clsD);
                i10++;
            }
            return clsD;
        }
        Object obj = null;
        if (!(m0Var instanceof s10.v)) {
            if (!(m0Var instanceof s10.a0)) {
                if (!(m0Var instanceof s10.d0)) {
                    if (m0Var instanceof s10.e0) {
                        return ((s10.e0) m0Var).a();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = ((s10.d0) m0Var).a;
                Class clsG = i2.g(classLoader, h0(str4), 0);
                if (clsG != null) {
                    return clsG;
                }
                throw new a40.b0("Unresolved class: ".concat(str4));
            }
            s10.a0 a0Var = (s10.a0) m0Var;
            String str5 = a0Var.b;
            String str6 = a0Var.a;
            Class clsG2 = i2.g(classLoader, h0(str6), 0);
            if (clsG2 == null) {
                throw new a40.b0("Unresolved enum class: ".concat(str6));
            }
            Object[] enumConstants = clsG2.getEnumConstants();
            kotlin.jvm.internal.m.d(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            boolean z10 = false;
            Object obj2 = null;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object obj3 = enumConstants[i10];
                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (kotlin.jvm.internal.m.a(((Enum) obj3).name(), str5)) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj2 = obj3;
                }
                i10++;
            }
            if (obj != null) {
                return obj;
            }
            throw new a40.b0("Unresolved enum entry: " + str6 + '.' + str5);
        }
        a10.d dVarQ2 = Q(classLoader, str);
        if (dVarQ2 != null) {
            if (!k00.f.D(dVarQ2).isAnnotation()) {
                dVarQ2 = null;
            }
            if (dVarQ2 != null) {
                a10.g gVar = (a10.g) h00.q.e1(dVarQ2.i());
                if (gVar != null && (parameters = gVar.getParameters()) != null) {
                    Iterator it = parameters.iterator();
                    boolean z11 = false;
                    Object obj4 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (!z11) {
                                break;
                            }
                            break;
                        }
                        Object next = it.next();
                        if (kotlin.jvm.internal.m.a(((w1) next).getName(), str2)) {
                            if (!z11) {
                                z11 = true;
                                obj4 = next;
                            }
                        }
                        obj4 = null;
                        break;
                    }
                    d10.w wVar = (w1) obj4;
                    if (wVar != null) {
                        p30.i iVarG = wVar.g();
                        a10.d dVarS = iVarG.s();
                        a10.d dVar = dVarS instanceof a10.d ? dVarS : null;
                        if (dVar == null) {
                            throw new a40.b0("Array parameter type is not a class: " + iVarG);
                        }
                        Class clsD2 = k00.f.D(dVar);
                        Class<?> componentType = kotlin.jvm.internal.m.a(clsD2.getComponentType(), a10.d.class) ? Class.class : clsD2.getComponentType();
                        ArrayList arrayList = ((s10.v) m0Var).a;
                        Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Array.set(objNewInstance, i10, e0((m0) it2.next(), str, null, classLoader));
                            i10++;
                        }
                        kotlin.jvm.internal.m.b(objNewInstance);
                        return objNewInstance;
                    }
                }
                throw new a40.b0("No parameter " + str2 + " found in annotation constructor of " + str);
            }
        }
        throw new a40.b0("Not an annotation class: ".concat(str));
    }

    public static final void f(l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1436701056);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            b2.r rVarD = h0.c.D(z1.d(b2.o.A, 1.0f), 16, 18);
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            z6.b(z3.U(g0Var, 2131886915), null, i2.t.b(0.7f, dl.a.k), o.z(19), q3.u.C, null, 0L, null, null, o.z(19), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new lt.a(i10, 8);
        }
    }

    public static byte[] f0(za.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "data");
        HashMap map = gVar.f17368a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    g0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                kotlin.jvm.internal.m.b(byteArray);
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ta.c0.C(dataOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e3) {
            za.v.d().c(za.h.f17369a, "Error in Data#toByteArray: ", e3);
            return new byte[0];
        }
    }

    public static final void g(ln.c cVar, float f3, l1.j jVar, int i10) {
        kotlin.jvm.internal.m.e(cVar, "state");
        long j9 = cVar.a;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1245543573);
        int i11 = (g0Var.g(cVar) ? 4 : 2) | i10 | (g0Var.d(f3) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            String strN = f50.k.n(j9);
            int i12 = cVar.b;
            b6.k kVar = b6.k.f2179a;
            if (i12 <= 0 || j9 < i12 * 60) {
                g0Var.c0(-1765563095);
                va.a.b(ze.d.u(kVar), j6.c.f8173d, v1.d.d(1647397545, new c00.k(cVar, f3, strN), g0Var), g0Var, 384, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1765934506);
                w00.a.b(ze.d.u(kVar), 1, 1, v1.d.d(1637617978, new fv.a(strN, 6), g0Var), g0Var, 3072, 0);
                g0Var = g0Var;
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kn.d(cVar, f3, i10, 0);
        }
    }

    public static final void g0(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i10;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.a0.a.b(obj.getClass()).n());
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            a10.d dVarB = b0Var.b(cls);
            if (dVarB.equals(b0Var.b(Boolean[].class))) {
                i10 = 8;
            } else if (dVarB.equals(b0Var.b(Byte[].class))) {
                i10 = 9;
            } else if (dVarB.equals(b0Var.b(Integer[].class))) {
                i10 = 10;
            } else if (dVarB.equals(b0Var.b(Long[].class))) {
                i10 = 11;
            } else if (dVarB.equals(b0Var.b(Float[].class))) {
                i10 = 12;
            } else if (dVarB.equals(b0Var.b(Double[].class))) {
                i10 = 13;
            } else {
                if (!dVarB.equals(b0Var.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + b0Var.b(objArr.getClass()).m());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b7 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b7 != null ? b7.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f3 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f3 != null ? f3.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d3 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d3 != null ? d3.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void h(final b2.r rVar, j0.v vVar, final n1 n1Var, final boolean z10, final t0 t0Var, final boolean z11, final h1 h1Var, b2.c cVar, h0.h hVar, b2.h hVar2, h0.e eVar, final u00.k kVar, l1.j jVar, final int i10, final int i11, final int i12) {
        int i13;
        b2.c cVar2;
        int i14;
        boolean z12;
        j0.v vVar2;
        g0 g0Var;
        final h0.h hVar3;
        final b2.h hVar4;
        final h0.e eVar2;
        r1 r1VarT;
        int i15;
        h0.h hVar5;
        b2.h hVar6;
        h0.e eVar3;
        b2.h hVar7;
        int i16;
        z0 z0VarG;
        boolean z13;
        Object objN;
        l1.c cVar3;
        a10.r rVar2;
        boolean z14;
        Object objN2;
        Object objN3;
        a40.z zVar;
        i2.y yVar;
        l0.f fVar;
        boolean zE;
        Object objN4;
        int i17;
        a10.r rVar3;
        h0.h hVar8;
        q1 q1Var;
        q1 q1Var2;
        b2.r rVarM;
        boolean zE2;
        Object objN5;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(924924659);
        if ((i10 & 6) == 0) {
            i13 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= g0Var2.g(vVar) ? 32 : 16;
        }
        int i18 = i10 & 384;
        int i19 = Cast.MAX_NAMESPACE_LENGTH;
        if (i18 == 0) {
            i13 |= g0Var2.g(n1Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= g0Var2.h(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= g0Var2.h(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= g0Var2.g(t0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= g0Var2.h(z11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= g0Var2.g(h1Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= 33554432;
        }
        int i20 = i12 & 512;
        if (i20 != 0) {
            i13 |= 805306368;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i10 & 805306368) == 0) {
                i13 |= g0Var2.g(cVar2) ? 536870912 : 268435456;
            }
        }
        int i21 = i12 & 1024;
        if (i21 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (g0Var2.g(hVar) ? 4 : 2);
        } else {
            i14 = i11;
        }
        int i22 = i12 & 2048;
        if (i22 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= g0Var2.g(hVar2) ? 32 : 16;
        }
        int i23 = i14;
        int i24 = i12 & 4096;
        if (i24 == 0) {
            if ((i11 & 384) == 0) {
                if (g0Var2.g(eVar)) {
                    i19 = 256;
                }
                i23 |= i19;
            }
            if ((i11 & 3072) == 0) {
                i23 |= g0Var2.i(kVar) ? 2048 : 1024;
            }
            if ((i13 & 306783379) == 306783378 || (i23 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var2.S(i13 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0 || g0Var2.A()) {
                    i15 = i13 & (-234881025);
                    if (i20 != 0) {
                        cVar2 = null;
                    }
                    if (i21 != 0) {
                        hVar5 = null;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i22 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i24 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    hVar7 = hVar6;
                } else {
                    g0Var2.V();
                    i15 = i13 & (-234881025);
                    hVar5 = hVar;
                    i23 = i23;
                    cVar2 = cVar2;
                    hVar7 = hVar2;
                    eVar3 = eVar;
                }
                g0Var2.s();
                i16 = i15 >> 3;
                int i25 = i16 & 14;
                int i26 = i25 | ((i23 >> 6) & 112);
                int i27 = i15;
                z0VarG = l1.q.G(kVar, g0Var2);
                int i28 = i23;
                z13 = (((i26 & 14) ^ 6) <= 4 && g0Var2.g(vVar)) || (i26 & 6) == 4;
                objN = g0Var2.N();
                cVar3 = l1.i.f9868a;
                if (z13 || objN == cVar3) {
                    j0.b bVar = new j0.b();
                    bVar.f7745a = new f1(Integer.MAX_VALUE);
                    bVar.f7746b = new f1(Integer.MAX_VALUE);
                    l1.c cVar4 = l1.c.E;
                    objN = new f40.h(0, 3, p2.class, l1.q.q(cVar4, new d0.g(l1.q.q(cVar4, new ct.k(z0VarG, 8)), vVar, bVar, 6)), "value", "getValue()Ljava/lang/Object;");
                    g0Var2.n0(objN);
                }
                rVar2 = (a10.r) objN;
                int i29 = i27 >> 9;
                int i30 = i25 | (i29 & 112);
                z14 = ((((i30 & 112) ^ 48) <= 32 && g0Var2.h(z10)) || (i30 & 48) == 32) | ((((i30 & 14) ^ 6) <= 4 && g0Var2.g(vVar)) || (i30 & 6) == 4);
                objN2 = g0Var2.N();
                if (z14 || objN2 == cVar3) {
                    objN2 = new j0.c(vVar, z10);
                    g0Var2.n0(objN2);
                }
                b1 b1Var = (b1) objN2;
                objN3 = g0Var2.N();
                if (objN3 == cVar3) {
                    objN3 = l1.q.o(g0Var2);
                    g0Var2.n0(objN3);
                }
                zVar = (a40.z) objN3;
                yVar = (i2.y) g0Var2.k(o1.f2733g);
                fVar = ((Boolean) g0Var2.k(o1.f2747w)).booleanValue() ? null : l0.o1.f9782a;
                int i31 = i28 << 18;
                int i32 = (i27 & 65520) | (i29 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | ((i28 << 27) & 1879048192);
                zE = ((((i32 & 112) ^ 48) <= 32 && g0Var2.g(vVar)) || (i32 & 48) == 32) | ((((i32 & 896) ^ 384) <= 256 && g0Var2.g(n1Var)) || (i32 & 384) == 256) | ((((i32 & 7168) ^ 3072) <= 2048 && g0Var2.h(false)) || (i32 & 3072) == 2048) | ((((57344 & i32) ^ 24576) <= 16384 && g0Var2.h(z10)) || (i32 & 24576) == 16384) | g0Var2.e(0) | ((((i32 & 3670016) ^ 1572864) <= 1048576 && g0Var2.g(cVar2)) || (i32 & 1572864) == 1048576) | ((((i32 & 29360128) ^ 12582912) <= 8388608 && g0Var2.g(hVar7)) || (i32 & 12582912) == 8388608) | ((((i32 & 234881024) ^ 100663296) <= 67108864 && g0Var2.g(eVar3)) || (i32 & 100663296) == 67108864) | ((((i32 & 1879048192) ^ 805306368) <= 536870912 && g0Var2.g(hVar5)) || (i32 & 805306368) == 536870912) | g0Var2.g(yVar) | g0Var2.g(fVar);
                objN4 = g0Var2.N();
                if (!zE || objN4 == cVar3) {
                    g0Var = g0Var2;
                    i17 = 4;
                    h0.h hVar9 = hVar5;
                    objN4 = new j0.l(vVar, z10, n1Var, rVar2, hVar9, eVar3, zVar, yVar, fVar, cVar2, hVar7);
                    rVar3 = rVar2;
                    hVar8 = hVar9;
                    g0Var.n0(objN4);
                } else {
                    rVar3 = rVar2;
                    hVar8 = hVar5;
                    g0Var = g0Var2;
                    i17 = 4;
                }
                n0 n0Var = (n0) objN4;
                if (z10) {
                    q1Var = q1.A;
                } else {
                    q1Var = q1.B;
                }
                q1Var2 = q1Var;
                if (z11) {
                    g0Var.c0(-2077147368);
                    zE2 = ((((i16 & 14) ^ 6) <= i17 && g0Var.g(vVar)) || (i16 & 6) == i17) | g0Var.e(0);
                    objN5 = g0Var.N();
                    if (zE2 || objN5 == cVar3) {
                        objN5 = new j0.d(vVar);
                        g0Var.n0(objN5);
                    }
                    rVarM = l0.q.m((j0.d) objN5, vVar.f7830p, q1Var2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-2076718545);
                    g0Var.r(false);
                    rVarM = b2.o.A;
                }
                vVar2 = vVar;
                l0.q.a(rVar3, z.n.n(l0.q.n(rVar.V(vVar.m).V(vVar.f7828n), rVar3, b1Var, q1Var2, z11).V(rVarM).V(vVar.f7829o.f9739k), vVar, q1Var2, h1Var, z11, t0Var, vVar.f7823g, null), vVar2.f7831q, n0Var, g0Var, 0);
                hVar3 = hVar8;
                hVar4 = hVar7;
                eVar2 = eVar3;
            } else {
                vVar2 = vVar;
                g0Var = g0Var2;
                g0Var.V();
                hVar3 = hVar;
                hVar4 = hVar2;
                eVar2 = eVar;
                cVar2 = cVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final j0.v vVar3 = vVar2;
                final b2.c cVar5 = cVar2;
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        int iK2 = l1.q.K(i11);
                        kh.n.h(rVar, vVar3, n1Var, z10, t0Var, z11, h1Var, cVar5, hVar3, hVar4, eVar2, kVar, (l1.j) obj, iK, iK2, i12);
                        return b0.a;
                    }
                };
            }
        }
        i23 |= 384;
        if ((i11 & 3072) == 0) {
            i23 |= g0Var2.i(kVar) ? 2048 : 1024;
        }
        if ((i13 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (g0Var2.S(i13 & 1, z12)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                i15 = i13 & (-234881025);
                if (i20 != 0) {
                    cVar2 = null;
                }
                if (i21 != 0) {
                    hVar5 = null;
                } else {
                    hVar5 = hVar;
                }
                if (i22 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i24 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                hVar7 = hVar6;
            } else {
                i15 = i13 & (-234881025);
                if (i20 != 0) {
                    cVar2 = null;
                }
                if (i21 != 0) {
                    hVar5 = null;
                } else {
                    hVar5 = hVar;
                }
                if (i22 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i24 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                hVar7 = hVar6;
            }
            g0Var2.s();
            i16 = i15 >> 3;
            int i210 = i16 & 14;
            int i211 = i210 | ((i23 >> 6) & 112);
            int i212 = i15;
            z0VarG = l1.q.G(kVar, g0Var2);
            int i213 = i23;
            if (((i211 & 14) ^ 6) <= 4) {
            }
            objN = g0Var2.N();
            cVar3 = l1.i.f9868a;
            if (z13) {
                j0.b bVar2 = new j0.b();
                bVar2.f7745a = new f1(Integer.MAX_VALUE);
                bVar2.f7746b = new f1(Integer.MAX_VALUE);
                l1.c cVar6 = l1.c.E;
                objN = new f40.h(0, 3, p2.class, l1.q.q(cVar6, new d0.g(l1.q.q(cVar6, new ct.k(z0VarG, 8)), vVar, bVar2, 6)), "value", "getValue()Ljava/lang/Object;");
                g0Var2.n0(objN);
            } else {
                j0.b bVar3 = new j0.b();
                bVar3.f7745a = new f1(Integer.MAX_VALUE);
                bVar3.f7746b = new f1(Integer.MAX_VALUE);
                l1.c cVar7 = l1.c.E;
                objN = new f40.h(0, 3, p2.class, l1.q.q(cVar7, new d0.g(l1.q.q(cVar7, new ct.k(z0VarG, 8)), vVar, bVar3, 6)), "value", "getValue()Ljava/lang/Object;");
                g0Var2.n0(objN);
            }
            rVar2 = (a10.r) objN;
            int i214 = i212 >> 9;
            int i33 = i210 | (i214 & 112);
            z14 = ((((i33 & 112) ^ 48) <= 32 && g0Var2.h(z10)) || (i33 & 48) == 32) | ((((i33 & 14) ^ 6) <= 4 && g0Var2.g(vVar)) || (i33 & 6) == 4);
            objN2 = g0Var2.N();
            if (z14) {
                objN2 = new j0.c(vVar, z10);
                g0Var2.n0(objN2);
            } else {
                objN2 = new j0.c(vVar, z10);
                g0Var2.n0(objN2);
            }
            b1 b1Var2 = (b1) objN2;
            objN3 = g0Var2.N();
            if (objN3 == cVar3) {
                objN3 = l1.q.o(g0Var2);
                g0Var2.n0(objN3);
            }
            zVar = (a40.z) objN3;
            yVar = (i2.y) g0Var2.k(o1.f2733g);
            fVar = ((Boolean) g0Var2.k(o1.f2747w)).booleanValue() ? null : l0.o1.f9782a;
            int i34 = i213 << 18;
            int i35 = (i212 & 65520) | (i214 & 3670016) | (i34 & 29360128) | (i34 & 234881024) | ((i213 << 27) & 1879048192);
            zE = ((((i35 & 112) ^ 48) <= 32 && g0Var2.g(vVar)) || (i35 & 48) == 32) | ((((i35 & 896) ^ 384) <= 256 && g0Var2.g(n1Var)) || (i35 & 384) == 256) | ((((i35 & 7168) ^ 3072) <= 2048 && g0Var2.h(false)) || (i35 & 3072) == 2048) | ((((57344 & i35) ^ 24576) <= 16384 && g0Var2.h(z10)) || (i35 & 24576) == 16384) | g0Var2.e(0) | ((((i35 & 3670016) ^ 1572864) <= 1048576 && g0Var2.g(cVar2)) || (i35 & 1572864) == 1048576) | ((((i35 & 29360128) ^ 12582912) <= 8388608 && g0Var2.g(hVar7)) || (i35 & 12582912) == 8388608) | ((((i35 & 234881024) ^ 100663296) <= 67108864 && g0Var2.g(eVar3)) || (i35 & 100663296) == 67108864) | ((((i35 & 1879048192) ^ 805306368) <= 536870912 && g0Var2.g(hVar5)) || (i35 & 805306368) == 536870912) | g0Var2.g(yVar) | g0Var2.g(fVar);
            objN4 = g0Var2.N();
            if (zE) {
                g0Var = g0Var2;
                i17 = 4;
                h0.h hVar10 = hVar5;
                objN4 = new j0.l(vVar, z10, n1Var, rVar2, hVar10, eVar3, zVar, yVar, fVar, cVar2, hVar7);
                rVar3 = rVar2;
                hVar8 = hVar10;
                g0Var.n0(objN4);
            } else {
                g0Var = g0Var2;
                i17 = 4;
                h0.h hVar11 = hVar5;
                objN4 = new j0.l(vVar, z10, n1Var, rVar2, hVar11, eVar3, zVar, yVar, fVar, cVar2, hVar7);
                rVar3 = rVar2;
                hVar8 = hVar11;
                g0Var.n0(objN4);
            }
            n0 n0Var2 = (n0) objN4;
            if (z10) {
                q1Var = q1.A;
            } else {
                q1Var = q1.B;
            }
            q1Var2 = q1Var;
            if (z11) {
                g0Var.c0(-2077147368);
                zE2 = ((((i16 & 14) ^ 6) <= i17 && g0Var.g(vVar)) || (i16 & 6) == i17) | g0Var.e(0);
                objN5 = g0Var.N();
                if (zE2) {
                    objN5 = new j0.d(vVar);
                    g0Var.n0(objN5);
                } else {
                    objN5 = new j0.d(vVar);
                    g0Var.n0(objN5);
                }
                rVarM = l0.q.m((j0.d) objN5, vVar.f7830p, q1Var2);
                g0Var.r(false);
            } else {
                g0Var.c0(-2076718545);
                g0Var.r(false);
                rVarM = b2.o.A;
            }
            vVar2 = vVar;
            l0.q.a(rVar3, z.n.n(l0.q.n(rVar.V(vVar.m).V(vVar.f7828n), rVar3, b1Var2, q1Var2, z11).V(rVarM).V(vVar.f7829o.f9739k), vVar, q1Var2, h1Var, z11, t0Var, vVar.f7823g, null), vVar2.f7831q, n0Var2, g0Var, 0);
            hVar3 = hVar8;
            hVar4 = hVar7;
            eVar2 = eVar3;
        } else {
            vVar2 = vVar;
            g0Var = g0Var2;
            g0Var.V();
            hVar3 = hVar;
            hVar4 = hVar2;
            eVar2 = eVar;
            cVar2 = cVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final j0.v vVar4 = vVar2;
            final b2.c cVar8 = cVar2;
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    kh.n.h(rVar, vVar4, n1Var, z10, t0Var, z11, h1Var, cVar8, hVar3, hVar4, eVar2, kVar, (l1.j) obj, iK, iK2, i12);
                    return b0.a;
                }
            };
        }
    }

    public static final n20.b h0(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        boolean zX0 = r30.r.x0(str, ".", false);
        if (zX0) {
            str = str.substring(1);
            kotlin.jvm.internal.m.d(str, "substring(...)");
        }
        return new n20.b(new n20.c(r30.r.u0(r30.k.f1('/', str, RuntimeVersion.SUFFIX), '/', '.')), new n20.c(r30.k.b1('/', str, str)), zX0);
    }

    public static final void i(final k0.c cVar, final b2.r rVar, k0.y yVar, n1 n1Var, final h0.h hVar, final h0.e eVar, t0 t0Var, boolean z10, h1 h1Var, final u00.k kVar, l1.j jVar, final int i10, final int i11, final int i12) {
        int i13;
        k0.y yVarA;
        n1 p1Var;
        int i14;
        h0.h hVar2;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        boolean z12;
        final t0 t0Var2;
        final h1 h1Var2;
        final k0.y yVar2;
        final n1 n1Var2;
        final boolean z13;
        r1 r1VarT;
        int i20;
        int i21;
        x.t tVarA;
        boolean zG;
        Object objN;
        t0 t0Var3;
        h1 h1VarB;
        int i22;
        int i23;
        int i24;
        Object objN2;
        int i25;
        int i26;
        int i27;
        int i28;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2072102870);
        if ((i10 & 6) == 0) {
            i13 = (g0Var.g(cVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if ((i12 & 4) == 0) {
                yVarA = yVar;
                if (g0Var.g(yVarA)) {
                    i28 = 256;
                }
                i13 |= i28;
            } else {
                yVarA = yVar;
            }
            i28 = Cast.MAX_NAMESPACE_LENGTH;
            i13 |= i28;
        } else {
            yVarA = yVar;
        }
        int i29 = i12 & 8;
        if (i29 == 0) {
            if ((i10 & 3072) == 0) {
                p1Var = n1Var;
                i13 |= g0Var.g(p1Var) ? 2048 : 1024;
            }
            i14 = i13 | 24576;
            if ((i10 & 196608) == 0) {
                hVar2 = hVar;
                if (g0Var.g(hVar2)) {
                    i27 = 131072;
                } else {
                    i27 = Cast.MAX_MESSAGE_LENGTH;
                }
                i14 |= i27;
            } else {
                hVar2 = hVar;
            }
            if ((1572864 & i10) == 0) {
                if (g0Var.g(eVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i14 |= i26;
            }
            if ((12582912 & i10) == 0) {
                i14 |= 4194304;
            }
            i15 = i12 & 256;
            if (i15 != 0) {
                i14 |= 100663296;
                i16 = 196608;
                z11 = z10;
            } else {
                i16 = 196608;
                z11 = z10;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.h(z11)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i14 |= i17;
                }
            }
            if ((i10 & 805306368) == 0) {
                i14 |= 268435456;
            }
            if ((i11 & 6) == 0) {
                if (g0Var.i(kVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i18 = i11 | i25;
            } else {
                i18 = i11;
            }
            i19 = 1;
            if ((i14 & 306783379) == 306783378 || (i18 & 3) != 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i14 & 1, z12)) {
                g0Var.X();
                i20 = i10 & 1;
                l1.c cVar2 = l1.i.f9868a;
                if (i20 != 0 || g0Var.A()) {
                    if ((i12 & 4) != 0) {
                        i21 = 0;
                        yVarA = k0.a0.a(0, g0Var, 3);
                        i14 &= -897;
                    } else {
                        i21 = 0;
                    }
                    if (i29 != 0) {
                        float f3 = i21;
                        p1Var = new p1(f3, f3, f3, f3);
                    }
                    tVarA = e2.a(g0Var);
                    zG = g0Var.g(tVarA);
                    objN = g0Var.N();
                    if (zG || objN == cVar2) {
                        objN = new d0.l(tVarA);
                        g0Var.n0(objN);
                    }
                    t0Var3 = (d0.l) objN;
                    if (i15 != 0) {
                        z11 = true;
                    }
                    h1VarB = i1.b(g0Var);
                    i22 = i14 & (-1908408321);
                } else {
                    g0Var.V();
                    if ((i12 & 4) != 0) {
                        i14 &= -897;
                    }
                    i22 = i14 & (-1908408321);
                    h1VarB = h1Var;
                    i21 = 0;
                    t0Var3 = t0Var;
                }
                n1 n1Var3 = p1Var;
                boolean z14 = z11;
                g0Var.s();
                i23 = (i22 & 14) | ((i22 >> 15) & 112);
                int i30 = ((((i23 & 14) ^ 6) > 4 || !g0Var.g(cVar)) && (i23 & 6) != 4) ? i21 : 1;
                if ((((i23 & 112) ^ 48) > 32 || !g0Var.g(eVar)) && (i23 & 48) != 32) {
                }
                i24 = i30 | i19;
                objN2 = g0Var.N();
                if (i24 == 0 || objN2 == cVar2) {
                    objN2 = new k0.e(new al.i(cVar, eVar, 27));
                    g0Var.n0(objN2);
                }
                int i31 = i22 >> 3;
                yVar2 = yVarA;
                h1 h1Var3 = h1VarB;
                t0 t0Var4 = t0Var3;
                o.c(rVar, yVar2, (k0.e) objN2, n1Var3, t0Var4, z14, h1Var3, hVar2, eVar, kVar, g0Var, (i31 & 29360128) | (i31 & 14) | i16 | (i31 & 112) | (i22 & 7168) | (57344 & i22) | ((i22 << 12) & 1879048192), ((i22 >> 18) & 14) | ((i18 << 3) & 112));
                n1Var2 = n1Var3;
                h1Var2 = h1Var3;
                z13 = z14;
                t0Var2 = t0Var4;
            } else {
                g0Var.V();
                t0Var2 = t0Var;
                h1Var2 = h1Var;
                yVar2 = yVarA;
                n1Var2 = p1Var;
                z13 = z11;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        int iK2 = l1.q.K(i11);
                        kh.n.i(cVar, rVar, yVar2, n1Var2, hVar, eVar, t0Var2, z13, h1Var2, kVar, (l1.j) obj, iK, iK2, i12);
                        return g00.b0.a;
                    }
                };
            }
        }
        i13 |= 3072;
        p1Var = n1Var;
        i14 = i13 | 24576;
        if ((i10 & 196608) == 0) {
            hVar2 = hVar;
            if (g0Var.g(hVar2)) {
                i27 = 131072;
            } else {
                i27 = Cast.MAX_MESSAGE_LENGTH;
            }
            i14 |= i27;
        } else {
            hVar2 = hVar;
        }
        if ((1572864 & i10) == 0) {
            if (g0Var.g(eVar)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i14 |= i26;
        }
        if ((12582912 & i10) == 0) {
            i14 |= 4194304;
        }
        i15 = i12 & 256;
        if (i15 != 0) {
            i14 |= 100663296;
            i16 = 196608;
            z11 = z10;
        } else {
            i16 = 196608;
            z11 = z10;
            if ((i10 & 100663296) == 0) {
                if (g0Var.h(z11)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i14 |= i17;
            }
        }
        if ((i10 & 805306368) == 0) {
            i14 |= 268435456;
        }
        if ((i11 & 6) == 0) {
            if (g0Var.i(kVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i18 = i11 | i25;
        } else {
            i18 = i11;
        }
        i19 = 1;
        if ((i14 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (g0Var.S(i14 & 1, z12)) {
            g0Var.X();
            i20 = i10 & 1;
            l1.c cVar3 = l1.i.f9868a;
            if (i20 != 0) {
                if ((i12 & 4) != 0) {
                    i21 = 0;
                    yVarA = k0.a0.a(0, g0Var, 3);
                    i14 &= -897;
                } else {
                    i21 = 0;
                }
                if (i29 != 0) {
                    float f10 = i21;
                    p1Var = new p1(f10, f10, f10, f10);
                }
                tVarA = e2.a(g0Var);
                zG = g0Var.g(tVarA);
                objN = g0Var.N();
                if (zG) {
                    objN = new d0.l(tVarA);
                    g0Var.n0(objN);
                } else {
                    objN = new d0.l(tVarA);
                    g0Var.n0(objN);
                }
                t0Var3 = (d0.l) objN;
                if (i15 != 0) {
                    z11 = true;
                }
                h1VarB = i1.b(g0Var);
                i22 = i14 & (-1908408321);
            } else {
                if ((i12 & 4) != 0) {
                    i21 = 0;
                    yVarA = k0.a0.a(0, g0Var, 3);
                    i14 &= -897;
                } else {
                    i21 = 0;
                }
                if (i29 != 0) {
                    float f11 = i21;
                    p1Var = new p1(f11, f11, f11, f11);
                }
                tVarA = e2.a(g0Var);
                zG = g0Var.g(tVarA);
                objN = g0Var.N();
                if (zG) {
                    objN = new d0.l(tVarA);
                    g0Var.n0(objN);
                } else {
                    objN = new d0.l(tVarA);
                    g0Var.n0(objN);
                }
                t0Var3 = (d0.l) objN;
                if (i15 != 0) {
                    z11 = true;
                }
                h1VarB = i1.b(g0Var);
                i22 = i14 & (-1908408321);
            }
            n1 n1Var4 = p1Var;
            boolean z15 = z11;
            g0Var.s();
            i23 = (i22 & 14) | ((i22 >> 15) & 112);
            if (((i23 & 14) ^ 6) > 4) {
            }
            i19 = ((i23 & 112) ^ 48) > 32 ? 0 : 0;
            i24 = i30 | i19;
            objN2 = g0Var.N();
            if (i24 == 0) {
                objN2 = new k0.e(new al.i(cVar, eVar, 27));
                g0Var.n0(objN2);
            } else {
                objN2 = new k0.e(new al.i(cVar, eVar, 27));
                g0Var.n0(objN2);
            }
            int i32 = i22 >> 3;
            yVar2 = yVarA;
            h1 h1Var4 = h1VarB;
            t0 t0Var5 = t0Var3;
            o.c(rVar, yVar2, (k0.e) objN2, n1Var4, t0Var5, z15, h1Var4, hVar2, eVar, kVar, g0Var, (i32 & 29360128) | (i32 & 14) | i16 | (i32 & 112) | (i22 & 7168) | (57344 & i22) | ((i22 << 12) & 1879048192), ((i22 >> 18) & 14) | ((i18 << 3) & 112));
            n1Var2 = n1Var4;
            h1Var2 = h1Var4;
            z13 = z15;
            t0Var2 = t0Var5;
        } else {
            g0Var.V();
            t0Var2 = t0Var;
            h1Var2 = h1Var;
            yVar2 = yVarA;
            n1Var2 = p1Var;
            z13 = z11;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    kh.n.i(cVar, rVar, yVar2, n1Var2, hVar, eVar, t0Var2, z13, h1Var2, kVar, (l1.j) obj, iK, iK2, i12);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final Class i0(e30.w wVar) throws a40.b0 {
        e30.a0 a0VarH;
        Class clsJ0 = j0(wVar.m0().g());
        if (clsJ0 == null) {
            return null;
        }
        if (x0.e(wVar) && ((a0VarH = q20.f.h(wVar)) == null || x0.e(a0VarH) || g10.i.G(a0VarH))) {
            return null;
        }
        return clsJ0;
    }

    public static final void j(Boolean bool, Object obj, androidx.lifecycle.w wVar, u00.k kVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(696924721);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(bool) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (g0Var.i(obj) ? 32 : 16) | Cast.MAX_NAMESPACE_LENGTH | (g0Var.i(kVar) ? 2048 : 1024);
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                wVar = (androidx.lifecycle.w) g0Var.k(r6.d.f13126a);
            } else {
                g0Var.V();
            }
            int i13 = i12 & (-897);
            g0Var.s();
            boolean zG = g0Var.g(bool) | g0Var.g(obj) | g0Var.g(wVar);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new r6.c(wVar.getLifecycle());
                g0Var.n0(objN);
            }
            k(wVar, (r6.c) objN, kVar, g0Var, (i13 >> 3) & 896);
        } else {
            g0Var.V();
        }
        androidx.lifecycle.w wVar2 = wVar;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g1.a(bool, obj, wVar2, kVar, i10, 7);
        }
    }

    public static final Class j0(j10.k kVar) throws a40.b0 {
        if (!(kVar instanceof j10.e) || !q20.f.b(kVar)) {
            return null;
        }
        j10.e eVar = (j10.e) kVar;
        Class clsI = i2.i(eVar);
        if (clsI != null) {
            return clsI;
        }
        throw new a40.b0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + u20.d.f((j10.h) kVar) + ')');
    }

    public static final void k(androidx.lifecycle.w wVar, r6.c cVar, u00.k kVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(228371534);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            boolean zI = g0Var.i(cVar) | ((i11 & 896) == 256) | g0Var.i(wVar);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new q0.t1(3, wVar, cVar, kVar);
                g0Var.n0(objN);
            }
            l1.q.c(wVar, cVar, (u00.k) objN, g0Var);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 20, wVar, cVar, kVar);
        }
    }

    public static final long k0(long j9) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final void l(String str, u00.a aVar, b2.r rVar, float f3, float f10, boolean z10, boolean z11, gl.d dVar, boolean z12, u00.n nVar, l1.j jVar, int i10, int i11, int i12) {
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z14;
        boolean z15;
        u00.n nVar2;
        float f13;
        float f14;
        boolean z16;
        boolean z17;
        r1 r1VarT;
        float f15;
        int i26;
        boolean z18;
        boolean z19;
        boolean z20;
        u00.n nVar3;
        Object objN;
        l1.c cVar;
        q2.a aVar2;
        b3.g gVar;
        boolean z21;
        boolean z22;
        boolean zI;
        Object objN2;
        int i27;
        kotlin.jvm.internal.m.e(str, "text");
        kotlin.jvm.internal.m.e(aVar, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(857360770);
        if ((i10 & 6) == 0) {
            i13 = (g0Var.g(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i28 = i12 & 8;
        if (i28 == 0) {
            if ((i10 & 3072) == 0) {
                f11 = f3;
                i13 |= g0Var.d(f11) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    f12 = f10;
                    if (g0Var.d(f12)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z10;
                        if (g0Var.h(z13)) {
                            i17 = 131072;
                        } else {
                            i17 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i13 |= i17;
                    }
                    i18 = i13 | 1572864;
                    i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
                    if (i19 != 0) {
                        if ((12582912 & i10) == 0) {
                            if (g0Var.h(z11)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i18 |= i20;
                        }
                        if ((i10 & 100663296) == 0) {
                            if (g0Var.e(dVar.ordinal())) {
                                i27 = 67108864;
                            } else {
                                i27 = 33554432;
                            }
                            i18 |= i27;
                        }
                        i21 = i12 & 512;
                        if (i21 != 0) {
                            i18 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (g0Var.h(z12)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i18 |= i22;
                        }
                        i23 = i11 | 6;
                        i24 = i12 & 2048;
                        if (i24 != 0) {
                            i23 = 54;
                        } else if ((i11 & 48) != 0) {
                            if (g0Var.i(nVar)) {
                                i25 = 32;
                            } else {
                                i25 = 16;
                            }
                            i23 |= i25;
                        }
                        int i29 = i23 | 384;
                        if ((i18 & 306783379) == 306783378 || (i29 & 147) != 146) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (g0Var.S(i18 & 1, z14)) {
                            if (i28 != 0) {
                                f15 = 20;
                            } else {
                                f15 = f11;
                            }
                            if (i14 != 0) {
                                f14 = 50;
                            } else {
                                f14 = f12;
                            }
                            i26 = i18;
                            if (i16 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i19 != 0) {
                                z19 = false;
                            } else {
                                z19 = z11;
                            }
                            if (i21 != 0) {
                                z20 = false;
                            } else {
                                z20 = z12;
                            }
                            if (i24 != 0) {
                                nVar3 = null;
                            } else {
                                nVar3 = nVar;
                            }
                            objN = g0Var.N();
                            cVar = l1.i.f9868a;
                            if (objN == cVar) {
                                objN = w.c.g(g0Var);
                            }
                            f0.i iVar = (f0.i) objN;
                            g1.r rVar2 = (g1.r) dVar.A.invoke(g0Var, 0);
                            aVar2 = (q2.a) g0Var.k(o1.l);
                            float f16 = f15;
                            w0 w0VarD = h0.o.d(b2.b.A, false);
                            int iHashCode = Long.hashCode(g0Var.T);
                            m1 m1VarM = g0Var.m();
                            b2.r rVarC = b2.a.c(rVar, g0Var);
                            b3.i.f2042c.getClass();
                            gVar = b3.h.f2035b;
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
                            b2.r rVarE = z1.e(z1.d(b2.o.A, 1.0f), f14);
                            p0.e eVarA = p0.f.a(f16);
                            if ((i26 & 112) == 32) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if ((i26 & 1879048192) == 536870912) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            zI = z21 | z22 | g0Var.i(aVar2);
                            objN2 = g0Var.N();
                            if (zI || objN2 == cVar) {
                                objN2 = new gl.a(aVar, z20, aVar2);
                                g0Var.n0(objN2);
                            }
                            x5.a((u00.a) objN2, rVarE, z18, eVarA, rVar2, null, null, iVar, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                            g0Var.r(true);
                            f13 = f16;
                            z15 = z19;
                            z17 = z20;
                            nVar2 = nVar3;
                            z16 = z18;
                        } else {
                            g0Var.V();
                            z15 = z11;
                            nVar2 = nVar;
                            f13 = f11;
                            f14 = f12;
                            z16 = z13;
                            z17 = z12;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                        }
                    }
                    i18 = i13 | 14155776;
                    if ((i10 & 100663296) == 0) {
                        if (g0Var.e(dVar.ordinal())) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i18 |= i27;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        i18 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (g0Var.h(z12)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i18 |= i22;
                    }
                    i23 = i11 | 6;
                    i24 = i12 & 2048;
                    if (i24 != 0) {
                        i23 = 54;
                    } else if ((i11 & 48) != 0) {
                        if (g0Var.i(nVar)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i23 |= i25;
                    }
                    int i210 = i23 | 384;
                    if ((i18 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (g0Var.S(i18 & 1, z14)) {
                        if (i28 != 0) {
                            f15 = 20;
                        } else {
                            f15 = f11;
                        }
                        if (i14 != 0) {
                            f14 = 50;
                        } else {
                            f14 = f12;
                        }
                        i26 = i18;
                        if (i16 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i19 != 0) {
                            z19 = false;
                        } else {
                            z19 = z11;
                        }
                        if (i21 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (i24 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                        objN = g0Var.N();
                        cVar = l1.i.f9868a;
                        if (objN == cVar) {
                            objN = w.c.g(g0Var);
                        }
                        f0.i iVar2 = (f0.i) objN;
                        g1.r rVar3 = (g1.r) dVar.A.invoke(g0Var, 0);
                        aVar2 = (q2.a) g0Var.k(o1.l);
                        float f17 = f15;
                        w0 w0VarD2 = h0.o.d(b2.b.A, false);
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        m1 m1VarM2 = g0Var.m();
                        b2.r rVarC2 = b2.a.c(rVar, g0Var);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD2, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC2, g0Var, b3.h.f2037d);
                        b2.r rVarE2 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                        p0.e eVarA2 = p0.f.a(f17);
                        if ((i26 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i26 & 1879048192) == 536870912) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zI = z21 | z22 | g0Var.i(aVar2);
                        objN2 = g0Var.N();
                        if (zI) {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        }
                        x5.a((u00.a) objN2, rVarE2, z18, eVarA2, rVar3, null, null, iVar2, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                        g0Var.r(true);
                        f13 = f17;
                        z15 = z19;
                        z17 = z20;
                        nVar2 = nVar3;
                        z16 = z18;
                    } else {
                        g0Var.V();
                        z15 = z11;
                        nVar2 = nVar;
                        f13 = f11;
                        f14 = f12;
                        z16 = z13;
                        z17 = z12;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                    }
                }
                i13 |= 196608;
                z13 = z10;
                i18 = i13 | 1572864;
                i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
                if (i19 != 0) {
                    if ((12582912 & i10) == 0) {
                        if (g0Var.h(z11)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i18 |= i20;
                    }
                    if ((i10 & 100663296) == 0) {
                        if (g0Var.e(dVar.ordinal())) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i18 |= i27;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        i18 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (g0Var.h(z12)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i18 |= i22;
                    }
                    i23 = i11 | 6;
                    i24 = i12 & 2048;
                    if (i24 != 0) {
                        i23 = 54;
                    } else if ((i11 & 48) != 0) {
                        if (g0Var.i(nVar)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i23 |= i25;
                    }
                    int i211 = i23 | 384;
                    if ((i18 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (g0Var.S(i18 & 1, z14)) {
                        if (i28 != 0) {
                            f15 = 20;
                        } else {
                            f15 = f11;
                        }
                        if (i14 != 0) {
                            f14 = 50;
                        } else {
                            f14 = f12;
                        }
                        i26 = i18;
                        if (i16 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i19 != 0) {
                            z19 = false;
                        } else {
                            z19 = z11;
                        }
                        if (i21 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (i24 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                        objN = g0Var.N();
                        cVar = l1.i.f9868a;
                        if (objN == cVar) {
                            objN = w.c.g(g0Var);
                        }
                        f0.i iVar3 = (f0.i) objN;
                        g1.r rVar4 = (g1.r) dVar.A.invoke(g0Var, 0);
                        aVar2 = (q2.a) g0Var.k(o1.l);
                        float f18 = f15;
                        w0 w0VarD3 = h0.o.d(b2.b.A, false);
                        int iHashCode3 = Long.hashCode(g0Var.T);
                        m1 m1VarM3 = g0Var.m();
                        b2.r rVarC3 = b2.a.c(rVar, g0Var);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD3, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM3, g0Var, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.f2040g);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC3, g0Var, b3.h.f2037d);
                        b2.r rVarE3 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                        p0.e eVarA3 = p0.f.a(f18);
                        if ((i26 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i26 & 1879048192) == 536870912) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zI = z21 | z22 | g0Var.i(aVar2);
                        objN2 = g0Var.N();
                        if (zI) {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        }
                        x5.a((u00.a) objN2, rVarE3, z18, eVarA3, rVar4, null, null, iVar3, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                        g0Var.r(true);
                        f13 = f18;
                        z15 = z19;
                        z17 = z20;
                        nVar2 = nVar3;
                        z16 = z18;
                    } else {
                        g0Var.V();
                        z15 = z11;
                        nVar2 = nVar;
                        f13 = f11;
                        f14 = f12;
                        z16 = z13;
                        z17 = z12;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                    }
                }
                i18 = i13 | 14155776;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i212 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar4 = (f0.i) objN;
                    g1.r rVar5 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f19 = f15;
                    w0 w0VarD4 = h0.o.d(b2.b.A, false);
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    m1 m1VarM4 = g0Var.m();
                    b2.r rVarC4 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD4, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM4, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC4, g0Var, b3.h.f2037d);
                    b2.r rVarE4 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA4 = p0.f.a(f19);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE4, z18, eVarA4, rVar5, null, null, iVar4, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f19;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i13 |= 24576;
            f12 = f10;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z10;
                    if (g0Var.h(z13)) {
                        i17 = 131072;
                    } else {
                        i17 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i13 |= i17;
                }
                i18 = i13 | 1572864;
                i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
                if (i19 != 0) {
                    if ((12582912 & i10) == 0) {
                        if (g0Var.h(z11)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i18 |= i20;
                    }
                    if ((i10 & 100663296) == 0) {
                        if (g0Var.e(dVar.ordinal())) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i18 |= i27;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        i18 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (g0Var.h(z12)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i18 |= i22;
                    }
                    i23 = i11 | 6;
                    i24 = i12 & 2048;
                    if (i24 != 0) {
                        i23 = 54;
                    } else if ((i11 & 48) != 0) {
                        if (g0Var.i(nVar)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i23 |= i25;
                    }
                    int i213 = i23 | 384;
                    if ((i18 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (g0Var.S(i18 & 1, z14)) {
                        if (i28 != 0) {
                            f15 = 20;
                        } else {
                            f15 = f11;
                        }
                        if (i14 != 0) {
                            f14 = 50;
                        } else {
                            f14 = f12;
                        }
                        i26 = i18;
                        if (i16 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i19 != 0) {
                            z19 = false;
                        } else {
                            z19 = z11;
                        }
                        if (i21 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (i24 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                        objN = g0Var.N();
                        cVar = l1.i.f9868a;
                        if (objN == cVar) {
                            objN = w.c.g(g0Var);
                        }
                        f0.i iVar5 = (f0.i) objN;
                        g1.r rVar6 = (g1.r) dVar.A.invoke(g0Var, 0);
                        aVar2 = (q2.a) g0Var.k(o1.l);
                        float f110 = f15;
                        w0 w0VarD5 = h0.o.d(b2.b.A, false);
                        int iHashCode5 = Long.hashCode(g0Var.T);
                        m1 m1VarM5 = g0Var.m();
                        b2.r rVarC5 = b2.a.c(rVar, g0Var);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD5, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM5, g0Var, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.f2040g);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC5, g0Var, b3.h.f2037d);
                        b2.r rVarE5 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                        p0.e eVarA5 = p0.f.a(f110);
                        if ((i26 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i26 & 1879048192) == 536870912) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zI = z21 | z22 | g0Var.i(aVar2);
                        objN2 = g0Var.N();
                        if (zI) {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        }
                        x5.a((u00.a) objN2, rVarE5, z18, eVarA5, rVar6, null, null, iVar5, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                        g0Var.r(true);
                        f13 = f110;
                        z15 = z19;
                        z17 = z20;
                        nVar2 = nVar3;
                        z16 = z18;
                    } else {
                        g0Var.V();
                        z15 = z11;
                        nVar2 = nVar;
                        f13 = f11;
                        f14 = f12;
                        z16 = z13;
                        z17 = z12;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                    }
                }
                i18 = i13 | 14155776;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i214 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar6 = (f0.i) objN;
                    g1.r rVar7 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f111 = f15;
                    w0 w0VarD6 = h0.o.d(b2.b.A, false);
                    int iHashCode6 = Long.hashCode(g0Var.T);
                    m1 m1VarM6 = g0Var.m();
                    b2.r rVarC6 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD6, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM6, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC6, g0Var, b3.h.f2037d);
                    b2.r rVarE6 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA6 = p0.f.a(f111);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE6, z18, eVarA6, rVar7, null, null, iVar6, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f111;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i13 |= 196608;
            z13 = z10;
            i18 = i13 | 1572864;
            i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
            if (i19 != 0) {
                if ((12582912 & i10) == 0) {
                    if (g0Var.h(z11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i18 |= i20;
                }
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i215 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar7 = (f0.i) objN;
                    g1.r rVar8 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f112 = f15;
                    w0 w0VarD7 = h0.o.d(b2.b.A, false);
                    int iHashCode7 = Long.hashCode(g0Var.T);
                    m1 m1VarM7 = g0Var.m();
                    b2.r rVarC7 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD7, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM7, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC7, g0Var, b3.h.f2037d);
                    b2.r rVarE7 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA7 = p0.f.a(f112);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE7, z18, eVarA7, rVar8, null, null, iVar7, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f112;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i18 = i13 | 14155776;
            if ((i10 & 100663296) == 0) {
                if (g0Var.e(dVar.ordinal())) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i18 |= i27;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                i18 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (g0Var.h(z12)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i18 |= i22;
            }
            i23 = i11 | 6;
            i24 = i12 & 2048;
            if (i24 != 0) {
                i23 = 54;
            } else if ((i11 & 48) != 0) {
                if (g0Var.i(nVar)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i23 |= i25;
            }
            int i216 = i23 | 384;
            if ((i18 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (g0Var.S(i18 & 1, z14)) {
                if (i28 != 0) {
                    f15 = 20;
                } else {
                    f15 = f11;
                }
                if (i14 != 0) {
                    f14 = 50;
                } else {
                    f14 = f12;
                }
                i26 = i18;
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z11;
                }
                if (i21 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (i24 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                objN = g0Var.N();
                cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = w.c.g(g0Var);
                }
                f0.i iVar8 = (f0.i) objN;
                g1.r rVar9 = (g1.r) dVar.A.invoke(g0Var, 0);
                aVar2 = (q2.a) g0Var.k(o1.l);
                float f113 = f15;
                w0 w0VarD8 = h0.o.d(b2.b.A, false);
                int iHashCode8 = Long.hashCode(g0Var.T);
                m1 m1VarM8 = g0Var.m();
                b2.r rVarC8 = b2.a.c(rVar, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD8, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM8, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC8, g0Var, b3.h.f2037d);
                b2.r rVarE8 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                p0.e eVarA8 = p0.f.a(f113);
                if ((i26 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i26 & 1879048192) == 536870912) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI = z21 | z22 | g0Var.i(aVar2);
                objN2 = g0Var.N();
                if (zI) {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                }
                x5.a((u00.a) objN2, rVarE8, z18, eVarA8, rVar9, null, null, iVar8, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                g0Var.r(true);
                f13 = f113;
                z15 = z19;
                z17 = z20;
                nVar2 = nVar3;
                z16 = z18;
            } else {
                g0Var.V();
                z15 = z11;
                nVar2 = nVar;
                f13 = f11;
                f14 = f12;
                z16 = z13;
                z17 = z12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
            }
        }
        i13 |= 3072;
        f11 = f3;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                f12 = f10;
                if (g0Var.d(f12)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z10;
                    if (g0Var.h(z13)) {
                        i17 = 131072;
                    } else {
                        i17 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i13 |= i17;
                }
                i18 = i13 | 1572864;
                i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
                if (i19 != 0) {
                    if ((12582912 & i10) == 0) {
                        if (g0Var.h(z11)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i18 |= i20;
                    }
                    if ((i10 & 100663296) == 0) {
                        if (g0Var.e(dVar.ordinal())) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i18 |= i27;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        i18 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (g0Var.h(z12)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i18 |= i22;
                    }
                    i23 = i11 | 6;
                    i24 = i12 & 2048;
                    if (i24 != 0) {
                        i23 = 54;
                    } else if ((i11 & 48) != 0) {
                        if (g0Var.i(nVar)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i23 |= i25;
                    }
                    int i217 = i23 | 384;
                    if ((i18 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (g0Var.S(i18 & 1, z14)) {
                        if (i28 != 0) {
                            f15 = 20;
                        } else {
                            f15 = f11;
                        }
                        if (i14 != 0) {
                            f14 = 50;
                        } else {
                            f14 = f12;
                        }
                        i26 = i18;
                        if (i16 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i19 != 0) {
                            z19 = false;
                        } else {
                            z19 = z11;
                        }
                        if (i21 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (i24 != 0) {
                            nVar3 = null;
                        } else {
                            nVar3 = nVar;
                        }
                        objN = g0Var.N();
                        cVar = l1.i.f9868a;
                        if (objN == cVar) {
                            objN = w.c.g(g0Var);
                        }
                        f0.i iVar9 = (f0.i) objN;
                        g1.r rVar10 = (g1.r) dVar.A.invoke(g0Var, 0);
                        aVar2 = (q2.a) g0Var.k(o1.l);
                        float f114 = f15;
                        w0 w0VarD9 = h0.o.d(b2.b.A, false);
                        int iHashCode9 = Long.hashCode(g0Var.T);
                        m1 m1VarM9 = g0Var.m();
                        b2.r rVarC9 = b2.a.c(rVar, g0Var);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD9, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM9, g0Var, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode9), g0Var, b3.h.f2040g);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC9, g0Var, b3.h.f2037d);
                        b2.r rVarE9 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                        p0.e eVarA9 = p0.f.a(f114);
                        if ((i26 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i26 & 1879048192) == 536870912) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zI = z21 | z22 | g0Var.i(aVar2);
                        objN2 = g0Var.N();
                        if (zI) {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new gl.a(aVar, z20, aVar2);
                            g0Var.n0(objN2);
                        }
                        x5.a((u00.a) objN2, rVarE9, z18, eVarA9, rVar10, null, null, iVar9, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                        g0Var.r(true);
                        f13 = f114;
                        z15 = z19;
                        z17 = z20;
                        nVar2 = nVar3;
                        z16 = z18;
                    } else {
                        g0Var.V();
                        z15 = z11;
                        nVar2 = nVar;
                        f13 = f11;
                        f14 = f12;
                        z16 = z13;
                        z17 = z12;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                    }
                }
                i18 = i13 | 14155776;
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i218 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar10 = (f0.i) objN;
                    g1.r rVar11 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f115 = f15;
                    w0 w0VarD10 = h0.o.d(b2.b.A, false);
                    int iHashCode10 = Long.hashCode(g0Var.T);
                    m1 m1VarM10 = g0Var.m();
                    b2.r rVarC10 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD10, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM10, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode10), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC10, g0Var, b3.h.f2037d);
                    b2.r rVarE10 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA10 = p0.f.a(f115);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE10, z18, eVarA10, rVar11, null, null, iVar10, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f115;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i13 |= 196608;
            z13 = z10;
            i18 = i13 | 1572864;
            i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
            if (i19 != 0) {
                if ((12582912 & i10) == 0) {
                    if (g0Var.h(z11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i18 |= i20;
                }
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i219 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar11 = (f0.i) objN;
                    g1.r rVar12 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f116 = f15;
                    w0 w0VarD11 = h0.o.d(b2.b.A, false);
                    int iHashCode11 = Long.hashCode(g0Var.T);
                    m1 m1VarM11 = g0Var.m();
                    b2.r rVarC11 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD11, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM11, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode11), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC11, g0Var, b3.h.f2037d);
                    b2.r rVarE11 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA11 = p0.f.a(f116);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE11, z18, eVarA11, rVar12, null, null, iVar11, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f116;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i18 = i13 | 14155776;
            if ((i10 & 100663296) == 0) {
                if (g0Var.e(dVar.ordinal())) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i18 |= i27;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                i18 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (g0Var.h(z12)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i18 |= i22;
            }
            i23 = i11 | 6;
            i24 = i12 & 2048;
            if (i24 != 0) {
                i23 = 54;
            } else if ((i11 & 48) != 0) {
                if (g0Var.i(nVar)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i23 |= i25;
            }
            int i2110 = i23 | 384;
            if ((i18 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (g0Var.S(i18 & 1, z14)) {
                if (i28 != 0) {
                    f15 = 20;
                } else {
                    f15 = f11;
                }
                if (i14 != 0) {
                    f14 = 50;
                } else {
                    f14 = f12;
                }
                i26 = i18;
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z11;
                }
                if (i21 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (i24 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                objN = g0Var.N();
                cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = w.c.g(g0Var);
                }
                f0.i iVar12 = (f0.i) objN;
                g1.r rVar13 = (g1.r) dVar.A.invoke(g0Var, 0);
                aVar2 = (q2.a) g0Var.k(o1.l);
                float f117 = f15;
                w0 w0VarD12 = h0.o.d(b2.b.A, false);
                int iHashCode12 = Long.hashCode(g0Var.T);
                m1 m1VarM12 = g0Var.m();
                b2.r rVarC12 = b2.a.c(rVar, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD12, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM12, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode12), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC12, g0Var, b3.h.f2037d);
                b2.r rVarE12 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                p0.e eVarA12 = p0.f.a(f117);
                if ((i26 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i26 & 1879048192) == 536870912) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI = z21 | z22 | g0Var.i(aVar2);
                objN2 = g0Var.N();
                if (zI) {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                }
                x5.a((u00.a) objN2, rVarE12, z18, eVarA12, rVar13, null, null, iVar12, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                g0Var.r(true);
                f13 = f117;
                z15 = z19;
                z17 = z20;
                nVar2 = nVar3;
                z16 = z18;
            } else {
                g0Var.V();
                z15 = z11;
                nVar2 = nVar;
                f13 = f11;
                f14 = f12;
                z16 = z13;
                z17 = z12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
            }
        }
        i13 |= 24576;
        f12 = f10;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i10) == 0) {
                z13 = z10;
                if (g0Var.h(z13)) {
                    i17 = 131072;
                } else {
                    i17 = Cast.MAX_MESSAGE_LENGTH;
                }
                i13 |= i17;
            }
            i18 = i13 | 1572864;
            i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
            if (i19 != 0) {
                if ((12582912 & i10) == 0) {
                    if (g0Var.h(z11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i18 |= i20;
                }
                if ((i10 & 100663296) == 0) {
                    if (g0Var.e(dVar.ordinal())) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i18 |= i27;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i18 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (g0Var.h(z12)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i18 |= i22;
                }
                i23 = i11 | 6;
                i24 = i12 & 2048;
                if (i24 != 0) {
                    i23 = 54;
                } else if ((i11 & 48) != 0) {
                    if (g0Var.i(nVar)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i23 |= i25;
                }
                int i2111 = i23 | 384;
                if ((i18 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (g0Var.S(i18 & 1, z14)) {
                    if (i28 != 0) {
                        f15 = 20;
                    } else {
                        f15 = f11;
                    }
                    if (i14 != 0) {
                        f14 = 50;
                    } else {
                        f14 = f12;
                    }
                    i26 = i18;
                    if (i16 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z11;
                    }
                    if (i21 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i24 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar13 = (f0.i) objN;
                    g1.r rVar14 = (g1.r) dVar.A.invoke(g0Var, 0);
                    aVar2 = (q2.a) g0Var.k(o1.l);
                    float f118 = f15;
                    w0 w0VarD13 = h0.o.d(b2.b.A, false);
                    int iHashCode13 = Long.hashCode(g0Var.T);
                    m1 m1VarM13 = g0Var.m();
                    b2.r rVarC13 = b2.a.c(rVar, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD13, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM13, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode13), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC13, g0Var, b3.h.f2037d);
                    b2.r rVarE13 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                    p0.e eVarA13 = p0.f.a(f118);
                    if ((i26 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i26 & 1879048192) == 536870912) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI = z21 | z22 | g0Var.i(aVar2);
                    objN2 = g0Var.N();
                    if (zI) {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new gl.a(aVar, z20, aVar2);
                        g0Var.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE13, z18, eVarA13, rVar14, null, null, iVar13, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                    g0Var.r(true);
                    f13 = f118;
                    z15 = z19;
                    z17 = z20;
                    nVar2 = nVar3;
                    z16 = z18;
                } else {
                    g0Var.V();
                    z15 = z11;
                    nVar2 = nVar;
                    f13 = f11;
                    f14 = f12;
                    z16 = z13;
                    z17 = z12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
                }
            }
            i18 = i13 | 14155776;
            if ((i10 & 100663296) == 0) {
                if (g0Var.e(dVar.ordinal())) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i18 |= i27;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                i18 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (g0Var.h(z12)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i18 |= i22;
            }
            i23 = i11 | 6;
            i24 = i12 & 2048;
            if (i24 != 0) {
                i23 = 54;
            } else if ((i11 & 48) != 0) {
                if (g0Var.i(nVar)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i23 |= i25;
            }
            int i2112 = i23 | 384;
            if ((i18 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (g0Var.S(i18 & 1, z14)) {
                if (i28 != 0) {
                    f15 = 20;
                } else {
                    f15 = f11;
                }
                if (i14 != 0) {
                    f14 = 50;
                } else {
                    f14 = f12;
                }
                i26 = i18;
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z11;
                }
                if (i21 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (i24 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                objN = g0Var.N();
                cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = w.c.g(g0Var);
                }
                f0.i iVar14 = (f0.i) objN;
                g1.r rVar15 = (g1.r) dVar.A.invoke(g0Var, 0);
                aVar2 = (q2.a) g0Var.k(o1.l);
                float f119 = f15;
                w0 w0VarD14 = h0.o.d(b2.b.A, false);
                int iHashCode14 = Long.hashCode(g0Var.T);
                m1 m1VarM14 = g0Var.m();
                b2.r rVarC14 = b2.a.c(rVar, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD14, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM14, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode14), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC14, g0Var, b3.h.f2037d);
                b2.r rVarE14 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                p0.e eVarA14 = p0.f.a(f119);
                if ((i26 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i26 & 1879048192) == 536870912) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI = z21 | z22 | g0Var.i(aVar2);
                objN2 = g0Var.N();
                if (zI) {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                }
                x5.a((u00.a) objN2, rVarE14, z18, eVarA14, rVar15, null, null, iVar14, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                g0Var.r(true);
                f13 = f119;
                z15 = z19;
                z17 = z20;
                nVar2 = nVar3;
                z16 = z18;
            } else {
                g0Var.V();
                z15 = z11;
                nVar2 = nVar;
                f13 = f11;
                f14 = f12;
                z16 = z13;
                z17 = z12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
            }
        }
        i13 |= 196608;
        z13 = z10;
        i18 = i13 | 1572864;
        i19 = i12 & Cast.MAX_NAMESPACE_LENGTH;
        if (i19 != 0) {
            if ((12582912 & i10) == 0) {
                if (g0Var.h(z11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i18 |= i20;
            }
            if ((i10 & 100663296) == 0) {
                if (g0Var.e(dVar.ordinal())) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i18 |= i27;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                i18 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (g0Var.h(z12)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i18 |= i22;
            }
            i23 = i11 | 6;
            i24 = i12 & 2048;
            if (i24 != 0) {
                i23 = 54;
            } else if ((i11 & 48) != 0) {
                if (g0Var.i(nVar)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i23 |= i25;
            }
            int i2113 = i23 | 384;
            if ((i18 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (g0Var.S(i18 & 1, z14)) {
                if (i28 != 0) {
                    f15 = 20;
                } else {
                    f15 = f11;
                }
                if (i14 != 0) {
                    f14 = 50;
                } else {
                    f14 = f12;
                }
                i26 = i18;
                if (i16 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z11;
                }
                if (i21 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (i24 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                objN = g0Var.N();
                cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = w.c.g(g0Var);
                }
                f0.i iVar15 = (f0.i) objN;
                g1.r rVar16 = (g1.r) dVar.A.invoke(g0Var, 0);
                aVar2 = (q2.a) g0Var.k(o1.l);
                float f1110 = f15;
                w0 w0VarD15 = h0.o.d(b2.b.A, false);
                int iHashCode15 = Long.hashCode(g0Var.T);
                m1 m1VarM15 = g0Var.m();
                b2.r rVarC15 = b2.a.c(rVar, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD15, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM15, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode15), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC15, g0Var, b3.h.f2037d);
                b2.r rVarE15 = z1.e(z1.d(b2.o.A, 1.0f), f14);
                p0.e eVarA15 = p0.f.a(f1110);
                if ((i26 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i26 & 1879048192) == 536870912) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI = z21 | z22 | g0Var.i(aVar2);
                objN2 = g0Var.N();
                if (zI) {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new gl.a(aVar, z20, aVar2);
                    g0Var.n0(objN2);
                }
                x5.a((u00.a) objN2, rVarE15, z18, eVarA15, rVar16, null, null, iVar15, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
                g0Var.r(true);
                f13 = f1110;
                z15 = z19;
                z17 = z20;
                nVar2 = nVar3;
                z16 = z18;
            } else {
                g0Var.V();
                z15 = z11;
                nVar2 = nVar;
                f13 = f11;
                f14 = f12;
                z16 = z13;
                z17 = z12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
            }
        }
        i18 = i13 | 14155776;
        if ((i10 & 100663296) == 0) {
            if (g0Var.e(dVar.ordinal())) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i18 |= i27;
        }
        i21 = i12 & 512;
        if (i21 != 0) {
            i18 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (g0Var.h(z12)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i18 |= i22;
        }
        i23 = i11 | 6;
        i24 = i12 & 2048;
        if (i24 != 0) {
            i23 = 54;
        } else if ((i11 & 48) != 0) {
            if (g0Var.i(nVar)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i23 |= i25;
        }
        int i2114 = i23 | 384;
        if ((i18 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (g0Var.S(i18 & 1, z14)) {
            if (i28 != 0) {
                f15 = 20;
            } else {
                f15 = f11;
            }
            if (i14 != 0) {
                f14 = 50;
            } else {
                f14 = f12;
            }
            i26 = i18;
            if (i16 != 0) {
                z18 = true;
            } else {
                z18 = z13;
            }
            if (i19 != 0) {
                z19 = false;
            } else {
                z19 = z11;
            }
            if (i21 != 0) {
                z20 = false;
            } else {
                z20 = z12;
            }
            if (i24 != 0) {
                nVar3 = null;
            } else {
                nVar3 = nVar;
            }
            objN = g0Var.N();
            cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = w.c.g(g0Var);
            }
            f0.i iVar16 = (f0.i) objN;
            g1.r rVar17 = (g1.r) dVar.A.invoke(g0Var, 0);
            aVar2 = (q2.a) g0Var.k(o1.l);
            float f1111 = f15;
            w0 w0VarD16 = h0.o.d(b2.b.A, false);
            int iHashCode16 = Long.hashCode(g0Var.T);
            m1 m1VarM16 = g0Var.m();
            b2.r rVarC16 = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD16, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM16, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode16), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC16, g0Var, b3.h.f2037d);
            b2.r rVarE16 = z1.e(z1.d(b2.o.A, 1.0f), f14);
            p0.e eVarA16 = p0.f.a(f1111);
            if ((i26 & 112) == 32) {
                z21 = true;
            } else {
                z21 = false;
            }
            if ((i26 & 1879048192) == 536870912) {
                z22 = true;
            } else {
                z22 = false;
            }
            zI = z21 | z22 | g0Var.i(aVar2);
            objN2 = g0Var.N();
            if (zI) {
                objN2 = new gl.a(aVar, z20, aVar2);
                g0Var.n0(objN2);
            } else {
                objN2 = new gl.a(aVar, z20, aVar2);
                g0Var.n0(objN2);
            }
            x5.a((u00.a) objN2, rVarE16, z18, eVarA16, rVar17, null, null, iVar16, v1.d.d(-1968060724, new as.o0(z19, dVar, str, nVar3), g0Var), g0Var, ((i26 >> 9) & 896) | 905969664, 224);
            g0Var.r(true);
            f13 = f1111;
            z15 = z19;
            z17 = z20;
            nVar2 = nVar3;
            z16 = z18;
        } else {
            g0Var.V();
            z15 = z11;
            nVar2 = nVar;
            f13 = f11;
            f14 = f12;
            z16 = z13;
            z17 = z12;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new gl.b(str, aVar, rVar, f13, f14, z16, z15, dVar, z17, nVar2, i10, i11, i12);
        }
    }

    public static final p30.r l0(s10.b1 b1Var, ClassLoader classLoader, g2 g2Var, u00.a aVar) throws NoWhenBranchMatchedException, a40.b0 {
        a10.e eVarA;
        a10.e eVarI;
        ArrayList arrayList;
        Iterator it;
        s10.b1 b1Var2;
        p30.m mVarN;
        a10.x xVarL0;
        s10.o0 o0VarA;
        s10.o0 o0Var;
        String str;
        s10.o0 o0VarA2;
        s10.o0 o0Var2;
        String str2;
        n20.b bVarH0;
        kotlin.jvm.internal.m.e(b1Var, "<this>");
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        List listU0 = q30.l.u0(new q30.i(new q30.g(q30.l.n0(b1Var, d10.b.L), d10.b.M, q30.n.A), new d10.e(classLoader, g2Var, aVar, zVar, 0)));
        s10.o0 o0VarA3 = b1Var.a();
        if (o0VarA3 instanceof s10.o0) {
            String str3 = o0VarA3.d;
            if (kotlin.jvm.internal.m.a(str3, "kotlin/Array")) {
                a10.x xVar = ((a10.z) h00.q.d1(listU0)).b;
                if (xVar == null) {
                    xVar = d2.a;
                }
                eVarI = k00.f.I(i2.c(k00.f.D(f50.k.q(xVar))));
            } else {
                eVarA = Q(classLoader, str3);
                if (eVarA == null) {
                    throw new a40.b0("Class not found: ".concat(str3));
                }
            }
            boolean zJ = s10.p.g.j(s10.p.a[46], b1Var);
            u10.d dVar = w10.g.c;
            kotlin.jvm.internal.m.e(dVar, "type");
            ArrayList arrayList2 = ((u10.h) z3.R(b1Var.g, dVar)).b;
            arrayList = new ArrayList(h00.r.q0(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(d0((s10.s) it.next(), classLoader));
            }
            b1Var2 = b1Var.d;
            mVarN = null;
            if (b1Var2 != null) {
                xVarL0 = l0(b1Var2, classLoader, g2Var, null);
            } else {
                xVarL0 = null;
            }
            s10.w0 w0Var = s10.p.i;
            a10.w[] wVarArr = s10.p.a;
            boolean zJ2 = w0Var.j(wVarArr[48], b1Var);
            o0VarA = b1Var.a();
            if (o0VarA instanceof s10.o0) {
                o0Var = o0VarA;
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                str = o0Var.d;
            } else {
                str = null;
            }
            boolean zA = kotlin.jvm.internal.m.a(str, "kotlin/Nothing");
            boolean zJ3 = s10.p.h.j(wVarArr[47], b1Var);
            o0VarA2 = b1Var.a();
            if (o0VarA2 instanceof s10.o0) {
                o0Var2 = o0VarA2;
            } else {
                o0Var2 = null;
            }
            if (o0Var2 != null && (str2 = o0Var2.d) != null) {
                bVarH0 = h0(str2);
                if (i10.d.l.containsKey(bVarH0)) {
                    mVarN = w50.c.N((a10.d) eVarI, bVarH0.a());
                }
            }
            p30.r rVar = new p30.r(eVarI, listU0, zJ, arrayList, xVarL0, zJ2, zA, zJ3, mVarN, aVar);
            zVar.A = rVar;
            return rVar;
        }
        if (o0VarA3 instanceof p0) {
            eVarA = new d10.q1(h0(((p0) o0VarA3).d).a());
        } else {
            if (!(o0VarA3 instanceof s10.q0)) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = ((s10.q0) o0VarA3).d;
            eVarA = g2Var.a(i10);
            if (eVarA == null) {
                throw new a40.b0(g4.c.f(i10, "Type parameter not found: "));
            }
        }
        eVarI = eVarA;
        boolean zJ4 = s10.p.g.j(s10.p.a[46], b1Var);
        u10.d dVar2 = w10.g.c;
        kotlin.jvm.internal.m.e(dVar2, "type");
        ArrayList arrayList3 = ((u10.h) z3.R(b1Var.g, dVar2)).b;
        arrayList = new ArrayList(h00.r.q0(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList.add(d0((s10.s) it.next(), classLoader));
        }
        b1Var2 = b1Var.d;
        mVarN = null;
        if (b1Var2 != null) {
            xVarL0 = l0(b1Var2, classLoader, g2Var, null);
        } else {
            xVarL0 = null;
        }
        s10.w0 w0Var2 = s10.p.i;
        a10.w[] wVarArr2 = s10.p.a;
        boolean zJ5 = w0Var2.j(wVarArr2[48], b1Var);
        o0VarA = b1Var.a();
        if (o0VarA instanceof s10.o0) {
            o0Var = o0VarA;
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            str = o0Var.d;
        } else {
            str = null;
        }
        boolean zA2 = kotlin.jvm.internal.m.a(str, "kotlin/Nothing");
        boolean zJ6 = s10.p.h.j(wVarArr2[47], b1Var);
        o0VarA2 = b1Var.a();
        if (o0VarA2 instanceof s10.o0) {
            o0Var2 = o0VarA2;
        } else {
            o0Var2 = null;
        }
        if (o0Var2 != null) {
            bVarH0 = h0(str2);
            if (i10.d.l.containsKey(bVarH0)) {
                mVarN = w50.c.N((a10.d) eVarI, bVarH0.a());
            }
        }
        p30.r rVar2 = new p30.r(eVarI, listU0, zJ4, arrayList, xVarL0, zJ5, zA2, zJ6, mVarN, aVar);
        zVar.A = rVar2;
        return rVar2;
    }

    public static final s9.b m(BackEvent backEvent) {
        return new s9.b(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final long m0(long j9) {
        return (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j9 >> 32)) << 32);
    }

    public static final void n(int i10, b2.r rVar, String str, l1.j jVar, u00.k kVar, boolean z10) {
        kotlin.jvm.internal.m.e(str, "query");
        kotlin.jvm.internal.m.e(kVar, "onQueryChanged");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1641321417);
        int i11 = i10 | (g0Var.g(str) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            z0.g gVarH = z0.h.h(str, g0Var, i11 & 14);
            z0 z0VarG = l1.q.G(kVar, g0Var);
            t2 t2Var = (t2) g0Var.k(o1.f2741q);
            boolean zG = g0Var.g(gVarH) | g0Var.g(z0VarG);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            k00.c cVar2 = null;
            if (zG || objN == cVar) {
                objN = new d0.i2(gVarH, z0VarG, cVar2, 26);
                g0Var.n0(objN);
            }
            l1.q.i(gVarH, g0Var, (u00.n) objN);
            b2.r rVarC = f2.h.c(z1.d(rVar, 1.0f), p0.f.f12243a);
            long j9 = dl.a.i;
            float f3 = 16;
            b2.r rVarD = h0.c.D(z.n.f(rVarC, i2.t.b(0.08f, j9), i2.b0.f7111b), f3, z10 ? 14 : 10);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var, fVar4);
            float f10 = 20;
            b2.o oVar = b2.o.A;
            b2.r rVarM = z1.m(oVar, f10);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            o3.a(y3.R(2131231375, g0Var, 0), null, z1.m(oVar, f3), i2.t.b(0.5f, j9), g0Var, 440, 0);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            m3.r0 r0Var = new m3.r0(j9, o.z(16), null, null, 0L, 0L, 0, 0, o.z(22), null, 16646140);
            z0.e eVar2 = z0.e.B;
            v0 v0Var = new v0(j9);
            int i12 = 0;
            q0.i1 i1Var = new q0.i1(i12, i12, 3, 116);
            boolean zG2 = g0Var.g(t2Var);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = new qp.b(t2Var, 2);
                g0Var.n0(objN2);
            }
            q0.c0.d(gVarH, c1Var, false, r0Var, i1Var, (qp.b) objN2, eVar2, null, v0Var, new fv.d(gVarH), null, g0Var, 102236160, 22044);
            g0Var = g0Var;
            if (gVarH.d().C.length() > 0) {
                g0Var.c0(-1841832947);
                b2.r rVarM2 = z1.m(oVar, f10);
                boolean zG3 = g0Var.g(gVarH);
                Object objN3 = g0Var.N();
                if (zG3 || objN3 == cVar) {
                    av.k kVar2 = new av.k(0, gVarH, z0.h.class, "clearText", "clearText(Landroidx/compose/foundation/text/input/TextFieldState;)V", 1, 10);
                    g0Var.n0(kVar2);
                    objN3 = kVar2;
                }
                o3.a(y3.R(2131231431, g0Var, 0), z3.U(g0Var, 2131887067), w50.c.o(rVarM2, false, (j3.k) null, (a10.g) objN3, 7), i2.t.b(0.5f, j9), g0Var, 8, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1841438627);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c00.l(str, kVar, z10, rVar, i10, 2);
        }
    }

    public static n20.b n0(n20.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "topLevelFqName");
        return new n20.b(cVar.b(), cVar.a.g());
    }

    public static final void o(String str, l1.j jVar, int i10) {
        String str2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2049421961);
        int i11 = (g0Var.g(str) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            str2 = str;
            ze.d.e(str2, null, new n6.e(dn.d.a, new y3.o(f50.c.a0(o.z(24), str)), new n6.b(700), null, 120), 1, g0Var, (i11 & 14) | 3072, 2);
        } else {
            str2 = str;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.n(str2, i10, 3);
        }
    }

    public static final void o0(t10.h hVar) {
        int i10 = t10.g.B;
        if (hVar.b != 1 || hVar.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static final void p(float f3, b6.m mVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-17269041);
        int i11 = i10 | 48;
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            w50.c.d(new b6.a(2131231427), (String) null, ze.d.R(f3), 0, (b6.e) null, g0Var, 48, 24);
            mVar = b6.k.f2179a;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dn.g(f3, mVar, i10, 0);
        }
    }

    public static final p10.a p0(kotlin.jvm.internal.p pVar) {
        k20.c cVar = k20.e.d;
        kotlin.jvm.internal.m.d(cVar, "VISIBILITY");
        n00.b bVar = s10.m1.D;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        g00.s sVar = new g00.s(bVar, 4);
        while (sVar.hasNext()) {
            arrayList.add(((s10.m1) sVar.next()).A);
        }
        return new p10.a(pVar, cVar, bVar, arrayList);
    }

    public static final void q(Bitmap bitmap, String str, float f3, b6.m mVar, l1.j jVar, int i10) {
        b6.m mVar2;
        b6.d dVar;
        kotlin.jvm.internal.m.e(str, "name");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-800562231);
        int i11 = (g0Var.i(bitmap) ? 4 : 2) | i10 | (g0Var.g(str) ? 32 : 16) | (g0Var.d(f3) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | 3072;
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            if (bitmap != null) {
                g0Var.c0(404140787);
                g0Var.r(false);
                dVar = new b6.d(bitmap);
            } else {
                g0Var.c0(404190263);
                Context context = (Context) g0Var.k(b6.g.f2169b);
                String upperCase = r30.k.h1(1, str).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                b6.d dVar2 = new b6.d(f50.c.Q(context, f3, upperCase));
                g0Var.r(false);
                dVar = dVar2;
            }
            w50.c.d(dVar, str, ze.d.R(f3), 0, (b6.e) null, g0Var, i11 & 112, 24);
            mVar2 = b6.k.f2179a;
        } else {
            g0Var.V();
            mVar2 = mVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.g(bitmap, str, f3, mVar2, i10, 2);
        }
    }

    public static com.google.android.gms.internal.measurement.n q0(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.n.f3815g;
        }
        if (obj instanceof String) {
            return new com.google.android.gms.internal.measurement.q((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.g((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.d dVar = new com.google.android.gms.internal.measurement.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.o(dVar.m(), q0(it.next()));
            }
            return dVar;
        }
        com.google.android.gms.internal.measurement.k kVar = new com.google.android.gms.internal.measurement.k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.n nVarQ0 = q0(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                kVar.c((String) string, nVarQ0);
            }
        }
        return kVar;
    }

    public static final void r(String str, b6.m mVar, y3.f fVar, l1.j jVar, int i10, int i11) {
        b6.m mVar2;
        int i12;
        y3.f fVar2;
        int i13;
        b6.m mVar3;
        y3.f fVar3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1509405912);
        int i14 = i10 | (g0Var.g(str) ? 4 : 2);
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 = i14 | 48;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            i12 = i14 | (g0Var.g(mVar2) ? 32 : 16);
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i13 = i12 | 384;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i13 = i12 | (g0Var.g(fVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        }
        if (g0Var.S(i13 & 1, (i13 & 147) != 146)) {
            if (i15 != 0) {
                mVar2 = b6.k.f2179a;
            }
            y3.f fVar4 = i16 != 0 ? null : fVar2;
            Context context = (Context) g0Var.k(b6.g.f2169b);
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            kotlin.jvm.internal.m.b(locale);
            String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            ze.d.e(upperCase, mVar2, new n6.e(dn.d.a, new y3.o(fVar4 != null ? bi.b.A(context, upperCase, fVar4.A, o.z(12), o.z(9)) : o.z(12)), null, null, 124), 1, g0Var, (i13 & 112) | 3072, 0);
            mVar3 = mVar2;
            fVar3 = fVar4;
        } else {
            g0Var.V();
            mVar3 = mVar2;
            fVar3 = fVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(str, mVar3, fVar3, i10, i11, 4);
        }
    }

    public static com.google.android.gms.internal.measurement.n r0(v3 v3Var) {
        if (v3Var == null) {
            return com.google.android.gms.internal.measurement.n.f3814f;
        }
        int iX = v3Var.x() - 1;
        if (iX == 1) {
            return v3Var.r() ? new com.google.android.gms.internal.measurement.q(v3Var.s()) : com.google.android.gms.internal.measurement.n.m;
        }
        if (iX == 2) {
            return v3Var.v() ? new com.google.android.gms.internal.measurement.g(Double.valueOf(v3Var.w())) : new com.google.android.gms.internal.measurement.g(null);
        }
        if (iX == 3) {
            return v3Var.t() ? new com.google.android.gms.internal.measurement.e(Boolean.valueOf(v3Var.u())) : new com.google.android.gms.internal.measurement.e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = v3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(r0((v3) it.next()));
        }
        return new com.google.android.gms.internal.measurement.o(v3Var.q(), arrayList);
    }

    public static final void s(String str, String str2, b6.m mVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1805226855);
        int i11 = (g0Var.g(str) ? 4 : 2) | i10 | (g0Var.g(str2) ? 32 : 16) | 384;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            mVar = b6.k.f2179a;
            w00.a.b(ze.d.u(mVar), 1, 1, v1.d.d(-2012058147, new c0.f(str, str2, 3), g0Var), g0Var, 3072, 0);
        } else {
            g0Var.V();
        }
        b6.m mVar2 = mVar;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b1.n(i10, 3, str, str2, mVar2);
        }
    }

    public static final void t(boolean z10, e6.d dVar, b6.m mVar, float f3, l1.j jVar, int i10, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-521940435);
        int i12 = (g0Var.h(z10) ? 4 : 2) | i10 | (g0Var.i(dVar) ? 32 : 16);
        int i13 = i12 | 384;
        int i14 = i11 & 8;
        if (i14 != 0) {
            i13 = i12 | 3456;
        } else if ((i10 & 3072) == 0) {
            i13 |= g0Var.d(f3) ? 2048 : 1024;
        }
        if (g0Var.S(i13 & 1, (i13 & 1171) != 1170)) {
            if (i14 != 0) {
                f3 = 12;
            }
            float f10 = 28;
            va.a.b(ze.d.m(ze.d.R(f10).d(new b6.c(dn.d.d)).d(new d6.c0(new o6.b(f10 / 2))), dVar), j6.c.f8173d, v1.d.d(752166539, new dn.j(f3, z10), g0Var), g0Var, 384, 0);
            mVar = b6.k.f2179a;
        } else {
            g0Var.V();
        }
        b6.m mVar2 = mVar;
        float f11 = f3;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bt.r0(z10, dVar, mVar2, f11, i10, i11);
        }
    }

    public static final void u(boolean z10, e6.d dVar, b6.m mVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(443095878);
        int i11 = (g0Var.h(z10) ? 4 : 2) | i10 | (g0Var.i(dVar) ? 32 : 16) | 384;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            float f3 = 12;
            float f10 = 6;
            ta.c0.d(ze.d.m(new b6.c(dn.d.d).d(new d6.c0(new o6.b(14))).d(new j6.o(w50.c.i0(f3), w50.c.i0(f10), w50.c.i0(f3), w50.c.i0(f10))), dVar), 1, v1.d.d(-1782253726, new ct.e0(z10, (Context) g0Var.k(b6.g.f2169b), 1), g0Var), g0Var, 3072, 2);
            mVar = b6.k.f2179a;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dn.i(z10, dVar, mVar, i10);
        }
    }

    public static final void v(Bitmap bitmap, String str, boolean z10, float f3, b6.m mVar, l1.j jVar, int i10) {
        b6.m mVar2;
        b6.d dVar;
        kotlin.jvm.internal.m.e(str, "name");
        g0 g0Var = (g0) jVar;
        g0Var.e0(551872026);
        int i11 = i10 | (g0Var.i(bitmap) ? 4 : 2) | (g0Var.g(str) ? 32 : 16) | (g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.d(f3) ? 2048 : 1024) | 24576;
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            Context context = (Context) g0Var.k(b6.g.f2169b);
            if (bitmap != null) {
                dVar = new b6.d(bitmap);
            } else if (z10) {
                kotlin.jvm.internal.m.e(context, "context");
                int iY = ab.a0.y(w00.a.F(context.getResources().getDisplayMetrics().density * f3), 1, 512);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iY, iY, Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f10 = iY;
                float f11 = f10 * 0.2f;
                Paint paint = new Paint(1);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                paint.setAlpha(w00.a.F(35.7f));
                canvas.drawRoundRect(0.0f, 0.0f, f10, f10, f11, f11, paint);
                int iF = w00.a.F(f10 * 0.38f);
                Drawable drawableF0 = p30.f.f0(context, 2131231360);
                if (drawableF0 != null) {
                    int i12 = (iY - iF) / 2;
                    int i13 = iF + i12;
                    drawableF0.setBounds(i12, i12, i13, i13);
                    drawableF0.setTint(-1);
                    drawableF0.setAlpha(w00.a.F(204.0f));
                    drawableF0.draw(canvas);
                }
                dVar = new b6.d(bitmapCreateBitmap);
            } else {
                String upperCase = r30.k.h1(1, str).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                dVar = new b6.d(f50.c.Q(context, f3, upperCase));
            }
            w50.c.d(dVar, str, ze.d.R(f3), 0, (b6.e) null, g0Var, i11 & 112, 24);
            mVar2 = b6.k.f2179a;
        } else {
            g0Var.V();
            mVar2 = mVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dn.h(bitmap, str, z10, f3, mVar2, i10);
        }
    }

    public static final ArrayList w(int i10, int i11, int i12) {
        int i13 = i10 - ((i11 - 1) * i12);
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    public static final void x(o9.q qVar, v2.s sVar, long j9) {
        e5.g gVar = (e5.g) qVar.B;
        gVar.getClass();
        w2.c cVar = (w2.c) gVar.f5097a;
        w2.c cVar2 = (w2.c) gVar.f5099c;
        boolean zB = v2.r.b(sVar);
        long j10 = sVar.f15400b;
        if (zB) {
            h00.n.z0((Object) null, cVar2.f15836d);
            cVar2.f15837e = 0;
            h00.n.z0((Object) null, cVar.f15836d);
            cVar.f15837e = 0;
            gVar.f5098b = 0L;
        }
        if (!v2.r.d(sVar)) {
            h00.x xVar = sVar.m;
            if (xVar == null) {
                xVar = h00.x.A;
            }
            int i10 = 0;
            for (int size = xVar.size(); i10 < size; size = size) {
                v2.b bVar = (v2.b) xVar.get(i10);
                gVar.a(bVar.f15352a, h2.b.f(bVar.f15356e, j9));
                i10++;
            }
            gVar.a(j10, h2.b.f(sVar.f15410n, j9));
        }
        if (v2.r.d(sVar) && j10 - gVar.f5098b > 40) {
            h00.n.z0((Object) null, cVar2.f15836d);
            cVar2.f15837e = 0;
            h00.n.z0((Object) null, cVar.f15836d);
            cVar.f15837e = 0;
            gVar.f5098b = 0L;
        }
        gVar.f5098b = j10;
    }

    public static final long y(w2 w2Var, b1.e0 e0Var, s2 s2Var, long j9) throws NoWhenBranchMatchedException {
        long j10;
        long jN = e0Var.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && w2Var.d().C.length() != 0) {
            long j11 = w2Var.d().D;
            y0 y0VarL = e0Var.l();
            int i10 = y0VarL == null ? -1 : b1.d.f1939a[y0VarL.ordinal()];
            if (i10 != -1) {
                if (i10 == 1 || i10 == 2) {
                    int i11 = m3.q0.f10519c;
                    j10 = j11 >> 32;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i12 = m3.q0.f10519c;
                    j10 = j11 & 4294967295L;
                }
                int i13 = (int) j10;
                m3.n0 n0VarC = s2Var.c();
                if (n0VarC != null) {
                    m3.q qVar = n0VarC.f10497b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = qVar.d(i13);
                    float f3 = n0VarC.f(iD);
                    float fG = n0VarC.g(iD);
                    float fX = ab.a0.x(fIntBitsToFloat, Math.min(f3, fG), Math.max(f3, fG));
                    if (y3.l.b(j9, 0L) || Math.abs(fIntBitsToFloat - fX) <= ((int) (j9 >> 32)) / 2) {
                        float f10 = qVar.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((qVar.b(iD) - f10) / 2) + f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(fX)) << 32);
                        z2.a0 a0VarE = s2Var.e();
                        h2.b bVar = null;
                        if (a0VarE != null) {
                            if (!a0VarE.A()) {
                                a0VarE = null;
                            }
                            if (a0VarE != null) {
                                jFloatToRawIntBits = a1.x0.j(jFloatToRawIntBits, y3.Y(a0VarE));
                            }
                        }
                        z2.a0 a0VarE2 = s2Var.e();
                        if (a0VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!a0VarE2.A()) {
                            a0VarE2 = null;
                        }
                        if (a0VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        z2.a0 a0Var = (z2.a0) s2Var.f119d.getValue();
                        if (a0Var != null) {
                            if (!a0Var.A()) {
                                a0Var = null;
                            }
                            if (a0Var != null) {
                                bVar = new h2.b(a0Var.V(a0VarE2, jFloatToRawIntBits));
                            }
                        }
                        return bVar != null ? bVar.f6544a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final Object z(Object obj, j10.c cVar) {
        e30.w wVarK;
        Class clsI0;
        return (((cVar instanceof j10.l0) && q20.f.d((u0) cVar)) || (wVarK = K(cVar)) == null || (clsI0 = i0(wVarK)) == null) ? obj : L(clsI0, cVar).invoke(obj, null);
    }

    public abstract float O(sg.v vVar);

    public abstract void c0(sg.v vVar, float f3);
}
