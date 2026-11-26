package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import h00.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.c;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0005@?ABCBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f¢\u0006\u0004\b\u0015\u0010\u0016B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b:\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b>\u0010=¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "items", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "overrides", "<init>", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;Lo40/b;Ln40/e;)V", "write$Self", "I", "getItemSpacing", "()I", "getItemSpacing$annotations", "()V", "getTextSpacing", "getTextSpacing$annotations", "getColumnGutter", "getColumnGutter$annotations", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment$annotations", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getOverrides", "Companion", "$serializer", "Connector", "IconAlignment", "Item", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimelineComponent implements PaywallComponent {
    private final int columnGutter;
    private final IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List<Item> items;
    private final Padding margin;
    private final List<ComponentOverride<PartialTimelineComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final int textSpacing;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, new c(TimelineComponent$Item$$serializer.INSTANCE), new c(ComponentOverride.INSTANCE.serializer(PartialTimelineComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TimelineComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "", "", "width", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "<init>", "(ILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Lo40/b;Ln40/e;)V", "write$Self", "I", "getWidth", "()I", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Connector {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorScheme color;
        private final Padding margin;
        private final int width;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return TimelineComponent$Connector$$serializer.INSTANCE;
            }
        }

        @g00.c
        public Connector(int i, int i2, Padding padding, ColorScheme colorScheme, x0 x0Var) {
            if (7 != (i & 7)) {
                o0.g(i, 7, TimelineComponent$Connector$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.width = i2;
            this.margin = padding;
            this.color = colorScheme;
        }

        public Connector(int i, Padding margin, ColorScheme color) {
            m.e(margin, "margin");
            m.e(color, "color");
            this.width = i;
            this.margin = margin;
            this.color = color;
        }

        public static final void write$Self$purchases_defaultsBc8Release(Connector self, b output, e serialDesc) {
            output.w(0, self.width, serialDesc);
            output.C(serialDesc, 1, Padding$$serializer.INSTANCE, self.margin);
            output.C(serialDesc, 2, ColorScheme$$serializer.INSTANCE, self.color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connector)) {
                return false;
            }
            Connector connector = (Connector) obj;
            return this.width == connector.width && m.a(this.margin, connector.margin) && m.a(this.color, connector.color);
        }

        public final ColorScheme getColor() {
            return this.color;
        }

        public final Padding getMargin() {
            return this.margin;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.color.hashCode() + ((this.margin.hashCode() + (this.width * 31)) * 31);
        }

        public String toString() {
            return "Connector(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "", "(Ljava/lang/String;I)V", "Title", "TitleAndDescription", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum IconAlignment {
        Title,
        TitleAndDescription;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return TimelineIconAlignmentDeserializer.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "title", "", "visible", "description", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "icon", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "connector", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/TextComponent;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "getTitle", "()Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getDescription", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "getIcon", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "getConnector", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Item {
        private final Connector connector;
        private final TextComponent description;
        private final IconComponent icon;
        private final List<ComponentOverride<PartialTimelineComponentItem>> overrides;
        private final TextComponent title;
        private final Boolean visible;

        public static final Companion INSTANCE = new Companion(null);
        private static final a[] $childSerializers = {null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialTimelineComponentItem$$serializer.INSTANCE))};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return TimelineComponent$Item$$serializer.INSTANCE;
            }
        }

        @g00.c
        public Item(int i, TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, x0 x0Var) {
            if (9 != (i & 9)) {
                o0.g(i, 9, TimelineComponent$Item$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = textComponent;
            if ((i & 2) == 0) {
                this.visible = null;
            } else {
                this.visible = bool;
            }
            if ((i & 4) == 0) {
                this.description = null;
            } else {
                this.description = textComponent2;
            }
            this.icon = iconComponent;
            if ((i & 16) == 0) {
                this.connector = null;
            } else {
                this.connector = connector;
            }
            if ((i & 32) == 0) {
                this.overrides = x.A;
            } else {
                this.overrides = list;
            }
        }

        public Item(TextComponent title, Boolean bool, TextComponent textComponent, IconComponent icon, Connector connector, List<ComponentOverride<PartialTimelineComponentItem>> overrides) {
            m.e(title, "title");
            m.e(icon, "icon");
            m.e(overrides, "overrides");
            this.title = title;
            this.visible = bool;
            this.description = textComponent;
            this.icon = icon;
            this.connector = connector;
            this.overrides = overrides;
        }

        public Item(TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, int i, f fVar) {
            this(textComponent, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : textComponent2, iconComponent, (i & 16) != 0 ? null : connector, (i & 32) != 0 ? x.A : list);
        }

        public static final void write$Self$purchases_defaultsBc8Release(Item self, b output, e serialDesc) {
            a[] aVarArr = $childSerializers;
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            output.C(serialDesc, 0, textComponent$$serializer, self.title);
            if (output.k(serialDesc) || self.visible != null) {
                output.x(serialDesc, 1, p40.f.a, self.visible);
            }
            if (output.k(serialDesc) || self.description != null) {
                output.x(serialDesc, 2, textComponent$$serializer, self.description);
            }
            output.C(serialDesc, 3, IconComponent$$serializer.INSTANCE, self.icon);
            if (output.k(serialDesc) || self.connector != null) {
                output.x(serialDesc, 4, TimelineComponent$Connector$$serializer.INSTANCE, self.connector);
            }
            if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
                return;
            }
            output.C(serialDesc, 5, aVarArr[5], self.overrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return m.a(this.title, item.title) && m.a(this.visible, item.visible) && m.a(this.description, item.description) && m.a(this.icon, item.icon) && m.a(this.connector, item.connector) && m.a(this.overrides, item.overrides);
        }

        public final Connector getConnector() {
            return this.connector;
        }

        public final TextComponent getDescription() {
            return this.description;
        }

        public final IconComponent getIcon() {
            return this.icon;
        }

        public final List getOverrides() {
            return this.overrides;
        }

        public final TextComponent getTitle() {
            return this.title;
        }

        public final Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Boolean bool = this.visible;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            TextComponent textComponent = this.description;
            int iHashCode3 = (this.icon.hashCode() + ((iHashCode2 + (textComponent == null ? 0 : textComponent.hashCode())) * 31)) * 31;
            Connector connector = this.connector;
            return this.overrides.hashCode() + ((iHashCode3 + (connector != null ? connector.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.title);
            sb.append(", visible=");
            sb.append(this.visible);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", connector=");
            sb.append(this.connector);
            sb.append(", overrides=");
            return k.n(sb, this.overrides, ')');
        }
    }

    @g00.c
    public TimelineComponent(int i, int i2, int i3, int i4, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, x0 x0Var) {
        if (15 != (i & 15)) {
            o0.g(i, 15, TimelineComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemSpacing = i2;
        this.textSpacing = i3;
        this.columnGutter = i4;
        this.iconAlignment = iconAlignment;
        if ((i & 16) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 32) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 64) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        int i5 = i & 256;
        x xVar = x.A;
        if (i5 == 0) {
            this.items = xVar;
        } else {
            this.items = list;
        }
        if ((i & 512) == 0) {
            this.overrides = xVar;
        } else {
            this.overrides = list2;
        }
    }

    public TimelineComponent(int i, int i2, int i3, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding margin, List<Item> items, List<ComponentOverride<PartialTimelineComponent>> overrides) {
        m.e(iconAlignment, "iconAlignment");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(items, "items");
        m.e(overrides, "overrides");
        this.itemSpacing = i;
        this.textSpacing = i2;
        this.columnGutter = i3;
        this.iconAlignment = iconAlignment;
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.items = items;
        this.overrides = overrides;
    }

    public TimelineComponent(int i, int i2, int i3, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, int i4, f fVar) {
        Boolean bool2 = (i4 & 16) != 0 ? null : bool;
        Size size2 = (i4 & 32) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        Padding zero = (i4 & 64) != 0 ? Padding.INSTANCE.getZero() : padding;
        Padding zero2 = (i4 & 128) != 0 ? Padding.INSTANCE.getZero() : padding2;
        int i5 = i4 & 256;
        x xVar = x.A;
        this(i, i2, i3, iconAlignment, bool2, size2, zero, zero2, i5 != 0 ? xVar : list, (i4 & 512) != 0 ? xVar : list2);
    }

    public static void getColumnGutter$annotations() {
    }

    public static void getIconAlignment$annotations() {
    }

    public static void getItemSpacing$annotations() {
    }

    public static void getTextSpacing$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(TimelineComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.w(0, self.itemSpacing, serialDesc);
        output.w(1, self.textSpacing, serialDesc);
        output.w(2, self.columnGutter, serialDesc);
        output.C(serialDesc, 3, TimelineIconAlignmentDeserializer.INSTANCE, self.iconAlignment);
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 4, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.C(serialDesc, 5, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 6, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 7, Padding$$serializer.INSTANCE, self.margin);
        }
        boolean zK = output.k(serialDesc);
        x xVar = x.A;
        if (zK || !m.a(self.items, xVar)) {
            output.C(serialDesc, 8, aVarArr[8], self.items);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, xVar)) {
            return;
        }
        output.C(serialDesc, 9, aVarArr[9], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineComponent)) {
            return false;
        }
        TimelineComponent timelineComponent = (TimelineComponent) obj;
        return this.itemSpacing == timelineComponent.itemSpacing && this.textSpacing == timelineComponent.textSpacing && this.columnGutter == timelineComponent.columnGutter && this.iconAlignment == timelineComponent.iconAlignment && m.a(this.visible, timelineComponent.visible) && m.a(this.size, timelineComponent.size) && m.a(this.padding, timelineComponent.padding) && m.a(this.margin, timelineComponent.margin) && m.a(this.items, timelineComponent.items) && m.a(this.overrides, timelineComponent.overrides);
    }

    public final int getColumnGutter() {
        return this.columnGutter;
    }

    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    public final List getItems() {
        return this.items;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Size getSize() {
        return this.size;
    }

    public final int getTextSpacing() {
        return this.textSpacing;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.iconAlignment.hashCode() + (((((this.itemSpacing * 31) + this.textSpacing) * 31) + this.columnGutter) * 31)) * 31;
        Boolean bool = this.visible;
        return this.overrides.hashCode() + g4.c.a((this.margin.hashCode() + ((this.padding.hashCode() + ((this.size.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.items);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimelineComponent(itemSpacing=");
        sb.append(this.itemSpacing);
        sb.append(", textSpacing=");
        sb.append(this.textSpacing);
        sb.append(", columnGutter=");
        sb.append(this.columnGutter);
        sb.append(", iconAlignment=");
        sb.append(this.iconAlignment);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
