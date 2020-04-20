node{
       
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
          



