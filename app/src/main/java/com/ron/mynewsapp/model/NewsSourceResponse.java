
package com.ron.mynewsapp.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsSourceResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("sources")
    @Expose
    private List<Source> sources = new ArrayList<Source>();

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The sources
     */
    public List<Source> getSources() {
        return sources;
    }

    /**
     * 
     * @param sources
     *     The sources
     */
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

}
