package y20;

import e30.w;
import m10.n;

public final class b extends f5.c {
    public final n C;

    public b(j10.b bVar, w wVar) {
        super(wVar);
        if (wVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.C = (n) bVar;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.C + "}";
    }
}
