package com.mchutov.quranify.auth.presentation.analytics;

import com.mchutov.core.domain.exception.AuthException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r30.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"AUTH_ANALYTICS_UNKNOWN_ERROR", "", "analyticsError", "", "analyticsErrorDescription", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class AuthAnalyticsErrorKt {
    public static final String AUTH_ANALYTICS_UNKNOWN_ERROR = "unknown";

    public static final String analyticsError(Throwable th) {
        String str;
        m.e(th, "<this>");
        AuthException authException = th instanceof AuthException ? (AuthException) th : null;
        if (authException == null || (str = authException.A) == null) {
            return "unknown";
        }
        String str2 = k.L0(str) ? null : str;
        return str2 == null ? "unknown" : str2;
    }

    public static final String analyticsErrorDescription(Throwable th) {
        m.e(th, "<this>");
        String message = th.getMessage();
        if (message == null) {
            return "";
        }
        if (k.L0(message)) {
            message = null;
        }
        return message == null ? "" : message;
    }
}
