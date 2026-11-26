package l60;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class c extends a {
    @Override
    public final List a(Executor executor) {
        return Arrays.asList(new k(), new o(executor));
    }

    @Override
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}
