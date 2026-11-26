package com.revenuecat.purchases.customercenter;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import q40.j;
import q40.l;
import ta.c0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/customercenter/ScreenMapSerializer;", "Ll40/a;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/Map;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/Map;)V", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScreenMapSerializer implements a {
    public static final ScreenMapSerializer INSTANCE = new ScreenMapSerializer();
    private static final e descriptor = c0.c(CustomerCenterConfigData.Screen.ScreenType.INSTANCE.serializer(), CustomerCenterConfigData.Screen.INSTANCE.serializer()).c;

    private ScreenMapSerializer() {
    }

    @Override
    public Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> deserialize(c decoder) {
        m.e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        for (Map.Entry entry : q40.m.g(jVar.m()).A.entrySet()) {
            String str = (String) entry.getKey();
            try {
                linkedHashMap.put(CustomerCenterConfigData.Screen.ScreenType.valueOf(str), jVar.y().a(CustomerCenterConfigData.Screen.INSTANCE.serializer(), (l) entry.getValue()));
            } catch (IllegalArgumentException unused) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Unknown CustomerCenter ScreenType: " + str + ". Ignoring.");
                }
            }
        }
        return linkedHashMap;
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        c0.c(CustomerCenterConfigData.Screen.ScreenType.INSTANCE.serializer(), CustomerCenterConfigData.Screen.INSTANCE.serializer()).serialize(encoder, value);
    }
}
