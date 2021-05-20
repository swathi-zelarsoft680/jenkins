def nexus(){
 command =  "curl -f -v -u admin:momdad007 --upload-file todo.zip http://172.31.9.76:8081/repository/todo/todo.zip"
 def execute_state=sh(returnStdout: true, script: command)
}