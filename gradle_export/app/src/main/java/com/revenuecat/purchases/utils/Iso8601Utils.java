package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.Constants;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static Date parse(String str) {
        int i;
        int iPow;
        int i2;
        int i3;
        char cCharAt;
        String strSubstring;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int i4 = parseInt(str, 0, 4);
            int i5 = checkOffset(str, 4, '-') ? 5 : 4;
            int i6 = i5 + 2;
            int i7 = parseInt(str, i5, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            boolean zCheckOffset = checkOffset(str, i8, 'T');
            if (!zCheckOffset && str.length() <= i8) {
                return new GregorianCalendar(i4, i7 - 1, i9).getTime();
            }
            if (zCheckOffset) {
                int i11 = i6 + 5;
                int i12 = parseInt(str, i6 + 3, i11);
                if (checkOffset(str, i11, ':')) {
                    i11 = i6 + 6;
                }
                int i13 = i11 + 2;
                int i14 = parseInt(str, i11, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i11 + 3;
                }
                if (str.length() <= i13 || (cCharAt2 = str.charAt(i13)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i = i12;
                    i8 = i13;
                    i2 = i14;
                    iPow = 0;
                } else {
                    int i15 = i13 + 2;
                    i3 = parseInt(str, i13, i15);
                    if (i3 > 59 && i3 < 63) {
                        i3 = 59;
                    }
                    if (checkOffset(str, i15, '.')) {
                        int i16 = i13 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i13 + 6);
                        iPow = (int) (Math.pow(10.0d, 3 - (iMin - i16)) * ((double) parseInt(str, i16, iMin)));
                        i2 = i14;
                        i = i12;
                        i8 = iIndexOfNonDigit;
                    } else {
                        i = i12;
                        i8 = i15;
                        i2 = i14;
                        iPow = 0;
                    }
                }
                if (str.length() > i8) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i8);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i8);
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_Z;
                    } else {
                        String str2 = GMT_ID + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                        String id = timeZone2.getID();
                        if (!id.equals(str2) && !id.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i4);
                gregorianCalendar.set(2, i7 - 1);
                gregorianCalendar.set(5, i9);
                gregorianCalendar.set(11, i);
                gregorianCalendar.set(12, i2);
                gregorianCalendar.set(13, i3);
                gregorianCalendar.set(14, iPow);
                return gregorianCalendar.getTime();
            }
            i = 0;
            iPow = 0;
            i2 = 0;
            i3 = 0;
            if (str.length() > i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i8);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i8);
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    timeZone = TIMEZONE_Z;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i4);
            gregorianCalendar2.set(2, i7 - 1);
            gregorianCalendar2.set(5, i9);
            gregorianCalendar2.set(11, i);
            gregorianCalendar2.set(12, i2);
            gregorianCalendar2.set(13, i3);
            gregorianCalendar2.set(14, iPow);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new SerializationException(a1.b.o("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
