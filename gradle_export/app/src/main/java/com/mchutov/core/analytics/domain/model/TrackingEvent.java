package com.mchutov.core.analytics.domain.model;

import a10.t;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import d10.e1;
import d10.j;
import d10.j1;
import f50.c;
import g00.k;
import h00.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import k00.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/mchutov/core/analytics/domain/model/TrackingEvent;", "Lcom/mchutov/core/analytics/domain/model/AnalyticsEvent;", "La10/t;", "property", "Lg00/k;", "", "", "transformProperties", "(La10/t;)Lg00/k;", "getName", "()Ljava/lang/String;", DiagnosticsEntry.NAME_KEY, "", "getParams", "()Ljava/util/Map;", "params", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface TrackingEvent extends AnalyticsEvent {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String getName(TrackingEvent trackingEvent) {
            return TrackingEvent.super.getName();
        }

        @Deprecated
        public static Map<String, Object> getParams(TrackingEvent trackingEvent) {
            return TrackingEvent.super.getParams();
        }

        @Deprecated
        public static k transformProperties(TrackingEvent trackingEvent, t property) {
            m.e(property, "property");
            return TrackingEvent.super.transformProperties(property);
        }
    }

    @Override
    default String getName() {
        String strG = c.G(getClass().getSimpleName());
        Locale ROOT = Locale.ROOT;
        m.d(ROOT, "ROOT");
        String lowerCase = strG.toLowerCase(ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override
    default Map<String, Object> getParams() {
        Collection collectionA = ((e1) ((j1) f.I(getClass())).C.getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            j jVar = (j) obj;
            if (jVar.w().X() == null && (jVar instanceof t)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVarTransformProperties = transformProperties((t) it.next());
            if (kVarTransformProperties != null) {
                arrayList2.add(kVarTransformProperties);
            }
        }
        return d0.Y(arrayList2);
    }

    default k transformProperties(t property) {
        m.e(property, "property");
        Object obj = property.get(this);
        if (obj == null || m.a(property.getName(), DiagnosticsEntry.NAME_KEY)) {
            return null;
        }
        if ((obj instanceof String) && r30.k.L0((CharSequence) obj)) {
            return null;
        }
        return new k(c.G(property.getName()), obj);
    }
}
