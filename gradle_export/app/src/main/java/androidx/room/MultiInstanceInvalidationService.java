package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ca.h;
import ca.i;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final i C = new i(this);
    public final h D = new h(this);

    @Override
    public final IBinder onBind(Intent intent) {
        m.e(intent, "intent");
        return this.D;
    }
}
