package l0;

public abstract class a1 {

    public static final float f9713a = 2500;

    public static final float f9714b = 1500;

    public static final float f9715c = 50;

    public static final java.lang.Object a(j0.r r27, int r28, int r29, y3.c r30, m00.c r31) {
        throw new UnsupportedOperationException("Method not decompiled: l0.a1.a(j0.r, int, int, y3.c, m00.c):java.lang.Object");
    }

    public static final boolean b(boolean z10, j0.r rVar, int i10) {
        if (z10) {
            if (rVar.c() > i10) {
                return true;
            }
            return rVar.c() == i10 && rVar.d() > 0;
        }
        if (rVar.c() < i10) {
            return true;
        }
        return rVar.c() == i10 && rVar.d() < 0;
    }

    public static final boolean c(j0.r rVar, int i10) {
        return i10 <= rVar.e() && rVar.c() <= i10;
    }
}
