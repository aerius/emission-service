# JOOQ

We're using JOOQ to query the database.

For more information about JOOQ, see https://www.jooq.org/

## Generating JOOQ classes

JOOQ supports generating classes based on a database.
While this can be done through maven, we don't want to depend on a database during build time.
Hence the generated classes are added to version control.

The JOOQ classes can be generated in the following way.
Create a local folder containing the required jars (versions can be newer):

```
jooq-3.13.2.jar
jooq-meta-3.13.2.jar
jooq-codegen-3.13.2.jar
reactive-streams-1.0.3.jar
postgresql-42.2.14.jar
jaxb-api-2.3.1.jar (when running on java 11+)
```

Copy the file `aerius-jooq-generate.xml` to this location. Be sure to update the location of your local git repository (`git_location`).

Now you can run the generation tool in the following manner:

```
java -classpath jooq-3.13.2.jar;jooq-meta-3.13.2.jar;jooq-codegen-3.13.2.jar;reactive-streams-1.0.3.jar;jaxb-api-2.3.1.jar;postgresql-42.2.14.jar;. org.jooq.codegen.GenerationTool aerius-jooq-generate.xml
```
