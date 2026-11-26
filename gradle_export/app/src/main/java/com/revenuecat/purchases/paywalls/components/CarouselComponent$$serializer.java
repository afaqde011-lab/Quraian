package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
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
import java.util.List;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CarouselComponent$$serializer implements z {
    public static final CarouselComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CarouselComponent$$serializer carouselComponent$$serializer = new CarouselComponent$$serializer();
        INSTANCE = carouselComponent$$serializer;
        q0 q0Var = new q0("carousel", carouselComponent$$serializer, 18);
        q0Var.j("pages", false);
        q0Var.j("visible", true);
        q0Var.j("initial_page_index", true);
        q0Var.j("page_alignment", false);
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
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private CarouselComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = CarouselComponent.$childSerializers;
        a aVar = aVarArr[0];
        f fVar = f.a;
        a aVarG = c0.G(fVar);
        e0 e0Var = e0.a;
        a aVarG2 = c0.G(e0Var);
        a aVarG3 = c0.G(e0Var);
        a aVarG4 = c0.G(y.a);
        a aVarG5 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG6 = c0.G(BackgroundDeserializer.INSTANCE);
        a aVarG7 = c0.G(ShapeDeserializer.INSTANCE);
        a aVarG8 = c0.G(Border$$serializer.INSTANCE);
        a aVarG9 = c0.G(Shadow$$serializer.INSTANCE);
        a aVarG10 = c0.G(CarouselComponent$PageControl$$serializer.INSTANCE);
        a aVarG11 = c0.G(fVar);
        a aVarG12 = c0.G(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE);
        a aVar2 = aVarArr[17];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVar, aVarG, aVarG2, VerticalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, aVarG3, aVarG4, aVarG5, aVarG6, padding$$serializer, padding$$serializer, aVarG7, aVarG8, aVarG9, aVarG10, aVarG11, aVarG12, aVar2};
    }

    @Override
    public CarouselComponent deserialize(o40.c decoder) {
        List list;
        int i;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = CarouselComponent.$childSerializers;
        Background background = null;
        Shadow shadow = null;
        Border border = null;
        Shape shape = null;
        Padding padding = null;
        Padding padding2 = null;
        CarouselComponent.PageControl pageControl = null;
        Boolean bool = null;
        CarouselComponent.AutoAdvancePages autoAdvancePages = null;
        List list2 = null;
        Integer num = null;
        Float f = null;
        ColorScheme colorScheme = null;
        List list3 = null;
        Boolean bool2 = null;
        Integer num2 = null;
        VerticalAlignment verticalAlignment = null;
        Size size = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Integer num3 = num;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    list = list3;
                    z = false;
                    border = border;
                    num = num3;
                    list3 = list;
                    bool2 = bool2;
                    shadow = shadow;
                    f = f;
                    break;
                case 0:
                    list = (List) aVarC.s(descriptor2, 0, aVarArr[0], list3);
                    i2 |= 1;
                    border = border;
                    num = num3;
                    list3 = list;
                    bool2 = bool2;
                    shadow = shadow;
                    f = f;
                    break;
                case 1:
                    i2 |= 2;
                    num2 = num2;
                    shadow = shadow;
                    f = f;
                    bool2 = (Boolean) aVarC.v(descriptor2, 1, f.a, bool2);
                    num = num3;
                    break;
                case 2:
                    num2 = (Integer) aVarC.v(descriptor2, 2, e0.a, num2);
                    i2 |= 4;
                    num = num3;
                    shadow = shadow;
                    f = f;
                    break;
                case 3:
                    verticalAlignment = (VerticalAlignment) aVarC.s(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment);
                    i2 |= 8;
                    num = num3;
                    shadow = shadow;
                    f = f;
                    break;
                case 4:
                    size = (Size) aVarC.s(descriptor2, 4, Size$$serializer.INSTANCE, size);
                    i2 |= 16;
                    num = num3;
                    shadow = shadow;
                    f = f;
                    break;
                case 5:
                    shadow = shadow;
                    f = f;
                    num = (Integer) aVarC.v(descriptor2, 5, e0.a, num3);
                    i2 |= 32;
                    shadow = shadow;
                    f = f;
                    break;
                case 6:
                    f = (Float) aVarC.v(descriptor2, 6, y.a, f);
                    i2 |= 64;
                    num = num3;
                    shadow = shadow;
                    break;
                case 7:
                    f = f;
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 7, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i2 |= 128;
                    num = num3;
                    f = f;
                    break;
                case 8:
                    f = f;
                    background = (Background) aVarC.v(descriptor2, 8, BackgroundDeserializer.INSTANCE, background);
                    i2 |= 256;
                    num = num3;
                    f = f;
                    break;
                case 9:
                    f = f;
                    padding = (Padding) aVarC.s(descriptor2, 9, Padding$$serializer.INSTANCE, padding);
                    i2 |= 512;
                    num = num3;
                    f = f;
                    break;
                case 10:
                    f = f;
                    padding2 = (Padding) aVarC.s(descriptor2, 10, Padding$$serializer.INSTANCE, padding2);
                    i2 |= 1024;
                    num = num3;
                    f = f;
                    break;
                case 11:
                    f = f;
                    shape = (Shape) aVarC.v(descriptor2, 11, ShapeDeserializer.INSTANCE, shape);
                    i2 |= 2048;
                    num = num3;
                    f = f;
                    break;
                case 12:
                    f = f;
                    border = (Border) aVarC.v(descriptor2, 12, Border$$serializer.INSTANCE, border);
                    i2 |= 4096;
                    num = num3;
                    f = f;
                    break;
                case 13:
                    f = f;
                    shadow = (Shadow) aVarC.v(descriptor2, 13, Shadow$$serializer.INSTANCE, shadow);
                    i2 |= 8192;
                    num = num3;
                    f = f;
                    break;
                case 14:
                    f = f;
                    pageControl = (CarouselComponent.PageControl) aVarC.v(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl);
                    i2 |= 16384;
                    num = num3;
                    f = f;
                    break;
                case 15:
                    bool = (Boolean) aVarC.v(descriptor2, 15, f.a, bool);
                    i = 32768;
                    i2 |= i;
                    num = num3;
                    f = f;
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    autoAdvancePages = (CarouselComponent.AutoAdvancePages) aVarC.v(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages);
                    i = 65536;
                    i2 |= i;
                    num = num3;
                    f = f;
                    break;
                case 17:
                    list2 = (List) aVarC.s(descriptor2, 17, aVarArr[17], list2);
                    i = 131072;
                    i2 |= i;
                    num = num3;
                    f = f;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        Shadow shadow2 = shadow;
        Float f2 = f;
        aVarC.a(descriptor2);
        return new CarouselComponent(i2, list3, bool2, num2, verticalAlignment, size, num, f2, colorScheme, background, padding, padding2, shape, border, shadow2, pageControl, bool, autoAdvancePages, list2, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CarouselComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CarouselComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
