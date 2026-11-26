package hq;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final ExecutorService a;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        m.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        a = executorServiceNewSingleThreadExecutor;
    }
}
