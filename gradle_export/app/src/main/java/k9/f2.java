package k9;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

public final class f2 extends Handler {

    public final int f9288a = 0;

    public Object f9289b;

    public Object f9290c;

    public f2(s1 s1Var, Looper looper) {
        super(looper);
        this.f9290c = s1Var;
    }

    public f2(l9.f fVar) {
        this.f9289b = new WeakReference(fVar);
    }

    @Override
    public void handleMessage(Message message) {
        switch (this.f9288a) {
            case 1:
                WeakReference weakReference = (WeakReference) this.f9290c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                l9.f fVar = (l9.f) ((WeakReference) this.f9289b).get();
                if (messenger == null || fVar == null) {
                    return;
                }
                Bundle data = message.getData();
                l9.f0.h(data);
                try {
                    if (message.what != 3) {
                        e7.a.m("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    l9.f0.h(data.getBundle("data_options"));
                    l9.f0.h(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    a.a.q(data.getParcelableArrayList("data_media_item_list"), l9.g.CREATOR);
                    if (fVar.f10144g != messenger) {
                        return;
                    }
                    if (string != null && fVar.f10142e.get(string) != null) {
                        throw new ClassCastException();
                    }
                    e7.a.b("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    return;
                } catch (BadParcelableException unused) {
                    e7.a.d("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }
}
