package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import g00.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.b1;
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/IconComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/IconComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class IconComponent$$serializer implements z {
    public static final IconComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        IconComponent$$serializer iconComponent$$serializer = new IconComponent$$serializer();
        INSTANCE = iconComponent$$serializer;
        q0 q0Var = new q0("icon", iconComponent$$serializer, 10);
        q0Var.j("base_url", false);
        q0Var.j("icon_name", false);
        q0Var.j("formats", false);
        q0Var.j("visible", true);
        q0Var.j("size", true);
        q0Var.j("color", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("icon_background", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private IconComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = IconComponent.$childSerializers;
        a aVarG = c0.G(f.a);
        a aVarG2 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG3 = c0.G(IconComponent$IconBackground$$serializer.INSTANCE);
        a aVar = aVarArr[9];
        b1 b1Var = b1.a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{b1Var, b1Var, IconComponent$Formats$$serializer.INSTANCE, aVarG, Size$$serializer.INSTANCE, aVarG2, padding$$serializer, padding$$serializer, aVarG3, aVar};
    }

    @Override
    public IconComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = IconComponent.$childSerializers;
        IconComponent.IconBackground iconBackground = null;
        List list = null;
        String strT = null;
        String strT2 = null;
        IconComponent.Formats formats = null;
        Boolean bool = null;
        Size size = null;
        ColorScheme colorScheme = null;
        Padding padding = null;
        Padding padding2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    continue;
                case 0:
                    strT = aVarC.t(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    strT2 = aVarC.t(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    formats = (IconComponent.Formats) aVarC.s(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, formats);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) aVarC.v(descriptor2, 3, f.a, bool);
                    i |= 8;
                    break;
                case 4:
                    size = (Size) aVarC.s(descriptor2, 4, Size$$serializer.INSTANCE, size);
                    i |= 16;
                    break;
                case 5:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 32;
                    break;
                case 6:
                    padding = (Padding) aVarC.s(descriptor2, 6, Padding$$serializer.INSTANCE, padding);
                    i |= 64;
                    break;
                case 7:
                    padding2 = (Padding) aVarC.s(descriptor2, 7, Padding$$serializer.INSTANCE, padding2);
                    i |= 128;
                    break;
                case 8:
                    iconBackground = (IconComponent.IconBackground) aVarC.v(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, iconBackground);
                    i |= 256;
                    break;
                case 9:
                    list = (List) aVarC.s(descriptor2, 9, aVarArr[9], list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
            aVarArr = aVarArr;
        }
        aVarC.a(descriptor2);
        return new IconComponent(i, strT, strT2, formats, bool, size, colorScheme, padding, padding2, iconBackground, list, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, IconComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        IconComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
