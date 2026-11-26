package y3;

public final class e implements c {
    public final float A;
    public final float B;
    public final z3.a C;

    public e(float f3, float f10, z3.a aVar) {
        this.A = f3;
        this.B = f10;
        this.C = aVar;
    }

    @Override
    public final float H(long j9) {
        if (p.a(o.b(j9), 4294967296L)) {
            return this.C.b(o.c(j9));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override
    public final float c() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.A, eVar.A) == 0 && Float.compare(this.B, eVar.B) == 0 && kotlin.jvm.internal.m.a(this.C, eVar.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + w.c.c(this.B, Float.hashCode(this.A) * 31, 31);
    }

    @Override
    public final long r(float f3) {
        return kh.o.F(this.C.a(f3), 4294967296L);
    }

    @Override
    public final float t0() {
        return this.B;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.A + ", fontScale=" + this.B + ", converter=" + this.C + ')';
    }
}
