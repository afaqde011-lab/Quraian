package com.mchutov.p000quranify.auth.presentation.analytics;

import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthAnalyticsProvider;", RuntimeVersion.SUFFIX, "<init>", "()V", "EMAIL", RuntimeVersion.SUFFIX, "GOOGLE", "APPLE", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthAnalyticsProvider {
    public static final int $stable = 0;
    public static final String APPLE = "apple";
    public static final String EMAIL = "email";
    public static final String GOOGLE = "google";
    public static final AuthAnalyticsProvider INSTANCE = new AuthAnalyticsProvider();

    private AuthAnalyticsProvider() {
    }
}
