package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
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
import p40.x0;
import p40.y;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialCarouselComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PartialCarouselComponent$$serializer implements z {
    public static final PartialCarouselComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PartialCarouselComponent$$serializer partialCarouselComponent$$serializer = new PartialCarouselComponent$$serializer();
        INSTANCE = partialCarouselComponent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PartialCarouselComponent", partialCarouselComponent$$serializer, 16);
        q0Var.j("visible", true);
        q0Var.j("initial_page_index", true);
        q0Var.j("page_alignment", true);
        q0Var.j("size", true);
        q0Var.j("page_peek", true);
        q0Var.j("page_spacing", true);
        q0Var.j("background_color", true);
        q0Var.j("background", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("shape", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("page_control", true);
        q0Var.j("loop", true);
        q0Var.j("auto_advance", true);
        descriptor = q0Var;
    }

    private PartialCarouselComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        f fVar = f.a;
        a aVarG = c0.G(fVar);
        e0 e0Var = e0.a;
        a aVarG2 = c0.G(e0Var);
        a aVarG3 = c0.G(VerticalAlignmentDeserializer.INSTANCE);
        a aVarG4 = c0.G(Size$$serializer.INSTANCE);
        a aVarG5 = c0.G(e0Var);
        a aVarG6 = c0.G(y.a);
        a aVarG7 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG8 = c0.G(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, aVarG7, aVarG8, c0.G(padding$$serializer), c0.G(padding$$serializer), c0.G(ShapeDeserializer.INSTANCE), c0.G(Border$$serializer.INSTANCE), c0.G(Shadow$$serializer.INSTANCE), c0.G(CarouselComponent$PageControl$$serializer.INSTANCE), c0.G(fVar), c0.G(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE)};
    }

    @Override
    public PartialCarouselComponent deserialize(o40.c decoder) {
        Integer num;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        Padding padding = null;
        CarouselComponent.PageControl pageControl = null;
        Shadow shadow = null;
        Shape shape = null;
        Border border = null;
        Boolean bool = null;
        CarouselComponent.AutoAdvancePages autoAdvancePages = null;
        Size size = null;
        Integer num2 = null;
        Float f = null;
        ColorScheme colorScheme = null;
        Background background = null;
        Padding padding2 = null;
        Boolean bool2 = null;
        Integer num3 = null;
        VerticalAlignment verticalAlignment = null;
        int i = 0;
        boolean z = true;
        while (z) {
            size = size;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    shadow = shadow;
                    pageControl = pageControl;
                    verticalAlignment = verticalAlignment;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 0:
                    bool2 = (Boolean) aVarC.v(descriptor2, 0, f.a, bool2);
                    i |= 1;
                    shadow = shadow;
                    pageControl = pageControl;
                    verticalAlignment = verticalAlignment;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 1:
                    i |= 2;
                    verticalAlignment = verticalAlignment;
                    num2 = num2;
                    pageControl = pageControl;
                    num3 = (Integer) aVarC.v(descriptor2, 1, e0.a, num3);
                    size = size;
                    break;
                case 2:
                    num = num2;
                    verticalAlignment = (VerticalAlignment) aVarC.v(descriptor2, 2, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment);
                    i |= 4;
                    size = size;
                    num2 = num;
                    pageControl = pageControl;
                    break;
                case 3:
                    num = num2;
                    size = (Size) aVarC.v(descriptor2, 3, Size$$serializer.INSTANCE, size);
                    i |= 8;
                    num2 = num;
                    pageControl = pageControl;
                    break;
                case 4:
                    pageControl = pageControl;
                    num2 = (Integer) aVarC.v(descriptor2, 4, e0.a, num2);
                    i |= 16;
                    size = size;
                    pageControl = pageControl;
                    break;
                case 5:
                    f = (Float) aVarC.v(descriptor2, 5, y.a, f);
                    i |= 32;
                    num2 = num2;
                    break;
                case 6:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 6, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 64;
                    num2 = num2;
                    break;
                case 7:
                    background = (Background) aVarC.v(descriptor2, 7, BackgroundDeserializer.INSTANCE, background);
                    i |= 128;
                    num2 = num2;
                    break;
                case 8:
                    padding2 = (Padding) aVarC.v(descriptor2, 8, Padding$$serializer.INSTANCE, padding2);
                    i |= 256;
                    num2 = num2;
                    break;
                case 9:
                    padding = (Padding) aVarC.v(descriptor2, 9, Padding$$serializer.INSTANCE, padding);
                    i |= 512;
                    num2 = num2;
                    break;
                case 10:
                    shape = (Shape) aVarC.v(descriptor2, 10, ShapeDeserializer.INSTANCE, shape);
                    i |= 1024;
                    num2 = num2;
                    break;
                case 11:
                    border = (Border) aVarC.v(descriptor2, 11, Border$$serializer.INSTANCE, border);
                    i |= 2048;
                    num2 = num2;
                    break;
                case 12:
                    shadow = (Shadow) aVarC.v(descriptor2, 12, Shadow$$serializer.INSTANCE, shadow);
                    i |= 4096;
                    num2 = num2;
                    break;
                case 13:
                    pageControl = (CarouselComponent.PageControl) aVarC.v(descriptor2, 13, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl);
                    i |= 8192;
                    num2 = num2;
                    break;
                case 14:
                    bool = (Boolean) aVarC.v(descriptor2, 14, f.a, bool);
                    i |= 16384;
                    num2 = num2;
                    break;
                case 15:
                    autoAdvancePages = (CarouselComponent.AutoAdvancePages) aVarC.v(descriptor2, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages);
                    i |= 32768;
                    num2 = num2;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        CarouselComponent.PageControl pageControl2 = pageControl;
        Integer num4 = num2;
        aVarC.a(descriptor2);
        return new PartialCarouselComponent(i, bool2, num3, verticalAlignment, size, num4, f, colorScheme, background, padding2, padding, shape, border, shadow, pageControl2, bool, autoAdvancePages, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PartialCarouselComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PartialCarouselComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
