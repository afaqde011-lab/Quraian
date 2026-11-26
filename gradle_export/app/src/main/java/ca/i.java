package ca;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class i extends RemoteCallbackList {

    public final MultiInstanceInvalidationService f3046a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3046a = multiInstanceInvalidationService;
    }

    @Override
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        kotlin.jvm.internal.m.e((d) iInterface, "callback");
        kotlin.jvm.internal.m.e(obj, "cookie");
        this.f3046a.B.remove((Integer) obj);
    }
}
