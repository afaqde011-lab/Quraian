package com.mchutov.core.analytics.domain.model;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/AnalyticsProperty;", "", DiagnosticsEntry.NAME_KEY, "", "getName", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface AnalyticsProperty {
    String getName();

    Object getValue();
}
