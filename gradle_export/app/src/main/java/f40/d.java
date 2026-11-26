package f40;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

public abstract class d {
    public static final List a;

    static {
        try {
            a = q30.l.u0(q30.l.j0(Arrays.asList(new b40.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
