package com.mchutov.p000quranify.home.presentation.analytics;

import a1.b;
import a10.t;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import g4.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "MixSelected", "StreakCardClicked", "GoalAdjusted", "StreakShared", "InsightsViewed", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$GoalAdjusted;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$InsightsViewed;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$MixSelected;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$StreakCardClicked;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$StreakShared;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class HomeEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$GoalAdjusted;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "newGoalMinutes", RuntimeVersion.SUFFIX, "<init>", "(I)V", "getNewGoalMinutes", "()I", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GoalAdjusted extends HomeEvent {
        public static final int $stable = 0;
        private final int newGoalMinutes;

        public GoalAdjusted(int i11) {
            super(null);
            this.newGoalMinutes = i11;
        }

        public static GoalAdjusted copy$default(GoalAdjusted goalAdjusted, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = goalAdjusted.newGoalMinutes;
            }
            return goalAdjusted.copy(i11);
        }

        public final int getNewGoalMinutes() {
            return this.newGoalMinutes;
        }

        public final GoalAdjusted copy(int newGoalMinutes) {
            return new GoalAdjusted(newGoalMinutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoalAdjusted) && this.newGoalMinutes == ((GoalAdjusted) other).newGoalMinutes;
        }

        public final int getNewGoalMinutes() {
            return this.newGoalMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.newGoalMinutes);
        }

        public String toString() {
            return c.i("GoalAdjusted(newGoalMinutes=", this.newGoalMinutes, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$InsightsViewed;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "timeframe", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getTimeframe", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InsightsViewed extends HomeEvent {
        public static final int $stable = 0;
        private final String timeframe;

        public InsightsViewed(String timeframe) {
            super(null);
            m.e(timeframe, "timeframe");
            this.timeframe = timeframe;
        }

        public static InsightsViewed copy$default(InsightsViewed insightsViewed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = insightsViewed.timeframe;
            }
            return insightsViewed.copy(str);
        }

        public final String getTimeframe() {
            return this.timeframe;
        }

        public final InsightsViewed copy(String timeframe) {
            m.e(timeframe, "timeframe");
            return new InsightsViewed(timeframe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InsightsViewed) && m.a(this.timeframe, ((InsightsViewed) other).timeframe);
        }

        public final String getTimeframe() {
            return this.timeframe;
        }

        public int hashCode() {
            return this.timeframe.hashCode();
        }

        public String toString() {
            return b.p("InsightsViewed(timeframe=", this.timeframe, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$MixSelected;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "mixName", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getMixName", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MixSelected extends HomeEvent {
        public static final int $stable = 0;
        private final String mixName;

        public MixSelected(String mixName) {
            super(null);
            m.e(mixName, "mixName");
            this.mixName = mixName;
        }

        public static MixSelected copy$default(MixSelected mixSelected, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = mixSelected.mixName;
            }
            return mixSelected.copy(str);
        }

        public final String getMixName() {
            return this.mixName;
        }

        public final MixSelected copy(String mixName) {
            m.e(mixName, "mixName");
            return new MixSelected(mixName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MixSelected) && m.a(this.mixName, ((MixSelected) other).mixName);
        }

        public final String getMixName() {
            return this.mixName;
        }

        public int hashCode() {
            return this.mixName.hashCode();
        }

        public String toString() {
            return b.p("MixSelected(mixName=", this.mixName, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$StreakCardClicked;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StreakCardClicked extends HomeEvent {
        public static final int $stable = 0;
        public static final StreakCardClicked INSTANCE = new StreakCardClicked();

        private StreakCardClicked() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StreakCardClicked);
        }

        public int hashCode() {
            return -1657155665;
        }

        public String toString() {
            return "StreakCardClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent$StreakShared;", "Lcom/mchutov/quranify/home/presentation/analytics/HomeEvent;", "source", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StreakShared extends HomeEvent {
        public static final int $stable = 0;
        private final String source;

        public StreakShared(String source) {
            super(null);
            m.e(source, "source");
            this.source = source;
        }

        public static StreakShared copy$default(StreakShared streakShared, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = streakShared.source;
            }
            return streakShared.copy(str);
        }

        public final String getSource() {
            return this.source;
        }

        public final StreakShared copy(String source) {
            m.e(source, "source");
            return new StreakShared(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StreakShared) && m.a(this.source, ((StreakShared) other).source);
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return b.p("StreakShared(source=", this.source, ")");
        }
    }

    private HomeEvent() {
    }

    public HomeEvent(f fVar) {
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
