package org.base;

import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

		public class LibGlobal { 
						
				public static WebDriver driver;
				public Actions a;
				public Select s; 
				public JavascriptExecutor jk; 
				public Robot r;
				public Alert t;
						

						public WebDriver getDriver() {
							if(driver==null) {
							System.setProperty("webdriver.chrome.driver",
									"D:\\Eclipse-Oxy\\eclipse\\workspace\\DataCucumber\\Drive2\\chromedriver.exe");
							
					        driver = new ChromeDriver();
					        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
							}
						    return driver;
						    
						} 
						
						public Workbook newFileWithIoExlsheet(String path) throws IOException {
							File exLoc = new File(path);
							FileInputStream stream = new FileInputStream(exLoc);
							Workbook w = new XSSFWorkbook(stream);
							return w; 
						}
						
							public FileOutputStream fileOutPutStream(String excelLoc) throws FileNotFoundException {
								FileOutputStream o = new FileOutputStream(excelLoc);
								return o;
							}
							
						
						public void writeExcel(String name, int rowNo, int cellNo ,String value ) throws IOException {
							File exLoc = new File("C:\\Users\\PRIYADHARSHINI-PC\\workspace\\DataDriverFrameWork\\ExcelSheet\\AdactinDetails.xlsx");
							FileInputStream stream = new FileInputStream(exLoc);
							Workbook w = new XSSFWorkbook(stream);
							Sheet s = w.getSheet("name"); 
							Row r = s.getRow(rowNo);
							Cell c = r.createCell(cellNo);
							c.setCellValue(value);
							FileOutputStream o = new FileOutputStream(exLoc);
							w.write(o);
							
						}
						
						public String getData(int row, int cell) throws IOException {
							String name = null;
							File exLoc = new File("C:\\Users\\PRIYADHARSHINI-PC\\workspace\\DataDriverFrameWork\\ExcelSheet\\AdactinDetails.xlsx");
							FileInputStream stream = new FileInputStream(exLoc);
							Workbook w = new XSSFWorkbook(stream);
							Sheet s = w.getSheet("Sheet1"); 
							Row r = s.getRow(row);
							Cell c = r.getCell(cell);
							int types = c.getCellType();
							if (types == 1) { 
								name = c.getStringCellValue();
							} else if (types == 0) { 
								if (DateUtil.isCellDateFormatted(c)) {
								Date dateCellValue = c.getDateCellValue();
								SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
								name = format.format(dateCellValue);
								
							} else {
								double numericCellValue = c.getNumericCellValue();
								long l = (long) numericCellValue;
								name = String.valueOf(l);
							}
						}
							return name;
					}
						 
						
						
						public void Title() {
							driver.getTitle();
						}
						
						public void loadUrl(String url) {
							driver.get(url);
							
						} 
						
						public void type(WebElement element, String data) {
							element.sendKeys(data);
						}
						
						public void btnLogin(WebElement element) {
							element.click();
						}
						
					    public void getText(WebElement txt,String text) {
					    	txt.getText();
					    }
					    
					    public String getAttribute(WebElement element,String value) { 
					    	String print = element.getAttribute(value);
					    	return print;
					    }
					    
					    public String tagName(WebElement element) {
					    	String tagName = element.getTagName();
					    	return tagName;
					    
					    }
					    
					    public Dimension getSize(WebElement element) {
					    	Dimension size = element.getSize();
					    	return size;
					    }
					    
					    public Point location(WebElement element) {
					    	Point location = element.getLocation();
					    	return location;
					    	
					    } 
					    public boolean displayed(WebElement element) {
					    	boolean displayed = element.isDisplayed();
					    	return displayed;
					    }
					    
					    public boolean enabled(WebElement element) {
					    	boolean enabled = element.isEnabled();
					    	return enabled;
					    }
					    
					    public boolean selected(WebElement element) {
					    	boolean selected = element.isSelected();
					    	return selected;
					    }
					    
					    public WebElement xPath(String xpath) {
					    	WebElement path = driver.findElement(By.xpath(xpath));
					    	return path;
					    	
					    }
					    
					    public WebElement name(String name) {
					    	WebElement eleName = driver.findElement(By.name(name));
					    	return eleName;
					    	
					    }
					    
					    public WebElement className(String classname) {
					    	WebElement clsname = driver.findElement(By.className(classname));
					    	return clsname;
					    	
					    }
					    
					    
					    public void move(WebElement action) {
					    	a.moveToElement(action).perform();
					    } 
					    
					    public void drag(WebElement src, WebElement dest) {
					    	a.dragAndDrop(src, dest); 
					    }
					    
					    public void rightcli(WebElement right) {
					    	a.contextClick(right).perform();
					    }
					    
					    public void clicking(WebElement target) {
					    	a.doubleClick(target); 
					    	
					  
					    }
					    	
					    public void gmail() throws AWTException	{
					    	Robot r = new Robot();
					    	r.keyPress(KeyEvent.VK_DOWN);
					        r.keyRelease(KeyEvent.VK_DOWN);
					       
					        r.keyPress(KeyEvent.VK_ENTER);
					        r.keyRelease(KeyEvent.VK_ENTER);
					    	
					        
					    }
					    public void simple(WebElement accept) {
					    	t.accept();
					    } 
					    public void confirm(WebElement cancel) {
					    	t.dismiss();
					    }
					    public void screenShot(String name) throws IOException {
					    	TakesScreenshot tk = (TakesScreenshot)driver;
					    	File src = tk.getScreenshotAs(OutputType.FILE); 
					    	File dest = new File("C:\\Users\\Selenium\\Facebook.png"); 
					    	FileUtils.copyFile(src, dest);
					    }
					    public void selindex(WebElement element, int x) {
					    	Select s = new Select(element);
					    	s.selectByIndex(x); 
					    	
					    }
					    
					   public void selval(WebElement element , String value) {
						   Select s = new Select(element);
						    s.selectByValue(value);
					   }
					   
					   public void seltxt(WebElement element, String txt) {
						   Select s = new Select(element);
						   s.selectByVisibleText(txt); 
						   
					   }
					   
					   public String selectop() {
						   List<WebElement> selectop = s.getAllSelectedOptions();
						   for (WebElement element : selectop) {
							   String txt = element.getText();
							   return txt;
							
						} 
						   return null;
					   }
					   
					   public void Multi() {
						   boolean b = s.isMultiple();
						   System.out.println(b);
						   
					   }
					   
					   public void deselInt(int x) {
						   s.deselectByIndex(x);
						   
					   }
					   
					   public void deselVal(String value) {
						   s.deselectByValue(value); 
						   
					   }
					   
					   public void deselTxt(String txt) {
						   s.deselectByVisibleText(txt); 
						   
					   }
					   
					   public void deselAll() {
						   s.deselectAll();
						   
					   }
					   
					   public void frameIdx(int indx) {
						   driver.switchTo().frame(indx);
						   
					   }
					   
					   public void framename(String name) {
						   driver.switchTo().frame(name);
						   
					   }
					   
					   public void frameelement(WebElement element) {
						   driver.switchTo().frame(element);
						   
					   }
					   
					   public void framId(String id) {
						   driver.switchTo().frame(id);
						   
					   }
					   
					   public void parentfrm() {
						   driver.switchTo().parentFrame();
						   
					   }
					   
					   public void contentfrm() {
						   driver.switchTo().defaultContent();
						   
					   }
					   
					   public void scrolldown(WebElement down) {
						   jk.executeScript("arguments[0].scrollIntoView(true)", down);
						   
					   }
					   
					   public void scrollup(WebElement up) {
						   jk.executeScript("arguments[0].scrollIntoView(false)", up);
					   
					   }
					   
					   public void setAttribute(String name , WebElement element) { 
						   jk.executeScript("arguments[0].setAttribute('value','"+ name +"')", element);
						   
					   }
					   
					   public void click(WebElement element) {
						   jk.executeScript("arguments[0].click()", element) ;
						   
					   } 
					   
					   public void sleep(long eleSleep) throws InterruptedException {
						   Thread.sleep(eleSleep);
						   
					   }
					   
					   public void windowById(String value) {
						   driver.switchTo().window(value);
						   
					   }
					    
					   public void windowByTitle(String value) {
						   driver.switchTo().window(value);
						   
					   }
					  
					   public void windowByUrl(String value) {
						   driver.switchTo().window(value);
					   }
					    	
					    public void particularwindows(String window) {
					    	
					    	Set<String> all = driver.getWindowHandles();
					    	List<String> li = new ArrayList<String>();
					    	li.addAll(all);
					    }
						  
					    public String title() {
					    	String txt = driver.getTitle();
					    	return txt;
					    	
					    }
					    
					    public void clear(WebElement element) {
					    	element.clear();
					    	
					   }
					    public void getcurrenturl() {
					    	driver.getCurrentUrl();
					    }
					    
					    public void close() {
					    	driver.close(); 
					    	
					    }
					    
					    public void quit() {
					    	driver.quit();
					    }
					   }










