package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
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

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cB§\u0001\b\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J(\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÁ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R(\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u00108\u001a\u0004\b:\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b@\u00108\u001a\u0004\b>\u0010?R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u00108\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010NR#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010O\u001a\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "source", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ImageComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageComponent implements PaywallComponent {
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final List<ComponentOverride<PartialImageComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialImageComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }
    }

    private ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> list, x0 x0Var) {
        if (1 != (i & 1)) {
            o0.g(i, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.source = themeImageUrls;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 4) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i & 16) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 32) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 64) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 128) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 256) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 512) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        this.overrides = (i & 2048) == 0 ? x.A : list;
    }

    @g00.c
    public ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, x0 x0Var, f fVar) {
        this(i, themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, (List<ComponentOverride<PartialImageComponent>>) list, x0Var);
    }

    private ImageComponent(ThemeImageUrls source, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding margin, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> overrides) {
        m.e(source, "source");
        m.e(size, "size");
        m.e(fitMode, "fitMode");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.source = source;
        this.visible = bool;
        this.size = size;
        this.overrideSourceLid = str;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode;
        this.padding = padding;
        this.margin = margin;
        this.border = border;
        this.shadow = shadow;
        this.overrides = overrides;
    }

    public ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, int i, f fVar) {
        this(themeImageUrls, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : maskShape, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? FitMode.FIT : fitMode, (i & 128) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 256) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 512) != 0 ? null : border, (i & 1024) != 0 ? null : shadow, (i & 2048) != 0 ? x.A : list, null);
    }

    public ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, f fVar) {
        this(themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, list);
    }

    public static void getColorOverlay$annotations() {
    }

    public static void getFitMode$annotations() {
    }

    public static void getMaskShape$annotations() {
    }

    public static void m173getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(ImageComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, ThemeImageUrls$$serializer.INSTANCE, self.source);
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 1, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.C(serialDesc, 2, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || self.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = self.overrideSourceLid;
            output.x(serialDesc, 3, localizationKey$$serializer, str != null ? LocalizationKey.m231boximpl(str) : null);
        }
        if (output.k(serialDesc) || self.maskShape != null) {
            output.x(serialDesc, 4, MaskShapeDeserializer.INSTANCE, self.maskShape);
        }
        if (output.k(serialDesc) || self.colorOverlay != null) {
            output.x(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }
        if (output.k(serialDesc) || self.fitMode != FitMode.FIT) {
            output.C(serialDesc, 6, FitModeDeserializer.INSTANCE, self.fitMode);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 7, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 8, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.k(serialDesc) || self.border != null) {
            output.x(serialDesc, 9, Border$$serializer.INSTANCE, self.border);
        }
        if (output.k(serialDesc) || self.shadow != null) {
            output.x(serialDesc, 10, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 11, aVarArr[11], self.overrides);
    }

    public boolean equals(Object obj) {
        boolean zM234equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageComponent)) {
            return false;
        }
        ImageComponent imageComponent = (ImageComponent) obj;
        if (!m.a(this.source, imageComponent.source) || !m.a(this.visible, imageComponent.visible) || !m.a(this.size, imageComponent.size)) {
            return false;
        }
        String str = this.overrideSourceLid;
        String str2 = imageComponent.overrideSourceLid;
        if (str == null) {
            if (str2 == null) {
                zM234equalsimpl0 = true;
            } else {
                zM234equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM234equalsimpl0 = false;
        } else {
            zM234equalsimpl0 = LocalizationKey.m234equalsimpl0(str, str2);
        }
        return zM234equalsimpl0 && m.a(this.maskShape, imageComponent.maskShape) && m.a(this.colorOverlay, imageComponent.colorOverlay) && this.fitMode == imageComponent.fitMode && m.a(this.padding, imageComponent.padding) && m.a(this.margin, imageComponent.margin) && m.a(this.border, imageComponent.border) && m.a(this.shadow, imageComponent.shadow) && m.a(this.overrides, imageComponent.overrides);
    }

    public final Border getBorder() {
        return this.border;
    }

    public final ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final FitMode getFitMode() {
        return this.fitMode;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final String getOverrideSourceLid() {
        return this.overrideSourceLid;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Size getSize() {
        return this.size;
    }

    public final ThemeImageUrls getSource() {
        return this.source;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (this.size.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str = this.overrideSourceLid;
        int iM235hashCodeimpl = (iHashCode2 + (str == null ? 0 : LocalizationKey.m235hashCodeimpl(str))) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode3 = (iM235hashCodeimpl + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int iHashCode4 = (this.margin.hashCode() + ((this.padding.hashCode() + ((this.fitMode.hashCode() + ((iHashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31)) * 31)) * 31)) * 31;
        Border border = this.border;
        int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return this.overrides.hashCode() + ((iHashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageComponent(source=");
        sb.append(this.source);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append((Object) (str == null ? "null" : LocalizationKey.m236toStringimpl(str)));
        sb.append(", maskShape=");
        sb.append(this.maskShape);
        sb.append(", colorOverlay=");
        sb.append(this.colorOverlay);
        sb.append(", fitMode=");
        sb.append(this.fitMode);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
