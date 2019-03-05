# Vaadin 7 Instrumentation

Custom Instrumentation for Vaadin version 7.x. 

## Build

```bash
	./gradlew clean build
```
The jar file is built in 'build/libs' folder

## (Optional) Import project into eclipse  

```bash
	./gradlew eclipse
```

Then choose "File > Import > General > Existing Projects into workspace"
and enter the location of this folder to complete the import.

## Installation / Usage

1. Get the build/libs/vaadin-7-1.0.jar and drop it in the newrelic agent's "extensions" folder.(This step can be automated by running ./gradlew clean install instead)
2. Java extensions are typically picked up on-the-fly. If wishing to use that ('hot deploy'), wait a minute or so and then check the logs to see that the extension loaded.
3. If you prefer a cold deploy or it doesn't work right with a hot deploy, restart your JVM after adding the JAR and configurations.
3. Check your results!


## Results


## Troubleshooting

- Set log level to "FINER" in newrelic.yml to capture more detailed info about the extension's attempts. This can be done on-the-fly, and changed back to "INFO" once you have the log entries you need.



