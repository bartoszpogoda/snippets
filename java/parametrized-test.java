
// In order to use JUnit 5 parameterized tests, we need to import the junit-jupiter-params artifact from JUnit Platform. That means when using Maven, we'll add the following to our pom.xml:

// <dependency>
//     <groupId>org.junit.jupiter</groupId>
//     <artifactId>junit-jupiter-params</artifactId>
//     <version>5.7.0</version>
//     <scope>test</scope>
// </dependency>

@ParametrizedTest(name = "should do something with {0}")
@MethodSource("provideArgumentsForThisTest")
void doSomething_ShouldDoSomethingWhenSomething(String name, String arg, Set<Integer> someMoreArgs) {
    // do something

    assertThat(something).containsExactlyInAnyOrderElementsOf(someMoreArgs);
}

static Stream<Arguments> provideArgumentsForThisTest() {
    return Stream.of(
        Arguments.of("name1", "arg1", newHashSet(1, 2, 3)),
        Arguments.of("name2", "arg1", newHashSet(1, 2, 3))
        // etc..
    );
}


// You can also provide other sources like @ValueSource(strings = {"a","b"}) etc.
// see : https://www.baeldung.com/parameterized-tests-junit-5

