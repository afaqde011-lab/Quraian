package es;

import ab.a0;
import g00.b0;

public final class b implements u00.a {
    public final int A;
    public final u00.a B;

    public b(int i, u00.a aVar) {
        this.A = i;
        this.B = aVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Float.valueOf(a0.x(1.0f - ((Number) this.B.invoke()).floatValue(), 0.0f, 1.0f));
            case 1:
                this.B.invoke();
                return b0.a;
            case 2:
                this.B.invoke();
                return Boolean.TRUE;
            case 3:
                this.B.invoke();
                return Boolean.TRUE;
            case 4:
                float fFloatValue = ((Number) this.B.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            case 5:
                this.B.invoke();
                return b0.a;
            case 6:
                u00.a aVar = this.B;
                if (aVar != null) {
                    aVar.invoke();
                }
                return b0.a;
            case 7:
                return Integer.valueOf(((Number) this.B.invoke()).intValue());
            case 8:
                return Float.valueOf(((Number) this.B.invoke()).floatValue());
            default:
                Boolean bool = (Boolean) this.B.invoke();
                bool.booleanValue();
                return bool;
        }
    }
}
