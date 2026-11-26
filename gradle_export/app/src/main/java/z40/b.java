package z40;

import c50.f;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import q3.e0;
import r30.k;
import th.o;
import x40.a0;
import x40.b0;
import x40.d0;
import x40.p;
import x40.r;
import x40.x;

public final class b implements r {
    @Override
    public final b0 a(f fVar) throws Throwable {
        Throwable th;
        int i;
        System.currentTimeMillis();
        o request = (o) fVar.i;
        m.e(request, "request");
        Throwable th2 = null;
        e0 e0Var = new e0(request, (Object) null, 25);
        if (request.q().j) {
            e0Var = new e0((Object) null, (Object) null, 25);
        }
        o oVar = (o) e0Var.B;
        b0 b0Var = (b0) e0Var.C;
        if (oVar == null && b0Var == null) {
            ArrayList arrayList = new ArrayList(20);
            return new b0(request, x.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new p((String[]) arrayList.toArray(new String[0])), y40.b.c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (oVar == null) {
            m.b(b0Var);
            a0 a0VarL = b0Var.l();
            b0 b0VarA = a.a(b0Var);
            a0.b("cacheResponse", b0VarA);
            a0VarL.i = b0VarA;
            return a0VarL.a();
        }
        b0 b0VarF = fVar.f(oVar);
        if (b0Var != null) {
            if (b0VarF.D == 304) {
                a0 a0VarL2 = b0Var.l();
                p pVar = b0Var.F;
                p pVar2 = b0VarF.F;
                ArrayList arrayList2 = new ArrayList(20);
                int size = pVar.size();
                int i2 = 0;
                while (true) {
                    th = th2;
                    if (i2 >= size) {
                        break;
                    }
                    String name = pVar.c(i2);
                    int i3 = size;
                    String value = pVar.h(i2);
                    p pVar3 = pVar;
                    if ("Warning".equalsIgnoreCase(name)) {
                        i = i2;
                        if (r30.r.x0(value, "1", false)) {
                        }
                        i2 = i + 1;
                        th2 = th;
                        size = i3;
                        pVar = pVar3;
                    } else {
                        i = i2;
                    }
                    if ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || "Content-Type".equalsIgnoreCase(name) || !a.b(name) || pVar2.a(name) == null) {
                        m.e(name, "name");
                        m.e(value, "value");
                        arrayList2.add(name);
                        arrayList2.add(k.j1(value).toString());
                    }
                    i2 = i + 1;
                    th2 = th;
                    size = i3;
                    pVar = pVar3;
                }
                int size2 = pVar2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String name2 = pVar2.c(i4);
                    if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !"Content-Type".equalsIgnoreCase(name2) && a.b(name2)) {
                        String value2 = pVar2.h(i4);
                        m.e(name2, "name");
                        m.e(value2, "value");
                        arrayList2.add(name2);
                        arrayList2.add(k.j1(value2).toString());
                    }
                }
                a0VarL2.f = new p((String[]) arrayList2.toArray(new String[0])).e();
                a0VarL2.k = b0VarF.K;
                a0VarL2.l = b0VarF.L;
                b0 b0VarA2 = a.a(b0Var);
                a0.b("cacheResponse", b0VarA2);
                a0VarL2.i = b0VarA2;
                b0 b0VarA3 = a.a(b0VarF);
                a0.b("networkResponse", b0VarA3);
                a0VarL2.h = b0VarA3;
                a0VarL2.a();
                d0 d0Var = b0VarF.G;
                m.b(d0Var);
                d0Var.close();
                m.b(th);
                throw th;
            }
            d0 d0Var2 = b0Var.G;
            if (d0Var2 != null) {
                y40.b.d(d0Var2);
            }
        }
        a0 a0VarL3 = b0VarF.l();
        b0 b0VarA4 = a.a(b0Var);
        a0.b("cacheResponse", b0VarA4);
        a0VarL3.i = b0VarA4;
        b0 b0VarA5 = a.a(b0VarF);
        a0.b("networkResponse", b0VarA5);
        a0VarL3.h = b0VarA5;
        return a0VarL3.a();
    }
}
