package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

public interface d extends IInterface {
    void A1();

    PendingIntent D();

    long D1();

    void G();

    void H1(long j9);

    void I(String str, Bundle bundle);

    ParcelableVolumeInfo J1();

    void P1(int i10);

    void Q(int i10, int i11);

    boolean Q0(KeyEvent keyEvent);

    CharSequence X();

    void a1(RatingCompat ratingCompat, Bundle bundle);

    MediaMetadataCompat c();

    void c0(String str, Bundle bundle);

    Bundle d0();

    void d1(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void e0(b bVar);

    Bundle getExtras();

    PlaybackStateCompat getPlaybackState();

    int getRepeatMode();

    String getTag();

    int h();

    void i();

    void i1(boolean z10);

    String j();

    void k0(String str, Bundle bundle);

    void next();

    void o(String str, Bundle bundle);

    void o0(String str, Bundle bundle);

    void p0(int i10, int i11);

    void pause();

    void play();

    void prepare();

    void previous();

    void r1(int i10);

    void s(b bVar);

    void seekTo(long j9);

    void setPlaybackSpeed(float f3);

    void setRepeatMode(int i10);

    void stop();

    void t0();

    void u(RatingCompat ratingCompat);

    void v(Uri uri, Bundle bundle);

    void w0(Uri uri, Bundle bundle);

    void x(MediaDescriptionCompat mediaDescriptionCompat);

    void x1(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    boolean y();

    void y1();

    void z(MediaDescriptionCompat mediaDescriptionCompat);
}
