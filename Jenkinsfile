node{
   
   environment{
       PATH ='/home/ubuntu/apache-maven-3.6.3/bin:$PATH'
   }
   
   stage('SCM Checkout'){
     git 'https://github.com/sureshsk-hub/Vedikas_customerService.git'
   }
   
   stage('compile-package'){
     sh 'mvn clean package'
   }
   
   stage('run application'){
     export JENKINS_HOME="./my_jenkins_home"
      java -jar jenkins.war
   
   }
   
   
}


