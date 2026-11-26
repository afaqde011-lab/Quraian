package v0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import c3.k1;
import g00.b0;

public final class a implements u00.k {
    public final int A;
    public final f B;

    public a(f fVar, int i10) {
        this.A = i10;
        this.B = fVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                u00.a aVar = (u00.a) obj;
                View view = this.B.f15315a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.a(11, aVar));
                    }
                }
                return b0.a;
            case 1:
                ActionMode actionMode = this.B.f15322h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return b0.a;
            case 2:
                ActionMode actionMode2 = this.B.f15322h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return b0.a;
            default:
                f fVar = this.B;
                fVar.f15319e.e();
                return new k1(fVar, 20);
        }
    }
}
