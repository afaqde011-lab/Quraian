package r40;

public final class x {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final n00.b H;
    public final char A;
    public final char B;

    static {
        H = f50.c.v(xVarArr);
    }

    public x(char c, char c2) {
        super(str, i);
        this.A = c;
        this.B = c2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) G.clone();
    }
}
