package pi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k7.t;

public final class b implements Executor {
    public final ExecutorService A;
    public final Object B = new Object();
    public Task C = Tasks.d(null);

    public b(ExecutorService executorService) {
        this.A = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskI;
        synchronized (this.B) {
            taskI = this.C.i(this.A, new t(runnable, 19));
            this.C = taskI;
        }
        return taskI;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.A.execute(runnable);
    }
}
