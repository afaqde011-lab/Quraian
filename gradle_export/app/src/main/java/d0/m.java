package d0;

public final class m implements y1 {

    public final n f4446a;

    public m(n nVar) {
        this.f4446a = nVar;
    }

    @Override
    public final float a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        n nVar = this.f4446a;
        float fFloatValue = ((Number) nVar.f4462a.invoke(Float.valueOf(f3))).floatValue();
        nVar.f4466e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        nVar.f4467f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
