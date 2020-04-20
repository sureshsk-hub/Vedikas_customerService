node{
      def mvnHome = tool name: 'maven-3.6.3', type: 'maven' 
      stage('Checkout'){
         git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'       
      }  
      stage('Build'){
        sh 'mvn clean package'
      }
   stage('Deploy'){
   echo 'This is deploying stage'
   }
   
}
          



