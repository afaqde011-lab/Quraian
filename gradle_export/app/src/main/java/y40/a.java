package y40;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.m;

public final class a implements ThreadFactory {
    public final String a;
    public final boolean b;

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        String name = this.a;
        m.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.b);
        return thread;
    }
}
