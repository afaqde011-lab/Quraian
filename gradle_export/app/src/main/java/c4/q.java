package c4;

import android.window.OnBackInvokedCallback;

public final class q implements OnBackInvokedCallback {

    public final int f2842a;

    public final Object f2843b;

    public q(Object obj, int i10) {
        this.f2842a = i10;
        this.f2843b = obj;
    }

    @Override
    public final void onBackInvoked() {
        int i10 = this.f2842a;
        Object obj = this.f2843b;
        switch (i10) {
            case 0:
                u00.a aVar = (u00.a) obj;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                ((k.b0) obj).D();
                break;
            case 2:
                ((og.b) obj).b();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            default:
                ((s9.m) obj).a();
                break;
        }
    }
}
