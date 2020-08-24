package com.auro.scholr.teacher.data.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeacherProgressStatusModel {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
