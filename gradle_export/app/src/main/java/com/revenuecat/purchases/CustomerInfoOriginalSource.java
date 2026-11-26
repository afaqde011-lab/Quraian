package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "", "(Ljava/lang/String;I)V", "MAIN", "LOAD_SHEDDER", "OFFLINE_ENTITLEMENTS", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoOriginalSource {
    MAIN,
    LOAD_SHEDDER,
    OFFLINE_ENTITLEMENTS;

    private static final CustomerInfoOriginalSource DEFAULT = new CustomerInfoOriginalSource();

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoOriginalSource$Companion;", "", "()V", "DEFAULT", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "getDEFAULT", "()Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "fromString", "originalSourceString", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final CustomerInfoOriginalSource fromString(String originalSourceString) {
            if (originalSourceString == null) {
                return getDEFAULT();
            }
            try {
                return CustomerInfoOriginalSource.valueOf(originalSourceString);
            } catch (IllegalArgumentException e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid CustomerInfo original source deserializing from cache", e);
                return getDEFAULT();
            }
        }

        public final CustomerInfoOriginalSource getDEFAULT() {
            return CustomerInfoOriginalSource.DEFAULT;
        }
    }

    static {
    }

    private CustomerInfoOriginalSource() {
        super(str, i);
    }

    public static CustomerInfoOriginalSource valueOf(String str) {
        return (CustomerInfoOriginalSource) Enum.valueOf(CustomerInfoOriginalSource.class, str);
    }

    public static CustomerInfoOriginalSource[] values() {
        return (CustomerInfoOriginalSource[]) $VALUES.clone();
    }
}
