package com.shrikanthravi.collapsiblecalendarview.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shrikanthravi on 06/03/18.
 */

public class Day implements Parcelable{

    private int mYear;
    private int mMonth;
    private int mDay;
    private boolean mIsDisabled;

    public Day(int year, int month, int day){
        this.mYear = year;
        this.mMonth = month;
        this.mDay = day;
        mIsDisabled = false;
    }

    public int getMonth(){
        return mMonth;
    }

    public int getYear(){
        return mYear;
    }

    public int getDay(){
        return mDay;
    }

    public boolean isDisabled() {
        return mIsDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        mIsDisabled = isDisabled;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Day) {
            return ((Day) obj).mDay == mDay && ((Day) obj).mMonth == mMonth
                    && ((Day) obj).mYear == mYear;
        }
        return false;
    }

    public Day(Parcel in){
        int[] data = new int[3];
        in.readIntArray(data);
        this.mYear = data[0];
        this.mMonth = data[1];
        this.mYear = data[2];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(new int[] {this.mYear,
                this.mMonth,
                this.mDay});
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Day createFromParcel(Parcel in) {
            return new Day(in);
        }

        public Day[] newArray(int size) {
            return new Day[size];
        }
    };


}
