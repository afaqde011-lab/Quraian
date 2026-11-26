package bv;

public final class f1 implements g1 {
    public final ot.d a;

    public f1(ot.d script) {
        kotlin.jvm.internal.m.e(script, "script");
        this.a = script;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.a == ((f1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnVerseScriptSelected(script=" + this.a + ")";
    }
}
