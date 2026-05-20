#!/bin/sh

if [ -z "$JAVA_HOME" ] && [ -x /usr/libexec/java_home ]; then
  JAVA_HOME=$(/usr/libexec/java_home -v 17)
  export JAVA_HOME
fi

exec mvn "$@"
