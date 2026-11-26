package com.revenuecat.purchases;

import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p40.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/PeriodType;", "", "(Ljava/lang/String;I)V", "NORMAL", "INTRO", "TRIAL", "PREPAID", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PeriodType {
    NORMAL,
    INTRO,
    TRIAL,
    PREPAID;


    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/PeriodType$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/PeriodType;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final l40.a invoke() {
                return o0.d("com.revenuecat.purchases.PeriodType", PeriodType.values(), new String[]{"normal", "intro", "trial", "prepaid"}, new Annotation[][]{null, null, null, null});
            }
        }

        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        private final l40.a get$cachedSerializer() {
            return (l40.a) PeriodType.$cachedSerializer$delegate.getValue();
        }

        public final l40.a serializer() {
            return get$cachedSerializer();
        }
    }
}
