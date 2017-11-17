package com.example.android.miwok;

/**
 * Created by vampire on 4/6/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResource;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = -1;



    public Word(String defaultTanslation, String miwokTranslation,int imageResourceId,int audioResource) {
        mDefaultTranslation = defaultTanslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResource = audioResource;
    }


    public Word(String defaultTanslation, String miwokTranslation,int audioResource) {
        mDefaultTranslation = defaultTanslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = audioResource;
    }


    public int getAudioResource()
    {
        return mAudioResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
