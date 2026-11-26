package d0;

public interface c {

    public static final b f4407a = b.f4403a;

    default float a(float f3, float f10, float f11) {
        f4407a.getClass();
        float f12 = f10 + f3;
        if ((f3 >= 0.0f && f12 <= f11) || (f3 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f3) < Math.abs(f13) ? f3 : f13;
    }
}
