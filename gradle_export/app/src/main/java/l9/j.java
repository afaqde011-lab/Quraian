package l9;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

public final class j extends q {

    public final int f10158e;

    public final c.d f10159f;

    public j(Object obj, c.d dVar, int i10) {
        super(obj);
        this.f10158e = i10;
        this.f10159f = dVar;
    }

    @Override
    public void c() {
        switch (this.f10158e) {
            case 2:
                c.b bVar = this.f10159f.A;
                if (bVar != null) {
                    try {
                        bVar.c2(-1, null);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            default:
                super.c();
                break;
        }
    }

    @Override
    public final void d(Object obj) {
        switch (this.f10158e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", a.a.p((g) obj, MediaBrowserCompat$MediaItem.CREATOR));
                c.b bVar = this.f10159f.A;
                if (bVar != null) {
                    try {
                        bVar.c2(0, bundle);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                c.d dVar = this.f10159f;
                try {
                    if (list == null) {
                        c.b bVar2 = dVar.A;
                        if (bVar2 != null) {
                            bVar2.c2(-1, null);
                        }
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArray("search_results", (Parcelable[]) a.a.q(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
                        c.b bVar3 = dVar.A;
                        if (bVar3 != null) {
                            bVar3.c2(0, bundle2);
                        }
                    }
                } catch (RemoteException unused2) {
                    return;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                c.b bVar4 = this.f10159f.A;
                if (bVar4 != null) {
                    try {
                        bVar4.c2(0, bundle3);
                    } catch (RemoteException unused3) {
                        return;
                    }
                }
                break;
        }
    }
}
