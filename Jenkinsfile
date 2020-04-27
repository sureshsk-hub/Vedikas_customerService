node{
    stage('scm checkout'){
        git 'https://github.com/sureshsk-hub/Vedikas_customerService.git/'
         }
          
    stage('maven package'){
        def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
        }
        
    stage('Build Docker image'){
        sh 'docker build -t motasuresh/vedic-service-app:1.0.0 .'
        }
    stage('Docker login and pushImage'){
      withCredentials([string(credentialsId: 'dockpswd', variable: 'dockpswd')]) {  
          sh "docker login -u motasuresh -p ${dockpswd}"
       }
       sh 'docker push motasuresh/vedic-service-app:1.0.0 . '
   }
    
}    
