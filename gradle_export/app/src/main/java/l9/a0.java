package l9;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.List;

public final class a0 extends MediaSession.Callback {

    public final n f10122a;

    public a0(n nVar) {
        this.f10122a = nVar;
    }

    public final c0 a() {
        c0 c0Var;
        n nVar;
        synchronized (this.f10122a.f10171a) {
            c0Var = (c0) ((WeakReference) this.f10122a.f10173c).get();
        }
        if (c0Var == null) {
            return null;
        }
        n nVar2 = this.f10122a;
        synchronized (c0Var.f10129d) {
            nVar = c0Var.l;
        }
        if (nVar2 == nVar) {
            return c0Var;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        va.d dVar;
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    e0 e0Var = c0VarA.f10128c;
                    d dVarA = e0Var.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", dVarA == null ? null : dVarA.asBinder());
                    synchronized (e0Var.A) {
                        dVar = e0Var.D;
                    }
                    va.a.Y(bundle2, dVar);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f10122a.c((x) a.a.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), x.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f10122a.d((x) a.a.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), x.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f10122a.r((x) a.a.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), x.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = c0VarA.f10133h;
                if (list != null && bundle != null) {
                    int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    d0 d0Var = (i10 < 0 || i10 >= list.size()) ? null : (d0) list.get(i10);
                    if (d0Var != null) {
                        this.f10122a.r(d0Var.A);
                    }
                }
            } else {
                this.f10122a.e(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            e7.a.d("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        c0VarA.b(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            n nVar = this.f10122a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    f0.h(bundle2);
                    nVar.m(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                nVar.n();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    f0.h(bundle3);
                    nVar.o(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    f0.h(bundle4);
                    nVar.p(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    f0.h(bundle5);
                    nVar.q(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    nVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    nVar.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    k0 k0Var = (k0) a.a.p(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), k0.CREATOR);
                    f0.h(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    nVar.w(k0Var);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                nVar.f(str, bundle);
            } else if (bundle != null) {
                nVar.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            e7.a.d("MediaSessionCompat", "Could not unparcel the data.");
        }
        c0VarA.b(null);
    }

    @Override
    public final void onFastForward() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.g();
        c0VarA.b(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return false;
        }
        boolean zH = this.f10122a.h(intent);
        c0VarA.b(null);
        return zH || super.onMediaButtonEvent(intent);
    }

    @Override
    public final void onPause() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.i();
        c0VarA.b(null);
    }

    @Override
    public final void onPlay() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.j();
        c0VarA.b(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.k(str, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.l(str, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.m(uri, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onPrepare() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.n();
        c0VarA.b(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.o(str, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.p(str, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        f0.h(bundle);
        this.f10122a.q(uri, bundle);
        c0VarA.b(null);
    }

    @Override
    public final void onRewind() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.s();
        c0VarA.b(null);
    }

    @Override
    public final void onSeekTo(long j9) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.t(j9);
        c0VarA.b(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f3) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.u(f3);
        c0VarA.b(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.v(k0.a(rating));
        c0VarA.b(null);
    }

    @Override
    public final void onSkipToNext() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.z();
        c0VarA.b(null);
    }

    @Override
    public final void onSkipToPrevious() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.A();
        c0VarA.b(null);
    }

    @Override
    public final void onSkipToQueueItem(long j9) {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.B(j9);
        c0VarA.b(null);
    }

    @Override
    public final void onStop() {
        c0 c0VarA = a();
        if (c0VarA == null) {
            return;
        }
        this.f10122a.C();
        c0VarA.b(null);
    }
}
