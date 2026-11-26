package q30;

import java.io.File;
import java.util.Iterator;

public final class i implements j {
    public final int a = 2;
    public final Object b;
    public final Object c;

    public i(File start) {
        r00.h hVar = r00.h.A;
        kotlin.jvm.internal.m.e(start, "start");
        this.b = start;
        this.c = hVar;
    }

    public i(g gVar, d10.e eVar) {
        this.b = gVar;
        this.c = eVar;
    }

    public i(u00.a aVar, u00.k getNextValue) {
        kotlin.jvm.internal.m.e(getNextValue, "getNextValue");
        this.b = aVar;
        this.c = getNextValue;
    }

    @Override
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new h(this);
            case 1:
                return new h(this, (byte) 0);
            default:
                return new r00.f(this);
        }
    }
}
