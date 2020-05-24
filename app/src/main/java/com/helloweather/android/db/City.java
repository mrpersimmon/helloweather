package com.helloweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id; // 市id

    private String cityName; // 市名称

    private int cityCode; // 市代号

    private int provinceId; // 该市所属省id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
