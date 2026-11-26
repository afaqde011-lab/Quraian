package c6;

import kotlin.jvm.internal.m;

public final class c {

    public final String f2888a;

    public c(String str) {
        this.f2888a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return m.a(this.f2888a, ((c) obj).f2888a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2888a.hashCode();
    }

    public final String toString() {
        return this.f2888a;
    }
}
