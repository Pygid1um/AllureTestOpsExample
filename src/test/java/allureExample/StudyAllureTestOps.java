package allureExample;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class StudyAllureTestOps {

    @Test
    @AllureId("10847")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testGoogleAuth() {
        step("Открываем главную страницу");
        //здесь должен быть Селенид код
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин LOGIN");
            step("Ввести пароль PASSWORD");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Логин LOGIN");
            step("Пароль PASSWORD");
    });
        step("Нажать кнопку Выйти");
    }

    @Test
    @AllureId("10848")
    @DisplayName("Авторизация через FaceBook")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testFaceBookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через FaceBook");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин LOGIN");
            step("Ввести пароль PASSWORD");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из FaceBook", () -> {
            step("Логин LOGIN");
            step("Пароль PASSWORD");
        });
        step("Нажать кнопку Выйти");
    }

    @Test
    @AllureId("10849")
    @DisplayName("Авторизация через GitHub")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testGitHubAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через GitHub");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин LOGIN");
            step("Ввести пароль PASSWORD");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Логин LOGIN");
            step("Пароль PASSWORD");
        });
        step("Нажать кнопку Выйти");
    }

    @Test
    @AllureId("10850")
    @DisplayName("Авторизация через GitHub(Негативный)")
    @Tags({@Tag("WEB"), @Tag("BLOCKER"), @Tag("AUTOMATED")})
    void testGitHubAuthNegative() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через GitHub");
        step("Авторизуемся как пользователь", () -> {
            step("Ввести логин LOGIN12");
            step("Ввести пароль PASSWORD123");
        });
        step("Нажать кнопку Войти");
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Логин LOGIN");
            step("Пароль PASSWORD");
        });
        step("Нажать кнопку Выйти");
    }
}
