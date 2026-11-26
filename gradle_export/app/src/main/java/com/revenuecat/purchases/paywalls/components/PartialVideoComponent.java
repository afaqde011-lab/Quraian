package com.revenuecat.purchases.paywalls.components;

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
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.x0;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0002]\\BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eBË\u0001\b\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u00107R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b;\u00104\u001a\u0004\b:\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b<\u00107R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b>\u00104\u001a\u0004\b=\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bE\u00104\u001a\u0004\bC\u0010DR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bI\u00104\u001a\u0004\bG\u0010HR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010J\u0012\u0004\bM\u00104\u001a\u0004\bK\u0010LR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bQ\u0010PR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bV\u0010WR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010X\u0012\u0004\b[\u00104\u001a\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackSource", "", "visible", "showControls", "autoplay", "loop", "muteAudio", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/lang/String;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getFallbackSource$annotations", "()V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getShowControls", "getShowControls$annotations", "getAutoplay", "getAutoplay$annotations", "getLoop", "getMuteAudio", "getMuteAudio$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialVideoComponent implements PartialComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final Boolean autoplay;
    private final Border border;
    private final ColorScheme colorOverlay;
    private final ThemeImageUrls fallbackSource;
    private final FitMode fitMode;
    private final Boolean loop;
    private final Padding margin;
    private final MaskShape maskShape;
    private final Boolean muteAudio;
    private final String overrideSourceLid;
    private final Padding padding;
    private final Shadow shadow;
    private final Boolean showControls;
    private final Size size;
    private final ThemeVideoUrls source;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PartialVideoComponent$$serializer.INSTANCE;
        }
    }

    private PartialVideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, x0 x0Var) {
        if ((i & 1) == 0) {
            this.source = null;
        } else {
            this.source = themeVideoUrls;
        }
        if ((i & 2) == 0) {
            this.fallbackSource = null;
        } else {
            this.fallbackSource = themeImageUrls;
        }
        if ((i & 4) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 8) == 0) {
            this.showControls = null;
        } else {
            this.showControls = bool2;
        }
        if ((i & 16) == 0) {
            this.autoplay = null;
        } else {
            this.autoplay = bool3;
        }
        if ((i & 32) == 0) {
            this.loop = null;
        } else {
            this.loop = bool4;
        }
        if ((i & 64) == 0) {
            this.muteAudio = null;
        } else {
            this.muteAudio = bool5;
        }
        if ((i & 128) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 256) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 512) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 1024) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 2048) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 4096) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 8192) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 16384) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 32768) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
    }

    @c
    public PartialVideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, x0 x0Var, f fVar) {
        this(i, themeVideoUrls, themeImageUrls, bool, bool2, bool3, bool4, bool5, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, str, x0Var);
    }

    private PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str) {
        this.source = themeVideoUrls;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = bool2;
        this.autoplay = bool3;
        this.loop = bool4;
        this.muteAudio = bool5;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrideSourceLid = str;
    }

    public PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, int i, f fVar) {
        ThemeVideoUrls themeVideoUrls2 = (i & 1) != 0 ? null : themeVideoUrls;
        ThemeImageUrls themeImageUrls2 = (i & 2) != 0 ? null : themeImageUrls;
        Boolean bool6 = (i & 4) != 0 ? null : bool;
        Boolean bool7 = (i & 8) != 0 ? null : bool2;
        Boolean bool8 = (i & 16) != 0 ? null : bool3;
        Boolean bool9 = (i & 32) != 0 ? null : bool4;
        Boolean bool10 = (i & 64) != 0 ? null : bool5;
        Size size2 = (i & 128) != 0 ? null : size;
        FitMode fitMode2 = (i & 256) != 0 ? null : fitMode;
        MaskShape maskShape2 = (i & 512) != 0 ? null : maskShape;
        ColorScheme colorScheme2 = (i & 1024) != 0 ? null : colorScheme;
        Padding padding3 = (i & 2048) != 0 ? null : padding;
        Padding padding4 = (i & 4096) != 0 ? null : padding2;
        Border border2 = (i & 8192) != 0 ? null : border;
        ThemeImageUrls themeImageUrls3 = themeImageUrls2;
        Boolean bool11 = bool6;
        Boolean bool12 = bool7;
        Boolean bool13 = bool8;
        Boolean bool14 = bool9;
        Boolean bool15 = bool10;
        Size size3 = size2;
        FitMode fitMode3 = fitMode2;
        MaskShape maskShape3 = maskShape2;
        ColorScheme colorScheme3 = colorScheme2;
        Padding padding5 = padding3;
        Padding padding6 = padding4;
        Border border3 = border2;
        this(themeVideoUrls2, themeImageUrls3, bool11, bool12, bool13, bool14, bool15, size3, fitMode3, maskShape3, colorScheme3, padding5, padding6, border3, (i & 16384) != 0 ? null : shadow, (i & 32768) != 0 ? null : str, null);
    }

    public PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, f fVar) {
        this(themeVideoUrls, themeImageUrls, bool, bool2, bool3, bool4, bool5, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, str);
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

    public static void m181getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static void getShowControls$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PartialVideoComponent self, b output, e serialDesc) {
        if (output.k(serialDesc) || self.source != null) {
            output.x(serialDesc, 0, ThemeVideoUrls$$serializer.INSTANCE, self.source);
        }
        if (output.k(serialDesc) || self.fallbackSource != null) {
            output.x(serialDesc, 1, ThemeImageUrls$$serializer.INSTANCE, self.fallbackSource);
        }
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 2, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || self.showControls != null) {
            output.x(serialDesc, 3, p40.f.a, self.showControls);
        }
        if (output.k(serialDesc) || self.autoplay != null) {
            output.x(serialDesc, 4, p40.f.a, self.autoplay);
        }
        if (output.k(serialDesc) || self.loop != null) {
            output.x(serialDesc, 5, p40.f.a, self.loop);
        }
        if (output.k(serialDesc) || self.muteAudio != null) {
            output.x(serialDesc, 6, p40.f.a, self.muteAudio);
        }
        if (output.k(serialDesc) || self.size != null) {
            output.x(serialDesc, 7, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || self.fitMode != null) {
            output.x(serialDesc, 8, FitModeDeserializer.INSTANCE, self.fitMode);
        }
        if (output.k(serialDesc) || self.maskShape != null) {
            output.x(serialDesc, 9, MaskShapeDeserializer.INSTANCE, self.maskShape);
        }
        if (output.k(serialDesc) || self.colorOverlay != null) {
            output.x(serialDesc, 10, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }
        if (output.k(serialDesc) || self.padding != null) {
            output.x(serialDesc, 11, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || self.margin != null) {
            output.x(serialDesc, 12, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.k(serialDesc) || self.border != null) {
            output.x(serialDesc, 13, Border$$serializer.INSTANCE, self.border);
        }
        if (output.k(serialDesc) || self.shadow != null) {
            output.x(serialDesc, 14, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (!output.k(serialDesc) && self.overrideSourceLid == null) {
            return;
        }
        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
        String str = self.overrideSourceLid;
        output.x(serialDesc, 15, localizationKey$$serializer, str != null ? LocalizationKey.m231boximpl(str) : null);
    }

    public boolean equals(Object obj) {
        boolean zM234equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialVideoComponent)) {
            return false;
        }
        PartialVideoComponent partialVideoComponent = (PartialVideoComponent) obj;
        if (!m.a(this.source, partialVideoComponent.source) || !m.a(this.fallbackSource, partialVideoComponent.fallbackSource) || !m.a(this.visible, partialVideoComponent.visible) || !m.a(this.showControls, partialVideoComponent.showControls) || !m.a(this.autoplay, partialVideoComponent.autoplay) || !m.a(this.loop, partialVideoComponent.loop) || !m.a(this.muteAudio, partialVideoComponent.muteAudio) || !m.a(this.size, partialVideoComponent.size) || this.fitMode != partialVideoComponent.fitMode || !m.a(this.maskShape, partialVideoComponent.maskShape) || !m.a(this.colorOverlay, partialVideoComponent.colorOverlay) || !m.a(this.padding, partialVideoComponent.padding) || !m.a(this.margin, partialVideoComponent.margin) || !m.a(this.border, partialVideoComponent.border) || !m.a(this.shadow, partialVideoComponent.shadow)) {
            return false;
        }
        String str = this.overrideSourceLid;
        String str2 = partialVideoComponent.overrideSourceLid;
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

    public final Boolean getAutoplay() {
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

    public final Boolean getLoop() {
        return this.loop;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final Boolean getMuteAudio() {
        return this.muteAudio;
    }

    public final String getOverrideSourceLid() {
        return this.overrideSourceLid;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Boolean getShowControls() {
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
        ThemeVideoUrls themeVideoUrls = this.source;
        int iHashCode = (themeVideoUrls == null ? 0 : themeVideoUrls.hashCode()) * 31;
        ThemeImageUrls themeImageUrls = this.fallbackSource;
        int iHashCode2 = (iHashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showControls;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.autoplay;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.loop;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.muteAudio;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Size size = this.size;
        int iHashCode8 = (iHashCode7 + (size == null ? 0 : size.hashCode())) * 31;
        FitMode fitMode = this.fitMode;
        int iHashCode9 = (iHashCode8 + (fitMode == null ? 0 : fitMode.hashCode())) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode10 = (iHashCode9 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int iHashCode11 = (iHashCode10 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode12 = (iHashCode11 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode13 = (iHashCode12 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Border border = this.border;
        int iHashCode14 = (iHashCode13 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode15 = (iHashCode14 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        String str = this.overrideSourceLid;
        return iHashCode15 + (str != null ? LocalizationKey.m235hashCodeimpl(str) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PartialVideoComponent(source=");
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
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append((Object) (str == null ? "null" : LocalizationKey.m236toStringimpl(str)));
        sb.append(')');
        return sb.toString();
    }
}
