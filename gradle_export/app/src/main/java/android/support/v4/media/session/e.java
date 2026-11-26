package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import ba.n1;
import ba.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k9.y0;
import k9.z0;
import k9.z3;
import l9.d0;
import l9.f0;
import l9.j0;
import l9.y;
import ta.c0;

public final class e extends MediaController.Callback {

    public final int f490a = 0;

    public final WeakReference f491b;

    public e(androidx.mediarouter.app.s sVar) {
        this.f491b = new WeakReference(sVar);
    }

    public e(y0 y0Var) {
        this.f491b = new WeakReference(y0Var);
    }

    @Override
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        int i10 = this.f490a;
        WeakReference weakReference = this.f491b;
        switch (i10) {
            case 0:
                if (((androidx.mediarouter.app.s) weakReference.get()) != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
                break;
            default:
                y0 y0Var = (y0) weakReference.get();
                if (y0Var != null && playbackInfo != null) {
                    int playbackType = playbackInfo.getPlaybackType();
                    String volumeControlId = playbackInfo.getVolumeControlId();
                    boolean z10 = true;
                    if (playbackType == 1 && volumeControlId != null) {
                        z10 = false;
                    }
                    c0.s(z10);
                    AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
                    androidx.media3.common.d dVar = androidx.media3.common.d.f1142i;
                    n1 n1Var = new n1(playbackType, new androidx.media3.common.d(audioAttributes.getContentType(), audioAttributes.getFlags(), audioAttributes.getUsage(), audioAttributes.getAllowedCapturePolicy(), audioAttributes.getSpatializationBehavior(), audioAttributes.isContentSpatialized(), audioAttributes.areHapticChannelsMuted()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId);
                    z0 z0Var = y0Var.f9550e;
                    v0 v0Var = z0Var.f9568n;
                    z0Var.f9568n = new v0(n1Var, (j0) v0Var.f2441e, (y) v0Var.f2442f, (List) v0Var.f2437a, (CharSequence) v0Var.f2443g, v0Var.f2438b, v0Var.f2439c, (Bundle) v0Var.f2444h);
                    y0Var.e();
                    break;
                }
                break;
        }
    }

    @Override
    public final void onExtrasChanged(Bundle bundle) {
        switch (this.f490a) {
            case 0:
                t.a(bundle);
                break;
            default:
                f0.h(bundle);
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null) {
                    z0 z0Var = y0Var.f9550e;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Bundle bundle2 = bundle;
                    v0 v0Var = z0Var.f9568n;
                    z0Var.f9568n = new v0((n1) v0Var.f2440d, (j0) v0Var.f2441e, (y) v0Var.f2442f, (List) v0Var.f2437a, (CharSequence) v0Var.f2443g, v0Var.f2438b, v0Var.f2439c, bundle2);
                    z0Var.f9569o = true;
                    y0Var.e();
                }
                break;
        }
    }

    @Override
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        int i10 = this.f490a;
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = null;
        y yVarCreateFromParcel = null;
        WeakReference weakReference = this.f491b;
        switch (i10) {
            case 0:
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar != null) {
                    u.e eVar = MediaMetadataCompat.D;
                    if (mediaMetadata != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(parcelObtain, 0);
                        parcelObtain.setDataPosition(0);
                        mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        mediaMetadataCompatCreateFromParcel.B = mediaMetadata;
                    }
                    sVar.a(mediaMetadataCompatCreateFromParcel);
                }
                break;
            default:
                y0 y0Var = (y0) weakReference.get();
                if (y0Var != null) {
                    u.e eVar2 = y.D;
                    if (mediaMetadata != null) {
                        Parcel parcelObtain2 = Parcel.obtain();
                        mediaMetadata.writeToParcel(parcelObtain2, 0);
                        parcelObtain2.setDataPosition(0);
                        yVarCreateFromParcel = y.CREATOR.createFromParcel(parcelObtain2);
                        parcelObtain2.recycle();
                        yVarCreateFromParcel.B = mediaMetadata;
                    }
                    z0 z0Var = y0Var.f9550e;
                    v0 v0Var = z0Var.f9568n;
                    z0Var.f9568n = new v0((n1) v0Var.f2440d, (j0) v0Var.f2441e, yVarCreateFromParcel, (List) v0Var.f2437a, (CharSequence) v0Var.f2443g, v0Var.f2438b, v0Var.f2439c, (Bundle) v0Var.f2444h);
                    y0Var.e();
                }
                break;
        }
    }

    @Override
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        switch (this.f490a) {
            case 0:
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.f491b.get();
                if (sVar != null && sVar.f1805c == null) {
                    sVar.b(PlaybackStateCompat.a(playbackState));
                    break;
                }
                break;
            default:
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null && y0Var.f9548c == null) {
                    y0Var.b(j0.a(playbackState));
                    break;
                }
                break;
        }
    }

    @Override
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        switch (this.f490a) {
            case 0:
                if (((androidx.mediarouter.app.s) this.f491b.get()) != null && list != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object obj : list) {
                        if (obj != null) {
                            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                            mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(r.b(queueItem)), r.c(queueItem));
                        } else {
                            mediaSessionCompat$QueueItem = null;
                        }
                        arrayList.add(mediaSessionCompat$QueueItem);
                    }
                    break;
                }
                break;
            default:
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null) {
                    ArrayList arrayListA = d0.a(list);
                    z0 z0Var = y0Var.f9550e;
                    v0 v0Var = z0Var.f9568n;
                    z0Var.f9568n = new v0((n1) v0Var.f2440d, (j0) v0Var.f2441e, (y) v0Var.f2442f, z0.g(arrayListA), (CharSequence) v0Var.f2443g, v0Var.f2438b, v0Var.f2439c, (Bundle) v0Var.f2444h);
                    y0Var.e();
                }
                break;
        }
    }

    @Override
    public final void onQueueTitleChanged(CharSequence charSequence) {
        switch (this.f490a) {
            case 0:
                break;
            default:
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null) {
                    z0 z0Var = y0Var.f9550e;
                    v0 v0Var = z0Var.f9568n;
                    z0Var.f9568n = new v0((n1) v0Var.f2440d, (j0) v0Var.f2441e, (y) v0Var.f2442f, (List) v0Var.f2437a, charSequence, v0Var.f2438b, v0Var.f2439c, (Bundle) v0Var.f2444h);
                    y0Var.e();
                }
                break;
        }
    }

    @Override
    public final void onSessionDestroyed() {
        switch (this.f490a) {
            case 0:
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.f491b.get();
                if (sVar != null) {
                    sVar.d();
                }
                break;
            default:
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null) {
                    y0Var.f9550e.f9558b.release();
                }
                break;
        }
    }

    @Override
    public final void onSessionEvent(String str, Bundle bundle) {
        switch (this.f490a) {
            case 0:
                t.a(bundle);
                break;
            default:
                f0.h(bundle);
                y0 y0Var = (y0) this.f491b.get();
                if (y0Var != null) {
                    z0 z0Var = y0Var.f9550e;
                    if (str != null) {
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        k9.u uVar = z0Var.f9558b;
                        uVar.getClass();
                        c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                        uVar.f9522e.d(new z3(str, bundle));
                        break;
                    }
                }
                break;
        }
    }
}
