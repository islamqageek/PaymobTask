package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

public class CreateAccountTCs extends  TestBase{

@Test
    public void createAccountSuccessfully(){
    Faker faker = new Faker();
    String fName = faker.name().firstName();
    String lName = faker.name().lastName();

    String email = fName+"@gmail.com";
    CreateAccountPage fAccount = new CreateAccountPage(driver);
fAccount.createAccount(fName , lName, email, "pass@123" , "pass@123" );
}
}
