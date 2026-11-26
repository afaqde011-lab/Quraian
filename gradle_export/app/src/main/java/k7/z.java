package k7;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;
import qd.u0;

public final class z {

    public final Object f9186a;

    public boolean f9187b;

    public final Object f9188c;

    public Object f9189d;

    public Object f9190e;

    public Object f9191f;

    public Object f9192g;

    public z(Context context) {
        this.f9186a = context;
        this.f9188c = b.f8983c;
    }

    public z(Context context, qd.u uVar, q3.e0 e0Var) {
        int i10 = com.google.android.gms.internal.play_billing.t.C;
        this.f9192g = com.google.android.gms.internal.play_billing.b0.J;
        this.f9186a = context;
        this.f9188c = uVar;
        this.f9189d = e0Var;
        this.f9190e = new u0(this, true);
        this.f9191f = new u0(this, false);
    }

    public z(AssetManager assetManager, Executor executor, z9.b bVar, String str, File file) {
        this.f9187b = false;
        this.f9186a = executor;
        this.f9188c = bVar;
        this.f9190e = str;
        this.f9189d = file;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((z9.b) this.f9188c).h();
            return null;
        }
    }

    public void b(int i10, IOException iOException) {
        ((Executor) this.f9186a).execute(new d.l(this, i10, iOException, 6));
    }
}
