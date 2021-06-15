pipelineJob('jenkins-secrets/restore') {
  displayName('restore')
  logRotator {
    numToKeep(15)
    artifactNumToKeep(15)
  }
  properties {
    disableConcurrentBuilds()
  }
  definition {
    cpsScm {
      scm {
        git {
          branch('*/main')
          remote {
            url('https://github.com/fhivemind/jenkins-dr.git')
            credentials('github-fhivemind')
          }
        }
      }
      scriptPath('jenkins-secrets/restore/Jenkinsfile')
    }
  }
}