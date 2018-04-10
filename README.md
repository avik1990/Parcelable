# Parcelable
Pass data using Parcelable in android.
Parcelable is the ANdroid implementation of the java Serizable.

Parcelable implementation :-

Step 1:- let the bean class implement Parcelable interface rather than serizable interface.

Step 2:- Define overloaded constructor for bean which has parcel as argument.

Step 3:- Implement the method for:-

  3.1 override describeCOntents()
  3.2 Override writetoParcel
  3.3 create a non-null static field called CREATOR of a type implements the Parcelable.Creator interface

