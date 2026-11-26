package x5;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class h extends v5.e implements Runnable {
    public final WeakReference A;

    public h(EditText editText) {
        this.A = new WeakReference(editText);
    }

    @Override
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.A.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override
    public final void run() {
        i.a((EditText) this.A.get(), 1);
    }
}
