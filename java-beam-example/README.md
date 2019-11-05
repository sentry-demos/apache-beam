# java-beam-example

This demo covers using Apache Beam with the Java SDK with a sample wordcount application.

## First Time Setup

The Beam SDK requires Java 8 and Apache Maven.

It is recommended that you use [jenv](https://www.jenv.be/) to manage your java versions.

Apache Maven can be installed through their [project instructions](http://maven.apache.org/install.html) or through homebrew.

```bash
brew install maven
```

## Run

Run the following command to run the WordCount application

```bash
mvn compile exec:java -Dexec.mainClass=org.apache.beam.examples.WordCount \
     -Dexec.args="--inputFile=pom.xml --output=counts" -Pdirect-runner
```

## Troubleshooting

Compilation issues? Make sure you are on Java 8.

Check your Java version with:

```bash
java -version
```

In addition, make sure your $JAVA_HOME is set to track Java 8
