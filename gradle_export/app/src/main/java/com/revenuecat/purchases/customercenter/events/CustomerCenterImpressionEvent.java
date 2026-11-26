package com.revenuecat.purchases.customercenter.events;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "creationData", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "data", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "getData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "CreationData", "Data", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterImpressionEvent implements FeatureEvent {
    private final CreationData creationData;
    private final Data data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "", DiagnosticsEntry.ID_KEY, "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CreationData {
        private final Date date;
        private final UUID id;

        public CreationData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public CreationData(UUID id, Date date) {
            m.e(id, "id");
            m.e(date, "date");
            this.id = id;
            this.date = date;
        }

        public CreationData(UUID uuid, Date date, int i, f fVar) {
            if ((i & 1) != 0) {
                uuid = UUID.randomUUID();
                m.d(uuid, "randomUUID()");
            }
            this(uuid, (i & 2) != 0 ? new Date() : date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return m.a(this.id, creationData.id) && m.a(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "", DiagnosticsEntry.TIMESTAMP_KEY, "Ljava/util/Date;", "darkMode", "", "locale", "", DiagnosticsEntry.VERSION_KEY, "", "revisionID", "displayMode", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;)V", "getDarkMode", "()Z", "getDisplayMode", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getLocale", "()Ljava/lang/String;", "getRevisionID", "()I", "getTimestamp", "()Ljava/util/Date;", "type", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getVersion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Data {
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final int revisionID;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final int version;

        public Data(Date timestamp, boolean z, String locale, int i, int i2, CustomerCenterDisplayMode displayMode) {
            m.e(timestamp, "timestamp");
            m.e(locale, "locale");
            m.e(displayMode, "displayMode");
            this.timestamp = timestamp;
            this.darkMode = z;
            this.locale = locale;
            this.version = i;
            this.revisionID = i2;
            this.displayMode = displayMode;
            this.type = CustomerCenterEventType.IMPRESSION;
        }

        public Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode, int i3, f fVar) {
            this(date, z, str, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? CustomerCenterDisplayMode.FULL_SCREEN : customerCenterDisplayMode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return m.a(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && m.a(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.displayMode.hashCode() + ((((x5.e(c.e(this.timestamp.hashCode() * 31, 31, this.darkMode), this.locale, 31) + this.version) * 31) + this.revisionID) * 31);
        }

        public String toString() {
            return "Data(timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", version=" + this.version + ", revisionID=" + this.revisionID + ", displayMode=" + this.displayMode + ')';
        }
    }

    public CustomerCenterImpressionEvent(CreationData creationData, Data data) {
        m.e(creationData, "creationData");
        m.e(data, "data");
        this.creationData = creationData;
        this.data = data;
    }

    public CustomerCenterImpressionEvent(CreationData creationData, Data data, int i, f fVar) {
        if ((i & 1) != 0) {
            creationData = new CreationData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(creationData, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterImpressionEvent)) {
            return false;
        }
        CustomerCenterImpressionEvent customerCenterImpressionEvent = (CustomerCenterImpressionEvent) obj;
        return m.a(this.creationData, customerCenterImpressionEvent.creationData) && m.a(this.data, customerCenterImpressionEvent.data);
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.creationData.hashCode() * 31);
    }

    public String toString() {
        return "CustomerCenterImpressionEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }
}
