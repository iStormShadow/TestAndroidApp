
package com.ron.mynewsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Roles {

    @SerializedName("ETSOSD.Fasttrack-Approval")
    @Expose
    private String eTSOSDFasttrackApproval;
    @SerializedName("Users")
    @Expose
    private String users;
    @SerializedName("Owner")
    @Expose
    private String owner;
    @SerializedName("SOS- Env. Mgmt")
    @Expose
    private String sOSEnvMgmt;
    @SerializedName("Member")
    @Expose
    private String member;
    @SerializedName("Administrators")
    @Expose
    private String administrators;
    @SerializedName("Testers")
    @Expose
    private String testers;
    @SerializedName("Troubleshooters")
    @Expose
    private String troubleshooters;
    @SerializedName("Developers")
    @Expose
    private String developers;
    @SerializedName("Commentators")
    @Expose
    private String commentators;
    @SerializedName("Notified")
    @Expose
    private String notified;
    @SerializedName("ETSOSD.Coordination")
    @Expose
    private String eTSOSDCoordination;
    @SerializedName("Viewers")
    @Expose
    private String viewers;
    @SerializedName("Delivery Managers")
    @Expose
    private String deliveryManagers;
    @SerializedName("Demand Managers")
    @Expose
    private String demandManagers;

    /**
     * 
     * @return
     *     The eTSOSDFasttrackApproval
     */
    public String getETSOSDFasttrackApproval() {
        return eTSOSDFasttrackApproval;
    }

    /**
     * 
     * @param eTSOSDFasttrackApproval
     *     The ETSOSD.Fasttrack-Approval
     */
    public void setETSOSDFasttrackApproval(String eTSOSDFasttrackApproval) {
        this.eTSOSDFasttrackApproval = eTSOSDFasttrackApproval;
    }

    /**
     * 
     * @return
     *     The users
     */
    public String getUsers() {
        return users;
    }

    /**
     * 
     * @param users
     *     The Users
     */
    public void setUsers(String users) {
        this.users = users;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The Owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The sOSEnvMgmt
     */
    public String getSOSEnvMgmt() {
        return sOSEnvMgmt;
    }

    /**
     * 
     * @param sOSEnvMgmt
     *     The SOS- Env. Mgmt
     */
    public void setSOSEnvMgmt(String sOSEnvMgmt) {
        this.sOSEnvMgmt = sOSEnvMgmt;
    }

    /**
     * 
     * @return
     *     The member
     */
    public String getMember() {
        return member;
    }

    /**
     * 
     * @param member
     *     The Member
     */
    public void setMember(String member) {
        this.member = member;
    }

    /**
     * 
     * @return
     *     The administrators
     */
    public String getAdministrators() {
        return administrators;
    }

    /**
     * 
     * @param administrators
     *     The Administrators
     */
    public void setAdministrators(String administrators) {
        this.administrators = administrators;
    }

    /**
     * 
     * @return
     *     The testers
     */
    public String getTesters() {
        return testers;
    }

    /**
     * 
     * @param testers
     *     The Testers
     */
    public void setTesters(String testers) {
        this.testers = testers;
    }

    /**
     * 
     * @return
     *     The troubleshooters
     */
    public String getTroubleshooters() {
        return troubleshooters;
    }

    /**
     * 
     * @param troubleshooters
     *     The Troubleshooters
     */
    public void setTroubleshooters(String troubleshooters) {
        this.troubleshooters = troubleshooters;
    }

    /**
     * 
     * @return
     *     The developers
     */
    public String getDevelopers() {
        return developers;
    }

    /**
     * 
     * @param developers
     *     The Developers
     */
    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    /**
     * 
     * @return
     *     The commentators
     */
    public String getCommentators() {
        return commentators;
    }

    /**
     * 
     * @param commentators
     *     The Commentators
     */
    public void setCommentators(String commentators) {
        this.commentators = commentators;
    }

    /**
     * 
     * @return
     *     The notified
     */
    public String getNotified() {
        return notified;
    }

    /**
     * 
     * @param notified
     *     The Notified
     */
    public void setNotified(String notified) {
        this.notified = notified;
    }

    /**
     * 
     * @return
     *     The eTSOSDCoordination
     */
    public String getETSOSDCoordination() {
        return eTSOSDCoordination;
    }

    /**
     * 
     * @param eTSOSDCoordination
     *     The ETSOSD.Coordination
     */
    public void setETSOSDCoordination(String eTSOSDCoordination) {
        this.eTSOSDCoordination = eTSOSDCoordination;
    }

    /**
     * 
     * @return
     *     The viewers
     */
    public String getViewers() {
        return viewers;
    }

    /**
     * 
     * @param viewers
     *     The Viewers
     */
    public void setViewers(String viewers) {
        this.viewers = viewers;
    }

    /**
     * 
     * @return
     *     The deliveryManagers
     */
    public String getDeliveryManagers() {
        return deliveryManagers;
    }

    /**
     * 
     * @param deliveryManagers
     *     The Delivery Managers
     */
    public void setDeliveryManagers(String deliveryManagers) {
        this.deliveryManagers = deliveryManagers;
    }

    /**
     * 
     * @return
     *     The demandManagers
     */
    public String getDemandManagers() {
        return demandManagers;
    }

    /**
     * 
     * @param demandManagers
     *     The Demand Managers
     */
    public void setDemandManagers(String demandManagers) {
        this.demandManagers = demandManagers;
    }

}
