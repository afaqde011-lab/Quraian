package k9;

import android.util.SparseBooleanArray;
import java.util.HashSet;

public final class y1 {

    public static final a4 f9551e;

    public static final androidx.media3.common.b1 f9552f;

    public final a4 f9553a;

    public final androidx.media3.common.b1 f9554b;

    public final fh.t0 f9555c;

    public final fh.t0 f9556d;

    static {
        HashSet hashSet = new HashSet();
        fh.d2 d2Var = z3.f9573d;
        for (int i10 = 0; i10 < d2Var.D; i10++) {
            hashSet.add(new z3(((Integer) d2Var.get(i10)).intValue()));
        }
        new a4(hashSet);
        HashSet hashSet2 = new HashSet();
        fh.d2 d2Var2 = z3.f9574e;
        for (int i11 = 0; i11 < d2Var2.D; i11++) {
            hashSet2.add(new z3(((Integer) d2Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < d2Var.D; i12++) {
            hashSet2.add(new z3(((Integer) d2Var.get(i12)).intValue()));
        }
        f9551e = new a4(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : androidx.media3.common.a1.f1065b) {
            ta.c0.A(!false);
            sparseBooleanArray.append(i13, true);
        }
        ta.c0.A(!false);
        f9552f = new androidx.media3.common.b1(new androidx.media3.common.r(sparseBooleanArray));
    }

    public y1(a4 a4Var, androidx.media3.common.b1 b1Var, fh.t0 t0Var, fh.t0 t0Var2) {
        this.f9553a = a4Var;
        this.f9554b = b1Var;
        this.f9555c = t0Var;
        this.f9556d = t0Var2;
    }
}
