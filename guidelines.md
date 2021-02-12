# Guidelines

##  Tests

### Asserting whole structures in tests

It's always best to Assert whole structures.

```java
assertThat(someList).containsExactly(
    new ListItem().id(id1).value(someVal1),
    new ListItem().id(id2).value(someVal2)
);
```

Note: In above we would have to make sure that ListItem's equals operator is checking field by field, not only id.
