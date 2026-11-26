package d0;

public final class d implements c {
    @Override
    public final float a(float f3, float f10, float f11) {
        float fAbs = Math.abs((f10 + f3) - f3);
        float f12 = (0.3f * f11) - (0.0f * fAbs);
        float f13 = f11 - f12;
        if ((fAbs <= f11) && f13 < fAbs) {
            f12 = f11 - fAbs;
        }
        return f3 - f12;
    }
}
