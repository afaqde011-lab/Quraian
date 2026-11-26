package d6;

import android.content.Context;

public final class q1 implements u00.a {
    public final int A;
    public final Context B;
    public final String C;

    public q1(int i10, Context context, String str) {
        this.A = i10;
        this.B = context;
        this.C = str;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return a10.h0.r(this.B, this.C);
            default:
                return k00.f.O(this.B, this.C);
        }
    }
}
