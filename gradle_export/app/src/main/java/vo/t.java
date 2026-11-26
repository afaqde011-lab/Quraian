package vo;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R$\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b \u0010\u0006R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\f\u0010&¨\u0006("}, d2 = {"Lvo/t;", "", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", DiagnosticsEntry.ID_KEY, "b", "email", "c", "emailVerifiedAt", "d", "m", "username", "l", "sex", "f", "birthDate", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "providers", "Lbk/q;", "h", "Lbk/q;", "()Lbk/q;", "purchaseDevice", "i", "k", "purchaseDeviceName", "j", "purchaseDeviceModel", "purchaseDeviceCity", "purchaseDeviceCountry", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasData", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    @ck.b(DiagnosticsEntry.ID_KEY)
    private final String id;

    @ck.b("email")
    private final String email;

    @ck.b("email_verified_at")
    private final String emailVerifiedAt;

    @ck.b("username")
    private final String username;

    @ck.b("sex")
    private final String sex;

    @ck.b("birth_date")
    private final String birthDate;

    @ck.b("providers")
    private final List<String> providers;

    @ck.b("purchase_device")
    private final bk.q purchaseDevice;

    @ck.b("purchase_device_name")
    private final String purchaseDeviceName;

    @ck.b("purchase_device_model")
    private final String purchaseDeviceModel;

    @ck.b("purchase_device_city")
    private final String purchaseDeviceCity;

    @ck.b("purchase_device_country")
    private final String purchaseDeviceCountry;

    @ck.b("has_data")
    private final Boolean hasData;

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEmailVerifiedAt() {
        return this.emailVerifiedAt;
    }

    public final Boolean getHasData() {
        return this.hasData;
    }

    public final String getId() {
        return this.id;
    }

    public final List getProviders() {
        return this.providers;
    }

    public final bk.q getPurchaseDevice() {
        return this.purchaseDevice;
    }

    public final String getPurchaseDeviceCity() {
        return this.purchaseDeviceCity;
    }

    public final String getPurchaseDeviceCountry() {
        return this.purchaseDeviceCountry;
    }

    public final String getPurchaseDeviceModel() {
        return this.purchaseDeviceModel;
    }

    public final String getPurchaseDeviceName() {
        return this.purchaseDeviceName;
    }

    public final String getSex() {
        return this.sex;
    }

    public final String getUsername() {
        return this.username;
    }
}
