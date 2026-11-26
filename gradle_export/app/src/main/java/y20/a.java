package y20;

import e30.w;
import kotlin.jvm.internal.m;

public final class a extends f5.c implements d {
    public final int C = 1;
    public final n20.e D;
    public final Object E;

    public a(j10.b declarationDescriptor, w receiverType, n20.e eVar) {
        super(receiverType);
        m.e(declarationDescriptor, "declarationDescriptor");
        m.e(receiverType, "receiverType");
        this.E = declarationDescriptor;
        this.D = eVar;
    }

    public a(j10.e eVar, w receiverType, n20.e eVar2) {
        super(receiverType);
        m.e(receiverType, "receiverType");
        this.E = eVar;
        this.D = eVar2;
    }

    public final n20.e W0() {
        switch (this.C) {
            case 0:
                break;
        }
        return this.D;
    }

    public final String toString() {
        switch (this.C) {
            case 0:
                return getType() + ": Ctx { " + ((j10.e) this.E) + " }";
            default:
                return "Cxt { " + ((j10.b) this.E) + " }";
        }
    }
}
