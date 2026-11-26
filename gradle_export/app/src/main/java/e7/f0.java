package e7;

import java.util.concurrent.ThreadFactory;

public final class f0 implements ThreadFactory {

    public final int f5132a;

    public final String f5133b;

    public f0(String str, int i10) {
        this.f5132a = i10;
        this.f5133b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f5132a) {
            case 0:
                return new Thread(runnable, this.f5133b);
            default:
                Thread thread = new Thread(runnable, this.f5133b);
                thread.setPriority(10);
                return thread;
        }
    }
}
