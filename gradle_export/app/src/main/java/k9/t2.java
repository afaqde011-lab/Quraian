package k9;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.cast.MediaStatus;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class t2 extends l9.n {

    public final oj.q f9462e;

    public final s1 f9463f;

    public final l9.h f9464g;

    public final bb.d f9465h;

    public final androidx.mediarouter.app.d f9466i;

    public final l9.f0 f9467j;

    public final androidx.mediarouter.app.g f9468k;
    public final ComponentName l;
    public q2 m;

    public final boolean f9469n = true;

    public volatile long f9470o;

    public bb.d f9471p;

    public int f9472q;

    public c3.x1 f9473r;

    public final Bundle f9474s;

    public fh.t0 f9475t;

    public fh.t0 f9476u;

    public a4 f9477v;

    public androidx.media3.common.b1 f9478w;

    public t2(s1 s1Var, Uri uri, Handler handler, Bundle bundle, fh.t0 t0Var, fh.t0 t0Var2, a4 a4Var, androidx.media3.common.b1 b1Var, Bundle bundle2) {
        ComponentName componentName;
        ComponentName componentNameJ;
        Intent intent;
        l9.f0 f0Var;
        PendingIntent pendingIntent;
        this.f9463f = s1Var;
        boolean z10 = true;
        this.f9475t = t0Var;
        this.f9476u = t0Var2;
        this.f9477v = a4Var;
        this.f9478w = b1Var;
        this.f9474s = new Bundle(bundle2);
        AudioPlayerService audioPlayerService = s1Var.f9418f;
        this.f9464g = l9.h.a(audioPlayerService);
        this.f9465h = new bb.d(this);
        oj.q qVar = new oj.q(s1Var);
        this.f9462e = qVar;
        this.f9470o = 300000L;
        this.f9466i = new androidx.mediarouter.app.d(s1Var.l.getLooper(), qVar);
        if (!t0Var2.isEmpty()) {
            O();
        }
        PackageManager packageManager = audioPlayerService.getPackageManager();
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(audioPlayerService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
            }
            componentName = null;
        }
        this.l = componentName;
        if (componentName == null) {
            componentNameJ = J(audioPlayerService, "androidx.media3.session.MediaLibraryService");
            componentNameJ = componentNameJ == null ? J(audioPlayerService, "androidx.media3.session.MediaSessionService") : componentNameJ;
            if (componentNameJ == null || componentNameJ.equals(componentName)) {
            }
            intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
            if (componentNameJ == null) {
                androidx.mediarouter.app.g gVar = new androidx.mediarouter.app.g(this, 7);
                this.f9468k = gVar;
                IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                String scheme = uri.getScheme();
                String str = e7.i0.f5136a;
                intentFilter.addDataScheme(scheme);
                audioPlayerService.registerReceiver(gVar, intentFilter, 4);
                intent.setPackage(audioPlayerService.getPackageName());
                PendingIntent.getBroadcast(audioPlayerService, 0, intent, 33554432);
                new ComponentName((Context) audioPlayerService, (Class<?>) AudioPlayerService.class);
            } else {
                intent.setComponent(componentNameJ);
                if (z10) {
                    PendingIntent.getForegroundService(audioPlayerService, 0, intent, 33554432);
                } else {
                    PendingIntent.getBroadcast(audioPlayerService, 0, intent, 33554432);
                }
                this.f9468k = null;
            }
            f0Var = new l9.f0(audioPlayerService, TextUtils.join(".", new String[]{"androidx.media3.session.id", s1Var.f9421i}), bundle);
            this.f9467j = f0Var;
            if (componentName != null) {
                try {
                    MediaSession mediaSession = ((l9.c0) f0Var.B).f10126a;
                    mediaSession.getClass();
                    mediaSession.setMediaButtonBroadcastReceiver(componentName);
                } catch (IllegalArgumentException e3) {
                    if (!Build.MANUFACTURER.equals("motorola")) {
                        throw e3;
                    }
                    e7.a.e("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e3);
                }
            }
            pendingIntent = s1Var.f9431u;
            if (pendingIntent != null) {
                ((l9.c0) this.f9467j.B).f10126a.setSessionActivity(pendingIntent);
            }
            this.f9467j.r(this, handler);
        }
        componentNameJ = componentName;
        z10 = false;
        intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameJ == null) {
            androidx.mediarouter.app.g gVar2 = new androidx.mediarouter.app.g(this, 7);
            this.f9468k = gVar2;
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme2 = uri.getScheme();
            String str2 = e7.i0.f5136a;
            intentFilter2.addDataScheme(scheme2);
            audioPlayerService.registerReceiver(gVar2, intentFilter2, 4);
            intent.setPackage(audioPlayerService.getPackageName());
            PendingIntent.getBroadcast(audioPlayerService, 0, intent, 33554432);
            new ComponentName((Context) audioPlayerService, (Class<?>) AudioPlayerService.class);
        } else {
            intent.setComponent(componentNameJ);
            if (z10) {
                PendingIntent.getForegroundService(audioPlayerService, 0, intent, 33554432);
            } else {
                PendingIntent.getBroadcast(audioPlayerService, 0, intent, 33554432);
            }
            this.f9468k = null;
        }
        f0Var = new l9.f0(audioPlayerService, TextUtils.join(".", new String[]{"androidx.media3.session.id", s1Var.f9421i}), bundle);
        this.f9467j = f0Var;
        if (componentName != null) {
            MediaSession mediaSession2 = ((l9.c0) f0Var.B).f10126a;
            mediaSession2.getClass();
            mediaSession2.setMediaButtonBroadcastReceiver(componentName);
        }
        pendingIntent = s1Var.f9431u;
        if (pendingIntent != null) {
            ((l9.c0) this.f9467j.B).f10126a.setSessionActivity(pendingIntent);
        }
        this.f9467j.r(this, handler);
    }

    public static void D(l9.f0 f0Var, ArrayList arrayList) {
        if (arrayList != null) {
            f0Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j9 = ((l9.d0) it.next()).B;
                if (hashSet.contains(Long.valueOf(j9))) {
                    e7.a.e("MediaSessionCompat", w.c.i(j9, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j9));
            }
        }
        l9.c0 c0Var = (l9.c0) f0Var.B;
        MediaSession mediaSession = c0Var.f10126a;
        c0Var.f10133h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l9.d0 d0Var = (l9.d0) it2.next();
            MediaSession.QueueItem queueItem = d0Var.C;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(d0Var.A.b(), d0Var.B);
                d0Var.C = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(l9.f0 f0Var, l9.y yVar) {
        l9.c0 c0Var = (l9.c0) f0Var.B;
        c0Var.f10134i = yVar;
        MediaSession mediaSession = c0Var.f10126a;
        Bundle bundle = yVar.A;
        if (yVar.B == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) l9.y.D.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            yVar.B = builder.build();
        }
        mediaSession.setMetadata(yVar.B);
    }

    public static androidx.media3.common.q0 F(String str, Uri uri, String str2, Bundle bundle) {
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var2 = fh.d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        String str3 = str;
        a1.i iVar = new a1.i(2, false);
        iVar.B = uri;
        iVar.C = str2;
        iVar.D = bundle;
        return new androidx.media3.common.q0(str3, new androidx.media3.common.g0(e0Var), null, new androidx.media3.common.k0(j0Var), androidx.media3.common.t0.K, new androidx.media3.common.m0(iVar));
    }

    public static ComponentName J(AudioPlayerService audioPlayerService, String str) {
        PackageManager packageManager = audioPlayerService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(audioPlayerService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override
    public final void A() {
        boolean zIsCommandAvailable = this.f9463f.f9430t.isCommandAvailable(7);
        l9.f0 f0Var = this.f9467j;
        if (zIsCommandAvailable) {
            H(7, new j2(this, 2), ((l9.c0) f0Var.B).a(), true);
        } else {
            H(6, new j2(this, 3), ((l9.c0) f0Var.B).a(), true);
        }
    }

    @Override
    public final void B(long j9) {
        if (j9 < 0) {
            return;
        }
        H(10, new k2(this, j9, 0), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void C() {
        H(3, new j2(this, 7), ((l9.c0) this.f9467j.B).a(), true);
    }

    public final l9.j0 G(v3 v3Var) {
        long j9;
        String str;
        int i10;
        int iG;
        String message;
        Bundle bundle;
        int i11;
        long j10;
        c3.x1 x1Var = this.f9473r;
        Bundle bundle2 = this.f9474s;
        if (x1Var != null && x1Var.f2769b) {
            new Bundle((Bundle) x1Var.f2772e).putAll(bundle2);
            ArrayList arrayList = new ArrayList();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i12 = x1Var.f2770c;
            String str2 = (String) x1Var.f2771d;
            str2.getClass();
            return new l9.j0(7, -1L, 0L, 0.0f, 0L, i12, str2, jElapsedRealtime, arrayList, -1L, (Bundle) x1Var.f2772e);
        }
        PlaybackException playerError = v3Var.getPlayerError();
        int i13 = 1;
        boolean z10 = v3Var.isCommandAvailable(16) && !v3Var.isCurrentMediaItemLive();
        boolean z11 = playerError != null || e7.i0.S(v3Var, this.f9469n);
        int i14 = 7;
        if (playerError == null) {
            fh.e1 e1Var = p.f9381a;
            if (v3Var.getPlayerError() == null) {
                int playbackState = v3Var.getPlaybackState();
                if (playbackState == 1) {
                    i14 = 0;
                } else if (playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState != 4) {
                            throw new IllegalArgumentException(g4.c.f(playbackState, "Unrecognized State: "));
                        }
                        i14 = 1;
                    } else if (z11) {
                        i14 = 2;
                    } else {
                        i14 = 3;
                    }
                } else if (z11) {
                    i14 = 2;
                } else {
                    i14 = 6;
                }
            }
        }
        int i15 = i14;
        androidx.media3.common.b1 b1VarD = q3.d(this.f9478w, v3Var.getAvailableCommands());
        long j11 = 128;
        int i16 = 0;
        while (i16 < b1VarD.f1103a.f1465a.size()) {
            int iB = b1VarD.f1103a.b(i16);
            if (iB == i13) {
                j10 = z11 ? 516L : 514L;
            } else if (iB == 2) {
                j10 = MediaStatus.COMMAND_LIKE;
            } else if (iB == 3) {
                j10 = 1;
            } else if (iB != 31) {
                switch (iB) {
                    case 5:
                        j10 = 256;
                        break;
                    case 6:
                    case 7:
                        j10 = 16;
                        break;
                    case 8:
                    case 9:
                        j10 = 32;
                        break;
                    case 10:
                        j10 = MediaStatus.COMMAND_EDIT_TRACKS;
                        break;
                    case 11:
                        j10 = 8;
                        break;
                    case 12:
                        j10 = 64;
                        break;
                    case 13:
                        j10 = 4194304;
                        break;
                    case 14:
                        j10 = 2621440;
                        break;
                    case 15:
                        j10 = MediaStatus.COMMAND_STREAM_TRANSFER;
                        break;
                    default:
                        j10 = 0;
                        break;
                }
            } else {
                j10 = 240640;
            }
            j11 |= j10;
            i16++;
            i13 = 1;
        }
        if (!this.f9476u.isEmpty() && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            j11 &= -17;
        }
        if (!this.f9476u.isEmpty() && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            j11 &= -33;
        }
        if (!z10) {
            j11 &= -257;
        }
        long j12 = j11;
        if (v3Var.isCommandAvailable(17)) {
            int currentMediaItemIndex = v3Var.getCurrentMediaItemIndex();
            fh.e1 e1Var2 = p.f9381a;
            j9 = currentMediaItemIndex == -1 ? -1L : currentMediaItemIndex;
        } else {
            j9 = -1;
        }
        float f3 = v3Var.getPlaybackParameters().f1688a;
        float f10 = (v3Var.isPlaying() && z10) ? f3 : 0.0f;
        Bundle bundle3 = playerError != null ? new Bundle(playerError.C) : new Bundle();
        if (playerError == null && x1Var != null) {
            bundle3.putAll((Bundle) x1Var.f2772e);
        }
        bundle3.putAll(bundle2);
        bundle3.putFloat("EXO_SPEED", f3);
        androidx.media3.common.q0 q0VarC = v3Var.c();
        if (q0VarC != null) {
            String str3 = q0VarC.f1413a;
            if (!RuntimeVersion.SUFFIX.equals(str3)) {
                bundle3.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str3);
            }
        }
        long currentPosition = z10 ? v3Var.getCurrentPosition() : -1L;
        long bufferedPosition = z10 ? v3Var.getBufferedPosition() : -1L;
        ArrayList arrayList2 = new ArrayList();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        int i17 = 0;
        while (i17 < this.f9475t.size()) {
            b bVar = (b) this.f9475t.get(i17);
            z3 z3Var = bVar.f9222a;
            Uri uri = bVar.f9226e;
            int i18 = bVar.f9224c;
            int i19 = i17;
            Bundle bundle4 = bVar.f9228g;
            long j13 = bufferedPosition;
            if (z3Var != null) {
                Bundle bundle5 = z3Var.f9580c;
                String str4 = z3Var.f9579b;
                bundle = bundle3;
                if (bVar.f9230i && z3Var.f9578a == 0) {
                    a4 a4Var = this.f9477v;
                    if ((z3Var != null && a4Var.f9213a.contains(z3Var)) || (((i11 = bVar.f9223b) != -1 && b1VarD.a(i11)) || b.n(str4))) {
                        boolean z12 = i18 != 0;
                        boolean z13 = uri != null;
                        if (z12 || z13 || !bundle4.isEmpty()) {
                            bundle5 = new Bundle(bundle5);
                        }
                        if (!bundle4.isEmpty()) {
                            bundle5.putAll(bundle4);
                        }
                        if (z12) {
                            bundle5.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i18);
                        }
                        if (z13) {
                            uri.getClass();
                            bundle5.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", uri.toString());
                        }
                        CharSequence charSequence = bVar.f9227f;
                        int i20 = bVar.f9225d;
                        if (TextUtils.isEmpty(str4)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i20 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        arrayList2.add(new l9.i0(str4, charSequence, i20, bundle5));
                    }
                }
            } else {
                bundle = bundle3;
            }
            i17 = i19 + 1;
            bundle3 = bundle;
            bufferedPosition = j13;
        }
        long j14 = bufferedPosition;
        Bundle bundle6 = bundle3;
        if (playerError == null) {
            if (x1Var != null) {
                iG = x1Var.f2770c;
                message = (String) x1Var.f2771d;
            } else {
                str = null;
                i10 = 0;
            }
            return new l9.j0(i15, currentPosition, j14, f10, j12, i10, str, jElapsedRealtime2, arrayList2, j9, bundle6);
        }
        fh.e1 e1Var3 = p.f9381a;
        iG = p.g(playerError.A);
        message = playerError.getMessage();
        str = message;
        i10 = iG;
        return new l9.j0(i15, currentPosition, j14, f10, j12, i10, str, jElapsedRealtime2, arrayList2, j9, bundle6);
    }

    public final void H(final int i10, final s2 s2Var, final l9.g0 g0Var, final boolean z10) {
        s1 s1Var = this.f9463f;
        if (s1Var.o()) {
            return;
        }
        if (g0Var != null) {
            e7.i0.M(s1Var.l, new Runnable() {
                @Override
                public final void run() {
                    s2 s2Var2 = s2Var;
                    t2 t2Var = this.A;
                    s1 s1Var2 = t2Var.f9463f;
                    if (s1Var2.o()) {
                        return;
                    }
                    boolean zIsActive = ((l9.c0) t2Var.f9467j.B).f10126a.isActive();
                    int i11 = i10;
                    l9.g0 g0Var2 = g0Var;
                    if (!zIsActive) {
                        StringBuilder sbQ = oi.k.q("Ignore incoming player command before initialization. command=", i11, ", pid=");
                        sbQ.append(g0Var2.f10146a.f10151b);
                        e7.a.m("MediaSessionLegacyStub", sbQ.toString());
                        return;
                    }
                    a2 a2VarN = t2Var.N(g0Var2);
                    if (!t2Var.f9462e.N(a2VarN, i11)) {
                        if (i11 != 1 || s1Var2.f9430t.getPlayWhenReady()) {
                            return;
                        }
                        e7.a.m("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    nv.p pVar = s1Var2.f9417e;
                    s1Var2.F(a2VarN);
                    pVar.getClass();
                    try {
                        s2Var2.a(a2VarN);
                    } catch (RemoteException e3) {
                        e7.a.n("MediaSessionLegacyStub", "Exception in " + a2VarN, e3);
                    }
                    if (z10) {
                        new SparseBooleanArray().append(i11, true);
                        s1Var2.y(a2VarN);
                    }
                }
            });
            return;
        }
        e7.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    public final void I(z3 z3Var, int i10, s2 s2Var, l9.g0 g0Var) {
        if (g0Var != null) {
            e7.i0.M(this.f9463f.l, new i7.w0(this, z3Var, i10, g0Var, s2Var));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = z3Var;
        if (z3Var == null) {
            objValueOf = Integer.valueOf(i10);
        }
        sb2.append(objValueOf);
        e7.a.b("MediaSessionLegacyStub", sb2.toString());
    }

    public final void K(androidx.media3.common.q0 q0Var, boolean z10, boolean z11) {
        H(31, new d2(this, q0Var, z10, z11), ((l9.c0) this.f9467j.B).a(), false);
    }

    public final void L(a4 a4Var, androidx.media3.common.b1 b1Var) {
        boolean z10 = this.f9478w.a(17) != b1Var.a(17);
        this.f9477v = a4Var;
        this.f9478w = b1Var;
        if (!this.f9476u.isEmpty()) {
            Bundle bundle = this.f9474s;
            boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
            boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
            O();
            if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z11 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z12) {
                ((l9.c0) this.f9467j.B).f10126a.setExtras(bundle);
            }
        }
        s1 s1Var = this.f9463f;
        if (z10) {
            e7.i0.M(s1Var.l, new l2(this, s1Var.f9430t, 0));
        } else {
            P(s1Var.f9430t);
        }
    }

    public final void M(fh.t0 t0Var) {
        this.f9476u = t0Var;
        Bundle bundle = this.f9474s;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        O();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((l9.c0) this.f9467j.B).f10126a.setExtras(bundle);
    }

    public final a2 N(l9.g0 g0Var) {
        a2 a2VarE = this.f9462e.E(g0Var);
        if (a2VarE == null) {
            a2 a2Var = new a2(g0Var, 0, 0, this.f9464g.b(g0Var), new r2(g0Var), Bundle.EMPTY);
            y1 y1VarS = this.f9463f.s(a2Var);
            this.f9462e.q(g0Var, a2Var, y1VarS.f9553a, y1VarS.f9554b);
            this.f9463f.z(a2Var);
            a2VarE = a2Var;
        }
        androidx.mediarouter.app.d dVar = this.f9466i;
        long j9 = this.f9470o;
        dVar.removeMessages(1001, a2VarE);
        dVar.sendMessageDelayed(dVar.obtainMessage(1001, a2VarE), j9);
        return a2VarE;
    }

    public final void O() {
        fh.d2 d2VarJ = b.j(b.g(this.f9476u, this.f9477v, this.f9478w), true, true);
        this.f9475t = d2VarJ;
        boolean z10 = !b.c(2, d2VarJ);
        Bundle bundle = this.f9474s;
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", z10);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !b.c(3, this.f9475t));
    }

    public final void P(v3 v3Var) {
        e7.i0.M(this.f9463f.l, new l2(this, v3Var, 1));
    }

    @Override
    public final void c(l9.x xVar) {
        if (xVar != null) {
            H(20, new androidx.media3.cast.a(this, xVar, -1), ((l9.c0) this.f9467j.B).a(), false);
        }
    }

    @Override
    public final void d(l9.x xVar, int i10) {
        if (xVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new androidx.media3.cast.a(this, xVar, i10), ((l9.c0) this.f9467j.B).a(), false);
            }
        }
    }

    @Override
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.f9463f.f9422j.b());
        } else {
            z3 z3Var = new z3(str, Bundle.EMPTY);
            I(z3Var, 0, new f1(this, z3Var, bundle, resultReceiver), ((l9.c0) this.f9467j.B).a());
        }
    }

    @Override
    public final void f(String str, Bundle bundle) {
        boolean zBooleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        z3 z3Var = new z3(str, bundle);
        boolean zN = b.n(str);
        l9.f0 f0Var = this.f9467j;
        if (!zN) {
            I(z3Var, 0, new ce.a(this, z3Var, bundle, 5), ((l9.c0) f0Var.B).a());
            return;
        }
        try {
            b bVarD = b.d(z3Var);
            int i10 = bVarD.f9223b;
            Object obj = bVarD.f9231j;
            if (!bVarD.b()) {
                e7.a.m("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            z3 z3Var2 = bVarD.f9222a;
            if (z3Var2 != null) {
                ta.c0.A(z3Var2.f9578a == 40010);
                obj.getClass();
                I(null, 40010, new j2(this, (androidx.media3.common.g1) obj), ((l9.c0) f0Var.B).a());
                return;
            }
            v3 v3Var = this.f9463f.f9430t;
            if (i10 != 1) {
                zBooleanValue = false;
            } else if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (v3Var.getPlayWhenReady()) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                H(1, new j2(this, 5), ((l9.c0) f0Var.B).a(), false);
            } else if (i10 != 31) {
                H(i10, new ak.a(this, bVarD, 16), ((l9.c0) f0Var.B).a(), true);
            } else {
                obj.getClass();
                K((androidx.media3.common.q0) obj, false, false);
            }
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + z3Var.f9579b, e3);
        }
    }

    @Override
    public final void g() {
        H(12, new j2(this, 0), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final boolean h(Intent intent) {
        return this.f9463f.w(new a2(((l9.c0) this.f9467j.B).a(), 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override
    public final void i() {
        H(1, new j2(this, 11), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void j() {
        H(1, new j2(this, 5), ((l9.c0) this.f9467j.B).a(), false);
    }

    @Override
    public final void k(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, true);
    }

    @Override
    public final void l(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, true);
    }

    @Override
    public final void m(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, true);
    }

    @Override
    public final void n() {
        H(2, new j2(this, 6), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void o(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, false);
    }

    @Override
    public final void p(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, false);
    }

    @Override
    public final void q(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, false);
    }

    @Override
    public final void r(l9.x xVar) {
        if (xVar == null) {
            return;
        }
        H(20, new ak.a(this, xVar, 15), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void s() {
        H(11, new j2(this, 4), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void t(long j9) {
        H(5, new k2(this, j9, 1), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void u(float f3) {
        if (f3 <= 0.0f) {
            return;
        }
        H(13, new h0(this, f3, 3), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void v(l9.k0 k0Var) {
        w(k0Var);
    }

    @Override
    public final void w(l9.k0 k0Var) {
        androidx.media3.common.g1 g1VarQ = p.q(k0Var);
        if (g1VarQ != null) {
            I(null, 40010, new j2(this, g1VarQ), ((l9.c0) this.f9467j.B).a());
            return;
        }
        e7.a.m("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + k0Var);
    }

    @Override
    public final void x(int i10) {
        H(15, new m2(this, i10, 0), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void y(int i10) {
        H(14, new m2(this, i10, 1), ((l9.c0) this.f9467j.B).a(), true);
    }

    @Override
    public final void z() {
        boolean zIsCommandAvailable = this.f9463f.f9430t.isCommandAvailable(9);
        l9.f0 f0Var = this.f9467j;
        if (zIsCommandAvailable) {
            H(9, new j2(this, 9), ((l9.c0) f0Var.B).a(), true);
        } else {
            H(8, new j2(this, 10), ((l9.c0) f0Var.B).a(), true);
        }
    }
}
