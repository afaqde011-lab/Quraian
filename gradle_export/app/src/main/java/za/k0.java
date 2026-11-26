package za;

import java.util.Set;
import java.util.UUID;

public abstract class k0 {

    public final UUID f17387a;

    public final hb.p f17388b;

    public final Set f17389c;

    public k0(UUID uuid, hb.p pVar, Set set) {
        kotlin.jvm.internal.m.e(uuid, "id");
        kotlin.jvm.internal.m.e(pVar, "workSpec");
        kotlin.jvm.internal.m.e(set, "tags");
        this.f17387a = uuid;
        this.f17388b = pVar;
        this.f17389c = set;
    }
}
