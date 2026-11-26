package l9;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new com.google.android.gms.common.internal.k0(27);
    public final int A;
    public final long B;
    public final long C;
    public final float D;
    public final long E;
    public final int F;
    public final CharSequence G;
    public final long H;
    public final AbstractCollection I;
    public final long J;
    public final Bundle K;
    public PlaybackState L;

    public j0(int i10, long j9, long j10, float f3, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        AbstractCollection arrayList2;
        this.A = i10;
        this.B = j9;
        this.C = j10;
        this.D = f3;
        this.E = j11;
        this.F = i11;
        this.G = charSequence;
        this.H = j12;
        if (arrayList == null) {
            r0 r0Var = t0.B;
            arrayList2 = d2.E;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.I = arrayList2;
        this.J = j13;
        this.K = bundle;
    }

    public j0(Parcel parcel) {
        this.A = parcel.readInt();
        this.B = parcel.readLong();
        this.D = parcel.readFloat();
        this.H = parcel.readLong();
        this.C = parcel.readLong();
        this.E = parcel.readLong();
        this.G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection abstractCollectionCreateTypedArrayList = parcel.createTypedArrayList(i0.CREATOR);
        if (abstractCollectionCreateTypedArrayList == null) {
            r0 r0Var = t0.B;
            abstractCollectionCreateTypedArrayList = d2.E;
        }
        this.I = abstractCollectionCreateTypedArrayList;
        this.J = parcel.readLong();
        this.K = parcel.readBundle(f0.class.getClassLoader());
        this.F = parcel.readInt();
    }

    public static j0 a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    Bundle extras = customAction.getExtras();
                    f0.h(extras);
                    i0 i0Var = new i0(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
                    i0Var.E = customAction;
                    arrayList.add(i0Var);
                }
            }
        }
        Bundle extras2 = playbackState.getExtras();
        f0.h(extras2);
        j0 j0Var = new j0(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        j0Var.L = playbackState;
        return j0Var;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.A);
        sb2.append(", position=");
        sb2.append(this.B);
        sb2.append(", buffered position=");
        sb2.append(this.C);
        sb2.append(", speed=");
        sb2.append(this.D);
        sb2.append(", updated=");
        sb2.append(this.H);
        sb2.append(", actions=");
        sb2.append(this.E);
        sb2.append(", error code=");
        sb2.append(this.F);
        sb2.append(", error message=");
        sb2.append(this.G);
        sb2.append(", custom actions=");
        sb2.append(this.I);
        sb2.append(", active item id=");
        return a1.b.k(this.J, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeLong(this.B);
        parcel.writeFloat(this.D);
        parcel.writeLong(this.H);
        parcel.writeLong(this.C);
        parcel.writeLong(this.E);
        TextUtils.writeToParcel(this.G, parcel, i10);
        parcel.writeTypedList(this.I);
        parcel.writeLong(this.J);
        parcel.writeBundle(this.K);
        parcel.writeInt(this.F);
    }
}
