package com.revenuecat.purchases.paywalls.events;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import p40.b1;
import p40.o0;
import p40.x0;
import q40.b;
import q40.c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016JX\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J(\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÁ\u0001¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0016R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0016R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u0016R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010\u0016¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "", "paywallID", "sessionID", "", "revision", "displayMode", "", "darkMode", "localeIdentifier", "offeringId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lp40/x0;)V", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getPaywallID", "getPaywallID$annotations", "()V", "getSessionID", "getSessionID$annotations", "I", "getRevision", "getRevision$annotations", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getOfferingId", "getOfferingId$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallPostReceiptData {

    public static final Companion INSTANCE = new Companion(null);
    private static final b json = c.d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final String paywallID;
    private final int revision;
    private final String sessionID;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "serializer", "()Ll40/a;", "Lq40/b;", "json", "Lq40/b;", "getJson", "()Lq40/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final b getJson() {
            return PaywallPostReceiptData.json;
        }

        public final a serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }
    }

    @g00.c
    public PaywallPostReceiptData(int i, String str, String str2, int i2, String str3, boolean z, String str4, String str5, x0 x0Var) {
        if (127 != (i & 127)) {
            o0.g(i, 127, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.paywallID = str;
        this.sessionID = str2;
        this.revision = i2;
        this.displayMode = str3;
        this.darkMode = z;
        this.localeIdentifier = str4;
        this.offeringId = str5;
    }

    public PaywallPostReceiptData(String str, String sessionID, int i, String displayMode, boolean z, String localeIdentifier, String offeringId) {
        m.e(sessionID, "sessionID");
        m.e(displayMode, "displayMode");
        m.e(localeIdentifier, "localeIdentifier");
        m.e(offeringId, "offeringId");
        this.paywallID = str;
        this.sessionID = sessionID;
        this.revision = i;
        this.displayMode = displayMode;
        this.darkMode = z;
        this.localeIdentifier = localeIdentifier;
        this.offeringId = offeringId;
    }

    public static PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, String str2, int i, String str3, boolean z, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paywallPostReceiptData.paywallID;
        }
        if ((i2 & 2) != 0) {
            str2 = paywallPostReceiptData.sessionID;
        }
        if ((i2 & 4) != 0) {
            i = paywallPostReceiptData.revision;
        }
        if ((i2 & 8) != 0) {
            str3 = paywallPostReceiptData.displayMode;
        }
        if ((i2 & 16) != 0) {
            z = paywallPostReceiptData.darkMode;
        }
        if ((i2 & 32) != 0) {
            str4 = paywallPostReceiptData.localeIdentifier;
        }
        if ((i2 & 64) != 0) {
            str5 = paywallPostReceiptData.offeringId;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z2 = z;
        int i3 = i;
        return paywallPostReceiptData.copy(str, str2, i3, str3, z2, str6, str7);
    }

    public static void getDarkMode$annotations() {
    }

    public static void getDisplayMode$annotations() {
    }

    public static void getLocaleIdentifier$annotations() {
    }

    public static void getOfferingId$annotations() {
    }

    public static void getPaywallID$annotations() {
    }

    public static void getRevision$annotations() {
    }

    public static void getSessionID$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PaywallPostReceiptData self, o40.b output, e serialDesc) {
        output.x(serialDesc, 0, b1.a, self.paywallID);
        output.i(serialDesc, 1, self.sessionID);
        output.w(2, self.revision, serialDesc);
        output.i(serialDesc, 3, self.displayMode);
        output.u(serialDesc, 4, self.darkMode);
        output.i(serialDesc, 5, self.localeIdentifier);
        output.i(serialDesc, 6, self.offeringId);
    }

    public final String getPaywallID() {
        return this.paywallID;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String paywallID, String sessionID, int revision, String displayMode, boolean darkMode, String localeIdentifier, String offeringId) {
        m.e(sessionID, "sessionID");
        m.e(displayMode, "displayMode");
        m.e(localeIdentifier, "localeIdentifier");
        m.e(offeringId, "offeringId");
        return new PaywallPostReceiptData(paywallID, sessionID, revision, displayMode, darkMode, localeIdentifier, offeringId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) other;
        return m.a(this.paywallID, paywallPostReceiptData.paywallID) && m.a(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && m.a(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && m.a(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && m.a(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallID() {
        return this.paywallID;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        String str = this.paywallID;
        return this.offeringId.hashCode() + x5.e(w.c.e(x5.e(w.c.d(this.revision, x5.e((str == null ? 0 : str.hashCode()) * 31, this.sessionID, 31), 31), this.displayMode, 31), 31, this.darkMode), this.localeIdentifier, 31);
    }

    public final Map<String, Object> toMap() {
        b bVar = json;
        bVar.getClass();
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(bVar.c(INSTANCE.serializer(), this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaywallPostReceiptData(paywallID=");
        sb.append(this.paywallID);
        sb.append(", sessionID=");
        sb.append(this.sessionID);
        sb.append(", revision=");
        sb.append(this.revision);
        sb.append(", displayMode=");
        sb.append(this.displayMode);
        sb.append(", darkMode=");
        sb.append(this.darkMode);
        sb.append(", localeIdentifier=");
        sb.append(this.localeIdentifier);
        sb.append(", offeringId=");
        return g4.c.k(sb, this.offeringId, ')');
    }
}
