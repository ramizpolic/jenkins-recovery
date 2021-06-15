  
def jobTargets = '''
folders.groovy
**/job.groovy
'''

pipeline {
  agent any
  options {
    disableConcurrentBuilds()
    ansiColor('xterm')
  }
  
  stages {
    stage('Define jobs') {
      steps {
        jobDsl(targets: jobTargets, lookupStrategy: 'SEED_JOB')
      }
    }
  }
}