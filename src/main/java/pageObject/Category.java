package pageObject;

public enum Category {

    PEOPLE("https://people.onliner.by/"),
    CAR_NEWS("https://auto.onliner.by/"),
    TECHNOLOGY("https://tech.onliner.by/"),
    REALTY("https://realt.onliner.by/"),
    CAR_MARKET("https://ab.onliner.by/"),
    BIKE_MARKET("https://mb.onliner.by/"),
    HOUSE_SALES("https://r.onliner.by/pk/"),
    HOUSE_RENT("https://r.onliner.by/ak/");

    private String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
