package n30;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

public final class f extends AbstractList implements RandomAccess {
    public int A;
    public Object B;

    public static void a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.A)) {
            StringBuilder sbQ = oi.k.q("Index: ", i, ", Size: ");
            sbQ.append(this.A);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i2 == 0) {
            this.B = obj;
        } else if (i2 == 1 && i == 0) {
            this.B = new Object[]{obj, this.B};
        } else {
            Object[] objArr = new Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.B;
            } else {
                Object[] objArr2 = (Object[]) this.B;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.A - i);
            }
            objArr[i] = obj;
            this.B = objArr;
        }
        this.A++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean add(Object obj) {
        int i = this.A;
        if (i == 0) {
            this.B = obj;
        } else if (i == 1) {
            this.B = new Object[]{this.B, obj};
        } else {
            Object[] objArr = (Object[]) this.B;
            int length = objArr.length;
            if (i >= length) {
                int iA = a1.b.A(length, 3, 2, 1);
                int i2 = i + 1;
                if (iA < i2) {
                    iA = i2;
                }
                Object[] objArr2 = new Object[iA];
                this.B = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.A] = obj;
        }
        this.A++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final void clear() {
        this.B = null;
        this.A = 0;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A)) {
            return i2 == 1 ? this.B : ((Object[]) this.B)[i];
        }
        StringBuilder sbQ = oi.k.q("Index: ", i, ", Size: ");
        sbQ.append(this.A);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    @Override
    public final Iterator iterator() {
        int i = this.A;
        if (i == 0) {
            return d.A;
        }
        if (i == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.A)) {
            StringBuilder sbQ = oi.k.q("Index: ", i, ", Size: ");
            sbQ.append(this.A);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i2 == 1) {
            obj = this.B;
            this.B = null;
        } else {
            Object[] objArr = (Object[]) this.B;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.B = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.A - 1] = null;
            }
            obj = obj2;
        }
        this.A--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.A)) {
            StringBuilder sbQ = oi.k.q("Index: ", i, ", Size: ");
            sbQ.append(this.A);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.B;
            this.B = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.B;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override
    public final int size() {
        return this.A;
    }

    @Override
    public final void sort(Comparator comparator) {
        int i = this.A;
        if (i >= 2) {
            Arrays.sort((Object[]) this.B, 0, i, comparator);
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.A;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.B;
                return objArr2;
            }
            objArr[0] = this.B;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.B, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.B, 0, objArr, 0, i);
            }
        }
        int i2 = this.A;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
