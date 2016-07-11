# thumbernator

A Spring Cloud Stream processor application that gives the thumbs up.

```
░░░░░░░░░░░░▄▄░░░░░░░░░ 
░░░░░░░░░░░█░░█░░░░░░░░ 
░░░░░░░░░░░█░░█░░░░░░░░ 
░░░░░░░░░░█░░░█░░░░░░░░ 
░░░░░░░░░█░░░░█░░░░░░░░ 
███████▄▄█░░░░░██████▄░░ 
▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ 
▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ 
▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ 
▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ 
▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ 
▓▓▓▓▓▓█████░░░░░░░░░█░░ 
██████▀░░░░▀▀██████▀░░░░

 -> OpenShift liked this!
```

## Usage

**This project is used in the following post on Spring Cloud Data Flow Server OpenShift:**

http://blog.switchbit.io/scdf-openshift-deploying-maven-artifacts-with-custom-dockerfile

## Building and deploying

This application comes with a pre-configured `.settings.xml` that is setup to deploy this artifact
to a local Nexus repository (running in the Fabric8 Vagrant box). To build and deploy this app:

```
$ ./mvnw -s .settings.xml deploy
```

Please read the [post](http://blog.switchbit.io/scdf-openshift-deploying-maven-artifacts-with-custom-dockerfile) for more context.
