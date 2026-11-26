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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabsComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/TabsComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class TabsComponent$$serializer implements z {
    public static final TabsComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        TabsComponent$$serializer tabsComponent$$serializer = new TabsComponent$$serializer();
        INSTANCE = tabsComponent$$serializer;
        q0 q0Var = new q0("tabs", tabsComponent$$serializer, 13);
        q0Var.j("visible", true);
        q0Var.j("size", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("background_color", true);
        q0Var.j("background", true);
        q0Var.j("shape", true);
        q0Var.j("border", true);
        q0Var.j("shadow", true);
        q0Var.j("control", false);
        q0Var.j("tabs", false);
        q0Var.j("default_tab_id", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private TabsComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = TabsComponent.$childSerializers;
        a aVarG = c0.G(f.a);
        a aVarG2 = c0.G(ColorScheme$$serializer.INSTANCE);
        a aVarG3 = c0.G(BackgroundDeserializer.INSTANCE);
        a aVarG4 = c0.G(ShapeDeserializer.INSTANCE);
        a aVarG5 = c0.G(Border$$serializer.INSTANCE);
        a aVarG6 = c0.G(Shadow$$serializer.INSTANCE);
        a aVar = aVarArr[9];
        a aVar2 = aVarArr[10];
        a aVarG7 = c0.G(b1.a);
        a aVar3 = aVarArr[12];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, aVar, aVar2, aVarG7, aVar3};
    }

    @Override
    public TabsComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = TabsComponent.$childSerializers;
        Shadow shadow = null;
        List list = null;
        String str = null;
        TabsComponent.TabControl tabControl = null;
        List list2 = null;
        Boolean bool = null;
        Size size = null;
        Padding padding = null;
        Padding padding2 = null;
        ColorScheme colorScheme = null;
        Background background = null;
        Shape shape = null;
        Border border = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Boolean bool2 = bool;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    bool = bool2;
                    z = false;
                    i = i;
                    list = list;
                    break;
                case 0:
                    bool = (Boolean) aVarC.v(descriptor2, 0, f.a, bool2);
                    i |= 1;
                    list = list;
                    break;
                case 1:
                    size = (Size) aVarC.s(descriptor2, 1, Size$$serializer.INSTANCE, size);
                    i |= 2;
                    bool = bool2;
                    break;
                case 2:
                    padding = (Padding) aVarC.s(descriptor2, 2, Padding$$serializer.INSTANCE, padding);
                    i |= 4;
                    bool = bool2;
                    size = size;
                    break;
                case 3:
                    padding2 = (Padding) aVarC.s(descriptor2, 3, Padding$$serializer.INSTANCE, padding2);
                    i |= 8;
                    bool = bool2;
                    size = size;
                    break;
                case 4:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 16;
                    bool = bool2;
                    size = size;
                    break;
                case 5:
                    background = (Background) aVarC.v(descriptor2, 5, BackgroundDeserializer.INSTANCE, background);
                    i |= 32;
                    bool = bool2;
                    size = size;
                    break;
                case 6:
                    shape = (Shape) aVarC.v(descriptor2, 6, ShapeDeserializer.INSTANCE, shape);
                    i |= 64;
                    bool = bool2;
                    size = size;
                    break;
                case 7:
                    border = (Border) aVarC.v(descriptor2, 7, Border$$serializer.INSTANCE, border);
                    i |= 128;
                    bool = bool2;
                    size = size;
                    break;
                case 8:
                    shadow = (Shadow) aVarC.v(descriptor2, 8, Shadow$$serializer.INSTANCE, shadow);
                    i |= 256;
                    bool = bool2;
                    size = size;
                    break;
                case 9:
                    tabControl = (TabsComponent.TabControl) aVarC.s(descriptor2, 9, aVarArr[9], tabControl);
                    i |= 512;
                    bool = bool2;
                    size = size;
                    break;
                case 10:
                    list2 = (List) aVarC.s(descriptor2, 10, aVarArr[10], list2);
                    i |= 1024;
                    bool = bool2;
                    size = size;
                    break;
                case 11:
                    str = (String) aVarC.v(descriptor2, 11, b1.a, str);
                    i |= 2048;
                    bool = bool2;
                    size = size;
                    break;
                case 12:
                    list = (List) aVarC.s(descriptor2, 12, aVarArr[12], list);
                    i |= 4096;
                    bool = bool2;
                    size = size;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new TabsComponent(i, bool, size, padding, padding2, colorScheme, background, shape, border, shadow, tabControl, list2, str, list, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, TabsComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        TabsComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
