package qb;

import android.webkit.MimeTypeMap;
import java.io.File;
import k50.o;
import k50.z;
import nb.n;

public final class h implements g {

    public final File f12813a;

    public h(File file) {
        this.f12813a = file;
    }

    @Override
    public final Object a(k00.c cVar) {
        String str = z.B;
        File file = this.f12813a;
        return new m(new n(gj.e.j(file), o.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(r00.i.Z(file)), nb.e.C);
    }
}
