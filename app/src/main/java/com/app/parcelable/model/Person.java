package com.app.parcelable.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Avik on 10-04-2018.
 */

public class Person implements Parcelable {

    public String firstName;
    public String lastName;
    public String qualification;


    protected Person(Parcel in) {
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.qualification = in.readString();
    }

    public Person() {
    }

    ///for initializing values
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.qualification);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
