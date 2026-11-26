package l9;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new com.google.android.gms.common.internal.k0(25);
    public final x A;
    public final long B;
    public MediaSession.QueueItem C;

    public d0(MediaSession.QueueItem queueItem, x xVar, long j9) {
        if (j9 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.A = xVar;
        this.B = j9;
        this.C = queueItem;
    }

    public d0(Parcel parcel) {
        this.A = x.CREATOR.createFromParcel(parcel);
        this.B = parcel.readLong();
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new d0(queueItem, x.a(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.A);
        sb2.append(", Id=");
        return a1.b.k(this.B, " }", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.A.writeToParcel(parcel, i10);
        parcel.writeLong(this.B);
    }
}
