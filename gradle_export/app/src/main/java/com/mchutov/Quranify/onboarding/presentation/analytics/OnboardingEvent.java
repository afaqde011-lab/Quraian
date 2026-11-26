package com.mchutov.quranify.onboarding.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import g4.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "OnboardingStarted", "OnboardingCompleted", "OnboardingStepViewed", "OnboardingNotificationPermission", "OnboardingNewStarted", "OnboardingNewStepViewed", "OnboardingNewRecitersSubmitted", "OnboardingNewAmbientSubmitted", "OnboardingNewDailyGoalSubmitted", "OnboardingNewNotificationPermission", "OnboardingNewCompleted", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingCompleted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewAmbientSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewCompleted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewDailyGoalSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewNotificationPermission;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewRecitersSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewStarted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewStepViewed;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNotificationPermission;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingStarted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingStepViewed;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class OnboardingEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingCompleted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingCompleted extends OnboardingEvent {
        public static final int $stable = 0;
        public static final OnboardingCompleted INSTANCE = new OnboardingCompleted();

        private OnboardingCompleted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnboardingCompleted);
        }

        public int hashCode() {
            return 678740046;
        }

        public String toString() {
            return "OnboardingCompleted";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewAmbientSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "soundId", "", "interactionTrail", "ambientTapCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getSoundId", "()Ljava/lang/String;", "getInteractionTrail", "getAmbientTapCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewAmbientSubmitted extends OnboardingEvent {
        public static final int $stable = 0;
        private final int ambientTapCount;
        private final String interactionTrail;
        private final String soundId;

        public OnboardingNewAmbientSubmitted(String soundId, String interactionTrail, int i) {
            super(null);
            m.e(soundId, "soundId");
            m.e(interactionTrail, "interactionTrail");
            this.soundId = soundId;
            this.interactionTrail = interactionTrail;
            this.ambientTapCount = i;
        }

        public static OnboardingNewAmbientSubmitted copy$default(OnboardingNewAmbientSubmitted onboardingNewAmbientSubmitted, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = onboardingNewAmbientSubmitted.soundId;
            }
            if ((i2 & 2) != 0) {
                str2 = onboardingNewAmbientSubmitted.interactionTrail;
            }
            if ((i2 & 4) != 0) {
                i = onboardingNewAmbientSubmitted.ambientTapCount;
            }
            return onboardingNewAmbientSubmitted.copy(str, str2, i);
        }

        public final String getSoundId() {
            return this.soundId;
        }

        public final String getInteractionTrail() {
            return this.interactionTrail;
        }

        public final int getAmbientTapCount() {
            return this.ambientTapCount;
        }

        public final OnboardingNewAmbientSubmitted copy(String soundId, String interactionTrail, int ambientTapCount) {
            m.e(soundId, "soundId");
            m.e(interactionTrail, "interactionTrail");
            return new OnboardingNewAmbientSubmitted(soundId, interactionTrail, ambientTapCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingNewAmbientSubmitted)) {
                return false;
            }
            OnboardingNewAmbientSubmitted onboardingNewAmbientSubmitted = (OnboardingNewAmbientSubmitted) other;
            return m.a(this.soundId, onboardingNewAmbientSubmitted.soundId) && m.a(this.interactionTrail, onboardingNewAmbientSubmitted.interactionTrail) && this.ambientTapCount == onboardingNewAmbientSubmitted.ambientTapCount;
        }

        public final int getAmbientTapCount() {
            return this.ambientTapCount;
        }

        public final String getInteractionTrail() {
            return this.interactionTrail;
        }

        public final String getSoundId() {
            return this.soundId;
        }

        public int hashCode() {
            return Integer.hashCode(this.ambientTapCount) + x5.e(this.soundId.hashCode() * 31, this.interactionTrail, 31);
        }

        public String toString() {
            return c.g(this.ambientTapCount, ")", b.s("OnboardingNewAmbientSubmitted(soundId=", this.soundId, ", interactionTrail=", this.interactionTrail, ", ambientTapCount="));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewCompleted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewCompleted extends OnboardingEvent {
        public static final int $stable = 0;
        public static final OnboardingNewCompleted INSTANCE = new OnboardingNewCompleted();

        private OnboardingNewCompleted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnboardingNewCompleted);
        }

        public int hashCode() {
            return -1050176600;
        }

        public String toString() {
            return "OnboardingNewCompleted";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewDailyGoalSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "dailyGoalMinutes", "", "<init>", "(I)V", "getDailyGoalMinutes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewDailyGoalSubmitted extends OnboardingEvent {
        public static final int $stable = 0;
        private final int dailyGoalMinutes;

        public OnboardingNewDailyGoalSubmitted(int i) {
            super(null);
            this.dailyGoalMinutes = i;
        }

        public static OnboardingNewDailyGoalSubmitted copy$default(OnboardingNewDailyGoalSubmitted onboardingNewDailyGoalSubmitted, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onboardingNewDailyGoalSubmitted.dailyGoalMinutes;
            }
            return onboardingNewDailyGoalSubmitted.copy(i);
        }

        public final int getDailyGoalMinutes() {
            return this.dailyGoalMinutes;
        }

        public final OnboardingNewDailyGoalSubmitted copy(int dailyGoalMinutes) {
            return new OnboardingNewDailyGoalSubmitted(dailyGoalMinutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnboardingNewDailyGoalSubmitted) && this.dailyGoalMinutes == ((OnboardingNewDailyGoalSubmitted) other).dailyGoalMinutes;
        }

        public final int getDailyGoalMinutes() {
            return this.dailyGoalMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.dailyGoalMinutes);
        }

        public String toString() {
            return c.i("OnboardingNewDailyGoalSubmitted(dailyGoalMinutes=", this.dailyGoalMinutes, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewNotificationPermission;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "granted", "", "<init>", "(Z)V", "getGranted", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewNotificationPermission extends OnboardingEvent {
        public static final int $stable = 0;
        private final boolean granted;

        public OnboardingNewNotificationPermission(boolean z) {
            super(null);
            this.granted = z;
        }

        public static OnboardingNewNotificationPermission copy$default(OnboardingNewNotificationPermission onboardingNewNotificationPermission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onboardingNewNotificationPermission.granted;
            }
            return onboardingNewNotificationPermission.copy(z);
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public final OnboardingNewNotificationPermission copy(boolean granted) {
            return new OnboardingNewNotificationPermission(granted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnboardingNewNotificationPermission) && this.granted == ((OnboardingNewNotificationPermission) other).granted;
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.granted);
        }

        public String toString() {
            return c.j("OnboardingNewNotificationPermission(granted=", ")", this.granted);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewRecitersSubmitted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "selectedCount", "", "reciterIds", "", "<init>", "(ILjava/lang/String;)V", "getSelectedCount", "()I", "getReciterIds", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewRecitersSubmitted extends OnboardingEvent {
        public static final int $stable = 0;
        private final String reciterIds;
        private final int selectedCount;

        public OnboardingNewRecitersSubmitted(int i, String reciterIds) {
            super(null);
            m.e(reciterIds, "reciterIds");
            this.selectedCount = i;
            this.reciterIds = reciterIds;
        }

        public static OnboardingNewRecitersSubmitted copy$default(OnboardingNewRecitersSubmitted onboardingNewRecitersSubmitted, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onboardingNewRecitersSubmitted.selectedCount;
            }
            if ((i2 & 2) != 0) {
                str = onboardingNewRecitersSubmitted.reciterIds;
            }
            return onboardingNewRecitersSubmitted.copy(i, str);
        }

        public final int getSelectedCount() {
            return this.selectedCount;
        }

        public final String getReciterIds() {
            return this.reciterIds;
        }

        public final OnboardingNewRecitersSubmitted copy(int selectedCount, String reciterIds) {
            m.e(reciterIds, "reciterIds");
            return new OnboardingNewRecitersSubmitted(selectedCount, reciterIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingNewRecitersSubmitted)) {
                return false;
            }
            OnboardingNewRecitersSubmitted onboardingNewRecitersSubmitted = (OnboardingNewRecitersSubmitted) other;
            return this.selectedCount == onboardingNewRecitersSubmitted.selectedCount && m.a(this.reciterIds, onboardingNewRecitersSubmitted.reciterIds);
        }

        public final String getReciterIds() {
            return this.reciterIds;
        }

        public final int getSelectedCount() {
            return this.selectedCount;
        }

        public int hashCode() {
            return this.reciterIds.hashCode() + (Integer.hashCode(this.selectedCount) * 31);
        }

        public String toString() {
            return "OnboardingNewRecitersSubmitted(selectedCount=" + this.selectedCount + ", reciterIds=" + this.reciterIds + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewStarted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewStarted extends OnboardingEvent {
        public static final int $stable = 0;
        public static final OnboardingNewStarted INSTANCE = new OnboardingNewStarted();

        private OnboardingNewStarted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnboardingNewStarted);
        }

        public int hashCode() {
            return -1195142882;
        }

        public String toString() {
            return "OnboardingNewStarted";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNewStepViewed;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "stepIndex", "", "stepName", "", "<init>", "(ILjava/lang/String;)V", "getStepIndex", "()I", "getStepName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNewStepViewed extends OnboardingEvent {
        public static final int $stable = 0;
        private final int stepIndex;
        private final String stepName;

        public OnboardingNewStepViewed(int i, String stepName) {
            super(null);
            m.e(stepName, "stepName");
            this.stepIndex = i;
            this.stepName = stepName;
        }

        public static OnboardingNewStepViewed copy$default(OnboardingNewStepViewed onboardingNewStepViewed, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onboardingNewStepViewed.stepIndex;
            }
            if ((i2 & 2) != 0) {
                str = onboardingNewStepViewed.stepName;
            }
            return onboardingNewStepViewed.copy(i, str);
        }

        public final int getStepIndex() {
            return this.stepIndex;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public final OnboardingNewStepViewed copy(int stepIndex, String stepName) {
            m.e(stepName, "stepName");
            return new OnboardingNewStepViewed(stepIndex, stepName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingNewStepViewed)) {
                return false;
            }
            OnboardingNewStepViewed onboardingNewStepViewed = (OnboardingNewStepViewed) other;
            return this.stepIndex == onboardingNewStepViewed.stepIndex && m.a(this.stepName, onboardingNewStepViewed.stepName);
        }

        public final int getStepIndex() {
            return this.stepIndex;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public int hashCode() {
            return this.stepName.hashCode() + (Integer.hashCode(this.stepIndex) * 31);
        }

        public String toString() {
            return "OnboardingNewStepViewed(stepIndex=" + this.stepIndex + ", stepName=" + this.stepName + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingNotificationPermission;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "granted", "", "<init>", "(Z)V", "getGranted", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingNotificationPermission extends OnboardingEvent {
        public static final int $stable = 0;
        private final boolean granted;

        public OnboardingNotificationPermission(boolean z) {
            super(null);
            this.granted = z;
        }

        public static OnboardingNotificationPermission copy$default(OnboardingNotificationPermission onboardingNotificationPermission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onboardingNotificationPermission.granted;
            }
            return onboardingNotificationPermission.copy(z);
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public final OnboardingNotificationPermission copy(boolean granted) {
            return new OnboardingNotificationPermission(granted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnboardingNotificationPermission) && this.granted == ((OnboardingNotificationPermission) other).granted;
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.granted);
        }

        public String toString() {
            return c.j("OnboardingNotificationPermission(granted=", ")", this.granted);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingStarted;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingStarted extends OnboardingEvent {
        public static final int $stable = 0;
        public static final OnboardingStarted INSTANCE = new OnboardingStarted();

        private OnboardingStarted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnboardingStarted);
        }

        public int hashCode() {
            return 375369540;
        }

        public String toString() {
            return "OnboardingStarted";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent$OnboardingStepViewed;", "Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingEvent;", "stepIndex", "", "stepName", "", "<init>", "(ILjava/lang/String;)V", "getStepIndex", "()I", "getStepName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingStepViewed extends OnboardingEvent {
        public static final int $stable = 0;
        private final int stepIndex;
        private final String stepName;

        public OnboardingStepViewed(int i, String stepName) {
            super(null);
            m.e(stepName, "stepName");
            this.stepIndex = i;
            this.stepName = stepName;
        }

        public static OnboardingStepViewed copy$default(OnboardingStepViewed onboardingStepViewed, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onboardingStepViewed.stepIndex;
            }
            if ((i2 & 2) != 0) {
                str = onboardingStepViewed.stepName;
            }
            return onboardingStepViewed.copy(i, str);
        }

        public final int getStepIndex() {
            return this.stepIndex;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public final OnboardingStepViewed copy(int stepIndex, String stepName) {
            m.e(stepName, "stepName");
            return new OnboardingStepViewed(stepIndex, stepName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingStepViewed)) {
                return false;
            }
            OnboardingStepViewed onboardingStepViewed = (OnboardingStepViewed) other;
            return this.stepIndex == onboardingStepViewed.stepIndex && m.a(this.stepName, onboardingStepViewed.stepName);
        }

        public final int getStepIndex() {
            return this.stepIndex;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public int hashCode() {
            return this.stepName.hashCode() + (Integer.hashCode(this.stepIndex) * 31);
        }

        public String toString() {
            return "OnboardingStepViewed(stepIndex=" + this.stepIndex + ", stepName=" + this.stepName + ")";
        }
    }

    private OnboardingEvent() {
    }

    public OnboardingEvent(f fVar) {
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
