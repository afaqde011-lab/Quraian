package e10;

import java.lang.reflect.Field;

public final class p extends q {
    public final int g;

    public p(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }

    @Override
    public void d(Object[] args) {
        switch (this.g) {
            case 1:
                kotlin.jvm.internal.m.e(args, "args");
                super.d(args);
                e(h00.n.E0(args));
                break;
            default:
                super.d(args);
                break;
        }
    }
}
