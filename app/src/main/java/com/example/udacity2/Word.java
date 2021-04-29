package com.example.udacity2;

public class Word {
    private String mDefaulttranslation;
    private  String mMiwokTranslation;

    private int mImageSourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
private int mAudioResourceId;

    public Word(String defaulttranslation,String miwokTranslation,int audioResourceId){
        mDefaulttranslation=defaulttranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaulttranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mDefaulttranslation=defaulttranslation;
        mMiwokTranslation=miwokTranslation;
        mImageSourceId=imageResourceId;
       mAudioResourceId=audioResourceId;
    }
    public String getDefaulttranslation(){
       return mDefaulttranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageSourceId(){
        return mImageSourceId;
    }
    public boolean hasImage(){
return mImageSourceId!=NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}

