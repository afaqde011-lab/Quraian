package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class l2 {

    public static final String f1336f;

    public static final String f1337g;

    public final int f1338a;

    public final String f1339b;

    public final int f1340c;

    public final t[] f1341d;

    public int f1342e;

    static {
        String str = e7.i0.f5136a;
        f1336f = Integer.toString(0, 36);
        f1337g = Integer.toString(1, 36);
    }

    public l2(String str, t... tVarArr) {
        ta.c0.s(tVarArr.length > 0);
        this.f1339b = str;
        this.f1341d = tVarArr;
        this.f1338a = tVarArr.length;
        String str2 = tVarArr[0].f1594n;
        this.f1340c = TextUtils.isEmpty(str2) ? x0.h(tVarArr[0].m) : x0.h(str2);
        String str3 = tVarArr[0].f1586d;
        str3 = (str3 == null || str3.equals("und")) ? RuntimeVersion.SUFFIX : str3;
        int i10 = tVarArr[0].f1588f | 16384;
        for (int i11 = 1; i11 < tVarArr.length; i11++) {
            String str4 = tVarArr[i11].f1586d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? RuntimeVersion.SUFFIX : str4)) {
                b(i11, "languages", tVarArr[0].f1586d, tVarArr[i11].f1586d);
                return;
            } else {
                if (i10 != (tVarArr[i11].f1588f | 16384)) {
                    b(i11, "role flags", Integer.toBinaryString(tVarArr[0].f1588f), Integer.toBinaryString(tVarArr[i11].f1588f));
                    return;
                }
            }
        }
    }

    public static l2 a(Bundle bundle) {
        fh.d2 d2VarE;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1336f);
        if (parcelableArrayList == null) {
            fh.r0 r0Var = fh.t0.B;
            d2VarE = fh.d2.E;
        } else {
            d2VarE = e7.d.e(new a8.n(10), parcelableArrayList);
        }
        return new l2(bundle.getString(f1337g, RuntimeVersion.SUFFIX), (t[]) d2VarE.toArray(new t[0]));
    }

    public static void b(int i10, String str, String str2, String str3) {
        StringBuilder sbS = a1.b.s("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbS.append(str3);
        sbS.append("' (track ");
        sbS.append(i10);
        sbS.append(")");
        e7.a.e("TrackGroup", RuntimeVersion.SUFFIX, new IllegalStateException(sbS.toString()));
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        t[] tVarArr = this.f1341d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(tVarArr.length);
        for (t tVar : tVarArr) {
            List list = tVar.f1597q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(t.R, tVar.f1583a);
            bundle2.putString(t.S, tVar.f1584b);
            String str = t.f1579w0;
            fh.t0<b0> t0Var = tVar.f1585c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(t0Var.size());
            for (b0 b0Var : t0Var) {
                b0Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = b0Var.f1099a;
                if (str2 != null) {
                    bundle3.putString(b0.f1097c, str2);
                }
                bundle3.putString(b0.f1098d, b0Var.f1100b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(t.T, tVar.f1586d);
            bundle2.putInt(t.U, tVar.f1587e);
            bundle2.putInt(t.V, tVar.f1588f);
            int i10 = tVar.f1589g;
            if (i10 != t.Q.f1589g) {
                bundle2.putInt(t.f1580x0, i10);
            }
            bundle2.putInt(t.W, tVar.f1590h);
            bundle2.putInt(t.X, tVar.f1591i);
            bundle2.putString(t.Y, tVar.f1593k);
            bundle2.putString(t.Z, tVar.m);
            bundle2.putString(t.f1557a0, tVar.f1594n);
            bundle2.putInt(t.f1558b0, tVar.f1595o);
            for (int i11 = 0; i11 < list.size(); i11++) {
                bundle2.putByteArray(t.f1559c0 + "_" + Integer.toString(i11, 36), (byte[]) list.get(i11));
            }
            bundle2.putParcelable(t.f1560d0, tVar.f1598r);
            bundle2.putLong(t.f1561e0, tVar.f1599s);
            bundle2.putInt(t.f1562f0, tVar.f1601u);
            bundle2.putInt(t.f1563g0, tVar.f1602v);
            bundle2.putInt(t.f1582z0, tVar.f1603w);
            bundle2.putInt(t.A0, tVar.f1604x);
            bundle2.putFloat(t.f1564h0, tVar.f1605y);
            bundle2.putInt(t.f1565i0, tVar.f1606z);
            bundle2.putFloat(t.f1566j0, tVar.A);
            bundle2.putByteArray(t.f1567k0, tVar.B);
            bundle2.putInt(t.f1568l0, tVar.C);
            i iVar = tVar.D;
            if (iVar != null) {
                String str3 = t.f1569m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(i.f1239i, iVar.f1243a);
                bundle4.putInt(i.f1240j, iVar.f1244b);
                bundle4.putInt(i.f1241k, iVar.f1245c);
                bundle4.putByteArray(i.l, iVar.f1246d);
                bundle4.putInt(i.m, iVar.f1247e);
                bundle4.putInt(i.f1242n, iVar.f1248f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(t.f1581y0, tVar.E);
            bundle2.putInt(t.f1570n0, tVar.F);
            bundle2.putInt(t.f1571o0, tVar.G);
            bundle2.putInt(t.f1572p0, tVar.H);
            bundle2.putInt(t.f1573q0, tVar.I);
            bundle2.putInt(t.f1574r0, tVar.J);
            bundle2.putInt(t.f1575s0, tVar.K);
            bundle2.putInt(t.f1577u0, tVar.M);
            bundle2.putInt(t.f1578v0, tVar.N);
            bundle2.putInt(t.f1576t0, tVar.O);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f1336f, arrayList);
        bundle.putString(f1337g, this.f1339b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2.class == obj.getClass()) {
            l2 l2Var = (l2) obj;
            if (this.f1339b.equals(l2Var.f1339b) && Arrays.equals(this.f1341d, l2Var.f1341d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1342e == 0) {
            this.f1342e = Arrays.hashCode(this.f1341d) + x5.e(527, this.f1339b, 31);
        }
        return this.f1342e;
    }

    public final String toString() {
        return this.f1339b + ": " + Arrays.toString(this.f1341d);
    }
}
