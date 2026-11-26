package b20;

public final class q {
    public final n20.e a;
    public final p10.o b;

    public q(n20.e name, p10.o oVar) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = name;
        this.b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return kotlin.jvm.internal.m.a(this.a, ((q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
