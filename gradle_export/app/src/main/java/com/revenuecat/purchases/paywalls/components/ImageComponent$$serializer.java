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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ImageComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/ImageComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ImageComponent$$serializer implements z {
    public static final ImageComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        ImageComponent$$serializer imageComponent$$serializer = new ImageComponent$$serializer();
        INSTANCE = imageComponent$$serializer;
        q0 q0Var = new q0("image", imageComponent$$serializer, 12);
        q0Var.j("source", false);
        q0Var.j("visible", true);
        q0Var.j("size", true);
        q0Var.j("override_source_lid", true);
        q0Var.j("mask_shape", true);
        q0Var.j("color_overlay", true);
        q0Var.j("fit_mode", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private ImageComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = ImageComponent.$childSerializers;
        a aVarG = c0.G(f.a);
        a aVarG2 = c0.G(LocalizationKey$$serializer.INSTANCE);
        a aVarG3 = c0.G(MaskShapeDeserializer.INSTANCE);
        a aVarG4 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG5 = c0.G(Border$$serializer.INSTANCE);
        a aVarG6 = c0.G(Shadow$$serializer.INSTANCE);
        a aVar = aVarArr[11];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{ThemeImageUrls$$serializer.INSTANCE, aVarG, Size$$serializer.INSTANCE, aVarG2, aVarG3, aVarG4, FitModeDeserializer.INSTANCE, padding$$serializer, padding$$serializer, aVarG5, aVarG6, aVar};
    }

    @Override
    public ImageComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = ImageComponent.$childSerializers;
        List list = null;
        Shadow shadow = null;
        Border border = null;
        Padding padding = null;
        boolean z = true;
        Padding padding2 = null;
        int i = 0;
        ThemeImageUrls themeImageUrls = null;
        Boolean bool = null;
        Size size = null;
        String strM237unboximpl = null;
        MaskShape maskShape = null;
        ColorScheme colorScheme = null;
        FitMode fitMode = null;
        while (z) {
            boolean z2 = z;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    strM237unboximpl = strM237unboximpl;
                    z = false;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 0:
                    strM237unboximpl = strM237unboximpl;
                    themeImageUrls = (ThemeImageUrls) aVarC.s(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
                    i |= 1;
                    z = z2;
                    list = list;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 1:
                    bool = (Boolean) aVarC.v(descriptor2, 1, f.a, bool);
                    i |= 2;
                    z = z2;
                    list = list;
                    break;
                case 2:
                    size = (Size) aVarC.s(descriptor2, 2, Size$$serializer.INSTANCE, size);
                    i |= 4;
                    z = z2;
                    list = list;
                    break;
                case 3:
                    String str = strM237unboximpl;
                    LocalizationKey localizationKey = (LocalizationKey) aVarC.v(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, str != null ? LocalizationKey.m231boximpl(str) : null);
                    strM237unboximpl = localizationKey != null ? localizationKey.m237unboximpl() : null;
                    i |= 8;
                    z = z2;
                    list = list;
                    break;
                case 4:
                    maskShape = (MaskShape) aVarC.v(descriptor2, 4, MaskShapeDeserializer.INSTANCE, maskShape);
                    i |= 16;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 5:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 32;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 6:
                    fitMode = (FitMode) aVarC.s(descriptor2, 6, FitModeDeserializer.INSTANCE, fitMode);
                    i |= 64;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 7:
                    padding2 = (Padding) aVarC.s(descriptor2, 7, Padding$$serializer.INSTANCE, padding2);
                    i |= 128;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 8:
                    padding = (Padding) aVarC.s(descriptor2, 8, Padding$$serializer.INSTANCE, padding);
                    i |= 256;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 9:
                    border = (Border) aVarC.v(descriptor2, 9, Border$$serializer.INSTANCE, border);
                    i |= 512;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 10:
                    shadow = (Shadow) aVarC.v(descriptor2, 10, Shadow$$serializer.INSTANCE, shadow);
                    i |= 1024;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 11:
                    list = (List) aVarC.s(descriptor2, 11, aVarArr[11], list);
                    i |= 2048;
                    z = z2;
                    strM237unboximpl = strM237unboximpl;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new ImageComponent(i, themeImageUrls, bool, size, strM237unboximpl, maskShape, colorScheme, fitMode, padding2, padding, border, shadow, list, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, ImageComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        ImageComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
