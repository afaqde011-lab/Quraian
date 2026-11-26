package c3;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

public final class l implements Runnable {
    public final int A;

    private final void a() {
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                u.d0 d0Var = z.f2780o1;
                synchronized (d0Var) {
                    Object[] objArr = d0Var.f14837a;
                    int i10 = d0Var.f14838b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        z zVar = (z) objArr[i11];
                        zVar.post(new k(zVar, 2));
                    }
                }
                return;
            case 1:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f3169a;
                return;
            default:
                return;
        }
    }
}
