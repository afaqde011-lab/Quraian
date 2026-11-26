package pi;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;
import wb.o;
import xf.g;
import xf.n;

public abstract class a {

    public static final f5.d f12527a = new f5.d(0);

    public static n a(Task task, Task task2) {
        wi.b bVar = new wi.b(7);
        g gVar = new g((o) bVar.B);
        ce.a aVar = new ce.a(gVar, new AtomicBoolean(false), bVar, 9);
        f5.d dVar = f12527a;
        task.i(dVar, aVar);
        task2.i(dVar, aVar);
        return gVar.f16565a;
    }
}
