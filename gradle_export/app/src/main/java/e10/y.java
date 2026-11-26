package e10;

import java.util.Arrays;

public final class y extends z {
    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        Object obj = args[0];
        Object[] objArrX0 = args.length <= 1 ? new Object[0] : h00.n.x0(args, 1, args.length);
        return this.a.invoke(obj, Arrays.copyOf(objArrX0, objArrX0.length));
    }
}
