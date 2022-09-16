package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class ReadExcelTest {

	@Test(dataProvider = "ReadTestData")
	public void TestExcelRead(Double userId, String userName, String password, String date) {
		System.out.println("User Id -> " + userId);
		System.out.println("User Name -> " + userName);
		System.out.println("Password -> " + password);
		System.out.println("Date -> " + date);
		System.out.println("-------------------------------------------------------");
	}

	//@Test(dataProvider = "ReadTestData")
	public void TestExcelRead_Iterator(Double userId, String userName, String password, String date) {
		System.out.println("User Id -> " + userId);
		System.out.println("User Name -> " + userName);
		System.out.println("Password -> " + password);
		System.out.println("Date -> " + date);
		System.out.println("-------------------------------------------------------");
	}

	@DataProvider
	public Object[][] ReadTestData() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";
		String sheetName = "SampleData";

		return ExcelUtility.ReadDataFromExcel(filePath, sheetName);

	}
}
