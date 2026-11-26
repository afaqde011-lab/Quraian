package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
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
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.PageControl.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CarouselComponent$PageControl$$serializer implements z {
    public static final CarouselComponent$PageControl$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CarouselComponent$PageControl$$serializer carouselComponent$PageControl$$serializer = new CarouselComponent$PageControl$$serializer();
        INSTANCE = carouselComponent$PageControl$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl", carouselComponent$PageControl$$serializer, 10);
        q0Var.j("position", false);
        q0Var.j("spacing", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("background_color", true);
        q0Var.j("shape", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("active", false);
        q0Var.j("default", false);
        descriptor = q0Var;
    }

    private CarouselComponent$PageControl$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(e0.a);
        a aVarG2 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG3 = c0.G(ShapeDeserializer.INSTANCE);
        a aVarG4 = c0.G(Border$$serializer.INSTANCE);
        a aVarG5 = c0.G(Shadow$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
        return new a[]{CarouselPageControlPositionDeserializer.INSTANCE, aVarG, padding$$serializer, padding$$serializer, aVarG2, aVarG3, aVarG4, aVarG5, carouselComponent$PageControl$Indicator$$serializer, carouselComponent$PageControl$Indicator$$serializer};
    }

    @Override
    public CarouselComponent.PageControl deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        CarouselComponent.PageControl.Indicator indicator = null;
        CarouselComponent.PageControl.Position position = null;
        Integer num = null;
        Padding padding = null;
        Padding padding2 = null;
        ColorScheme colorScheme = null;
        Shape shape = null;
        Border border = null;
        Shadow shadow = null;
        CarouselComponent.PageControl.Indicator indicator2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    position = (CarouselComponent.PageControl.Position) aVarC.s(descriptor2, 0, CarouselPageControlPositionDeserializer.INSTANCE, position);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) aVarC.v(descriptor2, 1, e0.a, num);
                    i |= 2;
                    break;
                case 2:
                    padding = (Padding) aVarC.s(descriptor2, 2, Padding$$serializer.INSTANCE, padding);
                    i |= 4;
                    break;
                case 3:
                    padding2 = (Padding) aVarC.s(descriptor2, 3, Padding$$serializer.INSTANCE, padding2);
                    i |= 8;
                    break;
                case 4:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 16;
                    break;
                case 5:
                    shape = (Shape) aVarC.v(descriptor2, 5, ShapeDeserializer.INSTANCE, shape);
                    i |= 32;
                    break;
                case 6:
                    border = (Border) aVarC.v(descriptor2, 6, Border$$serializer.INSTANCE, border);
                    i |= 64;
                    break;
                case 7:
                    shadow = (Shadow) aVarC.v(descriptor2, 7, Shadow$$serializer.INSTANCE, shadow);
                    i |= 128;
                    break;
                case 8:
                    indicator2 = (CarouselComponent.PageControl.Indicator) aVarC.s(descriptor2, 8, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator2);
                    i |= 256;
                    break;
                case 9:
                    indicator = (CarouselComponent.PageControl.Indicator) aVarC.s(descriptor2, 9, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new CarouselComponent.PageControl(i, position, num, padding, padding2, colorScheme, shape, border, shadow, indicator2, indicator, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CarouselComponent.PageControl value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CarouselComponent.PageControl.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
