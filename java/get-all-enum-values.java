
// Start this way
EnumSet.allOf(MyEnum.class);

// then possibly, or whatever is needed
EnumSet.allOf(MyEnum.class).stream().map(MyEnum::getName).collect(Collectors.toList());