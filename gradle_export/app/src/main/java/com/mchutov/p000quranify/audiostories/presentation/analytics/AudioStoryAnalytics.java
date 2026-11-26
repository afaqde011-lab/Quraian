package com.mchutov.p000quranify.audiostories.presentation.analytics;

import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import tk.a;
import tk.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalytics;", RuntimeVersion.SUFFIX, "Ltk/c;", "eventLogger", "<init>", "(Ltk/c;)V", "Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;", "event", "Lg00/b0;", "logEvent", "(Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryAnalyticsEvent;)V", "Ltk/c;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryAnalytics {
    public static final int $stable = 8;
    private final c eventLogger;

    public AudioStoryAnalytics(c eventLogger) {
        m.e(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final void logEvent(AudioStoryAnalyticsEvent event) {
        m.e(event, "event");
        ((a) this.eventLogger).a(event);
    }
}
