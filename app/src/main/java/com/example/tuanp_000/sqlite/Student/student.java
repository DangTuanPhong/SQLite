package com.example.tuanp_000.sqlite.Student;

public class student {
    private int mID;
    private String mName;
    private String mPhoneNumber;
    private String mAddress;
    private String mEmail;

    public student(String mName, String mPhoneNumber, String mAddress, String mEmail) {
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mAddress = mAddress;
        this.mEmail = mEmail;
    }

    public student(int mID, String mName, String mPhoneNumber, String mAddress, String mEmail) {
        this.mID = mID;
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mAddress = mAddress;
        this.mEmail = mEmail;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
