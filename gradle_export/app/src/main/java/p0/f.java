package p0;

public abstract class f {

    public static final e f12243a;

    static {
        d dVar = new d(50);
        f12243a = new e(dVar, dVar, dVar, dVar);
    }

    public static final e a(float f3) {
        c cVar = new c(f3);
        return new e(cVar, cVar, cVar, cVar);
    }

    public static final e b(float f3, float f10, float f11, float f12) {
        return new e(new c(f3), new c(f10), new c(f11), new c(f12));
    }

    public static e c(float f3, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return b(f3, f10, f11, f12);
    }
}
