package com.henry.mybatis.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private Integer id;

    private String magic_id;

    private String first_name;

    private String last_name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagic_id() {
        return magic_id;
    }

    public void setMagic_id(String magic_id) {
        this.magic_id = magic_id == null ? null : magic_id.trim();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name == null ? null : first_name.trim();
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name == null ? null : last_name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", magic_id=").append(magic_id);
        sb.append(", first_name=").append(first_name);
        sb.append(", last_name=").append(last_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}