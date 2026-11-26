package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FontStyleDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontStyleDeserializer extends EnumDeserializerWithDefault<FontStyle> {
    public static final FontStyleDeserializer INSTANCE = new FontStyleDeserializer();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FontStyle.values().length];
                try {
                    iArr[FontStyle.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FontStyle.ITALIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final String invoke(FontStyle value) {
            m.e(value, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i == 1) {
                return "normal";
            }
            if (i == 2) {
                return "italic";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private FontStyleDeserializer() {
        super(FontStyle.NORMAL, AnonymousClass1.INSTANCE);
    }
}
