package s9;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c4.q;

public final class m extends h {

    public final OnBackInvokedDispatcher f13940c;

    public final int f13941d;

    public final OnBackInvokedCallback f13942e;

    public boolean f13943f;

    public m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.f13940c = onBackInvokedDispatcher;
        this.f13941d = i10;
        this.f13942e = Build.VERSION.SDK_INT == 33 ? new q(this, 4) : new n(this);
    }

    @Override
    public final void b(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback = this.f13942e;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13940c;
        if (z10 && !this.f13943f) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(this.f13941d, onBackInvokedCallback);
            this.f13943f = true;
        } else {
            if (z10 || !this.f13943f) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f13943f = false;
        }
    }
}
