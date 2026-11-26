package i7;

import android.util.Pair;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class h1 extends k2 {

    public static final int f7333j = 0;

    public final int f7334a;

    public final s7.d1 f7335b;

    public final int f7336c;

    public final int f7337d;

    public final int[] f7338e;

    public final int[] f7339f;

    public final k2[] f7340g;

    public final Object[] f7341h;

    public final HashMap f7342i;

    public h1(ArrayList arrayList, s7.d1 d1Var) {
        k2[] k2VarArr = new k2[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            k2VarArr[i11] = ((r0) it.next()).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((r0) it2.next()).a();
            i10++;
        }
        this(k2VarArr, objArr, d1Var);
    }

    public h1(k2[] k2VarArr, Object[] objArr, s7.d1 d1Var) {
        this.f7335b = d1Var;
        this.f7334a = d1Var.f13658b.length;
        int length = k2VarArr.length;
        this.f7340g = k2VarArr;
        this.f7338e = new int[length];
        this.f7339f = new int[length];
        this.f7341h = objArr;
        this.f7342i = new HashMap();
        int length2 = k2VarArr.length;
        int i10 = 0;
        int windowCount = 0;
        int periodCount = 0;
        int i11 = 0;
        while (i10 < length2) {
            k2 k2Var = k2VarArr[i10];
            this.f7340g[i11] = k2Var;
            this.f7339f[i11] = windowCount;
            this.f7338e[i11] = periodCount;
            windowCount += k2Var.getWindowCount();
            periodCount += this.f7340g[i11].getPeriodCount();
            this.f7342i.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f7336c = windowCount;
        this.f7337d = periodCount;
    }

    public final int a(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f7334a - 1) {
                return i10 + 1;
            }
            return -1;
        }
        s7.d1 d1Var = this.f7335b;
        int i11 = d1Var.f13659c[i10] + 1;
        int[] iArr = d1Var.f13658b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int b(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        s7.d1 d1Var = this.f7335b;
        int i11 = d1Var.f13659c[i10] - 1;
        if (i11 >= 0) {
            return d1Var.f13658b[i11];
        }
        return -1;
    }

    @Override
    public final int getFirstWindowIndex(boolean z10) {
        if (this.f7334a != 0) {
            int iA = 0;
            if (z10) {
                int[] iArr = this.f7335b.f13658b;
                iA = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                k2[] k2VarArr = this.f7340g;
                if (!k2VarArr[iA].isEmpty()) {
                    return k2VarArr[iA].getFirstWindowIndex(z10) + this.f7339f[iA];
                }
                iA = a(iA, z10);
            } while (iA != -1);
        }
        return -1;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f7342i.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (indexOfPeriod = this.f7340g[iIntValue].getIndexOfPeriod(obj3)) != -1) {
                return this.f7338e[iIntValue] + indexOfPeriod;
            }
        }
        return -1;
    }

    @Override
    public final int getLastWindowIndex(boolean z10) {
        int iB;
        int i10 = this.f7334a;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f7335b.f13658b;
                iB = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iB = i10 - 1;
            }
            do {
                k2[] k2VarArr = this.f7340g;
                if (!k2VarArr[iB].isEmpty()) {
                    return k2VarArr[iB].getLastWindowIndex(z10) + this.f7339f[iB];
                }
                iB = b(iB, z10);
            } while (iB != -1);
        }
        return -1;
    }

    @Override
    public final int getNextWindowIndex(int i10, int i11, boolean z10) {
        int[] iArr = this.f7339f;
        int iD = e7.i0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        k2[] k2VarArr = this.f7340g;
        int nextWindowIndex = k2VarArr[iD].getNextWindowIndex(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (nextWindowIndex != -1) {
            return i12 + nextWindowIndex;
        }
        int iA = a(iD, z10);
        while (iA != -1 && k2VarArr[iA].isEmpty()) {
            iA = a(iA, z10);
        }
        if (iA != -1) {
            return k2VarArr[iA].getFirstWindowIndex(z10) + iArr[iA];
        }
        if (i11 == 2) {
            return getFirstWindowIndex(z10);
        }
        return -1;
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        int[] iArr = this.f7338e;
        int iD = e7.i0.d(iArr, i10 + 1, false, false);
        int i11 = this.f7339f[iD];
        this.f7340g[iD].getPeriod(i10 - iArr[iD], h2Var, z10);
        h2Var.f1233c += i11;
        if (z10) {
            Object obj = this.f7341h[iD];
            Object obj2 = h2Var.f1232b;
            obj2.getClass();
            h2Var.f1232b = Pair.create(obj, obj2);
        }
        return h2Var;
    }

    @Override
    public final h2 getPeriodByUid(Object obj, h2 h2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f7342i.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f7339f[iIntValue];
        this.f7340g[iIntValue].getPeriodByUid(obj3, h2Var);
        h2Var.f1233c += i10;
        h2Var.f1232b = obj;
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return this.f7337d;
    }

    @Override
    public final int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        int[] iArr = this.f7339f;
        int iD = e7.i0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        k2[] k2VarArr = this.f7340g;
        int previousWindowIndex = k2VarArr[iD].getPreviousWindowIndex(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (previousWindowIndex != -1) {
            return i12 + previousWindowIndex;
        }
        int iB = b(iD, z10);
        while (iB != -1 && k2VarArr[iB].isEmpty()) {
            iB = b(iB, z10);
        }
        if (iB != -1) {
            return k2VarArr[iB].getLastWindowIndex(z10) + iArr[iB];
        }
        if (i11 == 2) {
            return getLastWindowIndex(z10);
        }
        return -1;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        int[] iArr = this.f7338e;
        int iD = e7.i0.d(iArr, i10 + 1, false, false);
        return Pair.create(this.f7341h[iD], this.f7340g[iD].getUidOfPeriod(i10 - iArr[iD]));
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        int[] iArr = this.f7339f;
        int iD = e7.i0.d(iArr, i10 + 1, false, false);
        int i11 = iArr[iD];
        int i12 = this.f7338e[iD];
        this.f7340g[iD].getWindow(i10 - i11, j2Var, j9);
        Object objCreate = this.f7341h[iD];
        if (!j2.f1273q.equals(j2Var.f1283a)) {
            objCreate = Pair.create(objCreate, j2Var.f1283a);
        }
        j2Var.f1283a = objCreate;
        j2Var.f1294n += i12;
        j2Var.f1295o += i12;
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return this.f7336c;
    }
}
