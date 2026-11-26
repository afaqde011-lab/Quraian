package og;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class d implements OnBackAnimationCallback {

    public final b f11963a;

    public final e f11964b;

    public d(e eVar, b bVar) {
        this.f11964b = eVar;
        this.f11963a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f11964b.f11962a != null) {
            this.f11963a.d();
        }
    }

    @Override
    public final void onBackInvoked() {
        this.f11963a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f11964b.f11962a != null) {
            this.f11963a.a(new d.b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f11964b.f11962a != null) {
            this.f11963a.c(new d.b(backEvent));
        }
    }
}
