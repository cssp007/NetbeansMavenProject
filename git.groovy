def getCodeFromGithub() {
    def github_URL = "https://github.com/cssp007/NetbeansMavenProject"
        if ('${github_URL}' == 'https://github.com/cssp007/NetbeansMavenProject') {
                 git '${github_URL}'
        }
        else {
                 echo "github URL is NOT match"
        }
    }
return this
