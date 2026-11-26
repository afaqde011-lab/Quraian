package com.mchutov.quranify.player.presentation.screen.bottomsheet;

import ah.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/mchutov/quranify/player/presentation/screen/bottomsheet/FullScreenLauncher;", "Landroid/os/Parcelable;", "", "showTrackList", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lg00/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getShowTrackList", "()Z", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FullScreenLauncher implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FullScreenLauncher> CREATOR = new c(10);
    private final boolean showTrackList;

    public FullScreenLauncher(boolean z) {
        this.showTrackList = z;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean getShowTrackList() {
        return this.showTrackList;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        m.e(dest, "dest");
        dest.writeInt(this.showTrackList ? 1 : 0);
    }
}
