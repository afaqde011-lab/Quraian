package com.mchutov.p000quranify.appwidget.presentation.analytics;

import a10.t;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import g4.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "WidgetPlaybackRequested", "WidgetFavoritePlaybackRequested", "Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent$WidgetFavoritePlaybackRequested;", "Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent$WidgetPlaybackRequested;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class WidgetPlaybackEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent$WidgetFavoritePlaybackRequested;", "Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent;", "reciterId", RuntimeVersion.SUFFIX, "favoriteSurahCount", "<init>", "(II)V", "getReciterId", "()I", "getFavoriteSurahCount", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WidgetFavoritePlaybackRequested extends WidgetPlaybackEvent {
        public static final int $stable = 0;
        private final int favoriteSurahCount;
        private final int reciterId;

        public WidgetFavoritePlaybackRequested(int i11, int i12) {
            super(null);
            this.reciterId = i11;
            this.favoriteSurahCount = i12;
        }

        public static WidgetFavoritePlaybackRequested copy$default(WidgetFavoritePlaybackRequested widgetFavoritePlaybackRequested, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = widgetFavoritePlaybackRequested.reciterId;
            }
            if ((i13 & 2) != 0) {
                i12 = widgetFavoritePlaybackRequested.favoriteSurahCount;
            }
            return widgetFavoritePlaybackRequested.copy(i11, i12);
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final int getFavoriteSurahCount() {
            return this.favoriteSurahCount;
        }

        public final WidgetFavoritePlaybackRequested copy(int reciterId, int favoriteSurahCount) {
            return new WidgetFavoritePlaybackRequested(reciterId, favoriteSurahCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetFavoritePlaybackRequested)) {
                return false;
            }
            WidgetFavoritePlaybackRequested widgetFavoritePlaybackRequested = (WidgetFavoritePlaybackRequested) other;
            return this.reciterId == widgetFavoritePlaybackRequested.reciterId && this.favoriteSurahCount == widgetFavoritePlaybackRequested.favoriteSurahCount;
        }

        public final int getFavoriteSurahCount() {
            return this.favoriteSurahCount;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public int hashCode() {
            return Integer.hashCode(this.favoriteSurahCount) + (Integer.hashCode(this.reciterId) * 31);
        }

        public String toString() {
            return c.e(this.reciterId, this.favoriteSurahCount, "WidgetFavoritePlaybackRequested(reciterId=", ", favoriteSurahCount=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent$WidgetPlaybackRequested;", "Lcom/mchutov/quranify/appwidget/presentation/analytics/WidgetPlaybackEvent;", "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "<init>", "(II)V", "getSurahNumber", "()I", "getReciterId", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WidgetPlaybackRequested extends WidgetPlaybackEvent {
        public static final int $stable = 0;
        private final int reciterId;
        private final int surahNumber;

        public WidgetPlaybackRequested(int i11, int i12) {
            super(null);
            this.surahNumber = i11;
            this.reciterId = i12;
        }

        public static WidgetPlaybackRequested copy$default(WidgetPlaybackRequested widgetPlaybackRequested, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = widgetPlaybackRequested.surahNumber;
            }
            if ((i13 & 2) != 0) {
                i12 = widgetPlaybackRequested.reciterId;
            }
            return widgetPlaybackRequested.copy(i11, i12);
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final WidgetPlaybackRequested copy(int surahNumber, int reciterId) {
            return new WidgetPlaybackRequested(surahNumber, reciterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetPlaybackRequested)) {
                return false;
            }
            WidgetPlaybackRequested widgetPlaybackRequested = (WidgetPlaybackRequested) other;
            return this.surahNumber == widgetPlaybackRequested.surahNumber && this.reciterId == widgetPlaybackRequested.reciterId;
        }

        public final int getReciterId() {
            return this.reciterId;
        }

        public final int getSurahNumber() {
            return this.surahNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.reciterId) + (Integer.hashCode(this.surahNumber) * 31);
        }

        public String toString() {
            return c.e(this.surahNumber, this.reciterId, "WidgetPlaybackRequested(surahNumber=", ", reciterId=", ")");
        }
    }

    private WidgetPlaybackEvent() {
    }

    public WidgetPlaybackEvent(f fVar) {
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
