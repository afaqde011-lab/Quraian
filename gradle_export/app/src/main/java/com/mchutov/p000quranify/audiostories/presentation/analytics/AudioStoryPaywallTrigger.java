package com.mchutov.p000quranify.audiostories.presentation.analytics;

import com.google.protobuf.RuntimeVersion;
import f50.c;
import kotlin.Metadata;
import n00.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/analytics/AudioStoryPaywallTrigger;", RuntimeVersion.SUFFIX, "analyticsValue", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "FREE_PART_END", "SEEK", "LOCKED_EPISODE", "RESUME", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum AudioStoryPaywallTrigger {
    FREE_PART_END("free_part_end"),
    SEEK("seek"),
    LOCKED_EPISODE("locked_episode"),
    RESUME("resume");

    private static final a $ENTRIES = c.v(values());
    private final String analyticsValue;

    AudioStoryPaywallTrigger(String str) {
        this.analyticsValue = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
