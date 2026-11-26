package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "", "Lcom/revenuecat/purchases/ReplacementMode;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lg00/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "INSTANT_PRORATED_DATE", "INSTANT_PRORATED_CHARGE", "INSTANT_NO_PRORATION", "DEFERRED", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GalaxyReplacementMode implements ReplacementMode {
    INSTANT_PRORATED_DATE,
    INSTANT_PRORATED_CHARGE,
    INSTANT_NO_PRORATION,
    DEFERRED;


    private static final GalaxyReplacementMode f0default = new GalaxyReplacementMode();

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GalaxyReplacementMode> CREATOR = new Parcelable.Creator<GalaxyReplacementMode>() {
        @Override
        public final GalaxyReplacementMode createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return GalaxyReplacementMode.valueOf(parcel.readString());
        }

        @Override
        public final GalaxyReplacementMode[] newArray(int i) {
            return new GalaxyReplacementMode[i];
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "getDefault$annotations", "getDefault", "()Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getDefault$annotations() {
        }

        public final GalaxyReplacementMode getDefault() {
            return GalaxyReplacementMode.f0default;
        }
    }

    static {
    }

    private GalaxyReplacementMode() {
        super(str, i);
    }

    public static GalaxyReplacementMode valueOf(String str) {
        return (GalaxyReplacementMode) Enum.valueOf(GalaxyReplacementMode.class, str);
    }

    public static GalaxyReplacementMode[] values() {
        return (GalaxyReplacementMode[]) $VALUES.clone();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        parcel.writeString(name());
    }
}
