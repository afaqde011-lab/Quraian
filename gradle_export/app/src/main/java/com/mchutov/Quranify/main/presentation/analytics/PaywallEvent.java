package com.mchutov.quranify.main.presentation.analytics;

import a1.b;
import a10.t;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/PaywallEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "PaywallOpened", "Lcom/mchutov/quranify/main/presentation/analytics/PaywallEvent$PaywallOpened;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class PaywallEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/main/presentation/analytics/PaywallEvent$PaywallOpened;", "Lcom/mchutov/quranify/main/presentation/analytics/PaywallEvent;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaywallOpened extends PaywallEvent {
        public static final int $stable = 0;
        private final String source;

        public PaywallOpened(String source) {
            super(null);
            m.e(source, "source");
            this.source = source;
        }

        public static PaywallOpened copy$default(PaywallOpened paywallOpened, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paywallOpened.source;
            }
            return paywallOpened.copy(str);
        }

        public final String getSource() {
            return this.source;
        }

        public final PaywallOpened copy(String source) {
            m.e(source, "source");
            return new PaywallOpened(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaywallOpened) && m.a(this.source, ((PaywallOpened) other).source);
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return b.p("PaywallOpened(source=", this.source, ")");
        }
    }

    private PaywallEvent() {
    }

    public PaywallEvent(f fVar) {
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
    public k transformProperties(t tVar) {
        return super.transformProperties(tVar);
    }
}
