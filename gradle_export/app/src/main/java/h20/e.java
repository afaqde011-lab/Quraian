package h20;

import g20.l;
import g20.n;
import java.security.AccessControlException;
import java.util.HashMap;
import x10.v;

public final class e implements n {
    public static final boolean I;
    public static final HashMap J;
    public int[] A;
    public String B;
    public int C;
    public String[] D;
    public String[] E;
    public String[] F;
    public a G;
    public String[] H;

    static {
        try {
            I = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            I = false;
        }
        HashMap map = new HashMap();
        J = map;
        map.put(kh.n.n0(new n20.c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        map.put(kh.n.n0(new n20.c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        map.put(kh.n.n0(new n20.c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        map.put(kh.n.n0(new n20.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        map.put(kh.n.n0(new n20.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }

    @Override
    public final l e(n20.b bVar, o10.a aVar) {
        a aVar2;
        n20.c cVarA = bVar.a();
        if (cVarA.equals(v.a)) {
            return new c(this, 0);
        }
        if (cVarA.equals(v.o)) {
            return new gi.c(this, 1);
        }
        if (I || this.G != null || (aVar2 = (a) J.get(bVar)) == null) {
            return null;
        }
        this.G = aVar2;
        return new c(this, 1);
    }
}
