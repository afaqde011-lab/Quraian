package com.mchutov.core.analytics.domain.model;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f50.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "Lcom/mchutov/core/analytics/domain/model/AnalyticsProperty;", "<init>", "()V", DiagnosticsEntry.NAME_KEY, "", "getName", "()Ljava/lang/String;", "PreferredReciter", "PreferredBackgroundSound", "UserId", "BirthDay", "Email", "Sex", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$BirthDay;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$Email;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$PreferredBackgroundSound;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$PreferredReciter;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$Sex;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$UserId;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class QuranifyAnalyticsProperty implements AnalyticsProperty {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$BirthDay;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BirthDay extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public BirthDay(Object obj) {
            super(null);
            this.value = obj;
        }

        public static BirthDay copy$default(BirthDay birthDay, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = birthDay.value;
            }
            return birthDay.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final BirthDay copy(Object value) {
            return new BirthDay(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BirthDay) && m.a(this.value, ((BirthDay) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "BirthDay(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$Email;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Email extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public Email(Object obj) {
            super(null);
            this.value = obj;
        }

        public static Email copy$default(Email email, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = email.value;
            }
            return email.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final Email copy(Object value) {
            return new Email(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && m.a(this.value, ((Email) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "Email(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$PreferredBackgroundSound;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PreferredBackgroundSound extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public PreferredBackgroundSound(Object value) {
            super(null);
            m.e(value, "value");
            this.value = value;
        }

        public static PreferredBackgroundSound copy$default(PreferredBackgroundSound preferredBackgroundSound, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = preferredBackgroundSound.value;
            }
            return preferredBackgroundSound.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final PreferredBackgroundSound copy(Object value) {
            m.e(value, "value");
            return new PreferredBackgroundSound(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreferredBackgroundSound) && m.a(this.value, ((PreferredBackgroundSound) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "PreferredBackgroundSound(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$PreferredReciter;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PreferredReciter extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public PreferredReciter(Object value) {
            super(null);
            m.e(value, "value");
            this.value = value;
        }

        public static PreferredReciter copy$default(PreferredReciter preferredReciter, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = preferredReciter.value;
            }
            return preferredReciter.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final PreferredReciter copy(Object value) {
            m.e(value, "value");
            return new PreferredReciter(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreferredReciter) && m.a(this.value, ((PreferredReciter) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "PreferredReciter(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$Sex;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Sex extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public Sex(Object obj) {
            super(null);
            this.value = obj;
        }

        public static Sex copy$default(Sex sex, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = sex.value;
            }
            return sex.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final Sex copy(Object value) {
            return new Sex(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sex) && m.a(this.value, ((Sex) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "Sex(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty$UserId;", "Lcom/mchutov/core/analytics/domain/model/QuranifyAnalyticsProperty;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserId extends QuranifyAnalyticsProperty {
        public static final int $stable = 8;
        private final Object value;

        public UserId(Object obj) {
            super(null);
            this.value = obj;
        }

        public static UserId copy$default(UserId userId, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = userId.value;
            }
            return userId.copy(obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public final UserId copy(Object value) {
            return new UserId(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserId) && m.a(this.value, ((UserId) other).value);
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return x5.l(this.value, "UserId(value=", ")");
        }
    }

    private QuranifyAnalyticsProperty() {
    }

    public QuranifyAnalyticsProperty(f fVar) {
        this();
    }

    @Override
    public String getName() {
        String lowerCase = c.G(getClass().getSimpleName()).toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
