def call(string branchName, string repoUrl) {
    git branch: "${branchName}", url: "${repoUrl}"
}