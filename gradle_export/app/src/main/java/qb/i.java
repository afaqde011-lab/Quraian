package qb;

import android.net.Uri;
import g00.p;

public final class i implements f {

    public final p f12814a;

    public final p f12815b;

    public final boolean f12816c;

    public i(p pVar, p pVar2, boolean z10) {
        this.f12814a = pVar;
        this.f12815b = pVar2;
        this.f12816c = z10;
    }

    @Override
    public final g a(Object obj, wb.l lVar) {
        Uri uri = (Uri) obj;
        if (!kotlin.jvm.internal.m.a(uri.getScheme(), "http") && !kotlin.jvm.internal.m.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), lVar, this.f12814a, this.f12815b, this.f12816c);
    }
}
