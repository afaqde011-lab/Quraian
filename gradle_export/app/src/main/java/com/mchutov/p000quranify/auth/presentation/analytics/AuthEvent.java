package com.mchutov.p000quranify.auth.presentation.analytics;

import a1.b;
import a10.t;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "AuthorizationTapped", "AuthorizationDismissed", "AuthStepViewed", "AuthProviderSelected", "SignUpCompleted", "SignUpFailed", "SignInCompleted", "SignInFailed", "PasswordResetTapped", "PasswordResetCompleted", "PasswordResetFailed", "SignedOut", "AccountDeleted", "AccountDeleteFailed", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AccountDeleteFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AccountDeleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthProviderSelected;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthStepViewed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthorizationDismissed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthorizationTapped;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetTapped;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignInCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignInFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignUpCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignUpFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignedOut;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AuthEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AccountDeleteFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "error", RuntimeVersion.SUFFIX, "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getErrorDescription", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccountDeleteFailed extends AuthEvent {
        public static final int $stable = 0;
        private final String error;
        private final String errorDescription;

        public AccountDeleteFailed(String error, String errorDescription) {
            super(null);
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            this.error = error;
            this.errorDescription = errorDescription;
        }

        public static AccountDeleteFailed copy$default(AccountDeleteFailed accountDeleteFailed, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = accountDeleteFailed.error;
            }
            if ((i11 & 2) != 0) {
                str2 = accountDeleteFailed.errorDescription;
            }
            return accountDeleteFailed.copy(str, str2);
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final AccountDeleteFailed copy(String error, String errorDescription) {
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            return new AccountDeleteFailed(error, errorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountDeleteFailed)) {
                return false;
            }
            AccountDeleteFailed accountDeleteFailed = (AccountDeleteFailed) other;
            return m.a(this.error, accountDeleteFailed.error) && m.a(this.errorDescription, accountDeleteFailed.errorDescription);
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public int hashCode() {
            return this.errorDescription.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return b.q("AccountDeleteFailed(error=", this.error, ", errorDescription=", this.errorDescription, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AccountDeleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccountDeleted extends AuthEvent {
        public static final int $stable = 0;
        public static final AccountDeleted INSTANCE = new AccountDeleted();

        private AccountDeleted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccountDeleted);
        }

        public int hashCode() {
            return 850284264;
        }

        public String toString() {
            return "AccountDeleted";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthProviderSelected;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "provider", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthProviderSelected extends AuthEvent {
        public static final int $stable = 0;
        private final String provider;

        public AuthProviderSelected(String provider) {
            super(null);
            m.e(provider, "provider");
            this.provider = provider;
        }

        public static AuthProviderSelected copy$default(AuthProviderSelected authProviderSelected, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = authProviderSelected.provider;
            }
            return authProviderSelected.copy(str);
        }

        public final String getProvider() {
            return this.provider;
        }

        public final AuthProviderSelected copy(String provider) {
            m.e(provider, "provider");
            return new AuthProviderSelected(provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthProviderSelected) && m.a(this.provider, ((AuthProviderSelected) other).provider);
        }

        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public String toString() {
            return b.p("AuthProviderSelected(provider=", this.provider, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthStepViewed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "flow", RuntimeVersion.SUFFIX, "step", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFlow", "()Ljava/lang/String;", "getStep", "component1", "component2", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthStepViewed extends AuthEvent {
        public static final int $stable = 0;
        private final String flow;
        private final String step;

        public AuthStepViewed(String flow, String step) {
            super(null);
            m.e(flow, "flow");
            m.e(step, "step");
            this.flow = flow;
            this.step = step;
        }

        public static AuthStepViewed copy$default(AuthStepViewed authStepViewed, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = authStepViewed.flow;
            }
            if ((i11 & 2) != 0) {
                str2 = authStepViewed.step;
            }
            return authStepViewed.copy(str, str2);
        }

        public final String getFlow() {
            return this.flow;
        }

        public final String getStep() {
            return this.step;
        }

        public final AuthStepViewed copy(String flow, String step) {
            m.e(flow, "flow");
            m.e(step, "step");
            return new AuthStepViewed(flow, step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthStepViewed)) {
                return false;
            }
            AuthStepViewed authStepViewed = (AuthStepViewed) other;
            return m.a(this.flow, authStepViewed.flow) && m.a(this.step, authStepViewed.step);
        }

        public final String getFlow() {
            return this.flow;
        }

        public final String getStep() {
            return this.step;
        }

        public int hashCode() {
            return this.step.hashCode() + (this.flow.hashCode() * 31);
        }

        public String toString() {
            return b.q("AuthStepViewed(flow=", this.flow, ", step=", this.step, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthorizationDismissed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "source", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthorizationDismissed extends AuthEvent {
        public static final int $stable = 0;
        private final String source;

        public AuthorizationDismissed(String source) {
            super(null);
            m.e(source, "source");
            this.source = source;
        }

        public static AuthorizationDismissed copy$default(AuthorizationDismissed authorizationDismissed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = authorizationDismissed.source;
            }
            return authorizationDismissed.copy(str);
        }

        public final String getSource() {
            return this.source;
        }

        public final AuthorizationDismissed copy(String source) {
            m.e(source, "source");
            return new AuthorizationDismissed(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthorizationDismissed) && m.a(this.source, ((AuthorizationDismissed) other).source);
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return b.p("AuthorizationDismissed(source=", this.source, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$AuthorizationTapped;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "source", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthorizationTapped extends AuthEvent {
        public static final int $stable = 0;
        private final String source;

        public AuthorizationTapped(String source) {
            super(null);
            m.e(source, "source");
            this.source = source;
        }

        public static AuthorizationTapped copy$default(AuthorizationTapped authorizationTapped, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = authorizationTapped.source;
            }
            return authorizationTapped.copy(str);
        }

        public final String getSource() {
            return this.source;
        }

        public final AuthorizationTapped copy(String source) {
            m.e(source, "source");
            return new AuthorizationTapped(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthorizationTapped) && m.a(this.source, ((AuthorizationTapped) other).source);
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return b.p("AuthorizationTapped(source=", this.source, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PasswordResetCompleted extends AuthEvent {
        public static final int $stable = 0;
        public static final PasswordResetCompleted INSTANCE = new PasswordResetCompleted();

        private PasswordResetCompleted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PasswordResetCompleted);
        }

        public int hashCode() {
            return -1699623181;
        }

        public String toString() {
            return "PasswordResetCompleted";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "error", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PasswordResetFailed extends AuthEvent {
        public static final int $stable = 0;
        private final String error;

        public PasswordResetFailed(String error) {
            super(null);
            m.e(error, "error");
            this.error = error;
        }

        public static PasswordResetFailed copy$default(PasswordResetFailed passwordResetFailed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = passwordResetFailed.error;
            }
            return passwordResetFailed.copy(str);
        }

        public final String getError() {
            return this.error;
        }

        public final PasswordResetFailed copy(String error) {
            m.e(error, "error");
            return new PasswordResetFailed(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PasswordResetFailed) && m.a(this.error, ((PasswordResetFailed) other).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return b.p("PasswordResetFailed(error=", this.error, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$PasswordResetTapped;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PasswordResetTapped extends AuthEvent {
        public static final int $stable = 0;
        public static final PasswordResetTapped INSTANCE = new PasswordResetTapped();

        private PasswordResetTapped() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PasswordResetTapped);
        }

        public int hashCode() {
            return 29610724;
        }

        public String toString() {
            return "PasswordResetTapped";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignInCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "provider", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignInCompleted extends AuthEvent {
        public static final int $stable = 0;
        private final String provider;

        public SignInCompleted(String provider) {
            super(null);
            m.e(provider, "provider");
            this.provider = provider;
        }

        public static SignInCompleted copy$default(SignInCompleted signInCompleted, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signInCompleted.provider;
            }
            return signInCompleted.copy(str);
        }

        public final String getProvider() {
            return this.provider;
        }

        public final SignInCompleted copy(String provider) {
            m.e(provider, "provider");
            return new SignInCompleted(provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignInCompleted) && m.a(this.provider, ((SignInCompleted) other).provider);
        }

        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public String toString() {
            return b.p("SignInCompleted(provider=", this.provider, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignInFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "provider", RuntimeVersion.SUFFIX, "error", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "getError", "getErrorDescription", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignInFailed extends AuthEvent {
        public static final int $stable = 0;
        private final String error;
        private final String errorDescription;
        private final String provider;

        public SignInFailed(String provider, String error, String errorDescription) {
            super(null);
            m.e(provider, "provider");
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            this.provider = provider;
            this.error = error;
            this.errorDescription = errorDescription;
        }

        public static SignInFailed copy$default(SignInFailed signInFailed, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signInFailed.provider;
            }
            if ((i11 & 2) != 0) {
                str2 = signInFailed.error;
            }
            if ((i11 & 4) != 0) {
                str3 = signInFailed.errorDescription;
            }
            return signInFailed.copy(str, str2, str3);
        }

        public final String getProvider() {
            return this.provider;
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final SignInFailed copy(String provider, String error, String errorDescription) {
            m.e(provider, "provider");
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            return new SignInFailed(provider, error, errorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignInFailed)) {
                return false;
            }
            SignInFailed signInFailed = (SignInFailed) other;
            return m.a(this.provider, signInFailed.provider) && m.a(this.error, signInFailed.error) && m.a(this.errorDescription, signInFailed.errorDescription);
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.errorDescription.hashCode() + x5.e(this.provider.hashCode() * 31, this.error, 31);
        }

        public String toString() {
            String str = this.provider;
            String str2 = this.error;
            return x5.n(b.s("SignInFailed(provider=", str, ", error=", str2, ", errorDescription="), this.errorDescription, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignUpCompleted;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "provider", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "component1", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignUpCompleted extends AuthEvent {
        public static final int $stable = 0;
        private final String provider;

        public SignUpCompleted(String provider) {
            super(null);
            m.e(provider, "provider");
            this.provider = provider;
        }

        public static SignUpCompleted copy$default(SignUpCompleted signUpCompleted, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signUpCompleted.provider;
            }
            return signUpCompleted.copy(str);
        }

        public final String getProvider() {
            return this.provider;
        }

        public final SignUpCompleted copy(String provider) {
            m.e(provider, "provider");
            return new SignUpCompleted(provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignUpCompleted) && m.a(this.provider, ((SignUpCompleted) other).provider);
        }

        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public String toString() {
            return b.p("SignUpCompleted(provider=", this.provider, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignUpFailed;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "provider", RuntimeVersion.SUFFIX, "error", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "getError", "getErrorDescription", "component1", "component2", "component3", "copy", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignUpFailed extends AuthEvent {
        public static final int $stable = 0;
        private final String error;
        private final String errorDescription;
        private final String provider;

        public SignUpFailed(String provider, String error, String errorDescription) {
            super(null);
            m.e(provider, "provider");
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            this.provider = provider;
            this.error = error;
            this.errorDescription = errorDescription;
        }

        public static SignUpFailed copy$default(SignUpFailed signUpFailed, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signUpFailed.provider;
            }
            if ((i11 & 2) != 0) {
                str2 = signUpFailed.error;
            }
            if ((i11 & 4) != 0) {
                str3 = signUpFailed.errorDescription;
            }
            return signUpFailed.copy(str, str2, str3);
        }

        public final String getProvider() {
            return this.provider;
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final SignUpFailed copy(String provider, String error, String errorDescription) {
            m.e(provider, "provider");
            m.e(error, "error");
            m.e(errorDescription, "errorDescription");
            return new SignUpFailed(provider, error, errorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUpFailed)) {
                return false;
            }
            SignUpFailed signUpFailed = (SignUpFailed) other;
            return m.a(this.provider, signUpFailed.provider) && m.a(this.error, signUpFailed.error) && m.a(this.errorDescription, signUpFailed.errorDescription);
        }

        public final String getError() {
            return this.error;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.errorDescription.hashCode() + x5.e(this.provider.hashCode() * 31, this.error, 31);
        }

        public String toString() {
            String str = this.provider;
            String str2 = this.error;
            return x5.n(b.s("SignUpFailed(provider=", str, ", error=", str2, ", errorDescription="), this.errorDescription, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent$SignedOut;", "Lcom/mchutov/quranify/auth/presentation/analytics/AuthEvent;", "<init>", "()V", "equals", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "hashCode", RuntimeVersion.SUFFIX, "toString", RuntimeVersion.SUFFIX, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignedOut extends AuthEvent {
        public static final int $stable = 0;
        public static final SignedOut INSTANCE = new SignedOut();

        private SignedOut() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SignedOut);
        }

        public int hashCode() {
            return -868348074;
        }

        public String toString() {
            return "SignedOut";
        }
    }

    private AuthEvent() {
    }

    public AuthEvent(f fVar) {
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
