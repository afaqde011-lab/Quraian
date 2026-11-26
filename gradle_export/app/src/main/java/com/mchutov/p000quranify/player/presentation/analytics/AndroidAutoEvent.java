package com.mchutov.p000quranify.player.presentation.analytics;

import a1.b;
import a10.t;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "AndroidAutoConnected", "AndroidAutoDisconnected", "AndroidAutoPlaybackStarted", "AndroidAutoSubscriptionBlocked", "AndroidAutoBackgroundSoundSelected", "AndroidAutoSearchPerformed", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoBackgroundSoundSelected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoConnected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoDisconnected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoPlaybackStarted;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoSearchPerformed;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoSubscriptionBlocked;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AndroidAutoEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoBackgroundSoundSelected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoBackgroundSoundSelected extends AndroidAutoEvent {
        public static final int $stable = 0;
        public static final AndroidAutoBackgroundSoundSelected INSTANCE = new AndroidAutoBackgroundSoundSelected();

        private AndroidAutoBackgroundSoundSelected() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AndroidAutoBackgroundSoundSelected);
        }

        public int hashCode() {
            return 2120308759;
        }

        public String toString() {
            return "AndroidAutoBackgroundSoundSelected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoConnected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoConnected extends AndroidAutoEvent {
        public static final int $stable = 0;
        public static final AndroidAutoConnected INSTANCE = new AndroidAutoConnected();

        private AndroidAutoConnected() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AndroidAutoConnected);
        }

        public int hashCode() {
            return -1469317084;
        }

        public String toString() {
            return "AndroidAutoConnected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoDisconnected;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoDisconnected extends AndroidAutoEvent {
        public static final int $stable = 0;
        public static final AndroidAutoDisconnected INSTANCE = new AndroidAutoDisconnected();

        private AndroidAutoDisconnected() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AndroidAutoDisconnected);
        }

        public int hashCode() {
            return -1418934464;
        }

        public String toString() {
            return "AndroidAutoDisconnected";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoPlaybackStarted;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "source", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoPlaybackStarted extends AndroidAutoEvent {
        public static final int $stable = 0;
        private final String source;

        public AndroidAutoPlaybackStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public AndroidAutoPlaybackStarted(String str) {
            super(null);
            this.source = str;
        }

        public AndroidAutoPlaybackStarted(String str, int i11, f fVar) {
            this((i11 & 1) != 0 ? null : str);
        }

        public static AndroidAutoPlaybackStarted copy$default(AndroidAutoPlaybackStarted androidAutoPlaybackStarted, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = androidAutoPlaybackStarted.source;
            }
            return androidAutoPlaybackStarted.copy(str);
        }

        public final String getSource() {
            return this.source;
        }

        public final AndroidAutoPlaybackStarted copy(String source) {
            return new AndroidAutoPlaybackStarted(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AndroidAutoPlaybackStarted) && m.a(this.source, ((AndroidAutoPlaybackStarted) other).source);
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return b.p("AndroidAutoPlaybackStarted(source=", this.source, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoSearchPerformed;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoSearchPerformed extends AndroidAutoEvent {
        public static final int $stable = 0;
        public static final AndroidAutoSearchPerformed INSTANCE = new AndroidAutoSearchPerformed();

        private AndroidAutoSearchPerformed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AndroidAutoSearchPerformed);
        }

        public int hashCode() {
            return 1073071059;
        }

        public String toString() {
            return "AndroidAutoSearchPerformed";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent$AndroidAutoSubscriptionBlocked;", "Lcom/mchutov/quranify/player/presentation/analytics/AndroidAutoEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AndroidAutoSubscriptionBlocked extends AndroidAutoEvent {
        public static final int $stable = 0;
        public static final AndroidAutoSubscriptionBlocked INSTANCE = new AndroidAutoSubscriptionBlocked();

        private AndroidAutoSubscriptionBlocked() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AndroidAutoSubscriptionBlocked);
        }

        public int hashCode() {
            return -2086945430;
        }

        public String toString() {
            return "AndroidAutoSubscriptionBlocked";
        }
    }

    private AndroidAutoEvent() {
    }

    public AndroidAutoEvent(f fVar) {
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
