package com.liferay.alloy.util;

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import org.apache.commons.lang.ClassUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;


public class TypeUtil {
    public static final String ARRAY_NOTATION = "[]";
    public static final String[] ARRAYS = {"array", "[]"};


    public static final String BOOLEAN = "boolean";


    public static final String[] BOOLEANS = {"boolean", "bool"};


    public static final String DOUBLE = "double";


    public static final String[] DOUBLES = {"double"};


    public static final String FLOAT = "float";


    public static final String[] FLOATS = {"float"};


    public static final String INT = "int";


    public static final String[] INTEGERS = {"integer", "int", "int | string"};


    public static final String LONG = "long";


    public static final String[] LONGS = {"long"};


    public static final String[] NUMBERS = {"num", "number"};


    public static final String[] OBJECTS = {"object", "{}"};


    public static final String SHORT = "short";


    public static final String[] SHORTS = {"short"};


    public static final String[] STRINGS = {"node | string", "string", "string | node", "string | int"};
    private static HashMap<String, String> _INPUT_TYPES = null;
    private static HashMap<String, String> _OUTPUT_TYPES = null;
    private static TypeUtil _instance = new TypeUtil();


    private TypeUtil() {
        _INPUT_TYPES = new HashMap();
        _OUTPUT_TYPES = new HashMap();

        _registerTypes(_INPUT_TYPES, ARRAYS, Object.class.getName());
        _registerTypes(_INPUT_TYPES, BOOLEANS, Boolean.TYPE.getName());
        _registerTypes(_INPUT_TYPES, FLOATS, Float.TYPE.getName());
        _registerTypes(_INPUT_TYPES, INTEGERS, Integer.TYPE.getName());
        _registerTypes(_INPUT_TYPES, DOUBLES, Double.TYPE.getName());
        _registerTypes(_INPUT_TYPES, LONGS, Long.TYPE.getName());
        _registerTypes(_INPUT_TYPES, SHORTS, Short.TYPE.getName());
        _registerTypes(_INPUT_TYPES, NUMBERS, Object.class.getName());
        _registerTypes(_INPUT_TYPES, OBJECTS, Object.class.getName());
        _registerTypes(_INPUT_TYPES, STRINGS, String.class.getName());

        _registerTypes(_OUTPUT_TYPES, ARRAYS, ArrayList.class.getName());
        _registerTypes(_OUTPUT_TYPES, BOOLEANS, Boolean.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, FLOATS, Float.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, INTEGERS, Integer.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, DOUBLES, Double.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, LONGS, Long.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, SHORTS, Short.TYPE.getName());
        _registerTypes(_OUTPUT_TYPES, NUMBERS, Number.class.getName());
        _registerTypes(_OUTPUT_TYPES, OBJECTS, HashMap.class.getName());
        _registerTypes(_OUTPUT_TYPES, STRINGS, String.class.getName());
    }

    public static String getInputJavaType(String type, boolean removeGenericsType) {
        return _instance._getInputJavaType(type, removeGenericsType);
    }

    public static TypeUtil getInstance() {
        return _instance;
    }

    public static String getOutputJavaType(String type, boolean removeGenericsType) {
        return _instance._getOutputJavaType(type, removeGenericsType);
    }

    public static boolean hasMethod(String className, String methodName, String[] paramTypes) {
        return _instance._hasMethod(className, methodName, paramTypes);
    }

    public static boolean isJavaClass(String className) {
        return _instance._isJavaClass(className);
    }

    public static boolean isPrimitiveType(String type) {
        return ("boolean".equals(type)) || ("double".equals(type)) || ("float".equals(type)) || ("int".equals(type)) || ("long".equals(type)) || ("short".equals(type));
    }

    private Class<?> _getClass(String className) {
        Class<?> clazz = null;
        try {
            clazz = ClassUtils.getClass(className);
        } catch (ClassNotFoundException e) {
            if (_isJavaClass(className)) {
                String genericsType = _getGenericsType(className);

                if (Validator.isNotNull(genericsType)) {
                    className = _removeGenericsType(className);

                    return _getClass(className);
                }
            } else {
                e.printStackTrace();
            }
        }

        return clazz;
    }

    private String _getGenericsType(String type) {
        int begin = type.indexOf('<');
        int end = type.indexOf('>');
        String genericsType = null;

        if ((begin > -1) && (end > -1)) {
            genericsType = type.substring(begin + 1, end);
        }

        return genericsType;
    }

    private String _getInputJavaType(String type, boolean removeGenericsType) {
        if (removeGenericsType) {
            type = _removeGenericsType(type);
        }

        if (_isJavaClass(type)) {
            return type;
        }

        String javaType = (String) _INPUT_TYPES.get(type.toLowerCase());

        if (Validator.isNull(javaType)) {
            javaType = Object.class.getName();
        }

        return javaType;
    }

    private String _getOutputJavaType(String type, boolean removeGenericsType) {
        if (removeGenericsType) {
            type = _removeGenericsType(type);
        }

        if (_isJavaClass(type)) {
            return type;
        }

        String javaType = (String) _OUTPUT_TYPES.get(type.toLowerCase());

        if (Validator.isNull(javaType)) {
            javaType = Object.class.getName();
        }

        return javaType;
    }

    private boolean _hasMethod(String className, String methodName, String[] paramTypes) {
        Class<?> javaClass = _getClass(className);

        if (javaClass == null) {
            return false;
        }

        Class<?> superClass = javaClass.getSuperclass();

        while (superClass != null) {
            boolean superClassHasMethod = _hasMethod(superClass.getName(), methodName, paramTypes);


            if (superClassHasMethod) {
                return true;
            }

            superClass = superClass.getSuperclass();
        }

        Class<?>[] parameterTypes = new Class[paramTypes.length];

        for (int i = 0; i < paramTypes.length; i++) {
            Class<?> paramType = _getClass(paramTypes[i]);

            if (paramType == null) {
                return false;
            }

            parameterTypes[i] = paramType;
        }

        Method method = null;
        try {
            method = javaClass.getDeclaredMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e) {
        }


        return method != null;
    }

    private boolean _isJavaClass(String className) {
        if (isPrimitiveType(className)) {
            return true;
        }
        try {
            String genericsType = _getGenericsType(className);

            if (Validator.isNotNull(genericsType)) {
                String[] genericsTypes = StringUtil.split(genericsType);

                for (int i = 0; i < genericsTypes.length; i++) {
                    String curType = genericsTypes[i].trim();

                    if (!curType.equals("?")) {
                        Class.forName(_removeArrayNotation(curType));
                    }
                }

                className = _removeGenericsType(className);
            }

            Class.forName(_removeArrayNotation(className));

            return true;
        } catch (ClassNotFoundException e) {
        }
        return false;
    }

    private void _registerTypes(HashMap<String, String> map, String[] types, String javaType) {
        for (String type : types) {
            map.put(type.toLowerCase(), javaType);
        }
    }

    private String _removeArrayNotation(String type) {
        return type.replace("[]", "");
    }

    private String _removeGenericsType(String type) {
        String genericsType = _getGenericsType(type);

        if (Validator.isNotNull(genericsType)) {
            type = type.replace("<".concat(genericsType).concat(">"), "");
        }


        return type;
    }
}
