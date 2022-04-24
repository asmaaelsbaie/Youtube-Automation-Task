package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.Buffer;
import java.util.List;

public class HomePage {
    private final WebDriver driver;

    private final By SearchInputBar = By.cssSelector("input[id=\"search\"]");
    private final By FilterSearchButton = By.cssSelector("Button[id=\"search-icon-legacy\"]");
    private final By VideoLinks = By.xpath(/*"/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer"*/
            "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer//h3/a");
    private final By thirdVideo = By.xpath(/*"/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[3]"*/
            "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[3]/div[1]/div/div[1]/div/h3/a/yt-formatted-string");

    private List<WebElement> videoList;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void Send_Search_Data(String KeyWord) {

        driver.findElement(SearchInputBar).sendKeys(KeyWord);
    }

    public void Click_Filter_Button() {

        driver.findElement(FilterSearchButton).click();
    }

    public void list_of_video() {
        videoList = driver.findElements(VideoLinks);
        int size =videoList.size();
        System.out.println(size);

    }

    public void play_video(int index) {
        list_of_video();
        videoList.get(index).click();

    }

    public String Get_video_Title(int index) {
        list_of_video();
        return videoList.get(index).getText();
    }

    public String Get_Third_video_title() {
        return driver.findElement(thirdVideo).getAttribute("aria-label");
    }
}
