node{
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
   stage('compile-package'){
      // Get maven home
      def mvnHome = tool name: 'maven-3', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
   
}
