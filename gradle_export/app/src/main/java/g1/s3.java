package g1;

public final class s3 {
    public static final s3 A;
    public static final s3 B;
    public static final s3[] C;

    static {
        s3 s3Var = new s3("Selector", 0);
        A = s3Var;
        s3 s3Var2 = new s3("InnerCircle", 1);
        B = s3Var2;
        s3[] s3VarArr = {s3Var, s3Var2};
        C = s3VarArr;
        f50.c.v(s3VarArr);
    }

    public static s3 valueOf(String str) {
        return (s3) Enum.valueOf(s3.class, str);
    }

    public static s3[] values() {
        return (s3[]) C.clone();
    }
}
