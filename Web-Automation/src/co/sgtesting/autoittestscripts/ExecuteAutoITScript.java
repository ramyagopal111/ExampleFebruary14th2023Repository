package co.sgtesting.autoittestscripts;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeScript();

	}
	
	private static void executeScript()
	{
		try
		{
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("D:\\ExampleAutomation\\AutoIT\\FirstTestScript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
