package com.revenuecat.purchases.paywalls.components;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.c;
import n40.e;
import o40.d;
import q40.b0;
import q40.j;
import q40.l;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;", "Ll40/a;", "", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;I)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/lang/Integer;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FontSizeSerializer implements a {
    public static final FontSizeSerializer INSTANCE = new FontSizeSerializer();
    private static final e descriptor = t1.e("FontSize", c.h);

    private FontSizeSerializer() {
    }

    @Override
    public Integer deserialize(o40.c decoder) {
        int iE;
        m.e(decoder, "decoder");
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            throw new SerializationException("Expected font_size to be part of a JSON object");
        }
        l lVarM = jVar.m();
        b0 b0Var = lVarM instanceof b0 ? (b0) lVarM : null;
        if (b0Var == null) {
            throw new SerializationException("Expected font_size to be a JsonPrimitive");
        }
        if (b0Var.c()) {
            String strA = b0Var.a();
            switch (strA.hashCode()) {
                case -1383701233:
                    if (strA.equals("body_l")) {
                        iE = 17;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case -1383701232:
                    if (strA.equals("body_m")) {
                        iE = 15;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case -1383701226:
                    if (strA.equals("body_s")) {
                        iE = 13;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case -209710737:
                    if (strA.equals("heading_l")) {
                        iE = 28;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case -209710736:
                    if (strA.equals("heading_m")) {
                        iE = 24;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case -209710730:
                    if (strA.equals("heading_s")) {
                        iE = 20;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case 54935217:
                    if (strA.equals("body_xl")) {
                        iE = 18;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case 331460015:
                    if (strA.equals("heading_xxl")) {
                        iE = 40;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case 2088902225:
                    if (strA.equals("heading_xl")) {
                        iE = 34;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                case 2088902232:
                    if (strA.equals("heading_xs")) {
                        iE = 16;
                        break;
                    }
                    throw new SerializationException("Unknown font size name: ".concat(strA));
                default:
                    throw new SerializationException("Unknown font size name: ".concat(strA));
            }
        }
        iE = q40.m.e(b0Var);
        return Integer.valueOf(iE);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    public void serialize(d encoder, int value) {
        m.e(encoder, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }

    @Override
    public void serialize(d dVar, Object obj) {
        serialize(dVar, ((Number) obj).intValue());
    }
}
