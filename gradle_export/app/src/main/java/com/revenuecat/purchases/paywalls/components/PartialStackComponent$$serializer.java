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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialStackComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PartialStackComponent$$serializer implements z {
    public static final PartialStackComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PartialStackComponent$$serializer partialStackComponent$$serializer = new PartialStackComponent$$serializer();
        INSTANCE = partialStackComponent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PartialStackComponent", partialStackComponent$$serializer, 13);
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
        descriptor = q0Var;
    }

    private PartialStackComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = PartialStackComponent.$childSerializers;
        a aVarG = c0.G(f.a);
        a aVarG2 = c0.G(aVarArr[1]);
        a aVarG3 = c0.G(Size$$serializer.INSTANCE);
        a aVarG4 = c0.G(y.a);
        a aVarG5 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG6 = c0.G(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, c0.G(padding$$serializer), c0.G(padding$$serializer), c0.G(ShapeDeserializer.INSTANCE), c0.G(Border$$serializer.INSTANCE), c0.G(Shadow$$serializer.INSTANCE), c0.G(Badge$$serializer.INSTANCE), c0.G(StackOverflowDeserializer.INSTANCE)};
    }

    @Override
    public PartialStackComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PartialStackComponent.$childSerializers;
        Shape shape = null;
        StackComponent.Overflow overflow = null;
        Badge badge = null;
        Border border = null;
        Shadow shadow = null;
        Boolean bool = null;
        Dimension dimension = null;
        Size size = null;
        Float f = null;
        ColorScheme colorScheme = null;
        Background background = null;
        Padding padding = null;
        Padding padding2 = null;
        int i = 1;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Boolean bool2 = bool;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    bool = bool2;
                    z = false;
                    i2 = i2;
                    overflow = overflow;
                    i = 1;
                    break;
                case 0:
                    bool = (Boolean) aVarC.v(descriptor2, 0, f.a, bool2);
                    i2 |= 1;
                    overflow = overflow;
                    i = 1;
                    break;
                case 1:
                    dimension = (Dimension) aVarC.v(descriptor2, i, aVarArr[i], dimension);
                    i2 |= 2;
                    bool = bool2;
                    break;
                case 2:
                    size = (Size) aVarC.v(descriptor2, 2, Size$$serializer.INSTANCE, size);
                    i2 |= 4;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 3:
                    f = (Float) aVarC.v(descriptor2, 3, y.a, f);
                    i2 |= 8;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 4:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i2 |= 16;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 5:
                    background = (Background) aVarC.v(descriptor2, 5, BackgroundDeserializer.INSTANCE, background);
                    i2 |= 32;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 6:
                    padding = (Padding) aVarC.v(descriptor2, 6, Padding$$serializer.INSTANCE, padding);
                    i2 |= 64;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 7:
                    padding2 = (Padding) aVarC.v(descriptor2, 7, Padding$$serializer.INSTANCE, padding2);
                    i2 |= 128;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 8:
                    shape = (Shape) aVarC.v(descriptor2, 8, ShapeDeserializer.INSTANCE, shape);
                    i2 |= 256;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 9:
                    border = (Border) aVarC.v(descriptor2, 9, Border$$serializer.INSTANCE, border);
                    i2 |= 512;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 10:
                    shadow = (Shadow) aVarC.v(descriptor2, 10, Shadow$$serializer.INSTANCE, shadow);
                    i2 |= 1024;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 11:
                    badge = (Badge) aVarC.v(descriptor2, 11, Badge$$serializer.INSTANCE, badge);
                    i2 |= 2048;
                    bool = bool2;
                    dimension = dimension;
                    break;
                case 12:
                    overflow = (StackComponent.Overflow) aVarC.v(descriptor2, 12, StackOverflowDeserializer.INSTANCE, overflow);
                    i2 |= 4096;
                    bool = bool2;
                    dimension = dimension;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PartialStackComponent(i2, bool, dimension, size, f, colorScheme, background, padding, padding2, shape, border, shadow, badge, overflow, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PartialStackComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PartialStackComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
