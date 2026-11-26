package l9;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

public final class c0 {

    public final MediaSession f10126a;

    public final b0 f10127b;

    public final e0 f10128c;

    public final Bundle f10130e;

    public j0 f10132g;

    public List f10133h;

    public y f10134i;

    public int f10135j;

    public int f10136k;
    public n l;

    public final Object f10129d = new Object();

    public final RemoteCallbackList f10131f = new RemoteCallbackList();

    public c0(Context context, String str, Bundle bundle) {
        MediaSession mediaSession = new MediaSession(context, str, bundle);
        this.f10126a = mediaSession;
        b0 b0Var = new b0(this);
        this.f10127b = b0Var;
        this.f10128c = new e0(mediaSession.getSessionToken(), b0Var);
        this.f10130e = bundle;
        mediaSession.setFlags(3);
    }

    public final g0 a() {
        return new g0(this.f10126a.getCurrentControllerInfo());
    }

    public final void b(g0 g0Var) {
    }
}
