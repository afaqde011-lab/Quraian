package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
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
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
import g00.u;
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
import p40.h1;
import p40.o0;
import p40.x0;
import p40.y;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0007\u0018\u0000 j2\u00020\u0001:\u0004kljmBá\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0002¢\u0006\u0004\b%\u0010&Bï\u0001\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.HÁ\u0001¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bB\u0010>\u001a\u0004\b@\u0010AR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010ER\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bG\u0010>\u001a\u0004\bF\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u0010>\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u0010>\u001a\u0004\bM\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bV\u0010UR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010`\u0012\u0004\bc\u0010>\u001a\u0004\ba\u0010bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00107\u001a\u0004\bd\u00109R\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010e\u0012\u0004\bh\u0010>\u001a\u0004\bf\u0010gR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00028\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\bi\u00106¨\u0006n"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "pages", "", "visible", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "overrides", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "getOverrides", "Companion", "$serializer", "AutoAdvancePages", "PageControl", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponent implements PaywallComponent {
    private final AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final List<ComponentOverride<PartialCarouselComponent>> overrides;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final List<StackComponent> pages;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {new c(StackComponent$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialCarouselComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\"!#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "", "", "msTimePerPage", "msTransitionTime", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "transitionType", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IIILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Lo40/b;Ln40/e;)V", "write$Self", "I", "getMsTimePerPage", "()I", "getMsTimePerPage$annotations", "()V", "getMsTransitionTime", "getMsTransitionTime$annotations", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType$annotations", "Companion", "$serializer", "TransitionType", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AutoAdvancePages {

        public static final Companion INSTANCE = new Companion(null);
        private final int msTimePerPage;
        private final int msTransitionTime;
        private final TransitionType transitionType;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CarouselComponent$AutoAdvancePages$$serializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "SLIDE", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum TransitionType {
            FADE,
            SLIDE;


            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return CarouselTransitionTypeDeserializer.INSTANCE;
                }
            }
        }

        @g00.c
        public AutoAdvancePages(int i, int i2, int i3, TransitionType transitionType, x0 x0Var) {
            if (3 != (i & 3)) {
                o0.g(i, 3, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.msTimePerPage = i2;
            this.msTransitionTime = i3;
            if ((i & 4) == 0) {
                this.transitionType = null;
            } else {
                this.transitionType = transitionType;
            }
        }

        public AutoAdvancePages(int i, int i2, TransitionType transitionType) {
            this.msTimePerPage = i;
            this.msTransitionTime = i2;
            this.transitionType = transitionType;
        }

        public AutoAdvancePages(int i, int i2, TransitionType transitionType, int i3, f fVar) {
            this(i, i2, (i3 & 4) != 0 ? null : transitionType);
        }

        public static void getMsTimePerPage$annotations() {
        }

        public static void getMsTransitionTime$annotations() {
        }

        public static void getTransitionType$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(AutoAdvancePages self, b output, e serialDesc) {
            output.w(0, self.msTimePerPage, serialDesc);
            output.w(1, self.msTransitionTime, serialDesc);
            if (!output.k(serialDesc) && self.transitionType == null) {
                return;
            }
            output.x(serialDesc, 2, CarouselTransitionTypeDeserializer.INSTANCE, self.transitionType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoAdvancePages)) {
                return false;
            }
            AutoAdvancePages autoAdvancePages = (AutoAdvancePages) obj;
            return this.msTimePerPage == autoAdvancePages.msTimePerPage && this.msTransitionTime == autoAdvancePages.msTransitionTime && this.transitionType == autoAdvancePages.transitionType;
        }

        public final int getMsTimePerPage() {
            return this.msTimePerPage;
        }

        public final int getMsTransitionTime() {
            return this.msTransitionTime;
        }

        public final TransitionType getTransitionType() {
            return this.transitionType;
        }

        public int hashCode() {
            int i = ((this.msTimePerPage * 31) + this.msTransitionTime) * 31;
            TransitionType transitionType = this.transitionType;
            return i + (transitionType == null ? 0 : transitionType.hashCode());
        }

        public String toString() {
            return "AutoAdvancePages(msTimePerPage=" + this.msTimePerPage + ", msTransitionTime=" + this.msTransitionTime + ", transitionType=" + this.transitionType + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CarouselComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0004@?ABBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b>\u0010=¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "active", "default", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "getPosition", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "Ljava/lang/Integer;", "getSpacing", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getActive", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getDefault", "Companion", "$serializer", "Indicator", "Position", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PageControl {

        public static final Companion INSTANCE = new Companion(null);
        private final Indicator active;
        private final ColorScheme backgroundColor;
        private final Border border;
        private final Indicator default;
        private final Padding margin;
        private final Padding padding;
        private final Position position;
        private final Shadow shadow;
        private final Shape shape;
        private final Integer spacing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CarouselComponent$PageControl$$serializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBQ\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u001fR(\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "", "Lg00/u;", "width", "height", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "strokeColor", "strokeWidth", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lg00/u;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILg00/u;Lg00/u;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lg00/u;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lo40/b;Ln40/e;)V", "write$Self", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getStrokeColor", "getStrokeColor$annotations", "()V", "Lg00/u;", "getStrokeWidth-0hXNFcg", "()Lg00/u;", "getStrokeWidth-0hXNFcg$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Indicator {

            public static final Companion INSTANCE = new Companion(null);
            private final ColorScheme color;
            private final int height;
            private final ColorScheme strokeColor;
            private final u strokeWidth;
            private final int width;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
                }
            }

            private Indicator(int i, int i2, ColorScheme color, ColorScheme colorScheme, u uVar) {
                m.e(color, "color");
                this.width = i;
                this.height = i2;
                this.color = color;
                this.strokeColor = colorScheme;
                this.strokeWidth = uVar;
            }

            public Indicator(int i, int i2, ColorScheme colorScheme, ColorScheme colorScheme2, u uVar, int i3, f fVar) {
                this(i, i2, colorScheme, (i3 & 8) != 0 ? null : colorScheme2, (i3 & 16) != 0 ? null : uVar, null);
            }

            public Indicator(int i, int i2, ColorScheme colorScheme, ColorScheme colorScheme2, u uVar, f fVar) {
                this(i, i2, colorScheme, colorScheme2, uVar);
            }

            private Indicator(int i, u uVar, u uVar2, ColorScheme colorScheme, ColorScheme colorScheme2, u uVar3, x0 x0Var) {
                if (7 != (i & 7)) {
                    o0.g(i, 7, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.width = uVar.A;
                this.height = uVar2.A;
                this.color = colorScheme;
                if ((i & 8) == 0) {
                    this.strokeColor = null;
                } else {
                    this.strokeColor = colorScheme2;
                }
                if ((i & 16) == 0) {
                    this.strokeWidth = null;
                } else {
                    this.strokeWidth = uVar3;
                }
            }

            @g00.c
            public Indicator(int i, u uVar, u uVar2, ColorScheme colorScheme, ColorScheme colorScheme2, u uVar3, x0 x0Var, f fVar) {
                this(i, uVar, uVar2, colorScheme, colorScheme2, uVar3, x0Var);
            }

            public static void getStrokeColor$annotations() {
            }

            public static void m169getStrokeWidth0hXNFcg$annotations() {
            }

            public static final void write$Self$purchases_defaultsBc8Release(Indicator self, b output, e serialDesc) {
                h1 h1Var = h1.a;
                output.C(serialDesc, 0, h1Var, new u(self.width));
                output.C(serialDesc, 1, h1Var, new u(self.height));
                ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
                output.C(serialDesc, 2, colorScheme$$serializer, self.color);
                if (output.k(serialDesc) || self.strokeColor != null) {
                    output.x(serialDesc, 3, colorScheme$$serializer, self.strokeColor);
                }
                if (!output.k(serialDesc) && self.strokeWidth == null) {
                    return;
                }
                output.x(serialDesc, 4, h1Var, self.strokeWidth);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) obj;
                return this.width == indicator.width && this.height == indicator.height && m.a(this.color, indicator.color) && m.a(this.strokeColor, indicator.strokeColor) && m.a(this.strokeWidth, indicator.strokeWidth);
            }

            public final ColorScheme getColor() {
                return this.color;
            }

            public final int getHeight() {
                return this.height;
            }

            public final ColorScheme getStrokeColor() {
                return this.strokeColor;
            }

            public final u getStrokeWidth() {
                return this.strokeWidth;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iHashCode = (this.color.hashCode() + (((this.width * 31) + this.height) * 31)) * 31;
                ColorScheme colorScheme = this.strokeColor;
                int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
                u uVar = this.strokeWidth;
                return iHashCode2 + (uVar != null ? Integer.hashCode(uVar.A) : 0);
            }

            public String toString() {
                return "Indicator(width=" + ((Object) u.a(this.width)) + ", height=" + ((Object) u.a(this.height)) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Position {
            TOP,
            BOTTOM;


            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return CarouselPageControlPositionDeserializer.INSTANCE;
                }
            }
        }

        @g00.c
        public PageControl(int i, Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, x0 x0Var) {
            if (769 != (i & 769)) {
                o0.g(i, 769, CarouselComponent$PageControl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.position = position;
            if ((i & 2) == 0) {
                this.spacing = null;
            } else {
                this.spacing = num;
            }
            if ((i & 4) == 0) {
                this.padding = Padding.INSTANCE.getZero();
            } else {
                this.padding = padding;
            }
            if ((i & 8) == 0) {
                this.margin = Padding.INSTANCE.getZero();
            } else {
                this.margin = padding2;
            }
            if ((i & 16) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = colorScheme;
            }
            if ((i & 32) == 0) {
                this.shape = null;
            } else {
                this.shape = shape;
            }
            if ((i & 64) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i & 128) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
            this.active = indicator;
            this.default = indicator2;
        }

        public PageControl(Position position, Integer num, Padding padding, Padding margin, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator active, Indicator indicator) {
            m.e(position, "position");
            m.e(padding, "padding");
            m.e(margin, "margin");
            m.e(active, "active");
            m.e(indicator, "default");
            this.position = position;
            this.spacing = num;
            this.padding = padding;
            this.margin = margin;
            this.backgroundColor = colorScheme;
            this.shape = shape;
            this.border = border;
            this.shadow = shadow;
            this.active = active;
            this.default = indicator;
        }

        public PageControl(Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, int i, f fVar) {
            this(position, (i & 2) != 0 ? null : num, (i & 4) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 8) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : shape, (i & 64) != 0 ? null : border, (i & 128) != 0 ? null : shadow, indicator, indicator2);
        }

        public static void getBackgroundColor$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(PageControl self, b output, e serialDesc) {
            output.C(serialDesc, 0, CarouselPageControlPositionDeserializer.INSTANCE, self.position);
            if (output.k(serialDesc) || self.spacing != null) {
                output.x(serialDesc, 1, e0.a, self.spacing);
            }
            if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
                output.C(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
            }
            if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
                output.C(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
            }
            if (output.k(serialDesc) || self.backgroundColor != null) {
                output.x(serialDesc, 4, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
            }
            if (output.k(serialDesc) || self.shape != null) {
                output.x(serialDesc, 5, ShapeDeserializer.INSTANCE, self.shape);
            }
            if (output.k(serialDesc) || self.border != null) {
                output.x(serialDesc, 6, Border$$serializer.INSTANCE, self.border);
            }
            if (output.k(serialDesc) || self.shadow != null) {
                output.x(serialDesc, 7, Shadow$$serializer.INSTANCE, self.shadow);
            }
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            output.C(serialDesc, 8, carouselComponent$PageControl$Indicator$$serializer, self.active);
            output.C(serialDesc, 9, carouselComponent$PageControl$Indicator$$serializer, self.default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControl)) {
                return false;
            }
            PageControl pageControl = (PageControl) obj;
            return this.position == pageControl.position && m.a(this.spacing, pageControl.spacing) && m.a(this.padding, pageControl.padding) && m.a(this.margin, pageControl.margin) && m.a(this.backgroundColor, pageControl.backgroundColor) && m.a(this.shape, pageControl.shape) && m.a(this.border, pageControl.border) && m.a(this.shadow, pageControl.shadow) && m.a(this.active, pageControl.active) && m.a(this.default, pageControl.default);
        }

        public final Indicator getActive() {
            return this.active;
        }

        public final ColorScheme getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Border getBorder() {
            return this.border;
        }

        public final Indicator getDefault() {
            return this.default;
        }

        public final Padding getMargin() {
            return this.margin;
        }

        public final Padding getPadding() {
            return this.padding;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        public final Integer getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int iHashCode = this.position.hashCode() * 31;
            Integer num = this.spacing;
            int iHashCode2 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
            ColorScheme colorScheme = this.backgroundColor;
            int iHashCode3 = (iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
            Shape shape = this.shape;
            int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
            Border border = this.border;
            int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            int iHashCode6 = shadow != null ? shadow.hashCode() : 0;
            return this.default.hashCode() + ((this.active.hashCode() + ((iHashCode5 + iHashCode6) * 31)) * 31);
        }

        public String toString() {
            return "PageControl(position=" + this.position + ", spacing=" + this.spacing + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }
    }

    @g00.c
    public CarouselComponent(int i, List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, x0 x0Var) {
        if (9 != (i & 9)) {
            o0.g(i, 9, CarouselComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pages = list;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 4) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        this.pageAlignment = verticalAlignment;
        if ((i & 16) == 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            this.size = new Size(fit, fit);
        } else {
            this.size = size;
        }
        if ((i & 32) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i & 64) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f;
        }
        if ((i & 128) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 256) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i & 512) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 1024) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 2048) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 4096) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 8192) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 16384) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((32768 & i) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((65536 & i) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
        this.overrides = (i & 131072) == 0 ? x.A : list2;
    }

    public CarouselComponent(List<StackComponent> pages, Boolean bool, Integer num, VerticalAlignment pageAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding margin, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List<ComponentOverride<PartialCarouselComponent>> overrides) {
        m.e(pages, "pages");
        m.e(pageAlignment, "pageAlignment");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.pages = pages;
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = pageAlignment;
        this.size = size;
        this.pagePeek = num2;
        this.pageSpacing = f;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.pageControl = pageControl;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
        this.overrides = overrides;
    }

    public CarouselComponent(List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, int i, f fVar) {
        Size size2;
        Boolean bool3 = (i & 2) != 0 ? null : bool;
        Integer num3 = (i & 4) != 0 ? null : num;
        if ((i & 16) != 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        this(list, bool3, num3, verticalAlignment, size2, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : colorScheme, (i & 256) != 0 ? null : background, (i & 512) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 1024) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 2048) != 0 ? null : shape, (i & 4096) != 0 ? null : border, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : pageControl, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : autoAdvancePages, (i & 131072) != 0 ? x.A : list2);
    }

    public static void getAutoAdvance$annotations() {
    }

    public static void getBackgroundColor$annotations() {
    }

    public static void getInitialPageIndex$annotations() {
    }

    public static void getPageAlignment$annotations() {
    }

    public static void getPageControl$annotations() {
    }

    public static void getPagePeek$annotations() {
    }

    public static void getPageSpacing$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(CarouselComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, aVarArr[0], self.pages);
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 1, p40.f.a, self.visible);
        }
        if (output.k(serialDesc) || self.initialPageIndex != null) {
            output.x(serialDesc, 2, e0.a, self.initialPageIndex);
        }
        output.C(serialDesc, 3, VerticalAlignmentDeserializer.INSTANCE, self.pageAlignment);
        if (output.k(serialDesc)) {
            output.C(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
        } else {
            Size size = self.size;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            if (!m.a(size, new Size(fit, fit))) {
                output.C(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
            }
        }
        if (output.k(serialDesc) || self.pagePeek != null) {
            output.x(serialDesc, 5, e0.a, self.pagePeek);
        }
        if (output.k(serialDesc) || self.pageSpacing != null) {
            output.x(serialDesc, 6, y.a, self.pageSpacing);
        }
        if (output.k(serialDesc) || self.backgroundColor != null) {
            output.x(serialDesc, 7, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.k(serialDesc) || self.background != null) {
            output.x(serialDesc, 8, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.k(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 9, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.k(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.C(serialDesc, 10, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.k(serialDesc) || self.shape != null) {
            output.x(serialDesc, 11, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.k(serialDesc) || self.border != null) {
            output.x(serialDesc, 12, Border$$serializer.INSTANCE, self.border);
        }
        if (output.k(serialDesc) || self.shadow != null) {
            output.x(serialDesc, 13, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (output.k(serialDesc) || self.pageControl != null) {
            output.x(serialDesc, 14, CarouselComponent$PageControl$$serializer.INSTANCE, self.pageControl);
        }
        if (output.k(serialDesc) || self.loop != null) {
            output.x(serialDesc, 15, p40.f.a, self.loop);
        }
        if (output.k(serialDesc) || self.autoAdvance != null) {
            output.x(serialDesc, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, self.autoAdvance);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 17, aVarArr[17], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponent)) {
            return false;
        }
        CarouselComponent carouselComponent = (CarouselComponent) obj;
        return m.a(this.pages, carouselComponent.pages) && m.a(this.visible, carouselComponent.visible) && m.a(this.initialPageIndex, carouselComponent.initialPageIndex) && this.pageAlignment == carouselComponent.pageAlignment && m.a(this.size, carouselComponent.size) && m.a(this.pagePeek, carouselComponent.pagePeek) && m.a(this.pageSpacing, carouselComponent.pageSpacing) && m.a(this.backgroundColor, carouselComponent.backgroundColor) && m.a(this.background, carouselComponent.background) && m.a(this.padding, carouselComponent.padding) && m.a(this.margin, carouselComponent.margin) && m.a(this.shape, carouselComponent.shape) && m.a(this.border, carouselComponent.border) && m.a(this.shadow, carouselComponent.shadow) && m.a(this.pageControl, carouselComponent.pageControl) && m.a(this.loop, carouselComponent.loop) && m.a(this.autoAdvance, carouselComponent.autoAdvance) && m.a(this.overrides, carouselComponent.overrides);
    }

    public final AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final Boolean getLoop() {
        return this.loop;
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

    public final VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final PageControl getPageControl() {
        return this.pageControl;
    }

    public final Integer getPagePeek() {
        return this.pagePeek;
    }

    public final Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final List getPages() {
        return this.pages;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.initialPageIndex;
        int iHashCode3 = (this.size.hashCode() + ((this.pageAlignment.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        Integer num2 = this.pagePeek;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.pageSpacing;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode6 = (iHashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode7 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode6 + (background == null ? 0 : background.hashCode())) * 31)) * 31)) * 31;
        Shape shape = this.shape;
        int iHashCode8 = (iHashCode7 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode9 = (iHashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode10 = (iHashCode9 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        PageControl pageControl = this.pageControl;
        int iHashCode11 = (iHashCode10 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AutoAdvancePages autoAdvancePages = this.autoAdvance;
        return this.overrides.hashCode() + ((iHashCode12 + (autoAdvancePages != null ? autoAdvancePages.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CarouselComponent(pages=");
        sb.append(this.pages);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", initialPageIndex=");
        sb.append(this.initialPageIndex);
        sb.append(", pageAlignment=");
        sb.append(this.pageAlignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", pagePeek=");
        sb.append(this.pagePeek);
        sb.append(", pageSpacing=");
        sb.append(this.pageSpacing);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", pageControl=");
        sb.append(this.pageControl);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", autoAdvance=");
        sb.append(this.autoAdvance);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
