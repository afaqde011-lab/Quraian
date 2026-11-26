package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
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
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.f;
import p40.o0;
import p40.q0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialVideoComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PartialVideoComponent$$serializer implements z {
    public static final PartialVideoComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PartialVideoComponent$$serializer partialVideoComponent$$serializer = new PartialVideoComponent$$serializer();
        INSTANCE = partialVideoComponent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PartialVideoComponent", partialVideoComponent$$serializer, 16);
        q0Var.j("source", true);
        q0Var.j("fallback_source", true);
        q0Var.j("visible", true);
        q0Var.j("show_controls", true);
        q0Var.j("auto_play", true);
        q0Var.j("loop", true);
        q0Var.j("mute_audio", true);
        q0Var.j("size", true);
        q0Var.j("fit_mode", true);
        q0Var.j("mask_shape", true);
        q0Var.j("color_overlay", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("override_source_lid", true);
        descriptor = q0Var;
    }

    private PartialVideoComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(ThemeVideoUrls$$serializer.INSTANCE);
        a aVarG2 = c0.G(ThemeImageUrls$$serializer.INSTANCE);
        f fVar = f.a;
        a aVarG3 = c0.G(fVar);
        a aVarG4 = c0.G(fVar);
        a aVarG5 = c0.G(fVar);
        a aVarG6 = c0.G(fVar);
        a aVarG7 = c0.G(fVar);
        a aVarG8 = c0.G(Size$$serializer.INSTANCE);
        a aVarG9 = c0.G(FitModeDeserializer.INSTANCE);
        a aVarG10 = c0.G(MaskShapeDeserializer.INSTANCE);
        a aVarG11 = c0.G(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, aVarG7, aVarG8, aVarG9, aVarG10, aVarG11, c0.G(padding$$serializer), c0.G(padding$$serializer), c0.G(Border$$serializer.INSTANCE), c0.G(Shadow$$serializer.INSTANCE), c0.G(LocalizationKey$$serializer.INSTANCE)};
    }

    @Override
    public PartialVideoComponent deserialize(o40.c decoder) {
        ThemeVideoUrls themeVideoUrls;
        Boolean bool;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        Padding padding = null;
        ColorScheme colorScheme = null;
        MaskShape maskShape = null;
        Padding padding2 = null;
        FitMode fitMode = null;
        int i = 0;
        Border border = null;
        Shadow shadow = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Size size = null;
        boolean z = true;
        ThemeVideoUrls themeVideoUrls2 = null;
        ThemeImageUrls themeImageUrls = null;
        String strM237unboximpl = null;
        while (z) {
            Boolean bool7 = bool2;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    themeVideoUrls = themeVideoUrls2;
                    z = false;
                    colorScheme = colorScheme;
                    bool2 = bool7;
                    bool3 = bool3;
                    themeVideoUrls2 = themeVideoUrls;
                    padding = padding;
                    break;
                case 0:
                    themeVideoUrls = (ThemeVideoUrls) aVarC.v(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls2);
                    i |= 1;
                    colorScheme = colorScheme;
                    bool2 = bool7;
                    bool3 = bool3;
                    themeVideoUrls2 = themeVideoUrls;
                    padding = padding;
                    break;
                case 1:
                    bool = bool3;
                    themeImageUrls = (ThemeImageUrls) aVarC.v(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
                    i |= 2;
                    bool2 = bool7;
                    bool3 = bool;
                    padding = padding;
                    break;
                case 2:
                    bool = bool3;
                    bool2 = (Boolean) aVarC.v(descriptor2, 2, f.a, bool7);
                    i |= 4;
                    bool3 = bool;
                    padding = padding;
                    break;
                case 3:
                    padding = padding;
                    bool3 = (Boolean) aVarC.v(descriptor2, 3, f.a, bool3);
                    i |= 8;
                    bool2 = bool7;
                    padding = padding;
                    break;
                case 4:
                    bool4 = (Boolean) aVarC.v(descriptor2, 4, f.a, bool4);
                    i |= 16;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 5:
                    bool5 = (Boolean) aVarC.v(descriptor2, 5, f.a, bool5);
                    i |= 32;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 6:
                    bool6 = (Boolean) aVarC.v(descriptor2, 6, f.a, bool6);
                    i |= 64;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 7:
                    size = (Size) aVarC.v(descriptor2, 7, Size$$serializer.INSTANCE, size);
                    i |= 128;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 8:
                    fitMode = (FitMode) aVarC.v(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode);
                    i |= 256;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 9:
                    maskShape = (MaskShape) aVarC.v(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape);
                    i |= 512;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 10:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 10, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 1024;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 11:
                    padding = (Padding) aVarC.v(descriptor2, 11, Padding$$serializer.INSTANCE, padding);
                    i |= 2048;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 12:
                    padding2 = (Padding) aVarC.v(descriptor2, 12, Padding$$serializer.INSTANCE, padding2);
                    i |= 4096;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 13:
                    border = (Border) aVarC.v(descriptor2, 13, Border$$serializer.INSTANCE, border);
                    i |= 8192;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 14:
                    shadow = (Shadow) aVarC.v(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow);
                    i |= 16384;
                    bool2 = bool7;
                    bool3 = bool3;
                    break;
                case 15:
                    Boolean bool8 = bool4;
                    LocalizationKey localizationKey = (LocalizationKey) aVarC.v(descriptor2, 15, LocalizationKey$$serializer.INSTANCE, strM237unboximpl != null ? LocalizationKey.m231boximpl(strM237unboximpl) : null);
                    strM237unboximpl = localizationKey != null ? localizationKey.m237unboximpl() : null;
                    i |= 32768;
                    bool2 = bool7;
                    bool3 = bool3;
                    bool4 = bool8;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        Padding padding3 = padding;
        Boolean bool9 = bool3;
        aVarC.a(descriptor2);
        return new PartialVideoComponent(i, themeVideoUrls2, themeImageUrls, bool2, bool9, bool4, bool5, bool6, size, fitMode, maskShape, colorScheme, padding3, padding2, border, shadow, strM237unboximpl, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PartialVideoComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PartialVideoComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
