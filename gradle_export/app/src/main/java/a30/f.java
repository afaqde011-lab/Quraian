package a30;

public final class f {
    public final n20.b a;
    public final d b;

    public f(n20.b classId, d dVar) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.a = classId;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return kotlin.jvm.internal.m.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
