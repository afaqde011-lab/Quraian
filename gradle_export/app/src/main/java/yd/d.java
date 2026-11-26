package yd;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import s10.w0;
import sd.p1;

public final class d {

    public final w0 f16858a;

    public final p1 f16859b;

    public final HashMap f16860c;

    public d(Context context, p1 p1Var) {
        w0 w0Var = new w0(context);
        this.f16860c = new HashMap();
        this.f16858a = w0Var;
        this.f16859b = p1Var;
    }

    public final synchronized e a(String str) {
        if (this.f16860c.containsKey(str)) {
            return (e) this.f16860c.get(str);
        }
        CctBackendFactory cctBackendFactoryI = this.f16858a.i(str);
        if (cctBackendFactoryI == null) {
            return null;
        }
        p1 p1Var = this.f16859b;
        e eVarCreate = cctBackendFactoryI.create(new b((Context) p1Var.B, (ge.a) p1Var.C, (ge.a) p1Var.D, str));
        this.f16860c.put(str, eVarCreate);
        return eVarCreate;
    }
}
