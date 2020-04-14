node{
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
   stage('Maven-compile'){
      withMaven(maven : 'maven-3'){
      sh 'mvn clean compile'
      }
   
   }
   
   
   stage('Test') {
      echo "this is testing"
   }
   
}
