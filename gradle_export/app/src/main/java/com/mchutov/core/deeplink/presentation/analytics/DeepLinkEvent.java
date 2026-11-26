package com.mchutov.core.deeplink.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import oi.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "DeeplinkOpened", "ContentShared", "Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent$ContentShared;", "Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent$DeeplinkOpened;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class DeepLinkEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent$ContentShared;", "Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent;", "type", "", DiagnosticsEntry.ID_KEY, "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContentShared extends DeepLinkEvent {
        public static final int $stable = 0;
        private final String id;
        private final String source;
        private final String type;

        public ContentShared(String type, String id, String source) {
            super(null);
            m.e(type, "type");
            m.e(id, "id");
            m.e(source, "source");
            this.type = type;
            this.id = id;
            this.source = source;
        }

        public static ContentShared copy$default(ContentShared contentShared, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentShared.type;
            }
            if ((i & 2) != 0) {
                str2 = contentShared.id;
            }
            if ((i & 4) != 0) {
                str3 = contentShared.source;
            }
            return contentShared.copy(str, str2, str3);
        }

        public final String getType() {
            return this.type;
        }

        public final String getId() {
            return this.id;
        }

        public final String getSource() {
            return this.source;
        }

        public final ContentShared copy(String type, String id, String source) {
            m.e(type, "type");
            m.e(id, "id");
            m.e(source, "source");
            return new ContentShared(type, id, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentShared)) {
                return false;
            }
            ContentShared contentShared = (ContentShared) other;
            return m.a(this.type, contentShared.type) && m.a(this.id, contentShared.id) && m.a(this.source, contentShared.source);
        }

        public final String getId() {
            return this.id;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.source.hashCode() + x5.e(this.type.hashCode() * 31, this.id, 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.id;
            return x5.n(b.s("ContentShared(type=", str, ", id=", str2, ", source="), this.source, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent$DeeplinkOpened;", "Lcom/mchutov/core/deeplink/presentation/analytics/DeepLinkEvent;", "url", "", "type", DiagnosticsEntry.ID_KEY, "entry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getType", "getId", "getEntry", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeeplinkOpened extends DeepLinkEvent {
        public static final int $stable = 0;
        private final String entry;
        private final String id;
        private final String type;
        private final String url;

        public DeeplinkOpened(String url, String type, String str, String entry) {
            super(null);
            m.e(url, "url");
            m.e(type, "type");
            m.e(entry, "entry");
            this.url = url;
            this.type = type;
            this.id = str;
            this.entry = entry;
        }

        public static DeeplinkOpened copy$default(DeeplinkOpened deeplinkOpened, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplinkOpened.url;
            }
            if ((i & 2) != 0) {
                str2 = deeplinkOpened.type;
            }
            if ((i & 4) != 0) {
                str3 = deeplinkOpened.id;
            }
            if ((i & 8) != 0) {
                str4 = deeplinkOpened.entry;
            }
            return deeplinkOpened.copy(str, str2, str3, str4);
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getType() {
            return this.type;
        }

        public final String getId() {
            return this.id;
        }

        public final String getEntry() {
            return this.entry;
        }

        public final DeeplinkOpened copy(String url, String type, String id, String entry) {
            m.e(url, "url");
            m.e(type, "type");
            m.e(entry, "entry");
            return new DeeplinkOpened(url, type, id, entry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeeplinkOpened)) {
                return false;
            }
            DeeplinkOpened deeplinkOpened = (DeeplinkOpened) other;
            return m.a(this.url, deeplinkOpened.url) && m.a(this.type, deeplinkOpened.type) && m.a(this.id, deeplinkOpened.id) && m.a(this.entry, deeplinkOpened.entry);
        }

        public final String getEntry() {
            return this.entry;
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iE = x5.e(this.url.hashCode() * 31, this.type, 31);
            String str = this.id;
            return this.entry.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.url;
            String str2 = this.type;
            return k.m(b.s("DeeplinkOpened(url=", str, ", type=", str2, ", id="), this.id, ", entry=", this.entry, ")");
        }
    }

    private DeepLinkEvent() {
    }

    public DeepLinkEvent(f fVar) {
        this();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Map<String, Object> getParams() {
        return super.getParams();
    }

    @Override
    public g00.k transformProperties(t tVar) {
        return super.transformProperties(tVar);
    }
}
