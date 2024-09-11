package ExtentReports.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ForExtentReports {
    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Developers Name","Prasad");
        extent.setSystemInfo("Testers Name","Sakshi");
        extent.setSystemInfo("Project Deadline","10-10-2024");
        extent.setSystemInfo("Sprint Name","Pre-Prod");
        extent.setSystemInfo("Client Name","HDFC");

        return extent;
    }
}
