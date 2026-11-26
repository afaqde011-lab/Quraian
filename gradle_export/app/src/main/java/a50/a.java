package a50;

import kotlin.jvm.internal.m;

public abstract class a {
    public final String a;
    public final boolean b;
    public c c;
    public long d;

    public a(String name, boolean z) {
        m.e(name, "name");
        this.a = name;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
