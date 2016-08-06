
package com.ron.mynewsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Version {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("released")
    @Expose
    private Boolean released;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("overdue")
    @Expose
    private Boolean overdue;
    @SerializedName("userStartDate")
    @Expose
    private String userStartDate;
    @SerializedName("userReleaseDate")
    @Expose
    private String userReleaseDate;
    @SerializedName("projectId")
    @Expose
    private Integer projectId;

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The archived
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * 
     * @param archived
     *     The archived
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * 
     * @return
     *     The released
     */
    public Boolean getReleased() {
        return released;
    }

    /**
     * 
     * @param released
     *     The released
     */
    public void setReleased(Boolean released) {
        this.released = released;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 
     * @return
     *     The overdue
     */
    public Boolean getOverdue() {
        return overdue;
    }

    /**
     * 
     * @param overdue
     *     The overdue
     */
    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    /**
     * 
     * @return
     *     The userStartDate
     */
    public String getUserStartDate() {
        return userStartDate;
    }

    /**
     * 
     * @param userStartDate
     *     The userStartDate
     */
    public void setUserStartDate(String userStartDate) {
        this.userStartDate = userStartDate;
    }

    /**
     * 
     * @return
     *     The userReleaseDate
     */
    public String getUserReleaseDate() {
        return userReleaseDate;
    }

    /**
     * 
     * @param userReleaseDate
     *     The userReleaseDate
     */
    public void setUserReleaseDate(String userReleaseDate) {
        this.userReleaseDate = userReleaseDate;
    }

    /**
     * 
     * @return
     *     The projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId
     *     The projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

}
