package m60;

import bk.a0;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import k50.i;
import k50.l;
import l60.l0;
import l60.m;
import w50.c;
import x40.s;

public final class b implements m {
    public static final s C;
    public final bk.m A;
    public final a0 B;

    static {
        Pattern pattern = s.d;
        C = c.H("application/json; charset=UTF-8");
    }

    public b(bk.m mVar, a0 a0Var) {
        this.A = mVar;
        this.B = a0Var;
    }

    @Override
    public final Object convert(Object obj) throws EOFException {
        i iVar = new i();
        ik.b bVarH = this.A.h(new OutputStreamWriter(iVar.i0(), StandardCharsets.UTF_8));
        this.B.c(bVarH, obj);
        bVarH.close();
        l content = iVar.m(iVar.B);
        kotlin.jvm.internal.m.e(content, "content");
        return new l0(C, content);
    }
}
