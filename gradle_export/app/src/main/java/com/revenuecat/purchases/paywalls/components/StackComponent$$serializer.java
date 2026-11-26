package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
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
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.y;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/StackComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class StackComponent$$serializer implements z {
    public static final StackComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        q0 q0Var = new q0("stack", stackComponent$$serializer, 15);
        q0Var.j("components", false);
        q0Var.j("visible", true);
        q0Var.j("dimension", true);
        q0Var.j("size", true);
        q0Var.j("spacing", true);
        q0Var.j("background_color", true);
        q0Var.j("background", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("shape", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("badge", true);
        q0Var.j("overflow", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private StackComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = StackComponent.$childSerializers;
        a aVar = aVarArr[0];
        a aVarG = c0.G(f.a);
        a aVar2 = aVarArr[2];
        a aVarG2 = c0.G(y.a);
        a aVarG3 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG4 = c0.G(BackgroundDeserializer.INSTANCE);
        a aVarG5 = c0.G(ShapeDeserializer.INSTANCE);
        a aVarG6 = c0.G(Border$$serializer.INSTANCE);
        a aVarG7 = c0.G(Shadow$$serializer.INSTANCE);
        a aVarG8 = c0.G(Badge$$serializer.INSTANCE);
        a aVarG9 = c0.G(StackOverflowDeserializer.INSTANCE);
        a aVar3 = aVarArr[14];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVar, aVarG, aVar2, Size$$serializer.INSTANCE, aVarG2, aVarG3, aVarG4, padding$$serializer, padding$$serializer, aVarG5, aVarG6, aVarG7, aVarG8, aVarG9, aVar3};
    }

    @Override
    public StackComponent deserialize(o40.c decoder) {
        List list;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = StackComponent.$childSerializers;
        Padding padding = null;
        StackComponent.Overflow overflow = null;
        Badge badge = null;
        Shadow shadow = null;
        Shape shape = null;
        Border border = null;
        List list2 = null;
        Dimension dimension = null;
        Size size = null;
        Float f = null;
        ColorScheme colorScheme = null;
        Background background = null;
        Padding padding2 = null;
        List list3 = null;
        Boolean bool = null;
        int i = 0;
        boolean z = true;
        while (z) {
            dimension = dimension;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    list = list3;
                    z = false;
                    badge = badge;
                    size = size;
                    list3 = list;
                    overflow = overflow;
                    break;
                case 0:
                    list = (List) aVarC.s(descriptor2, 0, aVarArr[0], list3);
                    i |= 1;
                    badge = badge;
                    size = size;
                    list3 = list;
                    overflow = overflow;
                    break;
                case 1:
                    size = size;
                    bool = (Boolean) aVarC.v(descriptor2, 1, f.a, bool);
                    i |= 2;
                    dimension = dimension;
                    overflow = overflow;
                    size = size;
                    break;
                case 2:
                    size = size;
                    dimension = (Dimension) aVarC.s(descriptor2, 2, aVarArr[2], dimension);
                    i |= 4;
                    overflow = overflow;
                    size = size;
                    break;
                case 3:
                    overflow = overflow;
                    size = (Size) aVarC.s(descriptor2, 3, Size$$serializer.INSTANCE, size);
                    i |= 8;
                    overflow = overflow;
                    break;
                case 4:
                    f = (Float) aVarC.v(descriptor2, 4, y.a, f);
                    i |= 16;
                    dimension = dimension;
                    size = size;
                    break;
                case 5:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 32;
                    dimension = dimension;
                    size = size;
                    break;
                case 6:
                    background = (Background) aVarC.v(descriptor2, 6, BackgroundDeserializer.INSTANCE, background);
                    i |= 64;
                    dimension = dimension;
                    size = size;
                    break;
                case 7:
                    padding2 = (Padding) aVarC.s(descriptor2, 7, Padding$$serializer.INSTANCE, padding2);
                    i |= 128;
                    dimension = dimension;
                    size = size;
                    break;
                case 8:
                    padding = (Padding) aVarC.s(descriptor2, 8, Padding$$serializer.INSTANCE, padding);
                    i |= 256;
                    dimension = dimension;
                    size = size;
                    break;
                case 9:
                    shape = (Shape) aVarC.v(descriptor2, 9, ShapeDeserializer.INSTANCE, shape);
                    i |= 512;
                    dimension = dimension;
                    size = size;
                    break;
                case 10:
                    border = (Border) aVarC.v(descriptor2, 10, Border$$serializer.INSTANCE, border);
                    i |= 1024;
                    dimension = dimension;
                    size = size;
                    break;
                case 11:
                    shadow = (Shadow) aVarC.v(descriptor2, 11, Shadow$$serializer.INSTANCE, shadow);
                    i |= 2048;
                    dimension = dimension;
                    size = size;
                    break;
                case 12:
                    badge = (Badge) aVarC.v(descriptor2, 12, Badge$$serializer.INSTANCE, badge);
                    i |= 4096;
                    dimension = dimension;
                    size = size;
                    break;
                case 13:
                    overflow = (StackComponent.Overflow) aVarC.v(descriptor2, 13, StackOverflowDeserializer.INSTANCE, overflow);
                    i |= 8192;
                    dimension = dimension;
                    size = size;
                    break;
                case 14:
                    list2 = (List) aVarC.s(descriptor2, 14, aVarArr[14], list2);
                    i |= 16384;
                    dimension = dimension;
                    size = size;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        StackComponent.Overflow overflow2 = overflow;
        Size size2 = size;
        aVarC.a(descriptor2);
        return new StackComponent(i, list3, bool, dimension, size2, f, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow2, list2, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, StackComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        StackComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
