package xd;

import android.content.Context;
import androidx.lifecycle.i0;
import com.google.protobuf.RuntimeVersion;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import oj.q;
import sd.p1;

public final class p {

    public static volatile j f16557e;

    public final ge.a f16558a;

    public final ge.a f16559b;

    public final ce.d f16560c;

    public final a30.k f16561d;

    public p(ge.a aVar, ge.a aVar2, ce.d dVar, a30.k kVar, q qVar) {
        this.f16558a = aVar;
        this.f16559b = aVar2;
        this.f16560c = dVar;
        this.f16561d = kVar;
        ((Executor) qVar.B).execute(new i0(qVar, 13));
    }

    public static p a() {
        j jVar = f16557e;
        if (jVar != null) {
            return (p) jVar.F.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f16557e == null) {
            synchronized (p.class) {
                try {
                    if (f16557e == null) {
                        dh.o oVar = new dh.o();
                        context.getClass();
                        oVar.A = context;
                        f16557e = oVar.f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? Collections.unmodifiableSet(vd.a.f15607d) : Collections.singleton(new ud.c("proto"));
        p1 p1VarA = i.a();
        kVar.getClass();
        p1VarA.B = "cct";
        vd.a aVar = (vd.a) kVar;
        String str = aVar.f15610a;
        String str2 = aVar.f15611b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = RuntimeVersion.SUFFIX;
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        p1VarA.C = bytes;
        return new o(setUnmodifiableSet, p1VarA.i(), this);
    }
}
