package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
import g00.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0003\u0018\u0000 +2\u00020\u0001:\u0002,+B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eBC\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "type", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "destination", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "url", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "sheet", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;)V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;Lo40/b;Ln40/e;)V", "write$Self", "toAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "getDestination", "()Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "getUrl", "()Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "getSheet", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ActionSurrogate {

    public static final Companion INSTANCE = new Companion(null);
    private final DestinationSurrogate destination;
    private final ButtonComponent.Destination.Sheet sheet;
    private final ActionTypeSurrogate type;
    private final UrlSurrogate url;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ActionSurrogate$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DestinationSurrogate.values().length];
            try {
                iArr[DestinationSurrogate.customer_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationSurrogate.privacy_policy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationSurrogate.terms.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DestinationSurrogate.url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DestinationSurrogate.sheet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DestinationSurrogate.unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionTypeSurrogate.values().length];
            try {
                iArr2[ActionTypeSurrogate.unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActionTypeSurrogate.restore_purchases.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_back.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_to.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @c
    public ActionSurrogate(int i, ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, x0 x0Var) {
        if (1 != (i & 1)) {
            o0.g(i, 1, ActionSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = actionTypeSurrogate;
        if ((i & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = destinationSurrogate;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = urlSurrogate;
        }
        if ((i & 8) == 0) {
            this.sheet = null;
        } else {
            this.sheet = sheet;
        }
    }

    public ActionSurrogate(ActionTypeSurrogate type, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet) {
        m.e(type, "type");
        this.type = type;
        this.destination = destinationSurrogate;
        this.url = urlSurrogate;
        this.sheet = sheet;
    }

    public ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, int i, f fVar) {
        this(actionTypeSurrogate, (i & 2) != 0 ? null : destinationSurrogate, (i & 4) != 0 ? null : urlSurrogate, (i & 8) != 0 ? null : sheet);
    }

    public ActionSurrogate(ButtonComponent.Action action) {
        ActionTypeSurrogate actionTypeSurrogate;
        DestinationSurrogate destinationSurrogate;
        UrlSurrogate urlSurrogate;
        m.e(action, "action");
        boolean z = action instanceof ButtonComponent.Action.Unknown;
        if (z) {
            actionTypeSurrogate = ActionTypeSurrogate.unknown;
        } else if (action instanceof ButtonComponent.Action.NavigateBack) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_back;
        } else if (action instanceof ButtonComponent.Action.NavigateTo) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_to;
        } else {
            if (!(action instanceof ButtonComponent.Action.RestorePurchases)) {
                throw new NoWhenBranchMatchedException();
            }
            actionTypeSurrogate = ActionTypeSurrogate.restore_purchases;
        }
        ButtonComponent.Destination.Sheet sheet = 0;
        sheet = 0;
        if (z ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases) {
            destinationSurrogate = null;
        } else {
            if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
                throw new NoWhenBranchMatchedException();
            }
            ButtonComponent.Destination destination = ((ButtonComponent.Action.NavigateTo) action).getDestination();
            if (destination instanceof ButtonComponent.Destination.CustomerCenter) {
                destinationSurrogate = DestinationSurrogate.customer_center;
            } else if (destination instanceof ButtonComponent.Destination.PrivacyPolicy) {
                destinationSurrogate = DestinationSurrogate.privacy_policy;
            } else if (destination instanceof ButtonComponent.Destination.Terms) {
                destinationSurrogate = DestinationSurrogate.terms;
            } else if (destination instanceof ButtonComponent.Destination.Url) {
                destinationSurrogate = DestinationSurrogate.url;
            } else if (destination instanceof ButtonComponent.Destination.Sheet) {
                destinationSurrogate = DestinationSurrogate.sheet;
            } else {
                if (!(destination instanceof ButtonComponent.Destination.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                destinationSurrogate = DestinationSurrogate.unknown;
            }
        }
        if (z ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases) {
            urlSurrogate = null;
        } else {
            if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
                throw new NoWhenBranchMatchedException();
            }
            ButtonComponent.Action.NavigateTo navigateTo = (ButtonComponent.Action.NavigateTo) action;
            ButtonComponent.Destination destination2 = navigateTo.getDestination();
            if (destination2 instanceof ButtonComponent.Destination.Unknown ? true : destination2 instanceof ButtonComponent.Destination.CustomerCenter ? true : destination2 instanceof ButtonComponent.Destination.Sheet) {
                urlSurrogate = null;
            } else if (destination2 instanceof ButtonComponent.Destination.PrivacyPolicy) {
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).m160getUrlLidz7Tp4o(), ((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).getMethod(), sheet);
            } else if (destination2 instanceof ButtonComponent.Destination.Terms) {
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Terms) navigateTo.getDestination()).m164getUrlLidz7Tp4o(), ((ButtonComponent.Destination.Terms) navigateTo.getDestination()).getMethod(), sheet);
            } else {
                if (!(destination2 instanceof ButtonComponent.Destination.Url)) {
                    throw new NoWhenBranchMatchedException();
                }
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Url) navigateTo.getDestination()).m168getUrlLidz7Tp4o(), ((ButtonComponent.Destination.Url) navigateTo.getDestination()).getMethod(), sheet);
            }
        }
        if (!(z ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases)) {
            if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
                throw new NoWhenBranchMatchedException();
            }
            ButtonComponent.Action.NavigateTo navigateTo2 = (ButtonComponent.Action.NavigateTo) action;
            ButtonComponent.Destination destination3 = navigateTo2.getDestination();
            if (!(destination3 instanceof ButtonComponent.Destination.CustomerCenter ? true : destination3 instanceof ButtonComponent.Destination.PrivacyPolicy ? true : destination3 instanceof ButtonComponent.Destination.Terms ? true : destination3 instanceof ButtonComponent.Destination.Unknown ? true : destination3 instanceof ButtonComponent.Destination.Url)) {
                if (!(destination3 instanceof ButtonComponent.Destination.Sheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                sheet = (ButtonComponent.Destination.Sheet) navigateTo2.getDestination();
            }
        }
        this(actionTypeSurrogate, destinationSurrogate, urlSurrogate, sheet);
    }

    public static final void write$Self$purchases_defaultsBc8Release(ActionSurrogate self, b output, e serialDesc) {
        output.C(serialDesc, 0, ActionTypeSurrogateDeserializer.INSTANCE, self.type);
        if (output.k(serialDesc) || self.destination != null) {
            output.x(serialDesc, 1, DestinationSurrogateDeserializer.INSTANCE, self.destination);
        }
        if (output.k(serialDesc) || self.url != null) {
            output.x(serialDesc, 2, UrlSurrogate$$serializer.INSTANCE, self.url);
        }
        if (!output.k(serialDesc) && self.sheet == null) {
            return;
        }
        output.x(serialDesc, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, self.sheet);
    }

    public final DestinationSurrogate getDestination() {
        return this.destination;
    }

    public final ButtonComponent.Destination.Sheet getSheet() {
        return this.sheet;
    }

    public final ActionTypeSurrogate getType() {
        return this.type;
    }

    public final UrlSurrogate getUrl() {
        return this.url;
    }

    public final ButtonComponent.Action toAction() {
        ButtonComponent.Destination destination;
        ButtonComponent.Destination privacyPolicy;
        int i = WhenMappings.$EnumSwitchMapping$1[this.type.ordinal()];
        if (i == 1) {
            return ButtonComponent.Action.Unknown.INSTANCE;
        }
        if (i == 2) {
            return ButtonComponent.Action.RestorePurchases.INSTANCE;
        }
        if (i == 3) {
            return ButtonComponent.Action.NavigateBack.INSTANCE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        DestinationSurrogate destinationSurrogate = this.destination;
        switch (destinationSurrogate == null ? -1 : WhenMappings.$EnumSwitchMapping$0[destinationSurrogate.ordinal()]) {
            case HTTPClient.NO_STATUS_CODE:
                throw new IllegalStateException("`destination` cannot be null when `action` is `navigate_to`.");
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                destination = ButtonComponent.Destination.CustomerCenter.INSTANCE;
                return new ButtonComponent.Action.NavigateTo(destination);
            case 2:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `privacy_policy`.");
                }
                privacyPolicy = new ButtonComponent.Destination.PrivacyPolicy(this.url.getUrl_lid(), this.url.getMethod(), null);
                destination = privacyPolicy;
                return new ButtonComponent.Action.NavigateTo(destination);
            case 3:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `terms`.");
                }
                privacyPolicy = new ButtonComponent.Destination.Terms(this.url.getUrl_lid(), this.url.getMethod(), null);
                destination = privacyPolicy;
                return new ButtonComponent.Action.NavigateTo(destination);
            case 4:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `url`.");
                }
                privacyPolicy = new ButtonComponent.Destination.Url(this.url.getUrl_lid(), this.url.getMethod(), null);
                destination = privacyPolicy;
                return new ButtonComponent.Action.NavigateTo(destination);
            case 5:
                destination = this.sheet;
                if (destination == null) {
                    throw new IllegalStateException("`sheet` cannot be null when `destination` is `sheet`.");
                }
                return new ButtonComponent.Action.NavigateTo(destination);
            case 6:
                destination = ButtonComponent.Destination.Unknown.INSTANCE;
                return new ButtonComponent.Action.NavigateTo(destination);
        }
    }
}
