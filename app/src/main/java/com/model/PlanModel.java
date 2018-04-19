package com.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlanModel {

    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("domain")
        @Expose
        private String domain;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("subscription_fees")
        @Expose
        private String subscriptionFees;
        @SerializedName("service")
        @Expose
        private String service;
        @SerializedName("storage_space")
        @Expose
        private String storageSpace;
        @SerializedName("max_size_document")
        @Expose
        private String maxSizeDocument;
        @SerializedName("max_no_document")
        @Expose
        private String maxNoDocument;
        @SerializedName("time_period")
        @Expose
        private String timePeriod;
        @SerializedName("header_color")
        @Expose
        private String headerColor;
        @SerializedName("defaultPlan")
        @Expose
        private String defaultPlan;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("modify_date")
        @Expose
        private String modifyDate;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSubscriptionFees() {
            return subscriptionFees;
        }

        public void setSubscriptionFees(String subscriptionFees) {
            this.subscriptionFees = subscriptionFees;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getStorageSpace() {
            return storageSpace;
        }

        public void setStorageSpace(String storageSpace) {
            this.storageSpace = storageSpace;
        }

        public String getMaxSizeDocument() {
            return maxSizeDocument;
        }

        public void setMaxSizeDocument(String maxSizeDocument) {
            this.maxSizeDocument = maxSizeDocument;
        }

        public String getMaxNoDocument() {
            return maxNoDocument;
        }

        public void setMaxNoDocument(String maxNoDocument) {
            this.maxNoDocument = maxNoDocument;
        }

        public String getTimePeriod() {
            return timePeriod;
        }

        public void setTimePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
        }

        public String getHeaderColor() {
            return headerColor;
        }

        public void setHeaderColor(String headerColor) {
            this.headerColor = headerColor;
        }

        public String getDefaultPlan() {
            return defaultPlan;
        }

        public void setDefaultPlan(String defaultPlan) {
            this.defaultPlan = defaultPlan;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getModifyDate() {
            return modifyDate;
        }

        public void setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
        }

    }


        @SerializedName("success")
        @Expose
        private Boolean success;
        @SerializedName("data")
        @Expose
        private List<Datum> data = null;
        @SerializedName("message")
        @Expose
        private String message;

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

