package tests;

import com.github.javafaker.Faker;

public class TestData {
    public static Faker faker = new Faker();
    public static final String RANDOM_FIRST_NAME = faker.name().firstName();
    public static final String RANDOM_COMPANY_NAME = faker.company().name();
    public static final String RANDOM_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_DESCRIPTION = faker.shakespeare().hamletQuote();
}
