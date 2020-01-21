#!/usr/bin/env groovy
pipeline {

    stages {
        stage ('Checkout') {
            steps {
                checkout scm

                sh "git rev-parse HEAD > .git/commit-id"

                script {
                    commit_id = readFile('.git/commit-id').trim()
                    pom = readMavenPom file: 'pom.xml'
                    currentBuild.displayName = commit_id.take(7) + "-" + pom.version
                }
            }
        }

        stage ('Build') {
            steps {
                sh "mvn clean install"
            }
        }


    }

    post {
        always {
            deleteDir()
        }

        success {
            emailext (
                    to: 'vitthalsaruk123@gmail.com',
                    subject: "SUCCESSFUL: Jenkins Job",
                    body: """<p>SUCCESSFUL: Job :</p>
                <p>Check console output at &QUOT;<a href='test'>testJob [123]</a>&QUOT;</p>""",
                    recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']]
            )
        }

        failure {
            emailext (
                    to: 'vitthalsaruk123@gmail.com',
                    subject: "FAILED: Jenkins Job ",
                    body: """<p>FAILED: Job ':</p>
                <p>Check console output at &QUOT;<a href='test'>testJob [123]</a>&QUOT;</p>""",
                    recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']]
            )
        }
    }
}
