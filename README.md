# Poet Pipeline

![pipeline logo](https://github.com/tmobile/POET-pipeline-library/wiki/images/POET_logo_final-480.png)

The Poet Pipeline brings modern, container based CI/CD to Jenkins.

- Entirely **container based**
    - Common step functionality can be packaged and shared by developers
- [Templates](https://github.com/tmobile/POET-pipeline-library/wiki/Pipeline-Templates) allow sharing and standardization of complex or replicated configurations across different projects and teams
- [Conditions](https://github.com/tmobile/POET-pipeline-library/wiki/Steps#Conditions) allow optional behavior and workflows based on branch, job status, or environment variables
- Low reliance on plugins simplifies operations and maintenance


## Installation and Getting Started

The POET pipeline is packaged as a [Jenkins Shared Library](https://jenkins.io/doc/book/pipeline/shared-libraries/).  See [Installation](https://github.com/tmobile/POET-pipeline-library/wiki/Installation) in our [wiki](https://github.com/tmobile/POET-pipeline-library/wiki).

Once the pipeline is installed, see [Getting Started](https://github.com/tmobile/POET-pipeline-library/wiki/Getting-Started) in the [wiki](https://github.com/tmobile/POET-pipeline-library/wiki) to configure a project to use the pipeline.

## Example Pipeline Configuration

```
# pipeline.yml
pipeline:
  appOwner: POET
  appName: poet-pipeline

  appVersion:
    master: 1.0.0

  steps:
    - name: test-pipeline
      image: gradle:5.3-jre8-alpine
      commands:
        - gradle clean test jacocoTestReport
```

## License

The POET Pipeline is released under the [Apache 2.0 License](https://github.com/tmobile/POET-pipeline-library/blob/master/LICENSE)
