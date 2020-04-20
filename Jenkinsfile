node{
      def mvnHome = tool name: 'maven-3.6.3', type: 'maven' 
      stage('Checkout'){
         git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
       
      }  
      stage('Build'){
         //// Get maven home path and build
        sh "${mvnHome}/bin/mvn clean package 
      }
   }
   stage('Deploy'){
   echo 'This is deploying stage'
   }
   
}
          



