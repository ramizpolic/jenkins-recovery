pipelineJob('ci/backup') {
  displayName('backup')
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
      scriptPath('ci/backup/Jenkinsfile')
    }
  }
}