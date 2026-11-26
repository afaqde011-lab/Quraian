package eh;

public final class c extends h {
    public static final c C = new c("CharMatcher.any()", 0);
    public static final c D = new c("CharMatcher.ascii()", 1);
    public static final c E = new c("CharMatcher.javaIsoControl()", 2);
    public static final c F = new c("CharMatcher.none()", 3);
    public final int B;

    public c(String str, int i10) {
        super(str);
        this.B = i10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.B) {
            case 0:
                return true;
            case 1:
                return c10 <= 127;
            case 2:
                return c10 <= 31 || (c10 >= 127 && c10 <= 159);
            default:
                return false;
        }
    }

    @Override
    public j d() {
        switch (this.B) {
            case 0:
                return F;
            case 3:
                return C;
            default:
                return super.d();
        }
    }
}
