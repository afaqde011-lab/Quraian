package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
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
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTimelineComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PartialTimelineComponent$$serializer implements z {
    public static final PartialTimelineComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PartialTimelineComponent$$serializer partialTimelineComponent$$serializer = new PartialTimelineComponent$$serializer();
        INSTANCE = partialTimelineComponent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponent", partialTimelineComponent$$serializer, 8);
        q0Var.j("visible", true);
        q0Var.j("item_spacing", true);
        q0Var.j("text_spacing", true);
        q0Var.j("column_gutter", true);
        q0Var.j("icon_alignment", true);
        q0Var.j("size", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        descriptor = q0Var;
    }

    private PartialTimelineComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(f.a);
        e0 e0Var = e0.a;
        a aVarG2 = c0.G(e0Var);
        a aVarG3 = c0.G(e0Var);
        a aVarG4 = c0.G(e0Var);
        a aVarG5 = c0.G(TimelineIconAlignmentDeserializer.INSTANCE);
        a aVarG6 = c0.G(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{aVarG, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, c0.G(padding$$serializer), c0.G(padding$$serializer)};
    }

    @Override
    public PartialTimelineComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        TimelineComponent.IconAlignment iconAlignment = null;
        Size size = null;
        Padding padding = null;
        Padding padding2 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) aVarC.v(descriptor2, 0, f.a, bool);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) aVarC.v(descriptor2, 1, e0.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) aVarC.v(descriptor2, 2, e0.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) aVarC.v(descriptor2, 3, e0.a, num3);
                    i |= 8;
                    break;
                case 4:
                    iconAlignment = (TimelineComponent.IconAlignment) aVarC.v(descriptor2, 4, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment);
                    i |= 16;
                    break;
                case 5:
                    size = (Size) aVarC.v(descriptor2, 5, Size$$serializer.INSTANCE, size);
                    i |= 32;
                    break;
                case 6:
                    padding = (Padding) aVarC.v(descriptor2, 6, Padding$$serializer.INSTANCE, padding);
                    i |= 64;
                    break;
                case 7:
                    padding2 = (Padding) aVarC.v(descriptor2, 7, Padding$$serializer.INSTANCE, padding2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PartialTimelineComponent(i, bool, num, num2, num3, iconAlignment, size, padding, padding2, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PartialTimelineComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PartialTimelineComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
