package com.mchutov.quranify.onboarding.presentation.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import tk.a;
import tk.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0013J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006$"}, d2 = {"Lcom/mchutov/quranify/onboarding/presentation/analytics/OnboardingAnalytics;", "", "Ltk/c;", "eventLogger", "<init>", "(Ltk/c;)V", "Lg00/b0;", "onboardingStarted", "()V", "onboardingCompleted", "", "stepIndex", "", "stepName", "onboardingStepViewed", "(ILjava/lang/String;)V", "", "isGranted", "onboardingNotificationPermission", "(Z)V", "onboardingNewStarted", "onboardingNewStepViewed", "selectedCount", "reciterIds", "onboardingNewRecitersSubmitted", "soundId", "interactionTrail", "ambientTapCount", "onboardingNewAmbientSubmitted", "(Ljava/lang/String;Ljava/lang/String;I)V", "minutes", "onboardingNewDailyGoalSubmitted", "(I)V", "onboardingNewNotificationPermission", "onboardingNewCompleted", "Ltk/c;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnboardingAnalytics {
    public static final int $stable = 8;
    private final c eventLogger;

    public OnboardingAnalytics(c eventLogger) {
        m.e(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final void onboardingCompleted() {
        ((a) this.eventLogger).a(OnboardingEvent.OnboardingCompleted.INSTANCE);
    }

    public final void onboardingNewAmbientSubmitted(String soundId, String interactionTrail, int ambientTapCount) {
        m.e(soundId, "soundId");
        m.e(interactionTrail, "interactionTrail");
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNewAmbientSubmitted(soundId, interactionTrail, ambientTapCount));
    }

    public final void onboardingNewCompleted() {
        ((a) this.eventLogger).a(OnboardingEvent.OnboardingNewCompleted.INSTANCE);
    }

    public final void onboardingNewDailyGoalSubmitted(int minutes) {
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNewDailyGoalSubmitted(minutes));
    }

    public final void onboardingNewNotificationPermission(boolean isGranted) {
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNewNotificationPermission(isGranted));
    }

    public final void onboardingNewRecitersSubmitted(int selectedCount, String reciterIds) {
        m.e(reciterIds, "reciterIds");
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNewRecitersSubmitted(selectedCount, reciterIds));
    }

    public final void onboardingNewStarted() {
        ((a) this.eventLogger).a(OnboardingEvent.OnboardingNewStarted.INSTANCE);
    }

    public final void onboardingNewStepViewed(int stepIndex, String stepName) {
        m.e(stepName, "stepName");
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNewStepViewed(stepIndex, stepName));
    }

    public final void onboardingNotificationPermission(boolean isGranted) {
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingNotificationPermission(isGranted));
    }

    public final void onboardingStarted() {
        ((a) this.eventLogger).a(OnboardingEvent.OnboardingStarted.INSTANCE);
    }

    public final void onboardingStepViewed(int stepIndex, String stepName) {
        m.e(stepName, "stepName");
        ((a) this.eventLogger).a(new OnboardingEvent.OnboardingStepViewed(stepIndex, stepName));
    }
}
