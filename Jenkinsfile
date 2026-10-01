pipeline {

    agent any
    environment{
        NOMBRE_CONTENEDOR="Prueba"
    }
    stages {

        stage('Pruebas unitarias') {
            steps {
                dir('prueba_jenkins') {
                    sh 'mvn test'
                }
            }
        }

        stage('Compilar WAR') {
            steps {
                dir('prueba_jenkins') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
        stage('Verificar WAR') {
            steps {
                dir('prueba_jenkins') {
                    sh 'dir target'
                }
            }
        }
    }
}