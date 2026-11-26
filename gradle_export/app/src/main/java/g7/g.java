package g7;

import a1.u0;
import ab.i0;
import android.content.Context;
import android.net.Uri;
import eh.x;
import eh.z;
import kh.v;
import kh.w;

public final class g implements e7.c {
    public static final x E = a.a.T(new z(1));
    public final w A;
    public final u0 B;
    public final int C;
    public final boolean D;

    public g(c7.g gVar) {
        this.B = new u0((Context) gVar.f2906c, 27);
        w wVar = (w) E.get();
        wVar.getClass();
        this.A = wVar;
        this.C = gVar.f2904a;
        this.D = gVar.f2905b;
    }

    @Override
    public final v O(Uri uri) {
        return ((kh.x) this.A).a(new i0(this, uri, 2));
    }

    @Override
    public final v o0(byte[] bArr) {
        return ((kh.x) this.A).a(new i0(this, bArr, 1));
    }
}
