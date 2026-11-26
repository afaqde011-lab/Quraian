package j3;

public final class j {

    public static final j f7934c = new j(0.0f, new z00.a(0.0f, 0.0f));

    public final float f7935a;

    public final z00.a f7936b;

    public j(float f3, z00.a aVar) {
        this.f7935a = f3;
        this.f7936b = aVar;
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7935a == jVar.f7935a && kotlin.jvm.internal.m.a(this.f7936b, jVar.f7936b);
    }

    public final int hashCode() {
        return (this.f7936b.hashCode() + (Float.hashCode(this.f7935a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f7935a + ", range=" + this.f7936b + ", steps=0)";
    }
}
