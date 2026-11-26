package fh;

import java.io.Serializable;

public final class y1 extends b2 implements Serializable {
    public static final y1 B = new y1(0);
    public static final y1 C = new y1(1);
    public final int A;

    public y1(int i10) {
        this.A = i10;
    }

    @Override
    public final b2 a() {
        switch (this.A) {
            case 0:
                return C;
            default:
                return B;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
