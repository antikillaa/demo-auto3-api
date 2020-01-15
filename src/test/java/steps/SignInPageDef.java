package steps;

import config.UserConfig;
import impl.AuthServiceImpl;
import io.cucumber.java.en.Then;
import models.api.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pages.SignInPage;
import services.AuthService;

import static app_context.RunContext.get;
import static app_context.RunContext.put;


public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    AuthService authService = new AuthServiceImpl();


    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Create user by API")
    public void createUserByAPI() {
        User newUser = User.builder()
                .email("auto_" + RandomStringUtils.randomAlphabetic(5) + "@.mail.com")
                .firstName("TestFirstName")
                .lastName("TestLastName")
                .password(UserConfig.USER_PASSWORD)
                .rememberMe(true)
                .build();
        put("user", newUser);

        User createdUser = authService.createUser(newUser);
        Assert.assertNotNull(createdUser);
        Assert.assertEquals(newUser.getEmail().toLowerCase(), createdUser.getEmail().toLowerCase());
        Assert.assertNotNull(createdUser.getId());
    }

    @Then("Login user by API")
    public void loginUserByAPI() {
        User user = get("user", User.class);
        User userLogged = authService.login(user);
        Assert.assertNotNull(userLogged);
    }
}
