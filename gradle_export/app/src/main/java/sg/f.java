package sg;

import a8.d0;
import a8.l0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.common.x0;
import b3.g1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g4;
import com.google.firebase.components.ComponentRegistrar;
import e7.i0;
import i2.g0;
import i2.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sd.y1;

public class f implements a8.s, bk.o, ge.a, k9.s, mi.a, n7.p, o.w, p7.i, qi.d {
    public static volatile f A;

    public f(Object obj) {
    }

    public static final boolean D(k50.z zVar) {
        k50.z zVar2 = l50.f.e;
        return !r30.r.p0(zVar.b(), ".class", true);
    }

    public static f E(Context context, int i10) {
        rd.a.g("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, zf.a.f17438n);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        g4.J(context, typedArrayObtainStyledAttributes, 4);
        g4.J(context, typedArrayObtainStyledAttributes, 9);
        g4.J(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        m.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        f fVar = new f();
        rd.a.h(rect.left);
        rd.a.h(rect.top);
        rd.a.h(rect.right);
        rd.a.h(rect.bottom);
        return fVar;
    }

    public static Typeface F(String str, q3.u uVar, int i10) {
        if (i10 == 0 && kotlin.jvm.internal.m.a(uVar, q3.u.J) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), uVar.A, i10 == 1);
    }

    public static k50.l G(String str) {
        int i10;
        char cCharAt;
        byte[] bArr = k50.a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 >= length) {
                int i16 = i13 % 4;
                if (i16 != 1) {
                    if (i16 == 2) {
                        bArrCopyOf[i15] = (byte) ((i14 << 12) >> 16);
                        i15++;
                    } else if (i16 == 3) {
                        int i17 = i14 << 6;
                        int i18 = i15 + 1;
                        bArrCopyOf[i15] = (byte) (i17 >> 16);
                        i15 += 2;
                        bArrCopyOf[i18] = (byte) (i17 >> 8);
                    }
                    if (i15 != i11) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                    }
                }
                if (bArrCopyOf != null) {
                    return new k50.l(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i12);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i10 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i10 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i10 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i10 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i10 = 63;
                }
                i12++;
            }
            i14 = (i14 << 6) | i10;
            i13++;
            if (i13 % 4 == 0) {
                bArrCopyOf[i15] = (byte) (i14 >> 16);
                int i19 = i15 + 2;
                bArrCopyOf[i15 + 1] = (byte) (i14 >> 8);
                i15 += 3;
                bArrCopyOf[i19] = (byte) i14;
            }
            i12++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new k50.l(bArrCopyOf);
        }
        return null;
    }

    public static k50.l H(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (l50.b.a(str.charAt(i11 + 1)) + (l50.b.a(str.charAt(i11)) << 4));
        }
        return new k50.l(bArr);
    }

    public static k50.l I(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(r30.a.a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        k50.l lVar = new k50.l(bytes);
        lVar.C = str;
        return lVar;
    }

    public static cm.a J(Configuration configuration) {
        kotlin.jvm.internal.m.e(configuration, "configuration");
        return configuration.smallestScreenWidthDp > 600 ? cm.a.B : cm.a.C;
    }

    public static g0 L(List list, float f3, float f10, int i10) {
        return new g0(list, null, (((long) Float.floatToRawIntBits((i10 & 2) != 0 ? 0.0f : f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i10 & 4) != 0 ? Float.POSITIVE_INFINITY : f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static k50.l M(byte[] bArr) {
        k50.l lVar = k50.l.D;
        int length = bArr.length;
        ab.a0.u(bArr.length, 0, length);
        return new k50.l(h00.n.w0(0, length, bArr));
    }

    public static n0 O(g00.k[] kVarArr) {
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (g00.k kVar : kVarArr) {
            arrayList.add(new i2.t(((i2.t) kVar.B).f7169a));
        }
        ArrayList arrayList2 = new ArrayList(kVarArr.length);
        for (g00.k kVar2 : kVarArr) {
            arrayList2.add(Float.valueOf(((Number) kVar2.A).floatValue()));
        }
        return new n0(arrayList, arrayList2, 9205357640488583168L, Float.POSITIVE_INFINITY);
    }

    public static g0 P(List list, float f3, float f10, int i10) {
        return new g0(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i10 & 2) != 0 ? 0.0f : f3)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i10 & 4) != 0 ? Float.POSITIVE_INFINITY : f10)) & 4294967295L));
    }

    public static g0 Q(g00.k[] kVarArr) {
        g00.k[] kVarArr2 = (g00.k[]) Arrays.copyOf(kVarArr, kVarArr.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
        ArrayList arrayList = new ArrayList(kVarArr2.length);
        for (g00.k kVar : kVarArr2) {
            arrayList.add(new i2.t(((i2.t) kVar.B).f7169a));
        }
        ArrayList arrayList2 = new ArrayList(kVarArr2.length);
        for (g00.k kVar2 : kVarArr2) {
            arrayList2.add(Float.valueOf(((Number) kVar2.A).floatValue()));
        }
        return new g0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2);
    }

    @Override
    public void A(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public void B(long j9, String str) {
    }

    @Override
    public boolean C(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public h1.l K(od.b bVar) {
        return new h1.l(bVar);
    }

    public List N(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ii.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f7676a;
            if (str != null) {
                bVar = new ii.b(str, bVar.f7677b, bVar.f7678c, bVar.f7679d, bVar.f7680e, new ak.a(str, bVar, 0), bVar.f7682g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(d0 d0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(o.l lVar, boolean z10) {
    }

    @Override
    public Map e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public n7.o g() {
        throw new IllegalStateException();
    }

    @Override
    public long h() {
        return System.currentTimeMillis();
    }

    @Override
    public h7.a j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public byte[] k() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void l(gi.c cVar) {
    }

    @Override
    public void m(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void n(byte[] bArr) {
    }

    @Override
    public void q() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] r(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void release() {
    }

    @Override
    public void s(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public n7.n t(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public g1 v(y1 y1Var) {
        int iH = x0.h(((androidx.media3.common.t) y1Var.f14134c).f1594n);
        e7.a.h("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + i0.z(iH));
        f4 f4Var = new f4(new p7.b(iH, 0), new p7.b(iH, 1));
        f4Var.B = true;
        return f4Var.v(y1Var);
    }

    @Override
    public l0 w(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean x(o.l lVar) {
        return false;
    }
}
