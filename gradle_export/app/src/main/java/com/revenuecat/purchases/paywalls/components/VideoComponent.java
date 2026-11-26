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
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.c;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\b\u0007\u0018\u0000 e2\u00020\u0001:\u0002feB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÙ\u0001\b\u0011\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÁ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b?\u00108\u001a\u0004\b=\u0010>R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010>R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bB\u0010>R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010GR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00108\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u00108\u001a\u0004\bM\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bS\u00108\u001a\u0004\bQ\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010T\u001a\u0004\bW\u0010VR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010[\u001a\u0004\b\\\u0010]R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010^\u001a\u0004\b_\u0010`R(\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010a\u0012\u0004\bd\u00108\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackSource", "", "visible", "showControls", "autoplay", "loop", "muteAudio", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "overrides", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/VideoComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackSource$annotations", "()V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Z", "getShowControls", "()Z", "getShowControls$annotations", "getAutoplay", "getAutoplay$annotations", "getLoop", "getMuteAudio", "getMuteAudio$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoComponent implements PaywallComponent {
    private final boolean autoplay;
    private final Border border;
    private final ColorScheme colorOverlay;
    private final ThemeImageUrls fallbackSource;
    private final FitMode fitMode;
    private final boolean loop;
    private final Padding margin;
    private final MaskShape maskShape;
    private final boolean muteAudio;
    private final String overrideSourceLid;
    private final List<ComponentOverride<PartialVideoComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final boolean showControls;
    private final Size size;
    private final ThemeVideoUrls source;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialVideoComponent$$serializer.INSTANCE)), null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return VideoComponent$$serializer.INSTANCE;
        }
    }

    private VideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List<ComponentOverride<PartialVideoComponent>> list, String str, x0 x0Var) {
        if (65535 != (i & 65535)) {
            o0.g(i, 65535, VideoComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.source = themeVideoUrls;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = z;
        this.autoplay = z2;
        this.loop = z3;
        this.muteAudio = z4;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrides = list;
        if ((i & 65536) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
    }

    @g00.c
    public VideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, x0 x0Var, f fVar) {
        this(i, themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, (List<ComponentOverride<PartialVideoComponent>>) list, str, x0Var);
    }

    private VideoComponent(ThemeVideoUrls source, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List<ComponentOverride<PartialVideoComponent>> list, String str) {
        m.e(source, "source");
        m.e(size, "size");
        m.e(fitMode, "fitMode");
        this.source = source;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = z;
        this.autoplay = z2;
        this.loop = z3;
        this.muteAudio = z4;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrides = list;
        this.overrideSourceLid = str;
    }

    public VideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, int i, f fVar) {
        this(themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, (i & 65536) != 0 ? null : str, null);
    }

    public VideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, f fVar) {
        this(themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, str);
    }

    public static void getAutoplay$annotations() {
    }

    public static void getColorOverlay$annotations() {
    }

    public static void getFallbackSource$annotations() {
    }

    public static void getFitMode$annotations() {
    }

    public static void getMaskShape$annotations() {
    }

    public static void getMuteAudio$annotations() {
    }

    public static void m193getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static void getShowControls$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(VideoComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, ThemeVideoUrls$$serializer.INSTANCE, self.source);
        output.x(serialDesc, 1, ThemeImageUrls$$serializer.INSTANCE, self.fallbackSource);
        output.x(serialDesc, 2, p40.f.a, self.visible);
        output.u(serialDesc, 3, self.showControls);
        output.u(serialDesc, 4, self.autoplay);
        output.u(serialDesc, 5, self.loop);
        output.u(serialDesc, 6, self.muteAudio);
        output.C(serialDesc, 7, Size$$serializer.INSTANCE, self.size);
        output.C(serialDesc, 8, FitModeDeserializer.INSTANCE, self.fitMode);
        output.x(serialDesc, 9, MaskShapeDeserializer.INSTANCE, self.maskShape);
        output.x(serialDesc, 10, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        output.x(serialDesc, 11, padding$$serializer, self.padding);
        output.x(serialDesc, 12, padding$$serializer, self.margin);
        output.x(serialDesc, 13, Border$$serializer.INSTANCE, self.border);
        output.x(serialDesc, 14, Shadow$$serializer.INSTANCE, self.shadow);
        output.x(serialDesc, 15, aVarArr[15], self.overrides);
        if (!output.k(serialDesc) && self.overrideSourceLid == null) {
            return;
        }
        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
        String str = self.overrideSourceLid;
        output.x(serialDesc, 16, localizationKey$$serializer, str != null ? LocalizationKey.m231boximpl(str) : null);
    }

    public boolean equals(Object obj) {
        boolean zM234equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoComponent)) {
            return false;
        }
        VideoComponent videoComponent = (VideoComponent) obj;
        if (!m.a(this.source, videoComponent.source) || !m.a(this.fallbackSource, videoComponent.fallbackSource) || !m.a(this.visible, videoComponent.visible) || this.showControls != videoComponent.showControls || this.autoplay != videoComponent.autoplay || this.loop != videoComponent.loop || this.muteAudio != videoComponent.muteAudio || !m.a(this.size, videoComponent.size) || this.fitMode != videoComponent.fitMode || !m.a(this.maskShape, videoComponent.maskShape) || !m.a(this.colorOverlay, videoComponent.colorOverlay) || !m.a(this.padding, videoComponent.padding) || !m.a(this.margin, videoComponent.margin) || !m.a(this.border, videoComponent.border) || !m.a(this.shadow, videoComponent.shadow) || !m.a(this.overrides, videoComponent.overrides)) {
            return false;
        }
        String str = this.overrideSourceLid;
        String str2 = videoComponent.overrideSourceLid;
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
        return zM234equalsimpl0;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final ThemeImageUrls getFallbackSource() {
        return this.fallbackSource;
    }

    public final FitMode getFitMode() {
        return this.fitMode;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final boolean getMuteAudio() {
        return this.muteAudio;
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

    public final boolean getShowControls() {
        return this.showControls;
    }

    public final Size getSize() {
        return this.size;
    }

    public final ThemeVideoUrls getSource() {
        return this.source;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        ThemeImageUrls themeImageUrls = this.fallbackSource;
        int iHashCode2 = (iHashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode3 = (this.fitMode.hashCode() + ((this.size.hashCode() + w.c.e(w.c.e(w.c.e(w.c.e((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.showControls), 31, this.autoplay), 31, this.loop), 31, this.muteAudio)) * 31)) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode4 = (iHashCode3 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int iHashCode5 = (iHashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode6 = (iHashCode5 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode7 = (iHashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Border border = this.border;
        int iHashCode8 = (iHashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode9 = (iHashCode8 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        List<ComponentOverride<PartialVideoComponent>> list = this.overrides;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.overrideSourceLid;
        return iHashCode10 + (str != null ? LocalizationKey.m235hashCodeimpl(str) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoComponent(source=");
        sb.append(this.source);
        sb.append(", fallbackSource=");
        sb.append(this.fallbackSource);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", showControls=");
        sb.append(this.showControls);
        sb.append(", autoplay=");
        sb.append(this.autoplay);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", muteAudio=");
        sb.append(this.muteAudio);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", fitMode=");
        sb.append(this.fitMode);
        sb.append(", maskShape=");
        sb.append(this.maskShape);
        sb.append(", colorOverlay=");
        sb.append(this.colorOverlay);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append((Object) (str == null ? "null" : LocalizationKey.m236toStringimpl(str)));
        sb.append(')');
        return sb.toString();
    }
}
