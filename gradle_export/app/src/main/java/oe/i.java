package oe;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

public final class i implements xf.c, xf.e, xf.d, xf.b {
    public final CountDownLatch A;

    @Override
    public void f() {
        this.A.countDown();
    }

    @Override
    public void onComplete(Task task) {
        this.A.countDown();
    }

    @Override
    public void onFailure(Exception exc) {
        this.A.countDown();
    }

    @Override
    public void onSuccess(Object obj) {
        this.A.countDown();
    }
}
