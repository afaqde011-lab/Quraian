package mh;

import java.nio.charset.Charset;
import yh.e1;
import yh.f1;
import yh.g1;
import yh.h1;
import yh.i1;
import yh.j1;
import yh.q1;
import yh.y0;

public abstract class n {

    public static final int f10926a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static j1 a(f1 f1Var) {
        g1 g1VarY = j1.y();
        int iA = f1Var.A();
        g1VarY.d();
        j1.v((j1) g1VarY.B, iA);
        for (e1 e1Var : f1Var.z()) {
            h1 h1VarA = i1.A();
            String strA = e1Var.z().A();
            h1VarA.d();
            i1.v((i1) h1VarA.B, strA);
            y0 y0VarC = e1Var.C();
            h1VarA.d();
            i1.x((i1) h1VarA.B, y0VarC);
            q1 q1VarB = e1Var.B();
            h1VarA.d();
            i1.w((i1) h1VarA.B, q1VarB);
            int iA2 = e1Var.A();
            h1VarA.d();
            i1.y((i1) h1VarA.B, iA2);
            i1 i1Var = (i1) h1VarA.a();
            g1VarY.d();
            j1.w((j1) g1VarY.B, i1Var);
        }
        return (j1) g1VarY.a();
    }
}
