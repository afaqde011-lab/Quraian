package m7;

import android.net.Uri;
import androidx.media3.common.j0;
import e7.i0;
import java.util.ArrayList;
import java.util.List;

public final class c {

    public final long f10580a;

    public final long f10581b;

    public final long f10582c;

    public final boolean f10583d;

    public final long f10584e;

    public final long f10585f;

    public final long f10586g;

    public final long f10587h;

    public final gd.d f10588i;

    public final j0 f10589j;

    public final Uri f10590k;
    public final i l;
    public final List m;

    public c(long j9, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, gd.d dVar, j0 j0Var, Uri uri, ArrayList arrayList) {
        this.f10580a = j9;
        this.f10581b = j10;
        this.f10582c = j11;
        this.f10583d = z10;
        this.f10584e = j12;
        this.f10585f = j13;
        this.f10586g = j14;
        this.f10587h = j15;
        this.l = iVar;
        this.f10588i = dVar;
        this.f10590k = uri;
        this.f10589j = j0Var;
        this.m = arrayList;
    }

    public final h a(int i10) {
        return (h) this.m.get(i10);
    }

    public final long b(int i10) {
        long j9;
        long j10;
        List list = this.m;
        if (i10 == list.size() - 1) {
            j9 = this.f10581b;
            if (j9 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i10)).f10607b;
        } else {
            j9 = ((h) list.get(i10 + 1)).f10607b;
            j10 = ((h) list.get(i10)).f10607b;
        }
        return j9 - j10;
    }

    public final long c(int i10) {
        return i0.H(b(i10));
    }
}
