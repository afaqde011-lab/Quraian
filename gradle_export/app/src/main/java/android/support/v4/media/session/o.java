package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends Binder implements d {

    public static final int f503f = 0;

    public final AtomicReference f504e;

    public o(q qVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f504e = new AtomicReference(qVar);
    }

    @Override
    public final void A1() {
        throw new AssertionError();
    }

    @Override
    public final PendingIntent D() {
        throw new AssertionError();
    }

    @Override
    public final long D1() {
        throw new AssertionError();
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H1(long j9) {
        throw new AssertionError();
    }

    @Override
    public final void I(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final ParcelableVolumeInfo J1() {
        throw new AssertionError();
    }

    @Override
    public final void P1(int i10) {
        throw new AssertionError();
    }

    @Override
    public final void Q(int i10, int i11) {
        throw new AssertionError();
    }

    @Override
    public final boolean Q0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override
    public final CharSequence X() {
        throw new AssertionError();
    }

    @Override
    public final void a1(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final MediaMetadataCompat c() {
        throw new AssertionError();
    }

    @Override
    public final void c0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final Bundle d0() {
        ((p) this.f504e.get()).getClass();
        return null;
    }

    @Override
    public final void d1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override
    public final void e0(b bVar) {
        p pVar = (p) this.f504e.get();
        if (pVar == null) {
            return;
        }
        pVar.f509e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (pVar.f508d) {
        }
    }

    @Override
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override
    public final PlaybackStateCompat getPlaybackState() {
        long j9;
        p pVar = (p) this.f504e.get();
        if (pVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = pVar.f510f;
        MediaMetadataCompat mediaMetadataCompat = pVar.f511g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f3 = playbackStateCompat.D;
        long j10 = playbackStateCompat.H;
        int i10 = playbackStateCompat.A;
        long j11 = playbackStateCompat.B;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i10 != 3 && i10 != 4 && i10 != 5) || j10 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = ((long) (f3 * (jElapsedRealtime - j10))) + j11;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.A;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j12 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j12 < 0 || j13 <= j12) {
            j9 = j13 < 0 ? 0L : j13;
        } else {
            j9 = j12;
        }
        ArrayList arrayList = new ArrayList();
        long j14 = playbackStateCompat.C;
        long j15 = playbackStateCompat.E;
        int i11 = playbackStateCompat.F;
        CharSequence charSequence = playbackStateCompat.G;
        ArrayList arrayList2 = playbackStateCompat.I;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.A, j9, j14, playbackStateCompat.D, j15, i11, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.J, playbackStateCompat.K);
    }

    @Override
    public final int getRepeatMode() {
        return ((p) this.f504e.get()) != null ? 0 : -1;
    }

    @Override
    public final String getTag() {
        throw new AssertionError();
    }

    @Override
    public final int h() {
        return ((p) this.f504e.get()) != null ? 0 : -1;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i1(boolean z10) {
        throw new AssertionError();
    }

    @Override
    public final String j() {
        throw new AssertionError();
    }

    @Override
    public final void k0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void next() {
        throw new AssertionError();
    }

    @Override
    public final void o(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void o0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i10) {
            case 1:
                x1(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) va.a.f(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zQ0 = Q0((KeyEvent) va.a.f(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zQ0 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f488e = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                s(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f488e = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
                    }
                }
                e0(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zY = y();
                parcel2.writeNoException();
                parcel2.writeInt(zY ? 1 : 0);
                return true;
            case 6:
                String strJ = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent pendingIntentD = D();
                parcel2.writeNoException();
                va.a.o0(parcel2, pendingIntentD);
                return true;
            case 9:
                long jD1 = D1();
                parcel2.writeNoException();
                parcel2.writeLong(jD1);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoJ1 = J1();
                parcel2.writeNoException();
                va.a.o0(parcel2, parcelableVolumeInfoJ1);
                return true;
            case 11:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                parcel.readString();
                Q(i12, i13);
                parcel2.writeNoException();
                return true;
            case 12:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                parcel.readString();
                p0(i14, i15);
                parcel2.writeNoException();
                return true;
            case 13:
                play();
                parcel2.writeNoException();
                return true;
            case 14:
                k0(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                o0(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                w0((Uri) va.a.f(parcel, Uri.CREATOR), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                H1(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case TYPE_SINT64_VALUE:
                pause();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                stop();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                next();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                previous();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                t0();
                parcel2.writeNoException();
                return true;
            case 23:
                A1();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                u((RatingCompat) va.a.f(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case RuntimeVersion.MINOR:
                o(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatC = c();
                parcel2.writeNoException();
                va.a.o0(parcel2, mediaMetadataCompatC);
                return true;
            case 28:
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                va.a.o0(parcel2, playbackState);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceX = X();
                parcel2.writeNoException();
                if (charSequenceX == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceX, parcel2, 1);
                return true;
            case 31:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                va.a.o0(parcel2, extras);
                return true;
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                G();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                prepare();
                parcel2.writeNoException();
                return true;
            case 34:
                c0(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                I(parcel.readString(), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                v((Uri) va.a.f(parcel, Uri.CREATOR), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int repeatMode = getRepeatMode();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                setRepeatMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                z((MediaDescriptionCompat) va.a.f(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                d1((MediaDescriptionCompat) va.a.f(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                x((MediaDescriptionCompat) va.a.f(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                r1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                i();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                i1(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iH = h();
                parcel2.writeNoException();
                parcel2.writeInt(iH);
                return true;
            case 48:
                P1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                setPlaybackSpeed(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleD0 = d0();
                parcel2.writeNoException();
                va.a.o0(parcel2, bundleD0);
                return true;
            case 51:
                a1((RatingCompat) va.a.f(parcel, RatingCompat.CREATOR), (Bundle) va.a.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override
    public final void p0(int i10, int i11) {
        throw new AssertionError();
    }

    @Override
    public final void pause() {
        throw new AssertionError();
    }

    @Override
    public final void play() {
        throw new AssertionError();
    }

    @Override
    public final void prepare() {
        throw new AssertionError();
    }

    @Override
    public final void previous() {
        throw new AssertionError();
    }

    @Override
    public final void r1(int i10) {
        throw new AssertionError();
    }

    @Override
    public final void s(b bVar) {
        p pVar = (p) this.f504e.get();
        if (pVar == null) {
            return;
        }
        pVar.f509e.register(bVar, new z6.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (pVar.f508d) {
        }
    }

    @Override
    public final void seekTo(long j9) {
        throw new AssertionError();
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        throw new AssertionError();
    }

    @Override
    public final void setRepeatMode(int i10) {
        throw new AssertionError();
    }

    @Override
    public final void stop() {
        throw new AssertionError();
    }

    @Override
    public final void t0() {
        throw new AssertionError();
    }

    @Override
    public final void u(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override
    public final void v(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void w0(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void x(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override
    public final void x1(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override
    public final boolean y() {
        throw new AssertionError();
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void z(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }
}
