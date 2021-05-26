pipeline {

    agent any

    steges {

                stage('Init') {

                    steps {

                        echo 'Hii inital state start'
                    }
                }
                
                stage('build') {

                    steps {

                        echo 'build stage start'
                    }
                }

                stage('deploy') {

                    steps {
                        echo 'deployment stared '
                    }
                }
                    stage('prod') {

                    steps {
                        echo 'deployment stared '
                    }
                }
    }
}