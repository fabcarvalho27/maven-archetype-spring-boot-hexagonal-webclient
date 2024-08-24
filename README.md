# Hexagonal Architecture With Webclient Project | Maven Archetype Project

## Overview
This project is a Maven archetype that generates a multi-module Maven project following a Hexagonal Architecture pattern. The generated project includes several sub-modules such as `configuration`, `application`, `domain`, and `infrastructure`.

## Prerequisites
- Java 21
- Maven 3.6.3 or higher
- Git

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/project-name.git
    cd project-name
    ```

2. Install the archetype into your local Maven repository:
    ```sh
    mvn clean install
    ```

## Usage
To generate a new project from the archetype, use the following command:
```sh
mvn archetype:generate \
    -DarchetypeGroupId=com.fabcarvalho27 \
    -DarchetypeArtifactId=maven-archetype-spring-boot-webclient \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=com.example \
    -DartifactId=my-new-project \
    -Dversion=1.0.0-SNAPSHOT \
    -Dmodule=my-module \
    -Dentity=MyEntity
```
**Note**: Replace `com.example`, `my-new-project`, `1.0.0-SNAPSHOT`, `my-module`, and `MyEntity` with your actual values.

## Project Structure
- `configuration`: Contains configuration files and classes.
- `application`: Contains the application layer, including controllers and APIs.
- `domain`: Contains the domain layer, including models and ports.
- `infrastructure`: Contains the infrastructure layer, including adapters and repositories.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes. 
4. Commit your changes (`git commit -m 'Add some feature'`). 
5. Push to the branch (`git push origin feature-branch`). 
6. Open a pull request.

## License
This project is licensed under the [MIT License](LICENSE.md) - see the LICENSE.md file for details.