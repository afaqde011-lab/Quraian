package com.revenuecat.purchases.paywalls.components.common.serializers;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/serializers/UpgradeReplacementModeDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpgradeReplacementModeDeserializer extends EnumDeserializerWithDefault<GoogleReplacementMode> {
    public static final UpgradeReplacementModeDeserializer INSTANCE = new UpgradeReplacementModeDeserializer();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final String invoke(GoogleReplacementMode value) {
            m.e(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private UpgradeReplacementModeDeserializer() {
        super(GoogleReplacementMode.CHARGE_PRORATED_PRICE, AnonymousClass1.INSTANCE);
    }
}
