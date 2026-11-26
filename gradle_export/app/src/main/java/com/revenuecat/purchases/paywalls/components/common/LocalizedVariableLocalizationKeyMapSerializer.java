package com.revenuecat.purchases.paywalls.components.common;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import p40.g0;
import ta.c0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0012\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizedVariableLocalizationKeyMapSerializer;", "Ll40/a;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/Map;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/Map;", "delegate", "Ll40/a;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalizedVariableLocalizationKeyMapSerializer implements a {
    public static final LocalizedVariableLocalizationKeyMapSerializer INSTANCE = new LocalizedVariableLocalizationKeyMapSerializer();
    private static final a delegate;
    private static final e descriptor;

    static {
        g0 g0VarC = c0.c(LocaleId.INSTANCE.serializer(), VariableLocalizationKeyMapSerializer.INSTANCE);
        delegate = g0VarC;
        descriptor = g0VarC.c;
    }

    private LocalizedVariableLocalizationKeyMapSerializer() {
    }

    @Override
    public Map<LocaleId, Map<VariableLocalizationKey, String>> deserialize(c decoder) {
        m.e(decoder, "decoder");
        return (Map) delegate.deserialize(decoder);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
    }
}
