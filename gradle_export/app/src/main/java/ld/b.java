package ld;

import java.io.File;
import java.io.FilenameFilter;
import r30.r;

public final class b implements FilenameFilter {

    public final int f10264a;

    public final Object f10265b;

    public b(Object obj, int i10) {
        this.f10264a = i10;
        this.f10265b = obj;
    }

    @Override
    public final boolean accept(File file, String str) {
        int i10 = this.f10264a;
        Object obj = this.f10265b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                kotlin.jvm.internal.m.e(hVar, "this$0");
                kotlin.jvm.internal.m.b(str);
                return (!r30.k.A0(str, hVar.f10267b, false) || r.p0(str, ".tmp", false) || r.p0(str, ".properties", false)) ? false : true;
            case 1:
                kotlin.jvm.internal.m.b(str);
                return r30.k.A0(str, ((h) obj).f10267b, false) && r.p0(str, ".tmp", false);
            case 2:
                kotlin.jvm.internal.m.b(str);
                return r30.k.A0(str, ((h) obj).f10267b, false) && !r.p0(str, ".properties", false);
            default:
                return str.startsWith((String) obj);
        }
    }
}
