package xt;

import u00.k;

public final class b implements k {
    public static final b B = new b(0);
    public static final b C = new b(1);
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                break;
        }
        return obj.toString();
    }
}
