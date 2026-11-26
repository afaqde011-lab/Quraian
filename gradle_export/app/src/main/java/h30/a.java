package h30;

import java.util.ArrayList;

public final class a extends ArrayList implements j {
    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof k) {
            return super.contains((k) obj);
        }
        return false;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof k) {
            return super.indexOf((k) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return super.lastIndexOf((k) obj);
        }
        return -1;
    }

    @Override
    public final boolean remove(Object obj) {
        if (obj instanceof k) {
            return super.remove((k) obj);
        }
        return false;
    }
}
