node{
   
   environment{
       PATH ='/home/ubuntu/apache-maven-3.6.3/bin:$PATH'
   }
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
   
   
   stage('compile-package'){
      tools{
      tool name: 'maven-3.6.3', type: 'maven'
      } 
     sh 'mvn clean package'
   }
   stage('testing'){
   echo 'This is testing stage'
   }
   
}
          



