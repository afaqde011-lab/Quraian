package com.mchutov.quranify.settings.presentation.analytics;

import a10.t;
import com.mchutov.core.analytics.domain.model.TrackingEvent;
import g00.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent;", "Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "<init>", "()V", "SettingsOpened", "FeatureRequestClicked", "BugReportClicked", "LanguageSettingsClicked", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$BugReportClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$FeatureRequestClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$LanguageSettingsClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$SettingsOpened;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SettingsEvent implements TrackingEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$BugReportClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BugReportClicked extends SettingsEvent {
        public static final int $stable = 0;
        public static final BugReportClicked INSTANCE = new BugReportClicked();

        private BugReportClicked() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BugReportClicked);
        }

        public int hashCode() {
            return 546921585;
        }

        public String toString() {
            return "BugReportClicked";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$FeatureRequestClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureRequestClicked extends SettingsEvent {
        public static final int $stable = 0;
        public static final FeatureRequestClicked INSTANCE = new FeatureRequestClicked();

        private FeatureRequestClicked() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FeatureRequestClicked);
        }

        public int hashCode() {
            return -231753668;
        }

        public String toString() {
            return "FeatureRequestClicked";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$LanguageSettingsClicked;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LanguageSettingsClicked extends SettingsEvent {
        public static final int $stable = 0;
        public static final LanguageSettingsClicked INSTANCE = new LanguageSettingsClicked();

        private LanguageSettingsClicked() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LanguageSettingsClicked);
        }

        public int hashCode() {
            return -226632294;
        }

        public String toString() {
            return "LanguageSettingsClicked";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent$SettingsOpened;", "Lcom/mchutov/quranify/settings/presentation/analytics/SettingsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SettingsOpened extends SettingsEvent {
        public static final int $stable = 0;
        public static final SettingsOpened INSTANCE = new SettingsOpened();

        private SettingsOpened() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SettingsOpened);
        }

        public int hashCode() {
            return 61582622;
        }

        public String toString() {
            return "SettingsOpened";
        }
    }

    private SettingsEvent() {
    }

    public SettingsEvent(f fVar) {
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
