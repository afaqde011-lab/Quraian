package e50;

public final class y {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(y other) {
        kotlin.jvm.internal.m.e(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.a) != 0) {
                c(i, other.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
