package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

public class CastUtil {

    /**
     * 转为String型
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    private static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     */
    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double型（提供默认值）
     * @return
     */
    private static double castDouble(Object obj, int defaultValue) {
        double value = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    value = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0L);
    }

    /**
     * 转为long型（提供默认值）
     */
    private static long castLong(Object obj, long defaultValue) {
        long value = defaultValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtils.isNotEmpty(str)) {
                try {
                    value = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转为int型，提供默认值
     */
    private static int castInt(Object obj, int defaultValue) {
        int value = defaultValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtils.isNotEmpty(str)) {
                try {
                    value = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     * 转为booean型
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean型(提供默认值)
     */
    private static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean value = defaultValue;
        if (obj != null) {
            String str = castString(obj);
            if (StringUtils.isNotEmpty(str)) {
                try {
                    value = Boolean.parseBoolean(str);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

}
