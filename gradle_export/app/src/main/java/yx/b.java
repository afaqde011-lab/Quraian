package yx;

import u00.k;

public final class b implements k {
    public static final b B = new b(0);
    public static final b C = new b(1);
    public static final b D = new b(2);
    public static final b E = new b(3);
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return obj.toString();
    }
}
