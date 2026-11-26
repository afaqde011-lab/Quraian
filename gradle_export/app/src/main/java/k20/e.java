package k20;

import i20.c0;
import i20.d0;
import i20.i1;
import i20.o0;

public abstract class e {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b O;
    public static final b P;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final c p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b bVarC = d.c();
        a = bVarC;
        b = d.b(bVarC);
        b bVarC2 = d.c();
        c = bVarC2;
        c cVarA = d.a(bVarC2, i1.values());
        d = cVarA;
        c cVarA2 = d.a(cVarA, d0.values());
        e = cVarA2;
        c cVarA3 = d.a(cVarA2, i20.j.values());
        f = cVarA3;
        b bVarB = d.b(cVarA3);
        g = bVarB;
        b bVarB2 = d.b(bVarB);
        h = bVarB2;
        b bVarB3 = d.b(bVarB2);
        i = bVarB3;
        b bVarB4 = d.b(bVarB3);
        j = bVarB4;
        b bVarB5 = d.b(bVarB4);
        k = bVarB5;
        b bVarB6 = d.b(bVarB5);
        l = bVarB6;
        m = d.b(bVarB6);
        b bVarB7 = d.b(cVarA);
        n = bVarB7;
        b bVarB8 = d.b(bVarB7);
        o = bVarB8;
        d.a(bVarB8, o0.values());
        c cVarA4 = d.a(cVarA2, c0.values());
        p = cVarA4;
        b bVarB9 = d.b(cVarA4);
        q = bVarB9;
        b bVarB10 = d.b(bVarB9);
        r = bVarB10;
        b bVarB11 = d.b(bVarB10);
        s = bVarB11;
        b bVarB12 = d.b(bVarB11);
        t = bVarB12;
        b bVarB13 = d.b(bVarB12);
        u = bVarB13;
        b bVarB14 = d.b(bVarB13);
        v = bVarB14;
        b bVarB15 = d.b(bVarB14);
        w = bVarB15;
        b bVarB16 = d.b(bVarB15);
        x = bVarB16;
        d.a(bVarB16, o0.values());
        b bVarB17 = d.b(cVarA4);
        y = bVarB17;
        b bVarB18 = d.b(bVarB17);
        z = bVarB18;
        b bVarB19 = d.b(bVarB18);
        A = bVarB19;
        b bVarB20 = d.b(bVarB19);
        B = bVarB20;
        b bVarB21 = d.b(bVarB20);
        C = bVarB21;
        b bVarB22 = d.b(bVarB21);
        D = bVarB22;
        b bVarB23 = d.b(bVarB22);
        E = bVarB23;
        b bVarB24 = d.b(bVarB23);
        F = bVarB24;
        b bVarB25 = d.b(bVarB24);
        G = bVarB25;
        d.a(bVarB25, o0.values());
        b bVarB26 = d.b(bVarC2);
        H = bVarB26;
        b bVarB27 = d.b(bVarB26);
        I = bVarB27;
        J = d.b(bVarB27);
        b bVarB28 = d.b(cVarA2);
        K = bVarB28;
        b bVarB29 = d.b(bVarB28);
        L = bVarB29;
        M = d.b(bVarB29);
        b bVarC3 = d.c();
        N = bVarC3;
        O = d.b(bVarC3);
        P = d.c();
    }

    public static void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "modality";
        } else if (i2 == 2) {
            objArr[0] = "kind";
        } else if (i2 == 5) {
            objArr[0] = "modality";
        } else if (i2 == 6) {
            objArr[0] = "memberKind";
        } else if (i2 == 8) {
            objArr[0] = "modality";
        } else if (i2 == 9) {
            objArr[0] = "memberKind";
        } else if (i2 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i2) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z2, i1 i1Var, d0 d0Var) {
        if (i1Var == null) {
            a(10);
            throw null;
        }
        if (d0Var == null) {
            a(11);
            throw null;
        }
        b bVar = c;
        bVar.getClass();
        int i2 = z2 ? 1 << bVar.b : 0;
        c cVar = e;
        cVar.getClass();
        int number = i2 | (d0Var.getNumber() << cVar.b);
        c cVar2 = d;
        cVar2.getClass();
        int number2 = number | (i1Var.getNumber() << cVar2.b);
        K.getClass();
        L.getClass();
        M.getClass();
        return number2;
    }
}
