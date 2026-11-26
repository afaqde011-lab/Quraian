package androidx.media3.common;

import android.util.SparseBooleanArray;
import android.view.View;

public final class a1 {

    public static final int[] f1065b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

    public Object f1066a;

    public a1(View view) {
        this.f1066a = view;
    }

    public a1(b1 b1Var) {
        q qVar = new q();
        this.f1066a = qVar;
        qVar.e(b1Var.f1103a);
    }

    public void a(int i10, boolean z10) {
        q qVar = (q) this.f1066a;
        if (z10) {
            qVar.d(i10);
        } else {
            qVar.getClass();
        }
    }

    public b1 b() {
        return new b1(((q) this.f1066a).g());
    }

    public void c(int i10) {
        q qVar = (q) this.f1066a;
        ta.c0.A(!qVar.B);
        ((SparseBooleanArray) qVar.C).delete(i10);
    }
}
