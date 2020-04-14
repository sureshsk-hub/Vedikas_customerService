node{
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
 
   stage('Maven compile'){
     tool name: 'maven-3', type: 'maven'
        sh 'mvn clean compile'
   }
   
}
