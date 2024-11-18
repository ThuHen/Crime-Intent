package com.thuhen.crimeintent;



import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private boolean msolve;
    private Date mDate;
    public Crime(){
        mId=UUID.randomUUID();
        mDate= new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public boolean isMsolve() {
        return msolve;
    }

    public void setMsolve(boolean msolve) {
        this.msolve = msolve;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
