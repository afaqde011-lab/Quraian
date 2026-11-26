package c3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class f0 extends z4.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    public static final u.v f2655n0 = u.k.a(2131361808, 2131361809, 2131361820, 2131361831, 2131361834, 2131361835, 2131361836, 2131361837, 2131361838, 2131361839, 2131361810, 2131361811, 2131361812, 2131361813, 2131361814, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361821, 2131361822, 2131361823, 2131361824, 2131361825, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361832, 2131361833);
    public final z D;
    public int E = Integer.MIN_VALUE;
    public final e0 F;
    public final AccessibilityManager G;
    public long H;
    public List I;
    public final a0 J;
    public int K;
    public int L;
    public a5.g M;
    public a5.g N;
    public boolean O;
    public final u.w P;
    public final u.w Q;
    public final u.t0 R;
    public final u.t0 S;
    public int T;
    public Integer U;
    public final u.f V;
    public final c40.h W;
    public boolean X;
    public b0 Y;
    public u.w Z;

    public final u.x f2656a0;

    public final u.u f2657b0;

    public final u.u f2658c0;

    public final String f2659d0;

    public final String f2660e0;

    public final sd.p1 f2661f0;

    public final u.w f2662g0;

    public s2 f2663h0;

    public boolean f2664i0;

    public final u.u f2665j0;

    public final androidx.lifecycle.i0 f2666k0;

    public final ArrayList f2667l0;

    public final e0 f2668m0;

    public f0(z zVar) {
        this.D = zVar;
        int i10 = 0;
        this.F = new e0(this, i10);
        Object systemService = zVar.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.G = (AccessibilityManager) systemService;
        this.H = 100L;
        new Handler(Looper.getMainLooper());
        this.J = new a0(this, i10);
        this.K = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.P = new u.w();
        this.Q = new u.w();
        this.R = new u.t0(0);
        this.S = new u.t0(0);
        this.T = -1;
        this.V = new u.f(null);
        this.W = ri.t1.b(1, 6, null);
        this.X = true;
        u.w wVar = u.m.f14876a;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.Z = wVar;
        this.f2656a0 = new u.x();
        this.f2657b0 = new u.u();
        this.f2658c0 = new u.u();
        this.f2659d0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f2660e0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f2661f0 = new sd.p1(10);
        this.f2662g0 = new u.w();
        j3.s sVarA = zVar.getSemanticsOwner().a();
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2663h0 = new s2(sVarA, wVar);
        int i11 = u.i.f14855a;
        this.f2665j0 = new u.u();
        zVar.addOnAttachStateChangeListener(this);
        this.f2666k0 = new androidx.lifecycle.i0(this, 2);
        this.f2667l0 = new ArrayList();
        this.f2668m0 = new e0(this, 1);
    }

    public static void E(f0 f0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        f0Var.D(i10, i11, num, null);
    }

    public static Rect L(i2.l0 l0Var, float f3, float f10) {
        if (!(l0Var instanceof i2.j0) && !(l0Var instanceof i2.k0)) {
            return null;
        }
        h2.c cVarA = l0Var.a();
        return new Rect((int) (cVarA.f6546a + f3), (int) (cVarA.f6547b + f10), (int) (cVarA.f6548c + f3), (int) (cVarA.f6549d + f10));
    }

    public static float[] N(i2.l0 l0Var) {
        if (!(l0Var instanceof i2.k0)) {
            return null;
        }
        h2.d dVar = ((i2.k0) l0Var).f7142a;
        long j9 = dVar.f6557h;
        long j10 = dVar.f6556g;
        long j11 = dVar.f6555f;
        long j12 = dVar.f6554e;
        return new float[]{Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L))};
    }

    public static Region O(i2.l0 l0Var, float f3, float f10) {
        if (!(l0Var instanceof i2.i0)) {
            return null;
        }
        i2.i0 i0Var = (i2.i0) l0Var;
        h2.c cVarI = i0Var.a().i(f3, f10);
        Region region = new Region(new Rect((int) (cVarI.f6546a + 0.0f), (int) (cVarI.f6547b + 0.0f), (int) (cVarI.f6548c + 0.0f), (int) (cVarI.f6549d + 0.0f)));
        Region region2 = new Region();
        i2.g gVar = i0Var.f7139a;
        if (!(gVar instanceof i2.g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = gVar.f7128a;
        path.offset(f3, f10);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                kotlin.jvm.internal.m.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(j3.s sVar) {
        m3.h hVar;
        if (sVar != null) {
            j3.o oVar = sVar.f7968d;
            u.i0 i0Var = oVar.A;
            j3.z zVar = j3.w.f7978a;
            if (i0Var.c(zVar)) {
                return a4.a.a((List) oVar.e(zVar), ",", null, 62);
            }
            j3.z zVar2 = j3.w.G;
            if (i0Var.c(zVar2)) {
                Object objG = i0Var.g(zVar2);
                if (objG == null) {
                    objG = null;
                }
                m3.h hVar2 = (m3.h) objG;
                if (hVar2 != null) {
                    return hVar2.B;
                }
            } else {
                Object objG2 = i0Var.g(j3.w.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (hVar = (m3.h) h00.q.N0(list)) != null) {
                    return hVar.B;
                }
            }
        }
        return null;
    }

    public static final boolean x(j3.l lVar, float f3) {
        u00.a aVar = lVar.f7938a;
        if (f3 >= 0.0f || ((Number) aVar.invoke()).floatValue() <= 0.0f) {
            return f3 > 0.0f && ((Number) aVar.invoke()).floatValue() < ((Number) lVar.f7939b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(j3.l lVar) {
        u00.a aVar = lVar.f7938a;
        if (((Number) aVar.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        ((Number) lVar.f7939b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(j3.l lVar) {
        u00.a aVar = lVar.f7938a;
        if (((Number) aVar.invoke()).floatValue() < ((Number) lVar.f7939b.invoke()).floatValue()) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        return false;
    }

    public final int A(int i10) {
        if (i10 == this.D.getSemanticsOwner().a().f7970f) {
            return -1;
        }
        return i10;
    }

    public final void B(j3.s sVar, s2 s2Var) {
        int[] iArr = u.n.f14878a;
        u.x xVar = new u.x();
        List listJ = j3.s.j(4, sVar);
        b3.l0 l0Var = sVar.f7967c;
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            j3.s sVar2 = (j3.s) listJ.get(i10);
            u.l lVarS = s();
            int i11 = sVar2.f7970f;
            if (lVarS.a(i11)) {
                if (!s2Var.f2761b.c(i11)) {
                    w(l0Var);
                    return;
                }
                xVar.a(i11);
            }
        }
        u.x xVar2 = s2Var.f2761b;
        int[] iArr2 = xVar2.f14907b;
        long[] jArr = xVar2.f14906a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j9) < 128 && !xVar.c(iArr2[(i12 << 3) + i14])) {
                            w(l0Var);
                            return;
                        }
                        j9 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        List listJ2 = j3.s.j(4, sVar);
        int size2 = listJ2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            j3.s sVar3 = (j3.s) listJ2.get(i15);
            s2 s2Var2 = (s2) this.f2662g0.b(sVar3.f7970f);
            if (s2Var2 != null && s().a(sVar3.f7970f)) {
                B(sVar3, s2Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.O = true;
        }
        try {
            return ((Boolean) this.F.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.O = false;
        }
    }

    public final boolean D(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i10, i11);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(a4.a.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i10, String str, int i11) {
        AccessibilityEvent accessibilityEventO = o(A(i10), 32);
        accessibilityEventO.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i10) {
        b0 b0Var = this.Y;
        if (b0Var != null) {
            j3.s sVar = b0Var.f2626a;
            if (i10 != sVar.f7970f) {
                return;
            }
            if (SystemClock.uptimeMillis() - b0Var.f2631f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(sVar.f7970f), 131072);
                accessibilityEventO.setFromIndex(b0Var.f2629d);
                accessibilityEventO.setToIndex(b0Var.f2630e);
                accessibilityEventO.setAction(b0Var.f2627b);
                accessibilityEventO.setMovementGranularity(b0Var.f2628c);
                accessibilityEventO.getText().add(t(sVar));
                C(accessibilityEventO);
            }
        }
        this.Y = null;
    }

    public final void H(u.l lVar) throws KotlinNothingValueException {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i10;
        Integer num2;
        int i11;
        int i12;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        Integer num4;
        int i16;
        j3.o oVar;
        j3.s sVar;
        int i17;
        int i18;
        int i19;
        int i20;
        u.i0 i0Var;
        b3.l0 l0Var;
        int i21;
        j3.o oVar2;
        Integer num5;
        ArrayList arrayList3;
        long j9;
        int i22;
        b3.l0 l0Var2;
        int i23;
        Integer num6;
        int i24;
        r2 r2Var;
        boolean z10;
        j3.z zVar;
        int i25;
        j3.z zVar2;
        j3.z zVar3;
        boolean zA;
        String str;
        j3.z zVar4;
        int size;
        int i26;
        r2 r2Var2;
        Object objG;
        Object objG2;
        int i27;
        Object[] objArr;
        g00.e eVar;
        int i28;
        Object objG3;
        m3.h hVar;
        String str2;
        Object objG4;
        m3.h hVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        int i29;
        Integer num7;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean zC;
        boolean z11;
        boolean z12;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        j3.k kVar;
        boolean z13;
        Object objG7;
        AccessibilityEvent accessibilityEventO;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i34;
        f0 f0Var = this;
        u.l lVar2 = lVar;
        Integer num8 = 64;
        ArrayList arrayList4 = f0Var.f2667l0;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = lVar2.f14872b;
        long[] jArr3 = lVar2.f14871a;
        int i35 = 2;
        int length3 = jArr3.length - 2;
        int i36 = 0;
        Integer num9 = 0;
        if (length3 < 0) {
            return;
        }
        int i37 = 0;
        while (true) {
            long j10 = jArr3[i37];
            int i38 = i35;
            int i39 = length3;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i40 = 8;
                int i41 = 8 - ((~(i37 - i39)) >>> 31);
                long j11 = j10;
                int i42 = i36;
                while (i42 < i41) {
                    if ((j11 & 255) < 128) {
                        int i43 = iArr3[(i37 << 3) + i42];
                        s2 s2Var = (s2) f0Var.f2662g0.b(i43);
                        if (s2Var == null) {
                            i12 = i42;
                            num3 = num8;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i13 = i41;
                            i14 = i36;
                            i15 = i37;
                            num4 = num9;
                            i16 = i40;
                        } else {
                            j3.o oVar3 = s2Var.f2760a;
                            u.i0 i0Var2 = oVar3.A;
                            j3.t tVar = (j3.t) lVar2.b(i43);
                            int i44 = i40;
                            j3.s sVar2 = tVar != null ? tVar.f7971a : null;
                            if (sVar2 == null) {
                                throw a1.b.u("no value for specified key");
                            }
                            b3.l0 l0Var3 = sVar2.f7967c;
                            j3.o oVar4 = sVar2.f7968d;
                            iArr2 = iArr3;
                            int i45 = sVar2.f7970f;
                            jArr2 = jArr3;
                            u.i0 i0Var3 = oVar4.A;
                            i15 = i37;
                            Object[] objArr2 = i0Var3.f14857b;
                            Object[] objArr3 = i0Var3.f14858c;
                            long[] jArr4 = i0Var3.f14856a;
                            i12 = i42;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                b3.l0 l0Var4 = l0Var3;
                                i13 = i41;
                                int i46 = 0;
                                i19 = 0;
                                while (true) {
                                    long j12 = jArr4[i46];
                                    sVar = sVar2;
                                    int i47 = i46;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i48 = 8 - ((~(i47 - length4)) >>> 31);
                                        int i49 = 0;
                                        while (i49 < i48) {
                                            if ((j12 & 255) < 128) {
                                                int i50 = (i47 << 3) + i49;
                                                Object obj = objArr2[i50];
                                                int i51 = length4;
                                                Object obj2 = objArr3[i50];
                                                oVar2 = oVar3;
                                                j3.z zVar5 = (j3.z) obj;
                                                j9 = j12;
                                                j3.z zVar6 = j3.w.f7997v;
                                                if (kotlin.jvm.internal.m.a(zVar5, zVar6) || kotlin.jvm.internal.m.a(zVar5, j3.w.f7998w)) {
                                                    int size2 = arrayList5.size();
                                                    int i52 = 0;
                                                    while (true) {
                                                        if (i52 >= size2) {
                                                            r2Var = null;
                                                            break;
                                                        }
                                                        int i53 = size2;
                                                        if (((r2) arrayList5.get(i52)).A == i43) {
                                                            r2Var = (r2) arrayList5.get(i52);
                                                            break;
                                                        } else {
                                                            i52++;
                                                            size2 = i53;
                                                        }
                                                    }
                                                    if (r2Var != null) {
                                                        z10 = false;
                                                    } else {
                                                        r2Var = new r2(i43, arrayList4);
                                                        z10 = true;
                                                    }
                                                    arrayList4.add(r2Var);
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    zVar = j3.w.f7981d;
                                                    if (kotlin.jvm.internal.m.a(zVar5, zVar)) {
                                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        str3 = (String) obj2;
                                                        zC2 = i0Var2.c(zVar);
                                                        i34 = i44;
                                                        if (zC2) {
                                                            f0Var.F(i43, str3, i34);
                                                        }
                                                    } else {
                                                        i25 = i44;
                                                        if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7979b)) {
                                                            E(f0Var, f0Var.A(i43), 2048, num8, i25);
                                                            E(f0Var, f0Var.A(i43), 2048, num9, i25);
                                                        } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.L)) {
                                                            E(f0Var, f0Var.A(i43), 2048, 8192, 8);
                                                            E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                        } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.O)) {
                                                            E(f0Var, f0Var.A(i43), 2048, 3072, 8);
                                                        } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7980c)) {
                                                            E(f0Var, f0Var.A(i43), 2048, num8, 8);
                                                            E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                        } else {
                                                            zVar2 = j3.w.K;
                                                            arrayList3 = arrayList5;
                                                            if (kotlin.jvm.internal.m.a(zVar5, zVar2)) {
                                                                objG6 = i0Var3.g(j3.w.f8001z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                kVar = (j3.k) objG6;
                                                                if (kVar == null && kVar.f7937a == 4) {
                                                                    z13 = true;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                if (z13) {
                                                                    objG7 = i0Var3.g(zVar2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (kotlin.jvm.internal.m.a(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventO = f0Var.o(f0Var.A(i43), 4);
                                                                        j3.s sVar3 = sVar;
                                                                        l0Var2 = l0Var4;
                                                                        j3.s sVar4 = new j3.s(sVar3.f7965a, true, l0Var2, oVar4);
                                                                        objG8 = sVar4.k().A.g(j3.w.f7978a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        sVar = sVar3;
                                                                        strA = list2 != null ? a4.a.a(list2, ",", null, 62) : null;
                                                                        objG9 = sVar4.k().A.g(j3.w.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        i22 = i48;
                                                                        if (list != null) {
                                                                            strA2 = a4.a.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventO.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventO.getText().add(strA2);
                                                                        }
                                                                        f0Var.C(accessibilityEventO);
                                                                    } else {
                                                                        i22 = i48;
                                                                        l0Var2 = l0Var4;
                                                                        E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i22 = i48;
                                                                    l0Var2 = l0Var4;
                                                                    E(f0Var, f0Var.A(i43), 2048, num8, 8);
                                                                    E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                                }
                                                            } else {
                                                                i22 = i48;
                                                                l0Var2 = l0Var4;
                                                                if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7978a)) {
                                                                    int iA = f0Var.A(i43);
                                                                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                    f0Var.D(iA, 2048, 4, (List) obj2);
                                                                } else {
                                                                    zVar3 = j3.w.G;
                                                                    zA = kotlin.jvm.internal.m.a(zVar5, zVar3);
                                                                    str = RuntimeVersion.SUFFIX;
                                                                    if (zA) {
                                                                        if (i0Var3.c(j3.n.f7950k)) {
                                                                            objG4 = i0Var2.g(zVar3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            hVar2 = (m3.h) objG4;
                                                                            if (hVar2 == null) {
                                                                                hVar2 = RuntimeVersion.SUFFIX;
                                                                            }
                                                                            objG5 = i0Var3.g(zVar3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (m3.h) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = RuntimeVersion.SUFFIX;
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = hVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i29 = length2;
                                                                            } else {
                                                                                i29 = length;
                                                                            }
                                                                            num7 = num9;
                                                                            i30 = 0;
                                                                            while (true) {
                                                                                num5 = num8;
                                                                                if (i30 < i29) {
                                                                                    i31 = length;
                                                                                    break;
                                                                                }
                                                                                i31 = length;
                                                                                if (hVar2.charAt(i30) != charSequence.charAt(i30)) {
                                                                                    break;
                                                                                }
                                                                                i30++;
                                                                                length = i31;
                                                                                num8 = num5;
                                                                            }
                                                                            i32 = 0;
                                                                            while (true) {
                                                                                if (i32 < i29 - i30) {
                                                                                    i33 = i32;
                                                                                    break;
                                                                                }
                                                                                i33 = i32;
                                                                                if (hVar2.charAt((i31 - 1) - i32) != charSequence.charAt((length2 - 1) - i33)) {
                                                                                    break;
                                                                                } else {
                                                                                    i32 = i33 + 1;
                                                                                }
                                                                            }
                                                                            int i54 = (i31 - i33) - i30;
                                                                            int i55 = (length2 - i33) - i30;
                                                                            j3.z zVar7 = j3.w.N;
                                                                            boolean zC3 = i0Var2.c(zVar7);
                                                                            boolean zC4 = i0Var3.c(zVar7);
                                                                            zC = i0Var2.c(j3.w.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z11 = false;
                                                                            } else {
                                                                                z11 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z12 = false;
                                                                            } else {
                                                                                z12 = true;
                                                                            }
                                                                            if (!z11 || z12) {
                                                                                i24 = i43;
                                                                                num9 = num7;
                                                                                accessibilityEventP = f0Var.p(f0Var.A(i43), num9, num7, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventP = f0Var.o(f0Var.A(i43), 16);
                                                                                accessibilityEventP.setFromIndex(i30);
                                                                                accessibilityEventP.setRemovedCount(i54);
                                                                                accessibilityEventP.setAddedCount(i55);
                                                                                accessibilityEventP.setBeforeText(hVar2);
                                                                                accessibilityEventP.getText().add(charSequenceP);
                                                                                i24 = i43;
                                                                                num9 = num7;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            f0Var.C(accessibilityEventP);
                                                                            if (z11 || z12) {
                                                                                long j13 = ((m3.q0) oVar4.e(j3.w.H)).f10520a;
                                                                                accessibilityEventP.setFromIndex((int) (j13 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j13 & 4294967295L));
                                                                                f0Var.C(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i24 = i43;
                                                                            i0Var2 = i0Var2;
                                                                            num5 = num8;
                                                                            E(f0Var, f0Var.A(i24), 2048, Integer.valueOf(i38), 8);
                                                                        }
                                                                        num6 = num9;
                                                                        i23 = i51;
                                                                    } else {
                                                                        i24 = i43;
                                                                        i0Var2 = i0Var2;
                                                                        num5 = num8;
                                                                        i23 = i51;
                                                                        zVar4 = j3.w.H;
                                                                        if (kotlin.jvm.internal.m.a(zVar5, zVar4)) {
                                                                            objG3 = i0Var3.g(zVar3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            hVar = (m3.h) objG3;
                                                                            if (hVar != null && (str2 = hVar.B) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j14 = ((m3.q0) oVar4.e(zVar4)).f10520a;
                                                                            num6 = num9;
                                                                            f0Var = this;
                                                                            f0Var.C(f0Var.p(f0Var.A(i24), Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) (j14 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            f0Var.G(i45);
                                                                        } else {
                                                                            num6 = num9;
                                                                            if (!kotlin.jvm.internal.m.a(zVar5, zVar6) || kotlin.jvm.internal.m.a(zVar5, j3.w.f7998w)) {
                                                                                f0Var.w(l0Var2);
                                                                                size = arrayList4.size();
                                                                                i26 = 0;
                                                                                while (true) {
                                                                                    if (i26 >= size) {
                                                                                        r2Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((r2) arrayList4.get(i26)).A == i24) {
                                                                                            r2Var2 = (r2) arrayList4.get(i26);
                                                                                            break;
                                                                                        }
                                                                                        i26++;
                                                                                    }
                                                                                }
                                                                                kotlin.jvm.internal.m.b(r2Var2);
                                                                                objG = i0Var3.g(zVar6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                r2Var2.E = (j3.l) objG;
                                                                                objG2 = i0Var3.g(j3.w.f7998w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                r2Var2.F = (j3.l) objG2;
                                                                                if (r2Var2.B.contains(r2Var2)) {
                                                                                    f0Var.D.getSnapshotObserver().f2003a.d(r2Var2, f0Var.f2668m0, new b3.k0(r2Var2, f0Var, 5));
                                                                                }
                                                                            } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.l)) {
                                                                                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i28 = 8;
                                                                                    f0Var.C(f0Var.o(f0Var.A(i45), 8));
                                                                                } else {
                                                                                    i28 = 8;
                                                                                }
                                                                                E(f0Var, f0Var.A(i45), 2048, num6, i28);
                                                                            } else {
                                                                                j3.z zVar8 = j3.n.f7961x;
                                                                                if (kotlin.jvm.internal.m.a(zVar5, zVar8)) {
                                                                                    List list3 = (List) oVar4.e(zVar8);
                                                                                    Object objG10 = i0Var2.g(zVar8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        u.j0 j0Var = u.r0.f14890a;
                                                                                        u.j0 j0Var2 = new u.j0();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            throw new ClassCastException();
                                                                                        }
                                                                                        u.j0 j0Var3 = new u.j0();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            throw new ClassCastException();
                                                                                        }
                                                                                        i19 = !j0Var2.equals(j0Var3) ? 1 : 0;
                                                                                    } else {
                                                                                        i27 = 1;
                                                                                        if (!list3.isEmpty()) {
                                                                                            i19 = i27;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i27 = 1;
                                                                                    if (obj2 instanceof j3.a) {
                                                                                        j3.a aVar = (j3.a) obj2;
                                                                                        Object objG11 = i0Var2.g(zVar5);
                                                                                        if (objG11 == null) {
                                                                                            objG11 = null;
                                                                                        }
                                                                                        if (aVar != objG11) {
                                                                                            if (objG11 instanceof j3.a) {
                                                                                                String str4 = aVar.f7926a;
                                                                                                j3.a aVar2 = (j3.a) objG11;
                                                                                                g00.e eVar2 = aVar2.f7927b;
                                                                                                if (kotlin.jvm.internal.m.a(str4, aVar2.f7926a) && (((eVar = aVar.f7927b) != null || eVar2 == null) && (eVar == null || eVar2 != null))) {
                                                                                                    objArr = true;
                                                                                                }
                                                                                            }
                                                                                            objArr = false;
                                                                                        } else {
                                                                                            objArr = true;
                                                                                        }
                                                                                        if (objArr == true) {
                                                                                            i19 = 0;
                                                                                        } else {
                                                                                            i19 = i27;
                                                                                        }
                                                                                    } else {
                                                                                        i19 = i27;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num9;
                                                            i24 = i43;
                                                            i0Var2 = i0Var2;
                                                            num5 = num8;
                                                            i23 = i51;
                                                        }
                                                    }
                                                    i24 = i43;
                                                    num5 = num8;
                                                    arrayList3 = arrayList5;
                                                    i22 = i48;
                                                    l0Var2 = l0Var4;
                                                    i23 = i51;
                                                    num6 = num9;
                                                    i0Var2 = i0Var2;
                                                } else {
                                                    Object objG12 = i0Var2.g(zVar5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(obj2, objG12)) {
                                                        i24 = i43;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i22 = i48;
                                                        l0Var2 = l0Var4;
                                                        i23 = i51;
                                                        num6 = num9;
                                                        i0Var2 = i0Var2;
                                                    } else {
                                                        zVar = j3.w.f7981d;
                                                        if (kotlin.jvm.internal.m.a(zVar5, zVar)) {
                                                            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            str3 = (String) obj2;
                                                            zC2 = i0Var2.c(zVar);
                                                            i34 = i44;
                                                            if (zC2) {
                                                                f0Var.F(i43, str3, i34);
                                                            }
                                                        } else {
                                                            i25 = i44;
                                                            if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7979b)) {
                                                                E(f0Var, f0Var.A(i43), 2048, num8, i25);
                                                                E(f0Var, f0Var.A(i43), 2048, num9, i25);
                                                            } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.L)) {
                                                                E(f0Var, f0Var.A(i43), 2048, 8192, 8);
                                                                E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                            } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.O)) {
                                                                E(f0Var, f0Var.A(i43), 2048, 3072, 8);
                                                            } else if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7980c)) {
                                                                E(f0Var, f0Var.A(i43), 2048, num8, 8);
                                                                E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                            } else {
                                                                zVar2 = j3.w.K;
                                                                arrayList3 = arrayList5;
                                                                if (kotlin.jvm.internal.m.a(zVar5, zVar2)) {
                                                                    objG6 = i0Var3.g(j3.w.f8001z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    kVar = (j3.k) objG6;
                                                                    if (kVar == null) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = true;
                                                                    }
                                                                    if (z13) {
                                                                        objG7 = i0Var3.g(zVar2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (kotlin.jvm.internal.m.a(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventO = f0Var.o(f0Var.A(i43), 4);
                                                                            j3.s sVar5 = sVar;
                                                                            l0Var2 = l0Var4;
                                                                            j3.s sVar6 = new j3.s(sVar5.f7965a, true, l0Var2, oVar4);
                                                                            objG8 = sVar6.k().A.g(j3.w.f7978a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            sVar = sVar5;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = sVar6.k().A.g(j3.w.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            i22 = i48;
                                                                            if (list != null) {
                                                                                strA2 = a4.a.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventO.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventO.getText().add(strA2);
                                                                            }
                                                                            f0Var.C(accessibilityEventO);
                                                                        } else {
                                                                            i22 = i48;
                                                                            l0Var2 = l0Var4;
                                                                            E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                                        }
                                                                    } else {
                                                                        i22 = i48;
                                                                        l0Var2 = l0Var4;
                                                                        E(f0Var, f0Var.A(i43), 2048, num8, 8);
                                                                        E(f0Var, f0Var.A(i43), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i22 = i48;
                                                                    l0Var2 = l0Var4;
                                                                    if (kotlin.jvm.internal.m.a(zVar5, j3.w.f7978a)) {
                                                                        int iA2 = f0Var.A(i43);
                                                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                        f0Var.D(iA2, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        zVar3 = j3.w.G;
                                                                        zA = kotlin.jvm.internal.m.a(zVar5, zVar3);
                                                                        str = RuntimeVersion.SUFFIX;
                                                                        if (zA) {
                                                                            if (i0Var3.c(j3.n.f7950k)) {
                                                                                objG4 = i0Var2.g(zVar3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                hVar2 = (m3.h) objG4;
                                                                                if (hVar2 == null) {
                                                                                    hVar2 = RuntimeVersion.SUFFIX;
                                                                                }
                                                                                objG5 = i0Var3.g(zVar3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (m3.h) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = RuntimeVersion.SUFFIX;
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = hVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i29 = length2;
                                                                                } else {
                                                                                    i29 = length;
                                                                                }
                                                                                num7 = num9;
                                                                                i30 = 0;
                                                                                while (true) {
                                                                                    num5 = num8;
                                                                                    if (i30 < i29) {
                                                                                        i31 = length;
                                                                                        break;
                                                                                    }
                                                                                    i31 = length;
                                                                                    if (hVar2.charAt(i30) != charSequence.charAt(i30)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i30++;
                                                                                        length = i31;
                                                                                        num8 = num5;
                                                                                    }
                                                                                }
                                                                                i32 = 0;
                                                                                while (true) {
                                                                                    if (i32 < i29 - i30) {
                                                                                        i33 = i32;
                                                                                        break;
                                                                                    }
                                                                                    i33 = i32;
                                                                                    if (hVar2.charAt((i31 - 1) - i32) != charSequence.charAt((length2 - 1) - i33)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i32 = i33 + 1;
                                                                                }
                                                                                int i56 = (i31 - i33) - i30;
                                                                                int i57 = (length2 - i33) - i30;
                                                                                j3.z zVar9 = j3.w.N;
                                                                                boolean zC5 = i0Var2.c(zVar9);
                                                                                boolean zC6 = i0Var3.c(zVar9);
                                                                                zC = i0Var2.c(j3.w.G);
                                                                                if (zC) {
                                                                                    z11 = false;
                                                                                } else {
                                                                                    z11 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z12 = false;
                                                                                } else {
                                                                                    z12 = false;
                                                                                }
                                                                                if (z11) {
                                                                                    i24 = i43;
                                                                                    num9 = num7;
                                                                                    accessibilityEventP = f0Var.p(f0Var.A(i43), num9, num7, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i24 = i43;
                                                                                    num9 = num7;
                                                                                    accessibilityEventP = f0Var.p(f0Var.A(i43), num9, num7, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventP.setClassName("android.widget.EditText");
                                                                                f0Var.C(accessibilityEventP);
                                                                                if (z11) {
                                                                                    long j15 = ((m3.q0) oVar4.e(j3.w.H)).f10520a;
                                                                                    accessibilityEventP.setFromIndex((int) (j15 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j15 & 4294967295L));
                                                                                    f0Var.C(accessibilityEventP);
                                                                                } else {
                                                                                    long j16 = ((m3.q0) oVar4.e(j3.w.H)).f10520a;
                                                                                    accessibilityEventP.setFromIndex((int) (j16 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j16 & 4294967295L));
                                                                                    f0Var.C(accessibilityEventP);
                                                                                }
                                                                            } else {
                                                                                i24 = i43;
                                                                                i0Var2 = i0Var2;
                                                                                num5 = num8;
                                                                                E(f0Var, f0Var.A(i24), 2048, Integer.valueOf(i38), 8);
                                                                            }
                                                                            num6 = num9;
                                                                            i23 = i51;
                                                                        } else {
                                                                            i24 = i43;
                                                                            i0Var2 = i0Var2;
                                                                            num5 = num8;
                                                                            i23 = i51;
                                                                            zVar4 = j3.w.H;
                                                                            if (kotlin.jvm.internal.m.a(zVar5, zVar4)) {
                                                                                objG3 = i0Var3.g(zVar3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                hVar = (m3.h) objG3;
                                                                                if (hVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j17 = ((m3.q0) oVar4.e(zVar4)).f10520a;
                                                                                num6 = num9;
                                                                                f0Var = this;
                                                                                f0Var.C(f0Var.p(f0Var.A(i24), Integer.valueOf((int) (j17 >> 32)), Integer.valueOf((int) (j17 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                f0Var.G(i45);
                                                                            } else {
                                                                                num6 = num9;
                                                                                if (kotlin.jvm.internal.m.a(zVar5, zVar6)) {
                                                                                    f0Var.w(l0Var2);
                                                                                    size = arrayList4.size();
                                                                                    i26 = 0;
                                                                                    while (true) {
                                                                                        if (i26 >= size) {
                                                                                            r2Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((r2) arrayList4.get(i26)).A == i24) {
                                                                                                r2Var2 = (r2) arrayList4.get(i26);
                                                                                                break;
                                                                                            }
                                                                                            i26++;
                                                                                        }
                                                                                    }
                                                                                    kotlin.jvm.internal.m.b(r2Var2);
                                                                                    objG = i0Var3.g(zVar6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    r2Var2.E = (j3.l) objG;
                                                                                    objG2 = i0Var3.g(j3.w.f7998w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    r2Var2.F = (j3.l) objG2;
                                                                                    if (r2Var2.B.contains(r2Var2)) {
                                                                                        f0Var.D.getSnapshotObserver().f2003a.d(r2Var2, f0Var.f2668m0, new b3.k0(r2Var2, f0Var, 5));
                                                                                    }
                                                                                } else {
                                                                                    f0Var.w(l0Var2);
                                                                                    size = arrayList4.size();
                                                                                    i26 = 0;
                                                                                    while (true) {
                                                                                        if (i26 >= size) {
                                                                                            r2Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((r2) arrayList4.get(i26)).A == i24) {
                                                                                                r2Var2 = (r2) arrayList4.get(i26);
                                                                                                break;
                                                                                            }
                                                                                            i26++;
                                                                                        }
                                                                                    }
                                                                                    kotlin.jvm.internal.m.b(r2Var2);
                                                                                    objG = i0Var3.g(zVar6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    r2Var2.E = (j3.l) objG;
                                                                                    objG2 = i0Var3.g(j3.w.f7998w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    r2Var2.F = (j3.l) objG2;
                                                                                    if (r2Var2.B.contains(r2Var2)) {
                                                                                        f0Var.D.getSnapshotObserver().f2003a.d(r2Var2, f0Var.f2668m0, new b3.k0(r2Var2, f0Var, 5));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num9;
                                                                i24 = i43;
                                                                i0Var2 = i0Var2;
                                                                num5 = num8;
                                                                i23 = i51;
                                                            }
                                                        }
                                                        i24 = i43;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i22 = i48;
                                                        l0Var2 = l0Var4;
                                                        i23 = i51;
                                                        num6 = num9;
                                                        i0Var2 = i0Var2;
                                                    }
                                                }
                                                i44 = 8;
                                                i43 = i24;
                                                l0Var4 = l0Var2;
                                                oVar3 = oVar2;
                                                j12 = j9 >> 8;
                                                i49++;
                                                length4 = i23;
                                                num9 = num6;
                                                i0Var2 = i0Var2;
                                                i48 = i22;
                                                arrayList5 = arrayList3;
                                                num8 = num5;
                                            } else {
                                                oVar2 = oVar3;
                                                num5 = num8;
                                                arrayList3 = arrayList5;
                                                j9 = j12;
                                                i22 = i48;
                                                i49 = i49;
                                                l0Var2 = l0Var4;
                                                i23 = length4;
                                                num6 = num9;
                                                i24 = i43;
                                                i0Var2 = i0Var2;
                                            }
                                            i44 = 8;
                                            i43 = i24;
                                            l0Var4 = l0Var2;
                                            oVar3 = oVar2;
                                            j12 = j9 >> 8;
                                            i49++;
                                            length4 = i23;
                                            num9 = num6;
                                            i0Var2 = i0Var2;
                                            i48 = i22;
                                            arrayList5 = arrayList3;
                                            num8 = num5;
                                        }
                                        i18 = i43;
                                        oVar = oVar3;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        int i58 = i48;
                                        l0Var = l0Var4;
                                        i14 = 0;
                                        i17 = 1;
                                        i21 = length4;
                                        num4 = num9;
                                        i0Var = i0Var2;
                                        if (i58 != i44) {
                                            break;
                                        }
                                    } else {
                                        i18 = i43;
                                        oVar = oVar3;
                                        i0Var = i0Var2;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        l0Var = l0Var4;
                                        i14 = 0;
                                        i17 = 1;
                                        i21 = length4;
                                        num4 = num9;
                                    }
                                    if (i47 == i21) {
                                        break;
                                    }
                                    num9 = num4;
                                    i43 = i18;
                                    i0Var2 = i0Var;
                                    l0Var4 = l0Var;
                                    sVar2 = sVar;
                                    oVar3 = oVar;
                                    arrayList5 = arrayList2;
                                    i44 = 8;
                                    i46 = i47 + 1;
                                    length4 = i21;
                                    num8 = num3;
                                }
                            } else {
                                oVar = oVar3;
                                num3 = num8;
                                arrayList2 = arrayList5;
                                i13 = i41;
                                sVar = sVar2;
                                i17 = 1;
                                num4 = num9;
                                i18 = i43;
                                i14 = 0;
                                i19 = 0;
                            }
                            if (i19 == 0) {
                                Iterator it = oVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i20 = i14;
                                        break;
                                    }
                                    if (!sVar.k().A.c((j3.z) ((Map.Entry) it.next()).getKey())) {
                                        i20 = i17;
                                        break;
                                    }
                                }
                                i19 = i20;
                            }
                            if (i19 != 0) {
                                int iA3 = f0Var.A(i18);
                                i16 = 8;
                                E(f0Var, iA3, 2048, num4, 8);
                            } else {
                                i16 = 8;
                            }
                        }
                    } else {
                        i12 = i42;
                        num3 = num8;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i13 = i41;
                        i14 = i36;
                        i15 = i37;
                        num4 = num9;
                        i16 = i40;
                    }
                    j11 >>= i16;
                    i42 = i12 + 1;
                    lVar2 = lVar;
                    i36 = i14;
                    num9 = num4;
                    i40 = i16;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i37 = i15;
                    i41 = i13;
                    arrayList5 = arrayList2;
                    num8 = num3;
                }
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i10 = i36;
                int i59 = i37;
                num2 = num9;
                if (i41 != i40) {
                    return;
                } else {
                    i11 = i59;
                }
            } else {
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i10 = i36;
                num2 = num9;
                i11 = i37;
            }
            if (i11 == i39) {
                return;
            }
            i37 = i11 + 1;
            lVar2 = lVar;
            length3 = i39;
            i36 = i10;
            num9 = num2;
            i35 = i38;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num8 = num;
        }
    }

    public final void I(b3.l0 l0Var, u.x xVar) {
        j3.o oVarZ;
        if (l0Var.J() && !this.D.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(l0Var)) {
            b3.l0 l0Var2 = null;
            if (!l0Var.f2059g0.j(8)) {
                l0Var = l0Var.x();
                while (true) {
                    if (l0Var == null) {
                        l0Var = null;
                        break;
                    } else if (l0Var.f2059g0.j(8)) {
                        break;
                    } else {
                        l0Var = l0Var.x();
                    }
                }
            }
            if (l0Var == null || (oVarZ = l0Var.z()) == null) {
                return;
            }
            if (!oVarZ.C) {
                for (b3.l0 l0VarX = l0Var.x(); l0VarX != null; l0VarX = l0VarX.x()) {
                    j3.o oVarZ2 = l0VarX.z();
                    if (oVarZ2 != null && oVarZ2.C) {
                        l0Var2 = l0VarX;
                        break;
                    }
                }
                if (l0Var2 != null) {
                    l0Var = l0Var2;
                }
            }
            int i10 = l0Var.B;
            if (xVar.a(i10)) {
                E(this, A(i10), 2048, 1, 8);
            }
        }
    }

    public final void J(b3.l0 l0Var) {
        if (l0Var.J() && !this.D.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(l0Var)) {
            int i10 = l0Var.B;
            j3.l lVar = (j3.l) this.P.b(i10);
            j3.l lVar2 = (j3.l) this.Q.b(i10);
            if (lVar == null && lVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i10, 4096);
            if (lVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) lVar.f7938a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) lVar.f7939b.invoke()).floatValue());
            }
            if (lVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) lVar2.f7938a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) lVar2.f7939b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(j3.s sVar, int i10, int i11, boolean z10) {
        String strT;
        j3.o oVar = sVar.f7968d;
        int i12 = sVar.f7970f;
        j3.z zVar = j3.n.f7949j;
        if (oVar.A.c(zVar) && m0.b(sVar)) {
            u00.o oVar2 = ((j3.a) sVar.f7968d.e(zVar)).f7927b;
            if (oVar2 != null) {
                return ((Boolean) oVar2.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.T) && (strT = t(sVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strT.length()) {
                i10 = -1;
            }
            this.T = i10;
            boolean z11 = strT.length() > 0;
            C(p(A(i12), z11 ? Integer.valueOf(this.T) : null, z11 ? Integer.valueOf(this.T) : null, z11 ? Integer.valueOf(strT.length()) : null, strT));
            G(i12);
            return true;
        }
        return false;
    }

    public final Rect M(float f3, float f10, float f11, float f12) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f10)) & 4294967295L;
        z zVar = this.D;
        long jS = zVar.s(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jS2 = zVar.s((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        int i10 = (int) (jS >> 32);
        int i11 = (int) (jS2 >> 32);
        int i12 = (int) (jS & 4294967295L);
        int i13 = (int) (jS2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.floor(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    public final void Q() {
        long j9;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i10;
        int iNumberOfTrailingZeros;
        char c11;
        s2 s2Var;
        u.x xVar = new u.x();
        u.x xVar2 = this.f2656a0;
        int[] iArr = xVar2.f14907b;
        long[] jArr3 = xVar2.f14906a;
        int length = jArr3.length - 2;
        u.w wVar = this.f2662g0;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            j9 = 128;
            j10 = 255;
            while (true) {
                long j13 = jArr3[i12];
                char c12 = 7;
                j11 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            int i15 = iArr[(i12 << 3) + i14];
                            c11 = c12;
                            j3.t tVar = (j3.t) s().b(i15);
                            Object obj = null;
                            j3.s sVar = tVar != null ? tVar.f7971a : null;
                            if (sVar != null) {
                                if (!sVar.f7968d.A.c(j3.w.f7981d)) {
                                    xVar.a(i15);
                                    s2Var = (s2) wVar.b(i15);
                                    if (s2Var != null) {
                                        Object objG = s2Var.f2760a.A.g(j3.w.f7981d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i15, obj, 32);
                                }
                            } else {
                                xVar.a(i15);
                                s2Var = (s2) wVar.b(i15);
                                if (s2Var != null) {
                                    Object objG2 = s2Var.f2760a.A.g(j3.w.f7981d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i15, obj, 32);
                            }
                        } else {
                            c11 = c12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            j9 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
        }
        int[] iArr2 = xVar.f14907b;
        long[] jArr4 = xVar.f14906a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j14 = jArr4[i16];
                if ((((~j14) << c10) & j14 & j11) != j11) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & j10) < j9) {
                            int i19 = iArr2[(i16 << 3) + i18];
                            int iHashCode = Integer.hashCode(i19) * (-862048943);
                            int i20 = iHashCode ^ (iHashCode << 16);
                            int i21 = i20 & 127;
                            int i22 = xVar2.f14908c;
                            int i23 = (i20 >>> 7) & i22;
                            i10 = i11;
                            int i24 = 0;
                            while (true) {
                                long[] jArr5 = xVar2.f14906a;
                                int i25 = i23 >> 3;
                                jArr2 = jArr4;
                                int i26 = (i23 & 7) << 3;
                                j12 = j14;
                                long j15 = (jArr5[i25] >>> i26) | ((jArr5[i25 + 1] << (64 - i26)) & ((-i26) >> 63));
                                int i27 = i22;
                                long j16 = (((long) i21) * 72340172838076673L) ^ j15;
                                long j17 = (j16 - 72340172838076673L) & (~j16) & j11;
                                while (j17 != 0) {
                                    iNumberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j17) >> 3)) & i27;
                                    int i28 = i27;
                                    if (xVar2.f14907b[iNumberOfTrailingZeros] == i19) {
                                        break;
                                    }
                                    j17 &= j17 - 1;
                                    i27 = i28;
                                }
                                int i29 = i27;
                                if ((j15 & ((~j15) << 6) & j11) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i24 += 8;
                                i23 = (i23 + i24) & i29;
                                jArr4 = jArr2;
                                i22 = i29;
                                j14 = j12;
                            }
                            int i30 = iNumberOfTrailingZeros;
                            if (i30 >= 0) {
                                xVar2.h(i30);
                            }
                        } else {
                            jArr2 = jArr4;
                            j12 = j14;
                            i10 = i11;
                        }
                        j14 = j12 >> i10;
                        i18++;
                        i11 = i10;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i17 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr4 = jArr;
                i11 = 8;
            }
        }
        wVar.c();
        u.l lVarS = s();
        int[] iArr3 = lVarS.f14872b;
        Object[] objArr = lVarS.f14873c;
        long[] jArr6 = lVarS.f14871a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i31 = 0;
            while (true) {
                long j18 = jArr6[i31];
                if ((((~j18) << c10) & j18 & j11) != j11) {
                    int i32 = 8 - ((~(i31 - length3)) >>> 31);
                    for (int i33 = 0; i33 < i32; i33++) {
                        if ((j18 & j10) < j9) {
                            int i34 = (i31 << 3) + i33;
                            int i35 = iArr3[i34];
                            j3.s sVar2 = ((j3.t) objArr[i34]).f7971a;
                            j3.o oVar = sVar2.f7968d;
                            j3.z zVar = j3.w.f7981d;
                            if (oVar.A.c(zVar) && xVar2.a(i35)) {
                                F(i35, (String) sVar2.f7968d.e(zVar), 16);
                            }
                            wVar.i(i35, new s2(sVar2, s()));
                        }
                        j18 >>= 8;
                    }
                    if (i32 != 8) {
                        break;
                    }
                }
                if (i31 == length3) {
                    break;
                } else {
                    i31++;
                }
            }
        }
        this.f2663h0 = new s2(this.D.getSemanticsOwner().a(), s());
    }

    @Override
    public final qj.c b(View view) {
        return this.J;
    }

    public final void j(int i10, a5.g gVar, String str, Bundle bundle) throws NoWhenBranchMatchedException {
        j3.s sVar;
        z zVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        j3.t tVar = (j3.t) s().b(i10);
        if (tVar == null || (sVar = tVar.f7971a) == null) {
            return;
        }
        b3.l0 l0Var = sVar.f7967c;
        j3.o oVar = sVar.f7968d;
        u.i0 i0Var = oVar.A;
        String strT = t(sVar);
        if (kotlin.jvm.internal.m.a(str, this.f2659d0)) {
            int iD = this.f2657b0.d(i10, -1);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, this.f2660e0)) {
            int iD2 = this.f2658c0.d(i10, -1);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = i0Var.c(j3.n.f7940a);
        z zVar2 = this.D;
        b3.p1 p1Var = null;
        if (zC && bundle != null && kotlin.jvm.internal.m.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i12 > 0 && i11 >= 0) {
                if (i11 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    m3.n0 n0VarQ = m0.q(oVar);
                    if (n0VarQ == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i11 + i13;
                        if (i14 >= n0VarQ.f10496a.f10483a.B.length()) {
                            arrayList.add(p1Var);
                            i11 = i11;
                            i12 = i12;
                            zVar = zVar2;
                        } else {
                            h2.c cVarB = n0VarQ.b(i14);
                            b3.p1 p1VarD = sVar.d();
                            long jD0 = 0;
                            if (p1VarD != null) {
                                if (!p1VarD.z1().N) {
                                    p1VarD = p1Var;
                                }
                                if (p1VarD != null) {
                                    jD0 = p1VarD.d0(0L);
                                }
                            }
                            h2.c cVarJ = cVarB.j(jD0);
                            h2.c cVarG = sVar.g();
                            h2.c cVarF = cVarJ.h(cVarG) ? cVarJ.f(cVarG) : p1Var;
                            if (cVarF != 0) {
                                long jS = zVar2.s((((long) Float.floatToRawIntBits(cVarF.f6547b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarF.f6546a)) << 32));
                                zVar = zVar2;
                                long jS2 = zVar.s((((long) Float.floatToRawIntBits(cVarF.f6549d)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarF.f6548c)) << 32));
                                int i15 = (int) (jS >> 32);
                                int i16 = (int) (jS2 >> 32);
                                int i17 = (int) (jS & 4294967295L);
                                int i18 = (int) (jS2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)));
                            } else {
                                zVar = zVar2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i13++;
                        i12 = i12;
                        zVar2 = zVar;
                        i11 = i11;
                        p1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        j3.z zVar3 = j3.w.A;
        if (i0Var.c(zVar3) && bundle != null && kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = i0Var.g(zVar3);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, sVar.f7970f);
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = i0Var.g(j3.w.S);
            i2.t0 t0Var = (i2.t0) (objG2 == null ? null : objG2);
            if (t0Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                h2.c cVarU = u(sVar, rect, t0Var);
                float f3 = cVarU.f6547b;
                float f10 = cVarU.f6546a;
                i2.l0 l0VarA = t0Var.a(cVarU.d(), l0Var.f2053a0, zVar2.getDensity());
                if (l0VarA instanceof i2.j0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(l0VarA, f10, f3));
                    return;
                } else if (l0VarA instanceof i2.k0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(l0VarA, f10, f3));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(l0VarA));
                    return;
                } else {
                    if (!(l0VarA instanceof i2.i0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(l0VarA, f10, f3));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = i0Var.g(j3.w.S);
            i2.t0 t0Var2 = (i2.t0) (objG3 == null ? null : objG3);
            if (t0Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                h2.c cVarU2 = u(sVar, rect2, t0Var2);
                Rect rectL = L(t0Var2.a(cVarU2.d(), l0Var.f2053a0, zVar2.getDensity()), cVarU2.f6546a, cVarU2.f6547b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = i0Var.g(j3.w.S);
            i2.t0 t0Var3 = (i2.t0) (objG4 == null ? null : objG4);
            if (t0Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(t0Var3.a(u(sVar, rect3, t0Var3).d(), l0Var.f2053a0, zVar2.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = i0Var.g(j3.w.S);
            i2.t0 t0Var4 = (i2.t0) (objG5 == null ? null : objG5);
            if (t0Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                h2.c cVarU3 = u(sVar, rect4, t0Var4);
                Region regionO = O(t0Var4.a(cVarU3.d(), l0Var.f2053a0, zVar2.getDensity()), cVarU3.f6546a, cVarU3.f6547b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(j3.t tVar) {
        y3.k kVar = tVar.f7972b;
        return M(kVar.f16592a, kVar.f16593b, kVar.f16594c, kVar.f16595d);
    }

    public final java.lang.Object l(m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: c3.f0.l(m00.c):java.lang.Object");
    }

    public final boolean m(int i10, long j9, boolean z10) throws NoWhenBranchMatchedException {
        j3.z zVar;
        int i11;
        if (!kotlin.jvm.internal.m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        u.l lVarS = s();
        if (h2.b.b(j9, 9205357640488583168L) || (((9223372034707292159L & j9) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            zVar = j3.w.f7998w;
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            zVar = j3.w.f7997v;
        }
        Object[] objArr = lVarS.f14873c;
        long[] jArr = lVarS.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j10) < 128) {
                        j3.t tVar = (j3.t) objArr[(i12 << 3) + i15];
                        y3.k kVar = tVar.f7972b;
                        float f3 = kVar.f16592a;
                        i11 = i13;
                        float f10 = kVar.f16593b;
                        float f11 = kVar.f16594c;
                        float f12 = kVar.f16595d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                        if ((fIntBitsToFloat2 < f12) & (fIntBitsToFloat >= f3) & (fIntBitsToFloat < f11) & (fIntBitsToFloat2 >= f10)) {
                            Object objG = tVar.f7971a.f7968d.A.g(zVar);
                            if (objG == null) {
                                objG = null;
                            }
                            j3.l lVar = (j3.l) objG;
                            if (lVar != null) {
                                u00.a aVar = lVar.f7938a;
                                if (i10 < 0) {
                                    if (((Number) aVar.invoke()).floatValue() > 0.0f) {
                                        z11 = true;
                                    }
                                } else if (((Number) aVar.invoke()).floatValue() < ((Number) lVar.f7939b.invoke()).floatValue()) {
                                    z11 = true;
                                }
                            }
                        }
                    } else {
                        i11 = i13;
                    }
                    j10 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return z11;
                }
            }
            if (i12 == length) {
                return z11;
            }
            i12++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.D.getSemanticsOwner().a(), this.f2663h0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final AccessibilityEvent o(int i10, int i11) {
        j3.t tVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        z zVar = this.D;
        accessibilityEventObtain.setPackageName(zVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(zVar, i10);
        if (v() && (tVar = (j3.t) s().b(i10)) != null) {
            j3.s sVar = tVar.f7971a;
            accessibilityEventObtain.setPassword(sVar.f7968d.A.c(j3.w.N));
            Object objG = sVar.f7968d.A.g(j3.w.f7990o);
            if (objG == null) {
                objG = null;
            }
            boolean zA = kotlin.jvm.internal.m.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a5.b.k(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override
    public final void onAccessibilityStateChanged(boolean z10) {
        this.I = null;
    }

    @Override
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.I = null;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.G;
        if (accessibilityManager.isEnabled()) {
            this.I = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.D.getHandler();
        kotlin.jvm.internal.m.b(handler);
        handler.removeCallbacks(this.f2666k0);
        AccessibilityManager accessibilityManager = this.G;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i10, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(j3.s sVar) {
        j3.o oVar = sVar.f7968d;
        j3.o oVar2 = sVar.f7968d;
        j3.z zVar = j3.w.f7978a;
        if (!oVar.A.c(j3.w.f7978a)) {
            j3.z zVar2 = j3.w.H;
            if (oVar2.A.c(zVar2)) {
                return (int) (((m3.q0) oVar2.e(zVar2)).f10520a & 4294967295L);
            }
        }
        return this.T;
    }

    public final int r(j3.s sVar) {
        j3.o oVar = sVar.f7968d;
        j3.o oVar2 = sVar.f7968d;
        j3.z zVar = j3.w.f7978a;
        if (!oVar.A.c(j3.w.f7978a)) {
            j3.z zVar2 = j3.w.H;
            if (oVar2.A.c(zVar2)) {
                return (int) (((m3.q0) oVar2.e(zVar2)).f10520a >> 32);
            }
        }
        return this.T;
    }

    public final u.l s() {
        if (this.X) {
            this.X = false;
            z zVar = this.D;
            this.Z = j3.v.b(zVar.getSemanticsOwner(), t.C);
            if (v()) {
                u.w wVar = this.Z;
                Resources resources = zVar.getContext().getResources();
                u.u uVar = this.f2657b0;
                uVar.a();
                u.u uVar2 = this.f2658c0;
                uVar2.a();
                j3.t tVar = (j3.t) wVar.b(-1);
                j3.s sVar = tVar != null ? tVar.f7971a : null;
                kotlin.jvm.internal.m.b(sVar);
                ArrayList arrayListB = j3.b0.b(sVar, new b3.a(wVar, 6), new b3.a(resources, 7), va.a.R(sVar));
                int iM = va.a.M(arrayListB);
                int i10 = 1;
                if (1 <= iM) {
                    while (true) {
                        int i11 = ((j3.s) arrayListB.get(i10 - 1)).f7970f;
                        int i12 = ((j3.s) arrayListB.get(i10)).f7970f;
                        uVar.f(i11, i12);
                        uVar2.f(i12, i11);
                        if (i10 == iM) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.Z;
    }

    public final h2.c u(j3.s sVar, Rect rect, i2.t0 t0Var) {
        d0 d0Var = new d0(t0Var);
        b3.l0 l0Var = sVar.f7967c;
        b2.q qVar = (b2.q) l0Var.f2059g0.G;
        b3.k kVar = null;
        if ((qVar.D & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.C & 8) == 0) {
                    if ((qVar.D & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.F;
                } else {
                    b2.q qVarE = qVar;
                    m1.e eVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof b3.j2) {
                            ((b3.j2) qVarE).m1(d0Var);
                            if (d0Var.A) {
                                kVar = qVarE;
                                break loop0;
                            }
                        } else if ((qVarE.C & 8) != 0 && (qVarE instanceof b3.l)) {
                            int i10 = 0;
                            for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                if ((qVar2.C & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarE = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (qVarE != null) {
                                            eVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVarE = b3.m.e(eVar);
                    }
                    if ((qVar.D & 8) != 0) {
                        break;
                    }
                    qVar = qVar.F;
                }
            }
        }
        b3.k kVar2 = (b3.j2) kVar;
        if (kVar2 == null || !((b2.q) kVar2).A.N) {
            return z2.d0.g((b3.p1) l0Var.f2059g0.E, false);
        }
        b3.p1 p1VarX = b3.m.x(kVar2);
        h2.c cVarF = z2.d0.i(p1VarX).F(p1VarX, false);
        Rect rectM = M(cVarF.f6546a, cVarF.f6547b, cVarF.f6548c, cVarF.f6549d);
        float f3 = rectM.left - rect.left;
        float f10 = rectM.top - rect.top;
        return new h2.c(f3, f10, rectM.width() + f3, rectM.height() + f10);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.G;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.I;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.I = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(b3.l0 l0Var) {
        if (this.V.add(l0Var)) {
            this.W.j(g00.b0.a);
        }
    }
}
