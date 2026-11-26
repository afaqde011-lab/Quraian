package com.revenuecat.purchases.virtualcurrencies;

import android.os.Parcel;
import android.os.Parcelable;
import g00.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import p40.b1;
import p40.g0;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001d\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "Landroid/os/Parcelable;", "", "", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "all", "<init>", "(Ljava/util/Map;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/Map;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lo40/b;Ln40/e;)V", "write$Self", "code", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getAll", "()Ljava/util/Map;", "getAll$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrencies implements Parcelable {
    private final Map<String, VirtualCurrency> all;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<VirtualCurrencies> CREATOR = new Creator();
    private static final a[] $childSerializers = {new g0(b1.a, VirtualCurrency$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return VirtualCurrencies$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VirtualCurrencies> {
        @Override
        public final VirtualCurrencies createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), VirtualCurrency.CREATOR.createFromParcel(parcel));
            }
            return new VirtualCurrencies(linkedHashMap);
        }

        @Override
        public final VirtualCurrencies[] newArray(int i) {
            return new VirtualCurrencies[i];
        }
    }

    @c
    public VirtualCurrencies(int i, Map map, x0 x0Var) {
        if (1 == (i & 1)) {
            this.all = map;
        } else {
            o0.g(i, 1, VirtualCurrencies$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public VirtualCurrencies(Map<String, VirtualCurrency> all) {
        m.e(all, "all");
        this.all = all;
    }

    public static void getAll$annotations() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VirtualCurrencies) && m.a(this.all, ((VirtualCurrencies) obj).all);
    }

    public final VirtualCurrency get(String code) {
        m.e(code, "code");
        return this.all.get(code);
    }

    public final Map<String, VirtualCurrency> getAll() {
        return this.all;
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public String toString() {
        return w.c.m(new StringBuilder("VirtualCurrencies(all="), this.all, ')');
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        Map<String, VirtualCurrency> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry<String, VirtualCurrency> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }
}
