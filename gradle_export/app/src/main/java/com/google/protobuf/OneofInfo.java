package com.google.protobuf;

@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    private final int f4372id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f4372id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f4372id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
