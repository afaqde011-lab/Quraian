package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
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
import java.util.List;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/VideoComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/VideoComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class VideoComponent$$serializer implements z {
    public static final VideoComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        VideoComponent$$serializer videoComponent$$serializer = new VideoComponent$$serializer();
        INSTANCE = videoComponent$$serializer;
        q0 q0Var = new q0("video", videoComponent$$serializer, 17);
        q0Var.j("source", false);
        q0Var.j("fallback_source", false);
        q0Var.j("visible", false);
        q0Var.j("show_controls", false);
        q0Var.j("auto_play", false);
        q0Var.j("loop", false);
        q0Var.j("mute_audio", false);
        q0Var.j("size", false);
        q0Var.j("fit_mode", false);
        q0Var.j("mask_shape", false);
        q0Var.j("color_overlay", false);
        q0Var.j("padding", false);
        q0Var.j("margin", false);
        q0Var.j("border", false);
        q0Var.j("shadow", false);
        q0Var.j("overrides", false);
        q0Var.j("override_source_lid", true);
        descriptor = q0Var;
    }

    private VideoComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = VideoComponent.$childSerializers;
        a aVarG = c0.G(ThemeImageUrls$$serializer.INSTANCE);
        f fVar = f.a;
        a aVarG2 = c0.G(fVar);
        a aVarG3 = c0.G(MaskShapeDeserializer.INSTANCE);
        a aVarG4 = c0.G(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{ThemeVideoUrls$$serializer.INSTANCE, aVarG, aVarG2, fVar, fVar, fVar, fVar, Size$$serializer.INSTANCE, FitModeDeserializer.INSTANCE, aVarG3, aVarG4, c0.G(padding$$serializer), c0.G(padding$$serializer), c0.G(Border$$serializer.INSTANCE), c0.G(Shadow$$serializer.INSTANCE), c0.G(aVarArr[15]), c0.G(LocalizationKey$$serializer.INSTANCE)};
    }

    @Override
    public VideoComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = VideoComponent.$childSerializers;
        List list = null;
        Shadow shadow = null;
        Border border = null;
        Padding padding = null;
        boolean z = true;
        Size size = null;
        int i = 0;
        ThemeVideoUrls themeVideoUrls = null;
        ThemeImageUrls themeImageUrls = null;
        Boolean bool = null;
        FitMode fitMode = null;
        MaskShape maskShape = null;
        ColorScheme colorScheme = null;
        Padding padding2 = null;
        boolean zR = false;
        boolean zR2 = false;
        boolean zR3 = false;
        boolean zR4 = false;
        String strM237unboximpl = null;
        while (z) {
            boolean z2 = z;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    list = list;
                    break;
                case 0:
                    themeVideoUrls = (ThemeVideoUrls) aVarC.s(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls);
                    i |= 1;
                    z = z2;
                    list = list;
                    break;
                case 1:
                    themeImageUrls = (ThemeImageUrls) aVarC.v(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
                    i |= 2;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 2:
                    bool = (Boolean) aVarC.v(descriptor2, 2, f.a, bool);
                    i |= 4;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 3:
                    zR = aVarC.r(descriptor2, 3);
                    i |= 8;
                    z = z2;
                    break;
                case 4:
                    zR2 = aVarC.r(descriptor2, 4);
                    i |= 16;
                    z = z2;
                    break;
                case 5:
                    zR3 = aVarC.r(descriptor2, 5);
                    i |= 32;
                    z = z2;
                    break;
                case 6:
                    zR4 = aVarC.r(descriptor2, 6);
                    i |= 64;
                    z = z2;
                    break;
                case 7:
                    size = (Size) aVarC.s(descriptor2, 7, Size$$serializer.INSTANCE, size);
                    i |= 128;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 8:
                    fitMode = (FitMode) aVarC.s(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode);
                    i |= 256;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 9:
                    maskShape = (MaskShape) aVarC.v(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape);
                    i |= 512;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 10:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 10, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 1024;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 11:
                    padding2 = (Padding) aVarC.v(descriptor2, 11, Padding$$serializer.INSTANCE, padding2);
                    i |= 2048;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 12:
                    padding = (Padding) aVarC.v(descriptor2, 12, Padding$$serializer.INSTANCE, padding);
                    i |= 4096;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 13:
                    border = (Border) aVarC.v(descriptor2, 13, Border$$serializer.INSTANCE, border);
                    i |= 8192;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 14:
                    shadow = (Shadow) aVarC.v(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow);
                    i |= 16384;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case 15:
                    list = (List) aVarC.v(descriptor2, 15, aVarArr[15], list);
                    i |= 32768;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    ThemeImageUrls themeImageUrls2 = themeImageUrls;
                    LocalizationKey localizationKey = (LocalizationKey) aVarC.v(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, strM237unboximpl != null ? LocalizationKey.m231boximpl(strM237unboximpl) : null);
                    strM237unboximpl = localizationKey != null ? localizationKey.m237unboximpl() : null;
                    i |= 65536;
                    z = z2;
                    themeVideoUrls = themeVideoUrls;
                    themeImageUrls = themeImageUrls2;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        FitMode fitMode2 = fitMode;
        boolean z3 = zR;
        MaskShape maskShape2 = maskShape;
        return new VideoComponent(i, themeVideoUrls, themeImageUrls, bool, z3, zR2, zR3, zR4, size, fitMode2, maskShape2, colorScheme, padding2, padding, border, shadow, list, strM237unboximpl, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, VideoComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        VideoComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
