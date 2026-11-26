package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "Landroid/os/Parcelable;", "", "autoSyncPurchases", "customEntitlementComputation", "uiPreviewMode", "<init>", "(ZZZ)V", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lg00/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getAutoSyncPurchases", "()Z", "getCustomEntitlementComputation$purchases_defaultsBc8Release", "getUiPreviewMode$purchases_defaultsBc8Release", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DangerousSettings implements Parcelable {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;
    private final boolean uiPreviewMode;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DangerousSettings> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings$Companion;", "", "()V", "forPreviewMode", "Lcom/revenuecat/purchases/DangerousSettings;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final DangerousSettings forPreviewMode() {
            return new DangerousSettings(false, false, true);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DangerousSettings> {
        @Override
        public final DangerousSettings createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new DangerousSettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override
        public final DangerousSettings[] newArray(int i) {
            return new DangerousSettings[i];
        }
    }

    public DangerousSettings() {
        this(false, false, false, 7, null);
    }

    public DangerousSettings(boolean z) {
        this(z, false, false);
    }

    public DangerousSettings(boolean z, int i, f fVar) {
        this((i & 1) != 0 ? true : z);
    }

    public DangerousSettings(boolean z, boolean z2, boolean z3) {
        this.autoSyncPurchases = z;
        this.customEntitlementComputation = z2;
        this.uiPreviewMode = z3;
    }

    public DangerousSettings(boolean z, boolean z2, boolean z3, int i, f fVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public static final DangerousSettings forPreviewMode() {
        return INSTANCE.forPreviewMode();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation && this.uiPreviewMode == dangerousSettings.uiPreviewMode;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.customEntitlementComputation;
    }

    public final boolean getUiPreviewMode() {
        return this.uiPreviewMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.uiPreviewMode) + w.c.e(Boolean.hashCode(this.autoSyncPurchases) * 31, 31, this.customEntitlementComputation);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DangerousSettings(autoSyncPurchases=");
        sb.append(this.autoSyncPurchases);
        sb.append(", customEntitlementComputation=");
        sb.append(this.customEntitlementComputation);
        sb.append(", uiPreviewMode=");
        return x5.o(sb, this.uiPreviewMode, ')');
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
        parcel.writeInt(this.uiPreviewMode ? 1 : 0);
    }
}
