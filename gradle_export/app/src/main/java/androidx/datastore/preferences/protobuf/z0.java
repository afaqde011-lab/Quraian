package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.play_billing.t2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class z0 extends AbstractSet {
    public final int A;
    public final Map B;

    public z0(Map map, int i10) {
        this.A = i10;
        this.B = map;
    }

    @Override
    public boolean add(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((w0) this.B).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((h6) this.B).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                t2 t2Var = (t2) this.B;
                if (entry3.getKey() != null) {
                    throw new ClassCastException();
                }
                t2Var.c(entry3.getValue());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                this.B.f((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override
    public void clear() {
        switch (this.A) {
            case 0:
                ((w0) this.B).clear();
                break;
            case 1:
                ((h6) this.B).clear();
                break;
            case 2:
                ((t2) this.B).clear();
                break;
            case 3:
                this.B.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((w0) this.B).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((h6) this.B).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((t2) this.B).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = this.B.get(entry4.getKey());
                Object value4 = entry4.getValue();
                return obj5 == value4 || (obj5 != null && obj5.equals(value4));
            default:
                return super.contains(obj);
        }
    }

    @Override
    public Iterator iterator() {
        switch (this.A) {
            case 0:
                return new y0((w0) this.B, 0);
            case 1:
                return new y0((h6) this.B);
            case 2:
                return new y0((t2) this.B);
            case 3:
                return new y0(this.B, 3);
            default:
                return new u.c((u.e) this.B);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((w0) this.B).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((h6) this.B).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((t2) this.B).remove(entry3.getKey());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                this.B.remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                return ((w0) this.B).size();
            case 1:
                return ((h6) this.B).size();
            case 2:
                return ((t2) this.B).size();
            case 3:
                return this.B.size();
            default:
                return ((u.e) this.B).C;
        }
    }
}
