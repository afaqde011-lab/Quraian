package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
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
import p40.e0;
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class TimelineComponent$$serializer implements z {
    public static final TimelineComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        TimelineComponent$$serializer timelineComponent$$serializer = new TimelineComponent$$serializer();
        INSTANCE = timelineComponent$$serializer;
        q0 q0Var = new q0("timeline", timelineComponent$$serializer, 10);
        q0Var.j("item_spacing", false);
        q0Var.j("text_spacing", false);
        q0Var.j("column_gutter", false);
        q0Var.j("icon_alignment", false);
        q0Var.j("visible", true);
        q0Var.j("size", true);
        q0Var.j("padding", true);
        q0Var.j("margin", true);
        q0Var.j("items", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private TimelineComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = TimelineComponent.$childSerializers;
        a aVarG = c0.G(f.a);
        a aVar = aVarArr[8];
        a aVar2 = aVarArr[9];
        e0 e0Var = e0.a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new a[]{e0Var, e0Var, e0Var, TimelineIconAlignmentDeserializer.INSTANCE, aVarG, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, aVar, aVar2};
    }

    @Override
    public TimelineComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = TimelineComponent.$childSerializers;
        List list = null;
        List list2 = null;
        TimelineComponent.IconAlignment iconAlignment = null;
        Boolean bool = null;
        Size size = null;
        Padding padding = null;
        Padding padding2 = null;
        boolean z = true;
        int i = 0;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    iQ = aVarC.q(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    iQ2 = aVarC.q(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    iQ3 = aVarC.q(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    iconAlignment = (TimelineComponent.IconAlignment) aVarC.s(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) aVarC.v(descriptor2, 4, f.a, bool);
                    i |= 16;
                    break;
                case 5:
                    size = (Size) aVarC.s(descriptor2, 5, Size$$serializer.INSTANCE, size);
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
                    list = (List) aVarC.s(descriptor2, 8, aVarArr[8], list);
                    i |= 256;
                    break;
                case 9:
                    list2 = (List) aVarC.s(descriptor2, 9, aVarArr[9], list2);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new TimelineComponent(i, iQ, iQ2, iQ3, iconAlignment, bool, size, padding, padding2, list, list2, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, TimelineComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        TimelineComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
