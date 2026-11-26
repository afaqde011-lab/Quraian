package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
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
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.e0;
import p40.x0;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018B¡\u0001\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R(\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u00100R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010-\u001a\u0004\b6\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b:\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010;R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bI\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "text", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "backgroundColor", "Lcom/revenuecat/purchases/FontAlias;", "fontName", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "", "fontWeightInt", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "horizontalAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lkotlin/jvm/internal/f;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getText-sa7TU9Q", "()Ljava/lang/String;", "getText-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "getBackgroundColor$annotations", "getFontName-ARcRonI", "getFontName-ARcRonI$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight$annotations", "Ljava/lang/Integer;", "getFontWeightInt", "()Ljava/lang/Integer;", "getFontWeightInt$annotations", "getFontSize", "getFontSize$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTextComponent implements PartialComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final Integer fontSize;
    private final FontWeight fontWeight;
    private final Integer fontWeightInt;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PartialTextComponent$$serializer.INSTANCE;
        }
    }

    private PartialTextComponent(int i, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, Integer num2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, x0 x0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 4) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
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
            this.fontWeight = null;
        } else {
            this.fontWeight = fontWeight;
        }
        if ((i & 64) == 0) {
            this.fontWeightInt = null;
        } else {
            this.fontWeightInt = num;
        }
        if ((i & 128) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num2;
        }
        if ((i & 256) == 0) {
            this.horizontalAlignment = null;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i & 512) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 1024) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 2048) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
    }

    @c
    public PartialTextComponent(int i, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, Integer num2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, x0 x0Var, f fVar) {
        this(i, bool, str, colorScheme, colorScheme2, str2, fontWeight, num, num2, horizontalAlignment, size, padding, padding2, x0Var);
    }

    private PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, Integer num2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2) {
        this.visible = bool;
        this.text = str;
        this.color = colorScheme;
        this.backgroundColor = colorScheme2;
        this.fontName = str2;
        this.fontWeight = fontWeight;
        this.fontWeightInt = num;
        this.fontSize = num2;
        this.horizontalAlignment = horizontalAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
    }

    public PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, Integer num2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, int i, f fVar) {
        Boolean bool2 = (i & 1) != 0 ? Boolean.TRUE : bool;
        String str3 = (i & 2) != 0 ? null : str;
        ColorScheme colorScheme3 = (i & 4) != 0 ? null : colorScheme;
        ColorScheme colorScheme4 = (i & 8) != 0 ? null : colorScheme2;
        String str4 = (i & 16) != 0 ? null : str2;
        FontWeight fontWeight2 = (i & 32) != 0 ? null : fontWeight;
        Integer num3 = (i & 64) != 0 ? null : num;
        Integer num4 = (i & 128) != 0 ? null : num2;
        HorizontalAlignment horizontalAlignment2 = (i & 256) != 0 ? null : horizontalAlignment;
        Size size2 = (i & 512) != 0 ? null : size;
        Padding padding3 = (i & 1024) != 0 ? null : padding;
        this(bool2, str3, colorScheme3, colorScheme4, str4, fontWeight2, num3, num4, horizontalAlignment2, size2, padding3, (i & 2048) == 0 ? padding2 : null, null);
    }

    public PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, Integer num2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, f fVar) {
        this(bool, str, colorScheme, colorScheme2, str2, fontWeight, num, num2, horizontalAlignment, size, padding, padding2);
    }

    public static void getBackgroundColor$annotations() {
    }

    public static void m177getFontNameARcRonI$annotations() {
    }

    public static void getFontSize$annotations() {
    }

    public static void getFontWeight$annotations() {
    }

    public static void getFontWeightInt$annotations() {
    }

    public static void getHorizontalAlignment$annotations() {
    }

    public static void m178getTextsa7TU9Q$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PartialTextComponent self, b output, e serialDesc) {
        if (output.k(serialDesc) || !m.a(self.visible, Boolean.TRUE)) {
            output.x(serialDesc, 0, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || self.text != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = self.text;
            output.x(serialDesc, 1, localizationKey$$serializer, str != null ? LocalizationKey.m231boximpl(str) : null);
        }
        if (output.k(serialDesc) || self.color != null) {
            output.x(serialDesc, 2, ColorScheme$$serializer.INSTANCE, self.color);
        }
        if (output.k(serialDesc) || self.backgroundColor != null) {
            output.x(serialDesc, 3, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.k(serialDesc) || self.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str2 = self.fontName;
            output.x(serialDesc, 4, fontAlias$$serializer, str2 != null ? FontAlias.m21boximpl(str2) : null);
        }
        if (output.k(serialDesc) || self.fontWeight != null) {
            output.x(serialDesc, 5, FontWeightDeserializer.INSTANCE, self.fontWeight);
        }
        if (output.k(serialDesc) || self.fontWeightInt != null) {
            output.x(serialDesc, 6, e0.a, self.fontWeightInt);
        }
        if (output.k(serialDesc) || self.fontSize != null) {
            output.x(serialDesc, 7, FontSizeSerializer.INSTANCE, self.fontSize);
        }
        if (output.k(serialDesc) || self.horizontalAlignment != null) {
            output.x(serialDesc, 8, HorizontalAlignmentDeserializer.INSTANCE, self.horizontalAlignment);
        }
        if (output.k(serialDesc) || self.size != null) {
            output.x(serialDesc, 9, Size$$serializer.INSTANCE, self.size);
        }
        if (output.k(serialDesc) || self.padding != null) {
            output.x(serialDesc, 10, Padding$$serializer.INSTANCE, self.padding);
        }
        if (!output.k(serialDesc) && self.margin == null) {
            return;
        }
        output.x(serialDesc, 11, Padding$$serializer.INSTANCE, self.margin);
    }

    public boolean equals(Object obj) {
        boolean zM234equalsimpl0;
        boolean zM24equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTextComponent)) {
            return false;
        }
        PartialTextComponent partialTextComponent = (PartialTextComponent) obj;
        if (!m.a(this.visible, partialTextComponent.visible)) {
            return false;
        }
        String str = this.text;
        String str2 = partialTextComponent.text;
        if (str == null) {
            if (str2 == null) {
                zM234equalsimpl0 = true;
            } else {
                zM234equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM234equalsimpl0 = false;
        } else {
            zM234equalsimpl0 = LocalizationKey.m234equalsimpl0(str, str2);
        }
        if (!zM234equalsimpl0 || !m.a(this.color, partialTextComponent.color) || !m.a(this.backgroundColor, partialTextComponent.backgroundColor)) {
            return false;
        }
        String str3 = this.fontName;
        String str4 = partialTextComponent.fontName;
        if (str3 == null) {
            if (str4 == null) {
                zM24equalsimpl0 = true;
            } else {
                zM24equalsimpl0 = false;
            }
        } else if (str4 == null) {
            zM24equalsimpl0 = false;
        } else {
            zM24equalsimpl0 = FontAlias.m24equalsimpl0(str3, str4);
        }
        return zM24equalsimpl0 && this.fontWeight == partialTextComponent.fontWeight && m.a(this.fontWeightInt, partialTextComponent.fontWeightInt) && m.a(this.fontSize, partialTextComponent.fontSize) && this.horizontalAlignment == partialTextComponent.horizontalAlignment && m.a(this.size, partialTextComponent.size) && m.a(this.padding, partialTextComponent.padding) && m.a(this.margin, partialTextComponent.margin);
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

    public final Integer getFontSize() {
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
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.text;
        int iM235hashCodeimpl = (iHashCode + (str == null ? 0 : LocalizationKey.m235hashCodeimpl(str))) * 31;
        ColorScheme colorScheme = this.color;
        int iHashCode2 = (iM235hashCodeimpl + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        ColorScheme colorScheme2 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (colorScheme2 == null ? 0 : colorScheme2.hashCode())) * 31;
        String str2 = this.fontName;
        int iM25hashCodeimpl = (iHashCode3 + (str2 == null ? 0 : FontAlias.m25hashCodeimpl(str2))) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode4 = (iM25hashCodeimpl + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        Integer num = this.fontWeightInt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontSize;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        int iHashCode7 = (iHashCode6 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        Size size = this.size;
        int iHashCode8 = (iHashCode7 + (size == null ? 0 : size.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode9 = (iHashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        return iHashCode9 + (padding2 != null ? padding2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PartialTextComponent(visible=");
        sb.append(this.visible);
        sb.append(", text=");
        String str = this.text;
        sb.append((Object) (str == null ? "null" : LocalizationKey.m236toStringimpl(str)));
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", fontName=");
        String str2 = this.fontName;
        sb.append((Object) (str2 != null ? FontAlias.m26toStringimpl(str2) : "null"));
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
        sb.append(')');
        return sb.toString();
    }
}
