package e7;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class t {

    public static t f5172f;

    public final Executor f5173a;

    public final CopyOnWriteArrayList f5174b;

    public final Object f5175c;

    public int f5176d;

    public boolean f5177e;

    public t(Context context) {
        Executor executorF = a.f();
        this.f5173a = executorF;
        this.f5174b = new CopyOnWriteArrayList();
        this.f5175c = new Object();
        this.f5176d = 0;
        executorF.execute(new ab.f(this, context, 13));
    }

    public static synchronized t a(Context context) {
        try {
            if (f5172f == null) {
                f5172f = new t(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5172f;
    }

    public final int b() {
        int i10;
        synchronized (this.f5175c) {
            i10 = this.f5176d;
        }
        return i10;
    }

    public final void c(int i10) {
        CopyOnWriteArrayList<s> copyOnWriteArrayList = this.f5174b;
        for (s sVar : copyOnWriteArrayList) {
            if (sVar.f5169a.get() == null) {
                copyOnWriteArrayList.remove(sVar);
            }
        }
        synchronized (this.f5175c) {
            try {
                if (this.f5177e && this.f5176d == i10) {
                    return;
                }
                this.f5177e = true;
                this.f5176d = i10;
                for (s sVar2 : this.f5174b) {
                    sVar2.f5170b.execute(new androidx.lifecycle.i0(sVar2, 14));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
