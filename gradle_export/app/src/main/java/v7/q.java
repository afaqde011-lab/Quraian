package v7;

import androidx.media3.common.l2;

public final class q {

    public final l2 f15520a;

    public final int[] f15521b;

    public q(int i10, l2 l2Var, int[] iArr) {
        if (iArr.length == 0) {
            e7.a.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f15520a = l2Var;
        this.f15521b = iArr;
    }
}
