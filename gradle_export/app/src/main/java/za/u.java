package za;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class u {

    public final Context f17397b;

    public final WorkerParameters f17398c;

    public final AtomicInteger f17399d = new AtomicInteger(-256);

    public boolean f17400e;

    public u(Context context, WorkerParameters workerParameters) {
        this.f17397b = context;
        this.f17398c = workerParameters;
    }

    public final boolean a() {
        return this.f17399d.get() != -256;
    }

    public abstract d4.k d();
}
