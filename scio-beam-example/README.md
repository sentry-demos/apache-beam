# scio-beam-example

This demo covers using [Apache Beam](https://beam.apache.org/) with [Scio](https://spotify.github.io/scio/), the Scala API for Beam.

It uses `sentry-logback` 1.7.27, Scio 0.7.4 and Apache Beam 2.11.0 

## First Time Setup

Scio requires Java 8. It is recommended that you use [jenv](https://www.jenv.be/) to manage your Java versions.

Check your Java version with:

```bash
java -version
```

You should get something like this:

> openjdk version "1.8.0_222"

Install [sbt](https://www.scala-sbt.org/index.html) with homebrew

```bash
brew install sbt
```

## Run

Package your application

```bash
sbt package
```

Run your application with Beam's direct runner.

```bash
sbt "runMain example.WordCount"
```