package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import g4.c;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "()V", "isPriorityEvent", "", "()Z", "Impression", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomPaywallEvent implements FeatureEvent {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "data", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "getData", "()Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "CreationData", "Data", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Impression extends CustomPaywallEvent {
        private final CreationData creationData;
        private final Data data;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "", DiagnosticsEntry.ID_KEY, "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "", "paywallId", "", "offeringId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getPaywallId", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Data {
            private final String offeringId;
            private final String paywallId;

            public Data(String str, String str2) {
                this.paywallId = str;
                this.offeringId = str2;
            }

            public Data(String str, String str2, int i, f fVar) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return m.a(this.paywallId, data.paywallId) && m.a(this.offeringId, data.offeringId);
            }

            public final String getOfferingId() {
                return this.offeringId;
            }

            public final String getPaywallId() {
                return this.paywallId;
            }

            public int hashCode() {
                String str = this.paywallId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.offeringId;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Data(paywallId=");
                sb.append(this.paywallId);
                sb.append(", offeringId=");
                return c.k(sb, this.offeringId, ')');
            }
        }

        public Impression(CreationData creationData, Data data) {
            super(null);
            m.e(creationData, "creationData");
            m.e(data, "data");
            this.creationData = creationData;
            this.data = data;
        }

        public Impression(CreationData creationData, Data data, int i, f fVar) {
            if ((i & 1) != 0) {
                creationData = new CreationData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            this(creationData, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj;
            return m.a(this.creationData, impression.creationData) && m.a(this.data, impression.data);
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
            return "Impression(creationData=" + this.creationData + ", data=" + this.data + ')';
        }
    }

    private CustomPaywallEvent() {
    }

    public CustomPaywallEvent(f fVar) {
        this();
    }

    @Override
    public boolean isPriorityEvent() {
        return true;
    }
}
