package k7;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

public final class d extends ContentObserver {

    public final ContentResolver f9019a;

    public final Uri f9020b;

    public final e f9021c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f9021c = eVar;
        this.f9019a = contentResolver;
        this.f9020b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e eVar = this.f9021c;
        eVar.d(b.c((Context) eVar.f9024b, (androidx.media3.common.d) eVar.f9032j, (AudioDeviceInfo) eVar.f9031i));
    }
}
