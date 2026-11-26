package l50;

import java.util.ArrayList;
import k50.z;
import kotlin.jvm.internal.m;

public final class g {
    public final z a;
    public final boolean b;
    public final long c;
    public final long d;
    public final int e;
    public final Long f;
    public final long g;
    public final ArrayList h;

    public g(z zVar) {
        this(zVar, true, "", -1L, -1L, -1, null, -1L);
    }

    public g(z zVar, boolean z, String comment, long j, long j2, int i, Long l, long j3) {
        m.e(comment, "comment");
        this.a = zVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = l;
        this.g = j3;
        this.h = new ArrayList();
    }
}
