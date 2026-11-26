package com.revenuecat.purchases.customercenter;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import q40.j;
import q40.l;
import ta.c0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/customercenter/HelpPathsSerializer;", "Ll40/a;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/List;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/List;)V", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HelpPathsSerializer implements a {
    public static final HelpPathsSerializer INSTANCE = new HelpPathsSerializer();
    private static final e descriptor = c0.b(CustomerCenterConfigData.HelpPath.INSTANCE.serializer()).b;

    private HelpPathsSerializer() {
    }

    @Override
    public List<CustomerCenterConfigData.HelpPath> deserialize(c decoder) {
        m.e(decoder, "decoder");
        ArrayList arrayList = new ArrayList();
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        Iterator it = q40.m.f(jVar.m()).A.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(jVar.y().a(CustomerCenterConfigData.HelpPath.INSTANCE.serializer(), (l) it.next()));
            } catch (IllegalArgumentException e) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Issue deserializing CustomerCenter HelpPath. Ignoring. Error: " + e);
                }
            }
        }
        return arrayList;
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, List<CustomerCenterConfigData.HelpPath> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        c0.b(CustomerCenterConfigData.HelpPath.INSTANCE.serializer()).serialize(encoder, value);
    }
}
