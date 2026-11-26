package t6;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

public final class d extends b {
    public d(int i10) {
        this(a.f14359b);
    }

    public d(b bVar) {
        m.e(bVar, "initialExtras");
        LinkedHashMap linkedHashMap = bVar.f14360a;
        m.e(linkedHashMap, "initialExtras");
        this.f14360a.putAll(linkedHashMap);
    }
}
