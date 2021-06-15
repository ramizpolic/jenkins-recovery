pipelineJob('jenkins-secrets/restore') {
  displayName('restore')
  logRotator {
    numToKeep(15)
    artifactNumToKeep(15)
  }
  properties {
    disableConcurrentBuilds()
  }
  parameters {
    stringParam('REQUESTED_VERSION', '', 'Version of Jenkins secrets to backup. Please check Google Cloud Storage to find available versions.')
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