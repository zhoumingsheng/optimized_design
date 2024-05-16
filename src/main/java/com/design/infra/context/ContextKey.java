package com.design.infra.context;



@SuppressWarnings("all")
public class ContextKey  {
    /**
     * example
     */
    public static final ContextKey DEFAULT = new ContextKey("default", String.class);

    private String desc;

    private Class clazz;

    public ContextKey() {
    }

    public ContextKey(String desc, Class clazz) {
        this.desc = desc;
        this.clazz = clazz;
    }

    public String getDesc() {
        return desc;
    }

    public Class getClazz() {
        return clazz;
    }

 
}
