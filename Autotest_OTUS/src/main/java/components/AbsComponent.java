package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.AbsPageObject;
import pages.AbsBasePage;

public abstract class AbsComponent<T> extends AbsPageObject<T> {

    /*
    Это ранний валидатор в нестатическом компоненте. Вызов проверки видимисти в нестатическом блоке инициализации.
    сдесь будет добавлен валидатор; насколько я понимаю, тут проверяется видимость компонента на странице.
     */
    /*
    {
        waiters.waitForElementVisible();
    }
    */

    public AbsComponent(WebDriver driver){
        super(driver);
    }

    // protected - потому что этот метод будте использоваться только в наследника. Метод getComponentEntity() должен возвращать именно web-элемент блока.
    protected WebElement getComponentEntity(){
        return null;
    }

}
