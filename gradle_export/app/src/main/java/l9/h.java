package l9;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Rating;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

public final class h {

    public static final Object f10147b = new Object();

    public static volatile h f10148c;

    public Object f10149a;

    public h(Object obj) {
        this.f10149a = obj;
    }

    public static h a(Context context) {
        h hVar;
        synchronized (f10147b) {
            try {
                if (f10148c == null) {
                    Context applicationContext = context.getApplicationContext();
                    h hVar2 = new h();
                    h1.l lVar = new h1.l();
                    lVar.A = applicationContext;
                    lVar.B = applicationContext.getContentResolver();
                    hVar2.f10149a = lVar;
                    f10148c = hVar2;
                }
                hVar = f10148c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public boolean b(g0 g0Var) {
        h1.l lVar = (h1.l) this.f10149a;
        h0 h0Var = g0Var.f10146a;
        Context context = (Context) lVar.A;
        int i10 = h0Var.f10151b;
        String str = h0Var.f10150a;
        int i11 = h0Var.f10152c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i10, i11) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (lVar.S0(h0Var, "android.permission.STATUS_BAR_SERVICE") || lVar.S0(h0Var, "android.permission.MEDIA_CONTENT_CONTROL") || i11 == 1000 || i11 == Process.myUid()) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) lVar.B, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            e7.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", a.a.q(list, MediaBrowserCompat$MediaItem.CREATOR));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle3);
        ((Messenger) this.f10149a).send(messageObtain);
    }

    public void d(String str, Bitmap bitmap) {
        Integer num = (Integer) y.D.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f10149a).putParcelable(str, bitmap);
    }

    public void e(long j9, String str) {
        Integer num = (Integer) y.D.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f10149a).putLong(str, j9);
    }

    public void f(String str, k0 k0Var) {
        Object obj;
        float f3 = k0Var.B;
        int i10 = k0Var.A;
        Integer num = (Integer) y.D.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f10149a;
        if (k0Var.C != null) {
            obj = k0Var.C;
        } else {
            if (k0Var.c()) {
                switch (i10) {
                    case 1:
                        k0Var.C = Rating.newHeartRating(i10 == 1 && f3 == 1.0f);
                        break;
                    case 2:
                        k0Var.C = Rating.newThumbRating(i10 == 2 && f3 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        k0Var.C = Rating.newStarRating(i10, k0Var.b());
                        break;
                    case 6:
                        if (i10 != 6 || !k0Var.c()) {
                            f3 = -1.0f;
                        }
                        k0Var.C = Rating.newPercentageRating(f3);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                k0Var.C = Rating.newUnratedRating(i10);
            }
            obj = k0Var.C;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public void g(String str, String str2) {
        Integer num = (Integer) y.D.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f10149a).putCharSequence(str, str2);
    }

    public void h(CharSequence charSequence, String str) {
        Integer num = (Integer) y.D.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f10149a).putCharSequence(str, charSequence);
    }

    public void i(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f10149a;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }
}
