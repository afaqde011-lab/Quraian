package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
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
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.Item.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class TimelineComponent$Item$$serializer implements z {
    public static final TimelineComponent$Item$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        TimelineComponent$Item$$serializer timelineComponent$Item$$serializer = new TimelineComponent$Item$$serializer();
        INSTANCE = timelineComponent$Item$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Item", timelineComponent$Item$$serializer, 6);
        q0Var.j("title", false);
        q0Var.j("visible", true);
        q0Var.j("description", true);
        q0Var.j("icon", false);
        q0Var.j("connector", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private TimelineComponent$Item$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = TimelineComponent.Item.$childSerializers;
        TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
        return new a[]{textComponent$$serializer, c0.G(f.a), c0.G(textComponent$$serializer), IconComponent$$serializer.INSTANCE, c0.G(TimelineComponent$Connector$$serializer.INSTANCE), aVarArr[5]};
    }

    @Override
    public TimelineComponent.Item deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = TimelineComponent.Item.$childSerializers;
        int i = 0;
        TextComponent textComponent = null;
        Boolean bool = null;
        TextComponent textComponent2 = null;
        IconComponent iconComponent = null;
        TimelineComponent.Connector connector = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    textComponent = (TextComponent) aVarC.s(descriptor2, 0, TextComponent$$serializer.INSTANCE, textComponent);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) aVarC.v(descriptor2, 1, f.a, bool);
                    i |= 2;
                    break;
                case 2:
                    textComponent2 = (TextComponent) aVarC.v(descriptor2, 2, TextComponent$$serializer.INSTANCE, textComponent2);
                    i |= 4;
                    break;
                case 3:
                    iconComponent = (IconComponent) aVarC.s(descriptor2, 3, IconComponent$$serializer.INSTANCE, iconComponent);
                    i |= 8;
                    break;
                case 4:
                    connector = (TimelineComponent.Connector) aVarC.v(descriptor2, 4, TimelineComponent$Connector$$serializer.INSTANCE, connector);
                    i |= 16;
                    break;
                case 5:
                    list = (List) aVarC.s(descriptor2, 5, aVarArr[5], list);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new TimelineComponent.Item(i, textComponent, bool, textComponent2, iconComponent, connector, list, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, TimelineComponent.Item value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        TimelineComponent.Item.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
