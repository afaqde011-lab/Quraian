package ca;

import q0.g1;

public final class q implements u00.k {
    public final int A;
    public final u00.a B;

    public q(int i10, u00.a aVar) {
        this.A = i10;
        this.B = aVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e((ma.a) obj, "it");
                return this.B.invoke();
            case 1:
                this.B.invoke();
                return g00.b0.a;
            case 2:
                return (h2.b) this.B.invoke();
            case 3:
                j3.a0 a0Var = (j3.a0) obj;
                kotlin.jvm.internal.m.e(a0Var, "$this$semantics");
                j3.y.j(a0Var, new j3.j(((Number) this.B.invoke()).floatValue(), new z00.a(0.0f, 1.0f)));
                return g00.b0.a;
            case 4:
                ((Boolean) obj).getClass();
                this.B.invoke();
                return g00.b0.a;
            case 5:
                this.B.invoke();
                return g00.b0.a;
            case 6:
                this.B.invoke();
                return g00.b0.a;
            case 7:
                j3.a0 a0Var2 = (j3.a0) obj;
                Object objInvoke = this.B.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f3 = (Float) objInvoke;
                j3.y.j(a0Var2, new j3.j(f3 != null ? f3.floatValue() : 0.0f, new z00.a(0.0f, 1.0f)));
                return g00.b0.a;
            case 8:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) this.B.invoke()).floatValue());
            case 9:
                kotlin.jvm.internal.m.e((g1) obj, "$this$KeyboardActions");
                this.B.invoke();
                return g00.b0.a;
            case 10:
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.s0(ab.a0.x(1.0f - ((Number) this.B.invoke()).floatValue(), 0.0f, 1.0f));
                return g00.b0.a;
            case 11:
                this.B.invoke();
                return g00.b0.a;
            case 12:
                kotlin.jvm.internal.m.e(obj, "it");
                return this.B.invoke();
            case 13:
                this.B.invoke();
                return g00.b0.a;
            case 14:
                i2.c0 c0Var2 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var2, "$this$graphicsLayer");
                float fFloatValue = ((Number) this.B.invoke()).floatValue();
                c0Var2.I0(fFloatValue);
                c0Var2.N(fFloatValue);
                return g00.b0.a;
            case 15:
                i2.c0 c0Var3 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var3, "$this$graphicsLayer");
                float fFloatValue2 = ((Number) this.B.invoke()).floatValue();
                c0Var3.I0(fFloatValue2);
                c0Var3.N(fFloatValue2);
                return g00.b0.a;
            case 16:
                this.B.invoke();
                return g00.b0.a;
            default:
                this.B.invoke();
                return g00.b0.a;
        }
    }
}
