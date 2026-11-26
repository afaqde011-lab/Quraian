package androidx.media3.common;

import android.view.View;

public final class w0 {

    public int f1663a;

    public int f1664b;

    public w0(int i10, int i11) {
        this.f1663a = i10;
        this.f1664b = i11;
    }

    public int a() {
        int i10 = this.f1664b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(ba.f1 f1Var) {
        View view = f1Var.f2275a;
        this.f1663a = view.getLeft();
        this.f1664b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
