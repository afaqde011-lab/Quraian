package com.mchutov.quranify.settings.presentation.screen.notification;

import kotlin.Metadata;
import nz.i;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/mchutov/quranify/settings/presentation/screen/notification/NotificationEffect$CloseScreen", "Lnz/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationEffect$CloseScreen implements i {
    public static final int $stable = 0;
    public static final NotificationEffect$CloseScreen INSTANCE = new NotificationEffect$CloseScreen();

    private NotificationEffect$CloseScreen() {
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof NotificationEffect$CloseScreen);
    }

    @Override
    public long getDebounce() {
        return 300L;
    }

    public int hashCode() {
        return 56392902;
    }

    public String toString() {
        return "CloseScreen";
    }
}
