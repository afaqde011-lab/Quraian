package androidx.media3.cast;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class s implements Executor {
    public final Handler A;

    @Override
    public final void execute(Runnable runnable) {
        this.A.post(runnable);
    }
}
