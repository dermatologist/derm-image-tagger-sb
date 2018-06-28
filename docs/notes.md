# Notes

## fx:id

```
@FXML
    private Label lblFolder;

```
The fx:id is in the Code tab

## Enable git commit id

```xml
<plugin>

    <groupId>pl.project13.maven</groupId>

    <artifactId>git-commit-id-plugin</artifactId>

    <version>2.2.4</version>

    <executions>

        <execution>

            <id>get-the-git-infos</id>

            <goals>

                <goal>revision</goal>

            </goals>

        </execution>

    </executions>

    <configuration>
        
        <failOnNoGitDirectory>false</failOnNoGitDirectory>

        <dotGitDirectory>${project.basedir}/.git</dotGitDirectory>

        <prefix>git</prefix>

        <verbose>false</verbose>

        <generateGitPropertiesFile>true</generateGitPropertiesFile>

        <generateGitPropertiesFilename>${project.build.outputDirectory}/git.properties</generateGitPropertiesFilename>

        <format>json</format>

        <gitDescribe>

            <skip>false</skip>

            <always>false</always>

            <dirty>-dirty</dirty>

        </gitDescribe>
        <excludeProperties>
                    <excludeProperty>git.user.*</excludeProperty>
        </excludeProperties>
                

    </configuration>

</plugin>

```
[Main Reference](http://www.baeldung.com/spring-git-information)

[See this page also](https://dzone.com/articles/maven-git-commit-id-plugin)

