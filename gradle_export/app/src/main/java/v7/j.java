package v7;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.p2;
import androidx.media3.common.q2;
import e7.i0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import s7.l1;

public final class j extends q2 {
    public static final j F0 = new j(new i());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;

    public final boolean f15506w0;

    public final boolean f15507x0;

    public final boolean f15508y0;

    public final boolean f15509z0;

    static {
        String str = i0.f5136a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public j(i iVar) {
        super(iVar);
        this.f15506w0 = iVar.J;
        this.f15507x0 = iVar.K;
        this.f15508y0 = iVar.L;
        this.f15509z0 = iVar.M;
        this.A0 = iVar.N;
        this.B0 = iVar.O;
        this.C0 = iVar.P;
        this.D0 = iVar.Q;
        this.E0 = iVar.R;
    }

    @Override
    public final p2 a() {
        return new i(this);
    }

    @Override
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(G0, this.f15506w0);
        bundleC.putBoolean(H0, false);
        bundleC.putBoolean(I0, this.f15507x0);
        bundleC.putBoolean(U0, false);
        bundleC.putBoolean(J0, this.f15508y0);
        bundleC.putBoolean(K0, false);
        bundleC.putBoolean(L0, false);
        bundleC.putBoolean(M0, false);
        bundleC.putBoolean(V0, false);
        bundleC.putBoolean(Y0, this.f15509z0);
        bundleC.putBoolean(W0, this.A0);
        bundleC.putBoolean(N0, this.B0);
        bundleC.putBoolean(O0, false);
        bundleC.putBoolean(P0, this.C0);
        bundleC.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i10 >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                    iArr[i11] = sparseBooleanArray.keyAt(i11);
                }
                bundleC.putIntArray(T0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((l1) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(Q0, bi.b.U(arrayList));
            bundleC.putParcelableArrayList(R0, e7.d.k(arrayList2, new uh.k(1)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                a1.b.x(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(S0, sparseArray3);
            i10++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.f15506w0 == jVar.f15506w0 && this.f15507x0 == jVar.f15507x0 && this.f15508y0 == jVar.f15508y0 && this.f15509z0 == jVar.f15509z0 && this.A0 == jVar.A0 && this.B0 == jVar.B0 && this.C0 == jVar.C0) {
                SparseBooleanArray sparseBooleanArray = jVar.E0;
                SparseBooleanArray sparseBooleanArray2 = this.E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = jVar.D0;
                    SparseArray sparseArray2 = this.D0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i11);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        l1 l1Var = (l1) entry.getKey();
                                        if (!map2.containsKey(l1Var) || !Objects.equals(entry.getValue(), map2.get(l1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f15506w0 ? 1 : 0)) * 961) + (this.f15507x0 ? 1 : 0)) * 961) + (this.f15508y0 ? 1 : 0)) * 28629151) + (this.f15509z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
