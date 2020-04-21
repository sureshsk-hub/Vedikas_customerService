node{
   
   environment{
       PATH ='/home/ubuntu/apache-maven-3.6.3/bin:$PATH'
   }
   
   triggers{
     pollscm 'H/1 * * * *'
   }
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
   
   
   stage('compile-package'){
     sh 'mvn clean package'
   }
   
   stage(test){
   echo 'This is testing stage'  
   }
   stage('deploy'){
   echo 'This is deploying project stage'
   }
   
}


