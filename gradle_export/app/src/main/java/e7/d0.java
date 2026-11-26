package e7;

import android.os.Handler;
import java.util.ArrayList;

public final class d0 implements k {

    public static final ArrayList f5119b = new ArrayList(50);

    public final Handler f5120a;

    public d0(Handler handler) {
        this.f5120a = handler;
    }

    public static c0 c() {
        c0 c0Var;
        ArrayList arrayList = f5119b;
        synchronized (arrayList) {
            try {
                c0Var = arrayList.isEmpty() ? new c0() : (c0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public final c0 a(int i10, int i11, int i12) {
        c0 c0VarC = c();
        c0VarC.f5118a = this.f5120a.obtainMessage(i10, i11, i12);
        return c0VarC;
    }

    public final c0 b(int i10, Object obj) {
        c0 c0VarC = c();
        c0VarC.f5118a = this.f5120a.obtainMessage(i10, obj);
        return c0VarC;
    }

    public final boolean d(Runnable runnable) {
        return this.f5120a.post(runnable);
    }

    public final void e(int i10) {
        ta.c0.s(i10 != 0);
        this.f5120a.removeMessages(i10);
    }

    public final boolean f(int i10) {
        return this.f5120a.sendEmptyMessage(i10);
    }
}
