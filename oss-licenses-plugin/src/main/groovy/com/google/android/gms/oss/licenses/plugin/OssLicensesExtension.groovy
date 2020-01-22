package com.google.android.gms.oss.licenses.plugin

class OssLicensesExtension {
    List<ArtifactInfo> customArtifacts = []

    def licenseFile(String name, File file) {
        customArtifacts.add(new ArtifactInfo("", name, file.path, ""))
    }

    def licenseFile(String group, String name, File file) {
        customArtifacts.add(new ArtifactInfo(group, name, file.path, ""))
    }
}