package l9;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import k9.f2;
import k9.x0;

public final class f {

    public final Context f10138a;

    public final MediaBrowser f10139b;

    public final Bundle f10140c;

    public final f2 f10141d = new f2(this);

    public final u.e f10142e = new u.e(0);

    public h7.b f10143f;

    public Messenger f10144g;

    public e0 f10145h;

    public f(Context context, ComponentName componentName, x0 x0Var, Bundle bundle) {
        this.f10138a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f10140c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        x0Var.C = this;
        e eVar = (e) x0Var.B;
        eVar.getClass();
        this.f10139b = new MediaBrowser(context, componentName, eVar, bundle2);
    }
}
