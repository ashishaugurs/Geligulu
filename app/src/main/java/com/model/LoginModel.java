
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {


    public class Data {

        @SerializedName("paid")
        @Expose
        private Boolean paid;
        @SerializedName("userData")
        @Expose
        private UserData userData;
        @SerializedName("msg")
        @Expose
        private String msg;

        public Boolean getPaid() {
            return paid;
        }

        public void setPaid(Boolean paid) {
            this.paid = paid;
        }

        public UserData getUserData() {
            return userData;
        }

        public void setUserData(UserData userData) {
            this.userData = userData;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

    }


    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("message")
    @Expose
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


   public class UserData {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("firebase_uid")
        @Expose
        private Object firebaseUid;
        @SerializedName("uid")
        @Expose
        private String uid;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("emailVerified")
        @Expose
        private String emailVerified;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("remember_token")
        @Expose
        private String rememberToken;
        @SerializedName("userIcon")
        @Expose
        private Object userIcon;
        @SerializedName("phoneNumber")
        @Expose
        private Object phoneNumber;
        @SerializedName("role")
        @Expose
        private Integer role;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("planID")
        @Expose
        private Integer planID;
        @SerializedName("planSequence")
        @Expose
        private String planSequence;
        @SerializedName("tooltipSequence")
        @Expose
        private Object tooltipSequence;
        @SerializedName("FB_id")
        @Expose
        private Object fBId;
        @SerializedName("GPlus_id")
        @Expose
        private String gPlusId;
        @SerializedName("created_ip")
        @Expose
        private String createdIp;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getFirebaseUid() {
            return firebaseUid;
        }

        public void setFirebaseUid(Object firebaseUid) {
            this.firebaseUid = firebaseUid;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmailVerified() {
            return emailVerified;
        }

        public void setEmailVerified(String emailVerified) {
            this.emailVerified = emailVerified;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRememberToken() {
            return rememberToken;
        }

        public void setRememberToken(String rememberToken) {
            this.rememberToken = rememberToken;
        }

        public Object getUserIcon() {
            return userIcon;
        }

        public void setUserIcon(Object userIcon) {
            this.userIcon = userIcon;
        }

        public Object getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Object phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Integer getRole() {
            return role;
        }

        public void setRole(Integer role) {
            this.role = role;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getPlanID() {
            return planID;
        }

        public void setPlanID(Integer planID) {
            this.planID = planID;
        }

        public String getPlanSequence() {
            return planSequence;
        }

        public void setPlanSequence(String planSequence) {
            this.planSequence = planSequence;
        }

        public Object getTooltipSequence() {
            return tooltipSequence;
        }

        public void setTooltipSequence(Object tooltipSequence) {
            this.tooltipSequence = tooltipSequence;
        }

        public Object getFBId() {
            return fBId;
        }

        public void setFBId(Object fBId) {
            this.fBId = fBId;
        }

        public String getGPlusId() {
            return gPlusId;
        }

        public void setGPlusId(String gPlusId) {
            this.gPlusId = gPlusId;
        }

        public String getCreatedIp() {
            return createdIp;
        }

        public void setCreatedIp(String createdIp) {
            this.createdIp = createdIp;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }


}