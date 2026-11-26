package n4;

import android.app.Notification;
import android.os.Parcel;

public final class l {

    public final String f11089a;

    public final int f11090b;

    public final Notification f11091c;

    public l(String str, int i10, Notification notification) {
        this.f11089a = str;
        this.f11090b = i10;
        this.f11091c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f11089a;
        int i10 = this.f11090b;
        Notification notification = this.f11091c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(b.c.f1920a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            aVar.f1918e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f11089a);
        sb2.append(", id:");
        return g4.c.g(this.f11090b, ", tag:null]", sb2);
    }
}
