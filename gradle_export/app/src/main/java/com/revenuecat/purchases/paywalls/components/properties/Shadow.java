package com.revenuecat.purchases.paywalls.components.properties;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "", "radius", "x", "y", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDD)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDDLp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "D", "getRadius", "()D", "getX", "getY", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shadow {

    public static final Companion INSTANCE = new Companion(null);
    private final ColorScheme color;
    private final double radius;
    private final double x;
    private final double y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return Shadow$$serializer.INSTANCE;
        }
    }

    @c
    public Shadow(int i, ColorScheme colorScheme, double d, double d2, double d3, x0 x0Var) {
        if (15 != (i & 15)) {
            o0.g(i, 15, Shadow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.color = colorScheme;
        this.radius = d;
        this.x = d2;
        this.y = d3;
    }

    public Shadow(ColorScheme color, double d, double d2, double d3) {
        m.e(color, "color");
        this.color = color;
        this.radius = d;
        this.x = d2;
        this.y = d3;
    }

    public static final void write$Self$purchases_defaultsBc8Release(Shadow self, b output, e serialDesc) {
        output.C(serialDesc, 0, ColorScheme$$serializer.INSTANCE, self.color);
        output.B(serialDesc, 1, self.radius);
        output.B(serialDesc, 2, self.x);
        output.B(serialDesc, 3, self.y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return m.a(this.color, shadow.color) && Double.compare(this.radius, shadow.radius) == 0 && Double.compare(this.x, shadow.x) == 0 && Double.compare(this.y, shadow.y) == 0;
    }

    public final ColorScheme getColor() {
        return this.color;
    }

    public final double getRadius() {
        return this.radius;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + ((Double.hashCode(this.x) + ((Double.hashCode(this.radius) + (this.color.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Shadow(color=" + this.color + ", radius=" + this.radius + ", x=" + this.x + ", y=" + this.y + ')';
    }
}
