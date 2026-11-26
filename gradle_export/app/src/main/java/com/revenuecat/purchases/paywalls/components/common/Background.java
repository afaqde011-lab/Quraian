package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background;", "", "Color", "Companion", "Image", "Unknown", "Video", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Background {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getValue", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Color implements Background {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorScheme value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Color$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Color;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return Background$Color$$serializer.INSTANCE;
            }
        }

        @c
        public Color(int i, ColorScheme colorScheme, x0 x0Var) {
            if (1 == (i & 1)) {
                this.value = colorScheme;
            } else {
                o0.g(i, 1, Background$Color$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Color(ColorScheme value) {
            m.e(value, "value");
            this.value = value;
        }

        public static Color copy$default(Color color, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                colorScheme = color.value;
            }
            return color.copy(colorScheme);
        }

        public final ColorScheme getValue() {
            return this.value;
        }

        public final Color copy(ColorScheme value) {
            m.e(value, "value");
            return new Color(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Color) && m.a(this.value, ((Color) other).value);
        }

        public final ColorScheme getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Color(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return BackgroundDeserializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "component3", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getValue", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "getFitMode$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "getColorOverlay$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Image implements Background {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorScheme colorOverlay;
        private final FitMode fitMode;
        private final ThemeImageUrls value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Image$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return Background$Image$$serializer.INSTANCE;
            }
        }

        @c
        public Image(int i, ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, x0 x0Var) {
            if (1 != (i & 1)) {
                o0.g(i, 1, Background$Image$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.value = themeImageUrls;
            if ((i & 2) == 0) {
                this.fitMode = FitMode.FILL;
            } else {
                this.fitMode = fitMode;
            }
            if ((i & 4) == 0) {
                this.colorOverlay = null;
            } else {
                this.colorOverlay = colorScheme;
            }
        }

        public Image(ThemeImageUrls value, FitMode fitMode, ColorScheme colorScheme) {
            m.e(value, "value");
            m.e(fitMode, "fitMode");
            this.value = value;
            this.fitMode = fitMode;
            this.colorOverlay = colorScheme;
        }

        public Image(ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, int i, f fVar) {
            this(themeImageUrls, (i & 2) != 0 ? FitMode.FILL : fitMode, (i & 4) != 0 ? null : colorScheme);
        }

        public static Image copy$default(Image image, ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                themeImageUrls = image.value;
            }
            if ((i & 2) != 0) {
                fitMode = image.fitMode;
            }
            if ((i & 4) != 0) {
                colorScheme = image.colorOverlay;
            }
            return image.copy(themeImageUrls, fitMode, colorScheme);
        }

        public static void getColorOverlay$annotations() {
        }

        public static void getFitMode$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Image self, b output, e serialDesc) {
            output.C(serialDesc, 0, ThemeImageUrls$$serializer.INSTANCE, self.value);
            if (output.k(serialDesc) || self.fitMode != FitMode.FILL) {
                output.C(serialDesc, 1, FitModeDeserializer.INSTANCE, self.fitMode);
            }
            if (!output.k(serialDesc) && self.colorOverlay == null) {
                return;
            }
            output.x(serialDesc, 2, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }

        public final ThemeImageUrls getValue() {
            return this.value;
        }

        public final FitMode getFitMode() {
            return this.fitMode;
        }

        public final ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final Image copy(ThemeImageUrls value, FitMode fitMode, ColorScheme colorOverlay) {
            m.e(value, "value");
            m.e(fitMode, "fitMode");
            return new Image(value, fitMode, colorOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return m.a(this.value, image.value) && this.fitMode == image.fitMode && m.a(this.colorOverlay, image.colorOverlay);
        }

        public final ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final FitMode getFitMode() {
            return this.fitMode;
        }

        public final ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = (this.fitMode.hashCode() + (this.value.hashCode() * 31)) * 31;
            ColorScheme colorScheme = this.colorOverlay;
            return iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode());
        }

        public String toString() {
            return "Image(value=" + this.value + ", fitMode=" + this.fitMode + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "", "type", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown implements Background {

        public static final Companion INSTANCE = new Companion(null);
        private final String type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Unknown;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return Background$Unknown$$serializer.INSTANCE;
            }
        }

        @c
        public Unknown(int i, String str, x0 x0Var) {
            if (1 == (i & 1)) {
                this.type = str;
            } else {
                o0.g(i, 1, Background$Unknown$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Unknown(String type) {
            m.e(type, "type");
            this.type = type;
        }

        public static Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        public final String getType() {
            return this.type;
        }

        public final Unknown copy(String type) {
            m.e(type, "type");
            return new Unknown(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && m.a(this.type, ((Unknown) other).type);
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return g4.c.k(new StringBuilder("Unknown(type="), this.type, ')');
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB[\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JN\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\"R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010'¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackImage", "", "loop", "muteAudio", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "component3", "()Z", "component4", "component5", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "component6", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;ZZLcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getValue", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackImage", "getFallbackImage$annotations", "()V", "Z", "getLoop", "getMuteAudio", "getMuteAudio$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "getColorOverlay$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Video implements Background {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorScheme colorOverlay;
        private final ThemeImageUrls fallbackImage;
        private final FitMode fitMode;
        private final boolean loop;
        private final boolean muteAudio;
        private final ThemeVideoUrls value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background$Video$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return Background$Video$$serializer.INSTANCE;
            }
        }

        @c
        public Video(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, x0 x0Var) {
            if (15 != (i & 15)) {
                o0.g(i, 15, Background$Video$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.value = themeVideoUrls;
            this.fallbackImage = themeImageUrls;
            this.loop = z;
            this.muteAudio = z2;
            if ((i & 16) == 0) {
                this.fitMode = FitMode.FILL;
            } else {
                this.fitMode = fitMode;
            }
            if ((i & 32) == 0) {
                this.colorOverlay = null;
            } else {
                this.colorOverlay = colorScheme;
            }
        }

        public Video(ThemeVideoUrls value, ThemeImageUrls fallbackImage, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme) {
            m.e(value, "value");
            m.e(fallbackImage, "fallbackImage");
            m.e(fitMode, "fitMode");
            this.value = value;
            this.fallbackImage = fallbackImage;
            this.loop = z;
            this.muteAudio = z2;
            this.fitMode = fitMode;
            this.colorOverlay = colorScheme;
        }

        public Video(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, int i, f fVar) {
            this(themeVideoUrls, themeImageUrls, z, z2, (i & 16) != 0 ? FitMode.FILL : fitMode, (i & 32) != 0 ? null : colorScheme);
        }

        public static Video copy$default(Video video, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                themeVideoUrls = video.value;
            }
            if ((i & 2) != 0) {
                themeImageUrls = video.fallbackImage;
            }
            if ((i & 4) != 0) {
                z = video.loop;
            }
            if ((i & 8) != 0) {
                z2 = video.muteAudio;
            }
            if ((i & 16) != 0) {
                fitMode = video.fitMode;
            }
            if ((i & 32) != 0) {
                colorScheme = video.colorOverlay;
            }
            FitMode fitMode2 = fitMode;
            ColorScheme colorScheme2 = colorScheme;
            return video.copy(themeVideoUrls, themeImageUrls, z, z2, fitMode2, colorScheme2);
        }

        public static void getColorOverlay$annotations() {
        }

        public static void getFallbackImage$annotations() {
        }

        public static void getFitMode$annotations() {
        }

        public static void getMuteAudio$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Video self, b output, e serialDesc) {
            output.C(serialDesc, 0, ThemeVideoUrls$$serializer.INSTANCE, self.value);
            output.C(serialDesc, 1, ThemeImageUrls$$serializer.INSTANCE, self.fallbackImage);
            output.u(serialDesc, 2, self.loop);
            output.u(serialDesc, 3, self.muteAudio);
            if (output.k(serialDesc) || self.fitMode != FitMode.FILL) {
                output.C(serialDesc, 4, FitModeDeserializer.INSTANCE, self.fitMode);
            }
            if (!output.k(serialDesc) && self.colorOverlay == null) {
                return;
            }
            output.x(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }

        public final ThemeVideoUrls getValue() {
            return this.value;
        }

        public final ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final boolean getLoop() {
            return this.loop;
        }

        public final boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final FitMode getFitMode() {
            return this.fitMode;
        }

        public final ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final Video copy(ThemeVideoUrls value, ThemeImageUrls fallbackImage, boolean loop, boolean muteAudio, FitMode fitMode, ColorScheme colorOverlay) {
            m.e(value, "value");
            m.e(fallbackImage, "fallbackImage");
            m.e(fitMode, "fitMode");
            return new Video(value, fallbackImage, loop, muteAudio, fitMode, colorOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return m.a(this.value, video.value) && m.a(this.fallbackImage, video.fallbackImage) && this.loop == video.loop && this.muteAudio == video.muteAudio && this.fitMode == video.fitMode && m.a(this.colorOverlay, video.colorOverlay);
        }

        public final ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final FitMode getFitMode() {
            return this.fitMode;
        }

        public final boolean getLoop() {
            return this.loop;
        }

        public final boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final ThemeVideoUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = (this.fitMode.hashCode() + w.c.e(w.c.e((this.fallbackImage.hashCode() + (this.value.hashCode() * 31)) * 31, 31, this.loop), 31, this.muteAudio)) * 31;
            ColorScheme colorScheme = this.colorOverlay;
            return iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode());
        }

        public String toString() {
            return "Video(value=" + this.value + ", fallbackImage=" + this.fallbackImage + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", fitMode=" + this.fitMode + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }
}
