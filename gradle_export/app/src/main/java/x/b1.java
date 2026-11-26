package x;

public final class b1 implements y {

    public final float f16245a;

    public final float f16246b;

    public final Object f16247c;

    public b1(float f3, float f10, Object obj) {
        this.f16245a = f3;
        this.f16246b = f10;
        this.f16247c = obj;
    }

    public b1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override
    public final s1 a(r1 r1Var) {
        Object obj = this.f16247c;
        return new wb.o(this.f16245a, this.f16246b, obj == null ? null : (o) r1Var.f16363a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (b1Var.f16245a == this.f16245a && b1Var.f16246b == this.f16246b && kotlin.jvm.internal.m.a(b1Var.f16247c, this.f16247c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f16247c;
        return Float.hashCode(this.f16246b) + w.c.c(this.f16245a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
