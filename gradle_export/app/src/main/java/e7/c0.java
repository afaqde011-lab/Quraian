package e7;

import android.os.Message;
import java.util.ArrayList;

public final class c0 {

    public Message f5118a;

    public final void a() {
        this.f5118a = null;
        ArrayList arrayList = d0.f5119b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f5118a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
