package fi;

import a1.u0;
import android.os.Bundle;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.w0;
import g20.l;
import java.util.concurrent.ConcurrentHashMap;
import sg.f;

public final class c implements b {

    public static volatile c f5697c;

    public final o10.b f5698a;

    public final ConcurrentHashMap f5699b;

    public c(o10.b bVar) {
        d0.h(bVar);
        this.f5698a = bVar;
        this.f5699b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (gi.a.a(str) && gi.a.b(str2, bundle) && gi.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            j1 j1Var = (j1) this.f5698a.B;
            j1Var.c(new w0(j1Var, str, str2, bundle, 1));
        }
    }

    public final f b(String str, h7.b bVar) {
        l cVar;
        if (gi.a.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f5699b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                o10.b bVar2 = this.f5698a;
                if (zEquals) {
                    cVar = new u0(bVar2, bVar);
                } else {
                    cVar = "clx".equals(str) ? new gi.c(bVar2, bVar) : null;
                }
                if (cVar != null) {
                    concurrentHashMap.put(str, cVar);
                    return new f();
                }
            }
        }
        return null;
    }
}
