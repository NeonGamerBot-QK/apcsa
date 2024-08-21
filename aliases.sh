function startjava() {
    /usr/bin/env  /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin/java-XX:+ShowCodeDetailsInExceptionMessages -cp $PWD/$1 $2
}
export stJava=startjava