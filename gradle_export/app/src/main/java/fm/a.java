package fm;

import a10.h0;
import bk.m;
import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.error.SessionExpiredException;
import com.mchutov.core.domain.exception.AuthException;
import eo.p;
import g00.i;
import java.util.Map;
import java.util.Set;
import l60.o0;
import r30.k;
import retrofit2.HttpException;
import x40.d0;

public final class a extends h0 implements t50.a {
    public final Object f = rd.a.I(i.A, new p(this, 3));

    @Override
    public final Throwable H(Throwable th) {
        String str;
        vk.a aVar;
        d0 d0Var;
        Map map;
        Set setKeySet;
        d0 d0Var2;
        if (!(th instanceof HttpException)) {
            return th;
        }
        HttpException httpException = (HttpException) th;
        int i = httpException.A;
        o0 o0Var = httpException.B;
        if (i != 400 && i != 401) {
            if (i == 423) {
                return new SessionExpiredException(httpException);
            }
            if (i != 429) {
                if (i == 500) {
                    return new ApiException(((pm.c) this.f.getValue()).a(2131886448, new Object[0]), httpException);
                }
                String strX = (o0Var == null || (d0Var2 = o0Var.c) == null) ? null : d0Var2.x();
                str = strX != null ? strX : "";
                if (k.L0(str)) {
                    return new ApiException(null, httpException, 1);
                }
                try {
                    map = (Map) new m().e(str, c.a);
                } catch (Throwable unused) {
                    map = null;
                }
                if (map == null || (setKeySet = map.keySet()) == null || !setKeySet.contains("message")) {
                    return new ApiException(null, httpException, 1);
                }
                Object obj = map.get("message");
                return new ApiException(obj instanceof String ? (String) obj : null, null, 2);
            }
        }
        String strX2 = (o0Var == null || (d0Var = o0Var.c) == null) ? null : d0Var.x();
        str = strX2 != null ? strX2 : "";
        if (k.L0(str)) {
            return new ApiException(null, httpException, 1);
        }
        try {
            aVar = (vk.a) new m().d(vk.a.class, str);
        } catch (Throwable unused2) {
            aVar = null;
        }
        return new AuthException(aVar != null ? aVar.getRetryAfter() : null, aVar != null ? aVar.getCode() : null, aVar != null ? aVar.getMessage() : null);
    }
}
