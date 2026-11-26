package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import h00.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.c;
import p40.e0;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cBµ\u0001\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J(\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$HÁ\u0001¢\u0006\u0004\b'\u0010(R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010,R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010CR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010E\u0012\u0004\bH\u0010.\u001a\u0004\bF\u0010GR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bO\u0010NR#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "text", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "", "visible", "backgroundColor", "Lcom/revenuecat/purchases/FontAlias;", "fontName", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "", "fontWeightInt", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "horizontalAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "overrides", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Lkotlin/jvm/internal/f;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getText-z7Tp-4o", "()Ljava/lang/String;", "getText-z7Tp-4o$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getBackgroundColor", "getBackgroundColor$annotations", "getFontName-ARcRonI", "getFontName-ARcRonI$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight$annotations", "Ljava/lang/Integer;", "getFontWeightInt", "()Ljava/lang/Integer;", "getFontWeightInt$annotations", "I", "getFontSize", "()I", "getFontSize$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextComponent implements PaywallComponent {
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final int fontSize;
    private final FontWeight fontWeight;
    private final Integer fontWeightInt;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final List<ComponentOverride<PartialTextComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialTextComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TextComponent$$serializer.INSTANCE;
        }
    }

    private TextComponent(int i, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List<ComponentOverride<PartialTextComponent>> list, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, TextComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.color = colorScheme;
        if ((i & 4) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i & 16) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i & 32) == 0) {
            this.fontWeight = FontWeight.REGULAR;
        } else {
            this.fontWeight = fontWeight;
        }
        if ((i & 64) == 0) {
            this.fontWeightInt = null;
        } else {
            this.fontWeightInt = num;
        }
        if ((i & 128) == 0) {
            this.fontSize = 15;
        } else {
            this.fontSize = i2;
        }
        if ((i & 256) == 0) {
            this.horizontalAlignment = HorizontalAlignment.CENTER;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i & 512) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 1024) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        this.margin = (i & 2048) == 0 ? Padding.INSTANCE.getZero() : padding2;
        this.overrides = (i & 4096) == 0 ? x.A : list;
    }

    @g00.c
    public TextComponent(int i, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, x0 x0Var, f fVar) {
        this(i, str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i2, horizontalAlignment, size, padding, padding2, (List<ComponentOverride<PartialTextComponent>>) list, x0Var);
    }

    private TextComponent(String text, ColorScheme color, Boolean bool, ColorScheme colorScheme, String str, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding margin, List<ComponentOverride<PartialTextComponent>> overrides) {
        m.e(text, "text");
        m.e(color, "color");
        m.e(fontWeight, "fontWeight");
        m.e(horizontalAlignment, "horizontalAlignment");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.text = text;
        this.color = color;
        this.visible = bool;
        this.backgroundColor = colorScheme;
        this.fontName = str;
        this.fontWeight = fontWeight;
        this.fontWeightInt = num;
        this.fontSize = i;
        this.horizontalAlignment = horizontalAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.overrides = overrides;
    }

    public TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, int i2, f fVar) {
        this(str, colorScheme, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : colorScheme2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? FontWeight.REGULAR : fontWeight, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? 15 : i, (i2 & 256) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i2 & 512) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i2 & 1024) != 0 ? Padding.INSTANCE.getZero() : padding, (i2 & 2048) != 0 ? Padding.INSTANCE.getZero() : padding2, (i2 & 4096) != 0 ? x.A : list, null);
    }

    public TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, f fVar) {
        this(str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i, horizontalAlignment, size, padding, padding2, list);
    }

    public static void getBackgroundColor$annotations() {
    }

    public static void m188getFontNameARcRonI$annotations() {
    }

    public static void getFontSize$annotations() {
    }

    public static void getFontWeight$annotations() {
    }

    public static void getFontWeightInt$annotations() {
    }

    public static void getHorizontalAlignment$annotations() {
    }

    public static void m189getTextz7Tp4o$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(TextComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.text));
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        output.C(serialDesc, 1, colorScheme$$serializer, self.color);
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 2, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || self.backgroundColor != null) {
            output.x(serialDesc, 3, colorScheme$$serializer, self.backgroundColor);
        }
        if (output.k(serialDesc) || self.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str = self.fontName;
            output.x(serialDesc, 4, fontAlias$$serializer, str != null ? FontAlias.m21boximpl(str) : null);
        }
        if (output.k(serialDesc) || self.fontWeight != FontWeight.REGULAR) {
            output.C(serialDesc, 5, FontWeightDeserializer.INSTANCE, self.fontWeight);
        }
        if (output.k(serialDesc) || self.fontWeightInt != null) {
            output.x(serialDesc, 6, e0.a, self.fontWeightInt);
        }
        if (output.k(serialDesc) || self.fontSize != 15) {
            output.C(serialDesc, 7, FontSizeSerializer.INSTANCE, Integer.valueOf(self.fontSize));
        }
        if (output.k(serialDesc) || self.horizontalAlignment != HorizontalAlignment.CENTER) {
            output.C(serialDesc, 8, HorizontalAlignmentDeserializer.INSTANCE, self.horizontalAlignment);
        }
        if (output.k(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.C(serialDesc, 9, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 10, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 11, Padding$$serializer.INSTANCE, self.margin);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 12, aVarArr[12], self.overrides);
    }

    public boolean equals(Object obj) {
        boolean zM24equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextComponent)) {
            return false;
        }
        TextComponent textComponent = (TextComponent) obj;
        if (!LocalizationKey.m234equalsimpl0(this.text, textComponent.text) || !m.a(this.color, textComponent.color) || !m.a(this.visible, textComponent.visible) || !m.a(this.backgroundColor, textComponent.backgroundColor)) {
            return false;
        }
        String str = this.fontName;
        String str2 = textComponent.fontName;
        if (str == null) {
            if (str2 == null) {
                zM24equalsimpl0 = true;
            } else {
                zM24equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM24equalsimpl0 = false;
        } else {
            zM24equalsimpl0 = FontAlias.m24equalsimpl0(str, str2);
        }
        return zM24equalsimpl0 && this.fontWeight == textComponent.fontWeight && m.a(this.fontWeightInt, textComponent.fontWeightInt) && this.fontSize == textComponent.fontSize && this.horizontalAlignment == textComponent.horizontalAlignment && m.a(this.size, textComponent.size) && m.a(this.padding, textComponent.padding) && m.a(this.margin, textComponent.margin) && m.a(this.overrides, textComponent.overrides);
    }

    public final ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ColorScheme getColor() {
        return this.color;
    }

    public final String getFontName() {
        return this.fontName;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Integer getFontWeightInt() {
        return this.fontWeightInt;
    }

    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Size getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.color.hashCode() + (LocalizationKey.m235hashCodeimpl(this.text) * 31)) * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        String str = this.fontName;
        int iHashCode4 = (this.fontWeight.hashCode() + ((iHashCode3 + (str == null ? 0 : FontAlias.m25hashCodeimpl(str))) * 31)) * 31;
        Integer num = this.fontWeightInt;
        return this.overrides.hashCode() + ((this.margin.hashCode() + ((this.padding.hashCode() + ((this.size.hashCode() + ((this.horizontalAlignment.hashCode() + ((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.fontSize) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextComponent(text=");
        sb.append((Object) LocalizationKey.m236toStringimpl(this.text));
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", fontName=");
        String str = this.fontName;
        sb.append((Object) (str == null ? "null" : FontAlias.m26toStringimpl(str)));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontWeightInt=");
        sb.append(this.fontWeightInt);
        sb.append(", fontSize=");
        sb.append(this.fontSize);
        sb.append(", horizontalAlignment=");
        sb.append(this.horizontalAlignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
