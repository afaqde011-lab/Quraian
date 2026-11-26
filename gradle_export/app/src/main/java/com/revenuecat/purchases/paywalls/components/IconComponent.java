package com.revenuecat.purchases.paywalls.components;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 D2\u00020\u0001:\u0004EDFGBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0091\u0001\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b<\u0010;R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010*\u001a\u0004\b>\u0010?R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "baseUrl", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "iconBackground", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "overrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getBaseUrl$annotations", "()V", "getIconName", "getIconName$annotations", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground$annotations", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "Formats", "IconBackground", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconComponent implements PaywallComponent {
    private final String baseUrl;
    private final ColorScheme color;
    private final Formats formats;
    private final IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final List<ComponentOverride<PartialIconComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialIconComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return IconComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "", "", "webp", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getWebp", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Formats {

        public static final Companion INSTANCE = new Companion(null);
        private final String webp;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return IconComponent$Formats$$serializer.INSTANCE;
            }
        }

        @g00.c
        public Formats(int i, String str, x0 x0Var) {
            if (1 == (i & 1)) {
                this.webp = str;
            } else {
                o0.g(i, 1, IconComponent$Formats$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Formats(String webp) {
            m.e(webp, "webp");
            this.webp = webp;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Formats) && m.a(this.webp, ((Formats) obj).webp);
        }

        public final String getWebp() {
            return this.webp;
        }

        public int hashCode() {
            return this.webp.hashCode();
        }

        public String toString() {
            return g4.c.k(new StringBuilder("Formats(webp="), this.webp, ')');
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconBackground {

        public static final Companion INSTANCE = new Companion(null);
        private final Border border;
        private final ColorScheme color;
        private final Shadow shadow;
        private final MaskShape shape;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return IconComponent$IconBackground$$serializer.INSTANCE;
            }
        }

        @g00.c
        public IconBackground(int i, ColorScheme colorScheme, MaskShape maskShape, Border border, Shadow shadow, x0 x0Var) {
            if (3 != (i & 3)) {
                o0.g(i, 3, IconComponent$IconBackground$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.color = colorScheme;
            this.shape = maskShape;
            if ((i & 4) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i & 8) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
        }

        public IconBackground(ColorScheme color, MaskShape shape, Border border, Shadow shadow) {
            m.e(color, "color");
            m.e(shape, "shape");
            this.color = color;
            this.shape = shape;
            this.border = border;
            this.shadow = shadow;
        }

        public IconBackground(ColorScheme colorScheme, MaskShape maskShape, Border border, Shadow shadow, int i, f fVar) {
            this(colorScheme, maskShape, (i & 4) != 0 ? null : border, (i & 8) != 0 ? null : shadow);
        }

        public static final void write$Self$purchases_defaultsBc8Release(IconBackground self, b output, e serialDesc) {
            output.C(serialDesc, 0, ColorScheme$$serializer.INSTANCE, self.color);
            output.C(serialDesc, 1, MaskShapeDeserializer.INSTANCE, self.shape);
            if (output.k(serialDesc) || self.border != null) {
                output.x(serialDesc, 2, Border$$serializer.INSTANCE, self.border);
            }
            if (!output.k(serialDesc) && self.shadow == null) {
                return;
            }
            output.x(serialDesc, 3, Shadow$$serializer.INSTANCE, self.shadow);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconBackground)) {
                return false;
            }
            IconBackground iconBackground = (IconBackground) obj;
            return m.a(this.color, iconBackground.color) && m.a(this.shape, iconBackground.shape) && m.a(this.border, iconBackground.border) && m.a(this.shadow, iconBackground.shadow);
        }

        public final Border getBorder() {
            return this.border;
        }

        public final ColorScheme getColor() {
            return this.color;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final MaskShape getShape() {
            return this.shape;
        }

        public int hashCode() {
            int iHashCode = (this.shape.hashCode() + (this.color.hashCode() * 31)) * 31;
            Border border = this.border;
            int iHashCode2 = (iHashCode + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            return iHashCode2 + (shadow != null ? shadow.hashCode() : 0);
        }

        public String toString() {
            return "IconBackground(color=" + this.color + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
        }
    }

    @g00.c
    public IconComponent(int i, String str, String str2, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconBackground iconBackground, List list, x0 x0Var) {
        if (7 != (i & 7)) {
            o0.g(i, 7, IconComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats;
        if ((i & 8) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 16) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 32) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
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
        if ((i & 256) == 0) {
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground;
        }
        if ((i & 512) == 0) {
            this.overrides = x.A;
        } else {
            this.overrides = list;
        }
    }

    public IconComponent(String baseUrl, String iconName, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding margin, IconBackground iconBackground, List<ComponentOverride<PartialIconComponent>> overrides) {
        m.e(baseUrl, "baseUrl");
        m.e(iconName, "iconName");
        m.e(formats, "formats");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.baseUrl = baseUrl;
        this.iconName = iconName;
        this.formats = formats;
        this.visible = bool;
        this.size = size;
        this.color = colorScheme;
        this.padding = padding;
        this.margin = margin;
        this.iconBackground = iconBackground;
        this.overrides = overrides;
    }

    public IconComponent(String str, String str2, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconBackground iconBackground, List list, int i, f fVar) {
        this(str, str2, formats, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 128) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 256) != 0 ? null : iconBackground, (i & 512) != 0 ? x.A : list);
    }

    public static void getBaseUrl$annotations() {
    }

    public static void getIconBackground$annotations() {
    }

    public static void getIconName$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(IconComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.i(serialDesc, 0, self.baseUrl);
        output.i(serialDesc, 1, self.iconName);
        output.C(serialDesc, 2, IconComponent$Formats$$serializer.INSTANCE, self.formats);
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 3, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.C(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || self.color != null) {
            output.x(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.color);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 6, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 7, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.k(serialDesc) || self.iconBackground != null) {
            output.x(serialDesc, 8, IconComponent$IconBackground$$serializer.INSTANCE, self.iconBackground);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 9, aVarArr[9], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconComponent)) {
            return false;
        }
        IconComponent iconComponent = (IconComponent) obj;
        return m.a(this.baseUrl, iconComponent.baseUrl) && m.a(this.iconName, iconComponent.iconName) && m.a(this.formats, iconComponent.formats) && m.a(this.visible, iconComponent.visible) && m.a(this.size, iconComponent.size) && m.a(this.color, iconComponent.color) && m.a(this.padding, iconComponent.padding) && m.a(this.margin, iconComponent.margin) && m.a(this.iconBackground, iconComponent.iconBackground) && m.a(this.overrides, iconComponent.overrides);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final ColorScheme getColor() {
        return this.color;
    }

    public final Formats getFormats() {
        return this.formats;
    }

    public final IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final String getIconName() {
        return this.iconName;
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

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.formats.hashCode() + x5.e(this.baseUrl.hashCode() * 31, this.iconName, 31)) * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (this.size.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        ColorScheme colorScheme = this.color;
        int iHashCode3 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31)) * 31)) * 31;
        IconBackground iconBackground = this.iconBackground;
        return this.overrides.hashCode() + ((iHashCode3 + (iconBackground != null ? iconBackground.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IconComponent(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", iconName=");
        sb.append(this.iconName);
        sb.append(", formats=");
        sb.append(this.formats);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", iconBackground=");
        sb.append(this.iconBackground);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
