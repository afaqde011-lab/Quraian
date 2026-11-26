package bv;

public final class d2 implements d40.j {
    public final int A;
    public final e3 B;

    public d2(e3 e3Var, int i) {
        this.A = i;
        this.B = e3Var;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e3 e3Var = this.B;
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, zBooleanValue, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -8388609, 16777215));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                e3 e3Var2 = this.B;
                e3Var2.i(o1.a((o1) e3Var2.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, zBooleanValue2, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16776191));
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                e3 e3Var3 = this.B;
                e3Var3.i(o1.a((o1) e3Var3.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, iIntValue, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16776703));
                break;
        }
        return g00.b0.a;
    }
}
