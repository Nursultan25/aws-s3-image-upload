package com.example.awsimageupload.buckets;

public enum BucketName {
    PROFILE_IMAGE("nursultan-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
