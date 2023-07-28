package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {
    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




































































































































































































































































































































































































































































































































































































































































































































    //Oguzhan Aydin
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement profileButton;
    @FindBy(xpath = "//*[*='Store Manager']")
    public WebElement storeManager;
    @FindBy(xpath = "(//*[contains(text(), 'Products')])[1]")
    public WebElement products;
    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNewProduct;
    @FindBy(xpath = "//*[text()='Inventory']")
    public WebElement idventory;
    @FindBy(xpath = "//*[text()='Shipping']")
    public WebElement shipping;
    @FindBy(xpath = "(//*[text()='Attributes'])[1]")
    public WebElement attributes;
    @FindBy(xpath = "//*[text()='Linked']")
    public WebElement linked;
    @FindBy(xpath = "//*[contains(text(), 'SEO')]")
    public WebElement seo;
    @FindBy(xpath = "(//*[*='Advanced'])[2]")
    public WebElement advanced;
    @FindBy(xpath = "//*[@id='sku']")
    public WebElement skuInput;
    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageSkuCheckbox;
    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockQty;
    @FindBy(xpath = "//*[@id='sold_individually']")
    public WebElement soldIndividuallyCheckbox;
    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement allowBackorders;
    @FindBy(xpath = "//*[@id='weight']")
    public WebElement weight;
    @FindBy(xpath = "//*[@id='shipping_class']")
    public WebElement shippingClass;
    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;
    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement colorCheckbox;
    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement colorDropDown;
    @FindBy(xpath = "//*[@id='attributes_is_visible_1']")
    public WebElement attributesVisibleOnProductPageCheckbox;
    @FindBy(xpath = "(//*[text()='Select all'])[1]")
    public WebElement attributesSelectAllButton;
    @FindBy(xpath = "(//*[text()='Select none'])[1]")
    public WebElement attributesSelectNoneButton;
    @FindBy(xpath = "(//*[text()='Add New'])[2]")
    public WebElement attributesAddNewButton;
    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
    public WebElement sizeCheckbox;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement sizeInput;
    @FindBy(xpath = "(//*[text()='Select all'])[2]")
    public WebElement sizeSelectAllButton;
    @FindBy(xpath = "(//*[text()='Select none'])[2]")
    public WebElement sizeSelectNoneButton;
    @FindBy(xpath = "(//*[text()='Add New'])[3]")
    public WebElement sizeAddNewButton;
    @FindBy(xpath = "//*[@id='attributes_is_visible_2']")
    public WebElement sizeVisibleOnProductPageCheckbox;
    @FindBy(xpath = "//*[@class='button wcfm_add_attribute']")
    public WebElement addAttributeButton;
    @FindBy(xpath = "//*[@id='attributes_name_3']")
    public WebElement addAttributeName;
    @FindBy(xpath = "//*[@id='attributes_value_3']")
    public WebElement addAttributeValue;
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement productType;
    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualCheckbox;
    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadableCheckbox;
    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitleInput;
    @FindBy(xpath = "(//*[contains(text(), 'schedule')])[1]")
    public WebElement schedule;
    @FindBy(xpath = "//*[@id='sale_date_from']")
    public WebElement dateFrom;
    @FindBy(xpath = "//*[@id='menu-item-browse']")
    public WebElement mediaLibrary;
    @FindBy(xpath = "(//div[@class='thumbnail'])[1]")
    public WebElement firstLibraryPicture;
    @FindBy(xpath = "(//*[*='Insert into post'])[2]")
    public WebElement insertPictureIntoPostButton;
    @FindBy(xpath = "(//iframe)[1]")
    public WebElement shortDescriptonInput;
    @FindBy(xpath = "(//*[@class='button insert-media add_media'])[1]")
    public WebElement descriptionAddMedia;
    @FindBy(xpath = "(//iframe)[2]")
    public WebElement descriptionInput;
    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement addBigPicture;
    @FindBy(xpath = "(//*[*='Select'])[4]")
    public WebElement bigPictureSelectFileButton;
    @FindBy(xpath = "(//*[@data-id='22264'])[3]")
    public WebElement bigPicture;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement addSmallPicture;
    @FindBy(xpath = "(//*[text()='Add to Gallery'])[3]")
    public WebElement smallPictureAddToGalleryButton;
    @FindBy(xpath = "//*[@data-super_parent='608']")
    public WebElement vakkoCheckBox;
    @FindBy(xpath = "//*[@data-super_parent='569']")
    public WebElement lcwCheckBox;
    @FindBy(xpath = "//*[@id='product_tags']")
    public WebElement productTags;
    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement catalogVisibility;
    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submitProductButton;
    @FindBy(xpath = "//*[@class='wcicon-status-cancelled']")
    public WebElement failMessage;

    @FindBy(xpath = "//*[@class='wcfmfa fa-cloud-download-alt']")
    public WebElement downloadable;
    @FindBy(xpath = "//*[@id='downloadable_files_name_0']")
    public WebElement downloadableName;
    @FindBy(xpath = "//*[@id='downloadable_files_file_0_button']")
    public WebElement downloadableUpload;
    @FindBy(xpath = "(//*[*='Select'])[8]")
    public WebElement downloadableSelect;
    @FindBy(xpath = "//*[*='Published']")
    public WebElement publishedMessage;
    //Oguzhan Aydin bitis




}