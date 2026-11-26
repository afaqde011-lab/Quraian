package l10;

import c30.t;
import h00.x;
import java.util.Collection;
import kotlin.jvm.internal.m;

public final class a implements b, d {
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public final int a;

    public a(int i) {
        this.a = i;
    }

    @Override
    public Collection a(j10.e eVar) {
        return x.A;
    }

    @Override
    public Collection b(j10.e eVar) {
        return x.A;
    }

    @Override
    public boolean c(j10.e classDescriptor, t tVar) {
        switch (this.a) {
            case 1:
                m.e(classDescriptor, "classDescriptor");
                return true;
            default:
                m.e(classDescriptor, "classDescriptor");
                return !tVar.getAnnotations().d(e.a);
        }
    }

    @Override
    public Collection d(j10.e classDescriptor) {
        m.e(classDescriptor, "classDescriptor");
        return x.A;
    }

    @Override
    public Collection e(n20.e name, j10.e classDescriptor) {
        m.e(name, "name");
        m.e(classDescriptor, "classDescriptor");
        return x.A;
    }
}
