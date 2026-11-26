package androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class k2 {
    public static final k2 EMPTY = new g2();
    private static final String FIELD_PERIODS;
    private static final String FIELD_SHUFFLED_WINDOW_INDICES;
    private static final String FIELD_WINDOWS;

    static {
        String str = e7.i0.f5136a;
        FIELD_WINDOWS = Integer.toString(0, 36);
        FIELD_PERIODS = Integer.toString(1, 36);
        FIELD_SHUFFLED_WINDOW_INDICES = Integer.toString(2, 36);
    }

    public static k2 fromBundle(Bundle bundle) {
        fh.d2 d2VarE;
        fh.d2 d2VarE2;
        a8.n nVar = new a8.n(8);
        IBinder binder = bundle.getBinder(FIELD_WINDOWS);
        if (binder == null) {
            fh.r0 r0Var = fh.t0.B;
            d2VarE = fh.d2.E;
        } else {
            d2VarE = e7.d.e(nVar, g.a(binder));
        }
        a8.n nVar2 = new a8.n(9);
        IBinder binder2 = bundle.getBinder(FIELD_PERIODS);
        if (binder2 == null) {
            fh.r0 r0Var2 = fh.t0.B;
            d2VarE2 = fh.d2.E;
        } else {
            d2VarE2 = e7.d.e(nVar2, g.a(binder2));
        }
        int[] intArray = bundle.getIntArray(FIELD_SHUFFLED_WINDOW_INDICES);
        if (intArray == null) {
            int i10 = d2VarE.D;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = i11;
            }
            intArray = iArr;
        }
        return new i2(d2VarE, d2VarE2, intArray);
    }

    public final k2 copyWithSingleWindow(int i10) {
        if (getWindowCount() == 1) {
            return this;
        }
        j2 window = getWindow(i10, new j2(), 0L);
        fh.q0 q0VarM = fh.t0.m();
        int i11 = window.f1294n;
        while (true) {
            int i12 = window.f1295o;
            if (i11 > i12) {
                window.f1295o = i12 - window.f1294n;
                window.f1294n = 0;
                return new i2(fh.t0.s(window), q0VarM.g(), new int[]{0});
            }
            h2 period = getPeriod(i11, new h2(), true);
            period.f1233c = 0;
            q0VarM.c(period);
            i11++;
        }
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this != obj) {
            if (obj instanceof k2) {
                k2 k2Var = (k2) obj;
                if (k2Var.getWindowCount() == getWindowCount() && k2Var.getPeriodCount() == getPeriodCount()) {
                    j2 j2Var = new j2();
                    h2 h2Var = new h2();
                    j2 j2Var2 = new j2();
                    h2 h2Var2 = new h2();
                    for (int i10 = 0; i10 < getWindowCount(); i10++) {
                        if (getWindow(i10, j2Var).equals(k2Var.getWindow(i10, j2Var2))) {
                        }
                    }
                    for (int i11 = 0; i11 < getPeriodCount(); i11++) {
                        if (getPeriod(i11, h2Var, true).equals(k2Var.getPeriod(i11, h2Var2, true))) {
                        }
                    }
                    int firstWindowIndex = getFirstWindowIndex(true);
                    if (firstWindowIndex == k2Var.getFirstWindowIndex(true) && (lastWindowIndex = getLastWindowIndex(true)) == k2Var.getLastWindowIndex(true)) {
                        while (firstWindowIndex != lastWindowIndex) {
                            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
                            if (nextWindowIndex == k2Var.getNextWindowIndex(firstWindowIndex, 0, true)) {
                                firstWindowIndex = nextWindowIndex;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z10) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i10, h2 h2Var, j2 j2Var, int i11, boolean z10) {
        int i12 = getPeriod(i10, h2Var).f1233c;
        if (getWindow(i12, j2Var).f1295o != i10) {
            return i10 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, j2Var).f1294n;
    }

    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getLastWindowIndex(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == getLastWindowIndex(z10) ? getFirstWindowIndex(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final h2 getPeriod(int i10, h2 h2Var) {
        return getPeriod(i10, h2Var, false);
    }

    public abstract h2 getPeriod(int i10, h2 h2Var, boolean z10);

    public h2 getPeriodByUid(Object obj, h2 h2Var) {
        return getPeriod(getIndexOfPeriod(obj), h2Var, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(j2 j2Var, h2 h2Var, int i10, long j9) {
        return getPeriodPositionUs(j2Var, h2Var, i10, j9);
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(j2 j2Var, h2 h2Var, int i10, long j9, long j10) {
        return getPeriodPositionUs(j2Var, h2Var, i10, j9, j10);
    }

    public final Pair<Object, Long> getPeriodPositionUs(j2 j2Var, h2 h2Var, int i10, long j9) {
        Pair<Object, Long> periodPositionUs = getPeriodPositionUs(j2Var, h2Var, i10, j9, 0L);
        periodPositionUs.getClass();
        return periodPositionUs;
    }

    public final Pair<Object, Long> getPeriodPositionUs(j2 j2Var, h2 h2Var, int i10, long j9, long j10) {
        ta.c0.u(i10, getWindowCount());
        getWindow(i10, j2Var, j10);
        if (j9 == -9223372036854775807L) {
            j9 = j2Var.l;
            if (j9 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = j2Var.f1294n;
        getPeriod(i11, h2Var);
        while (i11 < j2Var.f1295o && h2Var.f1235e != j9) {
            int i12 = i11 + 1;
            if (getPeriod(i12, h2Var).f1235e > j9) {
                break;
            }
            i11 = i12;
        }
        getPeriod(i11, h2Var, true);
        long jMin = j9 - h2Var.f1235e;
        long j11 = h2Var.f1234d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = h2Var.f1232b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getFirstWindowIndex(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == getFirstWindowIndex(z10) ? getLastWindowIndex(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i10);

    public final j2 getWindow(int i10, j2 j2Var) {
        return getWindow(i10, j2Var, 0L);
    }

    public abstract j2 getWindow(int i10, j2 j2Var, long j9);

    public abstract int getWindowCount();

    public int hashCode() {
        j2 j2Var = new j2();
        h2 h2Var = new h2();
        int windowCount = getWindowCount() + 217;
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            windowCount = (windowCount * 31) + getWindow(i10, j2Var).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            periodCount = (periodCount * 31) + getPeriod(i11, h2Var, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i10, h2 h2Var, j2 j2Var, int i11, boolean z10) {
        return getNextPeriodIndex(i10, h2Var, j2Var, i11, z10) == -1;
    }

    public final Bundle toBundle() {
        long j9;
        long j10;
        ArrayList arrayList;
        boolean z10;
        int i10;
        long j11;
        h2 h2Var;
        int i11;
        int i12;
        Bundle bundle;
        k2 k2Var = this;
        ArrayList arrayList2 = new ArrayList();
        int windowCount = k2Var.getWindowCount();
        j2 j2Var = new j2();
        boolean z11 = false;
        int i13 = 0;
        while (true) {
            j9 = -9223372036854775807L;
            j10 = 0;
            if (i13 >= windowCount) {
                break;
            }
            j2 window = k2Var.getWindow(i13, j2Var, 0L);
            window.getClass();
            Bundle bundle2 = new Bundle();
            if (!q0.f1408g.equals(window.f1285c)) {
                bundle2.putBundle(j2.f1276t, window.f1285c.c(false));
            }
            long j12 = window.f1287e;
            if (j12 != -9223372036854775807L) {
                bundle2.putLong(j2.f1277u, j12);
            }
            long j13 = window.f1288f;
            if (j13 != -9223372036854775807L) {
                bundle2.putLong(j2.f1278v, j13);
            }
            long j14 = window.f1289g;
            if (j14 != -9223372036854775807L) {
                bundle2.putLong(j2.f1279w, j14);
            }
            boolean z12 = window.f1290h;
            if (z12) {
                bundle2.putBoolean(j2.f1280x, z12);
            }
            boolean z13 = window.f1291i;
            if (z13) {
                bundle2.putBoolean(j2.f1281y, z13);
            }
            k0 k0Var = window.f1292j;
            if (k0Var != null) {
                bundle2.putBundle(j2.f1282z, k0Var.c());
            }
            boolean z14 = window.f1293k;
            if (z14) {
                bundle2.putBoolean(j2.A, z14);
            }
            long j15 = window.l;
            if (j15 != 0) {
                bundle2.putLong(j2.B, j15);
            }
            long j16 = window.m;
            if (j16 != -9223372036854775807L) {
                bundle2.putLong(j2.C, j16);
            }
            int i14 = window.f1294n;
            if (i14 != 0) {
                bundle2.putInt(j2.D, i14);
            }
            int i15 = window.f1295o;
            if (i15 != 0) {
                bundle2.putInt(j2.E, i15);
            }
            long j17 = window.f1296p;
            if (j17 != 0) {
                bundle2.putLong(j2.F, j17);
            }
            arrayList2.add(bundle2);
            i13++;
        }
        ArrayList arrayList3 = new ArrayList();
        int periodCount = k2Var.getPeriodCount();
        h2 h2Var2 = new h2();
        int i16 = 0;
        k2 k2Var2 = k2Var;
        while (i16 < periodCount) {
            h2 period = k2Var2.getPeriod(i16, h2Var2, z11);
            period.getClass();
            Bundle bundle3 = new Bundle();
            int i17 = period.f1233c;
            long j18 = j9;
            if (i17 != 0) {
                bundle3.putInt(h2.f1227h, i17);
            }
            long j19 = period.f1234d;
            if (j19 != j18) {
                bundle3.putLong(h2.f1228i, j19);
            }
            long j20 = period.f1235e;
            if (j20 != j10) {
                bundle3.putLong(h2.f1229j, j20);
            }
            boolean z15 = period.f1236f;
            if (z15) {
                bundle3.putBoolean(h2.f1230k, z15);
            }
            if (period.f1237g.equals(c.f1128f)) {
                arrayList = arrayList2;
                z10 = z11;
                i10 = periodCount;
                j11 = j10;
                h2Var = h2Var2;
                i11 = i16;
                i12 = windowCount;
            } else {
                String str = h2.l;
                c cVar = period.f1237g;
                cVar.getClass();
                Bundle bundle4 = new Bundle();
                ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                j11 = j10;
                a[] aVarArr = cVar.f1138e;
                int length = aVarArr.length;
                z10 = z11;
                ?? r4 = z11;
                while (r4 < length) {
                    a aVar = aVarArr[r4];
                    aVar.getClass();
                    ?? r21 = r4;
                    Bundle bundle5 = new Bundle();
                    int i18 = periodCount;
                    a[] aVarArr2 = aVarArr;
                    int i19 = length;
                    bundle5.putLong(a.m, aVar.f1050a);
                    bundle5.putInt(a.f1039n, aVar.f1051b);
                    bundle5.putInt(a.f1045t, aVar.f1052c);
                    bundle5.putParcelableArrayList(a.f1040o, new ArrayList<>(Arrays.asList(aVar.f1053d)));
                    String str2 = a.f1046u;
                    ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                    q0[] q0VarArr = aVar.f1054e;
                    h2 h2Var3 = h2Var2;
                    int length2 = q0VarArr.length;
                    int i20 = z10 ? 1 : 0;
                    while (true) {
                        Bundle bundleC = null;
                        if (i20 >= length2) {
                            break;
                        }
                        int i21 = i20;
                        q0 q0Var = q0VarArr[i21 == true ? 1 : 0];
                        if (q0Var != null) {
                            bundleC = q0Var.c(true);
                        }
                        arrayList5.add(bundleC);
                        i20 = (i21 == true ? 1 : 0) + 1;
                        length2 = length2;
                    }
                    bundle5.putParcelableArrayList(str2, arrayList5);
                    bundle5.putIntArray(a.f1041p, aVar.f1055f);
                    bundle5.putLongArray(a.f1042q, aVar.f1056g);
                    bundle5.putLong(a.f1043r, aVar.f1059j);
                    bundle5.putBoolean(a.f1044s, aVar.f1060k);
                    bundle5.putStringArrayList(a.f1047v, new ArrayList<>(Arrays.asList(aVar.f1057h)));
                    String str3 = a.f1049x;
                    ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                    b[] bVarArr = aVar.f1058i;
                    int length3 = bVarArr.length;
                    int i22 = z10 ? 1 : 0;
                    while (i22 < length3) {
                        int i23 = i22;
                        b bVar = bVarArr[i23 == true ? 1 : 0];
                        if (bVar == null) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putLong(b.f1091d, bVar.f1094a);
                            bundle.putLong(b.f1092e, bVar.f1095b);
                            bundle.putString(b.f1093f, bVar.f1096c);
                        }
                        arrayList6.add(bundle);
                        i22 = (i23 == true ? 1 : 0) + 1;
                        windowCount = windowCount;
                        length3 = length3;
                        i16 = i16;
                        arrayList2 = arrayList2;
                    }
                    bundle5.putParcelableArrayList(str3, arrayList6);
                    bundle5.putBoolean(a.f1048w, aVar.l);
                    arrayList4.add(bundle5);
                    periodCount = i18;
                    aVarArr = aVarArr2;
                    length = i19;
                    h2Var2 = h2Var3;
                    i16 = i16;
                    arrayList2 = arrayList2;
                    r4 = (r21 == true ? 1 : 0) + 1;
                }
                arrayList = arrayList2;
                i10 = periodCount;
                h2Var = h2Var2;
                i11 = i16;
                i12 = windowCount;
                if (!arrayList4.isEmpty()) {
                    bundle4.putParcelableArrayList(c.f1130h, arrayList4);
                }
                long j21 = cVar.f1135b;
                if (j21 != j11) {
                    bundle4.putLong(c.f1131i, j21);
                }
                long j22 = cVar.f1136c;
                if (j22 != j18) {
                    bundle4.putLong(c.f1132j, j22);
                }
                int i24 = cVar.f1137d;
                if (i24 != 0) {
                    bundle4.putInt(c.f1133k, i24);
                }
                bundle3.putBundle(str, bundle4);
            }
            arrayList3.add(bundle3);
            windowCount = i12;
            j9 = j18;
            j10 = j11;
            z11 = z10;
            periodCount = i10;
            h2Var2 = h2Var;
            arrayList2 = arrayList;
            i16 = i11 + 1;
            k2Var2 = this;
        }
        ArrayList arrayList7 = arrayList2;
        int i25 = windowCount;
        boolean z16 = z11;
        int[] iArr = new int[i25];
        if (i25 > 0) {
            iArr[z16 ? 1 : 0] = getFirstWindowIndex(true);
        }
        for (int i26 = 1; i26 < i25; i26++) {
            iArr[i26] = getNextWindowIndex(iArr[i26 - 1], z16 ? 1 : 0, true);
        }
        Bundle bundle6 = new Bundle();
        bundle6.putBinder(FIELD_WINDOWS, new g(arrayList7));
        bundle6.putBinder(FIELD_PERIODS, new g(arrayList3));
        bundle6.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, iArr);
        return bundle6;
    }
}
