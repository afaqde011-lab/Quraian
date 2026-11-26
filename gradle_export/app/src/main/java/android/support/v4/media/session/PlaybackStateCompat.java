package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s(4);
    public final int A;
    public final long B;
    public final long C;
    public final float D;
    public final long E;
    public final int F;
    public final CharSequence G;
    public final long H;
    public final ArrayList I;
    public final long J;
    public final Bundle K;
    public PlaybackState L;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new x();
        public final String A;
        public final CharSequence B;
        public final int C;
        public final Bundle D;
        public PlaybackState.CustomAction E;

        public CustomAction(Parcel parcel) {
            this.A = parcel.readString();
            this.B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.C = parcel.readInt();
            this.D = parcel.readBundle(t.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.A = str;
            this.B = charSequence;
            this.C = i10;
            this.D = bundle;
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.B) + ", mIcon=" + this.C + ", mExtras=" + this.D;
        }

        @Override
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.A);
            TextUtils.writeToParcel(this.B, parcel, i10);
            parcel.writeInt(this.C);
            parcel.writeBundle(this.D);
        }
    }

    public PlaybackStateCompat(int i10, long j9, long j10, float f3, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.A = i10;
        this.B = j9;
        this.C = j10;
        this.D = f3;
        this.E = j11;
        this.F = i11;
        this.G = charSequence;
        this.H = j12;
        this.I = new ArrayList(arrayList);
        this.J = j13;
        this.K = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A = parcel.readInt();
        this.B = parcel.readLong();
        this.D = parcel.readFloat();
        this.H = parcel.readLong();
        this.C = parcel.readLong();
        this.E = parcel.readLong();
        this.G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.I = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.J = parcel.readLong();
        this.K = parcel.readBundle(t.class.getClassLoader());
        this.F = parcel.readInt();
    }

    public static PlaybackStateCompat a(PlaybackState playbackState) {
        ArrayList arrayList;
        CustomAction customAction;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> listJ = u.j(playbackState);
        if (listJ != null) {
            ArrayList arrayList2 = new ArrayList(listJ.size());
            for (PlaybackState.CustomAction customAction2 : listJ) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle bundleL = u.l(customAction3);
                    t.a(bundleL);
                    customAction = new CustomAction(u.f(customAction3), u.o(customAction3), u.m(customAction3), bundleL);
                    customAction.E = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle bundleA = v.a(playbackState);
        t.a(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(u.r(playbackState), u.q(playbackState), u.i(playbackState), u.p(playbackState), u.g(playbackState), 0, u.k(playbackState), u.n(playbackState), arrayList, u.h(playbackState), bundleA);
        playbackStateCompat.L = playbackState;
        return playbackStateCompat;
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
