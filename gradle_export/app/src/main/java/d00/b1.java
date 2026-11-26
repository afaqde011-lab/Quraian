package d00;

public final class b1 {
    UI_HIDDEN(10),
    BACKGROUND(20),
    MODERATE(40),
    COMPLETE(80);

    public final int A;

    static {
        f50.c.v(b1VarArr);
    }

    public b1(int i) {
        super(str, i);
        this.A = i;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) F.clone();
    }
}
