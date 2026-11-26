package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.e0;
import p40.f;
import p40.o0;
import p40.q0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTextComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PartialTextComponent$$serializer implements z {
    public static final PartialTextComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PartialTextComponent$$serializer partialTextComponent$$serializer = new PartialTextComponent$$serializer();
        INSTANCE = partialTextComponent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PartialTextComponent", partialTextComponent$$serializer, 12);
        q0Var.j("visible", true);
        q0Var.j("text_lid", true);
        q0Var.j("color", true);
        q0Var.j("background_color", true);
        q0Var.j("font_name", true);
        q0Var.j("font_weight", true);
        q0Var.j("font_weight_int", true);
        q0Var.j("font_size", true);
        q0Var.j("horizontal_alignment", true);
        q0Var.j("size", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        descriptor = q0Var;
    }

    private PartialTextComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(f.a);
        a aVarG2 = c0.G(LocalizationKey$$serializer.INSTANCE);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        a aVarG3 = c0.G(colorScheme$$serializer);
        a aVarG4 = c0.G(colorScheme$$serializer);
        a aVarG5 = c0.G(FontAlias$$serializer.INSTANCE);
        a aVarG6 = c0.G(FontWeightDeserializer.INSTANCE);
        a aVarG7 = c0.G(e0.a);
        a aVarG8 = c0.G(FontSizeSerializer.INSTANCE);
        a aVarG9 = c0.G(HorizontalAlignmentDeserializer.INSTANCE);
        a aVarG10 = c0.G(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, aVarG7, aVarG8, aVarG9, aVarG10, c0.G(padding$$serializer), c0.G(padding$$serializer)};
    }

    @Override
    public PartialTextComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        Padding padding = null;
        Padding padding2 = null;
        Size size = null;
        boolean z = true;
        HorizontalAlignment horizontalAlignment = null;
        int i = 0;
        Boolean bool = null;
        String strM237unboximpl = null;
        ColorScheme colorScheme = null;
        ColorScheme colorScheme2 = null;
        String strM27unboximpl = null;
        FontWeight fontWeight = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            z = z;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    strM237unboximpl = strM237unboximpl;
                    z = false;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 0:
                    bool = (Boolean) aVarC.v(descriptor2, 0, f.a, bool);
                    i |= 1;
                    strM237unboximpl = strM237unboximpl;
                    padding = padding;
                    break;
                case 1:
                    String str = strM237unboximpl;
                    LocalizationKey localizationKey = (LocalizationKey) aVarC.v(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, str != null ? LocalizationKey.m231boximpl(str) : null);
                    strM237unboximpl = localizationKey != null ? localizationKey.m237unboximpl() : null;
                    i |= 2;
                    padding = padding;
                    break;
                case 2:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 4;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 3:
                    colorScheme2 = (ColorScheme) aVarC.v(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i |= 8;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 4:
                    FontAlias fontAlias = (FontAlias) aVarC.v(descriptor2, 4, FontAlias$$serializer.INSTANCE, strM27unboximpl != null ? FontAlias.m21boximpl(strM27unboximpl) : null);
                    strM27unboximpl = fontAlias != null ? fontAlias.m27unboximpl() : null;
                    i |= 16;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 5:
                    fontWeight = (FontWeight) aVarC.v(descriptor2, 5, FontWeightDeserializer.INSTANCE, fontWeight);
                    i |= 32;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 6:
                    num = (Integer) aVarC.v(descriptor2, 6, e0.a, num);
                    i |= 64;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 7:
                    num2 = (Integer) aVarC.v(descriptor2, 7, FontSizeSerializer.INSTANCE, num2);
                    i |= 128;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 8:
                    horizontalAlignment = (HorizontalAlignment) aVarC.v(descriptor2, 8, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment);
                    i |= 256;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 9:
                    size = (Size) aVarC.v(descriptor2, 9, Size$$serializer.INSTANCE, size);
                    i |= 512;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 10:
                    padding2 = (Padding) aVarC.v(descriptor2, 10, Padding$$serializer.INSTANCE, padding2);
                    i |= 1024;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                case 11:
                    padding = (Padding) aVarC.v(descriptor2, 11, Padding$$serializer.INSTANCE, padding);
                    i |= 2048;
                    z = z;
                    strM237unboximpl = strM237unboximpl;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PartialTextComponent(i, bool, strM237unboximpl, colorScheme, colorScheme2, strM27unboximpl, fontWeight, num, num2, horizontalAlignment, size, padding2, padding, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PartialTextComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PartialTextComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
