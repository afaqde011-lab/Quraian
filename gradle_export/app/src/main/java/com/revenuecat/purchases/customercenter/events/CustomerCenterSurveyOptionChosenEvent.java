package com.revenuecat.purchases.customercenter.events;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import q40.b;
import q40.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "creationData", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "data", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "getData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "Companion", "CreationData", "Data", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterSurveyOptionChosenEvent implements FeatureEvent {

    public static final Companion INSTANCE = new Companion(null);
    private static final b json = c.d;
    private final CreationData creationData;
    private final Data data;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Companion;", "", "<init>", "()V", "Lq40/b;", "json", "Lq40/b;", "getJson$purchases_defaultsBc8Release", "()Lq40/b;", "getJson$purchases_defaultsBc8Release$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getJson$purchases_defaultsBc8Release$annotations() {
        }

        public final b getJson$purchases_defaultsBc8Release() {
            return CustomerCenterSurveyOptionChosenEvent.json;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "", DiagnosticsEntry.ID_KEY, "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0012R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001d¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "", DiagnosticsEntry.TIMESTAMP_KEY, "Ljava/util/Date;", "darkMode", "", "locale", "", DiagnosticsEntry.VERSION_KEY, "", "revisionID", "displayMode", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "path", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "url", "surveyOptionID", "additionalContext", "(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalContext", "()Ljava/lang/String;", "getDarkMode", "()Z", "getDisplayMode", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getLocale", "getPath", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getRevisionID", "()I", "getSurveyOptionID", "getTimestamp", "()Ljava/util/Date;", "type", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getUrl", "getVersion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Data {
        private final String additionalContext;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final String url;
        private final int version;

        public Data(Date timestamp, boolean z, String locale, int i, int i2, CustomerCenterDisplayMode displayMode, CustomerCenterConfigData.HelpPath.PathType path, String str, String surveyOptionID, String str2) {
            m.e(timestamp, "timestamp");
            m.e(locale, "locale");
            m.e(displayMode, "displayMode");
            m.e(path, "path");
            m.e(surveyOptionID, "surveyOptionID");
            this.timestamp = timestamp;
            this.darkMode = z;
            this.locale = locale;
            this.version = i;
            this.revisionID = i2;
            this.displayMode = displayMode;
            this.path = path;
            this.url = str;
            this.surveyOptionID = surveyOptionID;
            this.additionalContext = str2;
            this.type = CustomerCenterEventType.SURVEY_OPTION_CHOSEN;
        }

        public Data(Date date, boolean z, String str, int i, int i2, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str2, String str3, String str4, int i3, f fVar) {
            this(date, z, str, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? CustomerCenterDisplayMode.FULL_SCREEN : customerCenterDisplayMode, pathType, str2, str3, (i3 & 512) != 0 ? null : str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return m.a(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && m.a(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode && this.path == data.path && m.a(this.url, data.url) && m.a(this.surveyOptionID, data.surveyOptionID) && m.a(this.additionalContext, data.additionalContext);
        }

        public final String getAdditionalContext() {
            return this.additionalContext;
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

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = (this.path.hashCode() + ((this.displayMode.hashCode() + ((((x5.e(w.c.e(this.timestamp.hashCode() * 31, 31, this.darkMode), this.locale, 31) + this.version) * 31) + this.revisionID) * 31)) * 31)) * 31;
            String str = this.url;
            int iE = x5.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.surveyOptionID, 31);
            String str2 = this.additionalContext;
            return iE + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Data(timestamp=");
            sb.append(this.timestamp);
            sb.append(", darkMode=");
            sb.append(this.darkMode);
            sb.append(", locale=");
            sb.append(this.locale);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", revisionID=");
            sb.append(this.revisionID);
            sb.append(", displayMode=");
            sb.append(this.displayMode);
            sb.append(", path=");
            sb.append(this.path);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", surveyOptionID=");
            sb.append(this.surveyOptionID);
            sb.append(", additionalContext=");
            return g4.c.k(sb, this.additionalContext, ')');
        }
    }

    public CustomerCenterSurveyOptionChosenEvent(CreationData creationData, Data data) {
        m.e(creationData, "creationData");
        m.e(data, "data");
        this.creationData = creationData;
        this.data = data;
    }

    public CustomerCenterSurveyOptionChosenEvent(CreationData creationData, Data data, int i, f fVar) {
        if ((i & 1) != 0) {
            creationData = new CreationData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(creationData, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterSurveyOptionChosenEvent)) {
            return false;
        }
        CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent = (CustomerCenterSurveyOptionChosenEvent) obj;
        return m.a(this.creationData, customerCenterSurveyOptionChosenEvent.creationData) && m.a(this.data, customerCenterSurveyOptionChosenEvent.data);
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
        return "CustomerCenterSurveyOptionChosenEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }
}
