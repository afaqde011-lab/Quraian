package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import g00.c;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004*)+,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBS\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010$¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "style", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "countdownStack", "endStack", "fallback", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getCountdownStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getCountdownStack$annotations", "getEndStack", "getEndStack$annotations", "getFallback", "Companion", "$serializer", "CountFrom", "CountdownStyle", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CountdownComponent implements PaywallComponent {
    private final CountFrom countFrom;
    private final StackComponent countdownStack;
    private final StackComponent endStack;
    private final StackComponent fallback;
    private final CountdownStyle style;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, CountFrom.INSTANCE.serializer(), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CountdownComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "", "(Ljava/lang/String;I)V", "DAYS", "HOURS", "MINUTES", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CountFrom {
        DAYS,
        HOURS,
        MINUTES;


        public static final Companion INSTANCE = new Companion(null);
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return o0.d("com.revenuecat.purchases.paywalls.components.CountdownComponent.CountFrom", CountFrom.values(), new String[]{"days", "hours", "minutes"}, new Annotation[][]{null, null, null});
                }
            }

            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            private final a get$cachedSerializer() {
                return (a) CountFrom.$cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "", "", "type", "Ljava/util/Date;", "date", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "getDate$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CountdownStyle {

        public static final Companion INSTANCE = new Companion(null);
        private final Date date;
        private final String type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CountdownComponent$CountdownStyle$$serializer.INSTANCE;
            }
        }

        @c
        public CountdownStyle(int i, String str, Date date, x0 x0Var) {
            if (3 != (i & 3)) {
                o0.g(i, 3, CountdownComponent$CountdownStyle$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = str;
            this.date = date;
        }

        public CountdownStyle(String type, Date date) {
            m.e(type, "type");
            m.e(date, "date");
            this.type = type;
            this.date = date;
        }

        public static void getDate$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(CountdownStyle self, b output, e serialDesc) {
            output.i(serialDesc, 0, self.type);
            output.C(serialDesc, 1, ISO8601DateSerializer.INSTANCE, self.date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountdownStyle)) {
                return false;
            }
            CountdownStyle countdownStyle = (CountdownStyle) obj;
            return m.a(this.type, countdownStyle.type) && m.a(this.date, countdownStyle.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "CountdownStyle(type=" + this.type + ", date=" + this.date + ')';
        }
    }

    @c
    public CountdownComponent(int i, CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, x0 x0Var) {
        if (5 != (i & 5)) {
            o0.g(i, 5, CountdownComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.style = countdownStyle;
        if ((i & 2) == 0) {
            this.countFrom = CountFrom.DAYS;
        } else {
            this.countFrom = countFrom;
        }
        this.countdownStack = stackComponent;
        if ((i & 8) == 0) {
            this.endStack = null;
        } else {
            this.endStack = stackComponent2;
        }
        if ((i & 16) == 0) {
            this.fallback = null;
        } else {
            this.fallback = stackComponent3;
        }
    }

    public CountdownComponent(CountdownStyle style, CountFrom countFrom, StackComponent countdownStack, StackComponent stackComponent, StackComponent stackComponent2) {
        m.e(style, "style");
        m.e(countFrom, "countFrom");
        m.e(countdownStack, "countdownStack");
        this.style = style;
        this.countFrom = countFrom;
        this.countdownStack = countdownStack;
        this.endStack = stackComponent;
        this.fallback = stackComponent2;
    }

    public CountdownComponent(CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, int i, f fVar) {
        this(countdownStyle, (i & 2) != 0 ? CountFrom.DAYS : countFrom, stackComponent, (i & 8) != 0 ? null : stackComponent2, (i & 16) != 0 ? null : stackComponent3);
    }

    public static void getCountFrom$annotations() {
    }

    public static void getCountdownStack$annotations() {
    }

    public static void getEndStack$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(CountdownComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, self.style);
        if (output.k(serialDesc) || self.countFrom != CountFrom.DAYS) {
            output.C(serialDesc, 1, aVarArr[1], self.countFrom);
        }
        StackComponent$$serializer stackComponent$$serializer = StackComponent$$serializer.INSTANCE;
        output.C(serialDesc, 2, stackComponent$$serializer, self.countdownStack);
        if (output.k(serialDesc) || self.endStack != null) {
            output.x(serialDesc, 3, stackComponent$$serializer, self.endStack);
        }
        if (!output.k(serialDesc) && self.fallback == null) {
            return;
        }
        output.x(serialDesc, 4, stackComponent$$serializer, self.fallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownComponent)) {
            return false;
        }
        CountdownComponent countdownComponent = (CountdownComponent) obj;
        return m.a(this.style, countdownComponent.style) && this.countFrom == countdownComponent.countFrom && m.a(this.countdownStack, countdownComponent.countdownStack) && m.a(this.endStack, countdownComponent.endStack) && m.a(this.fallback, countdownComponent.fallback);
    }

    public final CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final StackComponent getCountdownStack() {
        return this.countdownStack;
    }

    public final StackComponent getEndStack() {
        return this.endStack;
    }

    public final StackComponent getFallback() {
        return this.fallback;
    }

    public final CountdownStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = (this.countdownStack.hashCode() + ((this.countFrom.hashCode() + (this.style.hashCode() * 31)) * 31)) * 31;
        StackComponent stackComponent = this.endStack;
        int iHashCode2 = (iHashCode + (stackComponent == null ? 0 : stackComponent.hashCode())) * 31;
        StackComponent stackComponent2 = this.fallback;
        return iHashCode2 + (stackComponent2 != null ? stackComponent2.hashCode() : 0);
    }

    public String toString() {
        return "CountdownComponent(style=" + this.style + ", countFrom=" + this.countFrom + ", countdownStack=" + this.countdownStack + ", endStack=" + this.endStack + ", fallback=" + this.fallback + ')';
    }
}
