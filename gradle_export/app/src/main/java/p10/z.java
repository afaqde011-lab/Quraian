package p10;

import java.lang.reflect.Type;
import java.util.Collection;

public final class z extends b0 implements e20.d {
    public final Class a;

    public z(Class cls) {
        this.a = cls;
    }

    @Override
    public final Type b() {
        return this.a;
    }

    @Override
    public final Collection getAnnotations() {
        return h00.x.A;
    }
}
