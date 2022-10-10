package com.talentlms.UI.dataProvider;

import com.github.javafaker.Faker;

public class MockDataGeneration {

    Faker faker = new Faker();

    public String generateMockFirstName(){
        return faker.name().firstName();
    }

    public String generateMockLastName(){
        return faker.name().firstName();
    }

    public String generateMockEmail(){
        return faker.internet().emailAddress();
    }

    public String generateMockUsername(){
        return faker.name().username();
    }


}
