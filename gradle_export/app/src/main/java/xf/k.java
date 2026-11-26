package xf;

import android.util.Log;

public final class k implements Runnable {
    public final int A;
    public final Object B;

    public k(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                l lVar = (l) this.B;
                synchronized (lVar.C) {
                    try {
                        b bVar = (b) lVar.D;
                        if (bVar != null) {
                            bVar.f();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                wf.a aVar = (wf.a) this.B;
                synchronized (aVar.f16070a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f16079j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f16072c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
