package bp;

import a1.e2;
import bk.m;
import ep.h;
import ep.k;
import java.io.IOException;
import k00.j;
import l60.o0;
import retrofit2.HttpException;
import wo.c0;
import x40.d0;

public final class b {
    public final ap.a a;
    public final c0 b;
    public final uo.f c;
    public final a d;
    public final c e;

    public b(ap.a aVar, c0 c0Var, uo.f fVar, a aVar2, c cVar) {
        this.a = aVar;
        this.b = c0Var;
        this.c = fVar;
        this.d = aVar2;
        this.e = cVar;
    }

    public static k a(Exception exc) {
        vk.a aVar;
        d0 d0Var;
        HttpException httpException = exc instanceof HttpException ? (HttpException) exc : null;
        if (httpException == null || httpException.A != 401) {
            return null;
        }
        o0 o0Var = httpException.B;
        String strX = (o0Var == null || (d0Var = o0Var.c) == null) ? null : d0Var.x();
        if (strX == null) {
            strX = "";
        }
        try {
            aVar = (vk.a) new m().d(vk.a.class, strX);
        } catch (Throwable unused) {
            aVar = null;
        }
        gj.e eVar = k.A;
        String code = aVar != null ? aVar.getCode() : null;
        eVar.getClass();
        return gj.e.h(code);
    }

    public final synchronized String b(String str) {
        int i;
        try {
            ep.g session = this.b.a.getSession();
            String str2 = null;
            String str3 = session != null ? session.a : null;
            if (str3 == null) {
                str3 = "";
            }
            if (!r30.k.L0(str3) && !str3.equals(str)) {
                return str3;
            }
            String str4 = session != null ? session.b : null;
            if (str4 == null) {
                str4 = "";
            }
            if (r30.k.L0(str4)) {
                this.d.a();
                return null;
            }
            try {
                ep.g gVar = (ep.g) a40.c0.C(j.A, new e2(this, str4, (k00.c) null, 4));
                if (r30.k.L0(gVar.a)) {
                    this.d.a();
                } else {
                    h hVar = gVar.e;
                    if (r30.k.L0(hVar.a)) {
                        hVar = null;
                    }
                    if (hVar == null) {
                        hVar = session != null ? session.e : null;
                        if (hVar == null) {
                            hVar = gVar.e;
                        }
                    }
                    this.b.b(ep.g.a(gVar, hVar));
                    str2 = gVar.a;
                }
            } catch (Exception e) {
                if (!(e instanceof IOException) && (!(e instanceof HttpException) || ((i = ((HttpException) e).A) < 500 && i != 429 && i != 408))) {
                    k kVarA = a(e);
                    if (kVarA != null) {
                        this.e.a(kVarA);
                    } else {
                        this.d.a();
                    }
                }
            }
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
