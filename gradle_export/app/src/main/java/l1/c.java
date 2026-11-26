package l1;

import k9.b3;

public final class c implements k00.h, k2 {
    public static final b3 B = new b3(12);
    public static final c C = new c(1);
    public static final c D = new c(2);
    public static final c E = new c(3);
    public static final c F = new c(4);
    public static final c G = new c(5);
    public final int A;

    public c(int i10) {
        this.A = i10;
    }

    @Override
    public boolean a(Object obj, Object obj2) {
        switch (this.A) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.m.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
