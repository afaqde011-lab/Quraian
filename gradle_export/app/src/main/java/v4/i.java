package v4;

import java.util.concurrent.ThreadFactory;

public final class i implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new h(runnable);
    }
}
