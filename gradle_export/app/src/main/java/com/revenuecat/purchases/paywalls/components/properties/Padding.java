package com.revenuecat.purchases.paywalls.components.properties;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l40.a;
import n40.e;
import o40.b;
import p40.x0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "", "", "top", "bottom", "leading", "trailing", "<init>", "(DDDD)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IDDDDLp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lo40/b;Ln40/e;)V", "write$Self", "D", "getTop", "()D", "getBottom", "getLeading", "getTrailing", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Padding {
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;

    public static final Companion INSTANCE = new Companion(null);
    private static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);

    private static final Padding f3default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "serializer", "()Ll40/a;", "zero", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getZero", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "default", "getDefault", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final Padding getDefault() {
            return Padding.f3default;
        }

        public final Padding getZero() {
            return Padding.zero;
        }

        public final a serializer() {
            return Padding$$serializer.INSTANCE;
        }
    }

    public Padding() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (f) null);
    }

    public Padding(double d, double d2, double d3, double d4) {
        this.top = d;
        this.bottom = d2;
        this.leading = d3;
        this.trailing = d4;
    }

    public Padding(double d, double d2, double d3, double d4, int i, f fVar) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
    }

    @c
    public Padding(int i, double d, double d2, double d3, double d4, x0 x0Var) {
        if ((i & 1) == 0) {
            this.top = 0.0d;
        } else {
            this.top = d;
        }
        if ((i & 2) == 0) {
            this.bottom = 0.0d;
        } else {
            this.bottom = d2;
        }
        if ((i & 4) == 0) {
            this.leading = 0.0d;
        } else {
            this.leading = d3;
        }
        if ((i & 8) == 0) {
            this.trailing = 0.0d;
        } else {
            this.trailing = d4;
        }
    }

    public static final void write$Self$purchases_defaultsBc8Release(Padding self, b output, e serialDesc) {
        if (output.k(serialDesc) || Double.compare(self.top, 0.0d) != 0) {
            output.B(serialDesc, 0, self.top);
        }
        if (output.k(serialDesc) || Double.compare(self.bottom, 0.0d) != 0) {
            output.B(serialDesc, 1, self.bottom);
        }
        if (output.k(serialDesc) || Double.compare(self.leading, 0.0d) != 0) {
            output.B(serialDesc, 2, self.leading);
        }
        if (!output.k(serialDesc) && Double.compare(self.trailing, 0.0d) == 0) {
            return;
        }
        output.B(serialDesc, 3, self.trailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeading() {
        return this.leading;
    }

    public final double getTop() {
        return this.top;
    }

    public final double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return Double.hashCode(this.trailing) + ((Double.hashCode(this.leading) + ((Double.hashCode(this.bottom) + (Double.hashCode(this.top) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }
}
