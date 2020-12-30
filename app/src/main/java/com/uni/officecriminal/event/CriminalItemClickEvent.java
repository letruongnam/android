package com.uni.officecriminal.event;

import com.uni.officecriminal.model.Criminal;

public class CriminalItemClickEvent {
    private  Criminal criminal;
    public CriminalItemClickEvent(Criminal criminal) {
        this.criminal = criminal;
    }

    public Criminal getCriminal() {
        return criminal;
    }
}
