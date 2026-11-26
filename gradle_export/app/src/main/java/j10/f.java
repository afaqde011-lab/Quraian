package j10;

public final class f {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public static final f F;
    public static final f[] G;

    static {
        f fVar = new f("CLASS", 0);
        A = fVar;
        f fVar2 = new f("INTERFACE", 1);
        B = fVar2;
        f fVar3 = new f("ENUM_CLASS", 2);
        C = fVar3;
        f fVar4 = new f("ENUM_ENTRY", 3);
        D = fVar4;
        f fVar5 = new f("ANNOTATION_CLASS", 4);
        E = fVar5;
        f fVar6 = new f("OBJECT", 5);
        F = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        G = fVarArr;
        f50.c.v(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) G.clone();
    }

    public final boolean a() {
        return this == F || this == D;
    }
}
