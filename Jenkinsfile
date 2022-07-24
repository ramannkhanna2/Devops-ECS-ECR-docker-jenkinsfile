pipeline {

    environment {
        docker_repo_uri = "public.ecr.aws/p9h7s8r8/ramanrepo"
        task_def_arn = "arn:aws:ecs:us-east-2:677729060277:task/raman-ecs/1383df779e2541638b68b6e5dd910f99"
        cluster = "raman-ecs"
        exec_role_arn = "arn:aws:iam::677729060277:role/ecsTaskExecutionRole"
    }

}

stage('Build') {
    steps {
        // Get SHA1 of current commit
        script {
            commit_id = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
        }
        // Build the Docker image
        sh "docker build -t ${docker_repo_uri}:${commit_id} ."
        // Get Docker login credentials for ECR
        sh "aws ecr get-login --no-include-email --region ${region} | sh"
        // Push Docker image
        sh "docker push ${docker_repo_uri}:${commit_id}"
        // Clean up
        sh "docker rmi -f ${docker_repo_uri}:${commit_id}"
    }
}
