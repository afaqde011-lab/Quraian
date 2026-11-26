package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import va.b;
import va.c;
import va.d;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f561a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f561a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f562b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f15577e);
        }
        remoteActionCompat.f562b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f563c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f15577e);
        }
        remoteActionCompat.f563c = charSequence2;
        remoteActionCompat.f564d = (PendingIntent) bVar.g(remoteActionCompat.f564d, 4);
        boolean z11 = remoteActionCompat.f565e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).f15577e.readInt() != 0;
        }
        remoteActionCompat.f565e = z11;
        boolean z12 = remoteActionCompat.f566f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).f15577e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f566f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f561a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f562b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f15577e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f563c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f564d, 4);
        boolean z10 = remoteActionCompat.f565e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f566f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
