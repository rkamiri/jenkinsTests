pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/redark6/TpRestApi.git'

                // Run Maven on a Unix agent.
                sh "mvn test"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    discordSend description: 'the buils is a success', footer: '', image: '', link: '', result: 'SUCCESS', thumbnail: '', title: 'greatsucces', webhookURL: 'https://discord.com/api/webhooks/902206789863481364/Dl2MOUXLe7f_-bFM0BuoQYPFCJRkaAIRZ-KWakuK0-ALLdqrKyvhm619W4cH4qyC_X3U'
                }

                failure{
                    discordSend description: 'the buils is a failure', footer: '', image: '', link: '', result: 'FAILURE', thumbnail: '', title: 'greatfail', webhookURL: 'https://discord.com/api/webhooks/902206789863481364/Dl2MOUXLe7f_-bFM0BuoQYPFCJRkaAIRZ-KWakuK0-ALLdqrKyvhm619W4cH4qyC_X3U'
                }
            }
        }
    }
}
