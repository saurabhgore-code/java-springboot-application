pipeline {
	agent any
    environment {
		DOCKERHUB_CREDENTIALS=credentials('deploy')
	}
    stages
	{	
	/* stage('clone the repo')
		{
			steps{	
	 sh 'git clone https://github.com/saurabhgore-code/java-springboot-application.git'
			}
		}
        stage('build  springboot image')
        {
        steps{ 
            sh 'docker build -t springboot-app .'
        }
        }
        stage('run springboot image')
        {
        steps{
            sh 'docker run -dt -p 8081:8080 springboot-app'
        }
        }
       
	 stage('login dockerhub'){
    steps{ 
      sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
         }
  }
       stage('Deploy Image') {
          steps{
              sh 'docker tag springboot-app saurabhgore70/springboot-app:v2'
              sh 'docker push saurabhgore70/springboot-app:v2'
       }
           }
       
  
   stage("deploy using kubernetes"){
            steps{
                sh "kubectl create -f springboot-deployment.yml"
    }
}
*/
      stage("create a nodeport service"){
      steps{
                sh "kubectl create -f springboot-service.yml"
    }
    }
}
}
