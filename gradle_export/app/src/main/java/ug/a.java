package ug;

import android.os.Handler;
import android.os.Message;

public final class a implements Handler.Callback {
    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            throw a1.b.i(message.obj);
        }
        if (i10 != 1) {
            return false;
        }
        throw a1.b.i(message.obj);
    }
}
