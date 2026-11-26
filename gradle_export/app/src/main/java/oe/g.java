package oe;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new c(1);
    public final Messenger A;

    public g(IBinder iBinder) {
        this.A = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((g) obj).A;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.A;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.A;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
