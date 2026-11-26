package l9;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import k9.y0;

public final class v {

    public final MediaController f10183a;

    public final Object f10184b = new Object();

    public final ArrayList f10185c = new ArrayList();

    public final HashMap f10186d = new HashMap();

    public final e0 f10187e;

    public v(Context context, e0 e0Var) {
        this.f10187e = e0Var;
        MediaController mediaController = new MediaController(context, e0Var.B);
        this.f10183a = mediaController;
        if (e0Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ah.d(this));
        }
    }

    public final void a() {
        d dVarA = this.f10187e.a();
        if (dVarA == null) {
            return;
        }
        ArrayList<y0> arrayList = this.f10185c;
        for (y0 y0Var : arrayList) {
            u uVar = new u(y0Var);
            this.f10186d.put(y0Var, uVar);
            y0Var.f9548c = uVar;
            try {
                dVarA.a2(uVar);
                y0Var.c(13, null);
            } catch (RemoteException | SecurityException e3) {
                e7.a.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
            }
        }
        arrayList.clear();
    }

    public final void b(y0 y0Var) {
        MediaController mediaController = this.f10183a;
        android.support.v4.media.session.e eVar = y0Var.f9546a;
        eVar.getClass();
        mediaController.unregisterCallback(eVar);
        synchronized (this.f10184b) {
            d dVarA = this.f10187e.a();
            if (dVarA != null) {
                try {
                    u uVar = (u) this.f10186d.remove(y0Var);
                    if (uVar != null) {
                        y0Var.f9548c = null;
                        dVarA.P(uVar);
                    }
                } catch (RemoteException | SecurityException e3) {
                    e7.a.e("MediaControllerCompat", "Dead object in unregisterCallback.", e3);
                }
            } else {
                this.f10185c.remove(y0Var);
            }
        }
    }
}
