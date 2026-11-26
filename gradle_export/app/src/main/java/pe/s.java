package pe;

public class s {

    public static final s f12521d = new s(true, null, null);

    public final boolean f12522a;

    public final String f12523b;

    public final Throwable f12524c;

    public s(boolean z10, String str, Exception exc) {
        this.f12522a = z10;
        this.f12523b = str;
        this.f12524c = exc;
    }

    public static s b(String str) {
        return new s(false, str, null);
    }

    public static s c(String str, Exception exc) {
        return new s(false, str, exc);
    }

    public String a() {
        return this.f12523b;
    }
}
