package com.revenuecat.purchases;

import g00.h;
import g00.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p40.o0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "", "(Ljava/lang/String;I)V", "postReceiptFieldValue", "", "getPostReceiptFieldValue", "()Ljava/lang/String;", "RESTORE", "PURCHASE", "UNSYNCED_ACTIVE_PURCHASES", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;


    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final l40.a invoke() {
                return o0.e("com.revenuecat.purchases.PostReceiptInitiationSource", PostReceiptInitiationSource.values());
            }
        }

        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        private final l40.a get$cachedSerializer() {
            return (l40.a) PostReceiptInitiationSource.$cachedSerializer$delegate.getValue();
        }

        public final l40.a serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getPostReceiptFieldValue() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "restore";
        }
        if (i == 2) {
            return "purchase";
        }
        if (i == 3) {
            return "unsynced_active_purchases";
        }
        throw new NoWhenBranchMatchedException();
    }
}
