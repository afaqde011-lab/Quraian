package com.revenuecat.purchases.virtualcurrencies;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\"¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "Landroid/os/Parcelable;", "", "balance", "", DiagnosticsEntry.NAME_KEY, "code", "serverDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lo40/b;Ln40/e;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getBalance", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getCode", "getServerDescription", "getServerDescription$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrency implements Parcelable {
    private final int balance;
    private final String code;
    private final String name;
    private final String serverDescription;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<VirtualCurrency> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return VirtualCurrency$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VirtualCurrency> {
        @Override
        public final VirtualCurrency createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new VirtualCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public final VirtualCurrency[] newArray(int i) {
            return new VirtualCurrency[i];
        }
    }

    @c
    public VirtualCurrency(int i, int i2, String str, String str2, String str3, x0 x0Var) {
        if (7 != (i & 7)) {
            o0.g(i, 7, VirtualCurrency$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.balance = i2;
        this.name = str;
        this.code = str2;
        if ((i & 8) == 0) {
            this.serverDescription = null;
        } else {
            this.serverDescription = str3;
        }
    }

    public VirtualCurrency(int i, String name, String code, String str) {
        m.e(name, "name");
        m.e(code, "code");
        this.balance = i;
        this.name = name;
        this.code = code;
        this.serverDescription = str;
    }

    public VirtualCurrency(int i, String str, String str2, String str3, int i2, f fVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3);
    }

    public static void getServerDescription$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(VirtualCurrency self, b output, e serialDesc) {
        output.w(0, self.balance, serialDesc);
        output.i(serialDesc, 1, self.name);
        output.i(serialDesc, 2, self.code);
        if (!output.k(serialDesc) && self.serverDescription == null) {
            return;
        }
        output.x(serialDesc, 3, b1.a, self.serverDescription);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualCurrency)) {
            return false;
        }
        VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
        return this.balance == virtualCurrency.balance && m.a(this.name, virtualCurrency.name) && m.a(this.code, virtualCurrency.code) && m.a(this.serverDescription, virtualCurrency.serverDescription);
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public int hashCode() {
        int iE = x5.e(x5.e(this.balance * 31, this.name, 31), this.code, 31);
        String str = this.serverDescription;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VirtualCurrency(balance=");
        sb.append(this.balance);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", serverDescription=");
        return g4.c.k(sb, this.serverDescription, ')');
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        parcel.writeInt(this.balance);
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.serverDescription);
    }
}
