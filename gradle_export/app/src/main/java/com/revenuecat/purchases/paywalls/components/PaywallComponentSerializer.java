package com.revenuecat.purchases.paywalls.components;

import a1.b;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import q40.j;
import q40.l;
import q40.x;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponentSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentSerializer implements a {
    private final e descriptor = t1.k("PaywallComponent", new e[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    @Override
    public PaywallComponent deserialize(c decoder) {
        String string;
        m.e(decoder, "decoder");
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            throw new SerializationException(x5.p(a0.a, decoder.getClass(), new StringBuilder("Can only deserialize PaywallComponent from JSON, got: ")));
        }
        x xVarG = q40.m.g(jVar.m());
        l lVar = (l) xVarG.get("type");
        String strA = lVar != null ? q40.m.h(lVar).a() : null;
        if (strA != null) {
            switch (strA.hashCode()) {
                case -2076650431:
                    if (strA.equals("timeline")) {
                        q40.c cVarY = jVar.y();
                        String string2 = xVarG.toString();
                        cVarY.getClass();
                        return (PaywallComponent) cVarY.b(string2, TimelineComponent.INSTANCE.serializer());
                    }
                    break;
                case -1896978765:
                    if (strA.equals("tab_control")) {
                        q40.c cVarY2 = jVar.y();
                        String string3 = xVarG.toString();
                        cVarY2.getClass();
                        return (PaywallComponent) cVarY2.b(string3, TabControlComponent.INSTANCE.serializer());
                    }
                    break;
                case -1822017359:
                    if (strA.equals("sticky_footer")) {
                        q40.c cVarY3 = jVar.y();
                        String string4 = xVarG.toString();
                        cVarY3.getClass();
                        return (PaywallComponent) cVarY3.b(string4, StickyFooterComponent.INSTANCE.serializer());
                    }
                    break;
                case -1391809488:
                    if (strA.equals("purchase_button")) {
                        q40.c cVarY4 = jVar.y();
                        String string5 = xVarG.toString();
                        cVarY4.getClass();
                        return (PaywallComponent) cVarY4.b(string5, PurchaseButtonComponent.INSTANCE.serializer());
                    }
                    break;
                case -1377687758:
                    if (strA.equals("button")) {
                        q40.c cVarY5 = jVar.y();
                        String string6 = xVarG.toString();
                        cVarY5.getClass();
                        return (PaywallComponent) cVarY5.b(string6, ButtonComponent.INSTANCE.serializer());
                    }
                    break;
                case -1221270899:
                    if (strA.equals("header")) {
                        q40.c cVarY6 = jVar.y();
                        String string7 = xVarG.toString();
                        cVarY6.getClass();
                        return (PaywallComponent) cVarY6.b(string7, HeaderComponent.INSTANCE.serializer());
                    }
                    break;
                case -807062458:
                    if (strA.equals("package")) {
                        q40.c cVarY7 = jVar.y();
                        String string8 = xVarG.toString();
                        cVarY7.getClass();
                        return (PaywallComponent) cVarY7.b(string8, PackageComponent.INSTANCE.serializer());
                    }
                    break;
                case -364374390:
                    if (strA.equals("fallback_header")) {
                        return FallbackHeaderComponent.INSTANCE;
                    }
                    break;
                case 2908512:
                    if (strA.equals("carousel")) {
                        q40.c cVarY8 = jVar.y();
                        String string9 = xVarG.toString();
                        cVarY8.getClass();
                        return (PaywallComponent) cVarY8.b(string9, CarouselComponent.INSTANCE.serializer());
                    }
                    break;
                case 3226745:
                    if (strA.equals("icon")) {
                        q40.c cVarY9 = jVar.y();
                        String string10 = xVarG.toString();
                        cVarY9.getClass();
                        return (PaywallComponent) cVarY9.b(string10, IconComponent.INSTANCE.serializer());
                    }
                    break;
                case 3552126:
                    if (strA.equals("tabs")) {
                        q40.c cVarY10 = jVar.y();
                        String string11 = xVarG.toString();
                        cVarY10.getClass();
                        return (PaywallComponent) cVarY10.b(string11, TabsComponent.INSTANCE.serializer());
                    }
                    break;
                case 3556653:
                    if (strA.equals("text")) {
                        q40.c cVarY11 = jVar.y();
                        String string12 = xVarG.toString();
                        cVarY11.getClass();
                        return (PaywallComponent) cVarY11.b(string12, TextComponent.INSTANCE.serializer());
                    }
                    break;
                case 100313435:
                    if (strA.equals("image")) {
                        q40.c cVarY12 = jVar.y();
                        String string13 = xVarG.toString();
                        cVarY12.getClass();
                        return (PaywallComponent) cVarY12.b(string13, ImageComponent.INSTANCE.serializer());
                    }
                    break;
                case 109757064:
                    if (strA.equals("stack")) {
                        q40.c cVarY13 = jVar.y();
                        String string14 = xVarG.toString();
                        cVarY13.getClass();
                        return (PaywallComponent) cVarY13.b(string14, StackComponent.INSTANCE.serializer());
                    }
                    break;
                case 112202875:
                    if (strA.equals("video")) {
                        q40.c cVarY14 = jVar.y();
                        String string15 = xVarG.toString();
                        cVarY14.getClass();
                        return (PaywallComponent) cVarY14.b(string15, VideoComponent.INSTANCE.serializer());
                    }
                    break;
                case 318201406:
                    if (strA.equals("tab_control_button")) {
                        q40.c cVarY15 = jVar.y();
                        String string16 = xVarG.toString();
                        cVarY15.getClass();
                        return (PaywallComponent) cVarY15.b(string16, TabControlButtonComponent.INSTANCE.serializer());
                    }
                    break;
                case 827585120:
                    if (strA.equals("tab_control_toggle")) {
                        q40.c cVarY16 = jVar.y();
                        String string17 = xVarG.toString();
                        cVarY16.getClass();
                        return (PaywallComponent) cVarY16.b(string17, TabControlToggleComponent.INSTANCE.serializer());
                    }
                    break;
                case 1352226353:
                    if (strA.equals("countdown")) {
                        q40.c cVarY17 = jVar.y();
                        String string18 = xVarG.toString();
                        cVarY17.getClass();
                        return (PaywallComponent) cVarY17.b(string18, CountdownComponent.INSTANCE.serializer());
                    }
                    break;
            }
        }
        l lVar2 = (l) xVarG.get("fallback");
        if (lVar2 != null) {
            x xVar = lVar2 instanceof x ? (x) lVar2 : null;
            if (xVar != null && (string = xVar.toString()) != null) {
                q40.c cVarY18 = jVar.y();
                cVarY18.getClass();
                PaywallComponent paywallComponent = (PaywallComponent) cVarY18.b(string, PaywallComponent.INSTANCE.serializer());
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new SerializationException(b.o("No fallback provided for unknown type: ", strA));
    }

    @Override
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
    }
}
