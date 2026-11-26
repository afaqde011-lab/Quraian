package j00;

import java.util.Comparator;
import kotlin.jvm.internal.m;

public final class a implements Comparator {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Comparable a = (Comparable) obj;
                Comparable b = (Comparable) obj2;
                m.e(a, "a");
                m.e(b, "b");
                return a.compareTo(b);
            default:
                Comparable a2 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                m.e(a2, "a");
                m.e(b2, "b");
                return b2.compareTo(a2);
        }
    }

    @Override
    public final Comparator reversed() {
        switch (this.A) {
            case 0:
                return C;
            default:
                return B;
        }
    }
}
