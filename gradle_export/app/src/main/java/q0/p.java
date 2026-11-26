package q0;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

public final class p extends ContentObserver {

    public final o f12674a;

    public final l1.z0 f12675b;

    public p(o oVar, l1.z0 z0Var, Handler handler) {
        super(handler);
        this.f12674a = oVar;
        this.f12675b = z0Var;
    }

    @Override
    public final void onChange(boolean z10) {
        o oVar = this.f12674a;
        oVar.getClass();
        boolean z11 = true;
        try {
            if (Settings.System.getInt(oVar.f12671a, "show_password") <= 0) {
                z11 = false;
            }
        } catch (Exception e3) {
            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e3);
        }
        this.f12675b.setValue(Boolean.valueOf(z11));
    }
}
