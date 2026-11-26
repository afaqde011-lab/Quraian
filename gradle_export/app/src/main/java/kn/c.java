package kn;

import android.content.Context;
import b6.k;
import g00.b0;
import j6.g;
import j6.q;
import java.util.Locale;
import kh.n;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import n6.e;
import u00.o;
import y3.h;

public final class c implements o {
    public final int A;
    public final Context B;
    public final String C;

    public c(int i, Context context, String str) {
        this.A = i;
        this.B = context;
        this.C = str;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                q Row = (q) obj;
                j jVar = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(Row, "$this$Row");
                w00.a.b(Row.a(), 0, 0, v1.d.d(1052146063, new c(1, this.B, this.C), jVar), jVar, 3072, 6);
                a.a.f(ze.d.U(2), jVar, 0);
                n.p(20, (b6.m) null, jVar, 6);
                break;
            default:
                g Column = (g) obj;
                g0 g0Var = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(Column, "$this$Column");
                Context context = this.B;
                String string = context.getString(2131887367);
                m.d(string, "getString(...)");
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                m.d(locale, "get(...)");
                String upperCase = string.toUpperCase(locale);
                m.d(upperCase, "toUpperCase(...)");
                o6.g gVar = dn.d.a;
                float f = 2;
                ze.d.e(upperCase, (b6.m) null, new e(gVar, new y3.o(bi.b.A(context, upperCase, (h.b(((h) g0Var.k(b6.g.a)).a) - (dn.m.b * f)) - 22, kh.o.z(14), kh.o.z(10))), (n6.b) null, (n6.c) null, 124), 1, g0Var, 3072, 2);
                a.a.f(ze.d.D(k.a, f), g0Var, 0);
                long jZ = kh.o.z(28);
                String str = this.C;
                ze.d.e(str, (b6.m) null, new e(gVar, new y3.o(f50.c.a0(jZ, str)), new n6.b(700), (n6.c) null, 120), 1, g0Var, 3072, 2);
                break;
        }
        return b0.a;
    }
}
