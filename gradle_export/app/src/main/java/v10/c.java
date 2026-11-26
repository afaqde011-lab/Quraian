package v10;

import g00.k;
import i20.a1;
import i20.b0;
import java.util.List;
import k20.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m20.g;
import p30.f;
import t10.i;

public final class c extends f {
    public c(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            k kVarG = g.g(strArrD1, metadata.d2());
            m20.f strings = (m20.f) kVarG.A;
            b0 b0Var = (b0) kVarG.B;
            boolean z = new a(metadata.mv()).compareTo(new a(1, 4, 0)) < 0;
            m.e(b0Var, "<this>");
            m.e(strings, "strings");
            a1 a1Var = b0Var.Q;
            m.d(a1Var, "getTypeTable(...)");
            f.w0(b0Var, new i(strings, new h9.f(a1Var), j.b, z, (List) null, 48));
        }
        new a(metadata.mv());
        metadata.xi();
    }
}
