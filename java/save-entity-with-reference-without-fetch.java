// lets say we have Basket with primary key of type Long
class Basket {
    private Long id;

    private String otherField;
    // ...
}

// and BasketItem with reference (ManyToOne) to Basket entity
class BasketItem {

    private Long id;
    private Basket basket;

    // ...
}

// Then when saving new BasketItem we can just

basketItemToSave.setBasket(new Basket().id(basketId));

// We do not have to fetch whole basket and set it as reference. Just set the key field.