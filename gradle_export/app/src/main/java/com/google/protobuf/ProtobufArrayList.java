package com.google.protobuf;

import a1.b;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import oi.k;

final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = new ProtobufArrayList<>(new Object[0], 0, false);
    private E[] array;
    private int size;

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private ProtobufArrayList(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.array = eArr;
        this.size = i10;
    }

    private static <E> E[] createArray(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        StringBuilder sbQ = k.q("Index:", i10, ", Size:");
        sbQ.append(this.size);
        return sbQ.toString();
    }

    @Override
    public void add(int i10, E e3) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
        E[] eArr = this.array;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) createArray(b.A(i11, 3, 2, 1));
            System.arraycopy(this.array, 0, eArr2, 0, i10);
            System.arraycopy(this.array, i10, eArr2, i10 + 1, this.size - i10);
            this.array = eArr2;
        }
        this.array[i10] = e3;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public boolean add(E e3) {
        ensureIsMutable();
        int i10 = this.size;
        E[] eArr = this.array;
        if (i10 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        eArr2[i11] = e3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public E get(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public E remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        E[] eArr = this.array;
        E e3 = eArr[i10];
        int i11 = this.size;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override
    public E set(int i10, E e3) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        E[] eArr = this.array;
        E e10 = eArr[i10];
        eArr[i10] = e3;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override
    public int size() {
        return this.size;
    }
}
