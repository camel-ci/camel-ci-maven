# Camel CI Maven Test Project

## Usage

### Prerequisites

You must have Maven installed on your machine to use this project.

You can check if you already have it installed with the command: `mvn -v`.

Otherwise, you can get it with those steps:

- Download a Maven 3.6.1 binary [here](https://maven.apache.org/download.cgi)
- Extract it and add maven/bin to your path

### Building/Rebuilding the project

```bash
mvn clean install -DskipTests
```

### Running Tests

```bash
mvn surefire:test
```

### Running the application

```bash
mvn exec:java
```
