package com.mchutov.core.analytics.domain.model;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/AnalyticsEvent;", "", DiagnosticsEntry.NAME_KEY, "", "getName", "()Ljava/lang/String;", "params", "", "getParams", "()Ljava/util/Map;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface AnalyticsEvent {
    String getName();

    Map<String, Object> getParams();
}
