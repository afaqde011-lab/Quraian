package e10;

import java.lang.reflect.Field;

public final class l extends m {
    public final int e;

    public l(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }

    @Override
    public void d(Object[] args) {
        switch (this.e) {
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
