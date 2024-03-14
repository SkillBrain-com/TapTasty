package utils;

import com.github.javafaker.Faker;

public class DataGeneration {
    Faker faker = new Faker();
    public String fName;
    public String lName;

    public String email;
    public String message;
    public String contactName;
    public String contactEmail;
    public String contactMessage;

    public String loginUserName;
    public String passwordLogin;
    public String address;
    public String nrAddress;
    public String city;
    public String county;




    private static DataGeneration instance;

    private DataGeneration() {

        fName = faker.name().firstName();
        lName = faker.name().lastName();
        email = fName + lName + "@mailinator.com";
        message = faker.lorem().characters(55);
        contactName = faker.name().fullName();
        contactEmail = faker.name().firstName() + "@mailinator.com";
        contactMessage = faker.lorem().sentence(15);
        loginUserName = faker.name().firstName();
        passwordLogin = faker.internet().password(6,10);
        address = faker.address().fullAddress();
        nrAddress = faker.address().buildingNumber();
        city = faker.address().city();
        county = faker.address().state();



    }

    public static DataGeneration getInstance(){

        if(instance == null){
            instance = new DataGeneration();
        }

        return instance;
    }
}
