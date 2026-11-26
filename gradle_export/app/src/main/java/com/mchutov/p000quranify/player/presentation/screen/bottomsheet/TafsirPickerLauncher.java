package com.mchutov.p000quranify.player.presentation.screen.bottomsheet;

import ah.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ot.e;
import yu.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/mchutov/quranify/player/presentation/screen/bottomsheet/TafsirPickerLauncher;", "Landroid/os/Parcelable;", RuntimeVersion.SUFFIX, "isFullScreen", "Lyu/g;", "layoutMode", "Lot/e;", "kind", "<init>", "(ZLyu/g;Lot/e;)V", RuntimeVersion.SUFFIX, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lg00/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lyu/g;", "getLayoutMode", "()Lyu/g;", "Lot/e;", "getKind", "()Lot/e;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TafsirPickerLauncher implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TafsirPickerLauncher> CREATOR = new c(11);
    private final boolean isFullScreen;
    private final e kind;
    private final g layoutMode;

    public TafsirPickerLauncher(boolean z11, g layoutMode, e kind) {
        m.e(layoutMode, "layoutMode");
        m.e(kind, "kind");
        this.isFullScreen = z11;
        this.layoutMode = layoutMode;
        this.kind = kind;
    }

    public TafsirPickerLauncher(boolean z11, g gVar, e eVar, int i11, f fVar) {
        this(z11, gVar, (i11 & 4) != 0 ? e.TAFSIR : eVar);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final e getKind() {
        return this.kind;
    }

    public final g getLayoutMode() {
        return this.layoutMode;
    }

    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        m.e(dest, "dest");
        dest.writeInt(this.isFullScreen ? 1 : 0);
        dest.writeString(this.layoutMode.name());
        dest.writeString(this.kind.name());
    }
}
