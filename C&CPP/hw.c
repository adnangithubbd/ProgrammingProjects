#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>
#include <errno.h>

int main() {
    pid_t pid;
    
    // fork returns 0 in the child process and the child's PID in the parent process
    pid = fork();
    
    if (pid < 0) {
        perror("fork");
        exit(EXIT_FAILURE);
    } else if (pid == 0) {
        // Child process
        printf("Child process: jooiii\n");
        exit(EXIT_SUCCESS);
    } else {
        // Parent process
        printf("Parent process: jooiii\n");
        // Wait for the child process to finish
        waitpid(pid, NULL, 0);
    }

    return 0;
}
