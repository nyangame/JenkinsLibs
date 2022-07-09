def get_project_uri(uri) { 
    def projectUri = uri.replaceFirst(/https\:\/\//,"")
    projectUri = projectUri.replaceFirst(/http\:\/\//,"")
    projectUri = projectUri.replaceFirst(/git\@\/\//,"")
    projectUri = projectUri.replaceFirst(/www\./,"")
    projectUri = projectUri.replaceFirst(/github\.com\//,"")
    projectUri = projectUri.replaceFirst(/github\.com\:/,"")
    projectUri = projectUri.replaceFirst(/MELPOT\//,"")
    return projectUri;
}

def get_project_path(projectUri) {
    return env.WORKSPACE + ".\\..\\" + projectUri;
}

def vtn_unity_path(version, isLinux = false) {
    if(isLinux)
    {
        return "C:\\Program Files\\Unity\\Hub\\Editor\\" + version + "\\Editor\\Unity";   
    }else{
        return "C:\\Program Files\\Unity\\Hub\\Editor\\" + version + "\\Editor\\Unity.exe";   
    }
}

def vtn_workspace_path(prjName) {
    return "C:\\Jenkins\\workspace\\" + prjName
}
