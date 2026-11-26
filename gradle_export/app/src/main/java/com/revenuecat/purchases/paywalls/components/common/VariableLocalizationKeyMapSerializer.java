package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import p40.b1;
import p40.g0;
import ta.c0;
import u00.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKeyMapSerializer;", "Ll40/a;", "", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/Map;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/Map;", "delegate", "Ll40/a;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableLocalizationKeyMapSerializer implements a {
    public static final VariableLocalizationKeyMapSerializer INSTANCE = new VariableLocalizationKeyMapSerializer();
    private static final a delegate;
    private static final e descriptor;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final VariableLocalizationKey invoke(Map.Entry<String, String> entry) {
            m.e(entry, "<name for destructuring parameter 0>");
            try {
                String upperCase = entry.getKey().toUpperCase(Locale.ROOT);
                m.d(upperCase, "toUpperCase(...)");
                return VariableLocalizationKey.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    static {
        b1 b1Var = b1.a;
        g0 g0VarC = c0.c(b1Var, b1Var);
        delegate = g0VarC;
        descriptor = g0VarC.c;
    }

    private VariableLocalizationKeyMapSerializer() {
    }

    @Override
    public Map<VariableLocalizationKey, String> deserialize(c decoder) {
        m.e(decoder, "decoder");
        return MapExtensionsKt.mapNotNullKeys((Map) decoder.j(delegate), AnonymousClass1.INSTANCE);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, Map<VariableLocalizationKey, String> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
    }
}
