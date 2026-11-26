package com.mchutov.p000quranify.auth.presentation.analytics;

import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.QuranifyAnalyticsProperty;
import ep.e;
import ep.h;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r30.k;
import ri.t1;
import tk.a;
import tk.b;
import tk.c;
import tk.d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\b*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b \u0010\u0010J\u001d\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010#J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b)\u0010&J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00061"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthAnalytics;", RuntimeVersion.SUFFIX, "Ltk/c;", "eventLogger", "Ltk/d;", "propertyLogger", "<init>", "(Ltk/c;Ltk/d;)V", RuntimeVersion.SUFFIX, "value", "formatBirthDay", "(Ljava/lang/String;)Ljava/lang/String;", "trimOrNull", "source", "Lg00/b0;", "authorizationTapped", "(Ljava/lang/String;)V", "authorizationDismissed", "flow", "step", "authStepViewed", "(Ljava/lang/String;Ljava/lang/String;)V", "Lep/e;", "method", "authProviderSelected", "(Lep/e;)V", "provider", "signUpCompleted", RuntimeVersion.SUFFIX, "throwable", "signUpFailed", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "signInCompleted", "signInFailed", "passwordResetTapped", "()V", "passwordResetCompleted", "passwordResetFailed", "(Ljava/lang/Throwable;)V", "signedOut", "accountDeleted", "accountDeleteFailed", "Lep/h;", "user", "setUserProperties", "(Lep/h;)V", "clearUserProperties", "Ltk/c;", "Ltk/d;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthAnalytics {
    public static final int $stable = 8;
    private final c eventLogger;
    private final d propertyLogger;

    public AuthAnalytics(c eventLogger, d propertyLogger) {
        m.e(eventLogger, "eventLogger");
        m.e(propertyLogger, "propertyLogger");
        this.eventLogger = eventLogger;
        this.propertyLogger = propertyLogger;
    }

    private final String formatBirthDay(String value) {
        Object objS;
        String string = k.j1(value).toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            objS = LocalDate.parse(k.h1(10, string), DateTimeFormatter.ofPattern("yyyy-MM-dd")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Throwable th2) {
            objS = t1.s(th2);
        }
        return (String) (objS instanceof g00.m ? null : objS);
    }

    private final String trimOrNull(String str) {
        String string = k.j1(str).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public final void accountDeleteFailed(Throwable throwable) {
        m.e(throwable, "throwable");
        ((a) this.eventLogger).a(new AuthEvent.AccountDeleteFailed(AuthAnalyticsErrorKt.analyticsError(throwable), AuthAnalyticsErrorKt.analyticsErrorDescription(throwable)));
    }

    public final void accountDeleted() {
        ((a) this.eventLogger).a(AuthEvent.AccountDeleted.INSTANCE);
    }

    public final void authProviderSelected(e method) {
        m.e(method, "method");
        ((a) this.eventLogger).a(new AuthEvent.AuthProviderSelected(AuthAnalyticsProviderKt.analyticsProvider(method)));
    }

    public final void authStepViewed(String flow, String step) {
        m.e(flow, "flow");
        m.e(step, "step");
        ((a) this.eventLogger).a(new AuthEvent.AuthStepViewed(flow, step));
    }

    public final void authorizationDismissed(String source) {
        m.e(source, "source");
        ((a) this.eventLogger).a(new AuthEvent.AuthorizationDismissed(source));
    }

    public final void authorizationTapped(String source) {
        m.e(source, "source");
        ((a) this.eventLogger).a(new AuthEvent.AuthorizationTapped(source));
    }

    public final void clearUserProperties() {
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.UserId(null));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.BirthDay(null));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.Email(null));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.Sex(null));
    }

    public final void passwordResetCompleted() {
        ((a) this.eventLogger).a(AuthEvent.PasswordResetCompleted.INSTANCE);
    }

    public final void passwordResetFailed(Throwable throwable) {
        m.e(throwable, "throwable");
        ((a) this.eventLogger).a(new AuthEvent.PasswordResetFailed(AuthAnalyticsErrorKt.analyticsError(throwable)));
    }

    public final void passwordResetTapped() {
        ((a) this.eventLogger).a(AuthEvent.PasswordResetTapped.INSTANCE);
    }

    public final void setUserProperties(h user) {
        m.e(user, "user");
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.UserId(trimOrNull(user.f7175a)));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.Email(trimOrNull(user.f7176b)));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.Sex(trimOrNull(user.f7179e)));
        ((b) this.propertyLogger).a(new QuranifyAnalyticsProperty.BirthDay(formatBirthDay(user.f7180f)));
    }

    public final void signInCompleted(String provider) {
        m.e(provider, "provider");
        ((a) this.eventLogger).a(new AuthEvent.SignInCompleted(provider));
    }

    public final void signInFailed(String provider, Throwable throwable) {
        m.e(provider, "provider");
        m.e(throwable, "throwable");
        ((a) this.eventLogger).a(new AuthEvent.SignInFailed(provider, AuthAnalyticsErrorKt.analyticsError(throwable), AuthAnalyticsErrorKt.analyticsErrorDescription(throwable)));
    }

    public final void signUpCompleted(String provider) {
        m.e(provider, "provider");
        ((a) this.eventLogger).a(new AuthEvent.SignUpCompleted(provider));
    }

    public final void signUpFailed(String provider, Throwable throwable) {
        m.e(provider, "provider");
        m.e(throwable, "throwable");
        ((a) this.eventLogger).a(new AuthEvent.SignUpFailed(provider, AuthAnalyticsErrorKt.analyticsError(throwable), AuthAnalyticsErrorKt.analyticsErrorDescription(throwable)));
    }

    public final void signedOut() {
        ((a) this.eventLogger).a(AuthEvent.SignedOut.INSTANCE);
    }
}
