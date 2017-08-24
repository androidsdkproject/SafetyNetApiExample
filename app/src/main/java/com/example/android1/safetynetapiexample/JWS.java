package com.example.android1.safetynetapiexample;

/**
 * Created by Kamal Verma on 24-August-2017
 * Kamalverma1207@gmail.com
 * Precise Automation and Robotics
 **/

import java.util.List;

public class JWS {

    private String nonce;
    private long timestampMs;
    private String apkPackageName;
    private String apkDigestSha256;
    private boolean ctsProfileMatch;
    private String extension;
    private List<String> apkCertificateDigestSha256;
    private boolean basicIntegrity;

    public String getNonce() {
        return nonce;
    }

    public long getTimestampMs() {
        return timestampMs;
    }

    public String getApkPackageName() {
        return apkPackageName;
    }

    public String getApkDigestSha256() {
        return apkDigestSha256;
    }

    public boolean isCtsProfileMatch() {
        return ctsProfileMatch;
    }

    public String getExtension() {
        return extension;
    }

    public List<String> getApkCertificateDigestSha256() {
        return apkCertificateDigestSha256;
    }

    public boolean isBasicIntegrity() {
        return basicIntegrity;
    }
}