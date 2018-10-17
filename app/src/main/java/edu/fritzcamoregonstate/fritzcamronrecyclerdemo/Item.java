package edu.fritzcamoregonstate.fritzcamronrecyclerdemo;

public class Item {
    private String mTextHeading;
    private String mTextDescription;

    public Item(String heading, String description) {

        mTextHeading = heading;
        mTextDescription = description;

    }

    public String getTextHeading() {
        return mTextHeading;
    }

    public void setTextHeading(String textHeading) {
        mTextHeading = textHeading;
    }

    public String getTextDescription() {
        return mTextDescription;
    }

    public void setTextDescription(String textDescription) {
        mTextDescription = textDescription;
    }
}
