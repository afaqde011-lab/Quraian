package p7;

import java.util.List;

public final class h implements o {
    public static final h A = new h();
    public static final h B = new h();

    @Override
    public int a(Object obj) {
        String str = ((k) obj).f12395a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    public List b(String str, boolean z10, boolean z11) {
        return p.c(str, z10, z11);
    }
}
