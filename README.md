module name: KaicaDungeon

# Assignment III - KaicaDungeon
This is a dungeon adventure game for the java VM. It uses Java Persistance API via Hibernate. Current build engine is Gradle and with mavenCentral repositories for dependency sourcing.

The [directory structure](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) for the program follows that default structure recommended by Maven and Gradle.




#### Dependencies
* Hibernate
* Log4j



### Gradle
Build and run the project with gradle using the gradle wrapper `./gradlew build` and then `./gradlew run` to run the application.



### UML diagram
This is the logical model for the database and object persistance. It is subject to change.

![ . . . ](KaicaDungeon.png)


### Joblist & Questions

* Make sure that we are happy with module and its name.

* Should perhaps there be a kaica_dun.main for the main App file, and then import the classes import `main.java.kaica_dun.Entities.Item;`. Main class can be defined in Gradle build file.

* For development we should have an automated method for downloading the dependencies using gradle to ensure all developers are using the same libraries. Currently info to do this at:
    - `https://discuss.gradle.org/t/how-can-i-gather-all-my-projects-dependencies-into-a-folder/7146/2`
    - `https://discuss.gradle.org/t/download-some-dependencies-and-copy-them-to-a-local-folder/6246`
    - `https://stackoverflow.com/questions/31427067/how-to-make-gradle-download-dependency-libraries-to-project-directory`


### Style guide
This project adheres to the following [style guide](https://github.com/weleoka/myJavaStyleGuide).




