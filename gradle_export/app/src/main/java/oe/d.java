package oe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

public final class d implements xf.a, xf.f {
    public static final d B = new d(0);
    public static final d C = new d(1);
    public static final d D = new d(2);
    public final int A;

    public d(int i10) {
        this.A = i10;
    }

    @Override
    public Object M(Task task) throws IOException {
        switch (this.A) {
            case 0:
                if (task.o()) {
                    return (Bundle) task.k();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.j())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.j());
            default:
                Intent intent = (Intent) ((Bundle) task.k()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override
    public Task k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = b.f11938h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.d(bundle) : Tasks.d(null);
    }
}
