package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoteOption {

    @JsonProperty("caption")
    private String caption;

    @JsonProperty("presentationOrder")
    private int presentationOrder;

    public VoteOption() {
    }

    public VoteOption(String caption, int presentationOrder) {
        this.caption = caption;
        this.presentationOrder = presentationOrder;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPresentationOrder() {
        return presentationOrder;
    }

    public void setPresentationOrder(int presentationOrder) {
        this.presentationOrder = presentationOrder;
    }
}
