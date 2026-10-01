pipeline {

    agent any
    environment{
        NOMBRE_CONTENEDOR="Prueba"
    }
    stages {

        stage('Pruebas unitarias') {
            steps {
                dir('prueba_jenkins') {
                    bat 'mvn test'
                }
            }
        }

        stage('Compilar WAR') {
            steps {
                dir('prueba_jenkins') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }
        stage('Verificar WAR') {
            steps {
                dir('prueba_jenkins') {
                    bat 'dir target'
                }
            }
        }
    }
}