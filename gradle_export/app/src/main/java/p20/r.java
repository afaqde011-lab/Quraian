package p20;

public final class r extends t {
    public r() {
        super("HTML", 1);
    }

    @Override
    public final String a(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        return r30.r.v0(r30.r.v0(string, "<", "&lt;"), ">", "&gt;");
    }
}
