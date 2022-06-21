package com.naukma.supermarket.model.security;

public enum Permission {
    CATEGORY_READ("category:read"),
    CATEGORY_WRITE("category:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}