package j10;

public abstract class f1 {
    public final String a;
    public final boolean b;

    public f1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public Integer a(f1 visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        i00.f fVar = e1.a;
        if (this == visibility) {
            return 0;
        }
        i00.f fVar2 = e1.a;
        Integer num = (Integer) fVar2.get(this);
        Integer num2 = (Integer) fVar2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.a;
    }

    public f1 c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
