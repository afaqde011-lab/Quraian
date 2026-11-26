package x;

public interface z extends i {
    @Override
    default s1 a(r1 r1Var) {
        return new p10.a(this);
    }

    long b(float f3, float f10, float f11);

    float c(float f3, float f10, float f11, long j9);

    default float d(float f3, float f10, float f11) {
        return c(f3, f10, f11, b(f3, f10, f11));
    }

    float e(float f3, float f10, float f11, long j9);
}
