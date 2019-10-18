package com.example.gebeya_mood;

import android.widget.ImageView;

public class MoodReportItemModel {

    String staffGroupName, moodType, reportDate;
    String inMood, totalMembers;
    int emoji;


    public MoodReportItemModel(String stuffGroupName, String moodType, String inMood, String totalMembers, String reportDate, int emoji) {
        this.staffGroupName = stuffGroupName;
        this.moodType = moodType;
        this.inMood = inMood;
        this.totalMembers = totalMembers;
        this.reportDate = reportDate;
        this.emoji = emoji;

    }

    //Getters

    public String getStaffGroupName() {
        return staffGroupName;
    }

    public String getMoodType() {
        return moodType;
    }

    public int getEmoji() {
        return emoji;
    }

    public String getInMood() {
        return inMood;
    }

    public String getTotalMembers() {
        return totalMembers;
    }

    public void setMoodType(String moodType) {
        this.moodType = moodType;
    }

    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    // Setters
    public String getReportDate() {
        return reportDate;
    }

    public void setStuffGroupName(String stuffGroupName) {
        this.staffGroupName = stuffGroupName;
    }

    public void setInMood(String inMood) {
        this.inMood = inMood;
    }

    public void setTotalMembers(String totalMembers) {
        this.totalMembers = totalMembers;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }
}
