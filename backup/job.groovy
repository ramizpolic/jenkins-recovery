pipelineJob('backup') {
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
          branch('*/master')
          remote {
            url('https://github.com/fhivemind/jenkins-dr.git')
            credentials('github-fhivemind')
          }
        }
      }
      scriptPath('backup/Jenkinsfile')
    }
  }
}