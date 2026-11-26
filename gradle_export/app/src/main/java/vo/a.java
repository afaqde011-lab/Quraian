package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u001c"}, d2 = {"Lvo/a;", "", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "deviceId", "b", "g", "deviceType", "c", "f", "deviceName", "d", "createdAt", "h", "lastSeenAt", "", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "isCurrent", "i", "location", "city", "country", "application", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("created_at")
    private final String createdAt;

    @ck.b("last_seen_at")
    private final String lastSeenAt;

    @ck.b("is_current")
    private final Boolean isCurrent;

    @ck.b("location")
    private final String location;

    @ck.b("city")
    private final String city;

    @ck.b("country")
    private final String country;

    @ck.b("application")
    private final String application;

    public final String getApplication() {
        return this.application;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getLastSeenAt() {
        return this.lastSeenAt;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Boolean getIsCurrent() {
        return this.isCurrent;
    }
}
