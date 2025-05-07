pipeline {
	agent any
    stages {
		stage('Build') {
			steps {
				sh 'mvn clean install'
            }
        }
        stage('Test') {
			steps {
				sh 'mvn test'
            }
        }
        stage('Allure Report') {
			steps {
				allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }
}