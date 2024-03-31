package org.main;

public class Constants {
    public final static String BASE_URL = "https://www.glassdoor.ca/Job/index.htm";
    public final static String WHAT_INPUT = "//input[@id='searchBar-jobTitle']";
    public final static String WHERE_INPUT = "//input[@id='searchBar-location']";
    public final static String CLEAR_LOCATION = "//input[@aria-label='Search location']/following-sibling::button[@aria-label='Clear input']";
    public final static String BUTTON_SHOW_MORE_JOBS = "//button[@data-test='load-more']";
    public final static String BUTTON_SHOW_MORE = "//span[contains(text(), 'Show more')]/..";
    public final static String LIST_JOB_LINK = "//ul[@aria-label='Jobs List']/li[@data-test='jobListing']//a[@tabindex='-1']";
    public final static String LIST_JOB_LINK_LAST_CHILD = "//ul[@aria-label='Jobs List']/li[@data-test='jobListing'][last()]//a[@tabindex='-1']";
    public final static String JOB_TITLE_ELEMENT = "//h1";
    public final static String JOB_COMPANY_ELEMENT = "//h4";
    public final static String JOB_LOCATION_ELEMENT = "//div[@data-test='location']";
    public final static String JOB_TEXT_ELEMENT = "//div[contains(@class, 'JobDetails_jobDescription') and contains(@data-brandviews,'PAGE')]";
    public final static String SELECT_POSTED_ELEMENT = "//button[contains(text(), 'Date posted')]";
    public final static String MODAL_CLOSE_BUTTON = "//button[@class='CloseButton']";
    public final static Job FIRST_LINE = new Job("JOB_NAME", "JOB_COMPANY_NAME", "JOB_POSITION", "JOB_LOCATION", "JOB_TEXT", "JOB_URL");

}
